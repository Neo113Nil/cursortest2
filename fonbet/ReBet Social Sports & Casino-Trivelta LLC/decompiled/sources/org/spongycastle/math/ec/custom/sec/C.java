package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class C extends org.spongycastle.math.ec.e {

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f62738g = A.f62735j;

    /* renamed from: x, reason: collision with root package name */
    protected int[] f62739x;

    public C(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f62738g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224R1FieldElement");
        }
        this.f62739x = B.d(bigInteger);
    }

    public static void u(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7) {
        B.e(iArr5, iArr3, iArr7);
        B.e(iArr7, iArr, iArr7);
        B.e(iArr4, iArr2, iArr6);
        B.a(iArr6, iArr7, iArr6);
        B.e(iArr4, iArr3, iArr7);
        pj.f.c(iArr6, iArr4);
        B.e(iArr5, iArr2, iArr5);
        B.a(iArr5, iArr7, iArr5);
        B.j(iArr5, iArr6);
        B.e(iArr6, iArr, iArr6);
    }

    public static void v(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5) {
        pj.f.c(iArr, iArr4);
        int[] d10 = pj.f.d();
        int[] d11 = pj.f.d();
        for (int i10 = 0; i10 < 7; i10++) {
            pj.f.c(iArr2, d10);
            pj.f.c(iArr3, d11);
            int i11 = 1 << i10;
            while (true) {
                i11--;
                if (i11 >= 0) {
                    w(iArr2, iArr3, iArr4, iArr5);
                }
            }
            u(iArr, d10, d11, iArr2, iArr3, iArr4, iArr5);
        }
    }

    public static void w(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        B.e(iArr2, iArr, iArr2);
        B.n(iArr2, iArr2);
        B.j(iArr, iArr4);
        B.a(iArr3, iArr4, iArr);
        B.e(iArr3, iArr4, iArr3);
        B.i(pj.m.F(7, iArr3, 2, 0), iArr3);
    }

    public static boolean x(int[] iArr) {
        int[] d10 = pj.f.d();
        int[] d11 = pj.f.d();
        pj.f.c(iArr, d10);
        for (int i10 = 0; i10 < 7; i10++) {
            pj.f.c(d10, d11);
            B.k(d10, 1 << i10, d10);
            B.e(d10, d11, d10);
        }
        B.k(d10, 95, d10);
        return pj.f.j(d10);
    }

    public static boolean y(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] d10 = pj.f.d();
        pj.f.c(iArr2, d10);
        int[] d11 = pj.f.d();
        d11[0] = 1;
        int[] d12 = pj.f.d();
        v(iArr, d10, d11, d12, iArr3);
        int[] d13 = pj.f.d();
        int[] d14 = pj.f.d();
        for (int i10 = 1; i10 < 96; i10++) {
            pj.f.c(d10, d13);
            pj.f.c(d11, d14);
            w(d10, d11, d12, iArr3);
            if (pj.f.k(d10)) {
                pj.b.d(B.f62737P, d14, iArr3);
                B.e(iArr3, d13, iArr3);
                return true;
            }
        }
        return false;
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e a(org.spongycastle.math.ec.e eVar) {
        int[] d10 = pj.f.d();
        B.a(this.f62739x, ((C) eVar).f62739x, d10);
        return new C(d10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e b() {
        int[] d10 = pj.f.d();
        B.b(this.f62739x, d10);
        return new C(d10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e d(org.spongycastle.math.ec.e eVar) {
        int[] d10 = pj.f.d();
        pj.b.d(B.f62737P, ((C) eVar).f62739x, d10);
        B.e(d10, this.f62739x, d10);
        return new C(d10);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C) {
            return pj.f.f(this.f62739x, ((C) obj).f62739x);
        }
        return false;
    }

    @Override // org.spongycastle.math.ec.e
    public int f() {
        return f62738g.bitLength();
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e g() {
        int[] d10 = pj.f.d();
        pj.b.d(B.f62737P, this.f62739x, d10);
        return new C(d10);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean h() {
        return pj.f.j(this.f62739x);
    }

    public int hashCode() {
        return f62738g.hashCode() ^ Aj.a.t(this.f62739x, 0, 7);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean i() {
        return pj.f.k(this.f62739x);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e j(org.spongycastle.math.ec.e eVar) {
        int[] d10 = pj.f.d();
        B.e(this.f62739x, ((C) eVar).f62739x, d10);
        return new C(d10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e m() {
        int[] d10 = pj.f.d();
        B.g(this.f62739x, d10);
        return new C(d10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e n() {
        int[] iArr = this.f62739x;
        if (pj.f.k(iArr) || pj.f.j(iArr)) {
            return this;
        }
        int[] d10 = pj.f.d();
        B.g(iArr, d10);
        int[] e10 = pj.b.e(B.f62737P);
        int[] d11 = pj.f.d();
        if (!x(iArr)) {
            return null;
        }
        while (!y(d10, e10, d11)) {
            B.b(e10, e10);
        }
        B.j(d11, e10);
        if (pj.f.f(iArr, e10)) {
            return new C(d11);
        }
        return null;
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e o() {
        int[] d10 = pj.f.d();
        B.j(this.f62739x, d10);
        return new C(d10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e r(org.spongycastle.math.ec.e eVar) {
        int[] d10 = pj.f.d();
        B.m(this.f62739x, ((C) eVar).f62739x, d10);
        return new C(d10);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean s() {
        return pj.f.h(this.f62739x, 0) == 1;
    }

    @Override // org.spongycastle.math.ec.e
    public BigInteger t() {
        return pj.f.t(this.f62739x);
    }

    public C(int[] iArr) {
        this.f62739x = iArr;
    }
}
