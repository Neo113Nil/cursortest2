package org.bouncycastle.crypto.generators;

import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import java.util.Set;
import kotlin.UByte;
import kotlin.text.Typography;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* loaded from: classes5.dex */
public class OpenBSDBCrypt {
    private static final Set<String> allowedVersions;
    private static final String defaultVersion = "2y";
    private static final byte[] encodingTable = {46, 47, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
    private static final byte[] decodingTable = new byte[128];

    static {
        HashSet hashSet = new HashSet();
        allowedVersions = hashSet;
        hashSet.add("2");
        hashSet.add("2x");
        hashSet.add("2a");
        hashSet.add(defaultVersion);
        hashSet.add("2b");
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr = decodingTable;
            if (i11 >= bArr.length) {
                break;
            }
            bArr[i11] = -1;
            i11++;
        }
        while (true) {
            byte[] bArr2 = encodingTable;
            if (i10 >= bArr2.length) {
                return;
            }
            decodingTable[bArr2[i10]] = (byte) i10;
            i10++;
        }
    }

    private OpenBSDBCrypt() {
    }

    public static boolean checkPassword(String str, byte[] bArr) {
        if (bArr != null) {
            return doCheckPassword(str, Arrays.clone(bArr));
        }
        throw new IllegalArgumentException("Missing password.");
    }

    private static String createBcryptString(String str, byte[] bArr, byte[] bArr2, int i10) {
        String num;
        if (!allowedVersions.contains(str)) {
            throw new IllegalArgumentException("Version " + str + " is not accepted by this implementation.");
        }
        StringBuilder sb2 = new StringBuilder(60);
        sb2.append(Typography.dollar);
        sb2.append(str);
        sb2.append(Typography.dollar);
        if (i10 < 10) {
            num = "0" + i10;
        } else {
            num = Integer.toString(i10);
        }
        sb2.append(num);
        sb2.append(Typography.dollar);
        encodeData(sb2, bArr2);
        encodeData(sb2, BCrypt.generate(bArr, bArr2, i10));
        return sb2.toString();
    }

    private static byte[] decodeSaltString(String str) {
        char[] charArray = str.toCharArray();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16);
        if (charArray.length != 22) {
            throw new DataLengthException("Invalid base64 salt length: " + charArray.length + " , 22 required.");
        }
        for (char c10 : charArray) {
            if (c10 > 'z' || c10 < '.' || (c10 > '9' && c10 < 'A')) {
                throw new IllegalArgumentException("Salt string contains invalid character: " + ((int) c10));
            }
        }
        char[] cArr = new char[24];
        System.arraycopy(charArray, 0, cArr, 0, charArray.length);
        for (int i10 = 0; i10 < 24; i10 += 4) {
            byte[] bArr = decodingTable;
            byte b10 = bArr[cArr[i10]];
            byte b11 = bArr[cArr[i10 + 1]];
            byte b12 = bArr[cArr[i10 + 2]];
            byte b13 = bArr[cArr[i10 + 3]];
            byteArrayOutputStream.write((b10 << 2) | (b11 >> 4));
            byteArrayOutputStream.write((b11 << 4) | (b12 >> 2));
            byteArrayOutputStream.write(b13 | (b12 << 6));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byte[] bArr2 = new byte[16];
        System.arraycopy(byteArray, 0, bArr2, 0, 16);
        return bArr2;
    }

    private static boolean doCheckPassword(String str, byte[] bArr) {
        String substring;
        if (str == null) {
            throw new IllegalArgumentException("Missing bcryptString.");
        }
        if (str.charAt(1) != '2') {
            throw new IllegalArgumentException("not a Bcrypt string");
        }
        int length = str.length();
        if (length != 60 && (length != 59 || str.charAt(2) != '$')) {
            throw new DataLengthException("Bcrypt String length: " + length + ", 60 required.");
        }
        int i10 = 3;
        if (str.charAt(2) == '$') {
            if (str.charAt(0) != '$' || str.charAt(5) != '$') {
                throw new IllegalArgumentException("Invalid Bcrypt String format.");
            }
        } else if (str.charAt(0) != '$' || str.charAt(3) != '$' || str.charAt(6) != '$') {
            throw new IllegalArgumentException("Invalid Bcrypt String format.");
        }
        if (str.charAt(2) == '$') {
            substring = str.substring(1, 2);
        } else {
            substring = str.substring(1, 3);
            i10 = 4;
        }
        if (!allowedVersions.contains(substring)) {
            throw new IllegalArgumentException("Bcrypt version '" + substring + "' is not supported by this implementation");
        }
        String substring2 = str.substring(i10, i10 + 2);
        try {
            int parseInt = Integer.parseInt(substring2);
            if (parseInt < 4 || parseInt > 31) {
                throw new IllegalArgumentException("Invalid cost factor: " + parseInt + ", 4 < cost < 31 expected.");
            }
            String doGenerate = doGenerate(substring, bArr, decodeSaltString(str.substring(str.lastIndexOf(36) + 1, length - 31)), parseInt);
            boolean z10 = length == doGenerate.length();
            for (int i11 = 0; i11 != length; i11++) {
                z10 &= str.charAt(i11) == doGenerate.charAt(i11);
            }
            return z10;
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException("Invalid cost factor: " + substring2);
        }
    }

    private static String doGenerate(String str, byte[] bArr, byte[] bArr2, int i10) {
        if (!allowedVersions.contains(str)) {
            throw new IllegalArgumentException("Version " + str + " is not accepted by this implementation.");
        }
        if (bArr2 == null) {
            throw new IllegalArgumentException("Salt required.");
        }
        if (bArr2.length != 16) {
            throw new DataLengthException("16 byte salt required: " + bArr2.length);
        }
        if (i10 < 4 || i10 > 31) {
            throw new IllegalArgumentException("Invalid cost factor.");
        }
        int length = bArr.length < 72 ? bArr.length + 1 : 72;
        byte[] bArr3 = new byte[length];
        if (length > bArr.length) {
            length = bArr.length;
        }
        System.arraycopy(bArr, 0, bArr3, 0, length);
        Arrays.fill(bArr, (byte) 0);
        String createBcryptString = createBcryptString(str, bArr3, bArr2, i10);
        Arrays.fill(bArr3, (byte) 0);
        return createBcryptString;
    }

    private static void encodeData(StringBuilder sb2, byte[] bArr) {
        boolean z10;
        if (bArr.length != 24 && bArr.length != 16) {
            throw new DataLengthException("Invalid length: " + bArr.length + ", 24 for key or 16 for salt expected");
        }
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[18];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            bArr = bArr2;
            z10 = true;
        } else {
            bArr[bArr.length - 1] = 0;
            z10 = false;
        }
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int i11 = bArr[i10] & UByte.MAX_VALUE;
            int i12 = bArr[i10 + 1] & UByte.MAX_VALUE;
            byte b10 = bArr[i10 + 2];
            int i13 = b10 & UByte.MAX_VALUE;
            byte[] bArr3 = encodingTable;
            sb2.append((char) bArr3[(i11 >>> 2) & 63]);
            sb2.append((char) bArr3[((i11 << 4) | (i12 >>> 4)) & 63]);
            sb2.append((char) bArr3[((i12 << 2) | (i13 >>> 6)) & 63]);
            sb2.append((char) bArr3[b10 & 63]);
        }
        int length2 = sb2.length();
        sb2.setLength(z10 ? length2 - 2 : length2 - 1);
    }

    public static String generate(String str, byte[] bArr, byte[] bArr2, int i10) {
        if (bArr != null) {
            return doGenerate(str, Arrays.clone(bArr), bArr2, i10);
        }
        throw new IllegalArgumentException("Password required.");
    }

    public static boolean checkPassword(String str, char[] cArr) {
        if (cArr != null) {
            return doCheckPassword(str, Strings.toUTF8ByteArray(cArr));
        }
        throw new IllegalArgumentException("Missing password.");
    }

    public static String generate(String str, char[] cArr, byte[] bArr, int i10) {
        if (cArr != null) {
            return doGenerate(str, Strings.toUTF8ByteArray(cArr), bArr, i10);
        }
        throw new IllegalArgumentException("Password required.");
    }

    public static String generate(byte[] bArr, byte[] bArr2, int i10) {
        return generate(defaultVersion, bArr, bArr2, i10);
    }

    public static String generate(char[] cArr, byte[] bArr, int i10) {
        return generate(defaultVersion, cArr, bArr, i10);
    }
}
