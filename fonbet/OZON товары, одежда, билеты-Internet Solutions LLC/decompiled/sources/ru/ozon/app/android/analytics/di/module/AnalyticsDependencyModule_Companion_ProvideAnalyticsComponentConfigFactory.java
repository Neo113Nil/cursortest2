package ru.ozon.app.android.analytics.di.module;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.analytics.di.AnalyticsComponentConfig;
import ru.ozon.app.android.network.abtool.FeatureService;

/* loaded from: classes6.dex */
public final class AnalyticsDependencyModule_Companion_ProvideAnalyticsComponentConfigFactory implements e<AnalyticsComponentConfig> {
    public static AnalyticsComponentConfig provideAnalyticsComponentConfig(FeatureService featureService, boolean z11) {
        AnalyticsComponentConfig provideAnalyticsComponentConfig = AnalyticsDependencyModule.INSTANCE.provideAnalyticsComponentConfig(featureService, z11);
        j.d(provideAnalyticsComponentConfig);
        return provideAnalyticsComponentConfig;
    }
}
