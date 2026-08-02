package org.spongycastle.math.ec.custom.sec;

import com.plaid.internal.EnumC3631g;
import java.math.BigInteger;

/* loaded from: classes5.dex */
public class G0 extends org.spongycastle.math.ec.e {

    /* renamed from: x, reason: collision with root package name */
    protected long[] f62747x;

    public G0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 283) {
            throw new IllegalArgumentException("x value invalid for SecT283FieldElement");
        }
        this.f62747x = F0.d(bigInteger);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e a(org.spongycastle.math.ec.e eVar) {
        long[] a10 = pj.h.a();
        F0.a(this.f62747x, ((G0) eVar).f62747x, a10);
        return new G0(a10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e b() {
        long[] a10 = pj.h.a();
        F0.c(this.f62747x, a10);
        return new G0(a10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e d(org.spongycastle.math.ec.e eVar) {
        return j(eVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof G0) {
            return pj.h.c(this.f62747x, ((G0) obj).f62747x);
        }
        return false;
    }

    @Override // org.spongycastle.math.ec.e
    public int f() {
        return EnumC3631g.SDK_ASSET_ILLUSTRATION_CARD_VALUE;
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e g() {
        long[] a10 = pj.h.a();
        F0.j(this.f62747x, a10);
        return new G0(a10);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean h() {
        return pj.h.e(this.f62747x);
    }

    public int hashCode() {
        return Aj.a.u(this.f62747x, 0, 5) ^ 2831275;
    }

    @Override // org.spongycastle.math.ec.e
    public boolean i() {
        return pj.h.f(this.f62747x);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e j(org.spongycastle.math.ec.e eVar) {
        long[] a10 = pj.h.a();
        F0.k(this.f62747x, ((G0) eVar).f62747x, a10);
        return new G0(a10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e k(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e eVar3) {
        return l(eVar, eVar2, eVar3);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e l(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e eVar3) {
        long[] jArr = this.f62747x;
        long[] jArr2 = ((G0) eVar).f62747x;
        long[] jArr3 = ((G0) eVar2).f62747x;
        long[] jArr4 = ((G0) eVar3).f62747x;
        long[] j10 = pj.m.j(9);
        F0.l(jArr, jArr2, j10);
        F0.l(jArr3, jArr4, j10);
        long[] a10 = pj.h.a();
        F0.m(j10, a10);
        return new G0(a10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e m() {
        return this;
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e n() {
        long[] a10 = pj.h.a();
        F0.o(this.f62747x, a10);
        return new G0(a10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e o() {
        long[] a10 = pj.h.a();
        F0.p(this.f62747x, a10);
        return new G0(a10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e p(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2) {
        long[] jArr = this.f62747x;
        long[] jArr2 = ((G0) eVar).f62747x;
        long[] jArr3 = ((G0) eVar2).f62747x;
        long[] j10 = pj.m.j(9);
        F0.q(jArr, j10);
        F0.l(jArr2, jArr3, j10);
        long[] a10 = pj.h.a();
        F0.m(j10, a10);
        return new G0(a10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e q(int i10) {
        if (i10 < 1) {
            return this;
        }
        long[] a10 = pj.h.a();
        F0.r(this.f62747x, i10, a10);
        return new G0(a10);
    }

    @Override // org.spongycastle.math.ec.e
    public org.spongycastle.math.ec.e r(org.spongycastle.math.ec.e eVar) {
        return a(eVar);
    }

    @Override // org.spongycastle.math.ec.e
    public boolean s() {
        return (this.f62747x[0] & 1) != 0;
    }

    @Override // org.spongycastle.math.ec.e
    public BigInteger t() {
        return pj.h.g(this.f62747x);
    }

    public G0(long[] jArr) {
        this.f62747x = jArr;
    }
}
