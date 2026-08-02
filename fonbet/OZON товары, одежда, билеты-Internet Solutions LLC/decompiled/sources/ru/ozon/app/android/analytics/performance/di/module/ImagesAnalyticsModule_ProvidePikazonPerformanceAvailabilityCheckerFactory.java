package ru.ozon.app.android.analytics.performance.di.module;

import Jb.e;
import Jb.j;
import Sg.a;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker;

/* loaded from: classes6.dex */
public final class ImagesAnalyticsModule_ProvidePikazonPerformanceAvailabilityCheckerFactory implements e<PikazonPerformanceAvailabilityChecker> {
    public static PikazonPerformanceAvailabilityChecker providePikazonPerformanceAvailabilityChecker(PerformanceTrackerDelegate performanceTrackerDelegate, FeatureChecker featureChecker, a aVar) {
        PikazonPerformanceAvailabilityChecker providePikazonPerformanceAvailabilityChecker = ImagesAnalyticsModule.INSTANCE.providePikazonPerformanceAvailabilityChecker(performanceTrackerDelegate, featureChecker, aVar);
        j.d(providePikazonPerformanceAvailabilityChecker);
        return providePikazonPerformanceAvailabilityChecker;
    }
}
