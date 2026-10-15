import java.util.Scanner;

public class Calculadora {
    public static double sumar (double a, double b) {
        return a + b;
    }
    public static double restar (double a, double b) {
        return a - b;
    }
    public static double multiplicacion (double a, double b) {
        return a * b;
    }
    public static double division (double a, double b) {
        return a / b;
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double a = entrada.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double b = entrada.nextDouble();

        System.out.println("Suma: " + sumar(a, b));
        System.out.println("Suma: " + restar(a, b));
        System.out.println("Suma: " + multiplicacion(a, b));
        System.out.println("Suma: " + division(a, b));

        entrada.close();
    }
}