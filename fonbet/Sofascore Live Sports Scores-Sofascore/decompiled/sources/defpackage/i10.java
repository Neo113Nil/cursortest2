package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i10 implements sje {
    public k5b a;
    public g9i b;
    public r5b c;
    public aeh d;

    @Override // defpackage.sje
    public final void a() {
        j(null);
    }

    @Override // defpackage.sje
    public final void b() {
        g9i g9iVar = this.b;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        this.b = null;
        b1d i = i();
        if (i != null) {
            ((aeh) i).d();
        }
    }

    @Override // defpackage.sje
    public final void c(wcj wcjVar, qu9 qu9Var, vsc vscVar, gt3 gt3Var) {
        j(new ke(wcjVar, this, qu9Var, vscVar, gt3Var, 1));
    }

    @Override // defpackage.sje
    public final void d(wcj wcjVar, wcj wcjVar2) {
        r5b r5bVar = this.c;
        if (r5bVar != null) {
            boolean z = (pej.c(r5bVar.h.b, wcjVar2.b) && Intrinsics.c(r5bVar.h.c, wcjVar2.c)) ? false : true;
            r5bVar.h = wcjVar2;
            int size = r5bVar.j.size();
            for (int i = 0; i < size; i++) {
                mqf mqfVar = (mqf) ((WeakReference) r5bVar.j.get(i)).get();
                if (mqfVar != null) {
                    mqfVar.g = wcjVar2;
                }
            }
            l5b l5bVar = r5bVar.m;
            synchronized (l5bVar.c) {
                l5bVar.j = null;
                l5bVar.l = null;
                l5bVar.k = null;
                l5bVar.m = null;
                l5bVar.n = null;
                Unit unit = Unit.a;
            }
            if (Intrinsics.c(wcjVar, wcjVar2)) {
                if (z) {
                    f4a f4aVar = r5bVar.b;
                    int g = pej.g(wcjVar2.b);
                    int f = pej.f(wcjVar2.b);
                    pej pejVar = r5bVar.h.c;
                    int g2 = pejVar != null ? pej.g(pejVar.a) : -1;
                    pej pejVar2 = r5bVar.h.c;
                    f4aVar.j().updateSelection((View) f4aVar.b, g, f, g2, pejVar2 != null ? pej.f(pejVar2.a) : -1);
                    return;
                }
                return;
            }
            if (wcjVar != null && (!Intrinsics.c(wcjVar.a.b, wcjVar2.a.b) || (pej.c(wcjVar.b, wcjVar2.b) && !Intrinsics.c(wcjVar.c, wcjVar2.c)))) {
                f4a f4aVar2 = r5bVar.b;
                f4aVar2.j().restartInput((View) f4aVar2.b);
                return;
            }
            int size2 = r5bVar.j.size();
            for (int i2 = 0; i2 < size2; i2++) {
                mqf mqfVar2 = (mqf) ((WeakReference) r5bVar.j.get(i2)).get();
                if (mqfVar2 != null) {
                    wcj wcjVar3 = r5bVar.h;
                    f4a f4aVar3 = r5bVar.b;
                    if (mqfVar2.k) {
                        mqfVar2.g = wcjVar3;
                        if (mqfVar2.i) {
                            f4aVar3.j().updateExtractedText((View) f4aVar3.b, mqfVar2.h, tba.P(wcjVar3));
                        }
                        pej pejVar3 = wcjVar3.c;
                        long j = wcjVar3.b;
                        int g3 = pejVar3 != null ? pej.g(pejVar3.a) : -1;
                        pej pejVar4 = wcjVar3.c;
                        f4aVar3.j().updateSelection((View) f4aVar3.b, pej.g(j), pej.f(j), g3, pejVar4 != null ? pej.f(pejVar4.a) : -1);
                    }
                }
            }
        }
    }

    @Override // defpackage.sje
    public final void e() {
        mvh mvhVar;
        k5b k5bVar = this.a;
        if (k5bVar == null || (mvhVar = (mvh) tgj.x(k5bVar, dh3.q)) == null) {
            return;
        }
        ((lw4) mvhVar).a();
    }

    @Override // defpackage.sje
    public final void f(oqf oqfVar) {
        Rect rect;
        r5b r5bVar = this.c;
        if (r5bVar != null) {
            r5bVar.l = new Rect(wzb.b(oqfVar.a), wzb.b(oqfVar.b), wzb.b(oqfVar.c), wzb.b(oqfVar.d));
            if (!r5bVar.j.isEmpty() || (rect = r5bVar.l) == null) {
                return;
            }
            r5bVar.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // defpackage.sje
    public final void g(wcj wcjVar, nnd nndVar, aej aejVar, oi oiVar, oqf oqfVar, oqf oqfVar2) {
        r5b r5bVar = this.c;
        if (r5bVar != null) {
            l5b l5bVar = r5bVar.m;
            synchronized (l5bVar.c) {
                try {
                    l5bVar.j = wcjVar;
                    l5bVar.l = nndVar;
                    l5bVar.k = aejVar;
                    l5bVar.m = oqfVar;
                    l5bVar.n = oqfVar2;
                    if (!l5bVar.e) {
                        if (l5bVar.d) {
                        }
                        Unit unit = Unit.a;
                    }
                    l5bVar.a();
                    Unit unit2 = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.sje
    public final void h() {
        mvh mvhVar;
        k5b k5bVar = this.a;
        if (k5bVar == null || (mvhVar = (mvh) tgj.x(k5bVar, dh3.q)) == null) {
            return;
        }
        ((lw4) mvhVar).b();
    }

    public final b1d i() {
        aeh aehVar = this.d;
        if (aehVar != null) {
            return aehVar;
        }
        if (!oji.a) {
            return null;
        }
        aeh b = beh.b(1, 0, a62.c, 2);
        this.d = b;
        return b;
    }

    public final void j(ke keVar) {
        k5b k5bVar = this.a;
        if (k5bVar == null) {
            return;
        }
        this.b = k5bVar.n ? xw3.L(k5bVar.Y0(), null, nu3.d, new yp7(k5bVar, new u1(keVar, this, k5bVar, r4, 1), r4, 26), 1) : null;
    }

    public final void k(k5b k5bVar) {
        if (this.a != k5bVar) {
            u3a.c("Expected textInputModifierNode to be " + k5bVar + " but was " + this.a);
        }
        this.a = null;
    }
}
