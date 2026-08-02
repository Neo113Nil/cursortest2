package ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.adapter;

import H.a;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C5470d;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import ru.ozon.app.android.travel.calendar.utils.TravelAdapterDelegate;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.vo.CalendarItemVO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001c\u001a\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010 \u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u00180\u00180\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/adapter/CalendarAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lkotlin/Function1;", "Lorg/joda/time/LocalDate;", "", "onDateClickListener", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "getItemCount", "()I", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$C;", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;I)V", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarItemVO;", "calendarItems", "Lkotlin/Function0;", "afterSuccessAction", "update", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "Landroidx/recyclerview/widget/d;", "kotlin.jvm.PlatformType", "differ", "Landroidx/recyclerview/widget/d;", "Landroid/util/SparseArray;", "Lru/ozon/app/android/travel/calendar/utils/TravelAdapterDelegate;", "adapterDelegates", "Landroid/util/SparseArray;", "ItemCallback", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalendarAdapter extends RecyclerView.g<RecyclerView.C> {

    @NotNull
    private final SparseArray<TravelAdapterDelegate<CalendarItemVO>> adapterDelegates;

    @NotNull
    private final C5470d<CalendarItemVO> differ;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/adapter/CalendarAdapter$ItemCallback;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarItemVO;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarItemVO;Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarItemVO;)Z", "areContentsTheSame", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class ItemCallback extends i.d<CalendarItemVO> {
        @Override // androidx.recyclerview.widget.i.d
        public boolean areContentsTheSame(@NotNull CalendarItemVO oldItem, @NotNull CalendarItemVO newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areItemsTheSame(@NotNull CalendarItemVO oldItem, @NotNull CalendarItemVO newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem.getId(), newItem.getId());
        }
    }

    public CalendarAdapter(@NotNull Function1<? super LocalDate, Unit> onDateClickListener) {
        Intrinsics.checkNotNullParameter(onDateClickListener, "onDateClickListener");
        this.differ = new C5470d<>(this, new ItemCallback());
        SparseArray<TravelAdapterDelegate<CalendarItemVO>> sparseArray = new SparseArray<>();
        sparseArray.put(0, new CalendarMonthTitleAdapterDelegate());
        sparseArray.put(1, new CalendarMonthWeekAdapterDelegate(onDateClickListener));
        this.adapterDelegates = sparseArray;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.differ.b().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        SparseArray<TravelAdapterDelegate<CalendarItemVO>> sparseArray = this.adapterDelegates;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            int keyAt = sparseArray.keyAt(i11);
            TravelAdapterDelegate valueAt = sparseArray.valueAt(i11);
            CalendarItemVO calendarItemVO = this.differ.b().get(position);
            Intrinsics.checkNotNullExpressionValue(calendarItemVO, "get(...)");
            if (valueAt.isForViewType(calendarItemVO)) {
                return keyAt;
            }
        }
        return super.getItemViewType(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        TravelAdapterDelegate travelAdapterDelegate = this.adapterDelegates.get(holder.getItemViewType());
        CalendarItemVO calendarItemVO = this.differ.b().get(position);
        Intrinsics.checkNotNullExpressionValue(calendarItemVO, "get(...)");
        travelAdapterDelegate.onBindViewHolder(calendarItemVO, holder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return this.adapterDelegates.get(viewType).onCreateViewHolder(parent);
    }

    public final void update(@NotNull List<? extends CalendarItemVO> calendarItems, Function0<Unit> afterSuccessAction) {
        Intrinsics.checkNotNullParameter(calendarItems, "calendarItems");
        this.differ.e(calendarItems, afterSuccessAction != null ? new a(afterSuccessAction, 4) : null);
    }
}
