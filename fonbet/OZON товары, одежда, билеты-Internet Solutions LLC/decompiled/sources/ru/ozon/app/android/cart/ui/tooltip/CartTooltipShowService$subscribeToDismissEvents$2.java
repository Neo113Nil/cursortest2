package ru.ozon.app.android.cart.ui.tooltip;

import A00.a;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a$u;", "it", "", "<anonymous>", "(LA00/a$u;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cart.ui.tooltip.CartTooltipShowService$subscribeToDismissEvents$2", f = "CartTooltipShowService.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CartTooltipShowService$subscribeToDismissEvents$2 extends j implements Function2<a.u, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ CartTooltipShowService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartTooltipShowService$subscribeToDismissEvents$2(CartTooltipShowService cartTooltipShowService, d<? super CartTooltipShowService$subscribeToDismissEvents$2> dVar) {
        super(2, dVar);
        this.this$0 = cartTooltipShowService;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CartTooltipShowService$subscribeToDismissEvents$2(this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a.u uVar, d<? super Unit> dVar) {
        return ((CartTooltipShowService$subscribeToDismissEvents$2) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.dismissTooltip();
        return Unit.f71690a;
    }
}
