package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bna implements yji, m1c {
    public final /* synthetic */ ena a;
    public final /* synthetic */ kna b;

    public bna(kna knaVar) {
        this.b = knaVar;
        this.a = knaVar.h;
    }

    @Override // defpackage.kx4
    public final float C(long j) {
        return this.a.C(j);
    }

    @Override // defpackage.kx4
    public final float C0(int i) {
        return this.a.C0(i);
    }

    @Override // defpackage.kx4
    public final float D0(float f) {
        return f / this.a.j();
    }

    @Override // defpackage.kx4
    public final float H0(float f) {
        return this.a.j() * f;
    }

    @Override // defpackage.m1c
    public final l1c M0(int i, int i2, Map map, Function1 function1, Function1 function12) {
        return this.a.M0(i, i2, map, function1, function12);
    }

    @Override // defpackage.kx4
    public final long N(int i) {
        return this.a.N(i);
    }

    @Override // defpackage.kx4
    public final long O(float f) {
        return this.a.O(f);
    }

    @Override // defpackage.kx4
    public final long R0(long j) {
        return this.a.R0(j);
    }

    @Override // defpackage.l9a
    public final boolean W() {
        return this.a.W();
    }

    @Override // defpackage.kx4
    public final int e0(float f) {
        return this.a.e0(f);
    }

    @Override // defpackage.kx4
    public final float getFontScale() {
        return this.a.c;
    }

    @Override // defpackage.l9a
    public final ema getLayoutDirection() {
        return this.a.a;
    }

    @Override // defpackage.kx4
    public final float h0(long j) {
        return this.a.h0(j);
    }

    @Override // defpackage.kx4
    public final float j() {
        return this.a.b;
    }

    @Override // defpackage.yji
    public final List t(Object obj, Function2 function2) {
        kna knaVar = this.b;
        wma wmaVar = knaVar.a;
        x0d x0dVar = knaVar.g;
        wma wmaVar2 = (wma) x0dVar.g(obj);
        if (wmaVar2 != null && ((i1d) ((j0d) wmaVar.p()).b).p(wmaVar2) < knaVar.d) {
            return wmaVar2.n();
        }
        x0d x0dVar2 = knaVar.l;
        x0d x0dVar3 = knaVar.j;
        i1d i1dVar = knaVar.m;
        if (i1dVar.c < knaVar.e) {
            r3a.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        wma wmaVar3 = (wma) x0dVar.g(obj);
        int i = i1dVar.c;
        int i2 = knaVar.e;
        if (i == i2) {
            i1dVar.b(obj);
        } else {
            Object[] objArr = i1dVar.a;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        knaVar.e++;
        boolean b = x0dVar3.b(obj);
        if (b || wmaVar3 != null) {
            if (!b && wmaVar3 != null) {
                knaVar.k(((i1d) ((j0d) wmaVar.p()).b).p(wmaVar3), ((i1d) ((j0d) wmaVar.p()).b).c);
                knaVar.o++;
                x0dVar.k(obj);
                x0dVar3.m(obj, wmaVar3);
                x0dVar2.m(obj, knaVar.d(obj));
                if (wmaVar.H()) {
                    knaVar.i();
                }
            }
            wma wmaVar4 = (wma) x0dVar3.g(obj);
            cna cnaVar = wmaVar4 != null ? (cna) knaVar.f.g(wmaVar4) : null;
            if (cnaVar != null && cnaVar.d) {
                knaVar.n(wmaVar4, obj, false, function2);
            }
            if ((cnaVar != null ? cnaVar.f : null) != null) {
                knaVar.b(cnaVar, true);
            }
        } else {
            knaVar.l(obj, function2, false);
            x0dVar2.m(obj, knaVar.d(obj));
        }
        wma wmaVar5 = (wma) x0dVar3.g(obj);
        if (wmaVar5 == null) {
            return km5.a;
        }
        List n0 = wmaVar5.G.p.n0();
        j0d j0dVar = (j0d) n0;
        int i3 = ((i1d) j0dVar.b).c;
        for (int i4 = 0; i4 < i3; i4++) {
            ((j1c) j0dVar.get(i4)).f.b = true;
        }
        return n0;
    }

    @Override // defpackage.kx4
    public final long u(float f) {
        return this.a.u(f);
    }

    @Override // defpackage.kx4
    public final long v(long j) {
        return this.a.v(j);
    }

    @Override // defpackage.m1c
    public final l1c v0(int i, int i2, Map map, Function1 function1) {
        return this.a.M0(i, i2, map, null, function1);
    }
}
