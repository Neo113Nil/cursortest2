package ru.ozon.app.android.fresh.cart.domain.actionHandlers;

import Sc.r;
import Sc.s;
import Vg.f;
import Wc.a;
import io.reactivex.AbstractC7094b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cart.common.domain.CartService;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.cart.domain.actionHandlers.FreshAddToCartActionHandler$processWidgetAction$1", f = "FreshAddToCartActionHandler.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FreshAddToCartActionHandler$processWidgetAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $productId;
    final /* synthetic */ int $quantity;
    final /* synthetic */ Long $selectedDeliverySchema;
    final /* synthetic */ f.a $widgetInfo;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FreshAddToCartActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FreshAddToCartActionHandler$processWidgetAction$1(FreshAddToCartActionHandler freshAddToCartActionHandler, String str, int i11, Long l11, f.a aVar, d<? super FreshAddToCartActionHandler$processWidgetAction$1> dVar) {
        super(2, dVar);
        this.this$0 = freshAddToCartActionHandler;
        this.$productId = str;
        this.$quantity = i11;
        this.$selectedDeliverySchema = l11;
        this.$widgetInfo = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        FreshAddToCartActionHandler$processWidgetAction$1 freshAddToCartActionHandler$processWidgetAction$1 = new FreshAddToCartActionHandler$processWidgetAction$1(this.this$0, this.$productId, this.$quantity, this.$selectedDeliverySchema, this.$widgetInfo, dVar);
        freshAddToCartActionHandler$processWidgetAction$1.L$0 = obj;
        return freshAddToCartActionHandler$processWidgetAction$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        CartService cartService;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                FreshAddToCartActionHandler freshAddToCartActionHandler = this.this$0;
                String str = this.$productId;
                int i12 = this.$quantity;
                Long l11 = this.$selectedDeliverySchema;
                f.a aVar2 = this.$widgetInfo;
                r.Companion companion = r.INSTANCE;
                cartService = freshAddToCartActionHandler.cartService;
                AbstractC7094b addProductToCart$default = CartService.DefaultImpls.addProductToCart$default(cartService, str, i12, l11, null, new Long(aVar2.c().f()), null, null, null, null, null, 992, null);
                this.label = 1;
                if (Ge.f.a(addProductToCart$default, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            a11 = Unit.f71690a;
            r.Companion companion2 = r.INSTANCE;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            a11 = s.a(th2);
        }
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            Lm0.a.f17149a.e(b11);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FreshAddToCartActionHandler$processWidgetAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
