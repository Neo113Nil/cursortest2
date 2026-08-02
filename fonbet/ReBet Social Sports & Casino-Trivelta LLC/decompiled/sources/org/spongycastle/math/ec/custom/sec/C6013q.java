package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;

/* renamed from: org.spongycastle.math.ec.custom.sec.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6013q extends org.spongycastle.math.ec.e {

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f62803g = C6009o.f62800j;

    /* renamed from: x, reason: collision with root package name */
    protected int[] f62804x;

    public C6013q(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f62803g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192K1FieldElement");
        }
        this.f62804x = AbstractC6011p.c(bigInteger);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e a(org.spongycastle.math.ec.e eVar) {
        int[] e10 = pj.e.e();
        AbstractC6011p.a(this.f62804x, ((C6013q) eVar).f62804x, e10);
        return new C6013q(e10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e b() {
        int[] e10 = pj.e.e();
        AbstractC6011p.b(this.f62804x, e10);
        return new C6013q(e10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e d(org.spongycastle.math.ec.e eVar) {
        int[] e10 = pj.e.e();
        pj.b.d(AbstractC6011p.f62802P, ((C6013q) eVar).f62804x, e10);
        AbstractC6011p.d(e10, this.f62804x, e10);
        return new C6013q(e10);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6013q) {
            return pj.e.j(this.f62804x, ((C6013q) obj).f62804x);
        }
        return false;
    }

    @Override // org.spongycastle.math.ec.e
    public int f() {
        return f62803g.bitLength();
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e g() {
        int[] e10 = pj.e.e();
        pj.b.d(AbstractC6011p.f62802P, this.f62804x, e10);
        return new C6013q(e10);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean h() {
        return pj.e.q(this.f62804x);
    }

    public int hashCode() {
        return f62803g.hashCode() ^ Aj.a.t(this.f62804x, 0, 6);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean i() {
        return pj.e.s(this.f62804x);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e j(org.spongycastle.math.ec.e eVar) {
        int[] e10 = pj.e.e();
        AbstractC6011p.d(this.f62804x, ((C6013q) eVar).f62804x, e10);
        return new C6013q(e10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e m() {
        int[] e10 = pj.e.e();
        AbstractC6011p.f(this.f62804x, e10);
        return new C6013q(e10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e n() {
        int[] iArr = this.f62804x;
        if (pj.e.s(iArr) || pj.e.q(iArr)) {
            return this;
        }
        int[] e10 = pj.e.e();
        AbstractC6011p.i(iArr, e10);
        AbstractC6011p.d(e10, iArr, e10);
        int[] e11 = pj.e.e();
        AbstractC6011p.i(e10, e11);
        AbstractC6011p.d(e11, iArr, e11);
        int[] e12 = pj.e.e();
        AbstractC6011p.j(e11, 3, e12);
        AbstractC6011p.d(e12, e11, e12);
        AbstractC6011p.j(e12, 2, e12);
        AbstractC6011p.d(e12, e10, e12);
        AbstractC6011p.j(e12, 8, e10);
        AbstractC6011p.d(e10, e12, e10);
        AbstractC6011p.j(e10, 3, e12);
        AbstractC6011p.d(e12, e11, e12);
        int[] e13 = pj.e.e();
        AbstractC6011p.j(e12, 16, e13);
        AbstractC6011p.d(e13, e10, e13);
        AbstractC6011p.j(e13, 35, e10);
        AbstractC6011p.d(e10, e13, e10);
        AbstractC6011p.j(e10, 70, e13);
        AbstractC6011p.d(e13, e10, e13);
        AbstractC6011p.j(e13, 19, e10);
        AbstractC6011p.d(e10, e12, e10);
        AbstractC6011p.j(e10, 20, e10);
        AbstractC6011p.d(e10, e12, e10);
        AbstractC6011p.j(e10, 4, e10);
        AbstractC6011p.d(e10, e11, e10);
        AbstractC6011p.j(e10, 6, e10);
        AbstractC6011p.d(e10, e11, e10);
        AbstractC6011p.i(e10, e10);
        AbstractC6011p.i(e10, e11);
        if (pj.e.j(iArr, e11)) {
            return new C6013q(e10);
        }
        return null;
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e o() {
        int[] e10 = pj.e.e();
        AbstractC6011p.i(this.f62804x, e10);
        return new C6013q(e10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e r(org.spongycastle.math.ec.e eVar) {
        int[] e10 = pj.e.e();
        AbstractC6011p.k(this.f62804x, ((C6013q) eVar).f62804x, e10);
        return new C6013q(e10);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean s() {
        return pj.e.n(this.f62804x, 0) == 1;
    }

    @Override // org.spongycastle.math.ec.e
    public BigInteger t() {
        return pj.e.F(this.f62804x);
    }

    public C6013q(int[] iArr) {
        this.f62804x = iArr;
    }
}
