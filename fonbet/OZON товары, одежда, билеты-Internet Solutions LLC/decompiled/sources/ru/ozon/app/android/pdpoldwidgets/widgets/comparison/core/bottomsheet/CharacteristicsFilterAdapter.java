package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.bottomsheet;

import WZ.i;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.databinding.ItemComparisonCharacteristicsFilterBinding;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.characteristicsPick.CharacteristicsPickVO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB#\u0012\u001a\u0010\b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R+\u0010\b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/bottomsheet/CharacteristicsFilterAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO$CellData$CellDataValue;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/bottomsheet/CharacteristicsFilterViewHolder;", "Lkotlin/Function2;", "LWZ/t;", "LWZ/i;", "", "senderAnalytics", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/bottomsheet/CharacteristicsFilterViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/bottomsheet/CharacteristicsFilterViewHolder;I)V", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/bottomsheet/ComparisonBottomSheetViewModel;", "viewModel", "submitViewModel", "(Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/bottomsheet/ComparisonBottomSheetViewModel;)V", "Lkotlin/jvm/functions/Function2;", "getSenderAnalytics", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/bottomsheet/ComparisonBottomSheetViewModel;", "DiffUtilCallback", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CharacteristicsFilterAdapter extends t<CharacteristicsPickVO.CellData.CellDataValue, CharacteristicsFilterViewHolder> {

    @NotNull
    private final Function2<WZ.t, i, Unit> senderAnalytics;
    private ComparisonBottomSheetViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/bottomsheet/CharacteristicsFilterAdapter$DiffUtilCallback;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO$CellData$CellDataValue;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO$CellData$CellDataValue;Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO$CellData$CellDataValue;)Z", "areContentsTheSame", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class DiffUtilCallback extends i.d<CharacteristicsPickVO.CellData.CellDataValue> {
        @Override // androidx.recyclerview.widget.i.d
        public boolean areContentsTheSame(@NotNull CharacteristicsPickVO.CellData.CellDataValue oldItem, @NotNull CharacteristicsPickVO.CellData.CellDataValue newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem.getCell(), newItem.getCell());
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areItemsTheSame(@NotNull CharacteristicsPickVO.CellData.CellDataValue oldItem, @NotNull CharacteristicsPickVO.CellData.CellDataValue newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem.getId(), newItem.getId());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CharacteristicsFilterAdapter(@NotNull Function2<? super WZ.t, ? super WZ.i, Unit> senderAnalytics) {
        super(new DiffUtilCallback());
        Intrinsics.checkNotNullParameter(senderAnalytics, "senderAnalytics");
        this.senderAnalytics = senderAnalytics;
    }

    public final void submitViewModel(@NotNull ComparisonBottomSheetViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.viewModel = viewModel;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull CharacteristicsFilterViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        CharacteristicsPickVO.CellData.CellDataValue cellDataValue = getCurrentList().get(position);
        Intrinsics.checkNotNullExpressionValue(cellDataValue, "get(...)");
        holder.bind(cellDataValue);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public CharacteristicsFilterViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemComparisonCharacteristicsFilterBinding inflate = ItemComparisonCharacteristicsFilterBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new CharacteristicsFilterViewHolder(inflate, this.viewModel, this.senderAnalytics);
    }
}
