package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
final class g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CollapsingToolbarLayout f57968a;

    g(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f57968a = collapsingToolbarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        this.f57968a.e(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
