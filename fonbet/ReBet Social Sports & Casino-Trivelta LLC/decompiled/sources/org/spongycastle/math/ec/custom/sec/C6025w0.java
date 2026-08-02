package org.spongycastle.math.ec.custom.sec;

import com.plaid.internal.EnumC3631g;
import java.math.BigInteger;

/* renamed from: org.spongycastle.math.ec.custom.sec.w0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6025w0 extends org.spongycastle.math.ec.e {

    /* renamed from: x, reason: collision with root package name */
    protected long[] f62815x;

    public C6025w0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 233) {
            throw new IllegalArgumentException("x value invalid for SecT233FieldElement");
        }
        this.f62815x = AbstractC6023v0.d(bigInteger);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e a(org.spongycastle.math.ec.e eVar) {
        long[] g10 = pj.g.g();
        AbstractC6023v0.a(this.f62815x, ((C6025w0) eVar).f62815x, g10);
        return new C6025w0(g10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e b() {
        long[] g10 = pj.g.g();
        AbstractC6023v0.c(this.f62815x, g10);
        return new C6025w0(g10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e d(org.spongycastle.math.ec.e eVar) {
        return j(eVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6025w0) {
            return pj.g.l(this.f62815x, ((C6025w0) obj).f62815x);
        }
        return false;
    }

    @Override // org.spongycastle.math.ec.e
    public int f() {
        return EnumC3631g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE;
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e g() {
        long[] g10 = pj.g.g();
        AbstractC6023v0.j(this.f62815x, g10);
        return new C6025w0(g10);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean h() {
        return pj.g.s(this.f62815x);
    }

    public int hashCode() {
        return Aj.a.u(this.f62815x, 0, 4) ^ 2330074;
    }

    @Override // org.spongycastle.math.ec.e
    public boolean i() {
        return pj.g.u(this.f62815x);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e j(org.spongycastle.math.ec.e eVar) {
        long[] g10 = pj.g.g();
        AbstractC6023v0.k(this.f62815x, ((C6025w0) eVar).f62815x, g10);
        return new C6025w0(g10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e k(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e eVar3) {
        return l(eVar, eVar2, eVar3);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e l(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e eVar3) {
        long[] jArr = this.f62815x;
        long[] jArr2 = ((C6025w0) eVar).f62815x;
        long[] jArr3 = ((C6025w0) eVar2).f62815x;
        long[] jArr4 = ((C6025w0) eVar3).f62815x;
        long[] i10 = pj.g.i();
        AbstractC6023v0.l(jArr, jArr2, i10);
        AbstractC6023v0.l(jArr3, jArr4, i10);
        long[] g10 = pj.g.g();
        AbstractC6023v0.m(i10, g10);
        return new C6025w0(g10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e m() {
        return this;
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e n() {
        long[] g10 = pj.g.g();
        AbstractC6023v0.o(this.f62815x, g10);
        return new C6025w0(g10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e o() {
        long[] g10 = pj.g.g();
        AbstractC6023v0.p(this.f62815x, g10);
        return new C6025w0(g10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e p(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2) {
        long[] jArr = this.f62815x;
        long[] jArr2 = ((C6025w0) eVar).f62815x;
        long[] jArr3 = ((C6025w0) eVar2).f62815x;
        long[] i10 = pj.g.i();
        AbstractC6023v0.q(jArr, i10);
        AbstractC6023v0.l(jArr2, jArr3, i10);
        long[] g10 = pj.g.g();
        AbstractC6023v0.m(i10, g10);
        return new C6025w0(g10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e q(int i10) {
        if (i10 < 1) {
            return this;
        }
        long[] g10 = pj.g.g();
        AbstractC6023v0.r(this.f62815x, i10, g10);
        return new C6025w0(g10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e r(org.spongycastle.math.ec.e eVar) {
        return a(eVar);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean s() {
        return (this.f62815x[0] & 1) != 0;
    }

    @Override // org.spongycastle.math.ec.e
    public BigInteger t() {
        return pj.g.I(this.f62815x);
    }

    public C6025w0(long[] jArr) {
        this.f62815x = jArr;
    }
}
