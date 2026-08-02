package ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.adapter;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.databinding.ItemCalendarMonthTitleV1Binding;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.vo.CalendarItemVO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/adapter/TravelCalendarMonthTitleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarItemVO$CalendarMonthTitleVO;", "item", "", "bind", "(Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarItemVO$CalendarMonthTitleVO;)V", "Lru/ozon/app/android/travel/feature/general/main/databinding/ItemCalendarMonthTitleV1Binding;", "binding", "Lru/ozon/app/android/travel/feature/general/main/databinding/ItemCalendarMonthTitleV1Binding;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelCalendarMonthTitleViewHolder extends RecyclerView.C {

    @NotNull
    private final ItemCalendarMonthTitleV1Binding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelCalendarMonthTitleViewHolder(@NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        ItemCalendarMonthTitleV1Binding bind = ItemCalendarMonthTitleV1Binding.bind(itemView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    public final void bind(@NotNull CalendarItemVO.CalendarMonthTitleVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.binding.monthTitleTv.setText(item.getTitle());
    }
}
