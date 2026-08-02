package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yuk implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ ViewTreeObserver c;
    public final /* synthetic */ lj2 d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yuk(Object obj, ViewTreeObserver viewTreeObserver, lj2 lj2Var, int i) {
        this.a = i;
        this.e = obj;
        this.c = viewTreeObserver;
        this.d = lj2Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = this.a;
        lj2 lj2Var = this.d;
        ViewTreeObserver viewTreeObserver = this.c;
        Object obj = this.e;
        switch (i) {
            case 0:
                opf opfVar = (opf) obj;
                kjh b = opfVar.b();
                if (b != null) {
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnPreDrawListener(this);
                    } else {
                        opfVar.a.getViewTreeObserver().removeOnPreDrawListener(this);
                    }
                    if (!this.b) {
                        this.b = true;
                        p2g p2gVar = w2g.b;
                        lj2Var.resumeWith(b);
                        break;
                    }
                }
                break;
            default:
                ppf ppfVar = (ppf) obj;
                jjh b2 = ppfVar.b();
                if (b2 != null) {
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnPreDrawListener(this);
                    } else {
                        ppfVar.a.getViewTreeObserver().removeOnPreDrawListener(this);
                    }
                    if (!this.b) {
                        this.b = true;
                        p2g p2gVar2 = w2g.b;
                        lj2Var.resumeWith(b2);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
