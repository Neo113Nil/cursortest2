package com.facebook.imagepipeline.animated.base;

import android.view.animation.LinearInterpolator;
import com.facebook.common.time.MonotonicClock;
import com.nineoldandroids.animation.ValueAnimator;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public class AnimatedDrawableSupport extends AbstractAnimatedDrawable implements AnimatableDrawableSupport {
    public AnimatedDrawableSupport(ScheduledExecutorService scheduledExecutorService, AnimatedDrawableCachingBackend animatedDrawableCachingBackend, AnimatedDrawableDiagnostics animatedDrawableDiagnostics, MonotonicClock monotonicClock) {
        super(scheduledExecutorService, animatedDrawableCachingBackend, animatedDrawableDiagnostics, monotonicClock);
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatableDrawableSupport
    public ValueAnimator createValueAnimator(int i) {
        ValueAnimator createValueAnimator = createValueAnimator();
        createValueAnimator.setRepeatCount(Math.max(i / getAnimatedDrawableBackend().getDurationMs(), 1));
        return createValueAnimator;
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatableDrawableSupport
    public ValueAnimator createValueAnimator() {
        int loopCount = getAnimatedDrawableBackend().getLoopCount();
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, getDuration());
        valueAnimator.setDuration(getDuration());
        if (loopCount == 0) {
            loopCount = -1;
        }
        valueAnimator.setRepeatCount(loopCount);
        valueAnimator.setRepeatMode(1);
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.addUpdateListener(createAnimatorUpdateListener());
        return valueAnimator;
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatableDrawableSupport
    public ValueAnimator.AnimatorUpdateListener createAnimatorUpdateListener() {
        return new ValueAnimator.AnimatorUpdateListener() { // from class: com.facebook.imagepipeline.animated.base.AnimatedDrawableSupport.1
            @Override // com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                AnimatedDrawableSupport.this.setLevel(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        };
    }
}
