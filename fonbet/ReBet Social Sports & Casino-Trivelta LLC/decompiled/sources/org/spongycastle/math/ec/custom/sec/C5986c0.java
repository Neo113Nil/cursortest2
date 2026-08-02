package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;

/* renamed from: org.spongycastle.math.ec.custom.sec.c0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5986c0 extends org.spongycastle.math.ec.e {

    /* renamed from: x, reason: collision with root package name */
    protected long[] f62781x;

    public C5986c0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 131) {
            throw new IllegalArgumentException("x value invalid for SecT131FieldElement");
        }
        this.f62781x = AbstractC5984b0.d(bigInteger);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e a(org.spongycastle.math.ec.e eVar) {
        long[] f10 = pj.e.f();
        AbstractC5984b0.a(this.f62781x, ((C5986c0) eVar).f62781x, f10);
        return new C5986c0(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e b() {
        long[] f10 = pj.e.f();
        AbstractC5984b0.c(this.f62781x, f10);
        return new C5986c0(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e d(org.spongycastle.math.ec.e eVar) {
        return j(eVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5986c0) {
            return pj.e.k(this.f62781x, ((C5986c0) obj).f62781x);
        }
        return false;
    }

    @Override // org.spongycastle.math.ec.e
    public int f() {
        return 131;
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e g() {
        long[] f10 = pj.e.f();
        AbstractC5984b0.i(this.f62781x, f10);
        return new C5986c0(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean h() {
        return pj.e.r(this.f62781x);
    }

    public int hashCode() {
        return Aj.a.u(this.f62781x, 0, 3) ^ 131832;
    }

    @Override // org.spongycastle.math.ec.e
    public boolean i() {
        return pj.e.t(this.f62781x);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e j(org.spongycastle.math.ec.e eVar) {
        long[] f10 = pj.e.f();
        AbstractC5984b0.j(this.f62781x, ((C5986c0) eVar).f62781x, f10);
        return new C5986c0(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e k(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e eVar3) {
        return l(eVar, eVar2, eVar3);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e l(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e eVar3) {
        long[] jArr = this.f62781x;
        long[] jArr2 = ((C5986c0) eVar).f62781x;
        long[] jArr3 = ((C5986c0) eVar2).f62781x;
        long[] jArr4 = ((C5986c0) eVar3).f62781x;
        long[] j10 = pj.m.j(5);
        AbstractC5984b0.k(jArr, jArr2, j10);
        AbstractC5984b0.k(jArr3, jArr4, j10);
        long[] f10 = pj.e.f();
        AbstractC5984b0.l(j10, f10);
        return new C5986c0(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e m() {
        return this;
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e n() {
        long[] f10 = pj.e.f();
        AbstractC5984b0.n(this.f62781x, f10);
        return new C5986c0(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e o() {
        long[] f10 = pj.e.f();
        AbstractC5984b0.o(this.f62781x, f10);
        return new C5986c0(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e p(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2) {
        long[] jArr = this.f62781x;
        long[] jArr2 = ((C5986c0) eVar).f62781x;
        long[] jArr3 = ((C5986c0) eVar2).f62781x;
        long[] j10 = pj.m.j(5);
        AbstractC5984b0.p(jArr, j10);
        AbstractC5984b0.k(jArr2, jArr3, j10);
        long[] f10 = pj.e.f();
        AbstractC5984b0.l(j10, f10);
        return new C5986c0(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e q(int i10) {
        if (i10 < 1) {
            return this;
        }
        long[] f10 = pj.e.f();
        AbstractC5984b0.q(this.f62781x, i10, f10);
        return new C5986c0(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e r(org.spongycastle.math.ec.e eVar) {
        return a(eVar);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean s() {
        return (this.f62781x[0] & 1) != 0;
    }

    @Override // org.spongycastle.math.ec.e
    public BigInteger t() {
        return pj.e.G(this.f62781x);
    }

    public C5986c0(long[] jArr) {
        this.f62781x = jArr;
    }
}
