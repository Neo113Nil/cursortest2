package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.sofascore.results.event.details.view.cricket.runsperover.CricketRunsPerOverGraphView;
import com.sofascore.results.view.header.widget.RollingTextView;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class j6 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ise binding;
        int i = this.a;
        Object obj = this.b;
        animator.getClass();
        switch (i) {
            case 0:
                k6 k6Var = (k6) obj;
                if (!k6Var.k) {
                    k6Var.j.start();
                }
                k6Var.l();
                break;
            case 1:
                ((ValueAnimator) obj).start();
                break;
            case 2:
                CricketRunsPerOverGraphView cricketRunsPerOverGraphView = (CricketRunsPerOverGraphView) obj;
                cricketRunsPerOverGraphView.w = cricketRunsPerOverGraphView.t;
                cricketRunsPerOverGraphView.I = false;
                break;
            case 3:
                Function0 function0 = (Function0) obj;
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            case 4:
                binding = ((hse) obj).getBinding();
                View view = binding.b;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    break;
                } else {
                    tl3 tl3Var = (tl3) layoutParams;
                    ((ViewGroup.MarginLayoutParams) tl3Var).width = -1;
                    view.setLayoutParams(tl3Var);
                    break;
                }
            case 5:
                ((RollingTextView) obj).b();
                break;
            default:
                fcg fcgVar = (fcg) obj;
                RelativeLayout relativeLayout = fcgVar.l;
                jca.S(relativeLayout, -1, -1);
                relativeLayout.setX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                relativeLayout.setY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                xag xagVar = fcgVar.j;
                if (xagVar != null) {
                    ((zag) xagVar).e();
                }
                fcgVar.k.post(new zbg(fcgVar, 6));
                break;
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
