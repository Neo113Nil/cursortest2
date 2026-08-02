package ru.ozon.app.android.analytics.modules;

import Sg.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.Event;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.plugins.PluginsManager;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0010B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/analytics/modules/MiniAppAnalyticsImpl;", "Lru/ozon/app/android/analytics/modules/BaseAnalyticsModule;", "Lru/ozon/app/android/analytics/modules/MiniAppAnalytics;", "Lru/ozon/app/android/analytics/plugins/PluginsManager;", "pluginsManager", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "dataLayer", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "analyticsScreenStorage", "<init>", "(Lru/ozon/app/android/analytics/plugins/PluginsManager;Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;LSg/a;)V", "", "trackCloseAppEvent", "()V", "trackCampaignEvent", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MiniAppAnalyticsImpl extends BaseAnalyticsModule implements MiniAppAnalytics {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppAnalyticsImpl(@NotNull PluginsManager pluginsManager, @NotNull AnalyticsDataLayer dataLayer, @NotNull a analyticsScreenStorage) {
        super(dataLayer, pluginsManager, analyticsScreenStorage);
        Intrinsics.checkNotNullParameter(pluginsManager, "pluginsManager");
        Intrinsics.checkNotNullParameter(dataLayer, "dataLayer");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
    }

    @Override // ru.ozon.app.android.analytics.modules.MiniAppAnalytics
    public void trackCampaignEvent() {
        BaseAnalyticsModule.sendEventAsync$default(this, Event.TRACKER_V2_EVENT, null, MiniAppAnalyticsImpl$trackCampaignEvent$1.INSTANCE, 2, null);
    }

    @Override // ru.ozon.app.android.analytics.modules.MiniAppAnalytics
    public void trackCloseAppEvent() {
        BaseAnalyticsModule.sendEventAsync$default(this, Event.TRACKER_V2_EVENT, null, MiniAppAnalyticsImpl$trackCloseAppEvent$1.INSTANCE, 2, null);
    }
}
