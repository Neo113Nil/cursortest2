package ph;

import java.util.Arrays;
import kotlin.UByte;

/* renamed from: ph.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6076g {
    private static final char[] ENCODING = b();
    private static final byte[] DECODING = a();
    private static final boolean[] VALID_HEX = c();

    public static byte[] a() {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i10 = 0; i10 < 16; i10++) {
            bArr["0123456789abcdef".charAt(i10)] = (byte) i10;
        }
        return bArr;
    }

    public static char[] b() {
        char[] cArr = new char[512];
        for (int i10 = 0; i10 < 256; i10++) {
            cArr[i10] = "0123456789abcdef".charAt(i10 >>> 4);
            cArr[i10 | 256] = "0123456789abcdef".charAt(i10 & 15);
        }
        return cArr;
    }

    public static boolean[] c() {
        boolean[] zArr = new boolean[65535];
        int i10 = 0;
        while (i10 < 65535) {
            zArr[i10] = (48 <= i10 && i10 <= 57) || (97 <= i10 && i10 <= 102);
            i10++;
        }
        return zArr;
    }

    public static void d(byte b10, char[] cArr, int i10) {
        int i11 = b10 & UByte.MAX_VALUE;
        char[] cArr2 = ENCODING;
        cArr[i10] = cArr2[i11];
        cArr[i10 + 1] = cArr2[i11 | 256];
    }

    public static boolean e(char c10) {
        return VALID_HEX[c10];
    }

    public static boolean f(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!e(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static void g(long j10, char[] cArr, int i10) {
        d((byte) ((j10 >> 56) & 255), cArr, i10);
        d((byte) ((j10 >> 48) & 255), cArr, i10 + 2);
        d((byte) ((j10 >> 40) & 255), cArr, i10 + 4);
        d((byte) ((j10 >> 32) & 255), cArr, i10 + 6);
        d((byte) ((j10 >> 24) & 255), cArr, i10 + 8);
        d((byte) ((j10 >> 16) & 255), cArr, i10 + 10);
        d((byte) ((j10 >> 8) & 255), cArr, i10 + 12);
        d((byte) (j10 & 255), cArr, i10 + 14);
    }
}
