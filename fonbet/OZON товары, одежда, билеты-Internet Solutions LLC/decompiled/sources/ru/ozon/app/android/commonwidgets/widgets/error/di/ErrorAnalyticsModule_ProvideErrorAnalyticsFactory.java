package ru.ozon.app.android.commonwidgets.widgets.error.di;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.plugins.PluginsManager;
import ru.ozon.app.android.commonwidgets.widgets.error.ErrorAnalytics;

/* loaded from: classes11.dex */
public final class ErrorAnalyticsModule_ProvideErrorAnalyticsFactory implements e<ErrorAnalytics> {
    private final a<Sg.a> analyticsScreenStorageProvider;
    private final a<AnalyticsDataLayer> dataLayerProvider;
    private final a<PluginsManager> pluginsManagerProvider;

    public ErrorAnalyticsModule_ProvideErrorAnalyticsFactory(a<AnalyticsDataLayer> aVar, a<PluginsManager> aVar2, a<Sg.a> aVar3) {
        this.dataLayerProvider = aVar;
        this.pluginsManagerProvider = aVar2;
        this.analyticsScreenStorageProvider = aVar3;
    }

    public static ErrorAnalyticsModule_ProvideErrorAnalyticsFactory create(a<AnalyticsDataLayer> aVar, a<PluginsManager> aVar2, a<Sg.a> aVar3) {
        return new ErrorAnalyticsModule_ProvideErrorAnalyticsFactory(aVar, aVar2, aVar3);
    }

    public static ErrorAnalytics provideErrorAnalytics(AnalyticsDataLayer analyticsDataLayer, PluginsManager pluginsManager, Sg.a aVar) {
        ErrorAnalytics provideErrorAnalytics = ErrorAnalyticsModule.INSTANCE.provideErrorAnalytics(analyticsDataLayer, pluginsManager, aVar);
        j.d(provideErrorAnalytics);
        return provideErrorAnalytics;
    }

    @Override // Pc.a
    public ErrorAnalytics get() {
        return provideErrorAnalytics(this.dataLayerProvider.get(), this.pluginsManagerProvider.get(), this.analyticsScreenStorageProvider.get());
    }
}
