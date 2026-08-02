package ru.ozon.app.android.checkoutcomposer.prefetch;

import We.L;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.flags.CheckoutPrefetchWithJoinEnabled;
import ru.ozon.app.android.composer.network.cache.ClearCacheReason;
import ru.ozon.app.android.composer.network.cache.ComposerCacheCleaner;
import ru.ozon.app.android.composer.network.cache.cacheGroup.CacheGroup;
import ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandlerDefaultImpl;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u001a\u0010\"\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/prefetch/CheckoutCacheHandler;", "Lru/ozon/app/android/composer/network/cache/cacheHandler/ComposerCacheHandlerDefaultImpl;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/composer/network/cache/ComposerCacheCleaner;", "composerCacheCleaner", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/composer/network/cache/ComposerCacheCleaner;)V", "Lru/ozon/app/android/composer/network/cache/util/Url;", ImagesContract.URL, "", "isPrefetch", "", "responseMaxAge", "LWe/L;", "response", "formatMaxAgeForCaching-pM1TDTc", "(Ljava/lang/String;ZLjava/lang/Integer;LWe/L;)Ljava/lang/Integer;", "formatMaxAgeForCaching", "Lru/ozon/app/android/composer/network/cache/ClearCacheReason;", "reason", "shouldClearAllCache", "(Lru/ozon/app/android/composer/network/cache/ClearCacheReason;)Z", "shouldJoinRequest-VgcI5v0", "(Ljava/lang/String;)Z", "shouldJoinRequest", "Lru/ozon/app/android/composer/network/cache/util/AdaptedPageUrl;", "pageUrl", "", "removeCacheForGroup-AD7EpEU", "(Ljava/lang/String;Lru/ozon/app/android/composer/network/cache/ClearCacheReason;)V", "removeCacheForGroup", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "cacheGroup", "Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "getCacheGroup", "()Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CheckoutCacheHandler extends ComposerCacheHandlerDefaultImpl {

    @NotNull
    private final CacheGroup cacheGroup;

    @NotNull
    private final FeatureChecker featureChecker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutCacheHandler(@NotNull FeatureChecker featureChecker, @NotNull ComposerCacheCleaner composerCacheCleaner) {
        super(composerCacheCleaner);
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(composerCacheCleaner, "composerCacheCleaner");
        this.featureChecker = featureChecker;
        this.cacheGroup = CheckoutCacheGroup.INSTANCE;
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandlerDefaultImpl, ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    /* renamed from: formatMaxAgeForCaching-pM1TDTc */
    public Integer mo522formatMaxAgeForCachingpM1TDTc(@NotNull String url, boolean isPrefetch, Integer responseMaxAge, @NotNull L response) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(response, "response");
        if (isPrefetch && responseMaxAge == null) {
            removeAllCacheForGroup(ClearCacheReason.CHECKOUT_MISSING_RESPONSE_MAX_AGE);
        }
        return responseMaxAge;
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    @NotNull
    public CacheGroup getCacheGroup() {
        return this.cacheGroup;
    }

    /* renamed from: removeCacheForGroup-AD7EpEU, reason: not valid java name */
    public final void m570removeCacheForGroupAD7EpEU(@NotNull String pageUrl, @NotNull ClearCacheReason reason) {
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (h.K(pageUrl)) {
            removeAllCacheForGroup(reason);
        } else {
            m639removeCacheForAD7EpEU(pageUrl, reason);
        }
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
        return this.featureChecker.isEnabled(CheckoutPrefetchWithJoinEnabled.INSTANCE);
    }
}
