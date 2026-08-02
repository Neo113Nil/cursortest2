package ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.general.main.databinding.ViewCalendarBinding;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
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
    public static final void invoke$lambda$2$lambda$1$lambda$0(RecyclerView recyclerView, Integer num) {
        recyclerView.scrollToPosition(num.intValue());
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ViewCalendarBinding viewCalendarBinding;
        final Integer num = this.$scrollPosition;
        if (num != null) {
            viewCalendarBinding = this.this$0.binding;
            final RecyclerView recyclerView = viewCalendarBinding.calendarDaysRv;
            recyclerView.postDelayed(new Runnable() { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.a
                @Override // java.lang.Runnable
                public final void run() {
                    CalendarView$showCalendarItems$1.invoke$lambda$2$lambda$1$lambda$0(RecyclerView.this, num);
                }
            }, 300L);
        }
    }
}
