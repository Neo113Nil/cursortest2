package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes5.dex */
public abstract class B {

    /* renamed from: P, reason: collision with root package name */
    static final int[] f62737P = {1, 0, 0, -1, -1, -1, -1};
    static final int[] PExt = {1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};
    private static final int[] PExtInv = {-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (pj.f.a(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && pj.f.i(iArr3, f62737P))) {
            c(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (pj.m.r(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && pj.f.i(iArr2, f62737P))) {
            c(iArr2);
        }
    }

    public static void c(int[] iArr) {
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
        long j14 = j11 + (BodyPartID.bodyIdMax & iArr[3]) + 1;
        iArr[3] = (int) j14;
        if ((j14 >> 32) != 0) {
            pj.m.s(7, iArr, 4);
        }
    }

    public static int[] d(BigInteger bigInteger) {
        int[] g10 = pj.f.g(bigInteger);
        if (g10[6] == -1) {
            int[] iArr = f62737P;
            if (pj.f.i(g10, iArr)) {
                pj.f.s(iArr, g10);
            }
        }
        return g10;
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] e10 = pj.f.e();
        pj.f.l(iArr, iArr2, e10);
        h(e10, iArr3);
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        if (pj.f.p(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && pj.m.p(14, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (pj.m.e(iArr4.length, iArr4, iArr3) != 0) {
                pj.m.s(14, iArr3, iArr4.length);
            }
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (pj.f.k(iArr)) {
            pj.f.u(iArr2);
        } else {
            pj.f.r(f62737P, iArr, iArr2);
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        long j10 = iArr[10] & BodyPartID.bodyIdMax;
        long j11 = iArr[11] & BodyPartID.bodyIdMax;
        long j12 = iArr[12] & BodyPartID.bodyIdMax;
        long j13 = iArr[13] & BodyPartID.bodyIdMax;
        long j14 = ((iArr[7] & BodyPartID.bodyIdMax) + j11) - 1;
        long j15 = (iArr[8] & BodyPartID.bodyIdMax) + j12;
        long j16 = (iArr[9] & BodyPartID.bodyIdMax) + j13;
        long j17 = (iArr[0] & BodyPartID.bodyIdMax) - j14;
        long j18 = j17 & BodyPartID.bodyIdMax;
        long j19 = (j17 >> 32) + ((iArr[1] & BodyPartID.bodyIdMax) - j15);
        int i10 = (int) j19;
        iArr2[1] = i10;
        long j20 = (j19 >> 32) + ((iArr[2] & BodyPartID.bodyIdMax) - j16);
        int i11 = (int) j20;
        iArr2[2] = i11;
        long j21 = (j20 >> 32) + (((iArr[3] & BodyPartID.bodyIdMax) + j14) - j10);
        long j22 = j21 & BodyPartID.bodyIdMax;
        long j23 = (j21 >> 32) + (((iArr[4] & BodyPartID.bodyIdMax) + j15) - j11);
        iArr2[4] = (int) j23;
        long j24 = (j23 >> 32) + (((iArr[5] & BodyPartID.bodyIdMax) + j16) - j12);
        iArr2[5] = (int) j24;
        long j25 = (j24 >> 32) + (((iArr[6] & BodyPartID.bodyIdMax) + j10) - j13);
        iArr2[6] = (int) j25;
        long j26 = (j25 >> 32) + 1;
        long j27 = j22 + j26;
        long j28 = j18 - j26;
        iArr2[0] = (int) j28;
        long j29 = j28 >> 32;
        if (j29 != 0) {
            long j30 = j29 + (i10 & BodyPartID.bodyIdMax);
            iArr2[1] = (int) j30;
            long j31 = (j30 >> 32) + (i11 & BodyPartID.bodyIdMax);
            iArr2[2] = (int) j31;
            j27 += j31 >> 32;
        }
        iArr2[3] = (int) j27;
        if (((j27 >> 32) == 0 || pj.m.s(7, iArr2, 4) == 0) && !(iArr2[6] == -1 && pj.f.i(iArr2, f62737P))) {
            return;
        }
        c(iArr2);
    }

    public static void i(int i10, int[] iArr) {
        long j10;
        if (i10 != 0) {
            long j11 = i10 & BodyPartID.bodyIdMax;
            long j12 = (iArr[0] & BodyPartID.bodyIdMax) - j11;
            iArr[0] = (int) j12;
            long j13 = j12 >> 32;
            if (j13 != 0) {
                long j14 = j13 + (iArr[1] & BodyPartID.bodyIdMax);
                iArr[1] = (int) j14;
                long j15 = (j14 >> 32) + (iArr[2] & BodyPartID.bodyIdMax);
                iArr[2] = (int) j15;
                j13 = j15 >> 32;
            }
            long j16 = j13 + (BodyPartID.bodyIdMax & iArr[3]) + j11;
            iArr[3] = (int) j16;
            j10 = j16 >> 32;
        } else {
            j10 = 0;
        }
        if ((j10 == 0 || pj.m.s(7, iArr, 4) == 0) && !(iArr[6] == -1 && pj.f.i(iArr, f62737P))) {
            return;
        }
        c(iArr);
    }

    public static void j(int[] iArr, int[] iArr2) {
        int[] e10 = pj.f.e();
        pj.f.q(iArr, e10);
        h(e10, iArr2);
    }

    public static void k(int[] iArr, int i10, int[] iArr2) {
        int[] e10 = pj.f.e();
        pj.f.q(iArr, e10);
        h(e10, iArr2);
        while (true) {
            i10--;
            if (i10 <= 0) {
                return;
            }
            pj.f.q(iArr2, e10);
            h(e10, iArr2);
        }
    }

    public static void l(int[] iArr) {
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
        long j14 = j11 + ((BodyPartID.bodyIdMax & iArr[3]) - 1);
        iArr[3] = (int) j14;
        if ((j14 >> 32) != 0) {
            pj.m.l(7, iArr, 4);
        }
    }

    public static void m(int[] iArr, int[] iArr2, int[] iArr3) {
        if (pj.f.r(iArr, iArr2, iArr3) != 0) {
            l(iArr3);
        }
    }

    public static void n(int[] iArr, int[] iArr2) {
        if (pj.m.D(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && pj.f.i(iArr2, f62737P))) {
            c(iArr2);
        }
    }
}
