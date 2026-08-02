package ru.ozon.app.android.product.skuthinscroll.presentation.vh;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.product.cartdelegate.CartButtonDelegate;
import ru.ozon.app.android.product.skuthinscroll.presentation.SkuThinScrollVO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/product/cartdelegate/CartButtonDelegate$ButtonState;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SkuThinScrollItemViewHolder$onAttach$1$onCreate$1 extends AbstractC7737t implements Function1<CartButtonDelegate.ButtonState, Unit> {
    final /* synthetic */ SkuThinScrollItemViewHolder<VB> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SkuThinScrollItemViewHolder$onAttach$1$onCreate$1(SkuThinScrollItemViewHolder<VB> skuThinScrollItemViewHolder) {
        super(1);
        this.this$0 = skuThinScrollItemViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CartButtonDelegate.ButtonState buttonState) {
        invoke2(buttonState);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CartButtonDelegate.ButtonState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        boolean inCart = state.getInCart();
        SkuThinScrollVO.ItemVO boundItem = this.this$0.getBoundItem();
        if (boundItem == null) {
            return;
        }
        this.this$0.bindButton(boundItem, inCart, state.getAddActionDisabled());
    }
}
