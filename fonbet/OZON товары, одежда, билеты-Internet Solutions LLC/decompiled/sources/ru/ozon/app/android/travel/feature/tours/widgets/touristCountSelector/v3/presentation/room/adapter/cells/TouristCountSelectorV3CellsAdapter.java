package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room.adapter.cells;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.TouristCountSelectorV3QuantityCellVO;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.view.TouristCountSelectorV3QuantityCellView;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B/\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0015R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/adapter/cells/TouristCountSelectorV3CellsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3QuantityCellVO;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/adapter/cells/TouristCountSelectorV3CellViewHolder;", "Lkotlin/Function1;", "", "onPlusButtonClicked", "onMinusButtonClicked", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/adapter/cells/TouristCountSelectorV3CellViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/adapter/cells/TouristCountSelectorV3CellViewHolder;I)V", "onViewAttachedToWindow", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/adapter/cells/TouristCountSelectorV3CellViewHolder;)V", "onViewDetachedFromWindow", "Lkotlin/jvm/functions/Function1;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TouristCountSelectorV3CellsAdapter extends t<TouristCountSelectorV3QuantityCellVO, TouristCountSelectorV3CellViewHolder> {

    @NotNull
    private final Function1<TouristCountSelectorV3QuantityCellVO, Unit> onMinusButtonClicked;

    @NotNull
    private final Function1<TouristCountSelectorV3QuantityCellVO, Unit> onPlusButtonClicked;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TouristCountSelectorV3CellsAdapter(@NotNull Function1<? super TouristCountSelectorV3QuantityCellVO, Unit> onPlusButtonClicked, @NotNull Function1<? super TouristCountSelectorV3QuantityCellVO, Unit> onMinusButtonClicked) {
        super(new i.d<TouristCountSelectorV3QuantityCellVO>() { // from class: ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room.adapter.cells.TouristCountSelectorV3CellsAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(TouristCountSelectorV3QuantityCellVO oldItem, TouristCountSelectorV3QuantityCellVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(TouristCountSelectorV3QuantityCellVO oldItem, TouristCountSelectorV3QuantityCellVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem.getId(), newItem.getId());
            }
        });
        Intrinsics.checkNotNullParameter(onPlusButtonClicked, "onPlusButtonClicked");
        Intrinsics.checkNotNullParameter(onMinusButtonClicked, "onMinusButtonClicked");
        this.onPlusButtonClicked = onPlusButtonClicked;
        this.onMinusButtonClicked = onMinusButtonClicked;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull TouristCountSelectorV3CellViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        TouristCountSelectorV3QuantityCellVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public TouristCountSelectorV3CellViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TouristCountSelectorV3QuantityCellView touristCountSelectorV3QuantityCellView = new TouristCountSelectorV3QuantityCellView(context, null, 0, 0, 14, null);
        touristCountSelectorV3QuantityCellView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new TouristCountSelectorV3CellViewHolder(touristCountSelectorV3QuantityCellView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewAttachedToWindow(@NotNull TouristCountSelectorV3CellViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.setupCallbacks(this.onPlusButtonClicked, this.onMinusButtonClicked);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewDetachedFromWindow(@NotNull TouristCountSelectorV3CellViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.removeCallbacks();
    }
}
