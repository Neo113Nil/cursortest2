package ru.ozon.app.android.travel.calendar.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lorg/joda/time/LocalDate;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CalendarView$calendarAdapter$1 extends AbstractC7737t implements Function1<LocalDate, Unit> {
    final /* synthetic */ CalendarView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CalendarView$calendarAdapter$1(CalendarView calendarView) {
        super(1);
        this.this$0 = calendarView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LocalDate localDate) {
        invoke2(localDate);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LocalDate it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Function1<LocalDate, Unit> onDateClickListener = this.this$0.getOnDateClickListener();
        if (onDateClickListener != null) {
            onDateClickListener.invoke(it);
        }
    }
}
