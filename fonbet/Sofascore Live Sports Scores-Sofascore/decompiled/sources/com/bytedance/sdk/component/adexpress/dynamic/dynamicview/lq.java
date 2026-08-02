package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.ironsource.Ua;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class lq extends wh {
    private boolean fum;
    private int lo;
    ObjectAnimator pcc;
    ObjectAnimator sf;
    private Runnable tz;

    public lq(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        super(context, dynamicRootView, kjVar);
        this.lo = 0;
        this.fum = false;
        this.tz = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lq.1
            @Override // java.lang.Runnable
            public void run() {
                lq.this.pcc();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc() {
        final View view;
        ObjectAnimator objectAnimator;
        ObjectAnimator ofFloat;
        final View childAt = getChildAt(this.lo);
        int i = this.lo;
        if (i == 0) {
            this.fum = false;
        }
        boolean z = i + 1 >= getChildCount() || ((ViewGroup) getChildAt(this.lo + 1)).getChildCount() <= 0;
        if (this.hc.ork().vj().pcc() || !z) {
            int i2 = this.lo;
            View childAt2 = z ? getChildAt((i2 + 2) % getChildCount()) : getChildAt((i2 + 1) % getChildCount());
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, "translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (-(getChildAt(this.lo).getHeight() + this.kj)) / 2);
            this.pcc = ofFloat2;
            if (z) {
                this.lo++;
            }
            view = childAt2;
            objectAnimator = ofFloat2;
        } else {
            this.fum = true;
            view = getChildAt(this.lo - 1);
            objectAnimator = ObjectAnimator.ofFloat(childAt, "translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (getChildAt(this.lo).getHeight() + this.kj) / 2);
            this.pcc = objectAnimator;
        }
        objectAnimator.setInterpolator(new LinearInterpolator());
        this.pcc.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lq.2
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
        boolean z2 = this.fum;
        int i3 = this.kj;
        if (z2) {
            ofFloat = ObjectAnimator.ofFloat(view, "translationY", (-(view.getHeight() + i3)) / 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.sf = ofFloat;
        } else {
            ofFloat = ObjectAnimator.ofFloat(view, "translationY", (view.getHeight() + i3) / 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.sf = ofFloat;
        }
        ofFloat.setInterpolator(new LinearInterpolator());
        this.sf.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lq.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                view.setVisibility(0);
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
        boolean z3 = this.fum;
        int i4 = this.lo;
        if (z3) {
            this.lo = i4 - 1;
        } else {
            int i5 = i4 + 1;
            this.lo = i5;
            this.lo = i5 % getChildCount();
        }
        postDelayed(this.tz, Ua.C);
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
