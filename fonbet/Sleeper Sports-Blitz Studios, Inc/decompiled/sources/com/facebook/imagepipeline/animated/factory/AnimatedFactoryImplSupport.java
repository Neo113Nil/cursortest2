package com.facebook.imagepipeline.animated.factory;

import android.content.res.Resources;
import com.facebook.imagepipeline.animated.impl.AnimatedDrawableBackendProvider;
import com.facebook.imagepipeline.animated.impl.AnimatedDrawableCachingBackendImplProvider;
import com.facebook.imagepipeline.animated.util.AnimatedDrawableUtil;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.core.ExecutorSupplier;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public class AnimatedFactoryImplSupport extends AnimatedFactoryImpl {
    public AnimatedFactoryImplSupport(PlatformBitmapFactory platformBitmapFactory, ExecutorSupplier executorSupplier) {
        super(platformBitmapFactory, executorSupplier);
    }

    protected AnimatedDrawableFactory createAnimatedDrawableFactory(AnimatedDrawableBackendProvider animatedDrawableBackendProvider, AnimatedDrawableCachingBackendImplProvider animatedDrawableCachingBackendImplProvider, AnimatedDrawableUtil animatedDrawableUtil, ScheduledExecutorService scheduledExecutorService, Resources resources) {
        return new AnimatedDrawableFactoryImplSupport(animatedDrawableBackendProvider, animatedDrawableCachingBackendImplProvider, animatedDrawableUtil, scheduledExecutorService, resources);
    }
}
