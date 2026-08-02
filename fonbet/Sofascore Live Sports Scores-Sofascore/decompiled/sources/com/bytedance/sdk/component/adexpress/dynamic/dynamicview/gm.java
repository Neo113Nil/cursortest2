package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm extends wh {
    private boolean fum;
    private int lo;
    ObjectAnimator pcc;
    ObjectAnimator sf;
    private Runnable tz;

    public gm(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        super(context, dynamicRootView, kjVar);
        this.lo = 0;
        this.fum = false;
        this.tz = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.gm.1
            @Override // java.lang.Runnable
            public void run() {
                gm.this.pcc();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc() {
        final View childAt;
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        final View childAt2 = getChildAt(this.lo);
        if (childAt2 == null) {
            return;
        }
        int i = this.lo;
        if (i == 0) {
            this.fum = false;
        }
        if (i + 1 >= getChildCount() || ((ViewGroup) getChildAt(this.lo + 1)).getChildCount() <= 0) {
            this.fum = true;
            childAt = getChildAt(this.lo - 1);
            ofFloat = ObjectAnimator.ofFloat(childAt2, "translationX", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (getChildAt(this.lo).getWidth() + this.qf) / 2);
            this.pcc = ofFloat;
        } else {
            childAt = getChildAt(this.lo + 1);
            ofFloat = ObjectAnimator.ofFloat(childAt2, "translationX", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (-(getChildAt(this.lo).getWidth() + this.qf)) / 2);
            this.pcc = ofFloat;
        }
        if (childAt == null) {
            return;
        }
        ofFloat.setInterpolator(new LinearInterpolator());
        this.pcc.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.gm.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                childAt2.setVisibility(8);
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
        boolean z = this.fum;
        int i2 = this.qf;
        if (z) {
            ofFloat2 = ObjectAnimator.ofFloat(childAt, "translationX", (-(childAt.getWidth() + i2)) / 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.sf = ofFloat2;
        } else {
            ofFloat2 = ObjectAnimator.ofFloat(childAt, "translationX", (childAt.getWidth() + i2) / 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.sf = ofFloat2;
        }
        ofFloat2.setInterpolator(new LinearInterpolator());
        this.sf.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.gm.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                childAt.setVisibility(0);
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
        boolean z2 = this.fum;
        int i3 = this.lo;
        if (z2) {
            this.lo = i3 - 1;
        } else {
            this.lo = i3 + 1;
        }
        postDelayed(this.tz, 2000L);
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
        postDelayed(this.tz, 2500L);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mu
    public void sf() {
        removeCallbacks(this.tz);
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
