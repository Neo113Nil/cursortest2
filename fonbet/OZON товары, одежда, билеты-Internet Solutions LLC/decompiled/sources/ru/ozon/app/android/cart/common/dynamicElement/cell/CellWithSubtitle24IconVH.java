package ru.ozon.app.android.cart.common.dynamicElement.cell;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitle24IconHolderKt;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementVO;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle24IconView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/cart/common/dynamicElement/cell/CellWithSubtitle24IconVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitle24IconView;", "cellWithSubtitle24IconView", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "<init>", "(Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitle24IconView;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/cart/common/dynamicElement/DynamicElementVO$CellWithSubtitle24Icon;", "item", "bind", "(Lru/ozon/app/android/cart/common/dynamicElement/DynamicElementVO$CellWithSubtitle24Icon;)V", "Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitle24IconView;", "Lkotlin/jvm/functions/Function1;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CellWithSubtitle24IconVH extends RecyclerView.C {

    @NotNull
    private final CellWithSubtitle24IconView cellWithSubtitle24IconView;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CellWithSubtitle24IconVH(@NotNull CellWithSubtitle24IconView cellWithSubtitle24IconView, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(cellWithSubtitle24IconView);
        Intrinsics.checkNotNullParameter(cellWithSubtitle24IconView, "cellWithSubtitle24IconView");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.cellWithSubtitle24IconView = cellWithSubtitle24IconView;
        this.onAction = onAction;
    }

    public final void bind(@NotNull DynamicElementVO.CellWithSubtitle24Icon item) {
        Intrinsics.checkNotNullParameter(item, "item");
        CellWithSubtitle24IconHolderKt.bind(this.cellWithSubtitle24IconView, item.getCell(), this.onAction);
    }
}
