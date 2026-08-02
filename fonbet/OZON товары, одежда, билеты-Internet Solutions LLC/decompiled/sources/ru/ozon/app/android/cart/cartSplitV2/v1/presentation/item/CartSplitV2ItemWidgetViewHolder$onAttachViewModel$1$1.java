package ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m10.C8042d;
import ru.ozon.app.android.cart.CartViewModel;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.CartSplitV2ItemVO;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "quantity", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CartSplitV2ItemWidgetViewHolder$onAttachViewModel$1$1 extends AbstractC7737t implements Function1<Integer, Unit> {
    final /* synthetic */ CartSplitV2ItemWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartSplitV2ItemWidgetViewHolder$onAttachViewModel$1$1(CartSplitV2ItemWidgetViewHolder cartSplitV2ItemWidgetViewHolder) {
        super(1);
        this.this$0 = cartSplitV2ItemWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke2(num);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Integer num) {
        CartSplitV2ItemVO.Controls controls;
        CartSplitV2ItemVO.Controls.QuantityControl quantity;
        CartSplitV2ItemWidgetViewHolder cartSplitV2ItemWidgetViewHolder = this.this$0;
        CartSplitV2ItemVO boundedData = cartSplitV2ItemWidgetViewHolder.getBoundedData();
        long id2 = boundedData != null ? boundedData.getId() : 0L;
        Intrinsics.f(num);
        cartSplitV2ItemWidgetViewHolder.trackQuantityChange(new CartViewModel.SplitQuantityChange(id2, num.intValue()));
        Integer valueOf = Integer.valueOf(this.this$0.getAdapterPosition());
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            CartSplitV2ItemWidgetViewHolder cartSplitV2ItemWidgetViewHolder2 = this.this$0;
            int intValue = valueOf.intValue();
            C8042d bindingAdapter = cartSplitV2ItemWidgetViewHolder2.getBindingAdapter();
            Object b11 = bindingAdapter != null ? bindingAdapter.b(intValue) : null;
            CartSplitV2ItemVO cartSplitV2ItemVO = b11 instanceof CartSplitV2ItemVO ? (CartSplitV2ItemVO) b11 : null;
            if (cartSplitV2ItemVO != null && (controls = cartSplitV2ItemVO.getControls()) != null && (quantity = controls.getQuantity()) != null) {
                quantity.setCurrent(num.intValue());
            }
        }
        this.this$0.refreshWithQuantity(num.intValue());
    }
}
