package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.domain.wishlist;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEvent;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class WishlistServiceImpl$start$1 extends C7719a implements Function2<WishlistEvent, d<? super Unit>, Object> {
    WishlistServiceImpl$start$1(Object obj) {
        super(2, obj, WishlistServiceImpl.class, "onEvent", "onEvent(Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEvent;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WishlistEvent wishlistEvent, d<? super Unit> dVar) {
        Object start$onEvent;
        start$onEvent = WishlistServiceImpl.start$onEvent((WishlistServiceImpl) this.receiver, wishlistEvent, dVar);
        return start$onEvent;
    }
}
