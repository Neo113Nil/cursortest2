package ru.ozon.app.android.cart.domain.prefetch.controller;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cart.common.data.prefetch.CartPrefetchController;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cart.domain.prefetch.controller.CartPrefetchControllerImpl$clearCache$1", f = "CartPrefetchControllerImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CartPrefetchControllerImpl$clearCache$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ CartPrefetchController.ClearCacheReason $reason;
    int label;
    final /* synthetic */ CartPrefetchControllerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartPrefetchControllerImpl$clearCache$1(CartPrefetchControllerImpl cartPrefetchControllerImpl, CartPrefetchController.ClearCacheReason clearCacheReason, d<? super CartPrefetchControllerImpl$clearCache$1> dVar) {
        super(2, dVar);
        this.this$0 = cartPrefetchControllerImpl;
        this.$reason = clearCacheReason;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CartPrefetchControllerImpl$clearCache$1(this.this$0, this.$reason, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.clearCartCache(this.$reason);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CartPrefetchControllerImpl$clearCache$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
