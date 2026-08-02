package ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.presentation.rv.holders;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.search.databinding.SelectorDataMobileStepItemBinding;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/rv/holders/StepItemHolderHelper;", "", "<init>", "()V", "createViewHolderByType", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/rv/holders/BaseStepItemViewHolder;", "view", "Landroid/view/View;", "viewType", "", "getViewTypeForAtom", "atomDTO", "Lru/ozon/uni/atoms/data/AtomDTO;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StepItemHolderHelper {
    @NotNull
    public final BaseStepItemViewHolder createViewHolderByType(@NotNull View view, int viewType) {
        Intrinsics.checkNotNullParameter(view, "view");
        SelectorDataMobileStepItemBinding bind = SelectorDataMobileStepItemBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        if (viewType == 0) {
            return new CellStepItemViewHolder(bind);
        }
        if (viewType == 1) {
            return new AnyAtomStepViewHolder(bind);
        }
        throw new Exception("No viewHolder for this view type");
    }

    public final int getViewTypeForAtom(@NotNull AtomDTO atomDTO) {
        Intrinsics.checkNotNullParameter(atomDTO, "atomDTO");
        return atomDTO instanceof CellAtom ? 0 : 1;
    }
}
