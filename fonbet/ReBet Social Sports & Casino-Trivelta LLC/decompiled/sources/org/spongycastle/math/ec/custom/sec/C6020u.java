package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;

/* renamed from: org.spongycastle.math.ec.custom.sec.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6020u extends org.spongycastle.math.ec.e {

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f62811g = C6016s.f62807j;

    /* renamed from: x, reason: collision with root package name */
    protected int[] f62812x;

    public C6020u(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f62811g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192R1FieldElement");
        }
        this.f62812x = AbstractC6018t.d(bigInteger);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e a(org.spongycastle.math.ec.e eVar) {
        int[] e10 = pj.e.e();
        AbstractC6018t.a(this.f62812x, ((C6020u) eVar).f62812x, e10);
        return new C6020u(e10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e b() {
        int[] e10 = pj.e.e();
        AbstractC6018t.b(this.f62812x, e10);
        return new C6020u(e10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e d(org.spongycastle.math.ec.e eVar) {
        int[] e10 = pj.e.e();
        pj.b.d(AbstractC6018t.f62809P, ((C6020u) eVar).f62812x, e10);
        AbstractC6018t.e(e10, this.f62812x, e10);
        return new C6020u(e10);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6020u) {
            return pj.e.j(this.f62812x, ((C6020u) obj).f62812x);
        }
        return false;
    }

    @Override // org.spongycastle.math.ec.e
    public int f() {
        return f62811g.bitLength();
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e g() {
        int[] e10 = pj.e.e();
        pj.b.d(AbstractC6018t.f62809P, this.f62812x, e10);
        return new C6020u(e10);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean h() {
        return pj.e.q(this.f62812x);
    }

    public int hashCode() {
        return f62811g.hashCode() ^ Aj.a.t(this.f62812x, 0, 6);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean i() {
        return pj.e.s(this.f62812x);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e j(org.spongycastle.math.ec.e eVar) {
        int[] e10 = pj.e.e();
        AbstractC6018t.e(this.f62812x, ((C6020u) eVar).f62812x, e10);
        return new C6020u(e10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e m() {
        int[] e10 = pj.e.e();
        AbstractC6018t.g(this.f62812x, e10);
        return new C6020u(e10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e n() {
        int[] iArr = this.f62812x;
        if (pj.e.s(iArr) || pj.e.q(iArr)) {
            return this;
        }
        int[] e10 = pj.e.e();
        int[] e11 = pj.e.e();
        AbstractC6018t.j(iArr, e10);
        AbstractC6018t.e(e10, iArr, e10);
        AbstractC6018t.k(e10, 2, e11);
        AbstractC6018t.e(e11, e10, e11);
        AbstractC6018t.k(e11, 4, e10);
        AbstractC6018t.e(e10, e11, e10);
        AbstractC6018t.k(e10, 8, e11);
        AbstractC6018t.e(e11, e10, e11);
        AbstractC6018t.k(e11, 16, e10);
        AbstractC6018t.e(e10, e11, e10);
        AbstractC6018t.k(e10, 32, e11);
        AbstractC6018t.e(e11, e10, e11);
        AbstractC6018t.k(e11, 64, e10);
        AbstractC6018t.e(e10, e11, e10);
        AbstractC6018t.k(e10, 62, e10);
        AbstractC6018t.j(e10, e11);
        if (pj.e.j(iArr, e11)) {
            return new C6020u(e10);
        }
        return null;
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e o() {
        int[] e10 = pj.e.e();
        AbstractC6018t.j(this.f62812x, e10);
        return new C6020u(e10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e r(org.spongycastle.math.ec.e eVar) {
        int[] e10 = pj.e.e();
        AbstractC6018t.m(this.f62812x, ((C6020u) eVar).f62812x, e10);
        return new C6020u(e10);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean s() {
        return pj.e.n(this.f62812x, 0) == 1;
    }

    @Override // org.spongycastle.math.ec.e
    public BigInteger t() {
        return pj.e.F(this.f62812x);
    }

    public C6020u(int[] iArr) {
        this.f62812x = iArr;
    }
}
