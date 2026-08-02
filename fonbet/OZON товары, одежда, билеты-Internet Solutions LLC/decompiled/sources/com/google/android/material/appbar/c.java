package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes9.dex */
final class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CoordinatorLayout f57957a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppBarLayout f57958b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AppBarLayout.BaseBehavior f57959c;

    c(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f57959c = baseBehavior;
        this.f57957a = coordinatorLayout;
        this.f57958b = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f57959c.k(this.f57957a, this.f57958b, intValue);
    }
}
