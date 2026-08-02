package com.google.android.material.transformation;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: FabTransformationBehavior.java */
/* loaded from: classes13.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View b;

    public a(View view) {
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.b.invalidate();
    }
}
