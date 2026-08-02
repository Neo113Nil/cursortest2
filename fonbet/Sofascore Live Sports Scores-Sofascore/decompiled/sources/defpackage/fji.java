package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class fji extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ hji b;

    public /* synthetic */ fji(hji hjiVar, int i) {
        this.a = i;
        this.b = hjiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i = this.a;
        hji hjiVar = this.b;
        switch (i) {
            case 0:
                View view = hjiVar.b;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup = hjiVar.c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
                ViewGroup viewGroup2 = hjiVar.e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                    break;
                }
                break;
            case 1:
            default:
                super.onAnimationEnd(animator);
                break;
            case 2:
                hjiVar.i(0);
                break;
            case 3:
                hjiVar.i(0);
                break;
            case 4:
                ViewGroup viewGroup3 = hjiVar.f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                    break;
                }
                break;
            case 5:
                ViewGroup viewGroup4 = hjiVar.h;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(4);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
        hji hjiVar = this.b;
        switch (i) {
            case 0:
                View view = hjiVar.j;
                if ((view instanceof ht4) && !hjiVar.A) {
                    ht4 ht4Var = (ht4) view;
                    ValueAnimator valueAnimator = ht4Var.E;
                    if (valueAnimator.isStarted()) {
                        valueAnimator.cancel();
                    }
                    valueAnimator.setFloatValues(ht4Var.F, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    valueAnimator.setDuration(250L);
                    valueAnimator.start();
                    break;
                }
                break;
            case 1:
                View view2 = hjiVar.b;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ViewGroup viewGroup = hjiVar.c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ViewGroup viewGroup2 = hjiVar.e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(hjiVar.A ? 0 : 4);
                }
                View view3 = hjiVar.j;
                if ((view3 instanceof ht4) && !hjiVar.A) {
                    ht4 ht4Var2 = (ht4) view3;
                    ValueAnimator valueAnimator2 = ht4Var2.E;
                    if (valueAnimator2.isStarted()) {
                        valueAnimator2.cancel();
                    }
                    ht4Var2.G = false;
                    valueAnimator2.setFloatValues(ht4Var2.F, 1.0f);
                    valueAnimator2.setDuration(250L);
                    valueAnimator2.start();
                    break;
                }
                break;
            case 2:
                hjiVar.i(4);
                break;
            case 3:
                hjiVar.i(4);
                break;
            case 4:
                ViewGroup viewGroup3 = hjiVar.h;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                    viewGroup3.setTranslationX(viewGroup3.getWidth());
                    viewGroup3.scrollTo(viewGroup3.getWidth(), 0);
                    break;
                }
                break;
            default:
                ViewGroup viewGroup4 = hjiVar.f;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(0);
                    break;
                }
                break;
        }
    }
}
