package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fy1 extends wtc implements oma, p3h {
    public Function1 o;

    public fy1(Function1 function1) {
        this.o = function1;
    }

    @Override // defpackage.wtc
    public final boolean Z0() {
        return false;
    }

    @Override // defpackage.p3h
    public final void i(b4h b4hVar) {
        uah uahVar;
        boolean z;
        wdd a0 = c6o.a0(this, 2);
        if (a0.F) {
            uahVar = a0.D;
            z = a0.E;
        } else {
            f4g f4gVar = s02.f;
            if (f4gVar == null) {
                s02.f = new f4g();
            } else {
                f4gVar.a();
            }
            f4g f4gVar2 = s02.f;
            f4gVar2.getClass();
            f4gVar2.s = a0.o.y;
            f4gVar2.r = d7a.I(a0.c);
            nnh w = bea.w();
            Function1 e = w != null ? w.e() : null;
            nnh C = bea.C(w);
            try {
                this.o.invoke(f4gVar2);
                Unit unit = Unit.a;
                bea.K(w, C, e);
                uahVar = f4gVar2.o;
                z = f4gVar2.p;
            } catch (Throwable th) {
                bea.K(w, C, e);
                throw th;
            }
        }
        if (z) {
            y3h.k(b4hVar, uahVar);
        }
    }

    @Override // defpackage.oma
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        qhe J = g1cVar.J(j);
        return m1c.G0(m1cVar, J.a, J.b, new i20(7, J, this));
    }

    @Override // defpackage.p3h
    public final boolean p() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.o + ')';
    }
}
