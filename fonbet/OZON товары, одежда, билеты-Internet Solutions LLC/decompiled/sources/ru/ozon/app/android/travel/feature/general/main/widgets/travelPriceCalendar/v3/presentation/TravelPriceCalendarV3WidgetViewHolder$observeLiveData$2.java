package ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.calendar.viewModel.CalendarViewModel;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.presentation.analytics.TravelPriceCalendarV3AnalyticsViewModel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/travel/calendar/viewModel/CalendarViewModel$Event;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/calendar/viewModel/CalendarViewModel$Event;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelPriceCalendarV3WidgetViewHolder$observeLiveData$2 extends AbstractC7737t implements Function1<CalendarViewModel.Event, Unit> {
    final /* synthetic */ TravelPriceCalendarV3WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelPriceCalendarV3WidgetViewHolder$observeLiveData$2(TravelPriceCalendarV3WidgetViewHolder travelPriceCalendarV3WidgetViewHolder) {
        super(1);
        this.this$0 = travelPriceCalendarV3WidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CalendarViewModel.Event event) {
        invoke2(event);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CalendarViewModel.Event event) {
        TravelPriceCalendarV3AnalyticsViewModel travelPriceCalendarV3AnalyticsViewModel;
        TravelPriceCalendarV3VO boundData = this.this$0.getBoundData();
        if (boundData != null) {
            long id2 = boundData.getId();
            travelPriceCalendarV3AnalyticsViewModel = this.this$0.analyticsViewModel;
            travelPriceCalendarV3AnalyticsViewModel.trackClick(TrackingInfoMapperKt.toTokenizedEvent$default(event.getTrackingInfo(), Long.valueOf(id2), null, 2, null), event.getFormattedDate(), event.getDateConfig());
        }
    }
}
