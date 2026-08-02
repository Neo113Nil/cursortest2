package pj;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes5.dex */
public abstract class g {
    public static int A(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = iArr2[0] & BodyPartID.bodyIdMax;
        long j11 = iArr2[1] & BodyPartID.bodyIdMax;
        long j12 = iArr2[2] & BodyPartID.bodyIdMax;
        long j13 = iArr2[3] & BodyPartID.bodyIdMax;
        long j14 = iArr2[4] & BodyPartID.bodyIdMax;
        long j15 = iArr2[5] & BodyPartID.bodyIdMax;
        long j16 = iArr2[6] & BodyPartID.bodyIdMax;
        long j17 = iArr2[7] & BodyPartID.bodyIdMax;
        long j18 = 0;
        int i10 = 0;
        while (i10 < 8) {
            long j19 = iArr[i10] & BodyPartID.bodyIdMax;
            long j20 = (j19 * j10) + (iArr3[i10] & BodyPartID.bodyIdMax);
            int i11 = i10;
            iArr3[i11] = (int) j20;
            int i12 = i11 + 1;
            long j21 = (j20 >>> 32) + (j19 * j11) + (iArr3[i12] & BodyPartID.bodyIdMax);
            iArr3[i12] = (int) j21;
            long j22 = (j21 >>> 32) + (j19 * j12) + (iArr3[r4] & BodyPartID.bodyIdMax);
            iArr3[i11 + 2] = (int) j22;
            long j23 = (j22 >>> 32) + (j19 * j13) + (iArr3[r4] & BodyPartID.bodyIdMax);
            iArr3[i11 + 3] = (int) j23;
            long j24 = (j23 >>> 32) + (j19 * j14) + (iArr3[r4] & BodyPartID.bodyIdMax);
            iArr3[i11 + 4] = (int) j24;
            long j25 = (j24 >>> 32) + (j19 * j15) + (iArr3[r4] & BodyPartID.bodyIdMax);
            iArr3[i11 + 5] = (int) j25;
            long j26 = (j25 >>> 32) + (j19 * j16) + (iArr3[r4] & BodyPartID.bodyIdMax);
            iArr3[i11 + 6] = (int) j26;
            long j27 = (j26 >>> 32) + (j19 * j17) + (iArr3[r4] & BodyPartID.bodyIdMax);
            iArr3[i11 + 7] = (int) j27;
            long j28 = (j27 >>> 32) + j18 + (iArr3[r4] & BodyPartID.bodyIdMax);
            iArr3[i11 + 8] = (int) j28;
            j18 = j28 >>> 32;
            i10 = i12;
        }
        return (int) j18;
    }

    public static int B(int i10, int[] iArr, int[] iArr2) {
        long j10 = i10 & BodyPartID.bodyIdMax;
        long j11 = ((iArr2[0] & BodyPartID.bodyIdMax) * j10) + (iArr[0] & BodyPartID.bodyIdMax);
        iArr2[0] = (int) j11;
        long j12 = (j11 >>> 32) + ((iArr2[1] & BodyPartID.bodyIdMax) * j10) + (iArr[1] & BodyPartID.bodyIdMax);
        iArr2[1] = (int) j12;
        long j13 = (j12 >>> 32) + ((iArr2[2] & BodyPartID.bodyIdMax) * j10) + (iArr[2] & BodyPartID.bodyIdMax);
        iArr2[2] = (int) j13;
        long j14 = (j13 >>> 32) + ((iArr2[3] & BodyPartID.bodyIdMax) * j10) + (iArr[3] & BodyPartID.bodyIdMax);
        iArr2[3] = (int) j14;
        long j15 = (j14 >>> 32) + ((iArr2[4] & BodyPartID.bodyIdMax) * j10) + (iArr[4] & BodyPartID.bodyIdMax);
        iArr2[4] = (int) j15;
        long j16 = (j15 >>> 32) + ((iArr2[5] & BodyPartID.bodyIdMax) * j10) + (iArr[5] & BodyPartID.bodyIdMax);
        iArr2[5] = (int) j16;
        long j17 = (j16 >>> 32) + ((iArr2[6] & BodyPartID.bodyIdMax) * j10) + (iArr[6] & BodyPartID.bodyIdMax);
        iArr2[6] = (int) j17;
        long j18 = (j17 >>> 32) + (j10 * (iArr2[7] & BodyPartID.bodyIdMax)) + (BodyPartID.bodyIdMax & iArr[7]);
        iArr2[7] = (int) j18;
        return (int) (j18 >>> 32);
    }

    public static void C(int[] iArr, int i10, int[] iArr2, int i11) {
        long j10 = iArr[i10] & BodyPartID.bodyIdMax;
        int i12 = 0;
        int i13 = 16;
        int i14 = 7;
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
                long j53 = (iArr2[r24] & BodyPartID.bodyIdMax) + (j51 >>> 32);
                long j54 = j51 & BodyPartID.bodyIdMax;
                long j55 = j45 + (j50 * j10);
                int i24 = (int) j55;
                iArr2[i11 + 5] = (i24 << 1) | i23;
                int i25 = i24 >>> 31;
                long j56 = j47 + (j55 >>> 32) + (j50 * j15);
                long j57 = j49 + (j56 >>> 32) + (j50 * j19);
                long j58 = j56 & BodyPartID.bodyIdMax;
                long j59 = j52 + (j57 >>> 32) + (j50 * j26);
                long j60 = j57 & BodyPartID.bodyIdMax;
                long j61 = j54 + (j59 >>> 32) + (j50 * j37);
                long j62 = j59 & BodyPartID.bodyIdMax;
                long j63 = j53 + (j61 >>> 32);
                long j64 = j61 & BodyPartID.bodyIdMax;
                long j65 = iArr[i10 + 6] & BodyPartID.bodyIdMax;
                long j66 = (iArr2[r14] & BodyPartID.bodyIdMax) + (j63 >>> 32);
                long j67 = j63 & BodyPartID.bodyIdMax;
                long j68 = (iArr2[r26] & BodyPartID.bodyIdMax) + (j66 >>> 32);
                long j69 = j66 & BodyPartID.bodyIdMax;
                long j70 = j58 + (j65 * j10);
                int i26 = (int) j70;
                iArr2[i11 + 6] = (i26 << 1) | i25;
                int i27 = i26 >>> 31;
                long j71 = j60 + (j70 >>> 32) + (j65 * j15);
                long j72 = j62 + (j71 >>> 32) + (j65 * j19);
                long j73 = j71 & BodyPartID.bodyIdMax;
                long j74 = j64 + (j72 >>> 32) + (j65 * j26);
                long j75 = j72 & BodyPartID.bodyIdMax;
                long j76 = j67 + (j74 >>> 32) + (j65 * j37);
                long j77 = j74 & BodyPartID.bodyIdMax;
                long j78 = j69 + (j76 >>> 32) + (j65 * j50);
                long j79 = j76 & BodyPartID.bodyIdMax;
                long j80 = j68 + (j78 >>> 32);
                long j81 = j78 & BodyPartID.bodyIdMax;
                long j82 = iArr[i10 + 7] & BodyPartID.bodyIdMax;
                long j83 = (iArr2[r7] & BodyPartID.bodyIdMax) + (j80 >>> 32);
                long j84 = j80 & BodyPartID.bodyIdMax;
                long j85 = (iArr2[r20] & BodyPartID.bodyIdMax) + (j83 >>> 32);
                long j86 = j83 & BodyPartID.bodyIdMax;
                long j87 = j73 + (j10 * j82);
                int i28 = (int) j87;
                iArr2[i11 + 7] = (i28 << 1) | i27;
                long j88 = j75 + (j87 >>> 32) + (j15 * j82);
                long j89 = j77 + (j88 >>> 32) + (j82 * j19);
                long j90 = j79 + (j89 >>> 32) + (j82 * j26);
                long j91 = j81 + (j90 >>> 32) + (j82 * j37);
                long j92 = j84 + (j91 >>> 32) + (j82 * j50);
                long j93 = j86 + (j92 >>> 32) + (j82 * j65);
                long j94 = j85 + (j93 >>> 32);
                int i29 = (int) j88;
                iArr2[i11 + 8] = (i28 >>> 31) | (i29 << 1);
                int i30 = i29 >>> 31;
                int i31 = (int) j89;
                iArr2[i11 + 9] = i30 | (i31 << 1);
                int i32 = (int) j90;
                iArr2[i11 + 10] = (i32 << 1) | (i31 >>> 31);
                int i33 = (int) j91;
                iArr2[i11 + 11] = (i32 >>> 31) | (i33 << 1);
                int i34 = i33 >>> 31;
                int i35 = (int) j92;
                iArr2[i11 + 12] = i34 | (i35 << 1);
                int i36 = i35 >>> 31;
                int i37 = (int) j93;
                iArr2[i11 + 13] = i36 | (i37 << 1);
                int i38 = i37 >>> 31;
                int i39 = (int) j94;
                iArr2[i11 + 14] = i38 | (i39 << 1);
                int i40 = i39 >>> 31;
                int i41 = i11 + 15;
                iArr2[i41] = i40 | ((iArr2[i41] + ((int) (j94 >>> 32))) << 1);
                return;
            }
            i14 = i15;
        }
    }

    public static void D(int[] iArr, int[] iArr2) {
        long j10 = iArr[0] & BodyPartID.bodyIdMax;
        int i10 = 16;
        int i11 = 0;
        int i12 = 7;
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
                long j70 = j58 + (j65 * j10);
                int i22 = (int) j70;
                iArr2[6] = (i22 << 1) | i21;
                int i23 = i22 >>> 31;
                long j71 = j60 + (j70 >>> 32) + (j65 * j15);
                long j72 = j62 + (j71 >>> 32) + (j65 * j19);
                long j73 = j71 & BodyPartID.bodyIdMax;
                long j74 = j64 + (j72 >>> 32) + (j65 * j26);
                long j75 = j72 & BodyPartID.bodyIdMax;
                long j76 = j67 + (j74 >>> 32) + (j65 * j37);
                long j77 = j74 & BodyPartID.bodyIdMax;
                long j78 = j69 + (j76 >>> 32) + (j65 * j50);
                long j79 = j76 & BodyPartID.bodyIdMax;
                long j80 = j68 + (j78 >>> 32);
                long j81 = j78 & BodyPartID.bodyIdMax;
                long j82 = iArr[7] & BodyPartID.bodyIdMax;
                long j83 = (iArr2[13] & BodyPartID.bodyIdMax) + (j80 >>> 32);
                long j84 = j80 & BodyPartID.bodyIdMax;
                long j85 = (iArr2[14] & BodyPartID.bodyIdMax) + (j83 >>> 32);
                long j86 = j83 & BodyPartID.bodyIdMax;
                long j87 = j73 + (j10 * j82);
                int i24 = (int) j87;
                iArr2[7] = (i24 << 1) | i23;
                int i25 = i24 >>> 31;
                long j88 = j75 + (j87 >>> 32) + (j82 * j15);
                long j89 = j77 + (j88 >>> 32) + (j82 * j19);
                long j90 = j79 + (j89 >>> 32) + (j82 * j26);
                long j91 = j81 + (j90 >>> 32) + (j82 * j37);
                long j92 = j84 + (j91 >>> 32) + (j50 * j82);
                long j93 = j86 + (j92 >>> 32) + (j82 * j65);
                long j94 = j85 + (j93 >>> 32);
                int i26 = (int) j88;
                iArr2[8] = i25 | (i26 << 1);
                int i27 = i26 >>> 31;
                int i28 = (int) j89;
                iArr2[9] = i27 | (i28 << 1);
                int i29 = (int) j90;
                iArr2[10] = (i28 >>> 31) | (i29 << 1);
                int i30 = i29 >>> 31;
                int i31 = (int) j91;
                iArr2[11] = i30 | (i31 << 1);
                int i32 = i31 >>> 31;
                int i33 = (int) j92;
                iArr2[12] = i32 | (i33 << 1);
                int i34 = i33 >>> 31;
                int i35 = (int) j93;
                iArr2[13] = i34 | (i35 << 1);
                int i36 = i35 >>> 31;
                int i37 = (int) j94;
                iArr2[14] = i36 | (i37 << 1);
                iArr2[15] = ((iArr2[15] + ((int) (j94 >>> 32))) << 1) | (i37 >>> 31);
                return;
            }
            i12 = i13;
        }
    }

    public static int E(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
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
        long j16 = (j15 >> 32) + ((iArr[i10 + 6] & BodyPartID.bodyIdMax) - (iArr2[i11 + 6] & BodyPartID.bodyIdMax));
        iArr3[i12 + 6] = (int) j16;
        long j17 = (j16 >> 32) + ((iArr[i10 + 7] & BodyPartID.bodyIdMax) - (iArr2[i11 + 7] & BodyPartID.bodyIdMax));
        iArr3[i12 + 7] = (int) j17;
        return (int) (j17 >> 32);
    }

    public static int F(int[] iArr, int[] iArr2, int[] iArr3) {
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
        long j17 = (j16 >> 32) + ((iArr[7] & BodyPartID.bodyIdMax) - (iArr2[7] & BodyPartID.bodyIdMax));
        iArr3[7] = (int) j17;
        return (int) (j17 >> 32);
    }

    public static int G(int[] iArr, int[] iArr2) {
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
        long j16 = (j15 >> 32) + ((iArr2[6] & BodyPartID.bodyIdMax) - (iArr[6] & BodyPartID.bodyIdMax));
        iArr2[6] = (int) j16;
        long j17 = (j16 >> 32) + ((iArr2[7] & BodyPartID.bodyIdMax) - (BodyPartID.bodyIdMax & iArr[7]));
        iArr2[7] = (int) j17;
        return (int) (j17 >> 32);
    }

    public static BigInteger H(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i10 = 0; i10 < 8; i10++) {
            int i11 = iArr[i10];
            if (i11 != 0) {
                Aj.f.d(i11, bArr, (7 - i10) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger I(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i10 = 0; i10 < 4; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                Aj.f.m(j10, bArr, (3 - i10) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void J(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
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
        long j16 = (j15 >>> 32) + (iArr[6] & BodyPartID.bodyIdMax) + (iArr2[6] & BodyPartID.bodyIdMax);
        iArr3[6] = (int) j16;
        long j17 = (j16 >>> 32) + (iArr[7] & BodyPartID.bodyIdMax) + (iArr2[7] & BodyPartID.bodyIdMax);
        iArr3[7] = (int) j17;
        return (int) (j17 >>> 32);
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
        long j17 = (j16 >>> 32) + (iArr[7] & BodyPartID.bodyIdMax) + (iArr2[7] & BodyPartID.bodyIdMax) + (iArr3[7] & BodyPartID.bodyIdMax);
        iArr3[7] = (int) j17;
        return (int) (j17 >>> 32);
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
        long j15 = (j14 >>> 32) + (iArr[i10 + 5] & BodyPartID.bodyIdMax) + (iArr2[r6] & BodyPartID.bodyIdMax);
        iArr2[i11 + 5] = (int) j15;
        long j16 = (j15 >>> 32) + (iArr[i10 + 6] & BodyPartID.bodyIdMax) + (iArr2[r6] & BodyPartID.bodyIdMax);
        iArr2[i11 + 6] = (int) j16;
        long j17 = (j16 >>> 32) + (iArr[i10 + 7] & BodyPartID.bodyIdMax) + (BodyPartID.bodyIdMax & iArr2[r12]);
        iArr2[i11 + 7] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static int d(int[] iArr, int[] iArr2) {
        long j10 = (iArr[0] & BodyPartID.bodyIdMax) + (iArr2[0] & BodyPartID.bodyIdMax);
        iArr2[0] = (int) j10;
        long j11 = (j10 >>> 32) + (iArr[1] & BodyPartID.bodyIdMax) + (iArr2[1] & BodyPartID.bodyIdMax);
        iArr2[1] = (int) j11;
        long j12 = (j11 >>> 32) + (iArr[2] & BodyPartID.bodyIdMax) + (iArr2[2] & BodyPartID.bodyIdMax);
        iArr2[2] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[3] & BodyPartID.bodyIdMax) + (iArr2[3] & BodyPartID.bodyIdMax);
        iArr2[3] = (int) j13;
        long j14 = (j13 >>> 32) + (iArr[4] & BodyPartID.bodyIdMax) + (iArr2[4] & BodyPartID.bodyIdMax);
        iArr2[4] = (int) j14;
        long j15 = (j14 >>> 32) + (iArr[5] & BodyPartID.bodyIdMax) + (iArr2[5] & BodyPartID.bodyIdMax);
        iArr2[5] = (int) j15;
        long j16 = (j15 >>> 32) + (iArr[6] & BodyPartID.bodyIdMax) + (iArr2[6] & BodyPartID.bodyIdMax);
        iArr2[6] = (int) j16;
        long j17 = (j16 >>> 32) + (iArr[7] & BodyPartID.bodyIdMax) + (BodyPartID.bodyIdMax & iArr2[7]);
        iArr2[7] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static int e(int[] iArr, int i10, int[] iArr2, int i11) {
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
        long j15 = (j14 >>> 32) + (iArr[r5] & BodyPartID.bodyIdMax) + (iArr2[r8] & BodyPartID.bodyIdMax);
        int i17 = (int) j15;
        iArr[i10 + 5] = i17;
        iArr2[i11 + 5] = i17;
        long j16 = (j15 >>> 32) + (iArr[r5] & BodyPartID.bodyIdMax) + (iArr2[r8] & BodyPartID.bodyIdMax);
        int i18 = (int) j16;
        iArr[i10 + 6] = i18;
        iArr2[i11 + 6] = i18;
        long j17 = (j16 >>> 32) + (iArr[r12] & BodyPartID.bodyIdMax) + (BodyPartID.bodyIdMax & iArr2[r14]);
        int i19 = (int) j17;
        iArr[i10 + 7] = i19;
        iArr2[i11 + 7] = i19;
        return (int) (j17 >>> 32);
    }

    public static int[] f() {
        return new int[8];
    }

    public static long[] g() {
        return new long[4];
    }

    public static int[] h() {
        return new int[16];
    }

    public static long[] i() {
        return new long[8];
    }

    public static boolean j(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        boolean p10 = p(iArr, i10, iArr2, i11);
        if (p10) {
            E(iArr, i10, iArr2, i11, iArr3, i12);
            return p10;
        }
        E(iArr2, i11, iArr, i10, iArr3, i12);
        return p10;
    }

    public static boolean k(int[] iArr, int[] iArr2) {
        for (int i10 = 7; i10 >= 0; i10--) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static boolean l(long[] jArr, long[] jArr2) {
        for (int i10 = 3; i10 >= 0; i10--) {
            if (jArr[i10] != jArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static int[] m(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        int[] f10 = f();
        int i10 = 0;
        while (bigInteger.signum() != 0) {
            f10[i10] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i10++;
        }
        return f10;
    }

    public static long[] n(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        long[] g10 = g();
        int i10 = 0;
        while (bigInteger.signum() != 0) {
            g10[i10] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i10++;
        }
        return g10;
    }

    public static int o(int[] iArr, int i10) {
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

    public static boolean p(int[] iArr, int i10, int[] iArr2, int i11) {
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

    public static boolean q(int[] iArr, int[] iArr2) {
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

    public static boolean r(int[] iArr) {
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

    public static boolean s(long[] jArr) {
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

    public static boolean t(int[] iArr) {
        for (int i10 = 0; i10 < 8; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean u(long[] jArr) {
        for (int i10 = 0; i10 < 4; i10++) {
            if (jArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void v(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j10 = iArr2[i11] & BodyPartID.bodyIdMax;
        long j11 = iArr2[i11 + 1] & BodyPartID.bodyIdMax;
        long j12 = iArr2[i11 + 2] & BodyPartID.bodyIdMax;
        long j13 = iArr2[i11 + 3] & BodyPartID.bodyIdMax;
        long j14 = iArr2[i11 + 4] & BodyPartID.bodyIdMax;
        long j15 = iArr2[i11 + 5] & BodyPartID.bodyIdMax;
        long j16 = iArr2[i11 + 6] & BodyPartID.bodyIdMax;
        long j17 = iArr2[i11 + 7] & BodyPartID.bodyIdMax;
        long j18 = iArr[i10] & BodyPartID.bodyIdMax;
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
            long j27 = iArr[i10 + i13] & BodyPartID.bodyIdMax;
            long j28 = (j27 * j10) + (iArr3[i15] & BodyPartID.bodyIdMax);
            iArr3[i15] = (int) j28;
            long j29 = (j28 >>> 32) + (j27 * j11) + (iArr3[r3] & BodyPartID.bodyIdMax);
            iArr3[i16 + 2] = (int) j29;
            long j30 = (j29 >>> 32) + (j27 * j12) + (iArr3[r24] & BodyPartID.bodyIdMax);
            iArr3[i16 + 3] = (int) j30;
            long j31 = (j30 >>> 32) + (j27 * j13) + (iArr3[r24] & BodyPartID.bodyIdMax);
            iArr3[i16 + 4] = (int) j31;
            long j32 = (j31 >>> 32) + (j27 * j14) + (iArr3[r24] & BodyPartID.bodyIdMax);
            iArr3[i16 + 5] = (int) j32;
            long j33 = (j32 >>> 32) + (j27 * j15) + (iArr3[r24] & BodyPartID.bodyIdMax);
            iArr3[i16 + 6] = (int) j33;
            long j34 = (j33 >>> 32) + (j27 * j16) + (iArr3[r24] & BodyPartID.bodyIdMax);
            iArr3[i16 + 7] = (int) j34;
            long j35 = (j34 >>> 32) + (j27 * j17) + (iArr3[r24] & BodyPartID.bodyIdMax);
            iArr3[i16 + 8] = (int) j35;
            iArr3[i16 + 9] = (int) (j35 >>> 32);
            i13++;
            i14 = i15;
        }
    }

    public static void w(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = iArr2[0] & BodyPartID.bodyIdMax;
        long j11 = iArr2[1] & BodyPartID.bodyIdMax;
        long j12 = iArr2[2] & BodyPartID.bodyIdMax;
        long j13 = iArr2[3] & BodyPartID.bodyIdMax;
        long j14 = iArr2[4] & BodyPartID.bodyIdMax;
        long j15 = iArr2[5] & BodyPartID.bodyIdMax;
        long j16 = iArr2[6] & BodyPartID.bodyIdMax;
        long j17 = iArr2[7] & BodyPartID.bodyIdMax;
        long j18 = iArr[0] & BodyPartID.bodyIdMax;
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
            long j27 = iArr[i10] & BodyPartID.bodyIdMax;
            long j28 = j14;
            long j29 = (j27 * j10) + (iArr3[i10] & BodyPartID.bodyIdMax);
            iArr3[i10] = (int) j29;
            int i12 = i10 + 1;
            long j30 = (j29 >>> 32) + (j27 * j11) + (iArr3[i12] & BodyPartID.bodyIdMax);
            iArr3[i12] = (int) j30;
            long j31 = (j30 >>> 32) + (j27 * j12) + (iArr3[r25] & BodyPartID.bodyIdMax);
            iArr3[i10 + 2] = (int) j31;
            long j32 = (j31 >>> 32) + (j27 * j13) + (iArr3[r25] & BodyPartID.bodyIdMax);
            iArr3[i10 + 3] = (int) j32;
            long j33 = (j32 >>> 32) + (j27 * j28) + (iArr3[r25] & BodyPartID.bodyIdMax);
            iArr3[i10 + 4] = (int) j33;
            long j34 = (j33 >>> 32) + (j27 * j15) + (iArr3[r25] & BodyPartID.bodyIdMax);
            iArr3[i10 + 5] = (int) j34;
            long j35 = (j34 >>> 32) + (j27 * j16) + (iArr3[r25] & BodyPartID.bodyIdMax);
            iArr3[i10 + 6] = (int) j35;
            long j36 = (j35 >>> 32) + (j27 * j17) + (iArr3[r14] & BodyPartID.bodyIdMax);
            iArr3[i10 + 7] = (int) j36;
            iArr3[i10 + 8] = (int) (j36 >>> 32);
            i10 = i12;
            j14 = j28;
        }
    }

    public static long x(int i10, int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
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
        long j25 = (j23 >>> 32) + (j10 * j24) + j22 + (iArr2[i12 + 6] & BodyPartID.bodyIdMax);
        iArr3[i13 + 6] = (int) j25;
        long j26 = iArr[i11 + 7] & BodyPartID.bodyIdMax;
        long j27 = (j25 >>> 32) + (j10 * j26) + j24 + (BodyPartID.bodyIdMax & iArr2[i12 + 7]);
        iArr3[i13 + 7] = (int) j27;
        return (j27 >>> 32) + j26;
    }

    public static int y(int i10, long j10, int[] iArr, int i11) {
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
        return m.t(8, iArr, i11, 4);
    }

    public static int z(int i10, int i11, int[] iArr, int i12) {
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
        return m.t(8, iArr, i12, 3);
    }
}
