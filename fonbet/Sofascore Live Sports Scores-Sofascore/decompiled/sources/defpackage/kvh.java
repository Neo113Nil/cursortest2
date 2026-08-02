package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Paint;
import com.sofascore.results.view.SofascoreRatingView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kvh implements Animator.AnimatorListener {
    public final /* synthetic */ SofascoreRatingView a;
    public final /* synthetic */ double b;

    public kvh(SofascoreRatingView sofascoreRatingView, double d) {
        this.a = sofascoreRatingView;
        this.b = d;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        SofascoreRatingView sofascoreRatingView = this.a;
        Paint paint = sofascoreRatingView.t;
        Context context = sofascoreRatingView.getContext();
        context.getClass();
        paint.setColor(kpg.u(context, this.b, null));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        animator.getClass();
    }
}
