package ru.ozon.app.android.composer.di.modules;

import Ih.b;
import Jb.e;
import Jb.j;
import RZ.a;
import ru.ozon.app.android.composer.tracker.BxPerformanceTraceHandler;
import ru.ozon.app.android.network.abtool.FeatureChecker;

/* loaded from: classes6.dex */
public final class RetainComposerPerformanceAnalyticsModule_Companion_ProvidePagePerformanceTrackerFactory implements e<b> {
    public static b providePagePerformanceTracker(BxPerformanceTraceHandler bxPerformanceTraceHandler, a aVar, Sg.a aVar2, FeatureChecker featureChecker) {
        b providePagePerformanceTracker = RetainComposerPerformanceAnalyticsModule.INSTANCE.providePagePerformanceTracker(bxPerformanceTraceHandler, aVar, aVar2, featureChecker);
        j.d(providePagePerformanceTracker);
        return providePagePerformanceTracker;
    }
}
