package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ina implements vji {
    public final vzc a;
    public final /* synthetic */ kna b;
    public final /* synthetic */ Object c;

    public ina(kna knaVar, Object obj) {
        this.b = knaVar;
        this.c = obj;
        int[] iArr = b7a.a;
        this.a = new vzc();
    }

    @Override // defpackage.vji
    public final long a(int i) {
        wma wmaVar = (wma) this.b.j.g(this.c);
        if (wmaVar == null || !wmaVar.H()) {
            return 0L;
        }
        int i2 = ((i1d) ((j0d) wmaVar.o()).b).c;
        if (i < 0 || i >= i2) {
            r3a.d("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (!this.a.c(i)) {
            return 0L;
        }
        int i3 = ((wma) ((j0d) wmaVar.o()).get(i)).G.p.a;
        return (((wma) ((j0d) wmaVar.o()).get(i)).G.p.b & 4294967295L) | (i3 << 32);
    }

    @Override // defpackage.vji
    public final int b() {
        wma wmaVar = (wma) this.b.j.g(this.c);
        if (wmaVar != null) {
            return ((i1d) ((j0d) wmaVar.o()).b).c;
        }
        return 0;
    }

    @Override // defpackage.vji
    public final void c(k31 k31Var) {
        c40 c40Var;
        wma wmaVar = (wma) this.b.j.g(this.c);
        wtc wtcVar = (wmaVar == null || (c40Var = wmaVar.F) == null) ? null : (wtc) c40Var.g;
        if (wtcVar == null || !wtcVar.n) {
            return;
        }
        jca.Z(wtcVar, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", k31Var);
    }

    @Override // defpackage.vji
    public final void d() {
        this.b.h(this.c);
    }

    @Override // defpackage.vji
    public final void e(int i, long j) {
        kna knaVar = this.b;
        wma wmaVar = (wma) knaVar.j.g(this.c);
        if (wmaVar == null || !wmaVar.H()) {
            return;
        }
        int i2 = ((i1d) ((j0d) wmaVar.o()).b).c;
        if (i < 0 || i >= i2) {
            r3a.d("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (wmaVar.I()) {
            r3a.a("Pre-measure called on node that is not placed");
        }
        wma wmaVar2 = knaVar.a;
        wmaVar2.q = true;
        ((xy) zma.a(wmaVar)).A((wma) ((j0d) wmaVar.o()).get(i), j);
        Unit unit = Unit.a;
        wmaVar2.q = false;
        this.a.a(i);
    }
}
