package ru.ozon.app.android.composer.network.cache.interceptor;

import We.B;
import We.G;
import We.L;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.cache.ComposerCacheService;
import ru.ozon.app.android.composer.network.cache.cacheGroup.CacheGroup;
import ru.ozon.app.android.composer.network.cache.util.Url;
import ru.ozon.app.android.composer.network.prefetch.ComposerPrefetchedUrlsHolder;
import ru.ozon.app.android.network.interceptors.BXInterceptor;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/composer/network/cache/interceptor/NotifyCacheHitInterceptor;", "Lru/ozon/app/android/network/interceptors/BXInterceptor;", "Lru/ozon/app/android/composer/network/cache/ComposerCacheService;", "composerCacheService", "Lru/ozon/app/android/composer/network/prefetch/ComposerPrefetchedUrlsHolder;", "prefetchedUrlsHolder", "<init>", "(Lru/ozon/app/android/composer/network/cache/ComposerCacheService;Lru/ozon/app/android/composer/network/prefetch/ComposerPrefetchedUrlsHolder;)V", "LWe/B$a;", "chain", "LWe/L;", "onIntercept", "(LWe/B$a;)LWe/L;", "Lru/ozon/app/android/composer/network/cache/ComposerCacheService;", "Lru/ozon/app/android/composer/network/prefetch/ComposerPrefetchedUrlsHolder;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NotifyCacheHitInterceptor extends BXInterceptor {

    @NotNull
    private final ComposerCacheService composerCacheService;

    @NotNull
    private final ComposerPrefetchedUrlsHolder prefetchedUrlsHolder;

    public NotifyCacheHitInterceptor(@NotNull ComposerCacheService composerCacheService, @NotNull ComposerPrefetchedUrlsHolder prefetchedUrlsHolder) {
        Intrinsics.checkNotNullParameter(composerCacheService, "composerCacheService");
        Intrinsics.checkNotNullParameter(prefetchedUrlsHolder, "prefetchedUrlsHolder");
        this.composerCacheService = composerCacheService;
        this.prefetchedUrlsHolder = prefetchedUrlsHolder;
    }

    @Override // ru.ozon.app.android.network.interceptors.BXInterceptor
    @NotNull
    protected L onIntercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        G request = chain.request();
        String a11 = request.j().toString();
        ComposerPrefetchedUrlsHolder.PrefetchedUrl prefetchedUrl = this.prefetchedUrlsHolder.get(a11);
        CacheGroup cacheGroup = prefetchedUrl != null ? prefetchedUrl.getCacheGroup() : null;
        L proceed = chain.proceed(request);
        if (proceed.x() == null) {
            this.composerCacheService.mo632onCacheHit7mni29M(cacheGroup, Url.m665constructorimpl(a11), proceed);
        }
        return proceed;
    }
}
