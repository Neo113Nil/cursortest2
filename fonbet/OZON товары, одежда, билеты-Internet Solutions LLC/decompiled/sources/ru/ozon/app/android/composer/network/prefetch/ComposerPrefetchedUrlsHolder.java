package ru.ozon.app.android.composer.network.prefetch;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.cache.cacheGroup.CacheGroup;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\rJ\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J,\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/composer/network/prefetch/ComposerPrefetchedUrlsHolder;", "", "get", "Lru/ozon/app/android/composer/network/prefetch/ComposerPrefetchedUrlsHolder$PrefetchedUrl;", ImagesContract.URL, "", "upsert", "", "cacheGroup", "Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "maxAgeSeconds", "", "redirectUrl", "PrefetchedUrl", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ComposerPrefetchedUrlsHolder {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/composer/network/prefetch/ComposerPrefetchedUrlsHolder$PrefetchedUrl;", "", "Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "cacheGroup", "", "redirectUrl", "Lnc/b;", "clearExpiredCacheDisposable", "<init>", "(Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;Ljava/lang/String;Lnc/b;)V", "Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "getCacheGroup", "()Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "Ljava/lang/String;", "getRedirectUrl", "()Ljava/lang/String;", "Lnc/b;", "getClearExpiredCacheDisposable", "()Lnc/b;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PrefetchedUrl {

        @NotNull
        private final CacheGroup cacheGroup;

        @NotNull
        private final InterfaceC8487b clearExpiredCacheDisposable;
        private final String redirectUrl;

        public PrefetchedUrl(@NotNull CacheGroup cacheGroup, String str, @NotNull InterfaceC8487b clearExpiredCacheDisposable) {
            Intrinsics.checkNotNullParameter(cacheGroup, "cacheGroup");
            Intrinsics.checkNotNullParameter(clearExpiredCacheDisposable, "clearExpiredCacheDisposable");
            this.cacheGroup = cacheGroup;
            this.redirectUrl = str;
            this.clearExpiredCacheDisposable = clearExpiredCacheDisposable;
        }

        @NotNull
        public final CacheGroup getCacheGroup() {
            return this.cacheGroup;
        }

        @NotNull
        public final InterfaceC8487b getClearExpiredCacheDisposable() {
            return this.clearExpiredCacheDisposable;
        }

        public final String getRedirectUrl() {
            return this.redirectUrl;
        }
    }

    PrefetchedUrl get(@NotNull String url);

    void upsert(@NotNull String url, CacheGroup cacheGroup, long maxAgeSeconds, String redirectUrl);
}
