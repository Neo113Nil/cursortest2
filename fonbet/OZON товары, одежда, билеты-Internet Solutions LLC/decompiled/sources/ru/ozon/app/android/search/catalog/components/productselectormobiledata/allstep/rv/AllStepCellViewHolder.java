package ru.ozon.app.android.search.catalog.components.productselectormobiledata.allstep.rv;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitleDefaultHolderKt;
import ru.ozon.app.android.search.databinding.SelectorDataAllStepCellItemBinding;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleDefaultView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/allstep/rv/AllStepCellViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/search/databinding/SelectorDataAllStepCellItemBinding;", "binding", "<init>", "(Lru/ozon/app/android/search/databinding/SelectorDataAllStepCellItemBinding;)V", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bind", "(Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/search/databinding/SelectorDataAllStepCellItemBinding;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AllStepCellViewHolder extends RecyclerView.C {

    @NotNull
    private final SelectorDataAllStepCellItemBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllStepCellViewHolder(@NotNull SelectorDataAllStepCellItemBinding binding) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
    }

    public final void bind(@NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault item, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        CellWithSubtitleDefaultView allStepCellItem = this.binding.allStepCellItem;
        Intrinsics.checkNotNullExpressionValue(allStepCellItem, "allStepCellItem");
        CellWithSubtitleDefaultHolderKt.bind(allStepCellItem, item, onAction);
    }
}
