package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class W extends org.spongycastle.math.ec.e {

    /* renamed from: x, reason: collision with root package name */
    protected long[] f62773x;

    public W(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 113) {
            throw new IllegalArgumentException("x value invalid for SecT113FieldElement");
        }
        this.f62773x = V.d(bigInteger);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e a(org.spongycastle.math.ec.e eVar) {
        long[] d10 = pj.c.d();
        V.a(this.f62773x, ((W) eVar).f62773x, d10);
        return new W(d10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e b() {
        long[] d10 = pj.c.d();
        V.c(this.f62773x, d10);
        return new W(d10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e d(org.spongycastle.math.ec.e eVar) {
        return j(eVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof W) {
            return pj.c.h(this.f62773x, ((W) obj).f62773x);
        }
        return false;
    }

    @Override // org.spongycastle.math.ec.e
    public int f() {
        return 113;
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e g() {
        long[] d10 = pj.c.d();
        V.h(this.f62773x, d10);
        return new W(d10);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean h() {
        return pj.c.n(this.f62773x);
    }

    public int hashCode() {
        return Aj.a.u(this.f62773x, 0, 2) ^ 113009;
    }

    @Override // org.spongycastle.math.ec.e
    public boolean i() {
        return pj.c.p(this.f62773x);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e j(org.spongycastle.math.ec.e eVar) {
        long[] d10 = pj.c.d();
        V.i(this.f62773x, ((W) eVar).f62773x, d10);
        return new W(d10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e k(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e eVar3) {
        return l(eVar, eVar2, eVar3);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e l(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e eVar3) {
        long[] jArr = this.f62773x;
        long[] jArr2 = ((W) eVar).f62773x;
        long[] jArr3 = ((W) eVar2).f62773x;
        long[] jArr4 = ((W) eVar3).f62773x;
        long[] f10 = pj.c.f();
        V.j(jArr, jArr2, f10);
        V.j(jArr3, jArr4, f10);
        long[] d10 = pj.c.d();
        V.k(f10, d10);
        return new W(d10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e m() {
        return this;
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e n() {
        long[] d10 = pj.c.d();
        V.m(this.f62773x, d10);
        return new W(d10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e o() {
        long[] d10 = pj.c.d();
        V.n(this.f62773x, d10);
        return new W(d10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e p(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2) {
        long[] jArr = this.f62773x;
        long[] jArr2 = ((W) eVar).f62773x;
        long[] jArr3 = ((W) eVar2).f62773x;
        long[] f10 = pj.c.f();
        V.o(jArr, f10);
        V.j(jArr2, jArr3, f10);
        long[] d10 = pj.c.d();
        V.k(f10, d10);
        return new W(d10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e q(int i10) {
        if (i10 < 1) {
            return this;
        }
        long[] d10 = pj.c.d();
        V.p(this.f62773x, i10, d10);
        return new W(d10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e r(org.spongycastle.math.ec.e eVar) {
        return a(eVar);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean s() {
        return (this.f62773x[0] & 1) != 0;
    }

    @Override // org.spongycastle.math.ec.e
    public BigInteger t() {
        return pj.c.w(this.f62773x);
    }

    public W(long[] jArr) {
        this.f62773x = jArr;
    }
}
