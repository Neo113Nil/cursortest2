package ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.item;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isTap", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CartTileItemViewHolder$bind$4 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ Function2<Integer, Boolean, Unit> $onDelete;
    final /* synthetic */ CartTileItemViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CartTileItemViewHolder$bind$4(Function2<? super Integer, ? super Boolean, Unit> function2, CartTileItemViewHolder cartTileItemViewHolder) {
        super(1);
        this.$onDelete = function2;
        this.this$0 = cartTileItemViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        this.$onDelete.invoke(Integer.valueOf(this.this$0.getAdapterPosition()), Boolean.valueOf(z11));
    }
}
