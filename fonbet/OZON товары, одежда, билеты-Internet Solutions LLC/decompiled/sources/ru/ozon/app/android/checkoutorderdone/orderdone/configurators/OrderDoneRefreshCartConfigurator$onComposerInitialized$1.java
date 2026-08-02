package ru.ozon.app.android.checkoutorderdone.orderdone.configurators;

import Ge.f;
import Sc.s;
import Wc.a;
import io.reactivex.AbstractC7094b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cart.common.data.prefetch.state.CartPrefetchState;
import ru.ozon.app.android.cart.common.domain.CartService;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.checkoutorderdone.orderdone.configurators.OrderDoneRefreshCartConfigurator$onComposerInitialized$1", f = "OrderDoneRefreshCartConfigurator.kt", l = {22}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class OrderDoneRefreshCartConfigurator$onComposerInitialized$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ OrderDoneRefreshCartConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderDoneRefreshCartConfigurator$onComposerInitialized$1(OrderDoneRefreshCartConfigurator orderDoneRefreshCartConfigurator, d<? super OrderDoneRefreshCartConfigurator$onComposerInitialized$1> dVar) {
        super(2, dVar);
        this.this$0 = orderDoneRefreshCartConfigurator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OrderDoneRefreshCartConfigurator$onComposerInitialized$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CartService cartService;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                cartService = this.this$0.cartService;
                AbstractC7094b updateCart$default = CartService.DefaultImpls.updateCart$default(cartService, CartPrefetchState.OrderDone.INSTANCE, null, 2, null);
                this.label = 1;
                if (f.a(updateCart$default, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
        } catch (Exception e11) {
            Lm0.a.f17149a.e(e11);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((OrderDoneRefreshCartConfigurator$onComposerInitialized$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
