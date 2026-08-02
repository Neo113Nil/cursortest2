package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes5.dex */
public abstract class J {

    /* renamed from: P, reason: collision with root package name */
    static final int[] f62751P = {-1, -1, -1, 0, 0, 0, 1, -1};
    static final int[] PExt = {1, 0, 0, -2, -1, -1, -2, 1, -2, 1, -2, 1, 1, -2, 2, -2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (pj.g.a(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && pj.g.q(iArr3, f62751P))) {
            c(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (pj.m.r(8, iArr, iArr2) != 0 || (iArr2[7] == -1 && pj.g.q(iArr2, f62751P))) {
            c(iArr2);
        }
    }

    public static void c(int[] iArr) {
        long j10 = (iArr[0] & BodyPartID.bodyIdMax) + 1;
        iArr[0] = (int) j10;
        long j11 = j10 >> 32;
        if (j11 != 0) {
            long j12 = j11 + (iArr[1] & BodyPartID.bodyIdMax);
            iArr[1] = (int) j12;
            long j13 = (j12 >> 32) + (iArr[2] & BodyPartID.bodyIdMax);
            iArr[2] = (int) j13;
            j11 = j13 >> 32;
        }
        long j14 = j11 + ((iArr[3] & BodyPartID.bodyIdMax) - 1);
        iArr[3] = (int) j14;
        long j15 = j14 >> 32;
        if (j15 != 0) {
            long j16 = j15 + (iArr[4] & BodyPartID.bodyIdMax);
            iArr[4] = (int) j16;
            long j17 = (j16 >> 32) + (iArr[5] & BodyPartID.bodyIdMax);
            iArr[5] = (int) j17;
            j15 = j17 >> 32;
        }
        long j18 = j15 + ((iArr[6] & BodyPartID.bodyIdMax) - 1);
        iArr[6] = (int) j18;
        iArr[7] = (int) ((j18 >> 32) + (BodyPartID.bodyIdMax & iArr[7]) + 1);
    }

    public static int[] d(BigInteger bigInteger) {
        int[] m10 = pj.g.m(bigInteger);
        if (m10[7] == -1) {
            int[] iArr = f62751P;
            if (pj.g.q(m10, iArr)) {
                pj.g.G(iArr, m10);
            }
        }
        return m10;
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] h10 = pj.g.h();
        pj.g.w(iArr, iArr2, h10);
        h(h10, iArr3);
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        if (pj.g.A(iArr, iArr2, iArr3) != 0 || (iArr3[15] == -1 && pj.m.p(16, iArr3, PExt))) {
            pj.m.M(16, PExt, iArr3);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (pj.g.t(iArr)) {
            pj.g.J(iArr2);
        } else {
            pj.g.F(f62751P, iArr, iArr2);
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        long j10 = iArr[8] & BodyPartID.bodyIdMax;
        long j11 = iArr[9] & BodyPartID.bodyIdMax;
        long j12 = iArr[10] & BodyPartID.bodyIdMax;
        long j13 = iArr[11] & BodyPartID.bodyIdMax;
        long j14 = iArr[12] & BodyPartID.bodyIdMax;
        long j15 = iArr[13] & BodyPartID.bodyIdMax;
        long j16 = iArr[14] & BodyPartID.bodyIdMax;
        long j17 = iArr[15] & BodyPartID.bodyIdMax;
        long j18 = j10 - 6;
        long j19 = j18 + j11;
        long j20 = j11 + j12;
        long j21 = (j12 + j13) - j17;
        long j22 = j13 + j14;
        long j23 = j14 + j15;
        long j24 = j15 + j16;
        long j25 = j16 + j17;
        long j26 = j24 - j19;
        long j27 = ((iArr[0] & BodyPartID.bodyIdMax) - j22) - j26;
        iArr2[0] = (int) j27;
        long j28 = (j27 >> 32) + ((((iArr[1] & BodyPartID.bodyIdMax) + j20) - j23) - j25);
        iArr2[1] = (int) j28;
        long j29 = (j28 >> 32) + (((iArr[2] & BodyPartID.bodyIdMax) + j21) - j24);
        iArr2[2] = (int) j29;
        long j30 = (j29 >> 32) + ((((iArr[3] & BodyPartID.bodyIdMax) + (j22 << 1)) + j26) - j25);
        iArr2[3] = (int) j30;
        long j31 = (j30 >> 32) + ((((iArr[4] & BodyPartID.bodyIdMax) + (j23 << 1)) + j16) - j20);
        iArr2[4] = (int) j31;
        long j32 = (j31 >> 32) + (((iArr[5] & BodyPartID.bodyIdMax) + (j24 << 1)) - j21);
        iArr2[5] = (int) j32;
        long j33 = (j32 >> 32) + (iArr[6] & BodyPartID.bodyIdMax) + (j25 << 1) + j26;
        iArr2[6] = (int) j33;
        long j34 = (j33 >> 32) + (((((iArr[7] & BodyPartID.bodyIdMax) + (j17 << 1)) + j18) - j21) - j23);
        iArr2[7] = (int) j34;
        i((int) ((j34 >> 32) + 6), iArr2);
    }

    public static void i(int i10, int[] iArr) {
        long j10;
        if (i10 != 0) {
            long j11 = i10 & BodyPartID.bodyIdMax;
            long j12 = (iArr[0] & BodyPartID.bodyIdMax) + j11;
            iArr[0] = (int) j12;
            long j13 = j12 >> 32;
            if (j13 != 0) {
                long j14 = j13 + (iArr[1] & BodyPartID.bodyIdMax);
                iArr[1] = (int) j14;
                long j15 = (j14 >> 32) + (iArr[2] & BodyPartID.bodyIdMax);
                iArr[2] = (int) j15;
                j13 = j15 >> 32;
            }
            long j16 = j13 + ((iArr[3] & BodyPartID.bodyIdMax) - j11);
            iArr[3] = (int) j16;
            long j17 = j16 >> 32;
            if (j17 != 0) {
                long j18 = j17 + (iArr[4] & BodyPartID.bodyIdMax);
                iArr[4] = (int) j18;
                long j19 = (j18 >> 32) + (iArr[5] & BodyPartID.bodyIdMax);
                iArr[5] = (int) j19;
                j17 = j19 >> 32;
            }
            long j20 = j17 + ((iArr[6] & BodyPartID.bodyIdMax) - j11);
            iArr[6] = (int) j20;
            long j21 = (j20 >> 32) + (BodyPartID.bodyIdMax & iArr[7]) + j11;
            iArr[7] = (int) j21;
            j10 = j21 >> 32;
        } else {
            j10 = 0;
        }
        if (j10 != 0 || (iArr[7] == -1 && pj.g.q(iArr, f62751P))) {
            c(iArr);
        }
    }

    public static void j(int[] iArr, int[] iArr2) {
        int[] h10 = pj.g.h();
        pj.g.D(iArr, h10);
        h(h10, iArr2);
    }

    public static void k(int[] iArr, int i10, int[] iArr2) {
        int[] h10 = pj.g.h();
        pj.g.D(iArr, h10);
        h(h10, iArr2);
        while (true) {
            i10--;
            if (i10 <= 0) {
                return;
            }
            pj.g.D(iArr2, h10);
            h(h10, iArr2);
        }
    }

    public static void l(int[] iArr) {
        long j10 = (iArr[0] & BodyPartID.bodyIdMax) - 1;
        iArr[0] = (int) j10;
        long j11 = j10 >> 32;
        if (j11 != 0) {
            long j12 = j11 + (iArr[1] & BodyPartID.bodyIdMax);
            iArr[1] = (int) j12;
            long j13 = (j12 >> 32) + (iArr[2] & BodyPartID.bodyIdMax);
            iArr[2] = (int) j13;
            j11 = j13 >> 32;
        }
        long j14 = j11 + (iArr[3] & BodyPartID.bodyIdMax) + 1;
        iArr[3] = (int) j14;
        long j15 = j14 >> 32;
        if (j15 != 0) {
            long j16 = j15 + (iArr[4] & BodyPartID.bodyIdMax);
            iArr[4] = (int) j16;
            long j17 = (j16 >> 32) + (iArr[5] & BodyPartID.bodyIdMax);
            iArr[5] = (int) j17;
            j15 = j17 >> 32;
        }
        long j18 = j15 + (iArr[6] & BodyPartID.bodyIdMax) + 1;
        iArr[6] = (int) j18;
        iArr[7] = (int) ((j18 >> 32) + ((BodyPartID.bodyIdMax & iArr[7]) - 1));
    }

    public static void m(int[] iArr, int[] iArr2, int[] iArr3) {
        if (pj.g.F(iArr, iArr2, iArr3) != 0) {
            l(iArr3);
        }
    }

    public static void n(int[] iArr, int[] iArr2) {
        if (pj.m.D(8, iArr, 0, iArr2) != 0 || (iArr2[7] == -1 && pj.g.q(iArr2, f62751P))) {
            c(iArr2);
        }
    }
}
