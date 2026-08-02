package ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.presentation.rv.holders;

import aI.ViewOnClickListenerC4974b;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.presentation.rv.holders.CellStepItemViewHolder;
import ru.ozon.app.android.search.databinding.SelectorDataMobileStepItemBinding;
import ru.ozon.app.android.uikit.R$id;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/rv/holders/CellStepItemViewHolder;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/rv/holders/BaseStepItemViewHolder;", "binding", "Lru/ozon/app/android/search/databinding/SelectorDataMobileStepItemBinding;", "<init>", "(Lru/ozon/app/android/search/databinding/SelectorDataMobileStepItemBinding;)V", "currentAtom", "Lru/ozon/app/android/atoms/data/cells/CellAtom;", "bind", "", "atom", "Lru/ozon/uni/atoms/data/AtomDTO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CellStepItemViewHolder extends BaseStepItemViewHolder {

    @NotNull
    private final SelectorDataMobileStepItemBinding binding;
    private CellAtom currentAtom;
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CellStepItemViewHolder(@NotNull SelectorDataMobileStepItemBinding binding) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        SingleAtom constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$4$lambda$1(AtomDTO atomDTO, Function1 function1, CellStepItemViewHolder cellStepItemViewHolder, View view) {
        AtomActionDTO action = ((CellAtom) atomDTO).getAction();
        if (action != null) {
            CellAtom cellAtom = cellStepItemViewHolder.currentAtom;
            function1.invoke(AtomActionMapperKt.toAtomAction(action, cellAtom != null ? cellAtom.getTrackingInfo() : null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$4$lambda$3(AtomDTO atomDTO, Function1 function1, CellStepItemViewHolder cellStepItemViewHolder, View view) {
        AtomActionDTO action = ((CellAtom) atomDTO).getAction();
        if (action != null) {
            CellAtom cellAtom = cellStepItemViewHolder.currentAtom;
            function1.invoke(AtomActionMapperKt.toAtomAction(action, cellAtom != null ? cellAtom.getTrackingInfo() : null));
        }
    }

    @Override // ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.presentation.rv.holders.BaseStepItemViewHolder
    public void bind(@NotNull AtomDTO atom, @NotNull final Function1<? super AtomAction, Unit> actionHandler) {
        View findViewById;
        Intrinsics.checkNotNullParameter(atom, "atom");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        SelectorDataMobileStepItemBinding selectorDataMobileStepItemBinding = this.binding;
        if (atom instanceof CellAtom) {
            this.currentAtom = (CellAtom) atom;
            SingleAtom.bind$default(selectorDataMobileStepItemBinding.stepItem, atom, false, 2, null);
            View childAt = selectorDataMobileStepItemBinding.stepItem.getChildAt(0);
            if (childAt != null && (findViewById = childAt.findViewById(R$id.radioButtonView)) != null) {
                final CellAtom cellAtom = (CellAtom) atom;
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: aI.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CellStepItemViewHolder.bind$lambda$4$lambda$1(CellAtom.this, actionHandler, this, view);
                    }
                });
            }
            View childAt2 = selectorDataMobileStepItemBinding.stepItem.getChildAt(0);
            if (childAt2 != null) {
                childAt2.setOnClickListener(new ViewOnClickListenerC4974b((CellAtom) atom, actionHandler, this, 0));
            }
        }
    }
}
