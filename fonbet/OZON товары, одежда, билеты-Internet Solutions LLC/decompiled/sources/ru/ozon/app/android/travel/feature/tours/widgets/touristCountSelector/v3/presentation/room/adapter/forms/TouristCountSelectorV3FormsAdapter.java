package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room.adapter.forms;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.TouristCountSelectorV3ChildFormVO;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.view.TouristCountSelectorV3ChildFormView;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0015R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/adapter/forms/TouristCountSelectorV3FormsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ChildFormVO;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/adapter/forms/TouristCountSelectorV3FormViewHolder;", "Lkotlin/Function2;", "", "Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "", "onChildAgeSelected", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/adapter/forms/TouristCountSelectorV3FormViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/adapter/forms/TouristCountSelectorV3FormViewHolder;I)V", "onViewAttachedToWindow", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/adapter/forms/TouristCountSelectorV3FormViewHolder;)V", "onViewDetachedFromWindow", "Lkotlin/jvm/functions/Function2;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TouristCountSelectorV3FormsAdapter extends t<TouristCountSelectorV3ChildFormVO, TouristCountSelectorV3FormViewHolder> {

    @NotNull
    private final Function2<Integer, ChipDTO, Unit> onChildAgeSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TouristCountSelectorV3FormsAdapter(@NotNull Function2<? super Integer, ? super ChipDTO, Unit> onChildAgeSelected) {
        super(new i.d<TouristCountSelectorV3ChildFormVO>() { // from class: ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room.adapter.forms.TouristCountSelectorV3FormsAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(TouristCountSelectorV3ChildFormVO oldItem, TouristCountSelectorV3ChildFormVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(TouristCountSelectorV3ChildFormVO oldItem, TouristCountSelectorV3ChildFormVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        });
        Intrinsics.checkNotNullParameter(onChildAgeSelected, "onChildAgeSelected");
        this.onChildAgeSelected = onChildAgeSelected;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull TouristCountSelectorV3FormViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        TouristCountSelectorV3ChildFormVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public TouristCountSelectorV3FormViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TouristCountSelectorV3ChildFormView touristCountSelectorV3ChildFormView = new TouristCountSelectorV3ChildFormView(context, null, 0, 0, 14, null);
        touristCountSelectorV3ChildFormView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new TouristCountSelectorV3FormViewHolder(touristCountSelectorV3ChildFormView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewAttachedToWindow(@NotNull TouristCountSelectorV3FormViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.setupCallbacks(this.onChildAgeSelected);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewDetachedFromWindow(@NotNull TouristCountSelectorV3FormViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.removeCallbacks();
    }
}
