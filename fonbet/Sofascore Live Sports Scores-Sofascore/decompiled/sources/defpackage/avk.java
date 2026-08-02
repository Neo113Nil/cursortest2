package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class avk implements e0g, rq4 {
    public final apf a;
    public final nt9 b;
    public final sw8 c;
    public final g6b d;
    public final yda e;

    public avk(apf apfVar, nt9 nt9Var, sw8 sw8Var, g6b g6bVar, yda ydaVar) {
        this.a = apfVar;
        this.b = nt9Var;
        this.c = sw8Var;
        this.d = g6bVar;
        this.e = ydaVar;
    }

    @Override // defpackage.e0g
    public final void h() {
        sw8 sw8Var = this.c;
        if (sw8Var.getView().isAttachedToWindow()) {
            return;
        }
        cvk Q = aik.Q(sw8Var.getView());
        avk avkVar = Q.d;
        if (avkVar != null) {
            g6b g6bVar = avkVar.d;
            avkVar.e.e(null);
            sw8 sw8Var2 = avkVar.c;
            if (sw8Var2 != null && g6bVar != null) {
                g6bVar.d(sw8Var2);
            }
            if (g6bVar != null) {
                g6bVar.d(avkVar);
            }
        }
        Q.d = this;
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // defpackage.e0g
    public final void m() {
        g6b g6bVar = this.d;
        if (g6bVar != null) {
            g6bVar.a(this);
        }
        sw8 sw8Var = this.c;
        if (sw8Var != null && g6bVar != null) {
            g6bVar.d(sw8Var);
            g6bVar.a(sw8Var);
        }
        cvk Q = aik.Q(sw8Var.getView());
        avk avkVar = Q.d;
        if (avkVar != null) {
            g6b g6bVar2 = avkVar.d;
            avkVar.e.e(null);
            sw8 sw8Var2 = avkVar.c;
            if (sw8Var2 != null && g6bVar2 != null) {
                g6bVar2.d(sw8Var2);
            }
            if (g6bVar2 != null) {
                g6bVar2.d(avkVar);
            }
        }
        Q.d = this;
    }

    @Override // defpackage.e0g
    public final Object n(xof xofVar) {
        g6b g6bVar = this.d;
        return g6bVar != null ? bea.n(g6bVar, xofVar) : Unit.a;
    }

    @Override // defpackage.rq4
    public final void onDestroy(u6b u6bVar) {
        aik.Q(this.c.getView()).a();
    }
}
