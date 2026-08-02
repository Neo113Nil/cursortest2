package ru.ozon.app.android.marketing.widgets.ladderActions.presentation;

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
import ru.ozon.app.android.cart.common.domain.CartService;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.marketing.widgets.ladderActions.presentation.LadderActionsViewModel$onButtonClicked$1", f = "LadderActionsViewModel.kt", l = {76}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class LadderActionsViewModel$onButtonClicked$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Long $deliverySchema;
    final /* synthetic */ int $quantity;
    final /* synthetic */ String $skuId;
    final /* synthetic */ Long $widgetId;
    int label;
    final /* synthetic */ LadderActionsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LadderActionsViewModel$onButtonClicked$1(LadderActionsViewModel ladderActionsViewModel, String str, int i11, Long l11, Long l12, d<? super LadderActionsViewModel$onButtonClicked$1> dVar) {
        super(2, dVar);
        this.this$0 = ladderActionsViewModel;
        this.$skuId = str;
        this.$quantity = i11;
        this.$deliverySchema = l11;
        this.$widgetId = l12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new LadderActionsViewModel$onButtonClicked$1(this.this$0, this.$skuId, this.$quantity, this.$deliverySchema, this.$widgetId, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CartService cartService;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            cartService = this.this$0.cartService;
            AbstractC7094b addProductToCart$default = CartService.DefaultImpls.addProductToCart$default(cartService, this.$skuId, this.$quantity, this.$deliverySchema, null, this.$widgetId, null, null, null, null, null, 992, null);
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
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((LadderActionsViewModel$onButtonClicked$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
