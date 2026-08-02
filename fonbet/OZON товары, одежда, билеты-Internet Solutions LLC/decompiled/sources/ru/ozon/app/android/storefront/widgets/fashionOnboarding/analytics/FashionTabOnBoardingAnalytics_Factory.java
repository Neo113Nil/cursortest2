package ru.ozon.app.android.storefront.widgets.fashionOnboarding.analytics;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.plugins.PluginsManager;

/* loaded from: classes2.dex */
public final class FashionTabOnBoardingAnalytics_Factory implements e<FashionTabOnBoardingAnalytics> {
    private final a<Sg.a> analyticsScreenStorageProvider;
    private final a<AnalyticsDataLayer> dataLayerProvider;
    private final a<PluginsManager> pluginsManagerProvider;

    public FashionTabOnBoardingAnalytics_Factory(a<AnalyticsDataLayer> aVar, a<PluginsManager> aVar2, a<Sg.a> aVar3) {
        this.dataLayerProvider = aVar;
        this.pluginsManagerProvider = aVar2;
        this.analyticsScreenStorageProvider = aVar3;
    }

    public static FashionTabOnBoardingAnalytics_Factory create(a<AnalyticsDataLayer> aVar, a<PluginsManager> aVar2, a<Sg.a> aVar3) {
        return new FashionTabOnBoardingAnalytics_Factory(aVar, aVar2, aVar3);
    }

    public static FashionTabOnBoardingAnalytics newInstance(AnalyticsDataLayer analyticsDataLayer, PluginsManager pluginsManager, Sg.a aVar) {
        return new FashionTabOnBoardingAnalytics(analyticsDataLayer, pluginsManager, aVar);
    }

    @Override // Pc.a
    public FashionTabOnBoardingAnalytics get() {
        return newInstance(this.dataLayerProvider.get(), this.pluginsManagerProvider.get(), this.analyticsScreenStorageProvider.get());
    }
}
