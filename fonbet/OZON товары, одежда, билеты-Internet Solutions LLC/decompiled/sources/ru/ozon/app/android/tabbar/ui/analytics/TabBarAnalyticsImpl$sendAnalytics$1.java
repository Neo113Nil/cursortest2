package ru.ozon.app.android.tabbar.ui.analytics;

import Sg.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.modules.EventsContainer;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/analytics/modules/EventsContainer;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TabBarAnalyticsImpl$sendAnalytics$1 extends AbstractC7737t implements Function0<EventsContainer> {
    final /* synthetic */ AnalyticsDataLayer.OzonTrackerEvent $ozonTrackerEvent;
    final /* synthetic */ TabBarAnalyticsImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TabBarAnalyticsImpl$sendAnalytics$1(TabBarAnalyticsImpl tabBarAnalyticsImpl, AnalyticsDataLayer.OzonTrackerEvent ozonTrackerEvent) {
        super(0);
        this.this$0 = tabBarAnalyticsImpl;
        this.$ozonTrackerEvent = ozonTrackerEvent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final EventsContainer invoke() {
        a analyticsScreenStorage;
        analyticsScreenStorage = this.this$0.getAnalyticsScreenStorage();
        return new EventsContainer(analyticsScreenStorage.a(), this.$ozonTrackerEvent, null, 4, null);
    }
}
