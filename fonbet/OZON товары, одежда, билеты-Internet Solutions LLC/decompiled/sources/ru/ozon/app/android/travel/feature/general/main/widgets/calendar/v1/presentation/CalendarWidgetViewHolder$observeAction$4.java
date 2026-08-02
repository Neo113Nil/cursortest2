package ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.analytics.CalendarAnalytics;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class CalendarWidgetViewHolder$observeAction$4 extends AbstractC7737t implements Function1<Unit, Unit> {
    final /* synthetic */ CalendarWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CalendarWidgetViewHolder$observeAction$4(CalendarWidgetViewHolder calendarWidgetViewHolder) {
        super(1);
        this.this$0 = calendarWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
        invoke2(unit);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Unit unit) {
        CalendarAnalytics calendarAnalytics;
        calendarAnalytics = this.this$0.calendarAnalytics;
        calendarAnalytics.railwayRoundTripClick();
    }
}
