package ru.ozon.app.android.composer.network.cache.di.cacheHandler;

import hi.InterfaceC6958a;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00060\u0001j\u0002`\u0002R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lru/ozon/app/android/composer/network/cache/di/cacheHandler/CacheHandlerRegistrationComponentApi;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "", "Lru/ozon/app/android/composer/network/cache/cacheHandler/ComposerCacheHandler;", "getCacheHandlers", "()Ljava/util/Set;", "cacheHandlers", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CacheHandlerRegistrationComponentApi extends InterfaceC6958a {
    @NotNull
    Set<ComposerCacheHandler> getCacheHandlers();
}
