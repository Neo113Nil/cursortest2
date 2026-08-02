package ru.ozon.app.android.fresh.common.widgets.molecules.freshTile;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.cart.common.domain.CartState;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class FreshTileViewModel$initCartObserver$1 extends C7719a implements Function2<CartState, d<? super Unit>, Object> {
    FreshTileViewModel$initCartObserver$1(Object obj) {
        super(2, obj, FreshTileViewModel.class, "onCartUpdate", "onCartUpdate(Lru/ozon/app/android/cart/common/domain/CartState;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CartState cartState, d<? super Unit> dVar) {
        Object initCartObserver$onCartUpdate;
        initCartObserver$onCartUpdate = FreshTileViewModel.initCartObserver$onCartUpdate((FreshTileViewModel) this.receiver, cartState, dVar);
        return initCartObserver$onCartUpdate;
    }
}
