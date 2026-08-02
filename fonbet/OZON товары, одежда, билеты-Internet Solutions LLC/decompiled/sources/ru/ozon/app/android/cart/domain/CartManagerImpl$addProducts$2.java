package ru.ozon.app.android.cart.domain;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cart.common.data.CartAddItemResponse;
import ru.ozon.app.android.cart.common.domain.AddToCartRequestState;
import ru.ozon.app.android.cart.common.domain.CartNavigationService;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "cartAddItemResponse", "Lru/ozon/app/android/cart/common/data/CartAddItemResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/cart/common/data/CartAddItemResponse;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CartManagerImpl$addProducts$2 extends AbstractC7737t implements Function1<CartAddItemResponse, Unit> {
    final /* synthetic */ CartManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartManagerImpl$addProducts$2(CartManagerImpl cartManagerImpl) {
        super(1);
        this.this$0 = cartManagerImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CartAddItemResponse cartAddItemResponse) {
        invoke2(cartAddItemResponse);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CartAddItemResponse cartAddItemResponse) {
        CartNavigationService cartNavigationService;
        cartNavigationService = this.this$0.cartNavigationService;
        cartNavigationService.onResponseAddToCart(cartAddItemResponse.getParams());
        this.this$0._addToCartRequestState.tryEmit((cartAddItemResponse.getDeeplink() != null || cartAddItemResponse.getSuccess()) ? new AddToCartRequestState.Success(cartAddItemResponse.getDeeplink()) : AddToCartRequestState.Error.INSTANCE);
    }
}
