package ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder;

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
import ru.ozon.app.android.product.utils.AddToCartButtonExtKt;
import ru.ozon.app.android.storefront.data.tiles.addtocart.AddToCartButtonDTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder.Source;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder.AddToCartClickListenerFactory$getOrCreateAddToCartClickListener$1$onPlusButtonClicked$1", f = "SmallTileAddToCartButtonBinder.kt", l = {289}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AddToCartClickListenerFactory$getOrCreateAddToCartClickListener$1$onPlusButtonClicked$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AddToCartButtonDTO $buttonDTO;
    final /* synthetic */ int $currentCount;
    final /* synthetic */ Source $source;
    final /* synthetic */ Map<String, TokenizedTrackingInfo> $trackingInfo;
    final /* synthetic */ AddToCartButtonDTO.QuantityButton.UpdateCartAction $updateCartAction;
    int label;
    final /* synthetic */ AddToCartClickListenerFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddToCartClickListenerFactory$getOrCreateAddToCartClickListener$1$onPlusButtonClicked$1(int i11, AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction, AddToCartClickListenerFactory addToCartClickListenerFactory, Map<String, TokenizedTrackingInfo> map, Source source, AddToCartButtonDTO addToCartButtonDTO, d<? super AddToCartClickListenerFactory$getOrCreateAddToCartClickListener$1$onPlusButtonClicked$1> dVar) {
        super(2, dVar);
        this.$currentCount = i11;
        this.$updateCartAction = updateCartAction;
        this.this$0 = addToCartClickListenerFactory;
        this.$trackingInfo = map;
        this.$source = source;
        this.$buttonDTO = addToCartButtonDTO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AddToCartClickListenerFactory$getOrCreateAddToCartClickListener$1$onPlusButtonClicked$1(this.$currentCount, this.$updateCartAction, this.this$0, this.$trackingInfo, this.$source, this.$buttonDTO, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CartService cartService;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            int quantity = this.$updateCartAction.getQuantity() + this.$currentCount;
            cartService = this.this$0.cartService;
            AbstractC7094b addProductToCart$default = CartService.DefaultImpls.addProductToCart$default(cartService, this.$updateCartAction.getId(), quantity, this.$updateCartAction.getSelectedDeliverySchema(), this.$trackingInfo, ((Source.ComposerWidget) this.$source).getWidgetId(), this.$currentCount == 0 ? "" : "plusButtonClick", null, null, null, AddToCartButtonExtKt.getParams(this.$buttonDTO), 448, null);
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
        return ((AddToCartClickListenerFactory$getOrCreateAddToCartClickListener$1$onPlusButtonClicked$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
