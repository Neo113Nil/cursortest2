package org.spongycastle.math.ec.custom.sec;

import org.spongycastle.math.ec.g;

/* renamed from: org.spongycastle.math.ec.custom.sec.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5991f extends g.b {
    public C5991f(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2) {
        this(dVar, eVar, eVar2, false);
    }

    @Override // org.spongycastle.math.ec.g
    public org.spongycastle.math.ec.g B() {
        return (r() || this.f62850c.i()) ? this : D().a(this);
    }

    @Override // org.spongycastle.math.ec.g
    public org.spongycastle.math.ec.g D() {
        if (r()) {
            return this;
        }
        org.spongycastle.math.ec.d h10 = h();
        C6005m c6005m = (C6005m) this.f62850c;
        if (c6005m.i()) {
            return h10.u();
        }
        C6005m c6005m2 = (C6005m) this.f62849b;
        C6005m c6005m3 = (C6005m) this.zs[0];
        int[] c10 = pj.d.c();
        AbstractC6003l.i(c6005m.f62798x, c10);
        int[] c11 = pj.d.c();
        AbstractC6003l.i(c10, c11);
        int[] c12 = pj.d.c();
        AbstractC6003l.i(c6005m2.f62798x, c12);
        AbstractC6003l.h(pj.d.b(c12, c12, c12), c12);
        AbstractC6003l.d(c10, c6005m2.f62798x, c10);
        AbstractC6003l.h(pj.m.F(5, c10, 2, 0), c10);
        int[] c13 = pj.d.c();
        AbstractC6003l.h(pj.m.G(5, c11, 3, 0, c13), c13);
        C6005m c6005m4 = new C6005m(c11);
        AbstractC6003l.i(c12, c6005m4.f62798x);
        int[] iArr = c6005m4.f62798x;
        AbstractC6003l.k(iArr, c10, iArr);
        int[] iArr2 = c6005m4.f62798x;
        AbstractC6003l.k(iArr2, c10, iArr2);
        C6005m c6005m5 = new C6005m(c10);
        AbstractC6003l.k(c10, c6005m4.f62798x, c6005m5.f62798x);
        int[] iArr3 = c6005m5.f62798x;
        AbstractC6003l.d(iArr3, c12, iArr3);
        int[] iArr4 = c6005m5.f62798x;
        AbstractC6003l.k(iArr4, c13, iArr4);
        C6005m c6005m6 = new C6005m(c12);
        AbstractC6003l.l(c6005m.f62798x, c6005m6.f62798x);
        if (!c6005m3.h()) {
            int[] iArr5 = c6005m6.f62798x;
            AbstractC6003l.d(iArr5, c6005m3.f62798x, iArr5);
        }
        return new C5991f(h10, c6005m4, c6005m5, new org.spongycastle.math.ec.e[]{c6005m6}, this.f62851d);
    }

    @Override // org.spongycastle.math.ec.g
    public org.spongycastle.math.ec.g E(org.spongycastle.math.ec.g gVar) {
        return this == gVar ? B() : r() ? gVar : gVar.r() ? D() : this.f62850c.i() ? gVar : D().a(gVar);
    }

    @Override // org.spongycastle.math.ec.g
    public org.spongycastle.math.ec.g a(org.spongycastle.math.ec.g gVar) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (r()) {
            return gVar;
        }
        if (gVar.r()) {
            return this;
        }
        if (this == gVar) {
            return D();
        }
        org.spongycastle.math.ec.d h10 = h();
        C6005m c6005m = (C6005m) this.f62849b;
        C6005m c6005m2 = (C6005m) this.f62850c;
        C6005m c6005m3 = (C6005m) gVar.o();
        C6005m c6005m4 = (C6005m) gVar.p();
        C6005m c6005m5 = (C6005m) this.zs[0];
        C6005m c6005m6 = (C6005m) gVar.q(0);
        int[] d10 = pj.d.d();
        int[] c10 = pj.d.c();
        int[] c11 = pj.d.c();
        int[] c12 = pj.d.c();
        boolean h11 = c6005m5.h();
        if (h11) {
            iArr = c6005m3.f62798x;
            iArr2 = c6005m4.f62798x;
        } else {
            AbstractC6003l.i(c6005m5.f62798x, c11);
            AbstractC6003l.d(c11, c6005m3.f62798x, c10);
            AbstractC6003l.d(c11, c6005m5.f62798x, c11);
            AbstractC6003l.d(c11, c6005m4.f62798x, c11);
            iArr = c10;
            iArr2 = c11;
        }
        boolean h12 = c6005m6.h();
        if (h12) {
            iArr3 = c6005m.f62798x;
            iArr4 = c6005m2.f62798x;
        } else {
            AbstractC6003l.i(c6005m6.f62798x, c12);
            AbstractC6003l.d(c12, c6005m.f62798x, d10);
            AbstractC6003l.d(c12, c6005m6.f62798x, c12);
            AbstractC6003l.d(c12, c6005m2.f62798x, c12);
            iArr3 = d10;
            iArr4 = c12;
        }
        int[] c13 = pj.d.c();
        AbstractC6003l.k(iArr3, iArr, c13);
        AbstractC6003l.k(iArr4, iArr2, c10);
        if (pj.d.j(c13)) {
            return pj.d.j(c10) ? D() : h10.u();
        }
        AbstractC6003l.i(c13, c11);
        int[] c14 = pj.d.c();
        AbstractC6003l.d(c11, c13, c14);
        AbstractC6003l.d(c11, iArr3, c11);
        AbstractC6003l.f(c14, c14);
        pj.d.k(iArr4, c14, d10);
        AbstractC6003l.h(pj.d.b(c11, c11, c14), c14);
        C6005m c6005m7 = new C6005m(c12);
        AbstractC6003l.i(c10, c6005m7.f62798x);
        int[] iArr5 = c6005m7.f62798x;
        AbstractC6003l.k(iArr5, c14, iArr5);
        C6005m c6005m8 = new C6005m(c14);
        AbstractC6003l.k(c11, c6005m7.f62798x, c6005m8.f62798x);
        AbstractC6003l.e(c6005m8.f62798x, c10, d10);
        AbstractC6003l.g(d10, c6005m8.f62798x);
        C6005m c6005m9 = new C6005m(c13);
        if (!h11) {
            int[] iArr6 = c6005m9.f62798x;
            AbstractC6003l.d(iArr6, c6005m5.f62798x, iArr6);
        }
        if (!h12) {
            int[] iArr7 = c6005m9.f62798x;
            AbstractC6003l.d(iArr7, c6005m6.f62798x, iArr7);
        }
        return new C5991f(h10, c6005m7, c6005m8, new org.spongycastle.math.ec.e[]{c6005m9}, this.f62851d);
    }

    @Override // org.spongycastle.math.ec.g
    public org.spongycastle.math.ec.g u() {
        return r() ? this : new C5991f(this.f62848a, this.f62849b, this.f62850c.m(), this.zs, this.f62851d);
    }

    public C5991f(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, boolean z10) {
        super(dVar, eVar, eVar2);
        if ((eVar == null) != (eVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f62851d = z10;
    }

    public C5991f(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e[] eVarArr, boolean z10) {
        super(dVar, eVar, eVar2, eVarArr);
        this.f62851d = z10;
    }
}
