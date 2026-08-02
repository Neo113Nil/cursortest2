package ru.ozon.app.android.travel.calendar.view;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CalendarView$showCalendarItems$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Integer $scrollPosition;
    final /* synthetic */ CalendarView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CalendarView$showCalendarItems$1(Integer num, CalendarView calendarView) {
        super(0);
        this.$scrollPosition = num;
        this.this$0 = calendarView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CalendarView calendarView, Integer num) {
        LinearLayoutManager linearLayoutManager;
        linearLayoutManager = calendarView.layoutManager;
        linearLayoutManager.scrollToPositionWithOffset(num.intValue(), 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        FakeScrollRecyclerView fakeScrollRecyclerView;
        if (this.$scrollPosition != null) {
            fakeScrollRecyclerView = this.this$0.daysRv;
            final CalendarView calendarView = this.this$0;
            final Integer num = this.$scrollPosition;
            fakeScrollRecyclerView.post(new Runnable() { // from class: ru.ozon.app.android.travel.calendar.view.a
                @Override // java.lang.Runnable
                public final void run() {
                    CalendarView$showCalendarItems$1.invoke$lambda$0(CalendarView.this, num);
                }
            });
        }
    }
}
