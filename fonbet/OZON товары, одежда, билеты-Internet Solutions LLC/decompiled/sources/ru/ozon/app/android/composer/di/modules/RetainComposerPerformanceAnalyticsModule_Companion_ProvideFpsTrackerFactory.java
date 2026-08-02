package ru.ozon.app.android.composer.di.modules;

import Hh.C3140a;
import Jb.e;
import Jb.j;
import Sg.a;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.storage.debug.DebugToolsStorage;

/* loaded from: classes6.dex */
public final class RetainComposerPerformanceAnalyticsModule_Companion_ProvideFpsTrackerFactory implements e<C3140a> {
    public static C3140a provideFpsTracker(PerformanceTrackerDelegate performanceTrackerDelegate, a aVar, FeatureService featureService, DebugToolsStorage debugToolsStorage) {
        C3140a provideFpsTracker = RetainComposerPerformanceAnalyticsModule.INSTANCE.provideFpsTracker(performanceTrackerDelegate, aVar, featureService, debugToolsStorage);
        j.d(provideFpsTracker);
        return provideFpsTracker;
    }
}
