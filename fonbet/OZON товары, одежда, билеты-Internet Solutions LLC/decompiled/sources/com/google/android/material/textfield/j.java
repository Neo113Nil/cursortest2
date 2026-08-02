package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes9.dex */
final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f58745a;

    j(h hVar) {
        this.f58745a = hVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z11;
        ValueAnimator valueAnimator;
        h hVar = this.f58745a;
        CheckableImageButton checkableImageButton = hVar.f58751c;
        z11 = hVar.f58725m;
        checkableImageButton.setChecked(z11);
        valueAnimator = hVar.f58731s;
        valueAnimator.start();
    }
}
