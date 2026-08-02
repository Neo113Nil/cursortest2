package org.spongycastle.math.ec.custom.sec;

import com.plaid.internal.EnumC3631g;
import java.math.BigInteger;

/* loaded from: classes5.dex */
public class C0 extends org.spongycastle.math.ec.e {

    /* renamed from: x, reason: collision with root package name */
    protected long[] f62740x;

    public C0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 239) {
            throw new IllegalArgumentException("x value invalid for SecT239FieldElement");
        }
        this.f62740x = B0.d(bigInteger);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e a(org.spongycastle.math.ec.e eVar) {
        long[] g10 = pj.g.g();
        B0.a(this.f62740x, ((C0) eVar).f62740x, g10);
        return new C0(g10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e b() {
        long[] g10 = pj.g.g();
        B0.c(this.f62740x, g10);
        return new C0(g10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e d(org.spongycastle.math.ec.e eVar) {
        return j(eVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0) {
            return pj.g.l(this.f62740x, ((C0) obj).f62740x);
        }
        return false;
    }

    @Override // org.spongycastle.math.ec.e
    public int f() {
        return EnumC3631g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE;
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e g() {
        long[] g10 = pj.g.g();
        B0.j(this.f62740x, g10);
        return new C0(g10);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean h() {
        return pj.g.s(this.f62740x);
    }

    public int hashCode() {
        return Aj.a.u(this.f62740x, 0, 4) ^ 23900158;
    }

    @Override // org.spongycastle.math.ec.e
    public boolean i() {
        return pj.g.u(this.f62740x);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e j(org.spongycastle.math.ec.e eVar) {
        long[] g10 = pj.g.g();
        B0.k(this.f62740x, ((C0) eVar).f62740x, g10);
        return new C0(g10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e k(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e eVar3) {
        return l(eVar, eVar2, eVar3);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e l(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e eVar3) {
        long[] jArr = this.f62740x;
        long[] jArr2 = ((C0) eVar).f62740x;
        long[] jArr3 = ((C0) eVar2).f62740x;
        long[] jArr4 = ((C0) eVar3).f62740x;
        long[] i10 = pj.g.i();
        B0.l(jArr, jArr2, i10);
        B0.l(jArr3, jArr4, i10);
        long[] g10 = pj.g.g();
        B0.m(i10, g10);
        return new C0(g10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e m() {
        return this;
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e n() {
        long[] g10 = pj.g.g();
        B0.o(this.f62740x, g10);
        return new C0(g10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e o() {
        long[] g10 = pj.g.g();
        B0.p(this.f62740x, g10);
        return new C0(g10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e p(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2) {
        long[] jArr = this.f62740x;
        long[] jArr2 = ((C0) eVar).f62740x;
        long[] jArr3 = ((C0) eVar2).f62740x;
        long[] i10 = pj.g.i();
        B0.q(jArr, i10);
        B0.l(jArr2, jArr3, i10);
        long[] g10 = pj.g.g();
        B0.m(i10, g10);
        return new C0(g10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e q(int i10) {
        if (i10 < 1) {
            return this;
        }
        long[] g10 = pj.g.g();
        B0.r(this.f62740x, i10, g10);
        return new C0(g10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e r(org.spongycastle.math.ec.e eVar) {
        return a(eVar);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean s() {
        return (this.f62740x[0] & 1) != 0;
    }

    @Override // org.spongycastle.math.ec.e
    public BigInteger t() {
        return pj.g.I(this.f62740x);
    }

    public C0(long[] jArr) {
        this.f62740x = jArr;
    }
}
