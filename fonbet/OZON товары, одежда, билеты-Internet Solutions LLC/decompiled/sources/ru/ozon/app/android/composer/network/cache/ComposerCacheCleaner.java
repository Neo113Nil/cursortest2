package ru.ozon.app.android.composer.network.cache;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.cache.cacheGroup.CacheGroup;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0019\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/composer/network/cache/ComposerCacheCleaner;", "", "clearFor", "", "pageUrl", "Lru/ozon/app/android/composer/network/cache/util/AdaptedPageUrl;", "reason", "Lru/ozon/app/android/composer/network/cache/ClearCacheReason;", "clearFor-AD7EpEU", "(Ljava/lang/String;Lru/ozon/app/android/composer/network/cache/ClearCacheReason;)V", "cacheGroup", "Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "removeFromClearHistory", "adaptedUrl", "Lru/ozon/app/android/composer/network/cache/util/AdaptedUrl;", "removeFromClearHistory-s7RZ03s", "(Ljava/lang/String;)Lru/ozon/app/android/composer/network/cache/ClearCacheReason;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ComposerCacheCleaner {
    void clearFor(@NotNull CacheGroup cacheGroup, @NotNull ClearCacheReason reason);

    /* renamed from: clearFor-AD7EpEU, reason: not valid java name */
    void mo629clearForAD7EpEU(@NotNull String pageUrl, @NotNull ClearCacheReason reason);

    /* renamed from: removeFromClearHistory-s7RZ03s, reason: not valid java name */
    ClearCacheReason mo630removeFromClearHistorys7RZ03s(@NotNull String adaptedUrl);
}
