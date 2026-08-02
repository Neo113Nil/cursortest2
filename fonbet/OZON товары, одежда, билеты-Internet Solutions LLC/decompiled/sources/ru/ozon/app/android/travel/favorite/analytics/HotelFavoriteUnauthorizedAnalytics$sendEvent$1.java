package ru.ozon.app.android.travel.favorite.analytics;

import Sg.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.modules.EventsContainer;
import ru.ozon.tracker.model.EventEntity;
import ru.ozon.tracker.sendEvent.ActionType;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/analytics/modules/EventsContainer;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class HotelFavoriteUnauthorizedAnalytics$sendEvent$1 extends AbstractC7737t implements Function0<EventsContainer> {
    final /* synthetic */ ActionType $actionType;
    final /* synthetic */ HotelFavoriteUnauthorizedAnalytics this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelFavoriteUnauthorizedAnalytics$sendEvent$1(HotelFavoriteUnauthorizedAnalytics hotelFavoriteUnauthorizedAnalytics, ActionType actionType) {
        super(0);
        this.this$0 = hotelFavoriteUnauthorizedAnalytics;
        this.$actionType = actionType;
    }

    @Override // kotlin.jvm.functions.Function0
    public final EventsContainer invoke() {
        a analyticsScreenStorage;
        analyticsScreenStorage = this.this$0.getAnalyticsScreenStorage();
        return new EventsContainer(analyticsScreenStorage.a(), new AnalyticsDataLayer.OzonTrackerEvent(this.$actionType, new EventEntity.Obj("ui", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147483646, null), new EventEntity.Properties(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "travel_hotel_favorites_auth", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -262145, 16383, null), null, null, 24, null), null, 4, null);
    }
}
