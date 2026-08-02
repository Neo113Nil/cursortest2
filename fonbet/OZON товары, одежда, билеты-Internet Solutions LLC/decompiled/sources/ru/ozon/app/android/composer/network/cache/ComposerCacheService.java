package ru.ozon.app.android.composer.network.cache;

import We.G;
import We.L;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.cache.cacheGroup.CacheGroup;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/composer/network/cache/ComposerCacheService;", "", "LWe/L;", "response", "", "handleSavedToCacheResponse", "(LWe/L;)V", "Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "cacheGroup", "Lru/ozon/app/android/composer/network/cache/util/Url;", "requestUrl", "onCacheHit-7mni29M", "(Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;Ljava/lang/String;LWe/L;)V", "onCacheHit", "LWe/G;", "request", "adaptRequestForCaching", "(LWe/G;)LWe/G;", "", "formatMaxAge", "(LWe/G;LWe/L;)Ljava/lang/Integer;", "Lru/ozon/app/android/composer/network/cache/ClearCacheReason;", "reason", "clearAllCache", "(Lru/ozon/app/android/composer/network/cache/ClearCacheReason;)V", "Lru/ozon/app/android/composer/network/cache/util/PageUrl;", "pageUrl", "clearFor-FyG2aqw", "(Ljava/lang/String;Lru/ozon/app/android/composer/network/cache/ClearCacheReason;)V", "clearFor", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ComposerCacheService {
    @NotNull
    G adaptRequestForCaching(@NotNull G request);

    void clearAllCache(@NotNull ClearCacheReason reason);

    /* renamed from: clearFor-FyG2aqw, reason: not valid java name */
    void mo631clearForFyG2aqw(@NotNull String pageUrl, @NotNull ClearCacheReason reason);

    Integer formatMaxAge(@NotNull G request, @NotNull L response);

    void handleSavedToCacheResponse(@NotNull L response);

    /* renamed from: onCacheHit-7mni29M, reason: not valid java name */
    void mo632onCacheHit7mni29M(CacheGroup cacheGroup, @NotNull String requestUrl, @NotNull L response);
}
