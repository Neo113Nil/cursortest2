package ru.ozon.app.android.analytics.di.module;

import Jb.e;
import Jb.j;
import Qj0.I;
import java.util.List;
import ru.ozon.app.android.network.abtool.FeatureChecker;

/* loaded from: classes6.dex */
public final class AnalyticsDependencyModule_Companion_ProvidePerformanceTrackerInterceptorsFactory implements e<List<I>> {
    public static List<I> providePerformanceTrackerInterceptors(FeatureChecker featureChecker) {
        List<I> providePerformanceTrackerInterceptors = AnalyticsDependencyModule.INSTANCE.providePerformanceTrackerInterceptors(featureChecker);
        j.d(providePerformanceTrackerInterceptors);
        return providePerformanceTrackerInterceptors;
    }
}
