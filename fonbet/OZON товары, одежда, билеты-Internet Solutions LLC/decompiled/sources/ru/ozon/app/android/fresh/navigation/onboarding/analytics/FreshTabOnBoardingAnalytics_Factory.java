package ru.ozon.app.android.fresh.navigation.onboarding.analytics;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.plugins.PluginsManager;

/* loaded from: classes12.dex */
public final class FreshTabOnBoardingAnalytics_Factory implements e<FreshTabOnBoardingAnalytics> {
    private final a<Sg.a> analyticsScreenStorageProvider;
    private final a<AnalyticsDataLayer> dataLayerProvider;
    private final a<PluginsManager> pluginsManagerProvider;

    public FreshTabOnBoardingAnalytics_Factory(a<AnalyticsDataLayer> aVar, a<PluginsManager> aVar2, a<Sg.a> aVar3) {
        this.dataLayerProvider = aVar;
        this.pluginsManagerProvider = aVar2;
        this.analyticsScreenStorageProvider = aVar3;
    }

    public static FreshTabOnBoardingAnalytics_Factory create(a<AnalyticsDataLayer> aVar, a<PluginsManager> aVar2, a<Sg.a> aVar3) {
        return new FreshTabOnBoardingAnalytics_Factory(aVar, aVar2, aVar3);
    }

    public static FreshTabOnBoardingAnalytics newInstance(AnalyticsDataLayer analyticsDataLayer, PluginsManager pluginsManager, Sg.a aVar) {
        return new FreshTabOnBoardingAnalytics(analyticsDataLayer, pluginsManager, aVar);
    }

    @Override // Pc.a
    public FreshTabOnBoardingAnalytics get() {
        return newInstance(this.dataLayerProvider.get(), this.pluginsManagerProvider.get(), this.analyticsScreenStorageProvider.get());
    }
}
