package ru.ozon.app.android.cart.ui.tab;

import Sc.s;
import Wc.a;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import ru.ozon.app.android.cart.common.domain.CartState;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "mainCartState", "Lru/ozon/app/android/cart/common/domain/CartState;", "familyCartState"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cart.ui.tab.CartTabUiController$onInit$1$totalCartCountFlow$1", f = "CartTabUiController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CartTabUiController$onInit$1$totalCartCountFlow$1 extends j implements InterfaceC6511n<CartState, CartState, d<? super Integer>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    CartTabUiController$onInit$1$totalCartCountFlow$1(d<? super CartTabUiController$onInit$1$totalCartCountFlow$1> dVar) {
        super(3, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        CartState cartState = (CartState) this.L$0;
        CartState cartState2 = (CartState) this.L$1;
        return new Integer(cartState2.getTotalCount() + cartState.getTotalCount());
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(CartState cartState, CartState cartState2, d<? super Integer> dVar) {
        CartTabUiController$onInit$1$totalCartCountFlow$1 cartTabUiController$onInit$1$totalCartCountFlow$1 = new CartTabUiController$onInit$1$totalCartCountFlow$1(dVar);
        cartTabUiController$onInit$1$totalCartCountFlow$1.L$0 = cartState;
        cartTabUiController$onInit$1$totalCartCountFlow$1.L$1 = cartState2;
        return cartTabUiController$onInit$1$totalCartCountFlow$1.invokeSuspend(Unit.f71690a);
    }
}
