package ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.pdp;

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
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.domain.CartService;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.pdp.StickyTotalPDPViewModel$addToCart$1", f = "StickyTotalPDPViewModel.kt", l = {88}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class StickyTotalPDPViewModel$addToCart$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionId;
    final /* synthetic */ Long $deliverySchema;
    final /* synthetic */ int $desiredQuantity;
    final /* synthetic */ String $sku;
    final /* synthetic */ Map<String, TokenizedTrackingInfo> $trackingInfo;
    final /* synthetic */ long $widgetId;
    int label;
    final /* synthetic */ StickyTotalPDPViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StickyTotalPDPViewModel$addToCart$1(StickyTotalPDPViewModel stickyTotalPDPViewModel, long j11, String str, int i11, Map<String, TokenizedTrackingInfo> map, String str2, Long l11, d<? super StickyTotalPDPViewModel$addToCart$1> dVar) {
        super(2, dVar);
        this.this$0 = stickyTotalPDPViewModel;
        this.$widgetId = j11;
        this.$actionId = str;
        this.$desiredQuantity = i11;
        this.$trackingInfo = map;
        this.$sku = str2;
        this.$deliverySchema = l11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new StickyTotalPDPViewModel$addToCart$1(this.this$0, this.$widgetId, this.$actionId, this.$desiredQuantity, this.$trackingInfo, this.$sku, this.$deliverySchema, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CartService cartService;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                this.this$0.sendImmediateAnalytics(this.$widgetId, this.$actionId, this.$desiredQuantity, this.$trackingInfo);
                cartService = this.this$0.cartService;
                AbstractC7094b addProductToCart$default = CartService.DefaultImpls.addProductToCart$default(cartService, this.$sku, this.$desiredQuantity, this.$deliverySchema, null, new Long(this.$widgetId), this.$actionId, null, null, null, null, 960, null);
                this.label = 1;
                if (f.a(addProductToCart$default, this) == aVar) {
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
        return ((StickyTotalPDPViewModel$addToCart$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
