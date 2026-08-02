package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class S0 extends org.spongycastle.math.ec.e {

    /* renamed from: x, reason: collision with root package name */
    protected long[] f62766x;

    public S0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 571) {
            throw new IllegalArgumentException("x value invalid for SecT571FieldElement");
        }
        this.f62766x = R0.f(bigInteger);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e a(org.spongycastle.math.ec.e eVar) {
        long[] a10 = pj.l.a();
        R0.b(this.f62766x, ((S0) eVar).f62766x, a10);
        return new S0(a10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e b() {
        long[] a10 = pj.l.a();
        R0.e(this.f62766x, a10);
        return new S0(a10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e d(org.spongycastle.math.ec.e eVar) {
        return j(eVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof S0) {
            return pj.l.c(this.f62766x, ((S0) obj).f62766x);
        }
        return false;
    }

    @Override // org.spongycastle.math.ec.e
    public int f() {
        return 571;
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e g() {
        long[] a10 = pj.l.a();
        R0.i(this.f62766x, a10);
        return new S0(a10);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean h() {
        return pj.l.e(this.f62766x);
    }

    public int hashCode() {
        return Aj.a.u(this.f62766x, 0, 9) ^ 5711052;
    }

    @Override // org.spongycastle.math.ec.e
    public boolean i() {
        return pj.l.f(this.f62766x);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e j(org.spongycastle.math.ec.e eVar) {
        long[] a10 = pj.l.a();
        R0.j(this.f62766x, ((S0) eVar).f62766x, a10);
        return new S0(a10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e k(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e eVar3) {
        return l(eVar, eVar2, eVar3);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e l(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e eVar3) {
        long[] jArr = this.f62766x;
        long[] jArr2 = ((S0) eVar).f62766x;
        long[] jArr3 = ((S0) eVar2).f62766x;
        long[] jArr4 = ((S0) eVar3).f62766x;
        long[] b10 = pj.l.b();
        R0.k(jArr, jArr2, b10);
        R0.k(jArr3, jArr4, b10);
        long[] a10 = pj.l.a();
        R0.l(b10, a10);
        return new S0(a10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e m() {
        return this;
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e n() {
        long[] a10 = pj.l.a();
        R0.n(this.f62766x, a10);
        return new S0(a10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e o() {
        long[] a10 = pj.l.a();
        R0.o(this.f62766x, a10);
        return new S0(a10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e p(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2) {
        long[] jArr = this.f62766x;
        long[] jArr2 = ((S0) eVar).f62766x;
        long[] jArr3 = ((S0) eVar2).f62766x;
        long[] b10 = pj.l.b();
        R0.p(jArr, b10);
        R0.k(jArr2, jArr3, b10);
        long[] a10 = pj.l.a();
        R0.l(b10, a10);
        return new S0(a10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e q(int i10) {
        if (i10 < 1) {
            return this;
        }
        long[] a10 = pj.l.a();
        R0.q(this.f62766x, i10, a10);
        return new S0(a10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e r(org.spongycastle.math.ec.e eVar) {
        return a(eVar);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean s() {
        return (this.f62766x[0] & 1) != 0;
    }

    @Override // org.spongycastle.math.ec.e
    public BigInteger t() {
        return pj.l.g(this.f62766x);
    }

    public S0(long[] jArr) {
        this.f62766x = jArr;
    }
}
