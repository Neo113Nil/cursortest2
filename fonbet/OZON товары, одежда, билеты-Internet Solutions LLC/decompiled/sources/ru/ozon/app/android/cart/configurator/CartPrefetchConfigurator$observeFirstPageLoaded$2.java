package ru.ozon.app.android.cart.configurator;

import A00.a;
import L00.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cart.common.data.prefetch.CartPrefetchController;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a$o;", "kotlin.jvm.PlatformType", "eventComplete", "", "invoke", "(LA00/a$o;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class CartPrefetchConfigurator$observeFirstPageLoaded$2 extends AbstractC7737t implements Function1<a.o<?>, Unit> {
    final /* synthetic */ CartPrefetchConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartPrefetchConfigurator$observeFirstPageLoaded$2(CartPrefetchConfigurator cartPrefetchConfigurator) {
        super(1);
        this.this$0 = cartPrefetchConfigurator;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(a.o<?> oVar) {
        invoke2(oVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(a.o<?> oVar) {
        CartPrefetchController cartPrefetchController;
        CartPrefetchController cartPrefetchController2;
        cartPrefetchController = this.this$0.cartPrefetchController;
        cartPrefetchController.clearCache(CartPrefetchController.ClearCacheReason.CART_PREFETCH);
        j g10 = oVar.f().g();
        CartPrefetchConfigurator cartPrefetchConfigurator = this.this$0;
        int b11 = g10.f() == null ? 999 : g10.b();
        String j11 = oVar.f().g().h().j();
        cartPrefetchController2 = cartPrefetchConfigurator.cartPrefetchController;
        cartPrefetchController2.tracePageLoad(oVar.e(), j11, b11);
    }
}
