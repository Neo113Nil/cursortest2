package pj;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes5.dex */
public abstract class c {
    public static int a(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = (iArr[0] & BodyPartID.bodyIdMax) + (iArr2[0] & BodyPartID.bodyIdMax);
        iArr3[0] = (int) j10;
        long j11 = (j10 >>> 32) + (iArr[1] & BodyPartID.bodyIdMax) + (iArr2[1] & BodyPartID.bodyIdMax);
        iArr3[1] = (int) j11;
        long j12 = (j11 >>> 32) + (iArr[2] & BodyPartID.bodyIdMax) + (iArr2[2] & BodyPartID.bodyIdMax);
        iArr3[2] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[3] & BodyPartID.bodyIdMax) + (iArr2[3] & BodyPartID.bodyIdMax);
        iArr3[3] = (int) j13;
        return (int) (j13 >>> 32);
    }

    public static int b(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = (iArr[0] & BodyPartID.bodyIdMax) + (iArr2[0] & BodyPartID.bodyIdMax) + (iArr3[0] & BodyPartID.bodyIdMax);
        iArr3[0] = (int) j10;
        long j11 = (j10 >>> 32) + (iArr[1] & BodyPartID.bodyIdMax) + (iArr2[1] & BodyPartID.bodyIdMax) + (iArr3[1] & BodyPartID.bodyIdMax);
        iArr3[1] = (int) j11;
        long j12 = (j11 >>> 32) + (iArr[2] & BodyPartID.bodyIdMax) + (iArr2[2] & BodyPartID.bodyIdMax) + (iArr3[2] & BodyPartID.bodyIdMax);
        iArr3[2] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[3] & BodyPartID.bodyIdMax) + (iArr2[3] & BodyPartID.bodyIdMax) + (iArr3[3] & BodyPartID.bodyIdMax);
        iArr3[3] = (int) j13;
        return (int) (j13 >>> 32);
    }

    public static int[] c() {
        return new int[4];
    }

    public static long[] d() {
        return new long[2];
    }

    public static int[] e() {
        return new int[8];
    }

    public static long[] f() {
        return new long[4];
    }

    public static boolean g(int[] iArr, int[] iArr2) {
        for (int i10 = 3; i10 >= 0; i10--) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(long[] jArr, long[] jArr2) {
        for (int i10 = 1; i10 >= 0; i10--) {
            if (jArr[i10] != jArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static int[] i(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            throw new IllegalArgumentException();
        }
        int[] c10 = c();
        int i10 = 0;
        while (bigInteger.signum() != 0) {
            c10[i10] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i10++;
        }
        return c10;
    }

    public static long[] j(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            throw new IllegalArgumentException();
        }
        long[] d10 = d();
        int i10 = 0;
        while (bigInteger.signum() != 0) {
            d10[i10] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i10++;
        }
        return d10;
    }

    public static int k(int[] iArr, int i10) {
        int i11;
        if (i10 == 0) {
            i11 = iArr[0];
        } else {
            int i12 = i10 >> 5;
            if (i12 < 0 || i12 >= 4) {
                return 0;
            }
            i11 = iArr[i12] >>> (i10 & 31);
        }
        return i11 & 1;
    }

    public static boolean l(int[] iArr, int[] iArr2) {
        for (int i10 = 3; i10 >= 0; i10--) {
            int i11 = iArr[i10] ^ Integer.MIN_VALUE;
            int i12 = Integer.MIN_VALUE ^ iArr2[i10];
            if (i11 < i12) {
                return false;
            }
            if (i11 > i12) {
                return true;
            }
        }
        return true;
    }

    public static boolean m(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i10 = 1; i10 < 4; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean n(long[] jArr) {
        return jArr[0] == 1 && jArr[1] == 0;
    }

    public static boolean o(int[] iArr) {
        for (int i10 = 0; i10 < 4; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean p(long[] jArr) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (jArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void q(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = iArr2[0];
        long j11 = BodyPartID.bodyIdMax;
        long j12 = j10 & BodyPartID.bodyIdMax;
        int i10 = 1;
        long j13 = iArr2[1] & BodyPartID.bodyIdMax;
        long j14 = iArr2[2] & BodyPartID.bodyIdMax;
        long j15 = iArr2[3] & BodyPartID.bodyIdMax;
        long j16 = iArr[0] & BodyPartID.bodyIdMax;
        long j17 = j16 * j12;
        iArr3[0] = (int) j17;
        long j18 = (j17 >>> 32) + (j16 * j13);
        iArr3[1] = (int) j18;
        long j19 = (j18 >>> 32) + (j16 * j14);
        iArr3[2] = (int) j19;
        long j20 = (j19 >>> 32) + (j16 * j15);
        iArr3[3] = (int) j20;
        iArr3[4] = (int) (j20 >>> 32);
        for (int i11 = 4; i10 < i11; i11 = 4) {
            long j21 = iArr[i10] & j11;
            long j22 = (j21 * j12) + (iArr3[i10] & j11);
            iArr3[i10] = (int) j22;
            int i12 = i10 + 1;
            long j23 = j11;
            long j24 = (j22 >>> 32) + (j21 * j13) + (iArr3[i12] & j23);
            iArr3[i12] = (int) j24;
            long j25 = (j24 >>> 32) + (j21 * j14) + (iArr3[r11] & j23);
            iArr3[i10 + 2] = (int) j25;
            long j26 = (j25 >>> 32) + (j21 * j15) + (iArr3[r3] & j23);
            iArr3[i10 + 3] = (int) j26;
            iArr3[i10 + 4] = (int) (j26 >>> 32);
            i10 = i12;
            j11 = j23;
        }
    }

    public static int r(int[] iArr, int[] iArr2, int[] iArr3) {
        int i10 = 0;
        long j10 = iArr2[0];
        long j11 = BodyPartID.bodyIdMax;
        long j12 = j10 & BodyPartID.bodyIdMax;
        long j13 = iArr2[1] & BodyPartID.bodyIdMax;
        long j14 = iArr2[2] & BodyPartID.bodyIdMax;
        long j15 = iArr2[3] & BodyPartID.bodyIdMax;
        long j16 = 0;
        while (i10 < 4) {
            long j17 = iArr[i10] & j11;
            long j18 = j11;
            long j19 = (iArr3[i10] & j18) + (j17 * j12);
            iArr3[i10] = (int) j19;
            int i11 = i10 + 1;
            int i12 = i10;
            long j20 = (j19 >>> 32) + (j17 * j13) + (iArr3[i11] & j18);
            iArr3[i11] = (int) j20;
            long j21 = (j20 >>> 32) + (j17 * j14) + (iArr3[r15] & j18);
            iArr3[i12 + 2] = (int) j21;
            long j22 = (j21 >>> 32) + (j17 * j15) + (iArr3[r3] & j18);
            iArr3[i12 + 3] = (int) j22;
            long j23 = (j22 >>> 32) + j16 + (iArr3[r2] & j18);
            iArr3[i12 + 4] = (int) j23;
            j16 = j23 >>> 32;
            i10 = i11;
            j11 = j18;
            j12 = j12;
        }
        return (int) j16;
    }

    public static void s(int[] iArr, int[] iArr2) {
        long j10 = iArr[0] & BodyPartID.bodyIdMax;
        int i10 = 8;
        int i11 = 0;
        int i12 = 3;
        while (true) {
            int i13 = i12 - 1;
            long j11 = iArr[i12] & BodyPartID.bodyIdMax;
            long j12 = j11 * j11;
            iArr2[i10 - 1] = (i11 << 31) | ((int) (j12 >>> 33));
            i10 -= 2;
            iArr2[i10] = (int) (j12 >>> 1);
            i11 = (int) j12;
            if (i13 <= 0) {
                long j13 = j10 * j10;
                long j14 = (j13 >>> 33) | ((i11 << 31) & BodyPartID.bodyIdMax);
                iArr2[0] = (int) j13;
                long j15 = iArr[1] & BodyPartID.bodyIdMax;
                long j16 = iArr2[2] & BodyPartID.bodyIdMax;
                long j17 = j14 + (j15 * j10);
                int i14 = (int) j17;
                iArr2[1] = (i14 << 1) | (((int) (j13 >>> 32)) & 1);
                long j18 = j16 + (j17 >>> 32);
                long j19 = iArr[2] & BodyPartID.bodyIdMax;
                long j20 = iArr2[3] & BodyPartID.bodyIdMax;
                long j21 = iArr2[4] & BodyPartID.bodyIdMax;
                long j22 = j18 + (j19 * j10);
                int i15 = (int) j22;
                iArr2[2] = (i15 << 1) | (i14 >>> 31);
                long j23 = j20 + (j22 >>> 32) + (j19 * j15);
                long j24 = j21 + (j23 >>> 32);
                long j25 = j23 & BodyPartID.bodyIdMax;
                long j26 = iArr[3] & BodyPartID.bodyIdMax;
                long j27 = (iArr2[5] & BodyPartID.bodyIdMax) + (j24 >>> 32);
                long j28 = j24 & BodyPartID.bodyIdMax;
                long j29 = (iArr2[6] & BodyPartID.bodyIdMax) + (j27 >>> 32);
                long j30 = j27 & BodyPartID.bodyIdMax;
                long j31 = j25 + (j10 * j26);
                int i16 = (int) j31;
                iArr2[3] = (i16 << 1) | (i15 >>> 31);
                long j32 = j28 + (j31 >>> 32) + (j15 * j26);
                long j33 = j30 + (j32 >>> 32) + (j26 * j19);
                long j34 = j29 + (j33 >>> 32);
                long j35 = j33 & BodyPartID.bodyIdMax;
                int i17 = (int) j32;
                iArr2[4] = (i17 << 1) | (i16 >>> 31);
                int i18 = (int) j35;
                iArr2[5] = (i18 << 1) | (i17 >>> 31);
                int i19 = (int) j34;
                iArr2[6] = (i18 >>> 31) | (i19 << 1);
                iArr2[7] = (i19 >>> 31) | ((iArr2[7] + ((int) (j34 >>> 32))) << 1);
                return;
            }
            i12 = i13;
        }
    }

    public static int t(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = (iArr[0] & BodyPartID.bodyIdMax) - (iArr2[0] & BodyPartID.bodyIdMax);
        iArr3[0] = (int) j10;
        long j11 = (j10 >> 32) + ((iArr[1] & BodyPartID.bodyIdMax) - (iArr2[1] & BodyPartID.bodyIdMax));
        iArr3[1] = (int) j11;
        long j12 = (j11 >> 32) + ((iArr[2] & BodyPartID.bodyIdMax) - (iArr2[2] & BodyPartID.bodyIdMax));
        iArr3[2] = (int) j12;
        long j13 = (j12 >> 32) + ((iArr[3] & BodyPartID.bodyIdMax) - (iArr2[3] & BodyPartID.bodyIdMax));
        iArr3[3] = (int) j13;
        return (int) (j13 >> 32);
    }

    public static int u(int[] iArr, int[] iArr2) {
        long j10 = (iArr2[0] & BodyPartID.bodyIdMax) - (iArr[0] & BodyPartID.bodyIdMax);
        iArr2[0] = (int) j10;
        long j11 = (j10 >> 32) + ((iArr2[1] & BodyPartID.bodyIdMax) - (iArr[1] & BodyPartID.bodyIdMax));
        iArr2[1] = (int) j11;
        long j12 = (j11 >> 32) + ((iArr2[2] & BodyPartID.bodyIdMax) - (iArr[2] & BodyPartID.bodyIdMax));
        iArr2[2] = (int) j12;
        long j13 = (j12 >> 32) + ((iArr2[3] & BodyPartID.bodyIdMax) - (BodyPartID.bodyIdMax & iArr[3]));
        iArr2[3] = (int) j13;
        return (int) (j13 >> 32);
    }

    public static BigInteger v(int[] iArr) {
        byte[] bArr = new byte[16];
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = iArr[i10];
            if (i11 != 0) {
                Aj.f.d(i11, bArr, (3 - i10) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger w(long[] jArr) {
        byte[] bArr = new byte[16];
        for (int i10 = 0; i10 < 2; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                Aj.f.m(j10, bArr, (1 - i10) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void x(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
    }
}
