package ru.ozon.app.android.returns.listEmpty.presentation.instruction.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.listEmpty.presentation.TextBlockVO;
import ru.ozon.app.android.returns.listEmpty.presentation.view.ReturnInstructionItemView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/returns/listEmpty/presentation/instruction/adapter/InstructionAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/returns/listEmpty/presentation/TextBlockVO$Instruction$Item;", "Lru/ozon/app/android/returns/listEmpty/presentation/instruction/adapter/InstructionItemViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/returns/listEmpty/presentation/instruction/adapter/InstructionItemViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/returns/listEmpty/presentation/instruction/adapter/InstructionItemViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "DiffCallback", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InstructionAdapter extends t<TextBlockVO.Instruction.Item, InstructionItemViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/returns/listEmpty/presentation/instruction/adapter/InstructionAdapter$DiffCallback;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/returns/listEmpty/presentation/TextBlockVO$Instruction$Item;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/returns/listEmpty/presentation/TextBlockVO$Instruction$Item;Lru/ozon/app/android/returns/listEmpty/presentation/TextBlockVO$Instruction$Item;)Z", "areContentsTheSame", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class DiffCallback extends i.d<TextBlockVO.Instruction.Item> {

        @NotNull
        public static final DiffCallback INSTANCE = new DiffCallback();

        private DiffCallback() {
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areContentsTheSame(@NotNull TextBlockVO.Instruction.Item oldItem, @NotNull TextBlockVO.Instruction.Item newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem.getContent(), newItem.getContent());
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areItemsTheSame(@NotNull TextBlockVO.Instruction.Item oldItem, @NotNull TextBlockVO.Instruction.Item newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem.getOrdinalNumber(), newItem.getOrdinalNumber());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InstructionAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(DiffCallback.INSTANCE);
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull InstructionItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        TextBlockVO.Instruction.Item item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public InstructionItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new InstructionItemViewHolder(new ReturnInstructionItemView(context, null, 0, 0, 14, null), this.actionHandler);
    }
}
