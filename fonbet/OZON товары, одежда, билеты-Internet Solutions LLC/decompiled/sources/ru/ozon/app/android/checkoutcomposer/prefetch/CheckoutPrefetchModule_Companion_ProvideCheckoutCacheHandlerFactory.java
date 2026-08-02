package ru.ozon.app.android.checkoutcomposer.prefetch;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler;

/* loaded from: classes6.dex */
public final class CheckoutPrefetchModule_Companion_ProvideCheckoutCacheHandlerFactory implements e<CheckoutCacheHandler> {
    public static CheckoutCacheHandler provideCheckoutCacheHandler(Set<ComposerCacheHandler> set) {
        CheckoutCacheHandler provideCheckoutCacheHandler = CheckoutPrefetchModule.INSTANCE.provideCheckoutCacheHandler(set);
        j.d(provideCheckoutCacheHandler);
        return provideCheckoutCacheHandler;
    }
}
