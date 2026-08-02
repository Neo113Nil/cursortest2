package ru.ozon.app.android.returns.ui.molecules.reason.viewHolder;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.molecules.textarea.viewObject.ReasonRow;
import ru.ozon.uni.android.atom.selectionControls.RadioButtonView;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/reason/viewHolder/CellViewHolder;", "Lru/ozon/app/android/returns/ui/molecules/reason/viewHolder/ReasonViewHolder;", "view", "Lru/ozon/uni/android/cell/CellView;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Lru/ozon/uni/android/cell/CellView;Lkotlin/jvm/functions/Function1;)V", "bind", "item", "Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow$CellRow;", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CellViewHolder extends ReasonViewHolder {

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final CellView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CellViewHolder(@NotNull CellView view, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(view, null);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.view = view;
        this.onAction = onAction;
    }

    public final void bind(@NotNull ReasonRow.CellRow item) {
        Intrinsics.checkNotNullParameter(item, "item");
        RadioButtonView radioButtonView = this.view.getLeftBlock().getRadioButtonView();
        CellDTO.LeftBlock leftBlock = item.getCell().getLeftBlock();
        ViewExtKt.showOrGone(radioButtonView, Boolean.valueOf((leftBlock != null ? leftBlock.getControl() : null) instanceof RadioDTO));
        CellHolderKt.bind(this.view, item.getCell(), this.onAction);
    }
}
