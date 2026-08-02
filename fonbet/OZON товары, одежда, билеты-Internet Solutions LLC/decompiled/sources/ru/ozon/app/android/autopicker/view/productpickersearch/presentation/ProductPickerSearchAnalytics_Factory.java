package ru.ozon.app.android.autopicker.view.productpickersearch.presentation;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.modules.NonComposerPageViewAnalyticsHelper;
import ru.ozon.app.android.analytics.plugins.PluginsManager;

/* loaded from: classes11.dex */
public final class ProductPickerSearchAnalytics_Factory implements e<ProductPickerSearchAnalytics> {
    private final a<Sg.a> analyticsScreenStorageProvider;
    private final a<AnalyticsDataLayer> dataLayerProvider;
    private final a<NonComposerPageViewAnalyticsHelper> helperProvider;
    private final a<PluginsManager> pluginsManagerProvider;

    public ProductPickerSearchAnalytics_Factory(a<AnalyticsDataLayer> aVar, a<PluginsManager> aVar2, a<Sg.a> aVar3, a<NonComposerPageViewAnalyticsHelper> aVar4) {
        this.dataLayerProvider = aVar;
        this.pluginsManagerProvider = aVar2;
        this.analyticsScreenStorageProvider = aVar3;
        this.helperProvider = aVar4;
    }

    public static ProductPickerSearchAnalytics_Factory create(a<AnalyticsDataLayer> aVar, a<PluginsManager> aVar2, a<Sg.a> aVar3, a<NonComposerPageViewAnalyticsHelper> aVar4) {
        return new ProductPickerSearchAnalytics_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static ProductPickerSearchAnalytics newInstance(AnalyticsDataLayer analyticsDataLayer, PluginsManager pluginsManager, Sg.a aVar, NonComposerPageViewAnalyticsHelper nonComposerPageViewAnalyticsHelper) {
        return new ProductPickerSearchAnalytics(analyticsDataLayer, pluginsManager, aVar, nonComposerPageViewAnalyticsHelper);
    }

    @Override // Pc.a
    public ProductPickerSearchAnalytics get() {
        return newInstance(this.dataLayerProvider.get(), this.pluginsManagerProvider.get(), this.analyticsScreenStorageProvider.get(), this.helperProvider.get());
    }
}
