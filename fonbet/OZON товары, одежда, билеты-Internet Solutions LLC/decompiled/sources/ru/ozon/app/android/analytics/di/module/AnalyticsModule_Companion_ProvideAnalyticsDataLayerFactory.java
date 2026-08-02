package ru.ozon.app.android.analytics.di.module;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;

/* loaded from: classes6.dex */
public final class AnalyticsModule_Companion_ProvideAnalyticsDataLayerFactory implements e<AnalyticsDataLayer> {
    public static AnalyticsDataLayer provideAnalyticsDataLayer() {
        AnalyticsDataLayer provideAnalyticsDataLayer = AnalyticsModule.INSTANCE.provideAnalyticsDataLayer();
        j.d(provideAnalyticsDataLayer);
        return provideAnalyticsDataLayer;
    }
}
