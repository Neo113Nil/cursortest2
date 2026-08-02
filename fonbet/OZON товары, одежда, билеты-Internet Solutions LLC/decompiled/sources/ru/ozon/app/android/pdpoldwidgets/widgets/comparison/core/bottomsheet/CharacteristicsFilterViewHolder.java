package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.bottomsheet;

import WZ.i;
import WZ.t;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitleCheckboxRadioHolderKt;
import ru.ozon.app.android.pdp.ui.configurators.databinding.ItemComparisonCharacteristicsFilterBinding;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.characteristicsPick.CharacteristicsPickVO;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleCheckboxRadioView;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u001a\u0010\n\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R(\u0010\n\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/bottomsheet/CharacteristicsFilterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/pdp/ui/configurators/databinding/ItemComparisonCharacteristicsFilterBinding;", "binding", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/bottomsheet/ComparisonBottomSheetViewModel;", "viewModel", "Lkotlin/Function2;", "LWZ/t;", "LWZ/i;", "", "senderAnalytics", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/databinding/ItemComparisonCharacteristicsFilterBinding;Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/bottomsheet/ComparisonBottomSheetViewModel;Lkotlin/jvm/functions/Function2;)V", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO$CellData$CellDataValue;", "item", "bind", "(Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO$CellData$CellDataValue;)V", "Lru/ozon/app/android/pdp/ui/configurators/databinding/ItemComparisonCharacteristicsFilterBinding;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/bottomsheet/ComparisonBottomSheetViewModel;", "Lkotlin/jvm/functions/Function2;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CharacteristicsFilterViewHolder extends RecyclerView.C {

    @NotNull
    private final ItemComparisonCharacteristicsFilterBinding binding;

    @NotNull
    private final Function2<t, i, Unit> senderAnalytics;
    private final ComparisonBottomSheetViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CharacteristicsFilterViewHolder(@NotNull ItemComparisonCharacteristicsFilterBinding binding, ComparisonBottomSheetViewModel comparisonBottomSheetViewModel, @NotNull Function2<? super t, ? super i, Unit> senderAnalytics) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(senderAnalytics, "senderAnalytics");
        this.binding = binding;
        this.viewModel = comparisonBottomSheetViewModel;
        this.senderAnalytics = senderAnalytics;
    }

    public final void bind(@NotNull CharacteristicsPickVO.CellData.CellDataValue item) {
        Intrinsics.checkNotNullParameter(item, "item");
        CellWithSubtitleCheckboxRadioView cellWithSubtitleCheckboxRadioView = this.binding.filterCell;
        Intrinsics.f(cellWithSubtitleCheckboxRadioView);
        CellWithSubtitleCheckboxRadioHolderKt.bind$default(cellWithSubtitleCheckboxRadioView, item.getCell(), null, 2, null);
        cellWithSubtitleCheckboxRadioView.setEnabled(true);
        cellWithSubtitleCheckboxRadioView.setOnCheckedChangeListener(new CharacteristicsFilterViewHolder$bind$1$1(this, item));
    }
}
