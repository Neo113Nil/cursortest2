package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* renamed from: org.spongycastle.math.ec.custom.sec.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6018t {

    /* renamed from: P, reason: collision with root package name */
    static final int[] f62809P = {-1, -1, -2, -1, -1, -1};
    static final int[] PExt = {1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};
    private static final int[] PExtInv = {-1, -1, -3, -1, -2, -1, 1, 0, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (pj.e.a(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && pj.e.p(iArr3, f62809P))) {
            c(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (pj.m.r(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && pj.e.p(iArr2, f62809P))) {
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
            j11 = j12 >> 32;
        }
        long j13 = j11 + (BodyPartID.bodyIdMax & iArr[2]) + 1;
        iArr[2] = (int) j13;
        if ((j13 >> 32) != 0) {
            pj.m.s(6, iArr, 3);
        }
    }

    public static int[] d(BigInteger bigInteger) {
        int[] l10 = pj.e.l(bigInteger);
        if (l10[5] == -1) {
            int[] iArr = f62809P;
            if (pj.e.p(l10, iArr)) {
                pj.e.E(iArr, l10);
            }
        }
        return l10;
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] g10 = pj.e.g();
        pj.e.v(iArr, iArr2, g10);
        h(g10, iArr3);
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        if (pj.e.z(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && pj.m.p(12, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (pj.m.e(iArr4.length, iArr4, iArr3) != 0) {
                pj.m.s(12, iArr3, iArr4.length);
            }
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (pj.e.s(iArr)) {
            pj.e.H(iArr2);
        } else {
            pj.e.D(f62809P, iArr, iArr2);
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        long j10 = iArr[6] & BodyPartID.bodyIdMax;
        long j11 = iArr[7] & BodyPartID.bodyIdMax;
        long j12 = iArr[8] & BodyPartID.bodyIdMax;
        long j13 = iArr[9] & BodyPartID.bodyIdMax;
        long j14 = (iArr[10] & BodyPartID.bodyIdMax) + j10;
        long j15 = (iArr[11] & BodyPartID.bodyIdMax) + j11;
        long j16 = (iArr[0] & BodyPartID.bodyIdMax) + j14;
        int i10 = (int) j16;
        long j17 = (j16 >> 32) + (iArr[1] & BodyPartID.bodyIdMax) + j15;
        int i11 = (int) j17;
        iArr2[1] = i11;
        long j18 = j14 + j12;
        long j19 = j15 + j13;
        long j20 = (j17 >> 32) + (iArr[2] & BodyPartID.bodyIdMax) + j18;
        long j21 = j20 & BodyPartID.bodyIdMax;
        long j22 = (j20 >> 32) + (iArr[3] & BodyPartID.bodyIdMax) + j19;
        iArr2[3] = (int) j22;
        long j23 = (j22 >> 32) + (iArr[4] & BodyPartID.bodyIdMax) + (j18 - j10);
        iArr2[4] = (int) j23;
        long j24 = (j23 >> 32) + (iArr[5] & BodyPartID.bodyIdMax) + (j19 - j11);
        iArr2[5] = (int) j24;
        long j25 = j24 >> 32;
        long j26 = j21 + j25;
        long j27 = j25 + (i10 & BodyPartID.bodyIdMax);
        iArr2[0] = (int) j27;
        long j28 = j27 >> 32;
        if (j28 != 0) {
            long j29 = j28 + (i11 & BodyPartID.bodyIdMax);
            iArr2[1] = (int) j29;
            j26 += j29 >> 32;
        }
        iArr2[2] = (int) j26;
        if (((j26 >> 32) == 0 || pj.m.s(6, iArr2, 3) == 0) && !(iArr2[5] == -1 && pj.e.p(iArr2, f62809P))) {
            return;
        }
        c(iArr2);
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
                j13 = j14 >> 32;
            }
            long j15 = j13 + (BodyPartID.bodyIdMax & iArr[2]) + j11;
            iArr[2] = (int) j15;
            j10 = j15 >> 32;
        } else {
            j10 = 0;
        }
        if ((j10 == 0 || pj.m.s(6, iArr, 3) == 0) && !(iArr[5] == -1 && pj.e.p(iArr, f62809P))) {
            return;
        }
        c(iArr);
    }

    public static void j(int[] iArr, int[] iArr2) {
        int[] g10 = pj.e.g();
        pj.e.B(iArr, g10);
        h(g10, iArr2);
    }

    public static void k(int[] iArr, int i10, int[] iArr2) {
        int[] g10 = pj.e.g();
        pj.e.B(iArr, g10);
        h(g10, iArr2);
        while (true) {
            i10--;
            if (i10 <= 0) {
                return;
            }
            pj.e.B(iArr2, g10);
            h(g10, iArr2);
        }
    }

    public static void l(int[] iArr) {
        long j10 = (iArr[0] & BodyPartID.bodyIdMax) - 1;
        iArr[0] = (int) j10;
        long j11 = j10 >> 32;
        if (j11 != 0) {
            long j12 = j11 + (iArr[1] & BodyPartID.bodyIdMax);
            iArr[1] = (int) j12;
            j11 = j12 >> 32;
        }
        long j13 = j11 + ((BodyPartID.bodyIdMax & iArr[2]) - 1);
        iArr[2] = (int) j13;
        if ((j13 >> 32) != 0) {
            pj.m.l(6, iArr, 3);
        }
    }

    public static void m(int[] iArr, int[] iArr2, int[] iArr3) {
        if (pj.e.D(iArr, iArr2, iArr3) != 0) {
            l(iArr3);
        }
    }

    public static void n(int[] iArr, int[] iArr2) {
        if (pj.m.D(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && pj.e.p(iArr2, f62809P))) {
            c(iArr2);
        }
    }
}
