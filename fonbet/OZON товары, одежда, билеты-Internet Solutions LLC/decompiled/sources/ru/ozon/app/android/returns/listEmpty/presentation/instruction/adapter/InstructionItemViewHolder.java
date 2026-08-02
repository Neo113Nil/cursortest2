package ru.ozon.app.android.returns.listEmpty.presentation.instruction.adapter;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.listEmpty.presentation.TextBlockVO;
import ru.ozon.app.android.returns.listEmpty.presentation.view.ReturnInstructionItemView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/returns/listEmpty/presentation/instruction/adapter/InstructionItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/returns/listEmpty/presentation/view/ReturnInstructionItemView;", "returnInstructionView", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/app/android/returns/listEmpty/presentation/view/ReturnInstructionItemView;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/returns/listEmpty/presentation/TextBlockVO$Instruction$Item;", "item", "bind", "(Lru/ozon/app/android/returns/listEmpty/presentation/TextBlockVO$Instruction$Item;)V", "Lru/ozon/app/android/returns/listEmpty/presentation/view/ReturnInstructionItemView;", "Lkotlin/jvm/functions/Function1;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InstructionItemViewHolder extends RecyclerView.C {
    public static final int $stable = TextAtomView.$stable;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ReturnInstructionItemView returnInstructionView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InstructionItemViewHolder(@NotNull ReturnInstructionItemView returnInstructionView, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(returnInstructionView);
        Intrinsics.checkNotNullParameter(returnInstructionView, "returnInstructionView");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.returnInstructionView = returnInstructionView;
        this.actionHandler = actionHandler;
    }

    public final void bind(@NotNull TextBlockVO.Instruction.Item item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ReturnInstructionItemView returnInstructionItemView = this.returnInstructionView;
        TextAtomHolderKt.bind(returnInstructionItemView.getOrdinalNumberTextAtomView(), item.getOrdinalNumber(), this.actionHandler);
        TextAtomHolderKt.bind(returnInstructionItemView.getContentTextAtomView(), item.getContent(), this.actionHandler);
    }
}
