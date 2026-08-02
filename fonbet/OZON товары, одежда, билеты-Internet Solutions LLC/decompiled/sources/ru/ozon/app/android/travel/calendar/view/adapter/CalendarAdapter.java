package ru.ozon.app.android.travel.calendar.view.adapter;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C5470d;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import fM.RunnableC6479a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import ru.ozon.app.android.travel.calendar.utils.TravelAdapterDelegate;
import ru.ozon.app.android.travel.calendar.view.vo.CalendarRowItemVO;
import ru.ozon.app.android.travel.calendar.view.vo.Indicator;
import ru.ozon.app.android.travel.calendar.view.vo.IndicatorColor;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B5\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ-\u0010#\u001a\u00020\u00052\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0004\b#\u0010$R\"\u0010'\u001a\u0010\u0012\f\u0012\n &*\u0004\u0018\u00010 0 0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/calendar/view/adapter/CalendarAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lkotlin/Function1;", "Lorg/joda/time/LocalDate;", "", "onDateClickListener", "Lkotlin/Function0;", "", "Lru/ozon/app/android/travel/calendar/view/vo/Indicator$ColorIndicator;", "Lru/ozon/app/android/travel/calendar/view/vo/IndicatorColor;", "indicatorColorsProvider", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "", "getItemCount", "()I", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$C;", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;I)V", "onViewAttachedToWindow", "(Landroidx/recyclerview/widget/RecyclerView$C;)V", "onViewDetachedFromWindow", "", "Lru/ozon/app/android/travel/calendar/view/vo/CalendarRowItemVO;", "calendarItems", "afterSuccessAction", "update", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "Landroidx/recyclerview/widget/d;", "kotlin.jvm.PlatformType", "differ", "Landroidx/recyclerview/widget/d;", "Landroid/util/SparseArray;", "Lru/ozon/app/android/travel/calendar/utils/TravelAdapterDelegate;", "adapterDelegates", "Landroid/util/SparseArray;", "ItemCallback", "calendar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CalendarAdapter extends RecyclerView.g<RecyclerView.C> {

    @NotNull
    private final SparseArray<TravelAdapterDelegate<CalendarRowItemVO>> adapterDelegates;

    @NotNull
    private final C5470d<CalendarRowItemVO> differ;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/calendar/view/adapter/CalendarAdapter$ItemCallback;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/travel/calendar/view/vo/CalendarRowItemVO;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/travel/calendar/view/vo/CalendarRowItemVO;Lru/ozon/app/android/travel/calendar/view/vo/CalendarRowItemVO;)Z", "areContentsTheSame", "calendar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class ItemCallback extends i.d<CalendarRowItemVO> {
        @Override // androidx.recyclerview.widget.i.d
        public boolean areContentsTheSame(@NotNull CalendarRowItemVO oldItem, @NotNull CalendarRowItemVO newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areItemsTheSame(@NotNull CalendarRowItemVO oldItem, @NotNull CalendarRowItemVO newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem.getId(), newItem.getId());
        }
    }

    public CalendarAdapter(@NotNull Function1<? super LocalDate, Unit> onDateClickListener, @NotNull Function0<? extends Map<Indicator.ColorIndicator, IndicatorColor>> indicatorColorsProvider) {
        Intrinsics.checkNotNullParameter(onDateClickListener, "onDateClickListener");
        Intrinsics.checkNotNullParameter(indicatorColorsProvider, "indicatorColorsProvider");
        this.differ = new C5470d<>(this, new ItemCallback());
        SparseArray<TravelAdapterDelegate<CalendarRowItemVO>> sparseArray = new SparseArray<>();
        sparseArray.put(0, new CalendarMonthTitleAdapterDelegate());
        sparseArray.put(1, new CalendarMonthWeekAdapterDelegate(onDateClickListener, indicatorColorsProvider));
        this.adapterDelegates = sparseArray;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.differ.b().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        SparseArray<TravelAdapterDelegate<CalendarRowItemVO>> sparseArray = this.adapterDelegates;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            int keyAt = sparseArray.keyAt(i11);
            TravelAdapterDelegate valueAt = sparseArray.valueAt(i11);
            CalendarRowItemVO calendarRowItemVO = this.differ.b().get(position);
            Intrinsics.checkNotNullExpressionValue(calendarRowItemVO, "get(...)");
            if (valueAt.isForViewType(calendarRowItemVO)) {
                return keyAt;
            }
        }
        return super.getItemViewType(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        TravelAdapterDelegate travelAdapterDelegate = this.adapterDelegates.get(holder.getItemViewType());
        CalendarRowItemVO calendarRowItemVO = this.differ.b().get(position);
        Intrinsics.checkNotNullExpressionValue(calendarRowItemVO, "get(...)");
        travelAdapterDelegate.onBindViewHolder(calendarRowItemVO, holder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return this.adapterDelegates.get(viewType).onCreateViewHolder(parent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewAttachedToWindow(@NotNull RecyclerView.C holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.adapterDelegates.get(holder.getItemViewType()).onAttach(holder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewDetachedFromWindow(@NotNull RecyclerView.C holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.adapterDelegates.get(holder.getItemViewType()).onDetach(holder);
    }

    public final void update(@NotNull List<? extends CalendarRowItemVO> calendarItems, Function0<Unit> afterSuccessAction) {
        Intrinsics.checkNotNullParameter(calendarItems, "calendarItems");
        this.differ.e(calendarItems, afterSuccessAction != null ? new RunnableC6479a(afterSuccessAction, 0) : null);
    }
}
