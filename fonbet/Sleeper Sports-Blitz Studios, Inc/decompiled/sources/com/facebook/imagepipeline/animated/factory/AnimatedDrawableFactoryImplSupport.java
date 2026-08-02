package com.facebook.imagepipeline.animated.factory;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import com.facebook.common.time.MonotonicClock;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableOptions;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableSupport;
import com.facebook.imagepipeline.animated.base.AnimatedImage;
import com.facebook.imagepipeline.animated.base.AnimatedImageResult;
import com.facebook.imagepipeline.animated.impl.AnimatedDrawableBackendProvider;
import com.facebook.imagepipeline.animated.impl.AnimatedDrawableCachingBackendImpl;
import com.facebook.imagepipeline.animated.impl.AnimatedDrawableCachingBackendImplProvider;
import com.facebook.imagepipeline.animated.impl.AnimatedDrawableDiagnosticsImpl;
import com.facebook.imagepipeline.animated.impl.AnimatedDrawableDiagnosticsNoop;
import com.facebook.imagepipeline.animated.util.AnimatedDrawableUtil;
import com.facebook.imagepipeline.image.CloseableAnimatedImage;
import com.facebook.imagepipeline.image.CloseableImage;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public class AnimatedDrawableFactoryImplSupport implements AnimatedDrawableFactory {
    private final AnimatedDrawableBackendProvider mAnimatedDrawableBackendProvider;
    private final AnimatedDrawableCachingBackendImplProvider mAnimatedDrawableCachingBackendProvider;
    private final AnimatedDrawableUtil mAnimatedDrawableUtil;
    private final MonotonicClock mMonotonicClock = new MonotonicClock() { // from class: com.facebook.imagepipeline.animated.factory.AnimatedDrawableFactoryImplSupport.1
        @Override // com.facebook.common.time.MonotonicClock
        public long now() {
            return SystemClock.uptimeMillis();
        }
    };
    private final Resources mResources;
    private final ScheduledExecutorService mScheduledExecutorServiceForUiThread;

    public AnimatedDrawableFactoryImplSupport(AnimatedDrawableBackendProvider animatedDrawableBackendProvider, AnimatedDrawableCachingBackendImplProvider animatedDrawableCachingBackendImplProvider, AnimatedDrawableUtil animatedDrawableUtil, ScheduledExecutorService scheduledExecutorService, Resources resources) {
        this.mAnimatedDrawableBackendProvider = animatedDrawableBackendProvider;
        this.mAnimatedDrawableCachingBackendProvider = animatedDrawableCachingBackendImplProvider;
        this.mAnimatedDrawableUtil = animatedDrawableUtil;
        this.mScheduledExecutorServiceForUiThread = scheduledExecutorService;
        this.mResources = resources;
    }

    public Drawable create(CloseableImage closeableImage) {
        if (closeableImage instanceof CloseableAnimatedImage) {
            return create(((CloseableAnimatedImage) closeableImage).getImageResult(), AnimatedDrawableOptions.DEFAULTS);
        }
        throw new UnsupportedOperationException("Unrecognized image class: " + closeableImage);
    }

    private AnimatedDrawableSupport create(AnimatedImageResult animatedImageResult, AnimatedDrawableOptions animatedDrawableOptions) {
        AnimatedImage image = animatedImageResult.getImage();
        return createAnimatedDrawable(animatedDrawableOptions, this.mAnimatedDrawableBackendProvider.get(animatedImageResult, new Rect(0, 0, image.getWidth(), image.getHeight())));
    }

    private AnimatedImageResult getImageIfCloseableAnimatedImage(CloseableImage closeableImage) {
        if (closeableImage instanceof CloseableAnimatedImage) {
            return ((CloseableAnimatedImage) closeableImage).getImageResult();
        }
        return null;
    }

    private AnimatedDrawableSupport createAnimatedDrawable(AnimatedDrawableOptions animatedDrawableOptions, AnimatedDrawableBackend animatedDrawableBackend) {
        AnimatedDrawableDiagnosticsImpl animatedDrawableDiagnosticsNoop;
        DisplayMetrics displayMetrics = this.mResources.getDisplayMetrics();
        AnimatedDrawableCachingBackendImpl animatedDrawableCachingBackendImpl = this.mAnimatedDrawableCachingBackendProvider.get(animatedDrawableBackend, animatedDrawableOptions);
        if (animatedDrawableOptions.enableDebugging) {
            animatedDrawableDiagnosticsNoop = new AnimatedDrawableDiagnosticsImpl(this.mAnimatedDrawableUtil, displayMetrics);
        } else {
            animatedDrawableDiagnosticsNoop = AnimatedDrawableDiagnosticsNoop.getInstance();
        }
        return new AnimatedDrawableSupport(this.mScheduledExecutorServiceForUiThread, animatedDrawableCachingBackendImpl, animatedDrawableDiagnosticsNoop, this.mMonotonicClock);
    }
}
