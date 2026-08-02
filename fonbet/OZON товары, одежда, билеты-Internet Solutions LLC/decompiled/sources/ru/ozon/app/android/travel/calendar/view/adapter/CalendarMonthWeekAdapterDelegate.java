package ru.ozon.app.android.travel.calendar.view.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import ru.ozon.app.android.travel.calendar.utils.TravelAdapterDelegate;
import ru.ozon.app.android.travel.calendar.view.CalendarWeekLayout;
import ru.ozon.app.android.travel.calendar.view.vo.CalendarRowItemVO;
import ru.ozon.app.android.travel.calendar.view.vo.Indicator;
import ru.ozon.app.android.travel.calendar.view.vo.IndicatorColor;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b$\u0010#R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R&\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/calendar/view/adapter/CalendarMonthWeekAdapterDelegate;", "Lru/ozon/app/android/travel/calendar/utils/TravelAdapterDelegate;", "Lru/ozon/app/android/travel/calendar/view/vo/CalendarRowItemVO;", "Lkotlin/Function1;", "Lorg/joda/time/LocalDate;", "", "onDateClickListener", "Lkotlin/Function0;", "", "Lru/ozon/app/android/travel/calendar/view/vo/Indicator$ColorIndicator;", "Lru/ozon/app/android/travel/calendar/view/vo/IndicatorColor;", "indicatorColorsProvider", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "item", "", "isForViewType", "(Lru/ozon/app/android/travel/calendar/view/vo/CalendarRowItemVO;)Z", "", "provideLayoutRes", "()I", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "provideView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "view", "Lru/ozon/app/android/travel/calendar/view/adapter/TravelCalendarMonthWeekViewHolder;", "createViewHolder", "(Landroid/view/View;)Lru/ozon/app/android/travel/calendar/view/adapter/TravelCalendarMonthWeekViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "viewHolder", "onBindViewHolder", "(Lru/ozon/app/android/travel/calendar/view/vo/CalendarRowItemVO;Landroidx/recyclerview/widget/RecyclerView$C;)V", "onAttach", "(Landroidx/recyclerview/widget/RecyclerView$C;)V", "onDetach", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "calendar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CalendarMonthWeekAdapterDelegate implements TravelAdapterDelegate<CalendarRowItemVO> {

    @NotNull
    private final Function0<Map<Indicator.ColorIndicator, IndicatorColor>> indicatorColorsProvider;

    @NotNull
    private final Function1<LocalDate, Unit> onDateClickListener;

    /* JADX WARN: Multi-variable type inference failed */
    public CalendarMonthWeekAdapterDelegate(@NotNull Function1<? super LocalDate, Unit> onDateClickListener, @NotNull Function0<? extends Map<Indicator.ColorIndicator, IndicatorColor>> indicatorColorsProvider) {
        Intrinsics.checkNotNullParameter(onDateClickListener, "onDateClickListener");
        Intrinsics.checkNotNullParameter(indicatorColorsProvider, "indicatorColorsProvider");
        this.onDateClickListener = onDateClickListener;
        this.indicatorColorsProvider = indicatorColorsProvider;
    }

    @Override // ru.ozon.app.android.travel.calendar.utils.TravelAdapterDelegate
    public void onAttach(@NotNull RecyclerView.C viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        View view = viewHolder.itemView;
        Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.app.android.travel.calendar.view.CalendarWeekLayout");
        ((CalendarWeekLayout) view).setOnDateClickListener(this.onDateClickListener);
    }

    @Override // ru.ozon.app.android.travel.calendar.utils.TravelAdapterDelegate
    @NotNull
    public RecyclerView.C onCreateViewHolder(@NotNull ViewGroup viewGroup) {
        return TravelAdapterDelegate.DefaultImpls.onCreateViewHolder(this, viewGroup);
    }

    @Override // ru.ozon.app.android.travel.calendar.utils.TravelAdapterDelegate
    public void onDetach(@NotNull RecyclerView.C viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        View view = viewHolder.itemView;
        Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.app.android.travel.calendar.view.CalendarWeekLayout");
        ((CalendarWeekLayout) view).setOnDateClickListener(null);
    }

    @Override // ru.ozon.app.android.travel.calendar.utils.TravelAdapterDelegate
    public int provideLayoutRes() {
        return 0;
    }

    @Override // ru.ozon.app.android.travel.calendar.utils.TravelAdapterDelegate
    @NotNull
    public View provideView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CalendarWeekLayout calendarWeekLayout = new CalendarWeekLayout(context);
        calendarWeekLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return calendarWeekLayout;
    }

    @Override // ru.ozon.app.android.travel.calendar.utils.TravelAdapterDelegate
    @NotNull
    public TravelCalendarMonthWeekViewHolder createViewHolder(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return new TravelCalendarMonthWeekViewHolder(view);
    }

    @Override // ru.ozon.app.android.travel.calendar.utils.TravelAdapterDelegate
    public boolean isForViewType(@NotNull CalendarRowItemVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item instanceof CalendarRowItemVO.CalendarMonthWeekVO;
    }

    @Override // ru.ozon.app.android.travel.calendar.utils.TravelAdapterDelegate
    public void onBindViewHolder(@NotNull CalendarRowItemVO item, @NotNull RecyclerView.C viewHolder) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        ((TravelCalendarMonthWeekViewHolder) viewHolder).bind((CalendarRowItemVO.CalendarMonthWeekVO) item, this.indicatorColorsProvider.invoke());
    }
}
