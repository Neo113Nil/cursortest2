package ru.ozon.app.android.common.cache.handler.suggest;

import We.L;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.cache.SearchAdapterRequestForCachingDelegate;
import ru.ozon.app.android.composer.network.cache.ClearCacheReason;
import ru.ozon.app.android.composer.network.cache.ComposerCacheCleaner;
import ru.ozon.app.android.composer.network.cache.cacheGroup.CacheGroup;
import ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandlerDefaultImpl;
import ru.ozon.app.android.composer.network.cache.flags.AdaptUrlInterceptorsBeforeCacheFlag;
import ru.ozon.app.android.composer.network.cache.util.AdaptedUrl;
import ru.ozon.app.android.composer.network.prefetch.ComposerRunningPrefetchedRequestUrlsHolder;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020#8\u0016X\u0096D¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020#8\u0016X\u0096D¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'¨\u0006*"}, d2 = {"Lru/ozon/app/android/common/cache/handler/suggest/SuggestResultCacheHandler;", "Lru/ozon/app/android/composer/network/cache/cacheHandler/ComposerCacheHandlerDefaultImpl;", "Lru/ozon/app/android/common/cache/SearchAdapterRequestForCachingDelegate;", "adaptRequestForCachingDelegate", "Lru/ozon/app/android/composer/network/cache/ComposerCacheCleaner;", "composerCacheCleaner", "Lru/ozon/app/android/composer/network/prefetch/ComposerRunningPrefetchedRequestUrlsHolder;", "runningPrefetchedRequestUrlsHolder", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/common/cache/SearchAdapterRequestForCachingDelegate;Lru/ozon/app/android/composer/network/cache/ComposerCacheCleaner;Lru/ozon/app/android/composer/network/prefetch/ComposerRunningPrefetchedRequestUrlsHolder;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Lru/ozon/app/android/composer/network/cache/util/Url;", ImagesContract.URL, "Lru/ozon/app/android/composer/network/cache/util/AdaptedUrl;", "adaptRequestForCaching-j-pqkY4", "(Ljava/lang/String;)Ljava/lang/String;", "adaptRequestForCaching", "requestUrl", "LWe/L;", "response", "", "onCacheHit-zMoF2ac", "(Ljava/lang/String;LWe/L;)V", "onCacheHit", "Lru/ozon/app/android/common/cache/SearchAdapterRequestForCachingDelegate;", "getAdaptRequestForCachingDelegate", "()Lru/ozon/app/android/common/cache/SearchAdapterRequestForCachingDelegate;", "Lru/ozon/app/android/composer/network/prefetch/ComposerRunningPrefetchedRequestUrlsHolder;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "cacheGroup", "Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "getCacheGroup", "()Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "", "ignorePrefetchIfAlreadyRunning", "Z", "getIgnorePrefetchIfAlreadyRunning", "()Z", "ignorePrefetchIfHasInCache", "getIgnorePrefetchIfHasInCache", "prefetch_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SuggestResultCacheHandler extends ComposerCacheHandlerDefaultImpl {

    @NotNull
    private final SearchAdapterRequestForCachingDelegate adaptRequestForCachingDelegate;

    @NotNull
    private final CacheGroup cacheGroup;

    @NotNull
    private final FeatureChecker featureChecker;
    private final boolean ignorePrefetchIfAlreadyRunning;
    private final boolean ignorePrefetchIfHasInCache;

    @NotNull
    private final ComposerRunningPrefetchedRequestUrlsHolder runningPrefetchedRequestUrlsHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestResultCacheHandler(@NotNull SearchAdapterRequestForCachingDelegate adaptRequestForCachingDelegate, @NotNull ComposerCacheCleaner composerCacheCleaner, @NotNull ComposerRunningPrefetchedRequestUrlsHolder runningPrefetchedRequestUrlsHolder, @NotNull FeatureChecker featureChecker) {
        super(composerCacheCleaner);
        Intrinsics.checkNotNullParameter(adaptRequestForCachingDelegate, "adaptRequestForCachingDelegate");
        Intrinsics.checkNotNullParameter(composerCacheCleaner, "composerCacheCleaner");
        Intrinsics.checkNotNullParameter(runningPrefetchedRequestUrlsHolder, "runningPrefetchedRequestUrlsHolder");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.adaptRequestForCachingDelegate = adaptRequestForCachingDelegate;
        this.runningPrefetchedRequestUrlsHolder = runningPrefetchedRequestUrlsHolder;
        this.featureChecker = featureChecker;
        this.cacheGroup = SuggestCacheGroup.INSTANCE;
        this.ignorePrefetchIfAlreadyRunning = true;
        this.ignorePrefetchIfHasInCache = true;
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandlerDefaultImpl, ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    @NotNull
    /* renamed from: adaptRequestForCaching-j-pqkY4 */
    public String mo607adaptRequestForCachingjpqkY4(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return !this.featureChecker.isEnabled(AdaptUrlInterceptorsBeforeCacheFlag.INSTANCE) ? AdaptedUrl.m651constructorimpl(url) : super.mo607adaptRequestForCachingjpqkY4(url);
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    @NotNull
    public CacheGroup getCacheGroup() {
        return this.cacheGroup;
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandlerDefaultImpl, ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    public boolean getIgnorePrefetchIfAlreadyRunning() {
        return this.ignorePrefetchIfAlreadyRunning;
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandlerDefaultImpl, ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    public boolean getIgnorePrefetchIfHasInCache() {
        return this.ignorePrefetchIfHasInCache;
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandlerDefaultImpl, ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    /* renamed from: onCacheHit-zMoF2ac */
    public void mo523onCacheHitzMoF2ac(@NotNull String requestUrl, @NotNull L response) {
        Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
        Intrinsics.checkNotNullParameter(response, "response");
        removeAllCacheForGroup(ClearCacheReason.SUGGEST_RESULT_CACHE_HIT);
        this.runningPrefetchedRequestUrlsHolder.removeIf(new SuggestResultCacheHandler$onCacheHit$1(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandlerDefaultImpl
    @NotNull
    public SearchAdapterRequestForCachingDelegate getAdaptRequestForCachingDelegate() {
        return this.adaptRequestForCachingDelegate;
    }
}
