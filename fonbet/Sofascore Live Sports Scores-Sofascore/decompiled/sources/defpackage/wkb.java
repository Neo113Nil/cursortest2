package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wkb implements dma {
    public final vkb a;

    public wkb(vkb vkbVar) {
        this.a = vkbVar;
    }

    @Override // defpackage.dma
    public final long I(long j) {
        return this.a.o.I(dnd.i(0L, a()));
    }

    @Override // defpackage.dma
    public final dma K() {
        vkb c1;
        if (!f()) {
            r3a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        wdd wddVar = ((wdd) this.a.o.o.F.e).q;
        if (wddVar == null || (c1 = wddVar.c1()) == null) {
            return null;
        }
        return c1.r;
    }

    @Override // defpackage.dma
    public final long P(long j) {
        return this.a.o.P(dnd.i(j, a()));
    }

    public final long a() {
        vkb vkbVar = this.a;
        vkb n = uaa.n(vkbVar);
        return dnd.h(o(n.r, 0L), vkbVar.o.o(n.o, 0L));
    }

    @Override // defpackage.dma
    public final void d(dma dmaVar, float[] fArr) {
        this.a.o.d(dmaVar, fArr);
    }

    @Override // defpackage.dma
    public final long e() {
        vkb vkbVar = this.a;
        return (vkbVar.a << 32) | (vkbVar.b & 4294967295L);
    }

    @Override // defpackage.dma
    public final boolean f() {
        return this.a.o.e1().n;
    }

    @Override // defpackage.dma
    public final long g(long j) {
        return dnd.i(this.a.o.g(j), a());
    }

    @Override // defpackage.dma
    public final long l(dma dmaVar, long j) {
        return o(dmaVar, j);
    }

    @Override // defpackage.dma
    public final long m(long j) {
        return dnd.i(this.a.o.m(j), a());
    }

    @Override // defpackage.dma
    public final long o(dma dmaVar, long j) {
        boolean z = dmaVar instanceof wkb;
        vkb vkbVar = this.a;
        if (!z) {
            vkb n = uaa.n(vkbVar);
            wkb wkbVar = n.r;
            wdd wddVar = n.o;
            long o = o(wkbVar, j);
            long j2 = n.p;
            long h = dnd.h(o, (Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32));
            if (!wddVar.e1().n) {
                r3a.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            wddVar.n1();
            wdd wddVar2 = wddVar.q;
            if (wddVar2 != null) {
                wddVar = wddVar2;
            }
            return dnd.i(h, wddVar.o(dmaVar, 0L));
        }
        vkb vkbVar2 = ((wkb) dmaVar).a;
        wdd wddVar3 = vkbVar2.o;
        wddVar3.n1();
        vkb c1 = vkbVar.o.a1(wddVar3).c1();
        if (c1 != null) {
            long c = r6a.c(r6a.d(vkbVar2.T0(c1, false), s6a.L(j)), vkbVar.T0(c1, false));
            return (Float.floatToRawIntBits((int) (c >> 32)) << 32) | (Float.floatToRawIntBits((int) (c & 4294967295L)) & 4294967295L);
        }
        vkb n2 = uaa.n(vkbVar2);
        long d = r6a.d(r6a.d(vkbVar2.T0(n2, false), n2.p), s6a.L(j));
        vkb n3 = uaa.n(vkbVar);
        long c2 = r6a.c(d, r6a.d(vkbVar.T0(n3, false), n3.p));
        long floatToRawIntBits = Float.floatToRawIntBits((int) (c2 >> 32));
        long floatToRawIntBits2 = Float.floatToRawIntBits((int) (c2 & 4294967295L)) & 4294967295L;
        wdd wddVar4 = n3.o.q;
        wddVar4.getClass();
        wdd wddVar5 = n2.o.q;
        wddVar5.getClass();
        return wddVar4.o(wddVar5, floatToRawIntBits2 | (floatToRawIntBits << 32));
    }

    @Override // defpackage.dma
    public final oqf p(dma dmaVar, boolean z) {
        return this.a.o.p(dmaVar, z);
    }

    @Override // defpackage.dma
    public final long w(long j) {
        return this.a.o.w(dnd.i(j, a()));
    }

    @Override // defpackage.dma
    public final void z(float[] fArr) {
        this.a.o.z(fArr);
    }
}
