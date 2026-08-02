package ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder;

import Sc.s;
import Wc.a;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonView;
import ru.ozon.app.android.product.common.TileThemeConfigVO;
import ru.ozon.app.android.storefront.data.tiles.addtocart.AddToCartButtonDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "cartState", "Lru/ozon/app/android/cart/common/domain/CartState;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder.SmallTileAddToCartButtonBinder$subscribe$1", f = "SmallTileAddToCartButtonBinder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SmallTileAddToCartButtonBinder$subscribe$1 extends j implements Function2<CartState, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SmallTileAddToCartButtonBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SmallTileAddToCartButtonBinder$subscribe$1(SmallTileAddToCartButtonBinder smallTileAddToCartButtonBinder, d<? super SmallTileAddToCartButtonBinder$subscribe$1> dVar) {
        super(2, dVar);
        this.this$0 = smallTileAddToCartButtonBinder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SmallTileAddToCartButtonBinder$subscribe$1 smallTileAddToCartButtonBinder$subscribe$1 = new SmallTileAddToCartButtonBinder$subscribe$1(this.this$0, dVar);
        smallTileAddToCartButtonBinder$subscribe$1.L$0 = obj;
        return smallTileAddToCartButtonBinder$subscribe$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Long skuId;
        WeakReference weakReference;
        AddToCartButtonDTO addToCartButtonDTO;
        Source source;
        TileThemeConfigVO.AddToCartButtonConfigVO addToCartButtonConfigVO;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        CartState cartState = (CartState) this.L$0;
        skuId = this.this$0.getSkuId();
        CartItemInfo cartItemInfo = skuId != null ? cartState.getItems().get(new Long(skuId.longValue())) : null;
        SmallTileAddToCartButtonBinder smallTileAddToCartButtonBinder = this.this$0;
        weakReference = smallTileAddToCartButtonBinder.button;
        AddToCartButtonView addToCartButtonView = weakReference != null ? (AddToCartButtonView) weakReference.get() : null;
        addToCartButtonDTO = this.this$0.buttonDTO;
        source = this.this$0.source;
        addToCartButtonConfigVO = this.this$0.config;
        smallTileAddToCartButtonBinder.bindButton(addToCartButtonView, addToCartButtonDTO, cartItemInfo, source, addToCartButtonConfigVO);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CartState cartState, d<? super Unit> dVar) {
        return ((SmallTileAddToCartButtonBinder$subscribe$1) create(cartState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
