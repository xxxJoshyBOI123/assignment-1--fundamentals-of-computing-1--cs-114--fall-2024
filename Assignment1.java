import java.util.Random;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        
        printInitials();

        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Please enter a number in Fahrenheit:");
        
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;

        
        System.out.println("Please enter a 5-character string:");
        
        String inputString = scanner.next();
        String newString = new StringBuilder(inputString.substring(1, 4)).reverse().toString();

        
        Random random = new Random();
       
        int randomNumber = random.nextInt(16384 - 32 + 1) + 32;

        System.out.println("Random number generating...");

        
        System.out.println("Your new string is " + celsius + newString + randomNumber);

        scanner.close();
    }

    public static void printInitials() {
        System.out.println(" JJJJJJJJJJJJJJJJJJJJJJJ    PPPPPPPPPPPPPPP");
        System.out.println("      JJJJJJJJJ             PPPPPPPPPPPPPPP");
        System.out.println("      JJJJJJJJJ             PPPPPPPPPPPPPP");
        System.out.println("      JJJJJJJJJ             PPPPPPPPPPPPP");
        System.out.println("      JJJJJJJJJ             PPPP");
        System.out.println("      JJJJJJJJ              PPPP");
        System.out.println(" JJJJJJJJJJJJ               PPPP");
        System.out.println(" JJJJJJJJJJ                 PPPP");
    }
}
