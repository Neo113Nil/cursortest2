package ru.ozon.app.android.product.molecules.countbutton.presentation;

import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.product.molecules.countbutton.presentation.CountButtonVO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\t\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\t\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/product/molecules/countbutton/presentation/IncrementStrategy;", "Lru/ozon/app/android/product/molecules/countbutton/presentation/UpdateCartStrategy;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;)V", "", "sku", "Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonVO$UpdateCart;", "updateCart", "widgetId", "", "(JLru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonVO$UpdateCart;Ljava/lang/Long;Lkotlin/coroutines/d;)Ljava/lang/Object;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class IncrementStrategy extends UpdateCartStrategy {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncrementStrategy(@NotNull CartService cartService) {
        super(cartService, null);
        Intrinsics.checkNotNullParameter(cartService, "cartService");
    }

    @Override // ru.ozon.app.android.product.molecules.countbutton.presentation.UpdateCartStrategy
    public Object updateCart(long j11, @NotNull CountButtonVO.UpdateCart updateCart, Long l11, @NotNull d<? super Unit> dVar) {
        Object increment = increment(j11, updateCart, l11, dVar);
        return increment == a.COROUTINE_SUSPENDED ? increment : Unit.f71690a;
    }
}
