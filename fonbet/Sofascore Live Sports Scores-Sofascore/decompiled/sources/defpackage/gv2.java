package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class gv2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ hv2 b;

    public /* synthetic */ gv2(hv2 hv2Var, int i) {
        this.a = i;
        this.b = hv2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                hv2 hv2Var = this.b;
                hv2Var.d();
                p50 p50Var = hv2Var.j;
                if (p50Var != null) {
                    p50Var.a((v0a) hv2Var.a);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationRepeat(animator);
                hv2 hv2Var = this.b;
                hv2Var.g = (hv2Var.g + 4) % hv2Var.f.e.length;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
