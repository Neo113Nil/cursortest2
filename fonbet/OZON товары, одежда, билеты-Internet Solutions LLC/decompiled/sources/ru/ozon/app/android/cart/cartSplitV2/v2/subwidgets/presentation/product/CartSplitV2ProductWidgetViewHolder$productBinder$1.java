package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l20.d;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ll20/d;", "invoke", "()Ll20/d;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class CartSplitV2ProductWidgetViewHolder$productBinder$1 extends AbstractC7737t implements Function0<d> {
    final /* synthetic */ CartSplitV2ProductWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartSplitV2ProductWidgetViewHolder$productBinder$1(CartSplitV2ProductWidgetViewHolder cartSplitV2ProductWidgetViewHolder) {
        super(0);
        this.this$0 = cartSplitV2ProductWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final d invoke() {
        l viewItem = this.this$0.getViewItem();
        if (viewItem != null) {
            return viewItem.c();
        }
        return null;
    }
}
