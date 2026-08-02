package org.bouncycastle.crypto.generators;

import com.plaid.internal.EnumC3631g;
import io.agora.rtc2.video.FaceShapeAreaOptions;
import java.io.PrintStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Vector;
import okhttp3.internal.http.StatusLine;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.NaccacheSternKeyGenerationParameters;
import org.bouncycastle.crypto.params.NaccacheSternKeyParameters;
import org.bouncycastle.crypto.params.NaccacheSternPrivateKeyParameters;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes5.dex */
public class NaccacheSternKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private NaccacheSternKeyGenerationParameters param;
    private static int[] smallPrimes = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, EnumC3631g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE, 151, 157, EnumC3631g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, 167, EnumC3631g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_VERIFICATION_IN_PROGRESS_DARK_APPEARANCE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE, EnumC3631g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE, EnumC3631g.SDK_ASSET_ICON_CANCEL_VALUE, 211, EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, 251, EnumC3631g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, EnumC3631g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE, EnumC3631g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_BANK_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_CARD_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE, 307, EnumC3631g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE, EnumC3631g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, FaceShapeAreaOptions.FACE_SHAPE_AREA_MOUTHPOSITION, 409, 419, StatusLine.HTTP_MISDIRECTED_REQUEST, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557};
    private static final BigInteger ONE = BigInteger.valueOf(1);

    private static Vector findFirstPrimes(int i10) {
        Vector vector = new Vector(i10);
        for (int i11 = 0; i11 != i10; i11++) {
            vector.addElement(BigInteger.valueOf(smallPrimes[i11]));
        }
        return vector;
    }

    private static BigInteger generatePrime(int i10, int i11, SecureRandom secureRandom) {
        BigInteger createRandomPrime;
        do {
            createRandomPrime = BigIntegers.createRandomPrime(i10, i11, secureRandom);
        } while (createRandomPrime.bitLength() != i10);
        return createRandomPrime;
    }

    private static int getInt(SecureRandom secureRandom, int i10) {
        int nextInt;
        int i11;
        if (((-i10) & i10) == i10) {
            return (int) ((i10 * (secureRandom.nextInt() & Integer.MAX_VALUE)) >> 31);
        }
        do {
            nextInt = secureRandom.nextInt() & Integer.MAX_VALUE;
            i11 = nextInt % i10;
        } while ((nextInt - i11) + (i10 - 1) < 0);
        return i11;
    }

    private static Vector permuteList(Vector vector, SecureRandom secureRandom) {
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        for (int i10 = 0; i10 < vector.size(); i10++) {
            vector3.addElement(vector.elementAt(i10));
        }
        vector2.addElement(vector3.elementAt(0));
        while (true) {
            vector3.removeElementAt(0);
            if (vector3.size() == 0) {
                return vector2;
            }
            vector2.insertElementAt(vector3.elementAt(0), getInt(secureRandom, vector2.size() + 1));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0227, code lost:
    
        r2 = r24;
     */
    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AsymmetricCipherKeyPair generateKeyPair() {
        long j10;
        BigInteger generatePrime;
        BigInteger add;
        BigInteger generatePrime2;
        boolean z10;
        BigInteger bigInteger;
        BigInteger add2;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4;
        BigInteger bigInteger5;
        BigInteger bigInteger6;
        BigInteger bigInteger7;
        PrintStream printStream;
        StringBuilder sb2;
        String str;
        int i10;
        BigInteger createRandomPrime;
        int i11;
        SecureRandom secureRandom;
        int strength = this.param.getStrength();
        SecureRandom random = this.param.getRandom();
        int certainty = this.param.getCertainty();
        boolean isDebug = this.param.isDebug();
        if (isDebug) {
            System.out.println("Fetching first " + this.param.getCntSmallPrimes() + " primes.");
        }
        Vector permuteList = permuteList(findFirstPrimes(this.param.getCntSmallPrimes()), random);
        BigInteger bigInteger8 = ONE;
        BigInteger bigInteger9 = bigInteger8;
        for (int i12 = 0; i12 < permuteList.size() / 2; i12++) {
            bigInteger9 = bigInteger9.multiply((BigInteger) permuteList.elementAt(i12));
        }
        for (int size = permuteList.size() / 2; size < permuteList.size(); size++) {
            bigInteger8 = bigInteger8.multiply((BigInteger) permuteList.elementAt(size));
        }
        BigInteger multiply = bigInteger9.multiply(bigInteger8);
        int bitLength = (((strength - multiply.bitLength()) - 48) / 2) + 1;
        BigInteger generatePrime3 = generatePrime(bitLength, certainty, random);
        BigInteger generatePrime4 = generatePrime(bitLength, certainty, random);
        if (isDebug) {
            System.out.println("generating p and q");
        }
        BigInteger shiftLeft = generatePrime3.multiply(bigInteger9).shiftLeft(1);
        BigInteger shiftLeft2 = generatePrime4.multiply(bigInteger8).shiftLeft(1);
        long j11 = 0;
        while (true) {
            j10 = j11 + 1;
            generatePrime = generatePrime(24, certainty, random);
            add = generatePrime.multiply(shiftLeft).add(ONE);
            if (add.isProbablePrime(certainty)) {
                while (true) {
                    do {
                        generatePrime2 = generatePrime(24, certainty, random);
                    } while (generatePrime.equals(generatePrime2));
                    BigInteger multiply2 = generatePrime2.multiply(shiftLeft2);
                    z10 = isDebug;
                    bigInteger = ONE;
                    add2 = multiply2.add(bigInteger);
                    if (add2.isProbablePrime(certainty)) {
                        break;
                    }
                    isDebug = z10;
                }
                bigInteger2 = shiftLeft2;
                if (!multiply.gcd(generatePrime.multiply(generatePrime2)).equals(bigInteger)) {
                    continue;
                } else {
                    if (add.multiply(add2).bitLength() >= strength) {
                        break;
                    }
                    if (z10) {
                        System.out.println("key size too small. Should be " + strength + " but is actually " + add.multiply(add2).bitLength());
                    }
                }
            } else {
                z10 = isDebug;
                bigInteger2 = shiftLeft2;
            }
            j11 = j10;
            isDebug = z10;
            shiftLeft2 = bigInteger2;
        }
        if (z10) {
            bigInteger3 = generatePrime4;
            System.out.println("needed " + j10 + " tries to generate p and q.");
        } else {
            bigInteger3 = generatePrime4;
        }
        BigInteger multiply3 = add.multiply(add2);
        BigInteger multiply4 = add.subtract(bigInteger).multiply(add2.subtract(bigInteger));
        if (z10) {
            System.out.println("generating g");
        }
        long j12 = 0;
        while (true) {
            Vector vector = new Vector();
            bigInteger4 = add;
            bigInteger5 = add2;
            int i13 = 0;
            while (i13 != permuteList.size()) {
                BigInteger divide = multiply4.divide((BigInteger) permuteList.elementAt(i13));
                while (true) {
                    j12++;
                    i10 = i13;
                    createRandomPrime = BigIntegers.createRandomPrime(strength, certainty, random);
                    i11 = strength;
                    secureRandom = random;
                    if (createRandomPrime.modPow(divide, multiply3).equals(ONE)) {
                        i13 = i10;
                        strength = i11;
                        random = secureRandom;
                    }
                }
                vector.addElement(createRandomPrime);
                i13 = i10 + 1;
                strength = i11;
                random = secureRandom;
            }
            int i14 = strength;
            SecureRandom secureRandom2 = random;
            bigInteger6 = ONE;
            for (int i15 = 0; i15 < permuteList.size(); i15++) {
                bigInteger6 = bigInteger6.multiply(((BigInteger) vector.elementAt(i15)).modPow(multiply.divide((BigInteger) permuteList.elementAt(i15)), multiply3)).mod(multiply3);
            }
            int i16 = 0;
            while (true) {
                if (i16 >= permuteList.size()) {
                    BigInteger modPow = bigInteger6.modPow(multiply4.divide(BigInteger.valueOf(4L)), multiply3);
                    BigInteger bigInteger10 = ONE;
                    if (!modPow.equals(bigInteger10)) {
                        if (!bigInteger6.modPow(multiply4.divide(generatePrime), multiply3).equals(bigInteger10)) {
                            if (!bigInteger6.modPow(multiply4.divide(generatePrime2), multiply3).equals(bigInteger10)) {
                                if (!bigInteger6.modPow(multiply4.divide(generatePrime3), multiply3).equals(bigInteger10)) {
                                    bigInteger7 = bigInteger3;
                                    if (!bigInteger6.modPow(multiply4.divide(bigInteger7), multiply3).equals(bigInteger10)) {
                                        break;
                                    }
                                    if (z10) {
                                        System.out.println("g has order phi(n)/b\n g: " + bigInteger6);
                                    }
                                } else if (z10) {
                                    printStream = System.out;
                                    sb2 = new StringBuilder();
                                    str = "g has order phi(n)/a\n g: ";
                                    sb2.append(str);
                                    sb2.append(bigInteger6);
                                    printStream.println(sb2.toString());
                                }
                            } else if (z10) {
                                printStream = System.out;
                                sb2 = new StringBuilder();
                                str = "g has order phi(n)/q'\n g: ";
                                sb2.append(str);
                                sb2.append(bigInteger6);
                                printStream.println(sb2.toString());
                            }
                        } else if (z10) {
                            printStream = System.out;
                            sb2 = new StringBuilder();
                            str = "g has order phi(n)/p'\n g: ";
                            sb2.append(str);
                            sb2.append(bigInteger6);
                            printStream.println(sb2.toString());
                        }
                    } else if (z10) {
                        printStream = System.out;
                        sb2 = new StringBuilder();
                        str = "g has order phi(n)/4\n g:";
                        sb2.append(str);
                        sb2.append(bigInteger6);
                        printStream.println(sb2.toString());
                    }
                } else if (!bigInteger6.modPow(multiply4.divide((BigInteger) permuteList.elementAt(i16)), multiply3).equals(ONE)) {
                    i16++;
                } else if (z10) {
                    System.out.println("g has order phi(n)/" + permuteList.elementAt(i16) + "\n g: " + bigInteger6);
                }
            }
            bigInteger3 = bigInteger7;
            add2 = bigInteger5;
            add = bigInteger4;
            strength = i14;
            random = secureRandom2;
        }
        if (z10) {
            System.out.println("needed " + j12 + " tries to generate g");
            System.out.println();
            System.out.println("found new NaccacheStern cipher variables:");
            System.out.println("smallPrimes: " + permuteList);
            System.out.println("sigma:...... " + multiply + " (" + multiply.bitLength() + " bits)");
            PrintStream printStream2 = System.out;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("a:.......... ");
            sb3.append(generatePrime3);
            printStream2.println(sb3.toString());
            System.out.println("b:.......... " + bigInteger7);
            System.out.println("p':......... " + generatePrime);
            System.out.println("q':......... " + generatePrime2);
            System.out.println("p:.......... " + bigInteger4);
            System.out.println("q:.......... " + bigInteger5);
            System.out.println("n:.......... " + multiply3);
            System.out.println("phi(n):..... " + multiply4);
            System.out.println("g:.......... " + bigInteger6);
            System.out.println();
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new NaccacheSternKeyParameters(false, bigInteger6, multiply3, multiply.bitLength()), (AsymmetricKeyParameter) new NaccacheSternPrivateKeyParameters(bigInteger6, multiply3, multiply.bitLength(), permuteList, multiply4));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.param = (NaccacheSternKeyGenerationParameters) keyGenerationParameters;
    }
}
