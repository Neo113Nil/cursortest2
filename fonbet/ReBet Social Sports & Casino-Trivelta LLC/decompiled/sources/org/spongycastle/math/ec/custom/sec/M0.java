package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class M0 extends org.spongycastle.math.ec.e {

    /* renamed from: x, reason: collision with root package name */
    protected long[] f62757x;

    public M0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 409) {
            throw new IllegalArgumentException("x value invalid for SecT409FieldElement");
        }
        this.f62757x = L0.d(bigInteger);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e a(org.spongycastle.math.ec.e eVar) {
        long[] a10 = pj.j.a();
        L0.a(this.f62757x, ((M0) eVar).f62757x, a10);
        return new M0(a10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e b() {
        long[] a10 = pj.j.a();
        L0.c(this.f62757x, a10);
        return new M0(a10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e d(org.spongycastle.math.ec.e eVar) {
        return j(eVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof M0) {
            return pj.j.c(this.f62757x, ((M0) obj).f62757x);
        }
        return false;
    }

    @Override // org.spongycastle.math.ec.e
    public int f() {
        return 409;
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e g() {
        long[] a10 = pj.j.a();
        L0.j(this.f62757x, a10);
        return new M0(a10);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean h() {
        return pj.j.e(this.f62757x);
    }

    public int hashCode() {
        return Aj.a.u(this.f62757x, 0, 7) ^ 4090087;
    }

    @Override // org.spongycastle.math.ec.e
    public boolean i() {
        return pj.j.f(this.f62757x);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e j(org.spongycastle.math.ec.e eVar) {
        long[] a10 = pj.j.a();
        L0.k(this.f62757x, ((M0) eVar).f62757x, a10);
        return new M0(a10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e k(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e eVar3) {
        return l(eVar, eVar2, eVar3);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e l(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e eVar3) {
        long[] jArr = this.f62757x;
        long[] jArr2 = ((M0) eVar).f62757x;
        long[] jArr3 = ((M0) eVar2).f62757x;
        long[] jArr4 = ((M0) eVar3).f62757x;
        long[] j10 = pj.m.j(13);
        L0.l(jArr, jArr2, j10);
        L0.l(jArr3, jArr4, j10);
        long[] a10 = pj.j.a();
        L0.m(j10, a10);
        return new M0(a10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e m() {
        return this;
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e n() {
        long[] a10 = pj.j.a();
        L0.o(this.f62757x, a10);
        return new M0(a10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e o() {
        long[] a10 = pj.j.a();
        L0.p(this.f62757x, a10);
        return new M0(a10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e p(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2) {
        long[] jArr = this.f62757x;
        long[] jArr2 = ((M0) eVar).f62757x;
        long[] jArr3 = ((M0) eVar2).f62757x;
        long[] j10 = pj.m.j(13);
        L0.q(jArr, j10);
        L0.l(jArr2, jArr3, j10);
        long[] a10 = pj.j.a();
        L0.m(j10, a10);
        return new M0(a10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e q(int i10) {
        if (i10 < 1) {
            return this;
        }
        long[] a10 = pj.j.a();
        L0.r(this.f62757x, i10, a10);
        return new M0(a10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e r(org.spongycastle.math.ec.e eVar) {
        return a(eVar);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean s() {
        return (this.f62757x[0] & 1) != 0;
    }

    @Override // org.spongycastle.math.ec.e
    public BigInteger t() {
        return pj.j.g(this.f62757x);
    }

    public M0(long[] jArr) {
        this.f62757x = jArr;
    }
}
