package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class iv2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ jv2 b;

    public /* synthetic */ iv2(jv2 jv2Var, int i) {
        this.a = i;
        this.b = jv2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                jv2 jv2Var = this.b;
                jv2Var.d();
                p50 p50Var = jv2Var.j;
                if (p50Var != null) {
                    p50Var.a((v0a) jv2Var.a);
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
                jv2 jv2Var = this.b;
                jv2Var.g = (jv2Var.g + jv2.l.length) % jv2Var.f.e.length;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
