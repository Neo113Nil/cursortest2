package ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.cart.common.domain.CartState;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class ProductActionBarDelegate$initCartObserver$1 extends C7719a implements Function2<CartState, d<? super Unit>, Object> {
    ProductActionBarDelegate$initCartObserver$1(Object obj) {
        super(2, obj, ProductActionBarDelegate.class, "onCartUpdate", "onCartUpdate(Lru/ozon/app/android/cart/common/domain/CartState;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CartState cartState, d<? super Unit> dVar) {
        Object initCartObserver$onCartUpdate;
        initCartObserver$onCartUpdate = ProductActionBarDelegate.initCartObserver$onCartUpdate((ProductActionBarDelegate) this.receiver, cartState, dVar);
        return initCartObserver$onCartUpdate;
    }
}
