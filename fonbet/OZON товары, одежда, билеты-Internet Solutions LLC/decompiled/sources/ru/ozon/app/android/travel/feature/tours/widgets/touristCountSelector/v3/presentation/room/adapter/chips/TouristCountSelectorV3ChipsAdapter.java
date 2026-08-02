package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room.adapter.chips;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.controls.chip.ChipView;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/adapter/chips/TouristCountSelectorV3ChipsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/adapter/chips/TouristCountSelectorV3ChipViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "", "onChipSelected", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/adapter/chips/TouristCountSelectorV3ChipViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/adapter/chips/TouristCountSelectorV3ChipViewHolder;I)V", "getItemCount", "()I", "onViewAttachedToWindow", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/adapter/chips/TouristCountSelectorV3ChipViewHolder;)V", "onViewDetachedFromWindow", "", "items", "submitList", "(Ljava/util/List;)V", "Lkotlin/jvm/functions/Function1;", "", "Ljava/util/List;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TouristCountSelectorV3ChipsAdapter extends RecyclerView.g<TouristCountSelectorV3ChipViewHolder> {

    @NotNull
    private final List<ChipDTO> items;

    @NotNull
    private final Function1<ChipDTO, Unit> onChipSelected;

    /* JADX WARN: Multi-variable type inference failed */
    public TouristCountSelectorV3ChipsAdapter(@NotNull Function1<? super ChipDTO, Unit> onChipSelected) {
        Intrinsics.checkNotNullParameter(onChipSelected, "onChipSelected");
        this.onChipSelected = onChipSelected;
        this.items = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.items.size();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void submitList(@NotNull List<ChipDTO> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items.clear();
        this.items.addAll(items);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull TouristCountSelectorV3ChipViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public TouristCountSelectorV3ChipViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ChipView chipView = new ChipView(context, null, 0, 0, 14, null);
        chipView.setLayoutParams(new RecyclerView.p(-2, -2));
        return new TouristCountSelectorV3ChipViewHolder(chipView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewAttachedToWindow(@NotNull TouristCountSelectorV3ChipViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.setupCallbacks(this.onChipSelected);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewDetachedFromWindow(@NotNull TouristCountSelectorV3ChipViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.removeCallbacks();
    }
}
