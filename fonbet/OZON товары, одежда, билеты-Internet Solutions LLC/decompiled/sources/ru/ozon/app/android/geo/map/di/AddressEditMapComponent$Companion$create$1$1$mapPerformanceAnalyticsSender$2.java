package ru.ozon.app.android.geo.map.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import qj.C9067a;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.eventstorage.ViewEventStorage;
import ru.ozon.app.android.analytics.eventstorage.di.EventStorageComponentApi;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.geo.map.performance.MapPerformanceAnalyticsSender;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/geo/map/performance/MapPerformanceAnalyticsSender;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddressEditMapComponent$Companion$create$1$1$mapPerformanceAnalyticsSender$2 extends AbstractC7737t implements Function0<MapPerformanceAnalyticsSender> {
    final /* synthetic */ AddressEditMapComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressEditMapComponent$Companion$create$1$1$mapPerformanceAnalyticsSender$2(AddressEditMapComponent$Companion$create$1$1 addressEditMapComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = addressEditMapComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final MapPerformanceAnalyticsSender invoke() {
        AnalyticsComponentApi analyticsComponentApi;
        NetworkComponentApi networkComponentApi;
        EventStorageComponentApi eventStorageComponentApi;
        AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;
        analyticsComponentApi = this.this$0.analyticsComponentApi;
        PerformanceTrackerDelegate performanceTrackerDelegate = analyticsComponentApi.getPerformanceTrackerDelegate();
        networkComponentApi = this.this$0.networkComponentApi;
        C9067a networkInfoProvider = networkComponentApi.getNetworkInfoProvider();
        eventStorageComponentApi = this.this$0.eventStorageComponentApi;
        ViewEventStorage viewEventStorage = eventStorageComponentApi.getViewEventStorage();
        FeatureChecker featureChecker = this.this$0.getFeatureChecker();
        analyticsScreenStorageComponentApi = this.this$0.analyticsScreenStorageComponentApi;
        return new MapPerformanceAnalyticsSender(performanceTrackerDelegate, networkInfoProvider, viewEventStorage, featureChecker, analyticsScreenStorageComponentApi.getAnalyticsScreenStorage());
    }
}
