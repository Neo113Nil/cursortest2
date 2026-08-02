package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes5.dex */
public abstract class N {

    /* renamed from: P, reason: collision with root package name */
    static final int[] f62758P = {-1, 0, 0, -1, -2, -1, -1, -1, -1, -1, -1, -1};
    static final int[] PExt = {1, -2, 0, 2, 0, -2, 0, 2, 1, 0, 0, 0, -2, 1, 0, -2, -3, -1, -1, -1, -1, -1, -1, -1};
    private static final int[] PExtInv = {-1, 1, -1, -3, -1, 1, -1, -3, -2, -1, -1, -1, 1, -2, -1, 1, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (pj.m.a(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && pj.m.p(12, iArr3, f62758P))) {
            d(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2, int[] iArr3) {
        if (pj.m.a(24, iArr, iArr2, iArr3) != 0 || (iArr3[23] == -1 && pj.m.p(24, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (pj.m.e(iArr4.length, iArr4, iArr3) != 0) {
                pj.m.s(24, iArr3, iArr4.length);
            }
        }
    }

    public static void c(int[] iArr, int[] iArr2) {
        if (pj.m.r(12, iArr, iArr2) != 0 || (iArr2[11] == -1 && pj.m.p(12, iArr2, f62758P))) {
            d(iArr2);
        }
    }

    public static void d(int[] iArr) {
        long j10 = (iArr[0] & BodyPartID.bodyIdMax) + 1;
        iArr[0] = (int) j10;
        long j11 = (j10 >> 32) + ((iArr[1] & BodyPartID.bodyIdMax) - 1);
        iArr[1] = (int) j11;
        long j12 = j11 >> 32;
        if (j12 != 0) {
            long j13 = j12 + (iArr[2] & BodyPartID.bodyIdMax);
            iArr[2] = (int) j13;
            j12 = j13 >> 32;
        }
        long j14 = j12 + (iArr[3] & BodyPartID.bodyIdMax) + 1;
        iArr[3] = (int) j14;
        long j15 = (j14 >> 32) + (BodyPartID.bodyIdMax & iArr[4]) + 1;
        iArr[4] = (int) j15;
        if ((j15 >> 32) != 0) {
            pj.m.s(12, iArr, 5);
        }
    }

    public static int[] e(BigInteger bigInteger) {
        int[] n10 = pj.m.n(384, bigInteger);
        if (n10[11] == -1) {
            int[] iArr = f62758P;
            if (pj.m.p(12, n10, iArr)) {
                pj.m.M(12, iArr, n10);
            }
        }
        return n10;
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] i10 = pj.m.i(24);
        pj.i.a(iArr, iArr2, i10);
        h(i10, iArr3);
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (pj.m.v(12, iArr)) {
            pj.m.P(12, iArr2);
        } else {
            pj.m.J(12, f62758P, iArr, iArr2);
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        long j10 = iArr[16] & BodyPartID.bodyIdMax;
        long j11 = iArr[17] & BodyPartID.bodyIdMax;
        long j12 = iArr[18] & BodyPartID.bodyIdMax;
        long j13 = iArr[19] & BodyPartID.bodyIdMax;
        long j14 = iArr[20] & BodyPartID.bodyIdMax;
        long j15 = iArr[21] & BodyPartID.bodyIdMax;
        long j16 = iArr[22] & BodyPartID.bodyIdMax;
        long j17 = iArr[23] & BodyPartID.bodyIdMax;
        long j18 = ((iArr[12] & BodyPartID.bodyIdMax) + j14) - 1;
        long j19 = (iArr[13] & BodyPartID.bodyIdMax) + j16;
        long j20 = (iArr[14] & BodyPartID.bodyIdMax) + j16 + j17;
        long j21 = (iArr[15] & BodyPartID.bodyIdMax) + j17;
        long j22 = j11 + j15;
        long j23 = j15 - j17;
        long j24 = j16 - j17;
        long j25 = j18 + j23;
        long j26 = (iArr[0] & BodyPartID.bodyIdMax) + j25;
        iArr2[0] = (int) j26;
        long j27 = (j26 >> 32) + (((iArr[1] & BodyPartID.bodyIdMax) + j17) - j18) + j19;
        iArr2[1] = (int) j27;
        long j28 = (j27 >> 32) + (((iArr[2] & BodyPartID.bodyIdMax) - j15) - j19) + j20;
        iArr2[2] = (int) j28;
        long j29 = (j28 >> 32) + ((iArr[3] & BodyPartID.bodyIdMax) - j20) + j21 + j25;
        iArr2[3] = (int) j29;
        long j30 = (j29 >> 32) + (((((iArr[4] & BodyPartID.bodyIdMax) + j10) + j15) + j19) - j21) + j25;
        iArr2[4] = (int) j30;
        long j31 = (j30 >> 32) + ((iArr[5] & BodyPartID.bodyIdMax) - j10) + j19 + j20 + j22;
        iArr2[5] = (int) j31;
        long j32 = (j31 >> 32) + (((iArr[6] & BodyPartID.bodyIdMax) + j12) - j11) + j20 + j21;
        iArr2[6] = (int) j32;
        long j33 = (j32 >> 32) + ((((iArr[7] & BodyPartID.bodyIdMax) + j10) + j13) - j12) + j21;
        iArr2[7] = (int) j33;
        long j34 = (j33 >> 32) + (((((iArr[8] & BodyPartID.bodyIdMax) + j10) + j11) + j14) - j13);
        iArr2[8] = (int) j34;
        long j35 = (j34 >> 32) + (((iArr[9] & BodyPartID.bodyIdMax) + j12) - j14) + j22;
        iArr2[9] = (int) j35;
        long j36 = (j35 >> 32) + ((((iArr[10] & BodyPartID.bodyIdMax) + j12) + j13) - j23) + j24;
        iArr2[10] = (int) j36;
        long j37 = (j36 >> 32) + ((((iArr[11] & BodyPartID.bodyIdMax) + j13) + j14) - j24);
        iArr2[11] = (int) j37;
        i((int) ((j37 >> 32) + 1), iArr2);
    }

    public static void i(int i10, int[] iArr) {
        long j10;
        if (i10 != 0) {
            long j11 = i10 & BodyPartID.bodyIdMax;
            long j12 = (iArr[0] & BodyPartID.bodyIdMax) + j11;
            iArr[0] = (int) j12;
            long j13 = (j12 >> 32) + ((iArr[1] & BodyPartID.bodyIdMax) - j11);
            iArr[1] = (int) j13;
            long j14 = j13 >> 32;
            if (j14 != 0) {
                long j15 = j14 + (iArr[2] & BodyPartID.bodyIdMax);
                iArr[2] = (int) j15;
                j14 = j15 >> 32;
            }
            long j16 = j14 + (iArr[3] & BodyPartID.bodyIdMax) + j11;
            iArr[3] = (int) j16;
            long j17 = (j16 >> 32) + (BodyPartID.bodyIdMax & iArr[4]) + j11;
            iArr[4] = (int) j17;
            j10 = j17 >> 32;
        } else {
            j10 = 0;
        }
        if ((j10 == 0 || pj.m.s(12, iArr, 5) == 0) && !(iArr[11] == -1 && pj.m.p(12, iArr, f62758P))) {
            return;
        }
        d(iArr);
    }

    public static void j(int[] iArr, int[] iArr2) {
        int[] i10 = pj.m.i(24);
        pj.i.b(iArr, i10);
        h(i10, iArr2);
    }

    public static void k(int[] iArr, int i10, int[] iArr2) {
        int[] i11 = pj.m.i(24);
        pj.i.b(iArr, i11);
        h(i11, iArr2);
        while (true) {
            i10--;
            if (i10 <= 0) {
                return;
            }
            pj.i.b(iArr2, i11);
            h(i11, iArr2);
        }
    }

    public static void l(int[] iArr) {
        long j10 = (iArr[0] & BodyPartID.bodyIdMax) - 1;
        iArr[0] = (int) j10;
        long j11 = (j10 >> 32) + (iArr[1] & BodyPartID.bodyIdMax) + 1;
        iArr[1] = (int) j11;
        long j12 = j11 >> 32;
        if (j12 != 0) {
            long j13 = j12 + (iArr[2] & BodyPartID.bodyIdMax);
            iArr[2] = (int) j13;
            j12 = j13 >> 32;
        }
        long j14 = j12 + ((iArr[3] & BodyPartID.bodyIdMax) - 1);
        iArr[3] = (int) j14;
        long j15 = (j14 >> 32) + ((BodyPartID.bodyIdMax & iArr[4]) - 1);
        iArr[4] = (int) j15;
        if ((j15 >> 32) != 0) {
            pj.m.l(12, iArr, 5);
        }
    }

    public static void m(int[] iArr, int[] iArr2, int[] iArr3) {
        if (pj.m.J(12, iArr, iArr2, iArr3) != 0) {
            l(iArr3);
        }
    }

    public static void n(int[] iArr, int[] iArr2) {
        if (pj.m.D(12, iArr, 0, iArr2) != 0 || (iArr2[11] == -1 && pj.m.p(12, iArr2, f62758P))) {
            d(iArr2);
        }
    }
}
