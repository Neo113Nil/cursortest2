package pj;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes5.dex */
public abstract class f {
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
        long j15 = (j14 >>> 32) + (iArr[5] & BodyPartID.bodyIdMax) + (iArr2[5] & BodyPartID.bodyIdMax);
        iArr3[5] = (int) j15;
        long j16 = (j15 >>> 32) + (iArr[6] & BodyPartID.bodyIdMax) + (iArr2[6] & BodyPartID.bodyIdMax);
        iArr3[6] = (int) j16;
        return (int) (j16 >>> 32);
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
        long j15 = (j14 >>> 32) + (iArr[5] & BodyPartID.bodyIdMax) + (iArr2[5] & BodyPartID.bodyIdMax) + (iArr3[5] & BodyPartID.bodyIdMax);
        iArr3[5] = (int) j15;
        long j16 = (j15 >>> 32) + (iArr[6] & BodyPartID.bodyIdMax) + (iArr2[6] & BodyPartID.bodyIdMax) + (iArr3[6] & BodyPartID.bodyIdMax);
        iArr3[6] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static void c(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
    }

    public static int[] d() {
        return new int[7];
    }

    public static int[] e() {
        return new int[14];
    }

    public static boolean f(int[] iArr, int[] iArr2) {
        for (int i10 = 6; i10 >= 0; i10--) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static int[] g(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 224) {
            throw new IllegalArgumentException();
        }
        int[] d10 = d();
        int i10 = 0;
        while (bigInteger.signum() != 0) {
            d10[i10] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i10++;
        }
        return d10;
    }

    public static int h(int[] iArr, int i10) {
        int i11;
        if (i10 == 0) {
            i11 = iArr[0];
        } else {
            int i12 = i10 >> 5;
            if (i12 < 0 || i12 >= 7) {
                return 0;
            }
            i11 = iArr[i12] >>> (i10 & 31);
        }
        return i11 & 1;
    }

    public static boolean i(int[] iArr, int[] iArr2) {
        for (int i10 = 6; i10 >= 0; i10--) {
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

    public static boolean j(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i10 = 1; i10 < 7; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(int[] iArr) {
        for (int i10 = 0; i10 < 7; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void l(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = iArr2[0] & BodyPartID.bodyIdMax;
        long j11 = iArr2[1] & BodyPartID.bodyIdMax;
        long j12 = iArr2[2] & BodyPartID.bodyIdMax;
        long j13 = iArr2[3] & BodyPartID.bodyIdMax;
        long j14 = iArr2[4] & BodyPartID.bodyIdMax;
        long j15 = iArr2[5] & BodyPartID.bodyIdMax;
        long j16 = iArr2[6] & BodyPartID.bodyIdMax;
        long j17 = iArr[0] & BodyPartID.bodyIdMax;
        long j18 = j17 * j10;
        iArr3[0] = (int) j18;
        long j19 = (j18 >>> 32) + (j17 * j11);
        iArr3[1] = (int) j19;
        long j20 = (j19 >>> 32) + (j17 * j12);
        iArr3[2] = (int) j20;
        long j21 = (j20 >>> 32) + (j17 * j13);
        iArr3[3] = (int) j21;
        long j22 = (j21 >>> 32) + (j17 * j14);
        iArr3[4] = (int) j22;
        long j23 = (j22 >>> 32) + (j17 * j15);
        iArr3[5] = (int) j23;
        long j24 = (j23 >>> 32) + (j17 * j16);
        iArr3[6] = (int) j24;
        iArr3[7] = (int) (j24 >>> 32);
        int i10 = 1;
        for (int i11 = 7; i10 < i11; i11 = 7) {
            long j25 = iArr[i10] & BodyPartID.bodyIdMax;
            long j26 = (j25 * j10) + (iArr3[i10] & BodyPartID.bodyIdMax);
            iArr3[i10] = (int) j26;
            int i12 = i10 + 1;
            long j27 = j14;
            long j28 = (j26 >>> 32) + (j25 * j11) + (iArr3[i12] & BodyPartID.bodyIdMax);
            iArr3[i12] = (int) j28;
            long j29 = (j28 >>> 32) + (j25 * j12) + (iArr3[r7] & BodyPartID.bodyIdMax);
            iArr3[i10 + 2] = (int) j29;
            long j30 = (j29 >>> 32) + (j25 * j13) + (iArr3[r7] & BodyPartID.bodyIdMax);
            iArr3[i10 + 3] = (int) j30;
            long j31 = (j30 >>> 32) + (j25 * j27) + (iArr3[r7] & BodyPartID.bodyIdMax);
            iArr3[i10 + 4] = (int) j31;
            long j32 = (j31 >>> 32) + (j25 * j15) + (iArr3[r7] & BodyPartID.bodyIdMax);
            iArr3[i10 + 5] = (int) j32;
            long j33 = (j32 >>> 32) + (j25 * j16) + (iArr3[r7] & BodyPartID.bodyIdMax);
            iArr3[i10 + 6] = (int) j33;
            iArr3[i10 + 7] = (int) (j33 >>> 32);
            i10 = i12;
            j14 = j27;
        }
    }

    public static long m(int i10, int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
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
        long j21 = (j19 >>> 32) + (j10 * j20) + j18 + (iArr2[i12 + 4] & BodyPartID.bodyIdMax);
        iArr3[i13 + 4] = (int) j21;
        long j22 = iArr[i11 + 5] & BodyPartID.bodyIdMax;
        long j23 = (j21 >>> 32) + (j10 * j22) + j20 + (iArr2[i12 + 5] & BodyPartID.bodyIdMax);
        iArr3[i13 + 5] = (int) j23;
        long j24 = iArr[i11 + 6] & BodyPartID.bodyIdMax;
        long j25 = (j23 >>> 32) + (j10 * j24) + j22 + (BodyPartID.bodyIdMax & iArr2[i12 + 6]);
        iArr3[i13 + 6] = (int) j25;
        return (j25 >>> 32) + j24;
    }

    public static int n(int i10, long j10, int[] iArr, int i11) {
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
        return m.t(7, iArr, i11, 4);
    }

    public static int o(int i10, int i11, int[] iArr, int i12) {
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
        return m.t(7, iArr, i12, 3);
    }

    public static int p(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = iArr2[0] & BodyPartID.bodyIdMax;
        long j11 = iArr2[1] & BodyPartID.bodyIdMax;
        long j12 = iArr2[2] & BodyPartID.bodyIdMax;
        long j13 = iArr2[3] & BodyPartID.bodyIdMax;
        long j14 = iArr2[4] & BodyPartID.bodyIdMax;
        long j15 = iArr2[5] & BodyPartID.bodyIdMax;
        long j16 = iArr2[6] & BodyPartID.bodyIdMax;
        long j17 = 0;
        int i10 = 0;
        while (i10 < 7) {
            long j18 = j16;
            long j19 = iArr[i10] & BodyPartID.bodyIdMax;
            long j20 = (iArr3[i10] & BodyPartID.bodyIdMax) + (j19 * j10);
            iArr3[i10] = (int) j20;
            int i11 = i10 + 1;
            long j21 = (j20 >>> 32) + (j19 * j11) + (iArr3[i11] & BodyPartID.bodyIdMax);
            iArr3[i11] = (int) j21;
            long j22 = (j21 >>> 32) + (j19 * j12) + (iArr3[r15] & BodyPartID.bodyIdMax);
            int i12 = i10;
            iArr3[i10 + 2] = (int) j22;
            long j23 = (j22 >>> 32) + (j19 * j13) + (iArr3[r2] & BodyPartID.bodyIdMax);
            iArr3[i12 + 3] = (int) j23;
            long j24 = (j23 >>> 32) + (j19 * j14) + (iArr3[r2] & BodyPartID.bodyIdMax);
            iArr3[i12 + 4] = (int) j24;
            long j25 = (j24 >>> 32) + (j19 * j15) + (iArr3[r2] & BodyPartID.bodyIdMax);
            iArr3[i12 + 5] = (int) j25;
            long j26 = (j25 >>> 32) + (j19 * j18) + (iArr3[r2] & BodyPartID.bodyIdMax);
            iArr3[i12 + 6] = (int) j26;
            long j27 = (j26 >>> 32) + j17 + (iArr3[r2] & BodyPartID.bodyIdMax);
            iArr3[i12 + 7] = (int) j27;
            j17 = j27 >>> 32;
            i10 = i11;
            j16 = j18;
        }
        return (int) j17;
    }

    public static void q(int[] iArr, int[] iArr2) {
        long j10 = iArr[0] & BodyPartID.bodyIdMax;
        int i10 = 14;
        int i11 = 0;
        int i12 = 6;
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
                long j42 = j34 + (j37 * j10);
                int i18 = (int) j42;
                iArr2[4] = (i18 << 1) | i17;
                int i19 = i18 >>> 31;
                long j43 = j36 + (j42 >>> 32) + (j37 * j15);
                long j44 = j39 + (j43 >>> 32) + (j37 * j19);
                long j45 = j43 & BodyPartID.bodyIdMax;
                long j46 = j41 + (j44 >>> 32) + (j37 * j26);
                long j47 = j44 & BodyPartID.bodyIdMax;
                long j48 = j40 + (j46 >>> 32);
                long j49 = j46 & BodyPartID.bodyIdMax;
                long j50 = iArr[5] & BodyPartID.bodyIdMax;
                long j51 = (iArr2[9] & BodyPartID.bodyIdMax) + (j48 >>> 32);
                long j52 = j48 & BodyPartID.bodyIdMax;
                long j53 = (iArr2[10] & BodyPartID.bodyIdMax) + (j51 >>> 32);
                long j54 = j51 & BodyPartID.bodyIdMax;
                long j55 = j45 + (j50 * j10);
                int i20 = (int) j55;
                iArr2[5] = (i20 << 1) | i19;
                int i21 = i20 >>> 31;
                long j56 = j47 + (j55 >>> 32) + (j50 * j15);
                long j57 = j49 + (j56 >>> 32) + (j50 * j19);
                long j58 = j56 & BodyPartID.bodyIdMax;
                long j59 = j52 + (j57 >>> 32) + (j50 * j26);
                long j60 = j57 & BodyPartID.bodyIdMax;
                long j61 = j54 + (j59 >>> 32) + (j50 * j37);
                long j62 = j59 & BodyPartID.bodyIdMax;
                long j63 = j53 + (j61 >>> 32);
                long j64 = j61 & BodyPartID.bodyIdMax;
                long j65 = iArr[6] & BodyPartID.bodyIdMax;
                long j66 = (iArr2[11] & BodyPartID.bodyIdMax) + (j63 >>> 32);
                long j67 = j63 & BodyPartID.bodyIdMax;
                long j68 = (iArr2[12] & BodyPartID.bodyIdMax) + (j66 >>> 32);
                long j69 = j66 & BodyPartID.bodyIdMax;
                long j70 = j58 + (j10 * j65);
                int i22 = (int) j70;
                iArr2[6] = (i22 << 1) | i21;
                int i23 = i22 >>> 31;
                long j71 = j60 + (j70 >>> 32) + (j15 * j65);
                long j72 = j62 + (j71 >>> 32) + (j19 * j65);
                long j73 = j64 + (j72 >>> 32) + (j65 * j26);
                long j74 = j67 + (j73 >>> 32) + (j65 * j37);
                long j75 = j69 + (j74 >>> 32) + (j65 * j50);
                long j76 = j68 + (j75 >>> 32);
                int i24 = (int) j71;
                iArr2[7] = i23 | (i24 << 1);
                int i25 = i24 >>> 31;
                int i26 = (int) j72;
                iArr2[8] = i25 | (i26 << 1);
                int i27 = i26 >>> 31;
                int i28 = (int) j73;
                iArr2[9] = i27 | (i28 << 1);
                int i29 = (int) j74;
                iArr2[10] = (i28 >>> 31) | (i29 << 1);
                int i30 = i29 >>> 31;
                int i31 = (int) j75;
                iArr2[11] = i30 | (i31 << 1);
                int i32 = i31 >>> 31;
                int i33 = (int) j76;
                iArr2[12] = i32 | (i33 << 1);
                iArr2[13] = ((iArr2[13] + ((int) (j76 >>> 32))) << 1) | (i33 >>> 31);
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
        long j15 = (j14 >> 32) + ((iArr[5] & BodyPartID.bodyIdMax) - (iArr2[5] & BodyPartID.bodyIdMax));
        iArr3[5] = (int) j15;
        long j16 = (j15 >> 32) + ((iArr[6] & BodyPartID.bodyIdMax) - (iArr2[6] & BodyPartID.bodyIdMax));
        iArr3[6] = (int) j16;
        return (int) (j16 >> 32);
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
        long j14 = (j13 >> 32) + ((iArr2[4] & BodyPartID.bodyIdMax) - (iArr[4] & BodyPartID.bodyIdMax));
        iArr2[4] = (int) j14;
        long j15 = (j14 >> 32) + ((iArr2[5] & BodyPartID.bodyIdMax) - (iArr[5] & BodyPartID.bodyIdMax));
        iArr2[5] = (int) j15;
        long j16 = (j15 >> 32) + ((iArr2[6] & BodyPartID.bodyIdMax) - (BodyPartID.bodyIdMax & iArr[6]));
        iArr2[6] = (int) j16;
        return (int) (j16 >> 32);
    }

    public static BigInteger t(int[] iArr) {
        byte[] bArr = new byte[28];
        for (int i10 = 0; i10 < 7; i10++) {
            int i11 = iArr[i10];
            if (i11 != 0) {
                Aj.f.d(i11, bArr, (6 - i10) << 2);
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
        iArr[5] = 0;
        iArr[6] = 0;
    }
}
