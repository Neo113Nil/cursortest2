package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.presentation.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.i;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.presentation.HotelsScrollPriceCalendarV2VI;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.presentation.background.HotelsScrollPriceCalendarV2ItemViewBackgroundProducer;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.view.HotelsScrollPriceCalendarV2ItemView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/adapter/HotelsScrollPriceCalendarV2Adapter;", "Ljk0/i;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$DatePriceItem;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/adapter/HotelsScrollPriceCalendarV2ViewHolder;", "Landroidx/lifecycle/J;", "containerViewLifecycleOwner", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;)V", "holder", "", "position", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/adapter/HotelsScrollPriceCalendarV2ViewHolder;I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/adapter/HotelsScrollPriceCalendarV2ViewHolder;", "Lkotlin/jvm/functions/Function1;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsScrollPriceCalendarV2Adapter extends i<HotelsScrollPriceCalendarV2VI.DatePriceItem, HotelsScrollPriceCalendarV2ViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HotelsScrollPriceCalendarV2Adapter(@NotNull J containerViewLifecycleOwner, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(new i.d<HotelsScrollPriceCalendarV2VI.DatePriceItem>() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.presentation.adapter.HotelsScrollPriceCalendarV2Adapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(HotelsScrollPriceCalendarV2VI.DatePriceItem oldItem, HotelsScrollPriceCalendarV2VI.DatePriceItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(HotelsScrollPriceCalendarV2VI.DatePriceItem oldItem, HotelsScrollPriceCalendarV2VI.DatePriceItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        }, containerViewLifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(containerViewLifecycleOwner, "containerViewLifecycleOwner");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull HotelsScrollPriceCalendarV2ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        HotelsScrollPriceCalendarV2VI.DatePriceItem item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public HotelsScrollPriceCalendarV2ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        HotelsScrollPriceCalendarV2ItemView hotelsScrollPriceCalendarV2ItemView = new HotelsScrollPriceCalendarV2ItemView(context);
        hotelsScrollPriceCalendarV2ItemView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        Function1<AtomAction, Unit> function1 = this.actionHandler;
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return new HotelsScrollPriceCalendarV2ViewHolder(hotelsScrollPriceCalendarV2ItemView, function1, new HotelsScrollPriceCalendarV2ItemViewBackgroundProducer(context2));
    }
}
