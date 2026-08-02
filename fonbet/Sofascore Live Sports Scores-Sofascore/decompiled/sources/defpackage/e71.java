package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class e71 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ n71 c;

    public /* synthetic */ e71(n71 n71Var, int i, int i2) {
        this.a = i2;
        this.c = n71Var;
        this.b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        int i2 = this.b;
        n71 n71Var = this.c;
        switch (i) {
            case 0:
                n71Var.f(i2);
                break;
            default:
                n71Var.f(i2);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                n71 n71Var = this.c;
                n71Var.j.c(n71Var.b);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
