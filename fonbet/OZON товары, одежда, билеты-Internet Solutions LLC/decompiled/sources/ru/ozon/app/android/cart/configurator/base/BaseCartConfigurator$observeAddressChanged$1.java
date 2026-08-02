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

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cart.configurator.base.BaseCartConfigurator$observeAddressChanged$1", f = "BaseCartConfigurator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class BaseCartConfigurator$observeAddressChanged$1 extends j implements Function2<String, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ BaseCartConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseCartConfigurator$observeAddressChanged$1(BaseCartConfigurator baseCartConfigurator, d<? super BaseCartConfigurator$observeAddressChanged$1> dVar) {
        super(2, dVar);
        this.this$0 = baseCartConfigurator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new BaseCartConfigurator$observeAddressChanged$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.getCartEventController().handleEvent(CartRefreshReason.AddressChanged.INSTANCE);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, d<? super Unit> dVar) {
        return ((BaseCartConfigurator$observeAddressChanged$1) create(str, dVar)).invokeSuspend(Unit.f71690a);
    }
}
