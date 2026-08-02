package ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cart.common.domain.CartService;
import xe.M;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/AddToCartClickListenerFactory;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SmallTileAddToCartButtonBinder$addToCartClickListenerFactory$2 extends AbstractC7737t implements Function0<AddToCartClickListenerFactory> {
    final /* synthetic */ SmallTileAddToCartButtonBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SmallTileAddToCartButtonBinder$addToCartClickListenerFactory$2(SmallTileAddToCartButtonBinder smallTileAddToCartButtonBinder) {
        super(0);
        this.this$0 = smallTileAddToCartButtonBinder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AddToCartClickListenerFactory invoke() {
        M m11;
        CartService cartService;
        m11 = this.this$0.scope;
        cartService = this.this$0.cartService;
        return new AddToCartClickListenerFactory(m11, cartService);
    }
}
