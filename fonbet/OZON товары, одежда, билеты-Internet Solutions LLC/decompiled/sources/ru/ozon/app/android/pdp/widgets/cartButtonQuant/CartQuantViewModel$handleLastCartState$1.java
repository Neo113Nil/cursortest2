package ru.ozon.app.android.pdp.widgets.cartButtonQuant;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.common.domain.CartState;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/cart/common/domain/CartState;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/cart/common/domain/CartState;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CartQuantViewModel$handleLastCartState$1 extends AbstractC7737t implements Function1<CartState, Unit> {
    final /* synthetic */ boolean $forceUpdate;
    final /* synthetic */ CartQuantViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartQuantViewModel$handleLastCartState$1(CartQuantViewModel cartQuantViewModel, boolean z11) {
        super(1);
        this.this$0 = cartQuantViewModel;
        this.$forceUpdate = z11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CartState cartState) {
        invoke2(cartState);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CartState cartState) {
        CartQuantViewModel cartQuantViewModel = this.this$0;
        Intrinsics.f(cartState);
        cartQuantViewModel.handleCartState(cartState, this.$forceUpdate);
    }
}
