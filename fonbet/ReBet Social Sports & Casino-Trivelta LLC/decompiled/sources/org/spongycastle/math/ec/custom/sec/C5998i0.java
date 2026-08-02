package org.spongycastle.math.ec.custom.sec;

import com.plaid.internal.EnumC3631g;
import java.math.BigInteger;

/* renamed from: org.spongycastle.math.ec.custom.sec.i0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5998i0 extends org.spongycastle.math.ec.e {

    /* renamed from: x, reason: collision with root package name */
    protected long[] f62791x;

    public C5998i0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 163) {
            throw new IllegalArgumentException("x value invalid for SecT163FieldElement");
        }
        this.f62791x = AbstractC5996h0.d(bigInteger);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e a(org.spongycastle.math.ec.e eVar) {
        long[] f10 = pj.e.f();
        AbstractC5996h0.a(this.f62791x, ((C5998i0) eVar).f62791x, f10);
        return new C5998i0(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e b() {
        long[] f10 = pj.e.f();
        AbstractC5996h0.c(this.f62791x, f10);
        return new C5998i0(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e d(org.spongycastle.math.ec.e eVar) {
        return j(eVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5998i0) {
            return pj.e.k(this.f62791x, ((C5998i0) obj).f62791x);
        }
        return false;
    }

    @Override // org.spongycastle.math.ec.e
    public int f() {
        return EnumC3631g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE;
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e g() {
        long[] f10 = pj.e.f();
        AbstractC5996h0.i(this.f62791x, f10);
        return new C5998i0(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean h() {
        return pj.e.r(this.f62791x);
    }

    public int hashCode() {
        return Aj.a.u(this.f62791x, 0, 3) ^ 163763;
    }

    @Override // org.spongycastle.math.ec.e
    public boolean i() {
        return pj.e.t(this.f62791x);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e j(org.spongycastle.math.ec.e eVar) {
        long[] f10 = pj.e.f();
        AbstractC5996h0.j(this.f62791x, ((C5998i0) eVar).f62791x, f10);
        return new C5998i0(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e k(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e eVar3) {
        return l(eVar, eVar2, eVar3);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e l(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e eVar3) {
        long[] jArr = this.f62791x;
        long[] jArr2 = ((C5998i0) eVar).f62791x;
        long[] jArr3 = ((C5998i0) eVar2).f62791x;
        long[] jArr4 = ((C5998i0) eVar3).f62791x;
        long[] h10 = pj.e.h();
        AbstractC5996h0.k(jArr, jArr2, h10);
        AbstractC5996h0.k(jArr3, jArr4, h10);
        long[] f10 = pj.e.f();
        AbstractC5996h0.l(h10, f10);
        return new C5998i0(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e m() {
        return this;
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e n() {
        long[] f10 = pj.e.f();
        AbstractC5996h0.n(this.f62791x, f10);
        return new C5998i0(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e o() {
        long[] f10 = pj.e.f();
        AbstractC5996h0.o(this.f62791x, f10);
        return new C5998i0(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e p(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2) {
        long[] jArr = this.f62791x;
        long[] jArr2 = ((C5998i0) eVar).f62791x;
        long[] jArr3 = ((C5998i0) eVar2).f62791x;
        long[] h10 = pj.e.h();
        AbstractC5996h0.p(jArr, h10);
        AbstractC5996h0.k(jArr2, jArr3, h10);
        long[] f10 = pj.e.f();
        AbstractC5996h0.l(h10, f10);
        return new C5998i0(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e q(int i10) {
        if (i10 < 1) {
            return this;
        }
        long[] f10 = pj.e.f();
        AbstractC5996h0.q(this.f62791x, i10, f10);
        return new C5998i0(f10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e r(org.spongycastle.math.ec.e eVar) {
        return a(eVar);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean s() {
        return (this.f62791x[0] & 1) != 0;
    }

    @Override // org.spongycastle.math.ec.e
    public BigInteger t() {
        return pj.e.G(this.f62791x);
    }

    public C5998i0(long[] jArr) {
        this.f62791x = jArr;
    }
}
