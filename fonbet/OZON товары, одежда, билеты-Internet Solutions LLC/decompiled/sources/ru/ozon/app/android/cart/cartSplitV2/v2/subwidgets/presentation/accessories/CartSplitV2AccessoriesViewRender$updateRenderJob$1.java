package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cart.cartSplitV2.accessories.AccessoriesAsyncState;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesAsyncState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.CartSplitV2AccessoriesViewRender$updateRenderJob$1", f = "CartSplitV2AccessoriesViewRender.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CartSplitV2AccessoriesViewRender$updateRenderJob$1 extends j implements Function2<AccessoriesAsyncState, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CartSplitV2AccessoriesViewRender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartSplitV2AccessoriesViewRender$updateRenderJob$1(CartSplitV2AccessoriesViewRender cartSplitV2AccessoriesViewRender, d<? super CartSplitV2AccessoriesViewRender$updateRenderJob$1> dVar) {
        super(2, dVar);
        this.this$0 = cartSplitV2AccessoriesViewRender;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CartSplitV2AccessoriesViewRender$updateRenderJob$1 cartSplitV2AccessoriesViewRender$updateRenderJob$1 = new CartSplitV2AccessoriesViewRender$updateRenderJob$1(this.this$0, dVar);
        cartSplitV2AccessoriesViewRender$updateRenderJob$1.L$0 = obj;
        return cartSplitV2AccessoriesViewRender$updateRenderJob$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.currentState = (AccessoriesAsyncState) this.L$0;
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AccessoriesAsyncState accessoriesAsyncState, d<? super Unit> dVar) {
        return ((CartSplitV2AccessoriesViewRender$updateRenderJob$1) create(accessoriesAsyncState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
