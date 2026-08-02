package com.google.android.material.snackbar;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.unity3d.services.UnityAdsConstants;
import xsna.np6;
import xsna.qp6;

/* compiled from: BaseTransientBottomBar.java */
/* loaded from: classes13.dex */
public final class f implements Runnable {
    public final /* synthetic */ BaseTransientBottomBar b;

    public f(BaseTransientBottomBar baseTransientBottomBar) {
        this.b = baseTransientBottomBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BaseTransientBottomBar baseTransientBottomBar = this.b;
        BaseTransientBottomBar.g gVar = baseTransientBottomBar.i;
        if (gVar == null) {
            return;
        }
        int i = 0;
        if (gVar.getParent() != null) {
            gVar.setVisibility(0);
        }
        if (gVar.getAnimationMode() == 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            ofFloat.setInterpolator(baseTransientBottomBar.d);
            ofFloat.addUpdateListener(new a(baseTransientBottomBar));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
            ofFloat2.setInterpolator(baseTransientBottomBar.f);
            ofFloat2.addUpdateListener(new b(baseTransientBottomBar));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.setDuration(baseTransientBottomBar.a);
            animatorSet.addListener(new qp6(baseTransientBottomBar, i));
            animatorSet.start();
            return;
        }
        int height = gVar.getHeight();
        ViewGroup.LayoutParams layoutParams = gVar.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        gVar.setTranslationY(height);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(height, 0);
        valueAnimator.setInterpolator(baseTransientBottomBar.e);
        valueAnimator.setDuration(baseTransientBottomBar.c);
        valueAnimator.addListener(new np6(baseTransientBottomBar));
        valueAnimator.addUpdateListener(new c(baseTransientBottomBar, height));
        valueAnimator.start();
    }
}
