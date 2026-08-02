package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m10.C8042d;
import ru.ozon.app.android.cart.CartViewModel;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.ControlsVO;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "quantity", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CartSplitV2ControlsWidgetViewHolder$onAttachViewModel$2 extends AbstractC7737t implements Function1<Integer, Unit> {
    final /* synthetic */ CartSplitV2ControlsWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartSplitV2ControlsWidgetViewHolder$onAttachViewModel$2(CartSplitV2ControlsWidgetViewHolder cartSplitV2ControlsWidgetViewHolder) {
        super(1);
        this.this$0 = cartSplitV2ControlsWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke2(num);
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Integer num) {
        ControlsVO controls;
        ControlsVO.QuantityControl quantity;
        CartSplitV2ControlsWidgetViewHolder cartSplitV2ControlsWidgetViewHolder = this.this$0;
        CartSplitV2ControlsVO cartSplitV2ControlsVO = (CartSplitV2ControlsVO) cartSplitV2ControlsWidgetViewHolder.getBoundData();
        long id2 = cartSplitV2ControlsVO != null ? cartSplitV2ControlsVO.getId() : 0L;
        Intrinsics.f(num);
        cartSplitV2ControlsWidgetViewHolder.trackQuantityChange(new CartViewModel.SplitQuantityChange(id2, num.intValue()));
        Integer valueOf = Integer.valueOf(this.this$0.getAdapterPosition());
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            CartSplitV2ControlsWidgetViewHolder cartSplitV2ControlsWidgetViewHolder2 = this.this$0;
            int intValue = valueOf.intValue();
            C8042d bindingAdapter = cartSplitV2ControlsWidgetViewHolder2.getBindingAdapter();
            Object b11 = bindingAdapter != null ? bindingAdapter.b(intValue) : null;
            CartSplitV2ControlsVO cartSplitV2ControlsVO2 = b11 instanceof CartSplitV2ControlsVO ? (CartSplitV2ControlsVO) b11 : null;
            if (cartSplitV2ControlsVO2 != null && (controls = cartSplitV2ControlsVO2.getControls()) != null && (quantity = controls.getQuantity()) != null) {
                quantity.setCurrent(num.intValue());
            }
        }
        this.this$0.refreshWithQuantity(num.intValue());
    }
}
