package defpackage;

import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cvk implements View.OnAttachStateChangeListener {
    public final View a;
    public ggf b;
    public g9i c;
    public avk d;
    public boolean e;

    public cvk(View view) {
        this.a = view;
    }

    public final synchronized void a() {
        try {
            g9i g9iVar = this.c;
            rq3 rq3Var = null;
            if (g9iVar != null) {
                g9iVar.e(null);
            }
            c09 c09Var = c09.a;
            hs4 hs4Var = z45.a;
            this.c = xw3.L(c09Var, rob.a.f, null, new hje(this, rq3Var, 13), 2);
            this.b = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        avk avkVar = this.d;
        if (avkVar == null) {
            return;
        }
        this.e = true;
        avkVar.a.a(avkVar.b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        avk avkVar = this.d;
        if (avkVar != null) {
            g6b g6bVar = avkVar.d;
            avkVar.e.e(null);
            sw8 sw8Var = avkVar.c;
            if (sw8Var != null && g6bVar != null) {
                g6bVar.d(sw8Var);
            }
            if (g6bVar != null) {
                g6bVar.d(avkVar);
            }
        }
    }
}
