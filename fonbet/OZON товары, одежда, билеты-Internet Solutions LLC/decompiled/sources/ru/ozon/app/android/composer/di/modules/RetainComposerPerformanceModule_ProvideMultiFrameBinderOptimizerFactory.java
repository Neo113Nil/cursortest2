package ru.ozon.app.android.composer.di.modules;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.view.multiframebinder.MultiFrameBinderOptimizer;
import ru.ozon.app.android.network.abtool.FeatureService;

/* loaded from: classes6.dex */
public final class RetainComposerPerformanceModule_ProvideMultiFrameBinderOptimizerFactory implements e<MultiFrameBinderOptimizer> {
    public static MultiFrameBinderOptimizer provideMultiFrameBinderOptimizer(FeatureService featureService) {
        MultiFrameBinderOptimizer provideMultiFrameBinderOptimizer = RetainComposerPerformanceModule.INSTANCE.provideMultiFrameBinderOptimizer(featureService);
        j.d(provideMultiFrameBinderOptimizer);
        return provideMultiFrameBinderOptimizer;
    }
}
