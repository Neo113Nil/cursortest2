package defpackage;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class idj implements sje {
    public final View a;
    public final ejg b;
    public final sg6 c;
    public boolean d;
    public Function1 e;
    public Function1 f;
    public wcj g;
    public qu9 h;
    public final ArrayList i;
    public final joa j;
    public Rect k;
    public final t84 l;
    public final i1d m;
    public t4f n;

    public idj(View view, xy xyVar) {
        ejg ejgVar = new ejg(view);
        sg6 sg6Var = new sg6(Choreographer.getInstance(), 1);
        this.a = view;
        this.b = ejgVar;
        this.c = sg6Var;
        this.e = tyd.q;
        this.f = tyd.r;
        this.g = new wcj(4, pej.b, "");
        this.h = qu9.g;
        this.i = new ArrayList();
        this.j = ypa.a(ysa.c, new s2j(this, 3));
        this.l = new t84(xyVar, ejgVar);
        this.m = new i1d(new hdj[16], 0);
    }

    @Override // defpackage.sje
    public final void a() {
        i(hdj.a);
    }

    @Override // defpackage.sje
    public final void b() {
        this.d = false;
        this.e = tyd.s;
        this.f = tyd.t;
        this.k = null;
        i(hdj.b);
    }

    @Override // defpackage.sje
    public final void c(wcj wcjVar, qu9 qu9Var, vsc vscVar, gt3 gt3Var) {
        this.d = true;
        this.g = wcjVar;
        this.h = qu9Var;
        this.e = vscVar;
        this.f = gt3Var;
        i(hdj.a);
    }

    @Override // defpackage.sje
    public final void d(wcj wcjVar, wcj wcjVar2) {
        boolean z = (pej.c(this.g.b, wcjVar2.b) && Intrinsics.c(this.g.c, wcjVar2.c)) ? false : true;
        this.g = wcjVar2;
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            lqf lqfVar = (lqf) ((WeakReference) this.i.get(i)).get();
            if (lqfVar != null) {
                lqfVar.d = wcjVar2;
            }
        }
        t84 t84Var = this.l;
        synchronized (t84Var.c) {
            t84Var.j = null;
            t84Var.l = null;
            t84Var.k = null;
            t84Var.m = s84.j;
            t84Var.n = null;
            t84Var.o = null;
            Unit unit = Unit.a;
        }
        if (Intrinsics.c(wcjVar, wcjVar2)) {
            if (z) {
                ejg ejgVar = this.b;
                int g = pej.g(wcjVar2.b);
                int f = pej.f(wcjVar2.b);
                pej pejVar = this.g.c;
                int g2 = pejVar != null ? pej.g(pejVar.a) : -1;
                pej pejVar2 = this.g.c;
                ((InputMethodManager) ((joa) ejgVar.b).getValue()).updateSelection((View) ejgVar.c, g, f, g2, pejVar2 != null ? pej.f(pejVar2.a) : -1);
                return;
            }
            return;
        }
        if (wcjVar != null && (!Intrinsics.c(wcjVar.a.b, wcjVar2.a.b) || (pej.c(wcjVar.b, wcjVar2.b) && !Intrinsics.c(wcjVar.c, wcjVar2.c)))) {
            ejg ejgVar2 = this.b;
            ((InputMethodManager) ((joa) ejgVar2.b).getValue()).restartInput((View) ejgVar2.c);
            return;
        }
        int size2 = this.i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            lqf lqfVar2 = (lqf) ((WeakReference) this.i.get(i2)).get();
            if (lqfVar2 != null) {
                wcj wcjVar3 = this.g;
                ejg ejgVar3 = this.b;
                if (lqfVar2.h) {
                    lqfVar2.d = wcjVar3;
                    if (lqfVar2.f) {
                        ((InputMethodManager) ((joa) ejgVar3.b).getValue()).updateExtractedText((View) ejgVar3.c, lqfVar2.e, l4a.N(wcjVar3));
                    }
                    pej pejVar3 = wcjVar3.c;
                    long j = wcjVar3.b;
                    int g3 = pejVar3 != null ? pej.g(pejVar3.a) : -1;
                    pej pejVar4 = wcjVar3.c;
                    ((InputMethodManager) ((joa) ejgVar3.b).getValue()).updateSelection((View) ejgVar3.c, pej.g(j), pej.f(j), g3, pejVar4 != null ? pej.f(pejVar4.a) : -1);
                }
            }
        }
    }

    @Override // defpackage.sje
    public final void e() {
        i(hdj.d);
    }

    @Override // defpackage.sje
    public final void f(oqf oqfVar) {
        Rect rect;
        this.k = new Rect(wzb.b(oqfVar.a), wzb.b(oqfVar.b), wzb.b(oqfVar.c), wzb.b(oqfVar.d));
        if (!this.i.isEmpty() || (rect = this.k) == null) {
            return;
        }
        this.a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // defpackage.sje
    public final void g(wcj wcjVar, nnd nndVar, aej aejVar, oi oiVar, oqf oqfVar, oqf oqfVar2) {
        t84 t84Var = this.l;
        synchronized (t84Var.c) {
            try {
                t84Var.j = wcjVar;
                t84Var.l = nndVar;
                t84Var.k = aejVar;
                t84Var.m = oiVar;
                t84Var.n = oqfVar;
                t84Var.o = oqfVar2;
                if (!t84Var.e) {
                    if (t84Var.d) {
                    }
                    Unit unit = Unit.a;
                }
                t84Var.a();
                Unit unit2 = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.sje
    public final void h() {
        i(hdj.c);
    }

    public final void i(hdj hdjVar) {
        this.m.b(hdjVar);
        if (this.n == null) {
            t4f t4fVar = new t4f(this, 17);
            this.c.execute(t4fVar);
            this.n = t4fVar;
        }
    }
}
