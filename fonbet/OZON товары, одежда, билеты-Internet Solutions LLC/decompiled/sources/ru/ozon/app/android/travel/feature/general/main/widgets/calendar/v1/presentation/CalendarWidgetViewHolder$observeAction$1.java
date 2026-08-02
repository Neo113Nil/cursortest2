package ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.main.databinding.WidgetCalendarBinding;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarView;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.vo.CalendarFullVO;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarFullVO;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarFullVO;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class CalendarWidgetViewHolder$observeAction$1 extends AbstractC7737t implements Function1<CalendarFullVO, Unit> {
    final /* synthetic */ CalendarWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CalendarWidgetViewHolder$observeAction$1(CalendarWidgetViewHolder calendarWidgetViewHolder) {
        super(1);
        this.this$0 = calendarWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CalendarFullVO calendarFullVO) {
        invoke2(calendarFullVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CalendarFullVO calendarFullVO) {
        WidgetCalendarBinding widgetCalendarBinding;
        widgetCalendarBinding = this.this$0.binding;
        CalendarView calendarView = widgetCalendarBinding.calendarView;
        Intrinsics.f(calendarFullVO);
        calendarView.show(calendarFullVO);
    }
}
