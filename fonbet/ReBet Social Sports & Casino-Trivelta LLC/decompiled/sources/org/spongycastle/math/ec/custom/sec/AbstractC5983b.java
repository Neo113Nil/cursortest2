package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* renamed from: org.spongycastle.math.ec.custom.sec.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5983b {

    /* renamed from: P, reason: collision with root package name */
    static final int[] f62778P = {-1, -1, -1, -3};
    static final int[] PExt = {1, 0, 0, 4, -2, -1, 3, -4};
    private static final int[] PExtInv = {-1, -1, -1, -5, 1, 0, -4, 3};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (pj.c.a(iArr, iArr2, iArr3) != 0 || (iArr3[3] == -3 && pj.c.l(iArr3, f62778P))) {
            c(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (pj.m.r(4, iArr, iArr2) != 0 || (iArr2[3] == -3 && pj.c.l(iArr2, f62778P))) {
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
        iArr[3] = (int) (j11 + (BodyPartID.bodyIdMax & iArr[3]) + 2);
    }

    public static int[] d(BigInteger bigInteger) {
        int[] i10 = pj.c.i(bigInteger);
        if (i10[3] == -3) {
            int[] iArr = f62778P;
            if (pj.c.l(i10, iArr)) {
                pj.c.u(iArr, i10);
            }
        }
        return i10;
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] e10 = pj.c.e();
        pj.c.q(iArr, iArr2, e10);
        h(e10, iArr3);
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        if (pj.c.r(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -4 && pj.g.q(iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            pj.m.e(iArr4.length, iArr4, iArr3);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (pj.c.o(iArr)) {
            pj.c.x(iArr2);
        } else {
            pj.c.t(f62778P, iArr, iArr2);
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        long j10 = iArr[0] & BodyPartID.bodyIdMax;
        long j11 = iArr[1] & BodyPartID.bodyIdMax;
        long j12 = iArr[2] & BodyPartID.bodyIdMax;
        long j13 = iArr[3] & BodyPartID.bodyIdMax;
        long j14 = iArr[4] & BodyPartID.bodyIdMax;
        long j15 = iArr[5] & BodyPartID.bodyIdMax;
        long j16 = iArr[6] & BodyPartID.bodyIdMax;
        long j17 = iArr[7] & BodyPartID.bodyIdMax;
        long j18 = j13 + j17;
        long j19 = j16 + (j17 << 1);
        long j20 = j15 + (j19 << 1);
        long j21 = j11 + j20;
        long j22 = j14 + (j20 << 1);
        long j23 = j10 + j22;
        iArr2[0] = (int) j23;
        long j24 = j21 + (j23 >>> 32);
        iArr2[1] = (int) j24;
        long j25 = j12 + j19 + (j24 >>> 32);
        iArr2[2] = (int) j25;
        long j26 = j18 + (j22 << 1) + (j25 >>> 32);
        iArr2[3] = (int) j26;
        i((int) (j26 >>> 32), iArr2);
    }

    public static void i(int i10, int[] iArr) {
        while (i10 != 0) {
            long j10 = i10 & BodyPartID.bodyIdMax;
            long j11 = (iArr[0] & BodyPartID.bodyIdMax) + j10;
            iArr[0] = (int) j11;
            long j12 = j11 >> 32;
            if (j12 != 0) {
                long j13 = j12 + (iArr[1] & BodyPartID.bodyIdMax);
                iArr[1] = (int) j13;
                long j14 = (j13 >> 32) + (iArr[2] & BodyPartID.bodyIdMax);
                iArr[2] = (int) j14;
                j12 = j14 >> 32;
            }
            long j15 = j12 + (BodyPartID.bodyIdMax & iArr[3]) + (j10 << 1);
            iArr[3] = (int) j15;
            i10 = (int) (j15 >> 32);
        }
    }

    public static void j(int[] iArr, int[] iArr2) {
        int[] e10 = pj.c.e();
        pj.c.s(iArr, e10);
        h(e10, iArr2);
    }

    public static void k(int[] iArr, int i10, int[] iArr2) {
        int[] e10 = pj.c.e();
        pj.c.s(iArr, e10);
        h(e10, iArr2);
        while (true) {
            i10--;
            if (i10 <= 0) {
                return;
            }
            pj.c.s(iArr2, e10);
            h(e10, iArr2);
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
        iArr[3] = (int) (j11 + ((BodyPartID.bodyIdMax & iArr[3]) - 2));
    }

    public static void m(int[] iArr, int[] iArr2, int[] iArr3) {
        if (pj.c.t(iArr, iArr2, iArr3) != 0) {
            l(iArr3);
        }
    }

    public static void n(int[] iArr, int[] iArr2) {
        if (pj.m.D(4, iArr, 0, iArr2) != 0 || (iArr2[3] == -3 && pj.c.l(iArr2, f62778P))) {
            c(iArr2);
        }
    }
}
