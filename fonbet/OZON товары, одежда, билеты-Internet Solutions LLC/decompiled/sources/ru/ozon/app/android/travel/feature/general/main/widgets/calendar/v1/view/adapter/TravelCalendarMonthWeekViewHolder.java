package ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.adapter;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import ru.ozon.app.android.travel.feature.general.main.databinding.ItemCalendarMonthWeekV1Binding;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.vo.CalendarItemVO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/adapter/TravelCalendarMonthWeekViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "itemView", "Lkotlin/Function1;", "Lorg/joda/time/LocalDate;", "", "onDateClickListener", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarItemVO$CalendarMonthWeekVO;", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarItemVO$CalendarMonthWeekVO;)V", "Lru/ozon/app/android/travel/feature/general/main/databinding/ItemCalendarMonthWeekV1Binding;", "binding", "Lru/ozon/app/android/travel/feature/general/main/databinding/ItemCalendarMonthWeekV1Binding;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelCalendarMonthWeekViewHolder extends RecyclerView.C {

    @NotNull
    private final ItemCalendarMonthWeekV1Binding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelCalendarMonthWeekViewHolder(@NotNull View itemView, @NotNull Function1<? super LocalDate, Unit> onDateClickListener) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(onDateClickListener, "onDateClickListener");
        ItemCalendarMonthWeekV1Binding bind = ItemCalendarMonthWeekV1Binding.bind(itemView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        bind.calendarWeekLayout.setOnDateClickListener(onDateClickListener);
    }

    public final void bind(@NotNull CalendarItemVO.CalendarMonthWeekVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.binding.calendarWeekLayout.showDays(item.getDays());
    }
}
