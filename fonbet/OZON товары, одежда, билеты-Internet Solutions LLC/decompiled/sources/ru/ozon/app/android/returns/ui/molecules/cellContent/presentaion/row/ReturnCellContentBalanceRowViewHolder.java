package ru.ozon.app.android.returns.ui.molecules.cellContent.presentaion.row;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.molecules.cellContent.viewObject.ReturnCellContentVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/cellContent/presentaion/row/ReturnCellContentBalanceRowViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/returns/ui/molecules/cellContent/presentaion/row/ReturnCellContentBalanceRowView;", "view", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/app/android/returns/ui/molecules/cellContent/presentaion/row/ReturnCellContentBalanceRowView;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/returns/ui/molecules/cellContent/viewObject/ReturnCellContentVO$BalanceRow;", "item", "bind", "(Lru/ozon/app/android/returns/ui/molecules/cellContent/viewObject/ReturnCellContentVO$BalanceRow;)V", "Lru/ozon/app/android/returns/ui/molecules/cellContent/presentaion/row/ReturnCellContentBalanceRowView;", "Lkotlin/jvm/functions/Function1;", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCellContentBalanceRowViewHolder extends RecyclerView.C {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ReturnCellContentBalanceRowView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReturnCellContentBalanceRowViewHolder(@NotNull ReturnCellContentBalanceRowView view, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.view = view;
        this.actionHandler = actionHandler;
    }

    public final void bind(@NotNull ReturnCellContentVO.BalanceRow item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ReturnCellContentBalanceRowView returnCellContentBalanceRowView = this.view;
        TextHolderKt.bind(returnCellContentBalanceRowView.getTextAtomView(), item.getText(), this.actionHandler);
        PriceAtomHolderKt.bind(returnCellContentBalanceRowView.getPriceAtomView(), item.getPrice(), this.actionHandler);
    }
}
