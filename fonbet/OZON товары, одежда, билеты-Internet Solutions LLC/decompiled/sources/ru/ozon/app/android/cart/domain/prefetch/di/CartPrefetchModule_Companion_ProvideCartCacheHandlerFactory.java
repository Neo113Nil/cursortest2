package ru.ozon.app.android.cart.domain.prefetch.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.cart.domain.prefetch.cache.CartCacheHandler;
import ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler;

/* loaded from: classes6.dex */
public final class CartPrefetchModule_Companion_ProvideCartCacheHandlerFactory implements e<CartCacheHandler> {
    public static CartCacheHandler provideCartCacheHandler(Set<ComposerCacheHandler> set) {
        CartCacheHandler provideCartCacheHandler = CartPrefetchModule.INSTANCE.provideCartCacheHandler(set);
        j.d(provideCartCacheHandler);
        return provideCartCacheHandler;
    }
}
