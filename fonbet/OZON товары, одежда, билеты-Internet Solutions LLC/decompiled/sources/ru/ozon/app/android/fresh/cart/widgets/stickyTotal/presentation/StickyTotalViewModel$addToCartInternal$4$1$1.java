package ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation;

import Ge.f;
import Sc.s;
import Wc.a;
import io.reactivex.AbstractC7094b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.AddToCartParams;
import sc.C9653a;
import vc.m;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.StickyTotalViewModel$addToCartInternal$4$1$1", f = "StickyTotalViewModel.kt", l = {169}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class StickyTotalViewModel$addToCartInternal$4$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AddToCartParams.CartItem $product;
    final /* synthetic */ Map<String, TokenizedTrackingInfo> $trackingInfo;
    final /* synthetic */ long $widgetId;
    int label;
    final /* synthetic */ StickyTotalViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StickyTotalViewModel$addToCartInternal$4$1$1(StickyTotalViewModel stickyTotalViewModel, AddToCartParams.CartItem cartItem, Map<String, TokenizedTrackingInfo> map, long j11, d<? super StickyTotalViewModel$addToCartInternal$4$1$1> dVar) {
        super(2, dVar);
        this.this$0 = stickyTotalViewModel;
        this.$product = cartItem;
        this.$trackingInfo = map;
        this.$widgetId = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new StickyTotalViewModel$addToCartInternal$4$1$1(this.this$0, this.$product, this.$trackingInfo, this.$widgetId, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CartService cartService;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            cartService = this.this$0.cartService;
            AbstractC7094b removeProductFromCart$default = CartService.DefaultImpls.removeProductFromCart$default(cartService, this.$product.getId(), 0, this.$product.getSelectedDeliverySchema(), this.$trackingInfo, new Long(this.$widgetId), null, null, 96, null);
            removeProductFromCart$default.getClass();
            m mVar = new m(removeProductFromCart$default, C9653a.c());
            Intrinsics.checkNotNullExpressionValue(mVar, "onErrorComplete(...)");
            this.label = 1;
            if (f.a(mVar, this) == aVar) {
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
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((StickyTotalViewModel$addToCartInternal$4$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
