package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo extends wh {
    private Runnable fum;
    private int lo;
    ObjectAnimator pcc;
    ObjectAnimator sf;

    public oo(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        super(context, dynamicRootView, kjVar);
        this.lo = 0;
        this.fum = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.oo.1
            @Override // java.lang.Runnable
            public void run() {
                oo.this.pcc();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc() {
        final View childAt = getChildAt(this.lo);
        final View childAt2 = getChildAt((this.lo + 1) % getChildCount());
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, "translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (-(getChildAt(this.lo).getHeight() + this.kj)) / 2);
        this.pcc = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.pcc.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.oo.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                childAt.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt2, "translationY", (childAt2.getHeight() + this.kj) / 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.sf = ofFloat2;
        ofFloat2.setInterpolator(new LinearInterpolator());
        this.sf.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.oo.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                childAt2.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }
        });
        this.pcc.setDuration(500L);
        this.sf.setDuration(500L);
        this.pcc.start();
        this.sf.start();
        int i = this.lo + 1;
        this.lo = i;
        this.lo = i % getChildCount();
        postDelayed(this.fum, 2000L);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.topMargin = (this.kj - layoutParams.height) / 2;
            childAt.setLayoutParams(layoutParams);
            if (i != 0) {
                childAt.setVisibility(8);
            }
        }
        postDelayed(this.fum, 2500L);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mu
    public void sf() {
        removeCallbacks(this.fum);
        ObjectAnimator objectAnimator = this.pcc;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.pcc.cancel();
        }
        ObjectAnimator objectAnimator2 = this.sf;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.sf.cancel();
        }
        super.sf();
    }
}
