package ru.ozon.app.android.cart.configurator.base;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.domain.local.CartSource;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "cartState", "Lru/ozon/app/android/cart/common/domain/CartState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cart.configurator.base.BaseCartRefreshEventConfigurator$onCreate$1", f = "BaseCartRefreshEventConfigurator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class BaseCartRefreshEventConfigurator$onCreate$1 extends j implements Function2<CartState, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BaseCartRefreshEventConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseCartRefreshEventConfigurator$onCreate$1(BaseCartRefreshEventConfigurator baseCartRefreshEventConfigurator, d<? super BaseCartRefreshEventConfigurator$onCreate$1> dVar) {
        super(2, dVar);
        this.this$0 = baseCartRefreshEventConfigurator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        BaseCartRefreshEventConfigurator$onCreate$1 baseCartRefreshEventConfigurator$onCreate$1 = new BaseCartRefreshEventConfigurator$onCreate$1(this.this$0, dVar);
        baseCartRefreshEventConfigurator$onCreate$1.L$0 = obj;
        return baseCartRefreshEventConfigurator$onCreate$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CartEventsController cartEventsController;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        CartState cartState = (CartState) this.L$0;
        if (cartState.getSource() == CartSource.LOCAL) {
            BaseCartRefreshEventConfigurator baseCartRefreshEventConfigurator = this.this$0;
            baseCartRefreshEventConfigurator.handleLocalCartState(cartState, baseCartRefreshEventConfigurator.getAddToCartEvent(cartState.getCartType()));
        } else {
            BaseCartRefreshEventConfigurator baseCartRefreshEventConfigurator2 = this.this$0;
            cartEventsController = baseCartRefreshEventConfigurator2.cartEventsController;
            baseCartRefreshEventConfigurator2.handleRemoteCartState(cartState, cartEventsController);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CartState cartState, d<? super Unit> dVar) {
        return ((BaseCartRefreshEventConfigurator$onCreate$1) create(cartState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
