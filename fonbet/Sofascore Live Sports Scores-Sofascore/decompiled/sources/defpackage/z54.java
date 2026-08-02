package defpackage;

import android.animation.Animator;
import com.google.android.material.button.MaterialButton;
import com.sofascore.results.crowdsourcing.CrowdsourcingOnboardingModal;
import com.sofascore.results.view.SofascoreSmallRatingView;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class z54 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z54(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        int i2 = this.b;
        Object obj = this.c;
        animator.getClass();
        switch (i) {
            case 0:
                z82 z82Var = ((CrowdsourcingOnboardingModal) obj).w;
                if (z82Var != null) {
                    ((MaterialButton) z82Var.c).setVisibility(i2 != 0 ? 0 : 8);
                    return;
                } else {
                    Intrinsics.i("modalBinding");
                    throw null;
                }
            default:
                ((SofascoreSmallRatingView) obj).p.setColor(i2);
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
        animator.getClass();
    }
}
