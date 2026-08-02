package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: AppBarLayout.java */
/* loaded from: classes13.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ CoordinatorLayout b;
    public final /* synthetic */ AppBarLayout c;
    public final /* synthetic */ AppBarLayout.BaseBehavior d;

    public a(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.d = baseBehavior;
        this.b = coordinatorLayout;
        this.c = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        this.d.M(this.b, this.c, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
