package pj;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes5.dex */
public abstract class d {
    public static int a(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = (iArr[0] & BodyPartID.bodyIdMax) + (iArr2[0] & BodyPartID.bodyIdMax);
        iArr3[0] = (int) j10;
        long j11 = (j10 >>> 32) + (iArr[1] & BodyPartID.bodyIdMax) + (iArr2[1] & BodyPartID.bodyIdMax);
        iArr3[1] = (int) j11;
        long j12 = (j11 >>> 32) + (iArr[2] & BodyPartID.bodyIdMax) + (iArr2[2] & BodyPartID.bodyIdMax);
        iArr3[2] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[3] & BodyPartID.bodyIdMax) + (iArr2[3] & BodyPartID.bodyIdMax);
        iArr3[3] = (int) j13;
        long j14 = (j13 >>> 32) + (iArr[4] & BodyPartID.bodyIdMax) + (iArr2[4] & BodyPartID.bodyIdMax);
        iArr3[4] = (int) j14;
        return (int) (j14 >>> 32);
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
        long j14 = (j13 >>> 32) + (iArr[4] & BodyPartID.bodyIdMax) + (iArr2[4] & BodyPartID.bodyIdMax) + (iArr3[4] & BodyPartID.bodyIdMax);
        iArr3[4] = (int) j14;
        return (int) (j14 >>> 32);
    }

    public static int[] c() {
        return new int[5];
    }

    public static int[] d() {
        return new int[10];
    }

    public static boolean e(int[] iArr, int[] iArr2) {
        for (int i10 = 4; i10 >= 0; i10--) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static int[] f(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 160) {
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

    public static int g(int[] iArr, int i10) {
        int i11;
        if (i10 == 0) {
            i11 = iArr[0];
        } else {
            int i12 = i10 >> 5;
            if (i12 < 0 || i12 >= 5) {
                return 0;
            }
            i11 = iArr[i12] >>> (i10 & 31);
        }
        return i11 & 1;
    }

    public static boolean h(int[] iArr, int[] iArr2) {
        for (int i10 = 4; i10 >= 0; i10--) {
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

    public static boolean i(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i10 = 1; i10 < 5; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean j(int[] iArr) {
        for (int i10 = 0; i10 < 5; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void k(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = iArr2[0] & BodyPartID.bodyIdMax;
        long j11 = iArr2[1] & BodyPartID.bodyIdMax;
        long j12 = iArr2[2] & BodyPartID.bodyIdMax;
        long j13 = iArr2[3] & BodyPartID.bodyIdMax;
        long j14 = iArr2[4] & BodyPartID.bodyIdMax;
        long j15 = iArr[0] & BodyPartID.bodyIdMax;
        int i10 = 1;
        long j16 = j15 * j10;
        iArr3[0] = (int) j16;
        char c10 = ' ';
        long j17 = (j16 >>> 32) + (j15 * j11);
        iArr3[1] = (int) j17;
        long j18 = (j17 >>> 32) + (j15 * j12);
        iArr3[2] = (int) j18;
        long j19 = (j18 >>> 32) + (j15 * j13);
        iArr3[3] = (int) j19;
        long j20 = (j19 >>> 32) + (j15 * j14);
        iArr3[4] = (int) j20;
        int i11 = 5;
        iArr3[5] = (int) (j20 >>> 32);
        while (true) {
            int i12 = i10;
            if (i12 >= i11) {
                return;
            }
            long j21 = iArr[i12] & BodyPartID.bodyIdMax;
            long j22 = (j21 * j10) + (iArr3[i12] & BodyPartID.bodyIdMax);
            iArr3[i12] = (int) j22;
            i10 = i12 + 1;
            char c11 = c10;
            long j23 = (j22 >>> c10) + (j21 * j11) + (iArr3[i10] & BodyPartID.bodyIdMax);
            iArr3[i10] = (int) j23;
            long j24 = j14;
            long j25 = (j23 >>> c11) + (j21 * j12) + (iArr3[r8] & BodyPartID.bodyIdMax);
            iArr3[i12 + 2] = (int) j25;
            long j26 = (j25 >>> c11) + (j21 * j13) + (iArr3[r6] & BodyPartID.bodyIdMax);
            iArr3[i12 + 3] = (int) j26;
            long j27 = (j26 >>> c11) + (j21 * j24) + (iArr3[r2] & BodyPartID.bodyIdMax);
            iArr3[i12 + 4] = (int) j27;
            iArr3[i12 + 5] = (int) (j27 >>> c11);
            c10 = c11;
            j14 = j24;
            i11 = 5;
        }
    }

    public static long l(int i10, int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        long j10 = i10 & BodyPartID.bodyIdMax;
        long j11 = iArr[i11] & BodyPartID.bodyIdMax;
        long j12 = (j10 * j11) + (iArr2[i12] & BodyPartID.bodyIdMax);
        iArr3[i13] = (int) j12;
        long j13 = iArr[i11 + 1] & BodyPartID.bodyIdMax;
        long j14 = (j12 >>> 32) + (j10 * j13) + j11 + (iArr2[i12 + 1] & BodyPartID.bodyIdMax);
        iArr3[i13 + 1] = (int) j14;
        long j15 = j14 >>> 32;
        long j16 = iArr[i11 + 2] & BodyPartID.bodyIdMax;
        long j17 = j15 + (j10 * j16) + j13 + (iArr2[i12 + 2] & BodyPartID.bodyIdMax);
        iArr3[i13 + 2] = (int) j17;
        long j18 = iArr[i11 + 3] & BodyPartID.bodyIdMax;
        long j19 = (j17 >>> 32) + (j10 * j18) + j16 + (iArr2[i12 + 3] & BodyPartID.bodyIdMax);
        iArr3[i13 + 3] = (int) j19;
        long j20 = iArr[i11 + 4] & BodyPartID.bodyIdMax;
        long j21 = (j19 >>> 32) + (j10 * j20) + j18 + (BodyPartID.bodyIdMax & iArr2[i12 + 4]);
        iArr3[i13 + 4] = (int) j21;
        return (j21 >>> 32) + j20;
    }

    public static int m(int i10, long j10, int[] iArr, int i11) {
        long j11 = i10 & BodyPartID.bodyIdMax;
        long j12 = j10 & BodyPartID.bodyIdMax;
        long j13 = (j11 * j12) + (iArr[i11] & BodyPartID.bodyIdMax);
        iArr[i11] = (int) j13;
        long j14 = j10 >>> 32;
        long j15 = (j11 * j14) + j12;
        long j16 = (j13 >>> 32) + j15 + (iArr[r4] & BodyPartID.bodyIdMax);
        iArr[i11 + 1] = (int) j16;
        long j17 = (j16 >>> 32) + j14 + (iArr[r4] & BodyPartID.bodyIdMax);
        iArr[i11 + 2] = (int) j17;
        long j18 = j17 >>> 32;
        long j19 = j18 + (iArr[r0] & BodyPartID.bodyIdMax);
        iArr[i11 + 3] = (int) j19;
        if ((j19 >>> 32) == 0) {
            return 0;
        }
        return m.t(5, iArr, i11, 4);
    }

    public static int n(int i10, int i11, int[] iArr, int i12) {
        long j10 = i10 & BodyPartID.bodyIdMax;
        long j11 = i11 & BodyPartID.bodyIdMax;
        long j12 = (j10 * j11) + (iArr[i12] & BodyPartID.bodyIdMax);
        iArr[i12] = (int) j12;
        long j13 = (j12 >>> 32) + j11 + (iArr[r5] & BodyPartID.bodyIdMax);
        iArr[i12 + 1] = (int) j13;
        long j14 = j13 >>> 32;
        long j15 = j14 + (iArr[r0] & BodyPartID.bodyIdMax);
        iArr[i12 + 2] = (int) j15;
        if ((j15 >>> 32) == 0) {
            return 0;
        }
        return m.t(5, iArr, i12, 3);
    }

    public static int o(int[] iArr, int[] iArr2, int[] iArr3) {
        int i10 = 0;
        long j10 = iArr2[0];
        long j11 = BodyPartID.bodyIdMax;
        long j12 = j10 & BodyPartID.bodyIdMax;
        long j13 = iArr2[1] & BodyPartID.bodyIdMax;
        long j14 = iArr2[2] & BodyPartID.bodyIdMax;
        long j15 = iArr2[3] & BodyPartID.bodyIdMax;
        long j16 = iArr2[4] & BodyPartID.bodyIdMax;
        long j17 = 0;
        while (i10 < 5) {
            long j18 = j11;
            long j19 = iArr[i10] & j18;
            int i11 = i10;
            long j20 = (j19 * j12) + (iArr3[i10] & j18);
            iArr3[i11] = (int) j20;
            int i12 = i11 + 1;
            long j21 = (j20 >>> 32) + (j19 * j13) + (iArr3[i12] & j18);
            iArr3[i12] = (int) j21;
            long j22 = (j21 >>> 32) + (j19 * j14) + (iArr3[r15] & j18);
            iArr3[i11 + 2] = (int) j22;
            long j23 = (j22 >>> 32) + (j19 * j15) + (iArr3[r2] & j18);
            iArr3[i11 + 3] = (int) j23;
            long j24 = (j23 >>> 32) + (j19 * j16) + (iArr3[r2] & j18);
            iArr3[i11 + 4] = (int) j24;
            long j25 = (j24 >>> 32) + j17 + (iArr3[r2] & j18);
            iArr3[i11 + 5] = (int) j25;
            j17 = j25 >>> 32;
            j11 = j18;
            j12 = j12;
            i10 = i12;
        }
        return (int) j17;
    }

    public static int p(int i10, int i11, int[] iArr, int i12) {
        long j10 = ((i11 & BodyPartID.bodyIdMax) * (i10 & BodyPartID.bodyIdMax)) + (iArr[i12] & BodyPartID.bodyIdMax);
        iArr[i12] = (int) j10;
        long j11 = (j10 >>> 32) + (BodyPartID.bodyIdMax & iArr[r1]);
        iArr[i12 + 1] = (int) j11;
        if ((j11 >>> 32) == 0) {
            return 0;
        }
        return m.t(5, iArr, i12, 2);
    }

    public static void q(int[] iArr, int[] iArr2) {
        long j10 = iArr[0] & BodyPartID.bodyIdMax;
        int i10 = 10;
        int i11 = 0;
        int i12 = 4;
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
                long j31 = j25 + (j26 * j10);
                int i16 = (int) j31;
                iArr2[3] = (i16 << 1) | (i15 >>> 31);
                int i17 = i16 >>> 31;
                long j32 = j28 + (j31 >>> 32) + (j26 * j15);
                long j33 = j30 + (j32 >>> 32) + (j26 * j19);
                long j34 = j32 & BodyPartID.bodyIdMax;
                long j35 = j29 + (j33 >>> 32);
                long j36 = j33 & BodyPartID.bodyIdMax;
                long j37 = iArr[4] & BodyPartID.bodyIdMax;
                long j38 = (iArr2[7] & BodyPartID.bodyIdMax) + (j35 >>> 32);
                long j39 = j35 & BodyPartID.bodyIdMax;
                long j40 = (iArr2[8] & BodyPartID.bodyIdMax) + (j38 >>> 32);
                long j41 = j38 & BodyPartID.bodyIdMax;
                long j42 = j34 + (j10 * j37);
                int i18 = (int) j42;
                iArr2[4] = i17 | (i18 << 1);
                int i19 = i18 >>> 31;
                long j43 = j36 + (j42 >>> 32) + (j37 * j15);
                long j44 = j39 + (j43 >>> 32) + (j37 * j19);
                long j45 = j41 + (j44 >>> 32) + (j37 * j26);
                long j46 = j40 + (j45 >>> 32);
                int i20 = (int) j43;
                iArr2[5] = i19 | (i20 << 1);
                int i21 = i20 >>> 31;
                int i22 = (int) j44;
                iArr2[6] = i21 | (i22 << 1);
                int i23 = i22 >>> 31;
                int i24 = (int) j45;
                iArr2[7] = i23 | (i24 << 1);
                int i25 = i24 >>> 31;
                int i26 = (int) j46;
                iArr2[8] = i25 | (i26 << 1);
                iArr2[9] = (i26 >>> 31) | ((iArr2[9] + ((int) (j46 >>> 32))) << 1);
                return;
            }
            i12 = i13;
        }
    }

    public static int r(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = (iArr[0] & BodyPartID.bodyIdMax) - (iArr2[0] & BodyPartID.bodyIdMax);
        iArr3[0] = (int) j10;
        long j11 = (j10 >> 32) + ((iArr[1] & BodyPartID.bodyIdMax) - (iArr2[1] & BodyPartID.bodyIdMax));
        iArr3[1] = (int) j11;
        long j12 = (j11 >> 32) + ((iArr[2] & BodyPartID.bodyIdMax) - (iArr2[2] & BodyPartID.bodyIdMax));
        iArr3[2] = (int) j12;
        long j13 = (j12 >> 32) + ((iArr[3] & BodyPartID.bodyIdMax) - (iArr2[3] & BodyPartID.bodyIdMax));
        iArr3[3] = (int) j13;
        long j14 = (j13 >> 32) + ((iArr[4] & BodyPartID.bodyIdMax) - (iArr2[4] & BodyPartID.bodyIdMax));
        iArr3[4] = (int) j14;
        return (int) (j14 >> 32);
    }

    public static int s(int[] iArr, int[] iArr2) {
        long j10 = (iArr2[0] & BodyPartID.bodyIdMax) - (iArr[0] & BodyPartID.bodyIdMax);
        iArr2[0] = (int) j10;
        long j11 = (j10 >> 32) + ((iArr2[1] & BodyPartID.bodyIdMax) - (iArr[1] & BodyPartID.bodyIdMax));
        iArr2[1] = (int) j11;
        long j12 = (j11 >> 32) + ((iArr2[2] & BodyPartID.bodyIdMax) - (iArr[2] & BodyPartID.bodyIdMax));
        iArr2[2] = (int) j12;
        long j13 = (j12 >> 32) + ((iArr2[3] & BodyPartID.bodyIdMax) - (iArr[3] & BodyPartID.bodyIdMax));
        iArr2[3] = (int) j13;
        long j14 = (j13 >> 32) + ((iArr2[4] & BodyPartID.bodyIdMax) - (BodyPartID.bodyIdMax & iArr[4]));
        iArr2[4] = (int) j14;
        return (int) (j14 >> 32);
    }

    public static BigInteger t(int[] iArr) {
        byte[] bArr = new byte[20];
        for (int i10 = 0; i10 < 5; i10++) {
            int i11 = iArr[i10];
            if (i11 != 0) {
                Aj.f.d(i11, bArr, (4 - i10) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void u(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
    }
}
