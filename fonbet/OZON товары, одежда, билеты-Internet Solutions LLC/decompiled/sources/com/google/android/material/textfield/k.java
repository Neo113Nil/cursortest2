package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
final class k implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f58746a;

    k(h hVar) {
        this.f58746a = hVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        this.f58746a.f58751c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
