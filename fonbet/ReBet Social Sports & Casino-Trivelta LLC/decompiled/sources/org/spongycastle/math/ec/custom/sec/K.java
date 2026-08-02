package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class K extends org.spongycastle.math.ec.e {

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f62753g = I.f62749j;

    /* renamed from: x, reason: collision with root package name */
    protected int[] f62754x;

    public K(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f62753g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256R1FieldElement");
        }
        this.f62754x = J.d(bigInteger);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e a(org.spongycastle.math.ec.e eVar) {
        int[] f10 = pj.g.f();
        J.a(this.f62754x, ((K) eVar).f62754x, f10);
        return new K(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e b() {
        int[] f10 = pj.g.f();
        J.b(this.f62754x, f10);
        return new K(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e d(org.spongycastle.math.ec.e eVar) {
        int[] f10 = pj.g.f();
        pj.b.d(J.f62751P, ((K) eVar).f62754x, f10);
        J.e(f10, this.f62754x, f10);
        return new K(f10);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof K) {
            return pj.g.k(this.f62754x, ((K) obj).f62754x);
        }
        return false;
    }

    @Override // org.spongycastle.math.ec.e
    public int f() {
        return f62753g.bitLength();
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e g() {
        int[] f10 = pj.g.f();
        pj.b.d(J.f62751P, this.f62754x, f10);
        return new K(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean h() {
        return pj.g.r(this.f62754x);
    }

    public int hashCode() {
        return f62753g.hashCode() ^ Aj.a.t(this.f62754x, 0, 8);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean i() {
        return pj.g.t(this.f62754x);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e j(org.spongycastle.math.ec.e eVar) {
        int[] f10 = pj.g.f();
        J.e(this.f62754x, ((K) eVar).f62754x, f10);
        return new K(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e m() {
        int[] f10 = pj.g.f();
        J.g(this.f62754x, f10);
        return new K(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e n() {
        int[] iArr = this.f62754x;
        if (pj.g.t(iArr) || pj.g.r(iArr)) {
            return this;
        }
        int[] f10 = pj.g.f();
        int[] f11 = pj.g.f();
        J.j(iArr, f10);
        J.e(f10, iArr, f10);
        J.k(f10, 2, f11);
        J.e(f11, f10, f11);
        J.k(f11, 4, f10);
        J.e(f10, f11, f10);
        J.k(f10, 8, f11);
        J.e(f11, f10, f11);
        J.k(f11, 16, f10);
        J.e(f10, f11, f10);
        J.k(f10, 32, f10);
        J.e(f10, iArr, f10);
        J.k(f10, 96, f10);
        J.e(f10, iArr, f10);
        J.k(f10, 94, f10);
        J.j(f10, f11);
        if (pj.g.k(iArr, f11)) {
            return new K(f10);
        }
        return null;
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e o() {
        int[] f10 = pj.g.f();
        J.j(this.f62754x, f10);
        return new K(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e r(org.spongycastle.math.ec.e eVar) {
        int[] f10 = pj.g.f();
        J.m(this.f62754x, ((K) eVar).f62754x, f10);
        return new K(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean s() {
        return pj.g.o(this.f62754x, 0) == 1;
    }

    @Override // org.spongycastle.math.ec.e
    public BigInteger t() {
        return pj.g.H(this.f62754x);
    }

    public K(int[] iArr) {
        this.f62754x = iArr;
    }
}
