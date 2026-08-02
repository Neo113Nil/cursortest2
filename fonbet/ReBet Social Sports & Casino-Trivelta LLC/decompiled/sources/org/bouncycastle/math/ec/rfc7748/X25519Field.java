package org.bouncycastle.math.ec.rfc7748;

import kotlin.UByte;
import org.bouncycastle.math.raw.Mod;

/* loaded from: classes5.dex */
public abstract class X25519Field {
    private static final int M24 = 16777215;
    private static final int M25 = 33554431;
    private static final int M26 = 67108863;
    private static final int[] P32 = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    private static final int[] ROOT_NEG_ONE = {34513072, 59165138, 4688974, 3500415, 6194736, 33281959, 54535759, 32551604, 163342, 5703241};
    public static final int SIZE = 10;

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            iArr3[i10] = iArr[i10] + iArr2[i10];
        }
    }

    public static void addOne(int[] iArr) {
        iArr[0] = iArr[0] + 1;
    }

    public static void apm(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        for (int i10 = 0; i10 < 10; i10++) {
            int i11 = iArr[i10];
            int i12 = iArr2[i10];
            iArr3[i10] = i11 + i12;
            iArr4[i10] = i11 - i12;
        }
    }

    public static void carry(int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = iArr[8];
        int i19 = iArr[9];
        int i20 = i12 + (i11 >> 26);
        int i21 = i11 & M26;
        int i22 = i14 + (i13 >> 26);
        int i23 = i13 & M26;
        int i24 = i17 + (i16 >> 26);
        int i25 = i16 & M26;
        int i26 = i19 + (i18 >> 26);
        int i27 = i18 & M26;
        int i28 = i23 + (i20 >> 25);
        int i29 = i20 & M25;
        int i30 = i15 + (i22 >> 25);
        int i31 = i22 & M25;
        int i32 = i27 + (i24 >> 25);
        int i33 = i24 & M25;
        int i34 = i10 + ((i26 >> 25) * 38);
        int i35 = i26 & M25;
        int i36 = i21 + (i34 >> 26);
        int i37 = i34 & M26;
        int i38 = i25 + (i30 >> 26);
        int i39 = i30 & M26;
        int i40 = i29 + (i36 >> 26);
        int i41 = i36 & M26;
        int i42 = i31 + (i28 >> 26);
        int i43 = i28 & M26;
        int i44 = i33 + (i38 >> 26);
        int i45 = i38 & M26;
        int i46 = i35 + (i32 >> 26);
        int i47 = i32 & M26;
        iArr[0] = i37;
        iArr[1] = i41;
        iArr[2] = i40;
        iArr[3] = i43;
        iArr[4] = i42;
        iArr[5] = i39;
        iArr[6] = i45;
        iArr[7] = i44;
        iArr[8] = i47;
        iArr[9] = i46;
    }

    public static void cmov(int i10, int[] iArr, int i11, int[] iArr2, int i12) {
        for (int i13 = 0; i13 < 10; i13++) {
            int i14 = i12 + i13;
            int i15 = iArr2[i14];
            iArr2[i14] = i15 ^ ((iArr[i11 + i13] ^ i15) & i10);
        }
    }

    public static void cnegate(int i10, int[] iArr) {
        int i11 = 0 - i10;
        for (int i12 = 0; i12 < 10; i12++) {
            iArr[i12] = (iArr[i12] ^ i11) - i11;
        }
    }

    public static void copy(int[] iArr, int i10, int[] iArr2, int i11) {
        for (int i12 = 0; i12 < 10; i12++) {
            iArr2[i11 + i12] = iArr[i10 + i12];
        }
    }

    public static int[] create() {
        return new int[10];
    }

    public static int[] createTable(int i10) {
        return new int[i10 * 10];
    }

    public static void cswap(int i10, int[] iArr, int[] iArr2) {
        int i11 = 0 - i10;
        for (int i12 = 0; i12 < 10; i12++) {
            int i13 = iArr[i12];
            int i14 = iArr2[i12];
            int i15 = (i13 ^ i14) & i11;
            iArr[i12] = i13 ^ i15;
            iArr2[i12] = i14 ^ i15;
        }
    }

    public static void decode(byte[] bArr, int i10, int[] iArr) {
        decode128(bArr, i10, iArr, 0);
        decode128(bArr, i10 + 16, iArr, 5);
        iArr[9] = iArr[9] & M24;
    }

    private static void decode128(byte[] bArr, int i10, int[] iArr, int i11) {
        int decode32 = decode32(bArr, i10);
        int decode322 = decode32(bArr, i10 + 4);
        int decode323 = decode32(bArr, i10 + 8);
        int decode324 = decode32(bArr, i10 + 12);
        iArr[i11] = decode32 & M26;
        iArr[i11 + 1] = ((decode32 >>> 26) | (decode322 << 6)) & M26;
        iArr[i11 + 2] = ((decode322 >>> 20) | (decode323 << 12)) & M25;
        iArr[i11 + 3] = M26 & ((decode324 << 19) | (decode323 >>> 13));
        iArr[i11 + 4] = decode324 >>> 7;
    }

    private static int decode32(byte[] bArr, int i10) {
        return (bArr[i10 + 3] << 24) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
    }

    public static void encode(int[] iArr, byte[] bArr, int i10) {
        encode128(iArr, 0, bArr, i10);
        encode128(iArr, 5, bArr, i10 + 16);
    }

    private static void encode128(int[] iArr, int i10, byte[] bArr, int i11) {
        int i12 = iArr[i10];
        int i13 = iArr[i10 + 1];
        int i14 = iArr[i10 + 2];
        int i15 = iArr[i10 + 3];
        int i16 = iArr[i10 + 4];
        encode32((i13 << 26) | i12, bArr, i11);
        encode32((i13 >>> 6) | (i14 << 20), bArr, i11 + 4);
        encode32((i14 >>> 12) | (i15 << 13), bArr, i11 + 8);
        encode32((i16 << 7) | (i15 >>> 19), bArr, i11 + 12);
    }

    private static void encode32(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >>> 8);
        bArr[i11 + 2] = (byte) (i10 >>> 16);
        bArr[i11 + 3] = (byte) (i10 >>> 24);
    }

    public static void inv(int[] iArr, int[] iArr2) {
        int[] create = create();
        int[] iArr3 = new int[8];
        copy(iArr, 0, create, 0);
        normalize(create);
        encode(create, iArr3, 0);
        Mod.modOddInverse(P32, iArr3, iArr3);
        decode(iArr3, 0, iArr2);
    }

    public static void invVar(int[] iArr, int[] iArr2) {
        int[] create = create();
        int[] iArr3 = new int[8];
        copy(iArr, 0, create, 0);
        normalize(create);
        encode(create, iArr3, 0);
        Mod.modOddInverseVar(P32, iArr3, iArr3);
        decode(iArr3, 0, iArr2);
    }

    public static int isZero(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 10; i11++) {
            i10 |= iArr[i11];
        }
        return (((i10 >>> 1) | (i10 & 1)) - 1) >> 31;
    }

    public static boolean isZeroVar(int[] iArr) {
        return isZero(iArr) != 0;
    }

    public static void mul(int[] iArr, int i10, int[] iArr2) {
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = iArr[4];
        int i16 = iArr[5];
        int i17 = iArr[6];
        int i18 = iArr[7];
        int i19 = iArr[8];
        int i20 = iArr[9];
        long j10 = i10;
        long j11 = i13 * j10;
        int i21 = ((int) j11) & M25;
        long j12 = j11 >> 25;
        long j13 = i15 * j10;
        int i22 = ((int) j13) & M25;
        long j14 = i18 * j10;
        int i23 = ((int) j14) & M25;
        long j15 = i20 * j10;
        int i24 = ((int) j15) & M25;
        long j16 = ((j15 >> 25) * 38) + (i11 * j10);
        iArr2[0] = ((int) j16) & M26;
        long j17 = (j13 >> 25) + (i16 * j10);
        iArr2[5] = ((int) j17) & M26;
        long j18 = (j16 >> 26) + (i12 * j10);
        iArr2[1] = ((int) j18) & M26;
        long j19 = j12 + (i14 * j10);
        iArr2[3] = ((int) j19) & M26;
        long j20 = (j17 >> 26) + (i17 * j10);
        iArr2[6] = ((int) j20) & M26;
        long j21 = (j14 >> 25) + (i19 * j10);
        iArr2[8] = ((int) j21) & M26;
        iArr2[2] = i21 + ((int) (j18 >> 26));
        iArr2[4] = i22 + ((int) (j19 >> 26));
        iArr2[7] = i23 + ((int) (j20 >> 26));
        iArr2[9] = i24 + ((int) (j21 >> 26));
    }

    public static void negate(int[] iArr, int[] iArr2) {
        for (int i10 = 0; i10 < 10; i10++) {
            iArr2[i10] = -iArr[i10];
        }
    }

    public static void normalize(int[] iArr) {
        int i10 = (iArr[9] >>> 23) & 1;
        reduce(iArr, i10);
        reduce(iArr, -i10);
    }

    public static void one(int[] iArr) {
        iArr[0] = 1;
        for (int i10 = 1; i10 < 10; i10++) {
            iArr[i10] = 0;
        }
    }

    private static void powPm5d8(int[] iArr, int[] iArr2, int[] iArr3) {
        sqr(iArr, iArr2);
        mul(iArr, iArr2, iArr2);
        int[] create = create();
        sqr(iArr2, create);
        mul(iArr, create, create);
        sqr(create, 2, create);
        mul(iArr2, create, create);
        int[] create2 = create();
        sqr(create, 5, create2);
        mul(create, create2, create2);
        int[] create3 = create();
        sqr(create2, 5, create3);
        mul(create, create3, create3);
        sqr(create3, 10, create);
        mul(create2, create, create);
        sqr(create, 25, create2);
        mul(create, create2, create2);
        sqr(create2, 25, create3);
        mul(create, create3, create3);
        sqr(create3, 50, create);
        mul(create2, create, create);
        sqr(create, 125, create2);
        mul(create, create2, create2);
        sqr(create2, 2, create);
        mul(create, iArr, iArr3);
    }

    private static void reduce(int[] iArr, int i10) {
        int i11 = M24 & iArr[9];
        long j10 = (((r1 >> 24) + i10) * 19) + iArr[0];
        iArr[0] = ((int) j10) & M26;
        long j11 = (j10 >> 26) + iArr[1];
        iArr[1] = ((int) j11) & M26;
        long j12 = (j11 >> 26) + iArr[2];
        iArr[2] = ((int) j12) & M25;
        long j13 = (j12 >> 25) + iArr[3];
        iArr[3] = ((int) j13) & M26;
        long j14 = (j13 >> 26) + iArr[4];
        iArr[4] = ((int) j14) & M25;
        long j15 = (j14 >> 25) + iArr[5];
        iArr[5] = ((int) j15) & M26;
        long j16 = (j15 >> 26) + iArr[6];
        iArr[6] = ((int) j16) & M26;
        long j17 = (j16 >> 26) + iArr[7];
        iArr[7] = M25 & ((int) j17);
        long j18 = (j17 >> 25) + iArr[8];
        iArr[8] = M26 & ((int) j18);
        iArr[9] = i11 + ((int) (j18 >> 26));
    }

    public static void sqr(int[] iArr, int i10, int[] iArr2) {
        sqr(iArr, iArr2);
        while (true) {
            i10--;
            if (i10 <= 0) {
                return;
            } else {
                sqr(iArr2, iArr2);
            }
        }
    }

    public static boolean sqrtRatioVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] create = create();
        int[] create2 = create();
        mul(iArr, iArr2, create);
        sqr(iArr2, create2);
        mul(create, create2, create);
        sqr(create2, create2);
        mul(create2, create, create2);
        int[] create3 = create();
        int[] create4 = create();
        powPm5d8(create2, create3, create4);
        mul(create4, create, create4);
        int[] create5 = create();
        sqr(create4, create5);
        mul(create5, iArr2, create5);
        sub(create5, iArr, create3);
        normalize(create3);
        if (isZeroVar(create3)) {
            copy(create4, 0, iArr3, 0);
            return true;
        }
        add(create5, iArr, create3);
        normalize(create3);
        if (!isZeroVar(create3)) {
            return false;
        }
        mul(create4, ROOT_NEG_ONE, iArr3);
        return true;
    }

    public static void sub(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            iArr3[i10] = iArr[i10] - iArr2[i10];
        }
    }

    public static void subOne(int[] iArr) {
        iArr[0] = iArr[0] - 1;
    }

    public static void zero(int[] iArr) {
        for (int i10 = 0; i10 < 10; i10++) {
            iArr[i10] = 0;
        }
    }

    public static void addOne(int[] iArr, int i10) {
        iArr[i10] = iArr[i10] + 1;
    }

    public static void decode(int[] iArr, int i10, int[] iArr2) {
        decode128(iArr, i10, iArr2, 0);
        decode128(iArr, i10 + 4, iArr2, 5);
        iArr2[9] = iArr2[9] & M24;
    }

    private static void decode128(int[] iArr, int i10, int[] iArr2, int i11) {
        int i12 = iArr[i10];
        int i13 = iArr[i10 + 1];
        int i14 = iArr[i10 + 2];
        int i15 = iArr[i10 + 3];
        iArr2[i11] = i12 & M26;
        iArr2[i11 + 1] = ((i12 >>> 26) | (i13 << 6)) & M26;
        iArr2[i11 + 2] = ((i13 >>> 20) | (i14 << 12)) & M25;
        iArr2[i11 + 3] = M26 & ((i15 << 19) | (i14 >>> 13));
        iArr2[i11 + 4] = i15 >>> 7;
    }

    public static void encode(int[] iArr, int[] iArr2, int i10) {
        encode128(iArr, 0, iArr2, i10);
        encode128(iArr, 5, iArr2, i10 + 4);
    }

    private static void encode128(int[] iArr, int i10, int[] iArr2, int i11) {
        int i12 = iArr[i10];
        int i13 = iArr[i10 + 1];
        int i14 = iArr[i10 + 2];
        int i15 = iArr[i10 + 3];
        int i16 = iArr[i10 + 4];
        iArr2[i11] = (i13 << 26) | i12;
        iArr2[i11 + 1] = (i13 >>> 6) | (i14 << 20);
        iArr2[i11 + 2] = (i14 >>> 12) | (i15 << 13);
        iArr2[i11 + 3] = (i16 << 7) | (i15 >>> 19);
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        int i10 = iArr[0];
        int i11 = iArr2[0];
        int i12 = iArr[1];
        int i13 = iArr2[1];
        int i14 = iArr[2];
        int i15 = iArr2[2];
        int i16 = iArr[3];
        int i17 = iArr2[3];
        int i18 = iArr[4];
        int i19 = iArr2[4];
        int i20 = iArr[5];
        int i21 = iArr2[5];
        int i22 = iArr[6];
        int i23 = iArr2[6];
        int i24 = iArr[7];
        int i25 = iArr2[7];
        int i26 = iArr[8];
        int i27 = iArr2[8];
        int i28 = iArr[9];
        int i29 = iArr2[9];
        long j10 = i10;
        long j11 = i11;
        long j12 = j10 * j11;
        long j13 = i13;
        long j14 = j10 * j13;
        long j15 = i12;
        long j16 = j14 + (j15 * j11);
        long j17 = i15;
        long j18 = (j10 * j17) + (j15 * j13);
        long j19 = i14;
        long j20 = j18 + (j19 * j11);
        long j21 = ((j15 * j17) + (j19 * j13)) << 1;
        long j22 = i17;
        long j23 = j10 * j22;
        long j24 = i16;
        long j25 = j21 + j23 + (j24 * j11);
        long j26 = (j19 * j17) << 1;
        long j27 = i19;
        long j28 = i18;
        long j29 = j26 + (j10 * j27) + (j15 * j22) + (j24 * j13) + (j11 * j28);
        long j30 = ((((j15 * j27) + (j19 * j22)) + (j24 * j17)) + (j28 * j13)) << 1;
        long j31 = (((j19 * j27) + (j28 * j17)) << 1) + (j24 * j22);
        long j32 = (j24 * j27) + (j28 * j22);
        long j33 = (j28 * j27) << 1;
        long j34 = i20;
        long j35 = i21;
        long j36 = j34 * j35;
        long j37 = i23;
        long j38 = j34 * j37;
        long j39 = i22;
        long j40 = j38 + (j39 * j35);
        long j41 = i25;
        long j42 = (j34 * j41) + (j39 * j37);
        long j43 = i24;
        long j44 = i27;
        long j45 = j34 * j44;
        long j46 = i26;
        long j47 = (((j39 * j41) + (j43 * j37)) << 1) + j45 + (j46 * j35);
        long j48 = i29;
        long j49 = (j34 * j48) + (j39 * j44) + (j46 * j37);
        long j50 = i28;
        long j51 = ((j43 * j41) << 1) + j49 + (j35 * j50);
        long j52 = j12 - (((((j39 * j48) + (j43 * j44)) + (j46 * j41)) + (j50 * j37)) * 76);
        long j53 = j16 - (((((j43 * j48) + (j50 * j41)) << 1) + (j46 * j44)) * 38);
        long j54 = j20 - (((j46 * j48) + (j50 * j44)) * 38);
        long j55 = j25 - ((j50 * j48) * 76);
        long j56 = j30 - j36;
        long j57 = j31 - j40;
        long j58 = j32 - (j42 + (j43 * j35));
        long j59 = j33 - j47;
        int i30 = i11 + i21;
        int i31 = i12 + i22;
        long j60 = i10 + i20;
        long j61 = i30;
        long j62 = j60 * j61;
        long j63 = i13 + i23;
        long j64 = j60 * j63;
        long j65 = i31;
        long j66 = j64 + (j65 * j61);
        long j67 = i15 + i25;
        long j68 = i14 + i24;
        long j69 = (j60 * j67) + (j65 * j63) + (j68 * j61);
        long j70 = ((j65 * j67) + (j68 * j63)) << 1;
        long j71 = i17 + i27;
        long j72 = i16 + i26;
        long j73 = j70 + (j60 * j71) + (j72 * j61);
        long j74 = i19 + i29;
        long j75 = i18 + i28;
        long j76 = ((j68 * j67) << 1) + (j60 * j74) + (j65 * j71) + (j72 * j63) + (j75 * j61);
        long j77 = ((((j65 * j74) + (j68 * j71)) + (j72 * j67)) + (j75 * j63)) << 1;
        long j78 = (((j68 * j74) + (j67 * j75)) << 1) + (j72 * j71);
        long j79 = j59 + (j73 - j55);
        int i32 = ((int) j79) & M26;
        long j80 = (j79 >> 26) + ((j76 - j29) - j51);
        int i33 = ((int) j80) & M25;
        long j81 = j52 + ((((j80 >> 25) + j77) - j56) * 38);
        iArr3[0] = ((int) j81) & M26;
        long j82 = (j81 >> 26) + j53 + ((j78 - j57) * 38);
        iArr3[1] = ((int) j82) & M26;
        long j83 = (j82 >> 26) + j54 + ((((j72 * j74) + (j75 * j71)) - j58) * 38);
        iArr3[2] = ((int) j83) & M25;
        long j84 = (j83 >> 25) + j55 + ((((j75 * j74) << 1) - j59) * 38);
        iArr3[3] = ((int) j84) & M26;
        long j85 = (j84 >> 26) + j29 + (j51 * 38);
        iArr3[4] = ((int) j85) & M25;
        long j86 = (j85 >> 25) + j56 + (j62 - j52);
        iArr3[5] = ((int) j86) & M26;
        long j87 = (j86 >> 26) + j57 + (j66 - j53);
        iArr3[6] = ((int) j87) & M26;
        long j88 = (j87 >> 26) + j58 + (j69 - j54);
        iArr3[7] = ((int) j88) & M25;
        long j89 = (j88 >> 25) + i32;
        iArr3[8] = ((int) j89) & M26;
        iArr3[9] = i33 + ((int) (j89 >> 26));
    }

    public static void sqr(int[] iArr, int[] iArr2) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = iArr[8];
        int i19 = iArr[9];
        long j10 = i10;
        long j11 = j10 * j10;
        long j12 = i11 * 2;
        long j13 = j10 * j12;
        long j14 = i12 * 2;
        long j15 = j10 * j14;
        long j16 = i11;
        long j17 = j15 + (j16 * j16);
        long j18 = i13 * 2;
        long j19 = (j12 * j14) + (j10 * j18);
        long j20 = i14 * 2;
        long j21 = (i12 * j14) + (j10 * j20) + (j16 * j18);
        long j22 = (j12 * j20) + (j14 * j18);
        long j23 = j14 * j20;
        long j24 = i13;
        long j25 = j23 + (j24 * j24);
        long j26 = j24 * j20;
        long j27 = i15;
        long j28 = j27 * j27;
        long j29 = i16 * 2;
        long j30 = j27 * j29;
        long j31 = i17 * 2;
        long j32 = j27 * j31;
        long j33 = i16;
        long j34 = j32 + (j33 * j33);
        long j35 = j29 * j31;
        long j36 = i18 * 2;
        long j37 = i19 * 2;
        long j38 = (i17 * j31) + (j27 * j37) + (j33 * j36);
        long j39 = (j29 * j37) + (j31 * j36);
        long j40 = j31 * j37;
        long j41 = i18;
        long j42 = j11 - (j39 * 38);
        long j43 = j13 - ((j40 + (j41 * j41)) * 38);
        long j44 = j17 - ((j41 * j37) * 38);
        long j45 = j19 - ((i19 * j37) * 38);
        long j46 = j22 - j28;
        long j47 = j25 - j30;
        long j48 = j26 - j34;
        long j49 = (i14 * j20) - (j35 + (j27 * j36));
        int i20 = i11 + i16;
        int i21 = i12 + i17;
        int i22 = i13 + i18;
        int i23 = i14 + i19;
        long j50 = i10 + i15;
        long j51 = j50 * j50;
        long j52 = i20 * 2;
        long j53 = j50 * j52;
        long j54 = i21 * 2;
        long j55 = i20;
        long j56 = (j50 * j54) + (j55 * j55);
        long j57 = i22 * 2;
        long j58 = (j52 * j54) + (j50 * j57);
        long j59 = i23 * 2;
        long j60 = (i21 * j54) + (j50 * j59) + (j55 * j57);
        long j61 = (j52 * j59) + (j57 * j54);
        long j62 = i22;
        long j63 = (j54 * j59) + (j62 * j62);
        long j64 = j62 * j59;
        long j65 = i23 * j59;
        long j66 = j49 + (j58 - j45);
        int i24 = ((int) j66) & M26;
        long j67 = (j66 >> 26) + ((j60 - j21) - j38);
        int i25 = ((int) j67) & M25;
        long j68 = j42 + ((((j67 >> 25) + j61) - j46) * 38);
        iArr2[0] = ((int) j68) & M26;
        long j69 = (j68 >> 26) + j43 + ((j63 - j47) * 38);
        iArr2[1] = ((int) j69) & M26;
        long j70 = (j69 >> 26) + j44 + ((j64 - j48) * 38);
        iArr2[2] = ((int) j70) & M25;
        long j71 = (j70 >> 25) + j45 + ((j65 - j49) * 38);
        iArr2[3] = ((int) j71) & M26;
        long j72 = (j71 >> 26) + j21 + (j38 * 38);
        iArr2[4] = ((int) j72) & M25;
        long j73 = (j72 >> 25) + j46 + (j51 - j42);
        iArr2[5] = ((int) j73) & M26;
        long j74 = (j73 >> 26) + j47 + (j53 - j43);
        iArr2[6] = ((int) j74) & M26;
        long j75 = (j74 >> 26) + j48 + (j56 - j44);
        iArr2[7] = ((int) j75) & M25;
        long j76 = (j75 >> 25) + i24;
        iArr2[8] = ((int) j76) & M26;
        iArr2[9] = i25 + ((int) (j76 >> 26));
    }
}
