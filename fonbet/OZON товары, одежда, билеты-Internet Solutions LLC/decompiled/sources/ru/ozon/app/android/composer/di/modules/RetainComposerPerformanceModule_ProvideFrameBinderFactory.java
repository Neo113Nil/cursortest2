package ru.ozon.app.android.composer.di.modules;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.composer.view.multiframebinder.MultiFrameBinderAnalyticHelper;
import ru.ozon.app.android.composer.view.multiframebinder.MultiFrameBinderOptimizer;
import ru.ozon.app.android.composer.view.multiframebinder.ScrollStateListener;
import ru.ozon.app.android.network.abtool.FeatureService;

/* loaded from: classes6.dex */
public final class RetainComposerPerformanceModule_ProvideFrameBinderFactory implements e<FrameBinder> {
    public static FrameBinder provideFrameBinder(FeatureService featureService, ScrollStateListener scrollStateListener, MultiFrameBinderAnalyticHelper multiFrameBinderAnalyticHelper, MultiFrameBinderOptimizer multiFrameBinderOptimizer) {
        FrameBinder provideFrameBinder = RetainComposerPerformanceModule.INSTANCE.provideFrameBinder(featureService, scrollStateListener, multiFrameBinderAnalyticHelper, multiFrameBinderOptimizer);
        j.d(provideFrameBinder);
        return provideFrameBinder;
    }
}
