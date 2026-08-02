package com.google.android.material.navigation;

import android.animation.ValueAnimator;

/* loaded from: classes9.dex */
final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ float f58467a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f58468b;

    b(a aVar, float f7) {
        this.f58468b = aVar;
        this.f58467a = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f58468b.p(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f58467a);
    }
}
