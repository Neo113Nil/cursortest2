package com.facebook.imagepipeline.animated.base;

import android.graphics.drawable.Animatable;
import com.nineoldandroids.animation.ValueAnimator;

/* loaded from: classes6.dex */
public interface AnimatableDrawableSupport extends Animatable {
    ValueAnimator.AnimatorUpdateListener createAnimatorUpdateListener();

    ValueAnimator createValueAnimator();

    ValueAnimator createValueAnimator(int i);
}
