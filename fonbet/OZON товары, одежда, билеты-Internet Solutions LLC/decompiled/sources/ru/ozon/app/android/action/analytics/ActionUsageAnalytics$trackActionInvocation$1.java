package ru.ozon.app.android.action.analytics;

import Sg.a;
import T00.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l20.b;
import l20.d;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.modules.EventsContainer;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.tracker.model.EventEntity;
import ru.ozon.tracker.sendEvent.ActionType;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/analytics/modules/EventsContainer;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ActionUsageAnalytics$trackActionInvocation$1 extends AbstractC7737t implements Function0<EventsContainer> {
    final /* synthetic */ ActionUsageAnalyticsData $usageAnalyticsData;
    final /* synthetic */ l $widgetViewItem;
    final /* synthetic */ ActionUsageAnalytics this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActionUsageAnalytics$trackActionInvocation$1(ActionUsageAnalytics actionUsageAnalytics, l lVar, ActionUsageAnalyticsData actionUsageAnalyticsData) {
        super(0);
        this.this$0 = actionUsageAnalytics;
        this.$widgetViewItem = lVar;
        this.$usageAnalyticsData = actionUsageAnalyticsData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final EventsContainer invoke() {
        a analyticsScreenStorage;
        b i11;
        d b11;
        m c11;
        analyticsScreenStorage = this.this$0.getAnalyticsScreenStorage();
        Rg.a a11 = analyticsScreenStorage.a();
        ActionType.Custom custom = new ActionType.Custom("atom_action_resolve");
        EventEntity.Obj obj = new EventEntity.Obj("mobile_platform", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147483646, null);
        l lVar = this.$widgetViewItem;
        return new EventsContainer(a11, new AnalyticsDataLayer.OzonTrackerEvent(custom, obj, new EventEntity.Properties(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.$usageAnalyticsData.getActionId(), this.$usageAnalyticsData.getActionBehavior(), null, null, null, -1, -1, 14847, null), (lVar == null || (i11 = lVar.i()) == null || (b11 = i11.b()) == null || (c11 = b11.c()) == null) ? null : new EventEntity.Widget(null, null, c11.g(), c11.b(), Long.valueOf(c11.f()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048547, null), null, 16, null), null, 4, null);
    }
}
