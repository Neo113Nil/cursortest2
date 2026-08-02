package ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.presentation;

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
import ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.data.AddToCartButtonDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.presentation.AddToCartButtonBinder$setOnClickListener$1$onMinusButtonClicked$1", f = "AddToCartButtonBinder.kt", l = {225, 235}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AddToCartButtonBinder$setOnClickListener$1$onMinusButtonClicked$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AddToCartButtonDTO $buttonDTO;
    final /* synthetic */ int $currentCount;
    final /* synthetic */ Map<String, TokenizedTrackingInfo> $trackingInfo;
    final /* synthetic */ AddToCartButtonDTO.QuantityButton.UpdateCartAction $updateCartAction;
    final /* synthetic */ Long $widgetId;
    int label;
    final /* synthetic */ AddToCartButtonBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddToCartButtonBinder$setOnClickListener$1$onMinusButtonClicked$1(AddToCartButtonDTO addToCartButtonDTO, int i11, AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction, AddToCartButtonBinder addToCartButtonBinder, Map<String, TokenizedTrackingInfo> map, Long l11, d<? super AddToCartButtonBinder$setOnClickListener$1$onMinusButtonClicked$1> dVar) {
        super(2, dVar);
        this.$buttonDTO = addToCartButtonDTO;
        this.$currentCount = i11;
        this.$updateCartAction = updateCartAction;
        this.this$0 = addToCartButtonBinder;
        this.$trackingInfo = map;
        this.$widgetId = l11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AddToCartButtonBinder$setOnClickListener$1$onMinusButtonClicked$1(this.$buttonDTO, this.$currentCount, this.$updateCartAction, this.this$0, this.$trackingInfo, this.$widgetId, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        if (Ge.f.a(r2, r20) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a9, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
    
        if (Ge.f.a(r2, r20) == r1) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CartService cartService;
        CartService cartService2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            if (this.$buttonDTO.getQuantityButton() == null) {
                return Unit.f71690a;
            }
            Integer quantSize = this.$buttonDTO.getQuantityButton().getQuantSize();
            int minusCount = QuantityChangeExtensionsKt.minusCount(this.$currentCount, this.$updateCartAction, quantSize);
            Integer minItems = this.$buttonDTO.getQuantityButton().getMinItems();
            if (minusCount >= (minItems != null ? minItems.intValue() : 1) || quantSize != null) {
                cartService = this.this$0.cartService;
                AbstractC7094b addProductToCart$default = CartService.DefaultImpls.addProductToCart$default(cartService, this.$updateCartAction.getId(), minusCount, this.$updateCartAction.getSelectedDeliverySchema(), this.$trackingInfo, this.$widgetId, "minusButtonClick", null, null, null, null, 960, null);
                this.label = 1;
            } else {
                cartService2 = this.this$0.cartService;
                AbstractC7094b removeProductFromCart$default = CartService.DefaultImpls.removeProductFromCart$default(cartService2, this.$updateCartAction.getId(), 0, this.$updateCartAction.getSelectedDeliverySchema(), this.$trackingInfo, this.$widgetId, null, null, 96, null);
                this.label = 2;
            }
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AddToCartButtonBinder$setOnClickListener$1$onMinusButtonClicked$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
