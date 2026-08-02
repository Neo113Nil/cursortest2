package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.sofascore.results.view.header.widget.TimerGoalAnimatedView;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xij implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TimerGoalAnimatedView b;

    public /* synthetic */ xij(TimerGoalAnimatedView timerGoalAnimatedView, int i) {
        this.a = i;
        this.b = timerGoalAnimatedView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
        animator.getClass();
        switch (i) {
            case 0:
                TimerGoalAnimatedView timerGoalAnimatedView = this.b;
                timerGoalAnimatedView.setAlpha(1.0f);
                timerGoalAnimatedView.setTextNext(timerGoalAnimatedView.m);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        TimerGoalAnimatedView timerGoalAnimatedView = this.b;
        animator.getClass();
        switch (i) {
            case 0:
                break;
            case 1:
                timerGoalAnimatedView.setRollDirection(w5g.b);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                ofFloat.setDuration(200L);
                ofFloat.addUpdateListener(new wz1(timerGoalAnimatedView, 6));
                ofFloat.addListener(new xij(timerGoalAnimatedView, 2));
                ofFloat.start();
                break;
            default:
                timerGoalAnimatedView.setRollDirection(w5g.a);
                timerGoalAnimatedView.n = false;
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
