package ru.ozon.app.android.common.cache.handler.search;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.cache.ComposerCacheCleaner;
import ru.ozon.app.android.composer.network.cache.cacheGroup.CacheGroup;
import ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandlerDefaultImpl;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/common/cache/handler/search/SearchCacheHandler;", "Lru/ozon/app/android/composer/network/cache/cacheHandler/ComposerCacheHandlerDefaultImpl;", "composerCacheCleaner", "Lru/ozon/app/android/composer/network/cache/ComposerCacheCleaner;", "<init>", "(Lru/ozon/app/android/composer/network/cache/ComposerCacheCleaner;)V", "cacheGroup", "Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "getCacheGroup", "()Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "prefetch_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SearchCacheHandler extends ComposerCacheHandlerDefaultImpl {

    @NotNull
    private final CacheGroup cacheGroup;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchCacheHandler(@NotNull ComposerCacheCleaner composerCacheCleaner) {
        super(composerCacheCleaner);
        Intrinsics.checkNotNullParameter(composerCacheCleaner, "composerCacheCleaner");
        this.cacheGroup = SearchCacheGroup.INSTANCE;
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    @NotNull
    public CacheGroup getCacheGroup() {
        return this.cacheGroup;
    }
}
