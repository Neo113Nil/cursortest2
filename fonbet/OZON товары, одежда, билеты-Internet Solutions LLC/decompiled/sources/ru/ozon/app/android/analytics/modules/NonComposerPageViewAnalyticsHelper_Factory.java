package ru.ozon.app.android.analytics.modules;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.plugins.PluginsManager;

/* loaded from: classes11.dex */
public final class NonComposerPageViewAnalyticsHelper_Factory implements e<NonComposerPageViewAnalyticsHelper> {
    private final a<Sg.a> analyticsScreenStorageProvider;
    private final a<Sg.a> applicationAnalyticsScreenStorageProvider;
    private final a<AnalyticsDataLayer> dataLayerProvider;
    private final a<PluginsManager> pluginsManagerProvider;

    public NonComposerPageViewAnalyticsHelper_Factory(a<AnalyticsDataLayer> aVar, a<PluginsManager> aVar2, a<Sg.a> aVar3, a<Sg.a> aVar4) {
        this.dataLayerProvider = aVar;
        this.pluginsManagerProvider = aVar2;
        this.analyticsScreenStorageProvider = aVar3;
        this.applicationAnalyticsScreenStorageProvider = aVar4;
    }

    public static NonComposerPageViewAnalyticsHelper_Factory create(a<AnalyticsDataLayer> aVar, a<PluginsManager> aVar2, a<Sg.a> aVar3, a<Sg.a> aVar4) {
        return new NonComposerPageViewAnalyticsHelper_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static NonComposerPageViewAnalyticsHelper newInstance(AnalyticsDataLayer analyticsDataLayer, PluginsManager pluginsManager, Sg.a aVar, Sg.a aVar2) {
        return new NonComposerPageViewAnalyticsHelper(analyticsDataLayer, pluginsManager, aVar, aVar2);
    }

    @Override // Pc.a
    public NonComposerPageViewAnalyticsHelper get() {
        return newInstance(this.dataLayerProvider.get(), this.pluginsManagerProvider.get(), this.analyticsScreenStorageProvider.get(), this.applicationAnalyticsScreenStorageProvider.get());
    }
}
