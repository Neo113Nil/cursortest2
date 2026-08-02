package defpackage;

import android.animation.Animator;
import android.graphics.Paint;
import com.sofascore.results.view.SofascoreRatingView;
import com.unity3d.services.UnityAdsConstants;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jvh implements Animator.AnimatorListener {
    public final /* synthetic */ Paint a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ SofascoreRatingView d;

    public jvh(Paint paint, int i, boolean z, SofascoreRatingView sofascoreRatingView) {
        this.a = paint;
        this.b = i;
        this.c = z;
        this.d = sofascoreRatingView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        this.a.setColor(this.b);
        if (this.c) {
            KProperty[] kPropertyArr = SofascoreRatingView.A;
            SofascoreRatingView sofascoreRatingView = this.d;
            sofascoreRatingView.l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            sofascoreRatingView.m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            sofascoreRatingView.n = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            sofascoreRatingView.o = 1.0f;
        }
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
