package ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.presentation.rv.holders;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.databinding.SelectorDataMobileStepItemBinding;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/rv/holders/AnyAtomStepViewHolder;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/rv/holders/BaseStepItemViewHolder;", "binding", "Lru/ozon/app/android/search/databinding/SelectorDataMobileStepItemBinding;", "<init>", "(Lru/ozon/app/android/search/databinding/SelectorDataMobileStepItemBinding;)V", "bind", "", "atom", "Lru/ozon/uni/atoms/data/AtomDTO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AnyAtomStepViewHolder extends BaseStepItemViewHolder {

    @NotNull
    private final SelectorDataMobileStepItemBinding binding;
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AnyAtomStepViewHolder(@NotNull SelectorDataMobileStepItemBinding binding) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        SingleAtom constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
    }

    @Override // ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.presentation.rv.holders.BaseStepItemViewHolder
    public void bind(@NotNull AtomDTO atom, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(atom, "atom");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        SelectorDataMobileStepItemBinding selectorDataMobileStepItemBinding = this.binding;
        SingleAtom.bind$default(selectorDataMobileStepItemBinding.stepItem, atom, false, 2, null);
        selectorDataMobileStepItemBinding.stepItem.setOnAction(actionHandler);
    }
}
