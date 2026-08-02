package pj;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes5.dex */
public abstract class e {
    public static void A(int[] iArr, int i10, int[] iArr2, int i11) {
        long j10 = iArr[i10] & BodyPartID.bodyIdMax;
        int i12 = 0;
        int i13 = 12;
        int i14 = 5;
        while (true) {
            int i15 = i14 - 1;
            long j11 = iArr[i10 + i14] & BodyPartID.bodyIdMax;
            long j12 = j11 * j11;
            iArr2[i11 + (i13 - 1)] = (i12 << 31) | ((int) (j12 >>> 33));
            i13 -= 2;
            iArr2[i11 + i13] = (int) (j12 >>> 1);
            i12 = (int) j12;
            if (i15 <= 0) {
                long j13 = j10 * j10;
                long j14 = (j13 >>> 33) | ((i12 << 31) & BodyPartID.bodyIdMax);
                iArr2[i11] = (int) j13;
                int i16 = ((int) (j13 >>> 32)) & 1;
                long j15 = iArr[i10 + 1] & BodyPartID.bodyIdMax;
                long j16 = iArr2[r12] & BodyPartID.bodyIdMax;
                long j17 = j14 + (j15 * j10);
                int i17 = (int) j17;
                iArr2[i11 + 1] = (i17 << 1) | i16;
                int i18 = i17 >>> 31;
                long j18 = j16 + (j17 >>> 32);
                long j19 = iArr[i10 + 2] & BodyPartID.bodyIdMax;
                long j20 = iArr2[r15] & BodyPartID.bodyIdMax;
                long j21 = iArr2[r18] & BodyPartID.bodyIdMax;
                long j22 = j18 + (j19 * j10);
                int i19 = (int) j22;
                iArr2[i11 + 2] = (i19 << 1) | i18;
                long j23 = j20 + (j22 >>> 32) + (j19 * j15);
                long j24 = j21 + (j23 >>> 32);
                long j25 = j23 & BodyPartID.bodyIdMax;
                long j26 = iArr[i10 + 3] & BodyPartID.bodyIdMax;
                long j27 = (iArr2[r14] & BodyPartID.bodyIdMax) + (j24 >>> 32);
                long j28 = j24 & BodyPartID.bodyIdMax;
                long j29 = (iArr2[r7] & BodyPartID.bodyIdMax) + (j27 >>> 32);
                long j30 = j27 & BodyPartID.bodyIdMax;
                long j31 = j25 + (j26 * j10);
                int i20 = (int) j31;
                iArr2[i11 + 3] = (i20 << 1) | (i19 >>> 31);
                int i21 = i20 >>> 31;
                long j32 = j28 + (j31 >>> 32) + (j26 * j15);
                long j33 = j30 + (j32 >>> 32) + (j26 * j19);
                long j34 = j32 & BodyPartID.bodyIdMax;
                long j35 = j29 + (j33 >>> 32);
                long j36 = j33 & BodyPartID.bodyIdMax;
                long j37 = iArr[i10 + 4] & BodyPartID.bodyIdMax;
                long j38 = (iArr2[r2] & BodyPartID.bodyIdMax) + (j35 >>> 32);
                long j39 = j35 & BodyPartID.bodyIdMax;
                long j40 = (iArr2[r15] & BodyPartID.bodyIdMax) + (j38 >>> 32);
                long j41 = j38 & BodyPartID.bodyIdMax;
                long j42 = j34 + (j37 * j10);
                int i22 = (int) j42;
                iArr2[i11 + 4] = (i22 << 1) | i21;
                int i23 = i22 >>> 31;
                long j43 = j36 + (j42 >>> 32) + (j37 * j15);
                long j44 = j39 + (j43 >>> 32) + (j37 * j19);
                long j45 = j43 & BodyPartID.bodyIdMax;
                long j46 = j41 + (j44 >>> 32) + (j37 * j26);
                long j47 = j44 & BodyPartID.bodyIdMax;
                long j48 = j40 + (j46 >>> 32);
                long j49 = j46 & BodyPartID.bodyIdMax;
                long j50 = iArr[i10 + 5] & BodyPartID.bodyIdMax;
                long j51 = (iArr2[r18] & BodyPartID.bodyIdMax) + (j48 >>> 32);
                long j52 = j48 & BodyPartID.bodyIdMax;
                long j53 = (iArr2[r20] & BodyPartID.bodyIdMax) + (j51 >>> 32);
                long j54 = j51 & BodyPartID.bodyIdMax;
                long j55 = j45 + (j10 * j50);
                int i24 = (int) j55;
                iArr2[i11 + 5] = (i24 << 1) | i23;
                long j56 = j47 + (j55 >>> 32) + (j15 * j50);
                long j57 = j49 + (j56 >>> 32) + (j50 * j19);
                long j58 = j52 + (j57 >>> 32) + (j50 * j26);
                long j59 = j54 + (j58 >>> 32) + (j50 * j37);
                long j60 = j53 + (j59 >>> 32);
                int i25 = (int) j56;
                iArr2[i11 + 6] = (i24 >>> 31) | (i25 << 1);
                int i26 = (int) j57;
                iArr2[i11 + 7] = (i26 << 1) | (i25 >>> 31);
                int i27 = (int) j58;
                iArr2[i11 + 8] = (i26 >>> 31) | (i27 << 1);
                int i28 = i27 >>> 31;
                int i29 = (int) j59;
                iArr2[i11 + 9] = i28 | (i29 << 1);
                int i30 = i29 >>> 31;
                int i31 = (int) j60;
                iArr2[i11 + 10] = i30 | (i31 << 1);
                int i32 = i31 >>> 31;
                int i33 = i11 + 11;
                iArr2[i33] = i32 | ((iArr2[i33] + ((int) (j60 >>> 32))) << 1);
                return;
            }
            i14 = i15;
        }
    }

    public static void B(int[] iArr, int[] iArr2) {
        long j10 = iArr[0] & BodyPartID.bodyIdMax;
        int i10 = 12;
        int i11 = 0;
        int i12 = 5;
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
                long j55 = j45 + (j10 * j50);
                int i20 = (int) j55;
                iArr2[5] = (i20 << 1) | i19;
                long j56 = j47 + (j55 >>> 32) + (j15 * j50);
                long j57 = j49 + (j56 >>> 32) + (j19 * j50);
                long j58 = j52 + (j57 >>> 32) + (j50 * j26);
                long j59 = j54 + (j58 >>> 32) + (j37 * j50);
                long j60 = j53 + (j59 >>> 32);
                int i21 = (int) j56;
                iArr2[6] = (i20 >>> 31) | (i21 << 1);
                int i22 = i21 >>> 31;
                int i23 = (int) j57;
                iArr2[7] = i22 | (i23 << 1);
                int i24 = (int) j58;
                iArr2[8] = (i23 >>> 31) | (i24 << 1);
                int i25 = i24 >>> 31;
                int i26 = (int) j59;
                iArr2[9] = i25 | (i26 << 1);
                int i27 = i26 >>> 31;
                int i28 = (int) j60;
                iArr2[10] = i27 | (i28 << 1);
                iArr2[11] = ((iArr2[11] + ((int) (j60 >>> 32))) << 1) | (i28 >>> 31);
                return;
            }
            i12 = i13;
        }
    }

    public static int C(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j10 = (iArr[i10] & BodyPartID.bodyIdMax) - (iArr2[i11] & BodyPartID.bodyIdMax);
        iArr3[i12] = (int) j10;
        long j11 = (j10 >> 32) + ((iArr[i10 + 1] & BodyPartID.bodyIdMax) - (iArr2[i11 + 1] & BodyPartID.bodyIdMax));
        iArr3[i12 + 1] = (int) j11;
        long j12 = (j11 >> 32) + ((iArr[i10 + 2] & BodyPartID.bodyIdMax) - (iArr2[i11 + 2] & BodyPartID.bodyIdMax));
        iArr3[i12 + 2] = (int) j12;
        long j13 = (j12 >> 32) + ((iArr[i10 + 3] & BodyPartID.bodyIdMax) - (iArr2[i11 + 3] & BodyPartID.bodyIdMax));
        iArr3[i12 + 3] = (int) j13;
        long j14 = (j13 >> 32) + ((iArr[i10 + 4] & BodyPartID.bodyIdMax) - (iArr2[i11 + 4] & BodyPartID.bodyIdMax));
        iArr3[i12 + 4] = (int) j14;
        long j15 = (j14 >> 32) + ((iArr[i10 + 5] & BodyPartID.bodyIdMax) - (iArr2[i11 + 5] & BodyPartID.bodyIdMax));
        iArr3[i12 + 5] = (int) j15;
        return (int) (j15 >> 32);
    }

    public static int D(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j15 >> 32);
    }

    public static int E(int[] iArr, int[] iArr2) {
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
        long j15 = (j14 >> 32) + ((iArr2[5] & BodyPartID.bodyIdMax) - (BodyPartID.bodyIdMax & iArr[5]));
        iArr2[5] = (int) j15;
        return (int) (j15 >> 32);
    }

    public static BigInteger F(int[] iArr) {
        byte[] bArr = new byte[24];
        for (int i10 = 0; i10 < 6; i10++) {
            int i11 = iArr[i10];
            if (i11 != 0) {
                Aj.f.d(i11, bArr, (5 - i10) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger G(long[] jArr) {
        byte[] bArr = new byte[24];
        for (int i10 = 0; i10 < 3; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                Aj.f.m(j10, bArr, (2 - i10) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void H(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
    }

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
        return (int) (j15 >>> 32);
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
        return (int) (j15 >>> 32);
    }

    public static int c(int[] iArr, int i10, int[] iArr2, int i11, int i12) {
        long j10 = (i12 & BodyPartID.bodyIdMax) + (iArr[i10] & BodyPartID.bodyIdMax) + (iArr2[i11] & BodyPartID.bodyIdMax);
        iArr2[i11] = (int) j10;
        long j11 = (j10 >>> 32) + (iArr[i10 + 1] & BodyPartID.bodyIdMax) + (iArr2[r6] & BodyPartID.bodyIdMax);
        iArr2[i11 + 1] = (int) j11;
        long j12 = (j11 >>> 32) + (iArr[i10 + 2] & BodyPartID.bodyIdMax) + (iArr2[r6] & BodyPartID.bodyIdMax);
        iArr2[i11 + 2] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[i10 + 3] & BodyPartID.bodyIdMax) + (iArr2[r6] & BodyPartID.bodyIdMax);
        iArr2[i11 + 3] = (int) j13;
        long j14 = (j13 >>> 32) + (iArr[i10 + 4] & BodyPartID.bodyIdMax) + (iArr2[r6] & BodyPartID.bodyIdMax);
        iArr2[i11 + 4] = (int) j14;
        long j15 = (j14 >>> 32) + (iArr[i10 + 5] & BodyPartID.bodyIdMax) + (BodyPartID.bodyIdMax & iArr2[r12]);
        iArr2[i11 + 5] = (int) j15;
        return (int) (j15 >>> 32);
    }

    public static int d(int[] iArr, int i10, int[] iArr2, int i11) {
        long j10 = (iArr[i10] & BodyPartID.bodyIdMax) + (iArr2[i11] & BodyPartID.bodyIdMax);
        int i12 = (int) j10;
        iArr[i10] = i12;
        iArr2[i11] = i12;
        long j11 = (j10 >>> 32) + (iArr[r5] & BodyPartID.bodyIdMax) + (iArr2[r8] & BodyPartID.bodyIdMax);
        int i13 = (int) j11;
        iArr[i10 + 1] = i13;
        iArr2[i11 + 1] = i13;
        long j12 = (j11 >>> 32) + (iArr[r5] & BodyPartID.bodyIdMax) + (iArr2[r8] & BodyPartID.bodyIdMax);
        int i14 = (int) j12;
        iArr[i10 + 2] = i14;
        iArr2[i11 + 2] = i14;
        long j13 = (j12 >>> 32) + (iArr[r5] & BodyPartID.bodyIdMax) + (iArr2[r8] & BodyPartID.bodyIdMax);
        int i15 = (int) j13;
        iArr[i10 + 3] = i15;
        iArr2[i11 + 3] = i15;
        long j14 = (j13 >>> 32) + (iArr[r5] & BodyPartID.bodyIdMax) + (iArr2[r8] & BodyPartID.bodyIdMax);
        int i16 = (int) j14;
        iArr[i10 + 4] = i16;
        iArr2[i11 + 4] = i16;
        long j15 = (j14 >>> 32) + (iArr[r12] & BodyPartID.bodyIdMax) + (BodyPartID.bodyIdMax & iArr2[r14]);
        int i17 = (int) j15;
        iArr[i10 + 5] = i17;
        iArr2[i11 + 5] = i17;
        return (int) (j15 >>> 32);
    }

    public static int[] e() {
        return new int[6];
    }

    public static long[] f() {
        return new long[3];
    }

    public static int[] g() {
        return new int[12];
    }

    public static long[] h() {
        return new long[6];
    }

    public static boolean i(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        boolean o10 = o(iArr, i10, iArr2, i11);
        if (o10) {
            C(iArr, i10, iArr2, i11, iArr3, i12);
            return o10;
        }
        C(iArr2, i11, iArr, i10, iArr3, i12);
        return o10;
    }

    public static boolean j(int[] iArr, int[] iArr2) {
        for (int i10 = 5; i10 >= 0; i10--) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(long[] jArr, long[] jArr2) {
        for (int i10 = 2; i10 >= 0; i10--) {
            if (jArr[i10] != jArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static int[] l(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        int[] e10 = e();
        int i10 = 0;
        while (bigInteger.signum() != 0) {
            e10[i10] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i10++;
        }
        return e10;
    }

    public static long[] m(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        long[] f10 = f();
        int i10 = 0;
        while (bigInteger.signum() != 0) {
            f10[i10] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i10++;
        }
        return f10;
    }

    public static int n(int[] iArr, int i10) {
        int i11;
        if (i10 == 0) {
            i11 = iArr[0];
        } else {
            int i12 = i10 >> 5;
            if (i12 < 0 || i12 >= 6) {
                return 0;
            }
            i11 = iArr[i12] >>> (i10 & 31);
        }
        return i11 & 1;
    }

    public static boolean o(int[] iArr, int i10, int[] iArr2, int i11) {
        for (int i12 = 5; i12 >= 0; i12--) {
            int i13 = iArr[i10 + i12] ^ Integer.MIN_VALUE;
            int i14 = Integer.MIN_VALUE ^ iArr2[i11 + i12];
            if (i13 < i14) {
                return false;
            }
            if (i13 > i14) {
                return true;
            }
        }
        return true;
    }

    public static boolean p(int[] iArr, int[] iArr2) {
        for (int i10 = 5; i10 >= 0; i10--) {
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

    public static boolean q(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i10 = 1; i10 < 6; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean r(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i10 = 1; i10 < 3; i10++) {
            if (jArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean s(int[] iArr) {
        for (int i10 = 0; i10 < 6; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean t(long[] jArr) {
        for (int i10 = 0; i10 < 3; i10++) {
            if (jArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void u(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j10 = iArr2[i11] & BodyPartID.bodyIdMax;
        long j11 = iArr2[i11 + 1] & BodyPartID.bodyIdMax;
        long j12 = iArr2[i11 + 2] & BodyPartID.bodyIdMax;
        long j13 = iArr2[i11 + 3] & BodyPartID.bodyIdMax;
        long j14 = iArr2[i11 + 4] & BodyPartID.bodyIdMax;
        long j15 = iArr2[i11 + 5] & BodyPartID.bodyIdMax;
        long j16 = iArr[i10] & BodyPartID.bodyIdMax;
        long j17 = j16 * j10;
        iArr3[i12] = (int) j17;
        long j18 = (j17 >>> 32) + (j16 * j11);
        iArr3[i12 + 1] = (int) j18;
        long j19 = (j18 >>> 32) + (j16 * j12);
        iArr3[i12 + 2] = (int) j19;
        long j20 = (j19 >>> 32) + (j16 * j13);
        iArr3[i12 + 3] = (int) j20;
        long j21 = (j20 >>> 32) + (j16 * j14);
        iArr3[i12 + 4] = (int) j21;
        long j22 = (j21 >>> 32) + (j16 * j15);
        iArr3[i12 + 5] = (int) j22;
        iArr3[i12 + 6] = (int) (j22 >>> 32);
        int i13 = 1;
        int i14 = i12;
        while (i13 < 6) {
            int i15 = i14 + 1;
            long j23 = iArr[i10 + i13] & BodyPartID.bodyIdMax;
            int i16 = i14;
            long j24 = (j23 * j10) + (iArr3[i15] & BodyPartID.bodyIdMax);
            iArr3[i15] = (int) j24;
            long j25 = (j24 >>> 32) + (j23 * j11) + (iArr3[r3] & BodyPartID.bodyIdMax);
            iArr3[i16 + 2] = (int) j25;
            long j26 = (j25 >>> 32) + (j23 * j12) + (iArr3[r21] & BodyPartID.bodyIdMax);
            iArr3[i16 + 3] = (int) j26;
            long j27 = (j26 >>> 32) + (j23 * j13) + (iArr3[r21] & BodyPartID.bodyIdMax);
            iArr3[i16 + 4] = (int) j27;
            long j28 = (j27 >>> 32) + (j23 * j14) + (iArr3[r21] & BodyPartID.bodyIdMax);
            iArr3[i16 + 5] = (int) j28;
            long j29 = (j28 >>> 32) + (j23 * j15) + (iArr3[r2] & BodyPartID.bodyIdMax);
            iArr3[i16 + 6] = (int) j29;
            iArr3[i16 + 7] = (int) (j29 >>> 32);
            i13++;
            i14 = i15;
        }
    }

    public static void v(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = iArr2[0] & BodyPartID.bodyIdMax;
        long j11 = iArr2[1] & BodyPartID.bodyIdMax;
        long j12 = iArr2[2] & BodyPartID.bodyIdMax;
        long j13 = iArr2[3] & BodyPartID.bodyIdMax;
        long j14 = iArr2[4] & BodyPartID.bodyIdMax;
        long j15 = iArr2[5] & BodyPartID.bodyIdMax;
        int i10 = 1;
        long j16 = iArr[0] & BodyPartID.bodyIdMax;
        long j17 = j16 * j10;
        iArr3[0] = (int) j17;
        long j18 = (j17 >>> 32) + (j16 * j11);
        iArr3[1] = (int) j18;
        long j19 = (j18 >>> 32) + (j16 * j12);
        iArr3[2] = (int) j19;
        long j20 = (j19 >>> 32) + (j16 * j13);
        iArr3[3] = (int) j20;
        long j21 = (j20 >>> 32) + (j16 * j14);
        iArr3[4] = (int) j21;
        long j22 = (j21 >>> 32) + (j16 * j15);
        iArr3[5] = (int) j22;
        int i11 = 6;
        iArr3[6] = (int) (j22 >>> 32);
        while (true) {
            int i12 = i10;
            if (i12 >= i11) {
                return;
            }
            long j23 = iArr[i12] & BodyPartID.bodyIdMax;
            long j24 = (j23 * j10) + (iArr3[i12] & BodyPartID.bodyIdMax);
            iArr3[i12] = (int) j24;
            i10 = i12 + 1;
            long j25 = j14;
            long j26 = (j24 >>> 32) + (j23 * j11) + (iArr3[i10] & BodyPartID.bodyIdMax);
            iArr3[i10] = (int) j26;
            long j27 = (j26 >>> 32) + (j23 * j12) + (iArr3[r5] & BodyPartID.bodyIdMax);
            iArr3[i12 + 2] = (int) j27;
            long j28 = (j27 >>> 32) + (j23 * j13) + (iArr3[r5] & BodyPartID.bodyIdMax);
            iArr3[i12 + 3] = (int) j28;
            long j29 = (j28 >>> 32) + (j23 * j25) + (iArr3[r5] & BodyPartID.bodyIdMax);
            iArr3[i12 + 4] = (int) j29;
            long j30 = (j29 >>> 32) + (j23 * j15) + (iArr3[r5] & BodyPartID.bodyIdMax);
            iArr3[i12 + 5] = (int) j30;
            iArr3[i12 + 6] = (int) (j30 >>> 32);
            j14 = j25;
            i11 = 6;
        }
    }

    public static long w(int i10, int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
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
        long j23 = (j21 >>> 32) + (j10 * j22) + j20 + (BodyPartID.bodyIdMax & iArr2[i12 + 5]);
        iArr3[i13 + 5] = (int) j23;
        return (j23 >>> 32) + j22;
    }

    public static int x(int i10, long j10, int[] iArr, int i11) {
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
        return m.t(6, iArr, i11, 4);
    }

    public static int y(int i10, int i11, int[] iArr, int i12) {
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
        return m.t(6, iArr, i12, 3);
    }

    public static int z(int[] iArr, int[] iArr2, int[] iArr3) {
        int i10 = 0;
        long j10 = iArr2[0] & BodyPartID.bodyIdMax;
        long j11 = iArr2[1] & BodyPartID.bodyIdMax;
        long j12 = iArr2[2] & BodyPartID.bodyIdMax;
        long j13 = iArr2[3] & BodyPartID.bodyIdMax;
        long j14 = iArr2[4] & BodyPartID.bodyIdMax;
        long j15 = iArr2[5] & BodyPartID.bodyIdMax;
        long j16 = 0;
        while (i10 < 6) {
            long j17 = j10;
            int i11 = i10;
            long j18 = iArr[i10] & BodyPartID.bodyIdMax;
            long j19 = (iArr3[i11] & BodyPartID.bodyIdMax) + (j18 * j17);
            iArr3[i11] = (int) j19;
            int i12 = i11 + 1;
            long j20 = (j19 >>> 32) + (j18 * j11) + (iArr3[i12] & BodyPartID.bodyIdMax);
            iArr3[i12] = (int) j20;
            long j21 = (j20 >>> 32) + (j18 * j12) + (iArr3[r15] & BodyPartID.bodyIdMax);
            iArr3[i11 + 2] = (int) j21;
            long j22 = (j21 >>> 32) + (j18 * j13) + (iArr3[r2] & BodyPartID.bodyIdMax);
            iArr3[i11 + 3] = (int) j22;
            long j23 = (j22 >>> 32) + (j18 * j14) + (iArr3[r2] & BodyPartID.bodyIdMax);
            iArr3[i11 + 4] = (int) j23;
            long j24 = (j23 >>> 32) + (j18 * j15) + (iArr3[r2] & BodyPartID.bodyIdMax);
            iArr3[i11 + 5] = (int) j24;
            long j25 = (j24 >>> 32) + j16 + (iArr3[r2] & BodyPartID.bodyIdMax);
            iArr3[i11 + 6] = (int) j25;
            j16 = j25 >>> 32;
            i10 = i12;
            j10 = j17;
        }
        return (int) j16;
    }
}
