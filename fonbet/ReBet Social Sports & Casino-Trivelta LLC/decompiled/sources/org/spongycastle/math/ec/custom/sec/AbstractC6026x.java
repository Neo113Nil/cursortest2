package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;

/* renamed from: org.spongycastle.math.ec.custom.sec.x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6026x {

    /* renamed from: P, reason: collision with root package name */
    static final int[] f62816P = {-6803, -2, -1, -1, -1, -1, -1};
    static final int[] PExt = {46280809, 13606, 1, 0, 0, 0, 0, -13606, -3, -1, -1, -1, -1, -1};
    private static final int[] PExtInv = {-46280809, -13607, -2, -1, -1, -1, -1, 13605, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (pj.f.a(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && pj.f.i(iArr3, f62816P))) {
            pj.m.b(7, 6803, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (pj.m.r(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && pj.f.i(iArr2, f62816P))) {
            pj.m.b(7, 6803, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] g10 = pj.f.g(bigInteger);
        if (g10[6] == -1 && pj.f.i(g10, f62816P)) {
            pj.m.b(7, 6803, g10);
        }
        return g10;
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] e10 = pj.f.e();
        pj.f.l(iArr, iArr2, e10);
        g(e10, iArr3);
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        if (pj.f.p(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && pj.m.p(14, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (pj.m.e(iArr4.length, iArr4, iArr3) != 0) {
                pj.m.s(14, iArr3, iArr4.length);
            }
        }
    }

    public static void f(int[] iArr, int[] iArr2) {
        if (pj.f.k(iArr)) {
            pj.f.u(iArr2);
        } else {
            pj.f.r(f62816P, iArr, iArr2);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (pj.f.n(6803, pj.f.m(6803, iArr, 7, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[6] == -1 && pj.f.i(iArr2, f62816P))) {
            pj.m.b(7, 6803, iArr2);
        }
    }

    public static void h(int i10, int[] iArr) {
        if ((i10 == 0 || pj.f.o(6803, i10, iArr, 0) == 0) && !(iArr[6] == -1 && pj.f.i(iArr, f62816P))) {
            return;
        }
        pj.m.b(7, 6803, iArr);
    }

    public static void i(int[] iArr, int[] iArr2) {
        int[] e10 = pj.f.e();
        pj.f.q(iArr, e10);
        g(e10, iArr2);
    }

    public static void j(int[] iArr, int i10, int[] iArr2) {
        int[] e10 = pj.f.e();
        pj.f.q(iArr, e10);
        g(e10, iArr2);
        while (true) {
            i10--;
            if (i10 <= 0) {
                return;
            }
            pj.f.q(iArr2, e10);
            g(e10, iArr2);
        }
    }

    public static void k(int[] iArr, int[] iArr2, int[] iArr3) {
        if (pj.f.r(iArr, iArr2, iArr3) != 0) {
            pj.m.K(7, 6803, iArr3);
        }
    }

    public static void l(int[] iArr, int[] iArr2) {
        if (pj.m.D(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && pj.f.i(iArr2, f62816P))) {
            pj.m.b(7, 6803, iArr2);
        }
    }
}
