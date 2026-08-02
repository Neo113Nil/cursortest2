package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class sw8 implements kxj, rq4, tti {
    public boolean a;

    @Override // defpackage.tti
    public final void A(nr9 nr9Var) {
        c(nr9Var);
    }

    @Override // defpackage.tti
    public final void D(nr9 nr9Var) {
        c(nr9Var);
    }

    public abstract void a(Drawable drawable);

    public final void b() {
        Object n = n();
        Animatable animatable = n instanceof Animatable ? (Animatable) n : null;
        if (animatable == null) {
            return;
        }
        if (this.a) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    public final void c(nr9 nr9Var) {
        Drawable t = nr9Var != null ? rfo.t(nr9Var, getView().getResources()) : null;
        Object n = n();
        Animatable animatable = n instanceof Animatable ? (Animatable) n : null;
        if (animatable != null) {
            animatable.stop();
        }
        a(t);
        b();
    }

    @Override // defpackage.kxj
    public abstract View getView();

    @Override // defpackage.kxj
    public abstract Drawable n();

    @Override // defpackage.rq4
    public final void onStart(u6b u6bVar) {
        this.a = true;
        b();
    }

    @Override // defpackage.rq4
    public final void onStop(u6b u6bVar) {
        this.a = false;
        b();
    }

    @Override // defpackage.tti
    public final void t(nr9 nr9Var) {
        c(nr9Var);
    }
}
