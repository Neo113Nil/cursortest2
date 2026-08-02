package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.util.Pack;

/* loaded from: classes5.dex */
public abstract class Nat256 {

    /* renamed from: M, reason: collision with root package name */
    private static final long f62016M = 4294967295L;

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
        long j17 = (j16 >>> 32) + (iArr[i10 + 7] & 4294967295L) + (iArr2[i11 + 7] & 4294967295L);
        iArr3[i12 + 7] = (int) j17;
        return (int) (j17 >>> 32);
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
        long j16 = (j15 >>> 32) + (iArr[i10 + 6] & 4294967295L) + (iArr2[i11 + 6] & 4294967295L) + (iArr3[r7] & 4294967295L);
        iArr3[i12 + 6] = (int) j16;
        long j17 = (j16 >>> 32) + (iArr[i10 + 7] & 4294967295L) + (iArr2[i11 + 7] & 4294967295L) + (iArr3[r15] & 4294967295L);
        iArr3[i12 + 7] = (int) j17;
        return (int) (j17 >>> 32);
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
        long j16 = (j15 >>> 32) + (iArr[i10 + 6] & 4294967295L) + (iArr2[r6] & 4294967295L);
        iArr2[i11 + 6] = (int) j16;
        long j17 = (j16 >>> 32) + (iArr[i10 + 7] & 4294967295L) + (4294967295L & iArr2[r12]);
        iArr2[i11 + 7] = (int) j17;
        return (int) (j17 >>> 32);
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
        long j16 = (j15 >>> 32) + (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L);
        int i18 = (int) j16;
        iArr[i10 + 6] = i18;
        iArr2[i11 + 6] = i18;
        long j17 = (j16 >>> 32) + (iArr[r12] & 4294967295L) + (4294967295L & iArr2[r14]);
        int i19 = (int) j17;
        iArr[i10 + 7] = i19;
        iArr2[i11 + 7] = i19;
        return (int) (j17 >>> 32);
    }

    public static void copy(int[] iArr, int i10, int[] iArr2, int i11) {
        iArr2[i11] = iArr[i10];
        iArr2[i11 + 1] = iArr[i10 + 1];
        iArr2[i11 + 2] = iArr[i10 + 2];
        iArr2[i11 + 3] = iArr[i10 + 3];
        iArr2[i11 + 4] = iArr[i10 + 4];
        iArr2[i11 + 5] = iArr[i10 + 5];
        iArr2[i11 + 6] = iArr[i10 + 6];
        iArr2[i11 + 7] = iArr[i10 + 7];
    }

    public static void copy64(long[] jArr, int i10, long[] jArr2, int i11) {
        jArr2[i11] = jArr[i10];
        jArr2[i11 + 1] = jArr[i10 + 1];
        jArr2[i11 + 2] = jArr[i10 + 2];
        jArr2[i11 + 3] = jArr[i10 + 3];
    }

    public static int[] create() {
        return new int[8];
    }

    public static long[] create64() {
        return new long[4];
    }

    public static int[] createExt() {
        return new int[16];
    }

    public static long[] createExt64() {
        return new long[8];
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
        for (int i10 = 7; i10 >= 0; i10--) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i10 = 3; i10 >= 0; i10--) {
            if (jArr[i10] != jArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        int[] create = create();
        for (int i10 = 0; i10 < 8; i10++) {
            create[i10] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return create;
    }

    public static long[] fromBigInteger64(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        long[] create64 = create64();
        for (int i10 = 0; i10 < 4; i10++) {
            create64[i10] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
        }
        return create64;
    }

    public static int getBit(int[] iArr, int i10) {
        int i11;
        if (i10 == 0) {
            i11 = iArr[0];
        } else {
            if ((i10 & 255) != i10) {
                return 0;
            }
            i11 = iArr[i10 >>> 5] >>> (i10 & 31);
        }
        return i11 & 1;
    }

    public static boolean gte(int[] iArr, int i10, int[] iArr2, int i11) {
        for (int i12 = 7; i12 >= 0; i12--) {
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
        for (int i10 = 1; i10 < 8; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOne64(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i10 = 1; i10 < 4; i10++) {
            if (jArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i10 = 0; i10 < 8; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i10 = 0; i10 < 4; i10++) {
            if (jArr[i10] != 0) {
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
        long j17 = iArr2[i11 + 7] & 4294967295L;
        long j18 = iArr[i10] & 4294967295L;
        long j19 = j18 * j10;
        iArr3[i12] = (int) j19;
        long j20 = (j19 >>> 32) + (j18 * j11);
        iArr3[i12 + 1] = (int) j20;
        long j21 = (j20 >>> 32) + (j18 * j12);
        iArr3[i12 + 2] = (int) j21;
        long j22 = (j21 >>> 32) + (j18 * j13);
        iArr3[i12 + 3] = (int) j22;
        long j23 = (j22 >>> 32) + (j18 * j14);
        iArr3[i12 + 4] = (int) j23;
        long j24 = (j23 >>> 32) + (j18 * j15);
        iArr3[i12 + 5] = (int) j24;
        long j25 = (j24 >>> 32) + (j18 * j16);
        iArr3[i12 + 6] = (int) j25;
        long j26 = (j25 >>> 32) + (j18 * j17);
        iArr3[i12 + 7] = (int) j26;
        iArr3[i12 + 8] = (int) (j26 >>> 32);
        int i13 = 1;
        int i14 = i12;
        while (i13 < 8) {
            int i15 = i14 + 1;
            int i16 = i14;
            long j27 = iArr[i10 + i13] & 4294967295L;
            long j28 = (j27 * j10) + (iArr3[i15] & 4294967295L);
            iArr3[i15] = (int) j28;
            long j29 = (j28 >>> 32) + (j27 * j11) + (iArr3[r3] & 4294967295L);
            iArr3[i16 + 2] = (int) j29;
            long j30 = (j29 >>> 32) + (j27 * j12) + (iArr3[r24] & 4294967295L);
            iArr3[i16 + 3] = (int) j30;
            long j31 = (j30 >>> 32) + (j27 * j13) + (iArr3[r24] & 4294967295L);
            iArr3[i16 + 4] = (int) j31;
            long j32 = (j31 >>> 32) + (j27 * j14) + (iArr3[r24] & 4294967295L);
            iArr3[i16 + 5] = (int) j32;
            long j33 = (j32 >>> 32) + (j27 * j15) + (iArr3[r24] & 4294967295L);
            iArr3[i16 + 6] = (int) j33;
            long j34 = (j33 >>> 32) + (j27 * j16) + (iArr3[r24] & 4294967295L);
            iArr3[i16 + 7] = (int) j34;
            long j35 = (j34 >>> 32) + (j27 * j17) + (iArr3[r24] & 4294967295L);
            iArr3[i16 + 8] = (int) j35;
            iArr3[i16 + 9] = (int) (j35 >>> 32);
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
        long j25 = (j23 >>> 32) + (j10 * j24) + j22 + (iArr2[i12 + 6] & 4294967295L);
        iArr3[i13 + 6] = (int) j25;
        long j26 = iArr[i11 + 7] & 4294967295L;
        long j27 = (j25 >>> 32) + (j10 * j26) + j24 + (4294967295L & iArr2[i12 + 7]);
        iArr3[i13 + 7] = (int) j27;
        return (j27 >>> 32) + j26;
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
        return Nat.incAt(8, iArr, i11, 4);
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
        return Nat.incAt(8, iArr, i12, 3);
    }

    public static int mulAddTo(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j10 = iArr2[i11] & 4294967295L;
        long j11 = iArr2[i11 + 1] & 4294967295L;
        long j12 = iArr2[i11 + 2] & 4294967295L;
        long j13 = iArr2[i11 + 3] & 4294967295L;
        long j14 = iArr2[i11 + 4] & 4294967295L;
        long j15 = iArr2[i11 + 5] & 4294967295L;
        long j16 = iArr2[i11 + 6] & 4294967295L;
        long j17 = iArr2[i11 + 7] & 4294967295L;
        int i13 = i12;
        int i14 = 0;
        long j18 = 0;
        while (i14 < 8) {
            long j19 = j11;
            long j20 = iArr[i10 + i14] & 4294967295L;
            long j21 = (j20 * j10) + (iArr3[i13] & 4294967295L);
            iArr3[i13] = (int) j21;
            int i15 = i13 + 1;
            long j22 = (j21 >>> 32) + (j20 * j19) + (iArr3[i15] & 4294967295L);
            iArr3[i15] = (int) j22;
            int i16 = i14;
            long j23 = (j22 >>> 32) + (j20 * j12) + (iArr3[r5] & 4294967295L);
            iArr3[i13 + 2] = (int) j23;
            long j24 = (j23 >>> 32) + (j20 * j13) + (iArr3[r0] & 4294967295L);
            iArr3[i13 + 3] = (int) j24;
            long j25 = (j24 >>> 32) + (j20 * j14) + (iArr3[r0] & 4294967295L);
            iArr3[i13 + 4] = (int) j25;
            long j26 = (j25 >>> 32) + (j20 * j15) + (iArr3[r0] & 4294967295L);
            iArr3[i13 + 5] = (int) j26;
            long j27 = (j26 >>> 32) + (j20 * j16) + (iArr3[r0] & 4294967295L);
            iArr3[i13 + 6] = (int) j27;
            long j28 = (j27 >>> 32) + (j20 * j17) + (iArr3[r0] & 4294967295L);
            iArr3[i13 + 7] = (int) j28;
            long j29 = j18 + (j28 >>> 32) + (iArr3[r16] & 4294967295L);
            iArr3[i13 + 8] = (int) j29;
            j18 = j29 >>> 32;
            i14 = i16 + 1;
            j11 = j19;
            i13 = i15;
        }
        return (int) j18;
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
        long j17 = (j16 >>> 32) + ((iArr[6] & 4294967295L) * j10);
        iArr[6] = (int) j17;
        long j18 = (j17 >>> 32) + (j10 * (4294967295L & iArr[7]));
        iArr[7] = (int) j18;
        return (int) (j18 >>> 32);
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
        long j17 = (j16 >>> 32) + ((iArr2[6] & 4294967295L) * j10) + (iArr[6] & 4294967295L);
        iArr2[6] = (int) j17;
        long j18 = (j17 >>> 32) + (j10 * (iArr2[7] & 4294967295L)) + (4294967295L & iArr[7]);
        iArr2[7] = (int) j18;
        return (int) (j18 >>> 32);
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
        } while (i12 < 8);
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
        long j17 = (j16 >>> 32) + ((iArr[i11 + 6] & 4294967295L) * j10) + (iArr2[r8] & 4294967295L);
        iArr2[i12 + 6] = (int) j17;
        long j18 = (j17 >>> 32) + (j10 * (iArr[i11 + 7] & 4294967295L)) + (iArr2[r15] & 4294967295L);
        iArr2[i12 + 7] = (int) j18;
        return (int) (j18 >>> 32);
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
        return Nat.incAt(8, iArr, i11, 3);
    }

    public static void square(int[] iArr, int i10, int[] iArr2, int i11) {
        long j10 = iArr[i10] & 4294967295L;
        int i12 = 0;
        int i13 = 16;
        int i14 = 7;
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
                long j54 = (iArr2[r26] & 4294967295L) + (j53 >>> 32);
                long j55 = j53 & 4294967295L;
                long j56 = j47 + (j52 * j10);
                int i26 = (int) j56;
                iArr2[i11 + 6] = (i26 << 1) | i25;
                int i27 = i26 >>> 31;
                long j57 = j49 + (j56 >>> 32) + (j52 * j15);
                long j58 = (j48 & 4294967295L) + (j57 >>> 32) + (j52 * j18);
                long j59 = j57 & 4294967295L;
                long j60 = (j50 & 4294967295L) + (j58 >>> 32) + (j52 * j22);
                long j61 = j58 & 4294967295L;
                long j62 = (j51 & 4294967295L) + (j60 >>> 32) + (j52 * j30);
                long j63 = j60 & 4294967295L;
                long j64 = j55 + (j62 >>> 32) + (j52 * j40);
                long j65 = j54 + (j64 >>> 32);
                long j66 = iArr[i10 + 7] & 4294967295L;
                long j67 = (iArr2[r7] & 4294967295L) + (j65 >>> 32);
                long j68 = (iArr2[r20] & 4294967295L) + (j67 >>> 32);
                long j69 = j67 & 4294967295L;
                long j70 = j59 + (j10 * j66);
                int i28 = (int) j70;
                iArr2[i11 + 7] = (i28 << 1) | i27;
                long j71 = j61 + (j70 >>> 32) + (j15 * j66);
                long j72 = j63 + (j71 >>> 32) + (j66 * j18);
                long j73 = (j62 & 4294967295L) + (j72 >>> 32) + (j66 * j22);
                long j74 = (j64 & 4294967295L) + (j73 >>> 32) + (j66 * j30);
                long j75 = (j65 & 4294967295L) + (j74 >>> 32) + (j66 * j40);
                long j76 = j69 + (j75 >>> 32) + (j66 * j52);
                long j77 = j68 + (j76 >>> 32);
                int i29 = (int) j71;
                iArr2[i11 + 8] = (i28 >>> 31) | (i29 << 1);
                int i30 = i29 >>> 31;
                int i31 = (int) j72;
                iArr2[i11 + 9] = i30 | (i31 << 1);
                int i32 = (int) j73;
                iArr2[i11 + 10] = (i32 << 1) | (i31 >>> 31);
                int i33 = (int) j74;
                iArr2[i11 + 11] = (i32 >>> 31) | (i33 << 1);
                int i34 = i33 >>> 31;
                int i35 = (int) j75;
                iArr2[i11 + 12] = i34 | (i35 << 1);
                int i36 = i35 >>> 31;
                int i37 = (int) j76;
                iArr2[i11 + 13] = i36 | (i37 << 1);
                int i38 = i37 >>> 31;
                int i39 = (int) j77;
                iArr2[i11 + 14] = i38 | (i39 << 1);
                int i40 = i39 >>> 31;
                int i41 = i11 + 15;
                iArr2[i41] = i40 | ((iArr2[i41] + ((int) (j77 >>> 32))) << 1);
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
        long j17 = (j16 >> 32) + ((iArr[i10 + 7] & 4294967295L) - (iArr2[i11 + 7] & 4294967295L));
        iArr3[i12 + 7] = (int) j17;
        return (int) (j17 >> 32);
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
        long j17 = (j16 >> 32) + (((iArr3[7] & 4294967295L) - (iArr[7] & 4294967295L)) - (iArr2[7] & 4294967295L));
        iArr3[7] = (int) j17;
        return (int) (j17 >> 32);
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
        long j16 = (j15 >> 32) + ((iArr2[r5] & 4294967295L) - (iArr[i10 + 6] & 4294967295L));
        iArr2[i11 + 6] = (int) j16;
        long j17 = (j16 >> 32) + ((iArr2[r13] & 4294967295L) - (iArr[i10 + 7] & 4294967295L));
        iArr2[i11 + 7] = (int) j17;
        return (int) (j17 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i10 = 0; i10 < 8; i10++) {
            int i11 = iArr[i10];
            if (i11 != 0) {
                Pack.intToBigEndian(i11, bArr, (7 - i10) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i10 = 0; i10 < 4; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                Pack.longToBigEndian(j10, bArr, (3 - i10) << 3);
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
        iArr[7] = 0;
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
        long j17 = (j16 >>> 32) + (iArr[7] & 4294967295L) + (iArr2[7] & 4294967295L);
        iArr3[7] = (int) j17;
        return (int) (j17 >>> 32);
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
        long j17 = (j16 >>> 32) + (iArr[7] & 4294967295L) + (iArr2[7] & 4294967295L) + (iArr3[7] & 4294967295L);
        iArr3[7] = (int) j17;
        return (int) (j17 >>> 32);
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
        long j16 = (j15 >>> 32) + (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L);
        iArr2[6] = (int) j16;
        long j17 = (j16 >>> 32) + (iArr[7] & 4294967295L) + (4294967295L & iArr2[7]);
        iArr2[7] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
        iArr2[7] = iArr[7];
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i10 = 7; i10 >= 0; i10--) {
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
        long j17 = iArr2[7] & 4294967295L;
        long j18 = iArr[0] & 4294967295L;
        long j19 = j18 * j10;
        iArr3[0] = (int) j19;
        long j20 = (j19 >>> 32) + (j18 * j11);
        iArr3[1] = (int) j20;
        long j21 = (j20 >>> 32) + (j18 * j12);
        iArr3[2] = (int) j21;
        long j22 = (j21 >>> 32) + (j18 * j13);
        iArr3[3] = (int) j22;
        long j23 = (j22 >>> 32) + (j18 * j14);
        iArr3[4] = (int) j23;
        long j24 = (j23 >>> 32) + (j18 * j15);
        iArr3[5] = (int) j24;
        long j25 = (j24 >>> 32) + (j18 * j16);
        iArr3[6] = (int) j25;
        long j26 = (j25 >>> 32) + (j18 * j17);
        iArr3[7] = (int) j26;
        iArr3[8] = (int) (j26 >>> 32);
        int i10 = 1;
        for (int i11 = 8; i10 < i11; i11 = 8) {
            long j27 = iArr[i10] & 4294967295L;
            long j28 = j14;
            long j29 = (j27 * j10) + (iArr3[i10] & 4294967295L);
            iArr3[i10] = (int) j29;
            int i12 = i10 + 1;
            long j30 = (j29 >>> 32) + (j27 * j11) + (iArr3[i12] & 4294967295L);
            iArr3[i12] = (int) j30;
            long j31 = (j30 >>> 32) + (j27 * j12) + (iArr3[r25] & 4294967295L);
            iArr3[i10 + 2] = (int) j31;
            long j32 = (j31 >>> 32) + (j27 * j13) + (iArr3[r25] & 4294967295L);
            iArr3[i10 + 3] = (int) j32;
            long j33 = (j32 >>> 32) + (j27 * j28) + (iArr3[r25] & 4294967295L);
            iArr3[i10 + 4] = (int) j33;
            long j34 = (j33 >>> 32) + (j27 * j15) + (iArr3[r25] & 4294967295L);
            iArr3[i10 + 5] = (int) j34;
            long j35 = (j34 >>> 32) + (j27 * j16) + (iArr3[r25] & 4294967295L);
            iArr3[i10 + 6] = (int) j35;
            long j36 = (j35 >>> 32) + (j27 * j17) + (iArr3[r14] & 4294967295L);
            iArr3[i10 + 7] = (int) j36;
            iArr3[i10 + 8] = (int) (j36 >>> 32);
            i10 = i12;
            j14 = j28;
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
        long j17 = iArr2[7] & 4294967295L;
        long j18 = 0;
        int i10 = 0;
        while (i10 < 8) {
            long j19 = iArr[i10] & 4294967295L;
            long j20 = (j19 * j10) + (iArr3[i10] & 4294967295L);
            int i11 = i10;
            iArr3[i11] = (int) j20;
            int i12 = i11 + 1;
            long j21 = (j20 >>> 32) + (j19 * j11) + (iArr3[i12] & 4294967295L);
            iArr3[i12] = (int) j21;
            long j22 = (j21 >>> 32) + (j19 * j12) + (iArr3[r4] & 4294967295L);
            iArr3[i11 + 2] = (int) j22;
            long j23 = (j22 >>> 32) + (j19 * j13) + (iArr3[r4] & 4294967295L);
            iArr3[i11 + 3] = (int) j23;
            long j24 = (j23 >>> 32) + (j19 * j14) + (iArr3[r4] & 4294967295L);
            iArr3[i11 + 4] = (int) j24;
            long j25 = (j24 >>> 32) + (j19 * j15) + (iArr3[r4] & 4294967295L);
            iArr3[i11 + 5] = (int) j25;
            long j26 = (j25 >>> 32) + (j19 * j16) + (iArr3[r4] & 4294967295L);
            iArr3[i11 + 6] = (int) j26;
            long j27 = (j26 >>> 32) + (j19 * j17) + (iArr3[r4] & 4294967295L);
            iArr3[i11 + 7] = (int) j27;
            long j28 = j18 + (j27 >>> 32) + (iArr3[r4] & 4294967295L);
            iArr3[i11 + 8] = (int) j28;
            j18 = j28 >>> 32;
            i10 = i12;
        }
        return (int) j18;
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j10 = iArr[0] & 4294967295L;
        int i10 = 16;
        int i11 = 0;
        int i12 = 7;
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
                long j41 = j38 & 4294967295L;
                long j42 = iArr[5] & 4294967295L;
                long j43 = (iArr2[9] & 4294967295L) + (j40 >>> 32);
                long j44 = j40 & 4294967295L;
                long j45 = j37 + (j42 * j10);
                int i20 = (int) j45;
                iArr2[5] = (i20 << 1) | i19;
                int i21 = i20 >>> 31;
                long j46 = j39 + (j45 >>> 32) + (j42 * j15);
                long j47 = j41 + (j46 >>> 32) + (j42 * j18);
                long j48 = j46 & 4294967295L;
                long j49 = j44 + (j47 >>> 32) + (j42 * j22);
                long j50 = j47 & 4294967295L;
                long j51 = (j43 & 4294967295L) + (j49 >>> 32) + (j42 * j31);
                long j52 = j49 & 4294967295L;
                long j53 = (iArr2[10] & 4294967295L) + (j43 >>> 32) + (j51 >>> 32);
                long j54 = j51 & 4294967295L;
                long j55 = iArr[6] & 4294967295L;
                long j56 = (iArr2[11] & 4294967295L) + (j53 >>> 32);
                long j57 = j53 & 4294967295L;
                long j58 = j48 + (j55 * j10);
                int i22 = (int) j58;
                iArr2[6] = (i22 << 1) | i21;
                int i23 = i22 >>> 31;
                long j59 = j50 + (j58 >>> 32) + (j55 * j15);
                long j60 = j52 + (j59 >>> 32) + (j55 * j18);
                long j61 = j59 & 4294967295L;
                long j62 = j54 + (j60 >>> 32) + (j55 * j22);
                long j63 = j60 & 4294967295L;
                long j64 = j57 + (j62 >>> 32) + (j55 * j31);
                long j65 = j62 & 4294967295L;
                long j66 = (j56 & 4294967295L) + (j64 >>> 32) + (j55 * j42);
                long j67 = j64 & 4294967295L;
                long j68 = (iArr2[12] & 4294967295L) + (j56 >>> 32) + (j66 >>> 32);
                long j69 = j66 & 4294967295L;
                long j70 = iArr[7] & 4294967295L;
                long j71 = (iArr2[13] & 4294967295L) + (j68 >>> 32);
                long j72 = j68 & 4294967295L;
                long j73 = j61 + (j10 * j70);
                int i24 = (int) j73;
                iArr2[7] = (i24 << 1) | i23;
                int i25 = i24 >>> 31;
                long j74 = j63 + (j73 >>> 32) + (j70 * j15);
                long j75 = j65 + (j74 >>> 32) + (j70 * j18);
                long j76 = j67 + (j75 >>> 32) + (j70 * j22);
                long j77 = j69 + (j76 >>> 32) + (j70 * j31);
                long j78 = j72 + (j77 >>> 32) + (j42 * j70);
                long j79 = (j71 & 4294967295L) + (j78 >>> 32) + (j70 * j55);
                long j80 = (iArr2[14] & 4294967295L) + (j71 >>> 32) + (j79 >>> 32);
                int i26 = (int) j74;
                iArr2[8] = i25 | (i26 << 1);
                int i27 = i26 >>> 31;
                int i28 = (int) j75;
                iArr2[9] = i27 | (i28 << 1);
                int i29 = (int) j76;
                iArr2[10] = (i28 >>> 31) | (i29 << 1);
                int i30 = i29 >>> 31;
                int i31 = (int) j77;
                iArr2[11] = i30 | (i31 << 1);
                int i32 = i31 >>> 31;
                int i33 = (int) j78;
                iArr2[12] = i32 | (i33 << 1);
                int i34 = i33 >>> 31;
                int i35 = (int) j79;
                iArr2[13] = i34 | (i35 << 1);
                int i36 = i35 >>> 31;
                int i37 = (int) j80;
                iArr2[14] = i36 | (i37 << 1);
                iArr2[15] = ((iArr2[15] + ((int) (j80 >>> 32))) << 1) | (i37 >>> 31);
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
        long j17 = (j16 >> 32) + ((iArr[7] & 4294967295L) - (iArr2[7] & 4294967295L));
        iArr3[7] = (int) j17;
        return (int) (j17 >> 32);
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
        long j16 = (j15 >> 32) + ((iArr2[6] & 4294967295L) - (iArr[6] & 4294967295L));
        iArr2[6] = (int) j16;
        long j17 = (j16 >> 32) + ((iArr2[7] & 4294967295L) - (4294967295L & iArr[7]));
        iArr2[7] = (int) j17;
        return (int) (j17 >> 32);
    }
}
