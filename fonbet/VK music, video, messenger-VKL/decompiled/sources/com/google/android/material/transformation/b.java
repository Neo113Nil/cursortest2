package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import xsna.cec;

/* compiled from: FabTransformationBehavior.java */
/* loaded from: classes13.dex */
public final class b extends AnimatorListenerAdapter {
    public final /* synthetic */ cec b;
    public final /* synthetic */ Drawable c;

    public b(cec cecVar, Drawable drawable) {
        this.b = cecVar;
        this.c = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setCircularRevealOverlayDrawable(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.setCircularRevealOverlayDrawable(this.c);
    }
}
