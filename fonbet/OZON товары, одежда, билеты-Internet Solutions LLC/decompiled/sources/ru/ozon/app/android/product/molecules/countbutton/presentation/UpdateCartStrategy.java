package ru.ozon.app.android.product.molecules.countbutton.presentation;

import Ge.f;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.product.molecules.countbutton.presentation.CountButtonVO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\t\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0004\b\t\u0010\fJ*\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0084@¢\u0006\u0004\b\u000e\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/product/molecules/countbutton/presentation/UpdateCartStrategy;", "", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;)V", "", "sku", "Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonVO$UpdateCart;", "updateCart", "widgetId", "", "(JLru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonVO$UpdateCart;Ljava/lang/Long;Lkotlin/coroutines/d;)Ljava/lang/Object;", "updateCartParams", "increment", "Lru/ozon/app/android/cart/common/domain/CartService;", "getCartService", "()Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/app/android/product/molecules/countbutton/presentation/IncrementDecrementStrategy;", "Lru/ozon/app/android/product/molecules/countbutton/presentation/IncrementStrategy;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class UpdateCartStrategy {

    @NotNull
    private final CartService cartService;

    public /* synthetic */ UpdateCartStrategy(CartService cartService, DefaultConstructorMarker defaultConstructorMarker) {
        this(cartService);
    }

    @NotNull
    protected final CartService getCartService() {
        return this.cartService;
    }

    protected final Object increment(long j11, @NotNull CountButtonVO.UpdateCart updateCart, Long l11, @NotNull d<? super Unit> dVar) {
        int productInCartCount$default = CartService.DefaultImpls.getProductInCartCount$default(this.cartService, j11, null, 2, null);
        Object a11 = f.a(CartService.DefaultImpls.addProductToCart$default(this.cartService, String.valueOf(j11), productInCartCount$default + (productInCartCount$default == 0 ? updateCart.getMinItems() : updateCart.getQuantity()), updateCart.getSelectedDeliverySchema(), updateCart.getTrackingInfo(), l11, productInCartCount$default == 0 ? "" : "plusButtonClick", null, null, null, updateCart.getExtendMap(), 448, null), dVar);
        return a11 == a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }

    public abstract Object updateCart(long j11, @NotNull CountButtonVO.UpdateCart updateCart, Long l11, @NotNull d<? super Unit> dVar);

    private UpdateCartStrategy(CartService cartService) {
        this.cartService = cartService;
    }
}
