package ru.ozon.app.android.cart.configurator.base;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cart.common.domain.CartRefreshReason;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/cart/common/domain/CartState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cart.configurator.base.BaseCartRefreshEventConfigurator$onCreate$3", f = "BaseCartRefreshEventConfigurator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class BaseCartRefreshEventConfigurator$onCreate$3 extends j implements Function2<CartState, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ BaseCartRefreshEventConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseCartRefreshEventConfigurator$onCreate$3(BaseCartRefreshEventConfigurator baseCartRefreshEventConfigurator, d<? super BaseCartRefreshEventConfigurator$onCreate$3> dVar) {
        super(2, dVar);
        this.this$0 = baseCartRefreshEventConfigurator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new BaseCartRefreshEventConfigurator$onCreate$3(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CartRefreshReason cartRefreshState;
        CartEventsController cartEventsController;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        if (!this.this$0.getSkipRefreshInObserve() && (cartRefreshState = this.this$0.getCartRefreshState()) != null) {
            cartEventsController = this.this$0.cartEventsController;
            cartEventsController.handleEvent(cartRefreshState);
        }
        this.this$0.setSkipRefreshInObserve(false);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CartState cartState, d<? super Unit> dVar) {
        return ((BaseCartRefreshEventConfigurator$onCreate$3) create(cartState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
