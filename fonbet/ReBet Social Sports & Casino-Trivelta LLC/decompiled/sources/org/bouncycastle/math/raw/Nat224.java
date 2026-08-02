package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.util.Pack;

/* loaded from: classes5.dex */
public abstract class Nat224 {

    /* renamed from: M, reason: collision with root package name */
    private static final long f62015M = 4294967295L;

    public static int add(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j10 = (iArr[i10] & 4294967295L) + (iArr2[i11] & 4294967295L);
        iArr3[i12] = (int) j10;
        long j11 = (j10 >>> 32) + (iArr[i10 + 1] & 4294967295L) + (iArr2[i11 + 1] & 4294967295L);
        iArr3[i12 + 1] = (int) j11;
        long j12 = (j11 >>> 32) + (iArr[i10 + 2] & 4294967295L) + (iArr2[i11 + 2] & 4294967295L);
        iArr3[i12 + 2] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[i10 + 3] & 4294967295L) + (iArr2[i11 + 3] & 4294967295L);
        iArr3[i12 + 3] = (int) j13;
        long j14 = (j13 >>> 32) + (iArr[i10 + 4] & 4294967295L) + (iArr2[i11 + 4] & 4294967295L);
        iArr3[i12 + 4] = (int) j14;
        long j15 = (j14 >>> 32) + (iArr[i10 + 5] & 4294967295L) + (iArr2[i11 + 5] & 4294967295L);
        iArr3[i12 + 5] = (int) j15;
        long j16 = (j15 >>> 32) + (iArr[i10 + 6] & 4294967295L) + (iArr2[i11 + 6] & 4294967295L);
        iArr3[i12 + 6] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int addBothTo(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j10 = (iArr[i10] & 4294967295L) + (iArr2[i11] & 4294967295L) + (iArr3[i12] & 4294967295L);
        iArr3[i12] = (int) j10;
        long j11 = (j10 >>> 32) + (iArr[i10 + 1] & 4294967295L) + (iArr2[i11 + 1] & 4294967295L) + (iArr3[r7] & 4294967295L);
        iArr3[i12 + 1] = (int) j11;
        long j12 = (j11 >>> 32) + (iArr[i10 + 2] & 4294967295L) + (iArr2[i11 + 2] & 4294967295L) + (iArr3[r7] & 4294967295L);
        iArr3[i12 + 2] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[i10 + 3] & 4294967295L) + (iArr2[i11 + 3] & 4294967295L) + (iArr3[r7] & 4294967295L);
        iArr3[i12 + 3] = (int) j13;
        long j14 = (j13 >>> 32) + (iArr[i10 + 4] & 4294967295L) + (iArr2[i11 + 4] & 4294967295L) + (iArr3[r7] & 4294967295L);
        iArr3[i12 + 4] = (int) j14;
        long j15 = (j14 >>> 32) + (iArr[i10 + 5] & 4294967295L) + (iArr2[i11 + 5] & 4294967295L) + (iArr3[r7] & 4294967295L);
        iArr3[i12 + 5] = (int) j15;
        long j16 = (j15 >>> 32) + (iArr[i10 + 6] & 4294967295L) + (iArr2[i11 + 6] & 4294967295L) + (iArr3[r15] & 4294967295L);
        iArr3[i12 + 6] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int addTo(int[] iArr, int i10, int[] iArr2, int i11, int i12) {
        long j10 = (i12 & 4294967295L) + (iArr[i10] & 4294967295L) + (iArr2[i11] & 4294967295L);
        iArr2[i11] = (int) j10;
        long j11 = (j10 >>> 32) + (iArr[i10 + 1] & 4294967295L) + (iArr2[r6] & 4294967295L);
        iArr2[i11 + 1] = (int) j11;
        long j12 = (j11 >>> 32) + (iArr[i10 + 2] & 4294967295L) + (iArr2[r6] & 4294967295L);
        iArr2[i11 + 2] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[i10 + 3] & 4294967295L) + (iArr2[r6] & 4294967295L);
        iArr2[i11 + 3] = (int) j13;
        long j14 = (j13 >>> 32) + (iArr[i10 + 4] & 4294967295L) + (iArr2[r6] & 4294967295L);
        iArr2[i11 + 4] = (int) j14;
        long j15 = (j14 >>> 32) + (iArr[i10 + 5] & 4294967295L) + (iArr2[r6] & 4294967295L);
        iArr2[i11 + 5] = (int) j15;
        long j16 = (j15 >>> 32) + (iArr[i10 + 6] & 4294967295L) + (4294967295L & iArr2[r12]);
        iArr2[i11 + 6] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i10, int[] iArr2, int i11) {
        long j10 = (iArr[i10] & 4294967295L) + (iArr2[i11] & 4294967295L);
        int i12 = (int) j10;
        iArr[i10] = i12;
        iArr2[i11] = i12;
        long j11 = (j10 >>> 32) + (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L);
        int i13 = (int) j11;
        iArr[i10 + 1] = i13;
        iArr2[i11 + 1] = i13;
        long j12 = (j11 >>> 32) + (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L);
        int i14 = (int) j12;
        iArr[i10 + 2] = i14;
        iArr2[i11 + 2] = i14;
        long j13 = (j12 >>> 32) + (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L);
        int i15 = (int) j13;
        iArr[i10 + 3] = i15;
        iArr2[i11 + 3] = i15;
        long j14 = (j13 >>> 32) + (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L);
        int i16 = (int) j14;
        iArr[i10 + 4] = i16;
        iArr2[i11 + 4] = i16;
        long j15 = (j14 >>> 32) + (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L);
        int i17 = (int) j15;
        iArr[i10 + 5] = i17;
        iArr2[i11 + 5] = i17;
        long j16 = (j15 >>> 32) + (iArr[r12] & 4294967295L) + (4294967295L & iArr2[r14]);
        int i18 = (int) j16;
        iArr[i10 + 6] = i18;
        iArr2[i11 + 6] = i18;
        return (int) (j16 >>> 32);
    }

    public static void copy(int[] iArr, int i10, int[] iArr2, int i11) {
        iArr2[i11] = iArr[i10];
        iArr2[i11 + 1] = iArr[i10 + 1];
        iArr2[i11 + 2] = iArr[i10 + 2];
        iArr2[i11 + 3] = iArr[i10 + 3];
        iArr2[i11 + 4] = iArr[i10 + 4];
        iArr2[i11 + 5] = iArr[i10 + 5];
        iArr2[i11 + 6] = iArr[i10 + 6];
    }

    public static int[] create() {
        return new int[7];
    }

    public static int[] createExt() {
        return new int[14];
    }

    public static boolean diff(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        boolean gte = gte(iArr, i10, iArr2, i11);
        if (gte) {
            sub(iArr, i10, iArr2, i11, iArr3, i12);
            return gte;
        }
        sub(iArr2, i11, iArr, i10, iArr3, i12);
        return gte;
    }

    public static boolean eq(int[] iArr, int[] iArr2) {
        for (int i10 = 6; i10 >= 0; i10--) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 224) {
            throw new IllegalArgumentException();
        }
        int[] create = create();
        for (int i10 = 0; i10 < 7; i10++) {
            create[i10] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return create;
    }

    public static int getBit(int[] iArr, int i10) {
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

    public static boolean gte(int[] iArr, int i10, int[] iArr2, int i11) {
        for (int i12 = 6; i12 >= 0; i12--) {
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

    public static boolean isOne(int[] iArr) {
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

    public static boolean isZero(int[] iArr) {
        for (int i10 = 0; i10 < 7; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j10 = iArr2[i11] & 4294967295L;
        long j11 = iArr2[i11 + 1] & 4294967295L;
        long j12 = iArr2[i11 + 2] & 4294967295L;
        long j13 = iArr2[i11 + 3] & 4294967295L;
        long j14 = iArr2[i11 + 4] & 4294967295L;
        long j15 = iArr2[i11 + 5] & 4294967295L;
        long j16 = iArr2[i11 + 6] & 4294967295L;
        long j17 = iArr[i10] & 4294967295L;
        long j18 = j17 * j10;
        iArr3[i12] = (int) j18;
        long j19 = (j18 >>> 32) + (j17 * j11);
        iArr3[i12 + 1] = (int) j19;
        long j20 = (j19 >>> 32) + (j17 * j12);
        iArr3[i12 + 2] = (int) j20;
        long j21 = (j20 >>> 32) + (j17 * j13);
        iArr3[i12 + 3] = (int) j21;
        long j22 = (j21 >>> 32) + (j17 * j14);
        iArr3[i12 + 4] = (int) j22;
        long j23 = (j22 >>> 32) + (j17 * j15);
        iArr3[i12 + 5] = (int) j23;
        long j24 = (j23 >>> 32) + (j17 * j16);
        iArr3[i12 + 6] = (int) j24;
        iArr3[i12 + 7] = (int) (j24 >>> 32);
        int i13 = 1;
        int i14 = i12;
        while (i13 < 7) {
            int i15 = i14 + 1;
            int i16 = i14;
            long j25 = iArr[i10 + i13] & 4294967295L;
            long j26 = (j25 * j10) + (iArr3[i15] & 4294967295L);
            iArr3[i15] = (int) j26;
            long j27 = (j26 >>> 32) + (j25 * j11) + (iArr3[r3] & 4294967295L);
            iArr3[i16 + 2] = (int) j27;
            long j28 = (j27 >>> 32) + (j25 * j12) + (iArr3[r22] & 4294967295L);
            iArr3[i16 + 3] = (int) j28;
            long j29 = (j28 >>> 32) + (j25 * j13) + (iArr3[r22] & 4294967295L);
            iArr3[i16 + 4] = (int) j29;
            long j30 = (j29 >>> 32) + (j25 * j14) + (iArr3[r22] & 4294967295L);
            iArr3[i16 + 5] = (int) j30;
            long j31 = (j30 >>> 32) + (j25 * j15) + (iArr3[r22] & 4294967295L);
            iArr3[i16 + 6] = (int) j31;
            long j32 = (j31 >>> 32) + (j25 * j16) + (iArr3[r22] & 4294967295L);
            iArr3[i16 + 7] = (int) j32;
            iArr3[i16 + 8] = (int) (j32 >>> 32);
            i13++;
            i14 = i15;
        }
    }

    public static long mul33Add(int i10, int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        long j10 = i10 & 4294967295L;
        long j11 = iArr[i11] & 4294967295L;
        long j12 = (j10 * j11) + (iArr2[i12] & 4294967295L);
        iArr3[i13] = (int) j12;
        long j13 = iArr[i11 + 1] & 4294967295L;
        long j14 = (j12 >>> 32) + (j10 * j13) + j11 + (iArr2[i12 + 1] & 4294967295L);
        iArr3[i13 + 1] = (int) j14;
        long j15 = j14 >>> 32;
        long j16 = iArr[i11 + 2] & 4294967295L;
        long j17 = j15 + (j10 * j16) + j13 + (iArr2[i12 + 2] & 4294967295L);
        iArr3[i13 + 2] = (int) j17;
        long j18 = iArr[i11 + 3] & 4294967295L;
        long j19 = (j17 >>> 32) + (j10 * j18) + j16 + (iArr2[i12 + 3] & 4294967295L);
        iArr3[i13 + 3] = (int) j19;
        long j20 = iArr[i11 + 4] & 4294967295L;
        long j21 = (j19 >>> 32) + (j10 * j20) + j18 + (iArr2[i12 + 4] & 4294967295L);
        iArr3[i13 + 4] = (int) j21;
        long j22 = iArr[i11 + 5] & 4294967295L;
        long j23 = (j21 >>> 32) + (j10 * j22) + j20 + (iArr2[i12 + 5] & 4294967295L);
        iArr3[i13 + 5] = (int) j23;
        long j24 = iArr[i11 + 6] & 4294967295L;
        long j25 = (j23 >>> 32) + (j10 * j24) + j22 + (4294967295L & iArr2[i12 + 6]);
        iArr3[i13 + 6] = (int) j25;
        return (j25 >>> 32) + j24;
    }

    public static int mul33DWordAdd(int i10, long j10, int[] iArr, int i11) {
        long j11 = i10 & 4294967295L;
        long j12 = j10 & 4294967295L;
        long j13 = (j11 * j12) + (iArr[i11] & 4294967295L);
        iArr[i11] = (int) j13;
        long j14 = j10 >>> 32;
        long j15 = (j11 * j14) + j12;
        long j16 = (j13 >>> 32) + j15 + (iArr[r4] & 4294967295L);
        iArr[i11 + 1] = (int) j16;
        long j17 = (j16 >>> 32) + j14 + (iArr[r4] & 4294967295L);
        iArr[i11 + 2] = (int) j17;
        long j18 = j17 >>> 32;
        long j19 = j18 + (iArr[r0] & 4294967295L);
        iArr[i11 + 3] = (int) j19;
        if ((j19 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(7, iArr, i11, 4);
    }

    public static int mul33WordAdd(int i10, int i11, int[] iArr, int i12) {
        long j10 = i10 & 4294967295L;
        long j11 = i11 & 4294967295L;
        long j12 = (j10 * j11) + (iArr[i12] & 4294967295L);
        iArr[i12] = (int) j12;
        long j13 = (j12 >>> 32) + j11 + (iArr[r5] & 4294967295L);
        iArr[i12 + 1] = (int) j13;
        long j14 = j13 >>> 32;
        long j15 = j14 + (iArr[r0] & 4294967295L);
        iArr[i12 + 2] = (int) j15;
        if ((j15 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(7, iArr, i12, 3);
    }

    public static int mulAddTo(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j10 = iArr2[i11] & 4294967295L;
        long j11 = iArr2[i11 + 1] & 4294967295L;
        long j12 = iArr2[i11 + 2] & 4294967295L;
        long j13 = iArr2[i11 + 3] & 4294967295L;
        long j14 = iArr2[i11 + 4] & 4294967295L;
        long j15 = iArr2[i11 + 5] & 4294967295L;
        long j16 = iArr2[i11 + 6] & 4294967295L;
        int i13 = 0;
        int i14 = i12;
        long j17 = 0;
        while (i13 < 7) {
            int i15 = i13;
            long j18 = iArr[i10 + i13] & 4294967295L;
            long j19 = (j18 * j10) + (iArr3[i14] & 4294967295L);
            long j20 = j11;
            iArr3[i14] = (int) j19;
            int i16 = i14 + 1;
            long j21 = (j19 >>> 32) + (j18 * j20) + (iArr3[i16] & 4294967295L);
            iArr3[i16] = (int) j21;
            long j22 = (j21 >>> 32) + (j18 * j12) + (iArr3[r4] & 4294967295L);
            iArr3[i14 + 2] = (int) j22;
            long j23 = (j22 >>> 32) + (j18 * j13) + (iArr3[r4] & 4294967295L);
            iArr3[i14 + 3] = (int) j23;
            long j24 = (j23 >>> 32) + (j18 * j14) + (iArr3[r4] & 4294967295L);
            iArr3[i14 + 4] = (int) j24;
            long j25 = (j24 >>> 32) + (j18 * j15) + (iArr3[r4] & 4294967295L);
            iArr3[i14 + 5] = (int) j25;
            long j26 = (j25 >>> 32) + (j18 * j16) + (iArr3[r4] & 4294967295L);
            iArr3[i14 + 6] = (int) j26;
            long j27 = j17 + (j26 >>> 32) + (iArr3[r16] & 4294967295L);
            iArr3[i14 + 7] = (int) j27;
            j17 = j27 >>> 32;
            i13 = i15 + 1;
            i14 = i16;
            j11 = j20;
        }
        return (int) j17;
    }

    public static int mulByWord(int i10, int[] iArr) {
        long j10 = i10 & 4294967295L;
        long j11 = (iArr[0] & 4294967295L) * j10;
        iArr[0] = (int) j11;
        long j12 = (j11 >>> 32) + ((iArr[1] & 4294967295L) * j10);
        iArr[1] = (int) j12;
        long j13 = (j12 >>> 32) + ((iArr[2] & 4294967295L) * j10);
        iArr[2] = (int) j13;
        long j14 = (j13 >>> 32) + ((iArr[3] & 4294967295L) * j10);
        iArr[3] = (int) j14;
        long j15 = (j14 >>> 32) + ((iArr[4] & 4294967295L) * j10);
        iArr[4] = (int) j15;
        long j16 = (j15 >>> 32) + ((iArr[5] & 4294967295L) * j10);
        iArr[5] = (int) j16;
        long j17 = (j16 >>> 32) + (j10 * (4294967295L & iArr[6]));
        iArr[6] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static int mulByWordAddTo(int i10, int[] iArr, int[] iArr2) {
        long j10 = i10 & 4294967295L;
        long j11 = ((iArr2[0] & 4294967295L) * j10) + (iArr[0] & 4294967295L);
        iArr2[0] = (int) j11;
        long j12 = (j11 >>> 32) + ((iArr2[1] & 4294967295L) * j10) + (iArr[1] & 4294967295L);
        iArr2[1] = (int) j12;
        long j13 = (j12 >>> 32) + ((iArr2[2] & 4294967295L) * j10) + (iArr[2] & 4294967295L);
        iArr2[2] = (int) j13;
        long j14 = (j13 >>> 32) + ((iArr2[3] & 4294967295L) * j10) + (iArr[3] & 4294967295L);
        iArr2[3] = (int) j14;
        long j15 = (j14 >>> 32) + ((iArr2[4] & 4294967295L) * j10) + (iArr[4] & 4294967295L);
        iArr2[4] = (int) j15;
        long j16 = (j15 >>> 32) + ((iArr2[5] & 4294967295L) * j10) + (iArr[5] & 4294967295L);
        iArr2[5] = (int) j16;
        long j17 = (j16 >>> 32) + (j10 * (iArr2[6] & 4294967295L)) + (4294967295L & iArr[6]);
        iArr2[6] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static int mulWord(int i10, int[] iArr, int[] iArr2, int i11) {
        long j10 = i10 & 4294967295L;
        long j11 = 0;
        int i12 = 0;
        do {
            long j12 = j11 + ((iArr[i12] & 4294967295L) * j10);
            iArr2[i11 + i12] = (int) j12;
            j11 = j12 >>> 32;
            i12++;
        } while (i12 < 7);
        return (int) j11;
    }

    public static int mulWordAddTo(int i10, int[] iArr, int i11, int[] iArr2, int i12) {
        long j10 = i10 & 4294967295L;
        long j11 = ((iArr[i11] & 4294967295L) * j10) + (iArr2[i12] & 4294967295L);
        iArr2[i12] = (int) j11;
        long j12 = (j11 >>> 32) + ((iArr[i11 + 1] & 4294967295L) * j10) + (iArr2[r8] & 4294967295L);
        iArr2[i12 + 1] = (int) j12;
        long j13 = (j12 >>> 32) + ((iArr[i11 + 2] & 4294967295L) * j10) + (iArr2[r8] & 4294967295L);
        iArr2[i12 + 2] = (int) j13;
        long j14 = (j13 >>> 32) + ((iArr[i11 + 3] & 4294967295L) * j10) + (iArr2[r8] & 4294967295L);
        iArr2[i12 + 3] = (int) j14;
        long j15 = (j14 >>> 32) + ((iArr[i11 + 4] & 4294967295L) * j10) + (iArr2[r8] & 4294967295L);
        iArr2[i12 + 4] = (int) j15;
        long j16 = (j15 >>> 32) + ((iArr[i11 + 5] & 4294967295L) * j10) + (iArr2[r8] & 4294967295L);
        iArr2[i12 + 5] = (int) j16;
        long j17 = (j16 >>> 32) + (j10 * (iArr[i11 + 6] & 4294967295L)) + (iArr2[r15] & 4294967295L);
        iArr2[i12 + 6] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static int mulWordDwordAdd(int i10, long j10, int[] iArr, int i11) {
        long j11 = i10 & 4294967295L;
        long j12 = ((j10 & 4294967295L) * j11) + (iArr[i11] & 4294967295L);
        iArr[i11] = (int) j12;
        long j13 = j11 * (j10 >>> 32);
        long j14 = (j12 >>> 32) + j13 + (iArr[r9] & 4294967295L);
        iArr[i11 + 1] = (int) j14;
        long j15 = (j14 >>> 32) + (iArr[r0] & 4294967295L);
        iArr[i11 + 2] = (int) j15;
        if ((j15 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(7, iArr, i11, 3);
    }

    public static void square(int[] iArr, int i10, int[] iArr2, int i11) {
        long j10 = iArr[i10] & 4294967295L;
        int i12 = 0;
        int i13 = 14;
        int i14 = 6;
        while (true) {
            int i15 = i14 - 1;
            long j11 = iArr[i10 + i14] & 4294967295L;
            long j12 = j11 * j11;
            iArr2[i11 + (i13 - 1)] = (i12 << 31) | ((int) (j12 >>> 33));
            i13 -= 2;
            iArr2[i11 + i13] = (int) (j12 >>> 1);
            i12 = (int) j12;
            if (i15 <= 0) {
                long j13 = j10 * j10;
                long j14 = (j13 >>> 33) | ((i12 << 31) & 4294967295L);
                iArr2[i11] = (int) j13;
                int i16 = ((int) (j13 >>> 32)) & 1;
                long j15 = iArr[i10 + 1] & 4294967295L;
                long j16 = j14 + (j15 * j10);
                int i17 = (int) j16;
                iArr2[i11 + 1] = (i17 << 1) | i16;
                int i18 = i17 >>> 31;
                long j17 = (iArr2[r12] & 4294967295L) + (j16 >>> 32);
                long j18 = iArr[i10 + 2] & 4294967295L;
                long j19 = j17 + (j18 * j10);
                int i19 = (int) j19;
                iArr2[i11 + 2] = (i19 << 1) | i18;
                long j20 = (iArr2[r15] & 4294967295L) + (j19 >>> 32) + (j18 * j15);
                long j21 = (iArr2[r18] & 4294967295L) + (j20 >>> 32);
                long j22 = iArr[i10 + 3] & 4294967295L;
                long j23 = (iArr2[r14] & 4294967295L) + (j21 >>> 32);
                long j24 = (iArr2[r7] & 4294967295L) + (j23 >>> 32);
                long j25 = j23 & 4294967295L;
                long j26 = (j20 & 4294967295L) + (j22 * j10);
                int i20 = (int) j26;
                iArr2[i11 + 3] = (i20 << 1) | (i19 >>> 31);
                int i21 = i20 >>> 31;
                long j27 = (j21 & 4294967295L) + (j26 >>> 32) + (j22 * j15);
                long j28 = j25 + (j27 >>> 32) + (j22 * j18);
                long j29 = j24 + (j28 >>> 32);
                long j30 = iArr[i10 + 4] & 4294967295L;
                long j31 = (iArr2[r2] & 4294967295L) + (j29 >>> 32);
                long j32 = (iArr2[r15] & 4294967295L) + (j31 >>> 32);
                long j33 = j31 & 4294967295L;
                long j34 = (j27 & 4294967295L) + (j30 * j10);
                int i22 = (int) j34;
                iArr2[i11 + 4] = (i22 << 1) | i21;
                int i23 = i22 >>> 31;
                long j35 = (j28 & 4294967295L) + (j34 >>> 32) + (j30 * j15);
                long j36 = (j29 & 4294967295L) + (j35 >>> 32) + (j30 * j18);
                long j37 = j35 & 4294967295L;
                long j38 = j33 + (j36 >>> 32) + (j30 * j22);
                long j39 = j32 + (j38 >>> 32);
                long j40 = iArr[i10 + 5] & 4294967295L;
                long j41 = (iArr2[r18] & 4294967295L) + (j39 >>> 32);
                long j42 = (iArr2[r24] & 4294967295L) + (j41 >>> 32);
                long j43 = j41 & 4294967295L;
                long j44 = j37 + (j40 * j10);
                int i24 = (int) j44;
                iArr2[i11 + 5] = (i24 << 1) | i23;
                int i25 = i24 >>> 31;
                long j45 = (j36 & 4294967295L) + (j44 >>> 32) + (j40 * j15);
                long j46 = (j38 & 4294967295L) + (j45 >>> 32) + (j40 * j18);
                long j47 = j45 & 4294967295L;
                long j48 = (j39 & 4294967295L) + (j46 >>> 32) + (j40 * j22);
                long j49 = j46 & 4294967295L;
                long j50 = j43 + (j48 >>> 32) + (j40 * j30);
                long j51 = j42 + (j50 >>> 32);
                long j52 = iArr[i10 + 6] & 4294967295L;
                long j53 = (iArr2[r14] & 4294967295L) + (j51 >>> 32);
                long j54 = (iArr2[r20] & 4294967295L) + (j53 >>> 32);
                long j55 = j53 & 4294967295L;
                long j56 = j47 + (j10 * j52);
                int i26 = (int) j56;
                iArr2[i11 + 6] = (i26 << 1) | i25;
                long j57 = j49 + (j56 >>> 32) + (j52 * j15);
                long j58 = (j48 & 4294967295L) + (j57 >>> 32) + (j52 * j18);
                long j59 = (j50 & 4294967295L) + (j58 >>> 32) + (j52 * j22);
                long j60 = (j51 & 4294967295L) + (j59 >>> 32) + (j52 * j30);
                long j61 = j55 + (j60 >>> 32) + (j52 * j40);
                long j62 = j54 + (j61 >>> 32);
                int i27 = (int) j57;
                iArr2[i11 + 7] = (i26 >>> 31) | (i27 << 1);
                int i28 = i27 >>> 31;
                int i29 = (int) j58;
                iArr2[i11 + 8] = i28 | (i29 << 1);
                int i30 = (int) j59;
                iArr2[i11 + 9] = (i30 << 1) | (i29 >>> 31);
                int i31 = (int) j60;
                iArr2[i11 + 10] = (i30 >>> 31) | (i31 << 1);
                int i32 = i31 >>> 31;
                int i33 = (int) j61;
                iArr2[i11 + 11] = i32 | (i33 << 1);
                int i34 = i33 >>> 31;
                int i35 = (int) j62;
                iArr2[i11 + 12] = i34 | (i35 << 1);
                int i36 = i35 >>> 31;
                int i37 = i11 + 13;
                iArr2[i37] = i36 | ((iArr2[i37] + ((int) (j62 >>> 32))) << 1);
                return;
            }
            i14 = i15;
        }
    }

    public static int sub(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j10 = (iArr[i10] & 4294967295L) - (iArr2[i11] & 4294967295L);
        iArr3[i12] = (int) j10;
        long j11 = (j10 >> 32) + ((iArr[i10 + 1] & 4294967295L) - (iArr2[i11 + 1] & 4294967295L));
        iArr3[i12 + 1] = (int) j11;
        long j12 = (j11 >> 32) + ((iArr[i10 + 2] & 4294967295L) - (iArr2[i11 + 2] & 4294967295L));
        iArr3[i12 + 2] = (int) j12;
        long j13 = (j12 >> 32) + ((iArr[i10 + 3] & 4294967295L) - (iArr2[i11 + 3] & 4294967295L));
        iArr3[i12 + 3] = (int) j13;
        long j14 = (j13 >> 32) + ((iArr[i10 + 4] & 4294967295L) - (iArr2[i11 + 4] & 4294967295L));
        iArr3[i12 + 4] = (int) j14;
        long j15 = (j14 >> 32) + ((iArr[i10 + 5] & 4294967295L) - (iArr2[i11 + 5] & 4294967295L));
        iArr3[i12 + 5] = (int) j15;
        long j16 = (j15 >> 32) + ((iArr[i10 + 6] & 4294967295L) - (iArr2[i11 + 6] & 4294967295L));
        iArr3[i12 + 6] = (int) j16;
        return (int) (j16 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = ((iArr3[0] & 4294967295L) - (iArr[0] & 4294967295L)) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j10;
        long j11 = (j10 >> 32) + (((iArr3[1] & 4294967295L) - (iArr[1] & 4294967295L)) - (iArr2[1] & 4294967295L));
        iArr3[1] = (int) j11;
        long j12 = (j11 >> 32) + (((iArr3[2] & 4294967295L) - (iArr[2] & 4294967295L)) - (iArr2[2] & 4294967295L));
        iArr3[2] = (int) j12;
        long j13 = (j12 >> 32) + (((iArr3[3] & 4294967295L) - (iArr[3] & 4294967295L)) - (iArr2[3] & 4294967295L));
        iArr3[3] = (int) j13;
        long j14 = (j13 >> 32) + (((iArr3[4] & 4294967295L) - (iArr[4] & 4294967295L)) - (iArr2[4] & 4294967295L));
        iArr3[4] = (int) j14;
        long j15 = (j14 >> 32) + (((iArr3[5] & 4294967295L) - (iArr[5] & 4294967295L)) - (iArr2[5] & 4294967295L));
        iArr3[5] = (int) j15;
        long j16 = (j15 >> 32) + (((iArr3[6] & 4294967295L) - (iArr[6] & 4294967295L)) - (iArr2[6] & 4294967295L));
        iArr3[6] = (int) j16;
        return (int) (j16 >> 32);
    }

    public static int subFrom(int[] iArr, int i10, int[] iArr2, int i11) {
        long j10 = (iArr2[i11] & 4294967295L) - (iArr[i10] & 4294967295L);
        iArr2[i11] = (int) j10;
        long j11 = (j10 >> 32) + ((iArr2[r5] & 4294967295L) - (iArr[i10 + 1] & 4294967295L));
        iArr2[i11 + 1] = (int) j11;
        long j12 = (j11 >> 32) + ((iArr2[r5] & 4294967295L) - (iArr[i10 + 2] & 4294967295L));
        iArr2[i11 + 2] = (int) j12;
        long j13 = (j12 >> 32) + ((iArr2[r5] & 4294967295L) - (iArr[i10 + 3] & 4294967295L));
        iArr2[i11 + 3] = (int) j13;
        long j14 = (j13 >> 32) + ((iArr2[r5] & 4294967295L) - (iArr[i10 + 4] & 4294967295L));
        iArr2[i11 + 4] = (int) j14;
        long j15 = (j14 >> 32) + ((iArr2[r5] & 4294967295L) - (iArr[i10 + 5] & 4294967295L));
        iArr2[i11 + 5] = (int) j15;
        long j16 = (j15 >> 32) + ((iArr2[r13] & 4294967295L) - (iArr[i10 + 6] & 4294967295L));
        iArr2[i11 + 6] = (int) j16;
        return (int) (j16 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[28];
        for (int i10 = 0; i10 < 7; i10++) {
            int i11 = iArr[i10];
            if (i11 != 0) {
                Pack.intToBigEndian(i11, bArr, (6 - i10) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
    }

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j10;
        long j11 = (j10 >>> 32) + (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L);
        iArr3[1] = (int) j11;
        long j12 = (j11 >>> 32) + (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L);
        iArr3[2] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L);
        iArr3[3] = (int) j13;
        long j14 = (j13 >>> 32) + (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L);
        iArr3[4] = (int) j14;
        long j15 = (j14 >>> 32) + (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L);
        iArr3[5] = (int) j15;
        long j16 = (j15 >>> 32) + (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L);
        iArr3[6] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (iArr3[0] & 4294967295L);
        iArr3[0] = (int) j10;
        long j11 = (j10 >>> 32) + (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (iArr3[1] & 4294967295L);
        iArr3[1] = (int) j11;
        long j12 = (j11 >>> 32) + (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (iArr3[2] & 4294967295L);
        iArr3[2] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (iArr3[3] & 4294967295L);
        iArr3[3] = (int) j13;
        long j14 = (j13 >>> 32) + (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (iArr3[4] & 4294967295L);
        iArr3[4] = (int) j14;
        long j15 = (j14 >>> 32) + (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (iArr3[5] & 4294967295L);
        iArr3[5] = (int) j15;
        long j16 = (j15 >>> 32) + (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (iArr3[6] & 4294967295L);
        iArr3[6] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j10 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr2[0] = (int) j10;
        long j11 = (j10 >>> 32) + (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L);
        iArr2[1] = (int) j11;
        long j12 = (j11 >>> 32) + (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L);
        iArr2[2] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L);
        iArr2[3] = (int) j13;
        long j14 = (j13 >>> 32) + (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L);
        iArr2[4] = (int) j14;
        long j15 = (j14 >>> 32) + (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L);
        iArr2[5] = (int) j15;
        long j16 = (j15 >>> 32) + (iArr[6] & 4294967295L) + (4294967295L & iArr2[6]);
        iArr2[6] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
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

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = iArr2[0] & 4294967295L;
        long j11 = iArr2[1] & 4294967295L;
        long j12 = iArr2[2] & 4294967295L;
        long j13 = iArr2[3] & 4294967295L;
        long j14 = iArr2[4] & 4294967295L;
        long j15 = iArr2[5] & 4294967295L;
        long j16 = iArr2[6] & 4294967295L;
        long j17 = iArr[0] & 4294967295L;
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
            long j25 = iArr[i10] & 4294967295L;
            long j26 = (j25 * j10) + (iArr3[i10] & 4294967295L);
            iArr3[i10] = (int) j26;
            int i12 = i10 + 1;
            long j27 = j14;
            long j28 = (j26 >>> 32) + (j25 * j11) + (iArr3[i12] & 4294967295L);
            iArr3[i12] = (int) j28;
            long j29 = (j28 >>> 32) + (j25 * j12) + (iArr3[r7] & 4294967295L);
            iArr3[i10 + 2] = (int) j29;
            long j30 = (j29 >>> 32) + (j25 * j13) + (iArr3[r7] & 4294967295L);
            iArr3[i10 + 3] = (int) j30;
            long j31 = (j30 >>> 32) + (j25 * j27) + (iArr3[r7] & 4294967295L);
            iArr3[i10 + 4] = (int) j31;
            long j32 = (j31 >>> 32) + (j25 * j15) + (iArr3[r7] & 4294967295L);
            iArr3[i10 + 5] = (int) j32;
            long j33 = (j32 >>> 32) + (j25 * j16) + (iArr3[r7] & 4294967295L);
            iArr3[i10 + 6] = (int) j33;
            iArr3[i10 + 7] = (int) (j33 >>> 32);
            i10 = i12;
            j14 = j27;
        }
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = iArr2[0] & 4294967295L;
        long j11 = iArr2[1] & 4294967295L;
        long j12 = iArr2[2] & 4294967295L;
        long j13 = iArr2[3] & 4294967295L;
        long j14 = iArr2[4] & 4294967295L;
        long j15 = iArr2[5] & 4294967295L;
        long j16 = iArr2[6] & 4294967295L;
        long j17 = 0;
        int i10 = 0;
        while (i10 < 7) {
            long j18 = j16;
            long j19 = iArr[i10] & 4294967295L;
            long j20 = (iArr3[i10] & 4294967295L) + (j19 * j10);
            iArr3[i10] = (int) j20;
            int i11 = i10 + 1;
            long j21 = (j20 >>> 32) + (j19 * j11) + (iArr3[i11] & 4294967295L);
            iArr3[i11] = (int) j21;
            long j22 = (j21 >>> 32) + (j19 * j12) + (iArr3[r15] & 4294967295L);
            int i12 = i10;
            iArr3[i10 + 2] = (int) j22;
            long j23 = (j22 >>> 32) + (j19 * j13) + (iArr3[r2] & 4294967295L);
            iArr3[i12 + 3] = (int) j23;
            long j24 = (j23 >>> 32) + (j19 * j14) + (iArr3[r2] & 4294967295L);
            iArr3[i12 + 4] = (int) j24;
            long j25 = (j24 >>> 32) + (j19 * j15) + (iArr3[r2] & 4294967295L);
            iArr3[i12 + 5] = (int) j25;
            long j26 = (j25 >>> 32) + (j19 * j18) + (iArr3[r2] & 4294967295L);
            iArr3[i12 + 6] = (int) j26;
            long j27 = j17 + (j26 >>> 32) + (iArr3[r2] & 4294967295L);
            iArr3[i12 + 7] = (int) j27;
            j17 = j27 >>> 32;
            i10 = i11;
            j16 = j18;
        }
        return (int) j17;
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j10 = iArr[0] & 4294967295L;
        int i10 = 14;
        int i11 = 0;
        int i12 = 6;
        while (true) {
            int i13 = i12 - 1;
            long j11 = iArr[i12] & 4294967295L;
            long j12 = j11 * j11;
            iArr2[i10 - 1] = (i11 << 31) | ((int) (j12 >>> 33));
            i10 -= 2;
            iArr2[i10] = (int) (j12 >>> 1);
            i11 = (int) j12;
            if (i13 <= 0) {
                long j13 = j10 * j10;
                long j14 = (j13 >>> 33) | ((i11 << 31) & 4294967295L);
                iArr2[0] = (int) j13;
                long j15 = iArr[1] & 4294967295L;
                long j16 = j14 + (j15 * j10);
                int i14 = (int) j16;
                iArr2[1] = (i14 << 1) | (((int) (j13 >>> 32)) & 1);
                long j17 = (iArr2[2] & 4294967295L) + (j16 >>> 32);
                long j18 = iArr[2] & 4294967295L;
                long j19 = j17 + (j18 * j10);
                int i15 = (int) j19;
                iArr2[2] = (i15 << 1) | (i14 >>> 31);
                long j20 = (iArr2[3] & 4294967295L) + (j19 >>> 32) + (j18 * j15);
                long j21 = (iArr2[4] & 4294967295L) + (j20 >>> 32);
                long j22 = iArr[3] & 4294967295L;
                long j23 = (iArr2[5] & 4294967295L) + (j21 >>> 32);
                long j24 = (iArr2[6] & 4294967295L) + (j23 >>> 32);
                long j25 = (j20 & 4294967295L) + (j22 * j10);
                int i16 = (int) j25;
                iArr2[3] = (i16 << 1) | (i15 >>> 31);
                int i17 = i16 >>> 31;
                long j26 = (j21 & 4294967295L) + (j25 >>> 32) + (j22 * j15);
                long j27 = (j23 & 4294967295L) + (j26 >>> 32) + (j22 * j18);
                long j28 = j26 & 4294967295L;
                long j29 = j24 + (j27 >>> 32);
                long j30 = j27 & 4294967295L;
                long j31 = iArr[4] & 4294967295L;
                long j32 = (iArr2[7] & 4294967295L) + (j29 >>> 32);
                long j33 = (iArr2[8] & 4294967295L) + (j32 >>> 32);
                long j34 = j28 + (j31 * j10);
                int i18 = (int) j34;
                iArr2[4] = (i18 << 1) | i17;
                int i19 = i18 >>> 31;
                long j35 = j30 + (j34 >>> 32) + (j31 * j15);
                long j36 = (j29 & 4294967295L) + (j35 >>> 32) + (j31 * j18);
                long j37 = j35 & 4294967295L;
                long j38 = (j32 & 4294967295L) + (j36 >>> 32) + (j31 * j22);
                long j39 = j36 & 4294967295L;
                long j40 = j33 + (j38 >>> 32);
                long j41 = iArr[5] & 4294967295L;
                long j42 = (iArr2[9] & 4294967295L) + (j40 >>> 32);
                long j43 = j37 + (j41 * j10);
                int i20 = (int) j43;
                iArr2[5] = (i20 << 1) | i19;
                int i21 = i20 >>> 31;
                long j44 = j39 + (j43 >>> 32) + (j41 * j15);
                long j45 = (j38 & 4294967295L) + (j44 >>> 32) + (j41 * j18);
                long j46 = j44 & 4294967295L;
                long j47 = (j40 & 4294967295L) + (j45 >>> 32) + (j41 * j22);
                long j48 = j45 & 4294967295L;
                long j49 = (j42 & 4294967295L) + (j47 >>> 32) + (j41 * j31);
                long j50 = j47 & 4294967295L;
                long j51 = (iArr2[10] & 4294967295L) + (j42 >>> 32) + (j49 >>> 32);
                long j52 = j49 & 4294967295L;
                long j53 = iArr[6] & 4294967295L;
                long j54 = (iArr2[11] & 4294967295L) + (j51 >>> 32);
                long j55 = j51 & 4294967295L;
                long j56 = j46 + (j10 * j53);
                int i22 = (int) j56;
                iArr2[6] = (i22 << 1) | i21;
                int i23 = i22 >>> 31;
                long j57 = j48 + (j56 >>> 32) + (j15 * j53);
                long j58 = j50 + (j57 >>> 32) + (j18 * j53);
                long j59 = j52 + (j58 >>> 32) + (j53 * j22);
                long j60 = j55 + (j59 >>> 32) + (j53 * j31);
                long j61 = (j54 & 4294967295L) + (j60 >>> 32) + (j53 * j41);
                long j62 = (iArr2[12] & 4294967295L) + (j54 >>> 32) + (j61 >>> 32);
                int i24 = (int) j57;
                iArr2[7] = i23 | (i24 << 1);
                int i25 = i24 >>> 31;
                int i26 = (int) j58;
                iArr2[8] = i25 | (i26 << 1);
                int i27 = i26 >>> 31;
                int i28 = (int) j59;
                iArr2[9] = i27 | (i28 << 1);
                int i29 = (int) j60;
                iArr2[10] = (i28 >>> 31) | (i29 << 1);
                int i30 = i29 >>> 31;
                int i31 = (int) j61;
                iArr2[11] = i30 | (i31 << 1);
                int i32 = i31 >>> 31;
                int i33 = (int) j62;
                iArr2[12] = i32 | (i33 << 1);
                iArr2[13] = ((iArr2[13] + ((int) (j62 >>> 32))) << 1) | (i33 >>> 31);
                return;
            }
            i12 = i13;
        }
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j10;
        long j11 = (j10 >> 32) + ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L));
        iArr3[1] = (int) j11;
        long j12 = (j11 >> 32) + ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L));
        iArr3[2] = (int) j12;
        long j13 = (j12 >> 32) + ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L));
        iArr3[3] = (int) j13;
        long j14 = (j13 >> 32) + ((iArr[4] & 4294967295L) - (iArr2[4] & 4294967295L));
        iArr3[4] = (int) j14;
        long j15 = (j14 >> 32) + ((iArr[5] & 4294967295L) - (iArr2[5] & 4294967295L));
        iArr3[5] = (int) j15;
        long j16 = (j15 >> 32) + ((iArr[6] & 4294967295L) - (iArr2[6] & 4294967295L));
        iArr3[6] = (int) j16;
        return (int) (j16 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j10 = (iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L);
        iArr2[0] = (int) j10;
        long j11 = (j10 >> 32) + ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L));
        iArr2[1] = (int) j11;
        long j12 = (j11 >> 32) + ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L));
        iArr2[2] = (int) j12;
        long j13 = (j12 >> 32) + ((iArr2[3] & 4294967295L) - (iArr[3] & 4294967295L));
        iArr2[3] = (int) j13;
        long j14 = (j13 >> 32) + ((iArr2[4] & 4294967295L) - (iArr[4] & 4294967295L));
        iArr2[4] = (int) j14;
        long j15 = (j14 >> 32) + ((iArr2[5] & 4294967295L) - (iArr[5] & 4294967295L));
        iArr2[5] = (int) j15;
        long j16 = (j15 >> 32) + ((iArr2[6] & 4294967295L) - (4294967295L & iArr[6]));
        iArr2[6] = (int) j16;
        return (int) (j16 >> 32);
    }
}
