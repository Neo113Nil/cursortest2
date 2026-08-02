package ru.ozon.app.android.fresh.navigation.di.modules;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.modules.MiniAppAnalytics;
import ru.ozon.app.android.analytics.plugins.PluginsManager;

/* loaded from: classes12.dex */
public final class MiniAppAnalyticsModule_Companion_ProvideMiniAppAnalyticsFactory implements e<MiniAppAnalytics> {
    private final a<Sg.a> analyticsScreenStorageProvider;
    private final a<AnalyticsDataLayer> dataLayerProvider;
    private final a<PluginsManager> pluginsManagerProvider;

    public MiniAppAnalyticsModule_Companion_ProvideMiniAppAnalyticsFactory(a<PluginsManager> aVar, a<AnalyticsDataLayer> aVar2, a<Sg.a> aVar3) {
        this.pluginsManagerProvider = aVar;
        this.dataLayerProvider = aVar2;
        this.analyticsScreenStorageProvider = aVar3;
    }

    public static MiniAppAnalyticsModule_Companion_ProvideMiniAppAnalyticsFactory create(a<PluginsManager> aVar, a<AnalyticsDataLayer> aVar2, a<Sg.a> aVar3) {
        return new MiniAppAnalyticsModule_Companion_ProvideMiniAppAnalyticsFactory(aVar, aVar2, aVar3);
    }

    public static MiniAppAnalytics provideMiniAppAnalytics(PluginsManager pluginsManager, AnalyticsDataLayer analyticsDataLayer, Sg.a aVar) {
        MiniAppAnalytics provideMiniAppAnalytics = MiniAppAnalyticsModule.INSTANCE.provideMiniAppAnalytics(pluginsManager, analyticsDataLayer, aVar);
        j.d(provideMiniAppAnalytics);
        return provideMiniAppAnalytics;
    }

    @Override // Pc.a
    public MiniAppAnalytics get() {
        return provideMiniAppAnalytics(this.pluginsManagerProvider.get(), this.dataLayerProvider.get(), this.analyticsScreenStorageProvider.get());
    }
}
