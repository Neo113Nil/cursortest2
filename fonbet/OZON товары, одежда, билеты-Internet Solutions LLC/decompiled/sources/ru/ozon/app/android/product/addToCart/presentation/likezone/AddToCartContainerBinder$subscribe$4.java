package ru.ozon.app.android.product.addToCart.presentation.likezone;

import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.models.CartItemInfo;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "cartState", "Lru/ozon/app/android/cart/common/domain/CartState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.app.android.product.addToCart.presentation.likezone.AddToCartContainerBinder$subscribe$4", f = "AddToCartContainerBinder.kt", l = {92}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class AddToCartContainerBinder$subscribe$4 extends j implements Function2<CartState, kotlin.coroutines.d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AddToCartContainerBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddToCartContainerBinder$subscribe$4(AddToCartContainerBinder addToCartContainerBinder, kotlin.coroutines.d<? super AddToCartContainerBinder$subscribe$4> dVar) {
        super(2, dVar);
        this.this$0 = addToCartContainerBinder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        AddToCartContainerBinder$subscribe$4 addToCartContainerBinder$subscribe$4 = new AddToCartContainerBinder$subscribe$4(this.this$0, dVar);
        addToCartContainerBinder$subscribe$4.L$0 = obj;
        return addToCartContainerBinder$subscribe$4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Long skuId;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            CartState cartState = (CartState) this.L$0;
            AddToCartContainerBinder addToCartContainerBinder = this.this$0;
            skuId = addToCartContainerBinder.getSkuId();
            CartItemInfo cartItemInfo = skuId != null ? cartState.getItems().get(new Long(skuId.longValue())) : null;
            this.label = 1;
            if (AddToCartContainerBinder.handleCartUpdate$default(addToCartContainerBinder, null, cartItemInfo, this, 1, null) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CartState cartState, kotlin.coroutines.d<? super Unit> dVar) {
        return ((AddToCartContainerBinder$subscribe$4) create(cartState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
