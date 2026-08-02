package ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import ru.ozon.app.android.travel.calendar.utils.TravelAdapterDelegate;
import ru.ozon.app.android.travel.feature.general.main.R$layout;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.vo.CalendarItemVO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/adapter/CalendarMonthWeekAdapterDelegate;", "Lru/ozon/app/android/travel/calendar/utils/TravelAdapterDelegate;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarItemVO;", "Lkotlin/Function1;", "Lorg/joda/time/LocalDate;", "", "onDateClickListener", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "item", "", "isForViewType", "(Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarItemVO;)Z", "", "provideLayoutRes", "()I", "Landroid/view/View;", "view", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/adapter/TravelCalendarMonthWeekViewHolder;", "createViewHolder", "(Landroid/view/View;)Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/adapter/TravelCalendarMonthWeekViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "viewHolder", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarItemVO;Landroidx/recyclerview/widget/RecyclerView$C;)V", "Lkotlin/jvm/functions/Function1;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalendarMonthWeekAdapterDelegate implements TravelAdapterDelegate<CalendarItemVO> {

    @NotNull
    private final Function1<LocalDate, Unit> onDateClickListener;

    /* JADX WARN: Multi-variable type inference failed */
    public CalendarMonthWeekAdapterDelegate(@NotNull Function1<? super LocalDate, Unit> onDateClickListener) {
        Intrinsics.checkNotNullParameter(onDateClickListener, "onDateClickListener");
        this.onDateClickListener = onDateClickListener;
    }

    @Override // ru.ozon.app.android.travel.calendar.utils.TravelAdapterDelegate
    public void onAttach(@NotNull RecyclerView.C c11) {
        TravelAdapterDelegate.DefaultImpls.onAttach(this, c11);
    }

    @Override // ru.ozon.app.android.travel.calendar.utils.TravelAdapterDelegate
    @NotNull
    public RecyclerView.C onCreateViewHolder(@NotNull ViewGroup viewGroup) {
        return TravelAdapterDelegate.DefaultImpls.onCreateViewHolder(this, viewGroup);
    }

    @Override // ru.ozon.app.android.travel.calendar.utils.TravelAdapterDelegate
    public void onDetach(@NotNull RecyclerView.C c11) {
        TravelAdapterDelegate.DefaultImpls.onDetach(this, c11);
    }

    @Override // ru.ozon.app.android.travel.calendar.utils.TravelAdapterDelegate
    public int provideLayoutRes() {
        return R$layout.item_calendar_month_week_v1;
    }

    @Override // ru.ozon.app.android.travel.calendar.utils.TravelAdapterDelegate
    @NotNull
    public View provideView(@NotNull ViewGroup viewGroup) {
        return TravelAdapterDelegate.DefaultImpls.provideView(this, viewGroup);
    }

    @Override // ru.ozon.app.android.travel.calendar.utils.TravelAdapterDelegate
    @NotNull
    public TravelCalendarMonthWeekViewHolder createViewHolder(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return new TravelCalendarMonthWeekViewHolder(view, this.onDateClickListener);
    }

    @Override // ru.ozon.app.android.travel.calendar.utils.TravelAdapterDelegate
    public boolean isForViewType(@NotNull CalendarItemVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item instanceof CalendarItemVO.CalendarMonthWeekVO;
    }

    @Override // ru.ozon.app.android.travel.calendar.utils.TravelAdapterDelegate
    public void onBindViewHolder(@NotNull CalendarItemVO item, @NotNull RecyclerView.C viewHolder) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        ((TravelCalendarMonthWeekViewHolder) viewHolder).bind((CalendarItemVO.CalendarMonthWeekVO) item);
    }
}
