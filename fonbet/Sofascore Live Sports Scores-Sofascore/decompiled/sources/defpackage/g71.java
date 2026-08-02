package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class g71 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ n71 b;

    public /* synthetic */ g71(n71 n71Var, int i) {
        this.a = i;
        this.b = n71Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        n71 n71Var = this.b;
        switch (i) {
            case 0:
                n71Var.g();
                break;
            default:
                n71Var.g();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                n71 n71Var = this.b;
                yp3 yp3Var = n71Var.j;
                int i = n71Var.c;
                int i2 = n71Var.a;
                yp3Var.b(i - i2, i2);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
