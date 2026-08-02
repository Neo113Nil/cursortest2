package ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.presentation;

import androidx.lifecycle.V;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.vo.CalendarFullVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class CalendarViewModel$updateCalendar$4 extends C7735q implements Function1<CalendarFullVO, Unit> {
    CalendarViewModel$updateCalendar$4(Object obj) {
        super(1, obj, V.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CalendarFullVO calendarFullVO) {
        invoke2(calendarFullVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CalendarFullVO calendarFullVO) {
        ((V) this.receiver).setValue(calendarFullVO);
    }
}
