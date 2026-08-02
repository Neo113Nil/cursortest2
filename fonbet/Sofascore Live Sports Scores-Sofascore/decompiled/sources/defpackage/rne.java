package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rne extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ tne b;

    public /* synthetic */ rne(tne tneVar, int i) {
        this.a = i;
        this.b = tneVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i = this.a;
        tne tneVar = this.b;
        switch (i) {
            case 0:
                View view = tneVar.b;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup = tneVar.c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
                ViewGroup viewGroup2 = tneVar.d;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                }
                ViewGroup viewGroup3 = tneVar.f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                    break;
                }
                break;
            case 1:
            default:
                super.onAnimationEnd(animator);
                break;
            case 2:
                tneVar.i(0);
                break;
            case 3:
                tneVar.i(0);
                break;
            case 4:
                ViewGroup viewGroup4 = tneVar.g;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(4);
                    break;
                }
                break;
            case 5:
                ViewGroup viewGroup5 = tneVar.i;
                if (viewGroup5 != null) {
                    viewGroup5.setVisibility(4);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
        tne tneVar = this.b;
        switch (i) {
            case 0:
                View view = tneVar.k;
                if ((view instanceof it4) && !tneVar.B) {
                    it4 it4Var = (it4) view;
                    ValueAnimator valueAnimator = it4Var.E;
                    if (valueAnimator.isStarted()) {
                        valueAnimator.cancel();
                    }
                    valueAnimator.setFloatValues(it4Var.F, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    valueAnimator.setDuration(250L);
                    valueAnimator.start();
                    break;
                }
                break;
            case 1:
                View view2 = tneVar.b;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ViewGroup viewGroup = tneVar.c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ViewGroup viewGroup2 = tneVar.d;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
                ViewGroup viewGroup3 = tneVar.f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(tneVar.B ? 0 : 4);
                }
                View view3 = tneVar.k;
                if ((view3 instanceof it4) && !tneVar.B) {
                    it4 it4Var2 = (it4) view3;
                    ValueAnimator valueAnimator2 = it4Var2.E;
                    if (valueAnimator2.isStarted()) {
                        valueAnimator2.cancel();
                    }
                    it4Var2.G = false;
                    valueAnimator2.setFloatValues(it4Var2.F, 1.0f);
                    valueAnimator2.setDuration(250L);
                    valueAnimator2.start();
                    break;
                }
                break;
            case 2:
                tneVar.i(4);
                break;
            case 3:
                tneVar.i(4);
                break;
            case 4:
                ViewGroup viewGroup4 = tneVar.i;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(0);
                    viewGroup4.setTranslationX(viewGroup4.getWidth());
                    viewGroup4.scrollTo(viewGroup4.getWidth(), 0);
                    break;
                }
                break;
            default:
                ViewGroup viewGroup5 = tneVar.g;
                if (viewGroup5 != null) {
                    viewGroup5.setVisibility(0);
                    break;
                }
                break;
        }
    }
}
