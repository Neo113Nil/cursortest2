package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ky extends wtc implements p32, p3h, wia, oma, jyj {
    public final oo o = new oo(this, 2);
    public final /* synthetic */ xy p;

    public ky(xy xyVar) {
        this.p = xyVar;
    }

    @Override // defpackage.p32
    public final Object J0(wdd wddVar, y1 y1Var, sq3 sq3Var) {
        long P = wddVar.P(0L);
        oqf oqfVar = (oqf) y1Var.invoke();
        oqf k = oqfVar != null ? oqfVar.k(P) : null;
        if (k != null) {
            this.p.requestRectangleOnScreen(new Rect((int) k.a, (int) k.b, (int) k.c, (int) k.d), false);
        }
        return Unit.a;
    }

    @Override // defpackage.oma
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        qhe J = g1cVar.J(j);
        int i = J.a;
        int i2 = J.b;
        jy jyVar = new jy(J, 0);
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        return m1cVar.M0(i, i2, lm5Var, this.o, jyVar);
    }

    @Override // defpackage.wia
    public final boolean n0(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.jyj
    public final Object s() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // defpackage.wia
    public final boolean w0(KeyEvent keyEvent) {
        md8 md8Var;
        int[] iArr = td8.a;
        long w = u0a.w(keyEvent);
        if (qia.a(w, qia.b)) {
            md8Var = new md8(2);
        } else if (qia.a(w, qia.c)) {
            md8Var = new md8(1);
        } else if (qia.a(w, qia.p)) {
            md8Var = new md8(keyEvent.isShiftPressed() ? 2 : 1);
        } else {
            md8Var = qia.a(w, qia.g) ? new md8(4) : qia.a(w, qia.f) ? new md8(3) : (qia.a(w, qia.d) || qia.a(w, qia.C)) ? new md8(5) : (qia.a(w, qia.e) || qia.a(w, qia.D)) ? new md8(6) : (qia.a(w, qia.h) || qia.a(w, qia.r) || qia.a(w, qia.E)) ? new md8(7) : (qia.a(w, qia.a) || qia.a(w, qia.u)) ? new md8(8) : null;
        }
        if (md8Var != null) {
            int i = md8Var.a;
            if (u0a.z(keyEvent) == 2) {
                xy xyVar = this.p;
                ne8 g = ((yd8) xyVar.getFocusOwner()).g();
                if (g == null || !g.o || !xyVar.B(i)) {
                    Boolean f = ((yd8) xyVar.getFocusOwner()).f(i, xyVar.getEmbeddedViewFocusRect(), new oo(md8Var, 1));
                    if (!(f != null ? f.booleanValue() : true)) {
                        if (i == 1 || i == 2) {
                            Integer c = td8.c(i);
                            int intValue = c != null ? c.intValue() : 2;
                            FocusFinder focusFinder = FocusFinder.getInstance();
                            View rootView = xyVar.getRootView();
                            rootView.getClass();
                            View findNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, xyVar.getView(), intValue);
                            if (findNextFocus == null || findNextFocus.equals(xyVar)) {
                                return ((yd8) xyVar.getFocusOwner()).i(i);
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.p3h
    public final void i(b4h b4hVar) {
    }
}
