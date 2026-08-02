package ru.ozon.app.android.product.molecules.countbutton.presentation;

import Ge.f;
import Wc.a;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.product.molecules.countbutton.presentation.CountButtonVO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/product/molecules/countbutton/presentation/IncrementDecrementStrategy;", "Lru/ozon/app/android/product/molecules/countbutton/presentation/UpdateCartStrategy;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;)V", "", "sku", "", "quantity", "Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonVO$UpdateCart;", "updateCartParams", "widgetId", "", "decrement", "(JILru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonVO$UpdateCart;Ljava/lang/Long;Lkotlin/coroutines/d;)Ljava/lang/Object;", ProductAction.ACTION_REMOVE, "(JLru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonVO$UpdateCart;Ljava/lang/Long;Lkotlin/coroutines/d;)Ljava/lang/Object;", "updateCart", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class IncrementDecrementStrategy extends UpdateCartStrategy {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncrementDecrementStrategy(@NotNull CartService cartService) {
        super(cartService, null);
        Intrinsics.checkNotNullParameter(cartService, "cartService");
    }

    private final Object decrement(long j11, int i11, CountButtonVO.UpdateCart updateCart, Long l11, d<? super Unit> dVar) {
        Object a11 = f.a(CartService.DefaultImpls.addProductToCart$default(getCartService(), String.valueOf(j11), i11, updateCart.getSelectedDeliverySchema(), updateCart.getTrackingInfo(), l11, "minusButtonClick", null, null, null, null, 960, null), dVar);
        return a11 == a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }

    private final Object remove(long j11, CountButtonVO.UpdateCart updateCart, Long l11, d<? super Unit> dVar) {
        Object a11 = f.a(CartService.DefaultImpls.removeProductFromCart$default(getCartService(), String.valueOf(j11), 0, updateCart.getSelectedDeliverySchema(), updateCart.getTrackingInfo(), l11, null, null, 96, null), dVar);
        return a11 == a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }

    @Override // ru.ozon.app.android.product.molecules.countbutton.presentation.UpdateCartStrategy
    public Object updateCart(long j11, @NotNull CountButtonVO.UpdateCart updateCart, Long l11, @NotNull d<? super Unit> dVar) {
        int productInCartCount$default = CartService.DefaultImpls.getProductInCartCount$default(getCartService(), j11, null, 2, null);
        boolean z11 = productInCartCount$default == 0;
        int quantity = productInCartCount$default - updateCart.getQuantity();
        boolean z12 = quantity >= updateCart.getMinItems();
        if (z11) {
            Object increment = increment(j11, updateCart, l11, dVar);
            return increment == a.COROUTINE_SUSPENDED ? increment : Unit.f71690a;
        }
        if (z12) {
            Object decrement = decrement(j11, quantity, updateCart, l11, dVar);
            return decrement == a.COROUTINE_SUSPENDED ? decrement : Unit.f71690a;
        }
        Object remove = remove(j11, updateCart, l11, dVar);
        return remove == a.COROUTINE_SUSPENDED ? remove : Unit.f71690a;
    }
}
