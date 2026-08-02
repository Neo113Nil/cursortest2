package org.spongycastle.math.ec.custom.sec;

import org.spongycastle.math.ec.g;

/* renamed from: org.spongycastle.math.ec.custom.sec.e0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5990e0 extends g.a {
    public C5990e0(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2) {
        this(dVar, eVar, eVar2, false);
    }

    @Override // org.spongycastle.math.ec.g
    public org.spongycastle.math.ec.g D() {
        if (r()) {
            return this;
        }
        org.spongycastle.math.ec.d h10 = h();
        org.spongycastle.math.ec.e eVar = this.f62849b;
        if (eVar.i()) {
            return h10.u();
        }
        org.spongycastle.math.ec.e eVar2 = this.f62850c;
        org.spongycastle.math.ec.e eVar3 = this.zs[0];
        boolean h11 = eVar3.h();
        org.spongycastle.math.ec.e j10 = h11 ? eVar2 : eVar2.j(eVar3);
        org.spongycastle.math.ec.e o10 = h11 ? eVar3 : eVar3.o();
        org.spongycastle.math.ec.e n10 = h10.n();
        if (!h11) {
            n10 = n10.j(o10);
        }
        org.spongycastle.math.ec.e a10 = eVar2.o().a(j10).a(n10);
        if (a10.i()) {
            return new C5990e0(h10, a10, h10.o().n(), this.f62851d);
        }
        org.spongycastle.math.ec.e o11 = a10.o();
        org.spongycastle.math.ec.e j11 = h11 ? a10 : a10.j(o10);
        if (!h11) {
            eVar = eVar.j(eVar3);
        }
        return new C5990e0(h10, o11, eVar.p(a10, j10).a(o11).a(j11), new org.spongycastle.math.ec.e[]{j11}, this.f62851d);
    }

    @Override // org.spongycastle.math.ec.g
    public org.spongycastle.math.ec.g E(org.spongycastle.math.ec.g gVar) {
        if (r()) {
            return gVar;
        }
        if (gVar.r()) {
            return D();
        }
        org.spongycastle.math.ec.d h10 = h();
        org.spongycastle.math.ec.e eVar = this.f62849b;
        if (eVar.i()) {
            return gVar;
        }
        org.spongycastle.math.ec.e l10 = gVar.l();
        org.spongycastle.math.ec.e q10 = gVar.q(0);
        if (l10.i() || !q10.h()) {
            return D().a(gVar);
        }
        org.spongycastle.math.ec.e eVar2 = this.f62850c;
        org.spongycastle.math.ec.e eVar3 = this.zs[0];
        org.spongycastle.math.ec.e m10 = gVar.m();
        org.spongycastle.math.ec.e o10 = eVar.o();
        org.spongycastle.math.ec.e o11 = eVar2.o();
        org.spongycastle.math.ec.e o12 = eVar3.o();
        org.spongycastle.math.ec.e a10 = h10.n().j(o12).a(o11).a(eVar2.j(eVar3));
        org.spongycastle.math.ec.e b10 = m10.b();
        org.spongycastle.math.ec.e l11 = h10.n().a(b10).j(o12).a(o11).l(a10, o10, o12);
        org.spongycastle.math.ec.e j10 = l10.j(o12);
        org.spongycastle.math.ec.e o13 = j10.a(a10).o();
        if (o13.i()) {
            return l11.i() ? gVar.D() : h10.u();
        }
        if (l11.i()) {
            return new C5990e0(h10, l11, h10.o().n(), this.f62851d);
        }
        org.spongycastle.math.ec.e j11 = l11.o().j(j10);
        org.spongycastle.math.ec.e j12 = l11.j(o13).j(o12);
        return new C5990e0(h10, j11, l11.a(o13).o().l(a10, b10, j12), new org.spongycastle.math.ec.e[]{j12}, this.f62851d);
    }

    @Override // org.spongycastle.math.ec.g
    public org.spongycastle.math.ec.g a(org.spongycastle.math.ec.g gVar) {
        org.spongycastle.math.ec.e eVar;
        org.spongycastle.math.ec.e eVar2;
        org.spongycastle.math.ec.e eVar3;
        org.spongycastle.math.ec.e eVar4;
        org.spongycastle.math.ec.e eVar5;
        org.spongycastle.math.ec.e eVar6;
        if (r()) {
            return gVar;
        }
        if (gVar.r()) {
            return this;
        }
        org.spongycastle.math.ec.d h10 = h();
        org.spongycastle.math.ec.e eVar7 = this.f62849b;
        org.spongycastle.math.ec.e l10 = gVar.l();
        if (eVar7.i()) {
            return l10.i() ? h10.u() : gVar.a(this);
        }
        org.spongycastle.math.ec.e eVar8 = this.f62850c;
        org.spongycastle.math.ec.e eVar9 = this.zs[0];
        org.spongycastle.math.ec.e m10 = gVar.m();
        org.spongycastle.math.ec.e q10 = gVar.q(0);
        boolean h11 = eVar9.h();
        if (h11) {
            eVar = l10;
            eVar2 = m10;
        } else {
            eVar = l10.j(eVar9);
            eVar2 = m10.j(eVar9);
        }
        boolean h12 = q10.h();
        if (h12) {
            eVar3 = eVar8;
        } else {
            eVar7 = eVar7.j(q10);
            eVar3 = eVar8.j(q10);
        }
        org.spongycastle.math.ec.e a10 = eVar3.a(eVar2);
        org.spongycastle.math.ec.e a11 = eVar7.a(eVar);
        if (a11.i()) {
            return a10.i() ? D() : h10.u();
        }
        if (l10.i()) {
            org.spongycastle.math.ec.g v10 = v();
            org.spongycastle.math.ec.e o10 = v10.o();
            org.spongycastle.math.ec.e p10 = v10.p();
            org.spongycastle.math.ec.e d10 = p10.a(m10).d(o10);
            eVar4 = d10.o().a(d10).a(o10).a(h10.n());
            if (eVar4.i()) {
                return new C5990e0(h10, eVar4, h10.o().n(), this.f62851d);
            }
            org.spongycastle.math.ec.e a12 = d10.j(o10.a(eVar4)).a(eVar4).a(p10).d(eVar4).a(eVar4);
            eVar6 = h10.m(org.spongycastle.math.ec.c.f62725b);
            eVar5 = a12;
        } else {
            org.spongycastle.math.ec.e o11 = a11.o();
            org.spongycastle.math.ec.e j10 = a10.j(eVar7);
            org.spongycastle.math.ec.e j11 = a10.j(eVar);
            org.spongycastle.math.ec.e j12 = j10.j(j11);
            if (j12.i()) {
                return new C5990e0(h10, j12, h10.o().n(), this.f62851d);
            }
            org.spongycastle.math.ec.e j13 = a10.j(o11);
            org.spongycastle.math.ec.e j14 = !h12 ? j13.j(q10) : j13;
            org.spongycastle.math.ec.e p11 = j11.a(o11).p(j14, eVar8.a(eVar9));
            if (!h11) {
                j14 = j14.j(eVar9);
            }
            eVar4 = j12;
            eVar5 = p11;
            eVar6 = j14;
        }
        return new C5990e0(h10, eVar4, eVar5, new org.spongycastle.math.ec.e[]{eVar6}, this.f62851d);
    }

    @Override // org.spongycastle.math.ec.g
    public boolean g() {
        org.spongycastle.math.ec.e l10 = l();
        return (l10.i() || m().s() == l10.s()) ? false : true;
    }

    @Override // org.spongycastle.math.ec.g
    public org.spongycastle.math.ec.e p() {
        org.spongycastle.math.ec.e eVar = this.f62849b;
        org.spongycastle.math.ec.e eVar2 = this.f62850c;
        if (r() || eVar.i()) {
            return eVar2;
        }
        org.spongycastle.math.ec.e j10 = eVar2.a(eVar).j(eVar);
        org.spongycastle.math.ec.e eVar3 = this.zs[0];
        return !eVar3.h() ? j10.d(eVar3) : j10;
    }

    @Override // org.spongycastle.math.ec.g
    public org.spongycastle.math.ec.g u() {
        if (!r()) {
            org.spongycastle.math.ec.e eVar = this.f62849b;
            if (!eVar.i()) {
                org.spongycastle.math.ec.e eVar2 = this.f62850c;
                org.spongycastle.math.ec.e eVar3 = this.zs[0];
                return new C5990e0(this.f62848a, eVar, eVar2.a(eVar3), new org.spongycastle.math.ec.e[]{eVar3}, this.f62851d);
            }
        }
        return this;
    }

    public C5990e0(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, boolean z10) {
        super(dVar, eVar, eVar2);
        if ((eVar == null) != (eVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f62851d = z10;
    }

    public C5990e0(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e[] eVarArr, boolean z10) {
        super(dVar, eVar, eVar2, eVarArr);
        this.f62851d = z10;
    }
}
