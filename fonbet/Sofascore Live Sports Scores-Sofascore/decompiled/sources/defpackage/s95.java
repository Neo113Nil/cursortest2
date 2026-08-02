package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class s95 extends wtc implements oma {
    public dx o;
    public Function2 p;
    public ewd q;
    public boolean r;

    @Override // defpackage.wtc
    public final void d1() {
        this.r = false;
    }

    @Override // defpackage.oma
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        qhe J = g1cVar.J(j);
        if (!m1cVar.W() || !this.r) {
            Pair pair = (Pair) this.p.invoke(new c7a((J.b & 4294967295L) | (J.a << 32)), new an3(j));
            dx dxVar = this.o;
            ptb ptbVar = (ptb) pair.a;
            Object obj = pair.b;
            if (!Intrinsics.c(dxVar.g(), ptbVar)) {
                ((eoh) ((e1d) dxVar.h)).setValue(ptbVar);
                j2d j2dVar = ((j8a) dxVar.l).b;
                boolean g = j2dVar.g();
                if (g) {
                    try {
                        zw zwVar = (zw) dxVar.o;
                        float d = dxVar.g().d(obj);
                        if (!Float.isNaN(d)) {
                            zw.a(zwVar, d);
                            dxVar.m(null);
                        }
                        dxVar.l(obj);
                        Unit unit = Unit.a;
                    } finally {
                        j2dVar.f(null);
                    }
                }
                if (!g) {
                    dxVar.m(obj);
                }
            }
        }
        this.r = m1cVar.W() || this.r;
        return m1c.G0(m1cVar, J.a, J.b, new fa(19, m1cVar, this, J));
    }
}
