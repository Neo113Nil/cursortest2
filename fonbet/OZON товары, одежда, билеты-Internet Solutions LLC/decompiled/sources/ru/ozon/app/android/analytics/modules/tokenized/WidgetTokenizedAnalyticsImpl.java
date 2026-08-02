package ru.ozon.app.android.analytics.modules.tokenized;

import Sg.a;
import W10.c;
import WZ.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.modules.BaseAnalyticsModule;
import ru.ozon.app.android.analytics.plugins.PluginsManager;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\b\u0001\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/analytics/modules/tokenized/WidgetTokenizedAnalyticsImpl;", "Lru/ozon/app/android/analytics/modules/BaseAnalyticsModule;", "Lru/ozon/app/android/analytics/modules/tokenized/WidgetTokenizedAnalytics;", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "analyticsDataLayer", "Lru/ozon/app/android/analytics/plugins/PluginsManager;", "pluginsManager", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "analyticsScreenStorage", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;Lru/ozon/app/android/analytics/plugins/PluginsManager;LSg/a;LWZ/l;)V", "LW10/c;", "trackingData", "", "click", "(LW10/c;)V", "LWZ/l;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class WidgetTokenizedAnalyticsImpl extends BaseAnalyticsModule implements WidgetTokenizedAnalytics {

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetTokenizedAnalyticsImpl(@NotNull AnalyticsDataLayer analyticsDataLayer, @NotNull PluginsManager pluginsManager, @NotNull a analyticsScreenStorage, @NotNull l tokenizedAnalytics) {
        super(analyticsDataLayer, pluginsManager, analyticsScreenStorage);
        Intrinsics.checkNotNullParameter(analyticsDataLayer, "analyticsDataLayer");
        Intrinsics.checkNotNullParameter(pluginsManager, "pluginsManager");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    @Override // ru.ozon.app.android.analytics.modules.tokenized.WidgetTokenizedAnalytics
    public void click(@NotNull c trackingData) {
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        WidgetTokenizedAnalyticsKt.processWidgetClick(this.tokenizedAnalytics, trackingData);
    }
}
