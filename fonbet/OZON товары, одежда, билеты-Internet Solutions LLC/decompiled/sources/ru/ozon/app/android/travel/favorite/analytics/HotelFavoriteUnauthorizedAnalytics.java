package ru.ozon.app.android.travel.favorite.analytics;

import Sg.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.Event;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.modules.BaseAnalyticsModule;
import ru.ozon.app.android.analytics.plugins.PluginsManager;
import ru.ozon.tracker.model.TrinityEventEntityKt;
import ru.ozon.tracker.sendEvent.ActionType;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/favorite/analytics/HotelFavoriteUnauthorizedAnalytics;", "Lru/ozon/app/android/analytics/modules/BaseAnalyticsModule;", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "dataLayer", "Lru/ozon/app/android/analytics/plugins/PluginsManager;", "pluginsManager", "LSg/a;", "analyticsScreenStorage", "<init>", "(Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;Lru/ozon/app/android/analytics/plugins/PluginsManager;LSg/a;)V", "Lru/ozon/tracker/sendEvent/ActionType;", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "", "sendEvent", "(Lru/ozon/tracker/sendEvent/ActionType;)V", "sendViewEvent$map_prodGoogleAllVendorsRelease", "()V", "sendViewEvent", "sendClickEvent$map_prodGoogleAllVendorsRelease", "sendClickEvent", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HotelFavoriteUnauthorizedAnalytics extends BaseAnalyticsModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelFavoriteUnauthorizedAnalytics(@NotNull AnalyticsDataLayer dataLayer, @NotNull PluginsManager pluginsManager, @NotNull a analyticsScreenStorage) {
        super(dataLayer, pluginsManager, analyticsScreenStorage);
        Intrinsics.checkNotNullParameter(dataLayer, "dataLayer");
        Intrinsics.checkNotNullParameter(pluginsManager, "pluginsManager");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
    }

    private final void sendEvent(ActionType actionType) {
        BaseAnalyticsModule.sendEventAsync$default(this, Event.TRACKER_V2_EVENT, new HotelFavoriteUnauthorizedAnalytics$sendEvent$1(this, actionType), null, null, 12, null);
    }

    public final void sendClickEvent$map_prodGoogleAllVendorsRelease() {
        sendEvent(ActionType.CLICK.INSTANCE);
    }

    public final void sendViewEvent$map_prodGoogleAllVendorsRelease() {
        sendEvent(ActionType.VIEW.INSTANCE);
    }
}
