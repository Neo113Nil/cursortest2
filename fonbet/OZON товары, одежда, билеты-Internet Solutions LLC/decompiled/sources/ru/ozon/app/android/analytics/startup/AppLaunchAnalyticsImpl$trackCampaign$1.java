package ru.ozon.app.android.analytics.startup;

import Rg.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.modules.EventsContainer;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/analytics/modules/EventsContainer;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AppLaunchAnalyticsImpl$trackCampaign$1 extends AbstractC7737t implements Function0<EventsContainer> {
    final /* synthetic */ AnalyticsDataLayer.OzonTrackerEvent $ozonTrackerEvent;
    final /* synthetic */ a $screen;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppLaunchAnalyticsImpl$trackCampaign$1(a aVar, AnalyticsDataLayer.OzonTrackerEvent ozonTrackerEvent) {
        super(0);
        this.$screen = aVar;
        this.$ozonTrackerEvent = ozonTrackerEvent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final EventsContainer invoke() {
        return new EventsContainer(this.$screen, this.$ozonTrackerEvent, null, 4, null);
    }
}
