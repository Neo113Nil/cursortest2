package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class G extends org.spongycastle.math.ec.e {

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f62745g = E.f62742j;

    /* renamed from: x, reason: collision with root package name */
    protected int[] f62746x;

    public G(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f62745g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256K1FieldElement");
        }
        this.f62746x = F.c(bigInteger);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e a(org.spongycastle.math.ec.e eVar) {
        int[] f10 = pj.g.f();
        F.a(this.f62746x, ((G) eVar).f62746x, f10);
        return new G(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e b() {
        int[] f10 = pj.g.f();
        F.b(this.f62746x, f10);
        return new G(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e d(org.spongycastle.math.ec.e eVar) {
        int[] f10 = pj.g.f();
        pj.b.d(F.f62744P, ((G) eVar).f62746x, f10);
        F.d(f10, this.f62746x, f10);
        return new G(f10);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof G) {
            return pj.g.k(this.f62746x, ((G) obj).f62746x);
        }
        return false;
    }

    @Override // org.spongycastle.math.ec.e
    public int f() {
        return f62745g.bitLength();
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e g() {
        int[] f10 = pj.g.f();
        pj.b.d(F.f62744P, this.f62746x, f10);
        return new G(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean h() {
        return pj.g.r(this.f62746x);
    }

    public int hashCode() {
        return f62745g.hashCode() ^ Aj.a.t(this.f62746x, 0, 8);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean i() {
        return pj.g.t(this.f62746x);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e j(org.spongycastle.math.ec.e eVar) {
        int[] f10 = pj.g.f();
        F.d(this.f62746x, ((G) eVar).f62746x, f10);
        return new G(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e m() {
        int[] f10 = pj.g.f();
        F.f(this.f62746x, f10);
        return new G(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e n() {
        int[] iArr = this.f62746x;
        if (pj.g.t(iArr) || pj.g.r(iArr)) {
            return this;
        }
        int[] f10 = pj.g.f();
        F.i(iArr, f10);
        F.d(f10, iArr, f10);
        int[] f11 = pj.g.f();
        F.i(f10, f11);
        F.d(f11, iArr, f11);
        int[] f12 = pj.g.f();
        F.j(f11, 3, f12);
        F.d(f12, f11, f12);
        F.j(f12, 3, f12);
        F.d(f12, f11, f12);
        F.j(f12, 2, f12);
        F.d(f12, f10, f12);
        int[] f13 = pj.g.f();
        F.j(f12, 11, f13);
        F.d(f13, f12, f13);
        F.j(f13, 22, f12);
        F.d(f12, f13, f12);
        int[] f14 = pj.g.f();
        F.j(f12, 44, f14);
        F.d(f14, f12, f14);
        int[] f15 = pj.g.f();
        F.j(f14, 88, f15);
        F.d(f15, f14, f15);
        F.j(f15, 44, f14);
        F.d(f14, f12, f14);
        F.j(f14, 3, f12);
        F.d(f12, f11, f12);
        F.j(f12, 23, f12);
        F.d(f12, f13, f12);
        F.j(f12, 6, f12);
        F.d(f12, f10, f12);
        F.j(f12, 2, f12);
        F.i(f12, f10);
        if (pj.g.k(iArr, f10)) {
            return new G(f12);
        }
        return null;
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e o() {
        int[] f10 = pj.g.f();
        F.i(this.f62746x, f10);
        return new G(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e r(org.spongycastle.math.ec.e eVar) {
        int[] f10 = pj.g.f();
        F.k(this.f62746x, ((G) eVar).f62746x, f10);
        return new G(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean s() {
        return pj.g.o(this.f62746x, 0) == 1;
    }

    @Override // org.spongycastle.math.ec.e
    public BigInteger t() {
        return pj.g.H(this.f62746x);
    }

    public G(int[] iArr) {
        this.f62746x = iArr;
    }
}
