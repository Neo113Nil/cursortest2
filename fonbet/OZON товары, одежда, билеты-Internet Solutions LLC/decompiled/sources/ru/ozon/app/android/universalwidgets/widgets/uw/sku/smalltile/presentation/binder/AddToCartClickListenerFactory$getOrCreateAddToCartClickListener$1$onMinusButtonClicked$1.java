package ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder;

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
import ru.ozon.app.android.storefront.data.tiles.addtocart.AddToCartButtonDTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder.Source;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder.AddToCartClickListenerFactory$getOrCreateAddToCartClickListener$1$onMinusButtonClicked$1", f = "SmallTileAddToCartButtonBinder.kt", l = {309, 319}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AddToCartClickListenerFactory$getOrCreateAddToCartClickListener$1$onMinusButtonClicked$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AddToCartButtonDTO $buttonDTO;
    final /* synthetic */ int $currentCount;
    final /* synthetic */ Source $source;
    final /* synthetic */ Map<String, TokenizedTrackingInfo> $trackingInfo;
    final /* synthetic */ AddToCartButtonDTO.QuantityButton.UpdateCartAction $updateCartAction;
    int label;
    final /* synthetic */ AddToCartClickListenerFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddToCartClickListenerFactory$getOrCreateAddToCartClickListener$1$onMinusButtonClicked$1(AddToCartButtonDTO addToCartButtonDTO, int i11, AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction, AddToCartClickListenerFactory addToCartClickListenerFactory, Map<String, TokenizedTrackingInfo> map, Source source, d<? super AddToCartClickListenerFactory$getOrCreateAddToCartClickListener$1$onMinusButtonClicked$1> dVar) {
        super(2, dVar);
        this.$buttonDTO = addToCartButtonDTO;
        this.$currentCount = i11;
        this.$updateCartAction = updateCartAction;
        this.this$0 = addToCartClickListenerFactory;
        this.$trackingInfo = map;
        this.$source = source;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AddToCartClickListenerFactory$getOrCreateAddToCartClickListener$1$onMinusButtonClicked$1(this.$buttonDTO, this.$currentCount, this.$updateCartAction, this.this$0, this.$trackingInfo, this.$source, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        if (Ge.f.a(r2, r19) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00aa, code lost:
    
        if (Ge.f.a(r2, r19) == r1) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CartService cartService;
        CartService cartService2;
        Integer minItems;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            if (this.$buttonDTO.getQuantityButton() == null) {
                return Unit.f71690a;
            }
            int quantity = this.$currentCount - this.$updateCartAction.getQuantity();
            AddToCartButtonDTO.QuantityButton quantityButton = this.$buttonDTO.getQuantityButton();
            if (quantity >= ((quantityButton == null || (minItems = quantityButton.getMinItems()) == null) ? 1 : minItems.intValue())) {
                cartService2 = this.this$0.cartService;
                AbstractC7094b addProductToCart$default = CartService.DefaultImpls.addProductToCart$default(cartService2, this.$updateCartAction.getId(), quantity, this.$updateCartAction.getSelectedDeliverySchema(), this.$trackingInfo, ((Source.ComposerWidget) this.$source).getWidgetId(), "minusButtonClick", null, null, null, null, 960, null);
                this.label = 1;
            } else {
                cartService = this.this$0.cartService;
                AbstractC7094b removeProductFromCart$default = CartService.DefaultImpls.removeProductFromCart$default(cartService, this.$updateCartAction.getId(), 0, this.$updateCartAction.getSelectedDeliverySchema(), this.$trackingInfo, ((Source.ComposerWidget) this.$source).getWidgetId(), null, null, 96, null);
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
        return ((AddToCartClickListenerFactory$getOrCreateAddToCartClickListener$1$onMinusButtonClicked$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
