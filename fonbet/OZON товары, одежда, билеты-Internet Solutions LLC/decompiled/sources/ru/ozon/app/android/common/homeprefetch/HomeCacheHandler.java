package ru.ozon.app.android.common.homeprefetch;

import We.L;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.cache.ClearCacheReason;
import ru.ozon.app.android.composer.network.cache.ComposerCacheCleaner;
import ru.ozon.app.android.composer.network.cache.cacheGroup.CacheGroup;
import ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandlerDefaultImpl;
import ru.ozon.app.android.composer.network.util.StringsKt;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.homeprefetch.HomePrefetchFlag;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0017\u001a\u0004\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u001a\u0010!\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/common/homeprefetch/HomeCacheHandler;", "Lru/ozon/app/android/composer/network/cache/cacheHandler/ComposerCacheHandlerDefaultImpl;", "Lru/ozon/app/android/composer/network/cache/ComposerCacheCleaner;", "composerCacheCleaner", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/composer/network/cache/ComposerCacheCleaner;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Lru/ozon/app/android/composer/network/cache/util/Url;", ImagesContract.URL, "Lru/ozon/app/android/composer/network/cache/util/PageUrl;", "pageUrl", "", "canHandle-46iOEHo", "(Ljava/lang/String;Ljava/lang/String;)Z", "canHandle", "isPrefetch", "", "responseMaxAge", "LWe/L;", "response", "formatMaxAgeForCaching-pM1TDTc", "(Ljava/lang/String;ZLjava/lang/Integer;LWe/L;)Ljava/lang/Integer;", "formatMaxAgeForCaching", "Lru/ozon/app/android/composer/network/cache/ClearCacheReason;", "reason", "shouldClearAllCache", "(Lru/ozon/app/android/composer/network/cache/ClearCacheReason;)Z", "shouldJoinRequest-VgcI5v0", "(Ljava/lang/String;)Z", "shouldJoinRequest", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "cacheGroup", "Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "getCacheGroup", "()Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "Companion", "prefetch_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HomeCacheHandler extends ComposerCacheHandlerDefaultImpl {

    @NotNull
    private final CacheGroup cacheGroup;

    @NotNull
    private final FeatureChecker featureChecker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeCacheHandler(@NotNull ComposerCacheCleaner composerCacheCleaner, @NotNull FeatureChecker featureChecker) {
        super(composerCacheCleaner);
        Intrinsics.checkNotNullParameter(composerCacheCleaner, "composerCacheCleaner");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.featureChecker = featureChecker;
        this.cacheGroup = HomeCacheGroup.INSTANCE;
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandlerDefaultImpl, ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    /* renamed from: canHandle-46iOEHo */
    public boolean mo521canHandle46iOEHo(@NotNull String url, String pageUrl) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (pageUrl == null) {
            return super.mo521canHandle46iOEHo(url, null);
        }
        if (this.featureChecker.isEnabled(HomePrefetchFlag.INSTANCE)) {
            return pageUrl.equals("/home");
        }
        return false;
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandlerDefaultImpl, ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    /* renamed from: formatMaxAgeForCaching-pM1TDTc */
    public Integer mo522formatMaxAgeForCachingpM1TDTc(@NotNull String url, boolean isPrefetch, Integer responseMaxAge, @NotNull L response) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(response, "response");
        boolean isEnabled = this.featureChecker.isEnabled(HomePrefetchFlag.INSTANCE);
        if (isPrefetch && isEnabled && Intrinsics.d(StringsKt.pageUrl(url), "/home")) {
            return 10;
        }
        return responseMaxAge;
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    @NotNull
    public CacheGroup getCacheGroup() {
        return this.cacheGroup;
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandlerDefaultImpl, ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    public boolean shouldClearAllCache(@NotNull ClearCacheReason reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        return reason != ClearCacheReason.CART_STATE_CHANGED;
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandlerDefaultImpl, ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    /* renamed from: shouldJoinRequest-VgcI5v0 */
    public boolean mo526shouldJoinRequestVgcI5v0(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return true;
    }
}
