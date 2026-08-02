package ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;
import org.joda.time.format.b;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.vo.CalendarFullVO;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.vo.TripMode;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class CalendarViewModel$prepareRequestParams$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Map<String, String> $params;
    final /* synthetic */ CalendarFullVO $vo;
    final /* synthetic */ CalendarViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CalendarViewModel$prepareRequestParams$2(Map<String, String> map, CalendarViewModel calendarViewModel, CalendarFullVO calendarFullVO) {
        super(0);
        this.$params = map;
        this.this$0 = calendarViewModel;
        this.$vo = calendarFullVO;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        b bVar;
        String calendarViewModel;
        b bVar2;
        String calendarViewModel2;
        Map<String, String> map = this.$params;
        CalendarViewModel calendarViewModel3 = this.this$0;
        LocalDate selectedDepartureDate = this.$vo.getSelectedDepartureDate();
        bVar = this.this$0.dateFormatter;
        Intrinsics.checkNotNullExpressionValue(bVar, "access$getDateFormatter$p(...)");
        calendarViewModel = calendarViewModel3.toString(selectedDepartureDate, bVar);
        map.put("travelSearchFlightDate", calendarViewModel);
        if (this.$vo.getTripMode() == TripMode.ROUND_TRIP) {
            Map<String, String> map2 = this.$params;
            CalendarViewModel calendarViewModel4 = this.this$0;
            LocalDate selectedReturnDate = this.$vo.getSelectedReturnDate();
            bVar2 = this.this$0.dateFormatter;
            Intrinsics.checkNotNullExpressionValue(bVar2, "access$getDateFormatter$p(...)");
            calendarViewModel2 = calendarViewModel4.toString(selectedReturnDate, bVar2);
            map2.put("travelSearchReturnFlightDate", calendarViewModel2);
        }
    }
}
