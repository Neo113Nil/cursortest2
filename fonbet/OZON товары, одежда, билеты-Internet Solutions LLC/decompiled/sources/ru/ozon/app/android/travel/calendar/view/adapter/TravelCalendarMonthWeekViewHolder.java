package ru.ozon.app.android.travel.calendar.view.adapter;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.calendar.view.CalendarWeekLayout;
import ru.ozon.app.android.travel.calendar.view.vo.CalendarRowItemVO;
import ru.ozon.app.android.travel.calendar.view.vo.Indicator;
import ru.ozon.app.android.travel.calendar.view.vo.IndicatorColor;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/calendar/view/adapter/TravelCalendarMonthWeekViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Lru/ozon/app/android/travel/calendar/view/vo/CalendarRowItemVO$CalendarMonthWeekVO;", "item", "", "Lru/ozon/app/android/travel/calendar/view/vo/Indicator$ColorIndicator;", "Lru/ozon/app/android/travel/calendar/view/vo/IndicatorColor;", "indicatorColors", "", "bind", "(Lru/ozon/app/android/travel/calendar/view/vo/CalendarRowItemVO$CalendarMonthWeekVO;Ljava/util/Map;)V", "Lru/ozon/app/android/travel/calendar/view/CalendarWeekLayout;", "weekLayout", "Lru/ozon/app/android/travel/calendar/view/CalendarWeekLayout;", "calendar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelCalendarMonthWeekViewHolder extends RecyclerView.C {
    private final CalendarWeekLayout weekLayout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelCalendarMonthWeekViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View view2 = this.itemView;
        this.weekLayout = view2 instanceof CalendarWeekLayout ? (CalendarWeekLayout) view2 : null;
    }

    public final void bind(@NotNull CalendarRowItemVO.CalendarMonthWeekVO item, @NotNull Map<Indicator.ColorIndicator, IndicatorColor> indicatorColors) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(indicatorColors, "indicatorColors");
        CalendarWeekLayout calendarWeekLayout = this.weekLayout;
        if (calendarWeekLayout != null) {
            calendarWeekLayout.showDays(item.getDays(), indicatorColors);
        }
    }
}
