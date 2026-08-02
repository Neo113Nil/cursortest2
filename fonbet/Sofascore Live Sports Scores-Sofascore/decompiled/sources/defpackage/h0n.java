package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h0n extends AnimatorListenerAdapter {
    public final /* synthetic */ asf a;
    public final /* synthetic */ lj2 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ d5m f;

    public h0n(asf asfVar, lj2 lj2Var, View view, int i, Function0 function0, d5m d5mVar) {
        this.a = asfVar;
        this.b = lj2Var;
        this.c = view;
        this.d = i;
        this.e = function0;
        this.f = d5mVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getClass();
        this.f.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        asf asfVar = this.a;
        if (asfVar.a) {
            return;
        }
        asfVar.a = true;
        lj2 lj2Var = this.b;
        if (lj2Var.r() instanceof oed) {
            this.c.setVisibility(this.d);
            Function0 function0 = this.e;
            if (function0 != null) {
                function0.invoke();
            }
            p2g p2gVar = w2g.b;
            lj2Var.resumeWith(Unit.a);
        }
    }
}
