package aj;

import Aj.f;

/* renamed from: aj.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2031c {
    private static final int[] LOOKUP = d();

    public static void a(int[] iArr, byte[] bArr) {
        f.e(iArr, bArr, 0);
    }

    public static void b(byte[] bArr, int[] iArr) {
        f.b(bArr, 0, iArr);
    }

    public static int[] c(byte[] bArr) {
        int[] iArr = new int[4];
        f.b(bArr, 0, iArr);
        return iArr;
    }

    public static int[] d() {
        int[] iArr = new int[256];
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = 0;
            for (int i12 = 7; i12 >= 0; i12--) {
                if (((1 << i12) & i10) != 0) {
                    i11 ^= (-520093696) >>> (7 - i12);
                }
            }
            iArr[i10] = i11;
        }
        return iArr;
    }

    public static void e(byte[] bArr, byte[] bArr2) {
        int[] c10 = c(bArr);
        f(c10, c(bArr2));
        a(c10, bArr);
    }

    public static void f(int[] iArr, int[] iArr2) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < 4; i18++) {
            int i19 = iArr2[i18];
            for (int i20 = 0; i20 < 32; i20++) {
                int i21 = i19 >> 31;
                i19 <<= 1;
                i14 ^= i10 & i21;
                i15 ^= i11 & i21;
                i16 ^= i12 & i21;
                i17 ^= i21 & i13;
                int i22 = (i13 << 31) >> 8;
                i13 = (i13 >>> 1) | (i12 << 31);
                i12 = (i12 >>> 1) | (i11 << 31);
                i11 = (i11 >>> 1) | (i10 << 31);
                i10 = (i10 >>> 1) ^ (i22 & (-520093696));
            }
        }
        iArr[0] = i14;
        iArr[1] = i15;
        iArr[2] = i16;
        iArr[3] = i17;
    }

    public static void g(int[] iArr, int[] iArr2) {
        iArr2[0] = ((j(iArr, iArr2) >> 8) & (-520093696)) ^ iArr2[0];
    }

    public static void h(int[] iArr, int[] iArr2) {
        int k10 = k(iArr, 8, iArr2);
        iArr2[0] = LOOKUP[k10 >>> 24] ^ iArr2[0];
    }

    public static int[] i() {
        int[] iArr = new int[4];
        iArr[0] = Integer.MIN_VALUE;
        return iArr;
    }

    public static int j(int[] iArr, int[] iArr2) {
        int i10 = iArr[0];
        iArr2[0] = i10 >>> 1;
        int i11 = iArr[1];
        iArr2[1] = (i10 << 31) | (i11 >>> 1);
        int i12 = i11 << 31;
        int i13 = iArr[2];
        iArr2[2] = i12 | (i13 >>> 1);
        int i14 = iArr[3];
        iArr2[3] = (i13 << 31) | (i14 >>> 1);
        return i14 << 31;
    }

    public static int k(int[] iArr, int i10, int[] iArr2) {
        int i11 = iArr[0];
        int i12 = 32 - i10;
        iArr2[0] = i11 >>> i10;
        int i13 = iArr[1];
        iArr2[1] = (i11 << i12) | (i13 >>> i10);
        int i14 = i13 << i12;
        int i15 = iArr[2];
        iArr2[2] = i14 | (i15 >>> i10);
        int i16 = iArr[3];
        iArr2[3] = (i16 >>> i10) | (i15 << i12);
        return i16 << i12;
    }

    public static void l(byte[] bArr, byte[] bArr2) {
        int i10 = 0;
        do {
            bArr[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
            int i11 = i10 + 1;
            bArr[i11] = (byte) (bArr[i11] ^ bArr2[i11]);
            int i12 = i10 + 2;
            bArr[i12] = (byte) (bArr[i12] ^ bArr2[i12]);
            int i13 = i10 + 3;
            bArr[i13] = (byte) (bArr[i13] ^ bArr2[i13]);
            i10 += 4;
        } while (i10 < 16);
    }

    public static void m(byte[] bArr, byte[] bArr2, int i10, int i11) {
        while (true) {
            i11--;
            if (i11 < 0) {
                return;
            } else {
                bArr[i11] = (byte) (bArr[i11] ^ bArr2[i10 + i11]);
            }
        }
    }

    public static void n(int[] iArr, int[] iArr2, int[] iArr3) {
        iArr3[0] = iArr[0] ^ iArr2[0];
        iArr3[1] = iArr[1] ^ iArr2[1];
        iArr3[2] = iArr[2] ^ iArr2[2];
        iArr3[3] = iArr[3] ^ iArr2[3];
    }
}
