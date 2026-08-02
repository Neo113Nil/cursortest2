package androidx.fragment.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import defpackage.a70;
import defpackage.fp4;
import defpackage.ixh;
import defpackage.us4;
import defpackage.xn8;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c extends ixh {
    public final d c;

    public c(d dVar) {
        this.c = dVar;
    }

    @Override // defpackage.ixh
    public final void b(ViewGroup viewGroup) {
        viewGroup.getClass();
        y yVar = this.c.a;
        View view = yVar.c.mView;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        yVar.c(this);
        if (s.O(2)) {
            yVar.toString();
        }
    }

    @Override // defpackage.ixh
    public final void c(ViewGroup viewGroup) {
        viewGroup.getClass();
        d dVar = this.c;
        y yVar = dVar.a;
        if (dVar.a()) {
            yVar.c(this);
            return;
        }
        Context context = viewGroup.getContext();
        View view = yVar.c.mView;
        context.getClass();
        fp4 b = dVar.b(context);
        if (b == null) {
            a70.r("Required value was null.");
            return;
        }
        Animation animation = (Animation) b.b;
        if (animation == null) {
            a70.r("Required value was null.");
            return;
        }
        if (yVar.a != 1) {
            view.startAnimation(animation);
            yVar.c(this);
            return;
        }
        viewGroup.startViewTransition(view);
        xn8 xn8Var = new xn8(animation, viewGroup, view);
        xn8Var.setAnimationListener(new us4(yVar, viewGroup, view, this));
        view.startAnimation(xn8Var);
        if (s.O(2)) {
            yVar.toString();
        }
    }
}
