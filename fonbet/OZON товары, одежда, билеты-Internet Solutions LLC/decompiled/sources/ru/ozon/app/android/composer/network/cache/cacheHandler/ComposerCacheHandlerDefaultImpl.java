package ru.ozon.app.android.composer.network.cache.cacheHandler;

import We.L;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.cache.AdaptRequestForCachingDelegate;
import ru.ozon.app.android.composer.network.cache.ClearCacheReason;
import ru.ozon.app.android.composer.network.cache.ComposerCacheCleaner;
import ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0013J3\u0010\u001f\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010#\u001a\u00020 2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020 2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020 2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020 2\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b1\u00102R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u00106R\u001a\u00107\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010;\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b<\u0010:R\u001a\u0010>\u001a\u00020=8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A¨\u0006B"}, d2 = {"Lru/ozon/app/android/composer/network/cache/cacheHandler/ComposerCacheHandlerDefaultImpl;", "Lru/ozon/app/android/composer/network/cache/cacheHandler/ComposerCacheHandler;", "Lru/ozon/app/android/composer/network/cache/ComposerCacheCleaner;", "composerCacheCleaner", "<init>", "(Lru/ozon/app/android/composer/network/cache/ComposerCacheCleaner;)V", "Lru/ozon/app/android/composer/network/cache/util/Url;", ImagesContract.URL, "", "shouldJoinRequest-VgcI5v0", "(Ljava/lang/String;)Z", "shouldJoinRequest", "Lru/ozon/app/android/composer/network/cache/util/PageUrl;", "pageUrl", "canHandle-46iOEHo", "(Ljava/lang/String;Ljava/lang/String;)Z", "canHandle", "Lru/ozon/app/android/composer/network/cache/util/AdaptedUrl;", "adaptRequestForCaching-j-pqkY4", "(Ljava/lang/String;)Ljava/lang/String;", "adaptRequestForCaching", "Lru/ozon/app/android/composer/network/cache/util/AdaptedPageUrl;", "adaptPageUrlForCaching-wvZU0FE", "adaptPageUrlForCaching", "isPrefetch", "", "responseMaxAge", "LWe/L;", "response", "formatMaxAgeForCaching-pM1TDTc", "(Ljava/lang/String;ZLjava/lang/Integer;LWe/L;)Ljava/lang/Integer;", "formatMaxAgeForCaching", "", "onPrefetchFail-ucI2Kkw", "(Ljava/lang/String;)V", "onPrefetchFail", "requestUrl", "onCacheHit-zMoF2ac", "(Ljava/lang/String;LWe/L;)V", "onCacheHit", "Lru/ozon/app/android/composer/network/cache/ClearCacheReason;", "reason", "shouldClearAllCache", "(Lru/ozon/app/android/composer/network/cache/ClearCacheReason;)Z", "shouldClearCacheFor-FyG2aqw", "(Ljava/lang/String;Lru/ozon/app/android/composer/network/cache/ClearCacheReason;)Z", "shouldClearCacheFor", "removeAllCacheForGroup", "(Lru/ozon/app/android/composer/network/cache/ClearCacheReason;)V", "removeCacheFor-AD7EpEU", "(Ljava/lang/String;Lru/ozon/app/android/composer/network/cache/ClearCacheReason;)V", "removeCacheFor", "Lru/ozon/app/android/composer/network/cache/ComposerCacheCleaner;", "getComposerCacheCleaner", "()Lru/ozon/app/android/composer/network/cache/ComposerCacheCleaner;", "ignorePrefetchIfAlreadyRunning", "Z", "getIgnorePrefetchIfAlreadyRunning", "()Z", "ignorePrefetchIfHasInCache", "getIgnorePrefetchIfHasInCache", "Lru/ozon/app/android/composer/network/cache/AdaptRequestForCachingDelegate;", "adaptRequestForCachingDelegate", "Lru/ozon/app/android/composer/network/cache/AdaptRequestForCachingDelegate;", "getAdaptRequestForCachingDelegate", "()Lru/ozon/app/android/composer/network/cache/AdaptRequestForCachingDelegate;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ComposerCacheHandlerDefaultImpl implements ComposerCacheHandler {

    @NotNull
    private final AdaptRequestForCachingDelegate adaptRequestForCachingDelegate;

    @NotNull
    private final ComposerCacheCleaner composerCacheCleaner;
    private final boolean ignorePrefetchIfAlreadyRunning;
    private final boolean ignorePrefetchIfHasInCache;

    public ComposerCacheHandlerDefaultImpl(@NotNull ComposerCacheCleaner composerCacheCleaner) {
        Intrinsics.checkNotNullParameter(composerCacheCleaner, "composerCacheCleaner");
        this.composerCacheCleaner = composerCacheCleaner;
        this.adaptRequestForCachingDelegate = new AdaptRequestForCachingDelegate();
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    @NotNull
    /* renamed from: adaptPageUrlForCaching-wvZU0FE */
    public String mo637adaptPageUrlForCachingwvZU0FE(@NotNull String pageUrl) {
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        return getAdaptRequestForCachingDelegate().m620invokewvZU0FE(pageUrl);
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    @NotNull
    /* renamed from: adaptRequestForCaching-j-pqkY4 */
    public String mo607adaptRequestForCachingjpqkY4(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return getAdaptRequestForCachingDelegate().m619invokejpqkY4(url);
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    /* renamed from: canHandle-46iOEHo */
    public boolean mo521canHandle46iOEHo(@NotNull String url, String pageUrl) {
        Intrinsics.checkNotNullParameter(url, "url");
        return false;
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    /* renamed from: formatMaxAgeForCaching-pM1TDTc */
    public Integer mo522formatMaxAgeForCachingpM1TDTc(@NotNull String url, boolean isPrefetch, Integer responseMaxAge, @NotNull L response) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(response, "response");
        if (isPrefetch) {
            return Integer.valueOf(responseMaxAge != null ? responseMaxAge.intValue() : 60);
        }
        return responseMaxAge;
    }

    @NotNull
    protected AdaptRequestForCachingDelegate getAdaptRequestForCachingDelegate() {
        return this.adaptRequestForCachingDelegate;
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    public boolean getIgnorePrefetchIfAlreadyRunning() {
        return this.ignorePrefetchIfAlreadyRunning;
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    public boolean getIgnorePrefetchIfHasInCache() {
        return this.ignorePrefetchIfHasInCache;
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    /* renamed from: onCacheHit-zMoF2ac */
    public void mo523onCacheHitzMoF2ac(@NotNull String requestUrl, @NotNull L response) {
        Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    public void onPrefetchFail(@NotNull String str, @NotNull Throwable th2) {
        ComposerCacheHandler.DefaultImpls.onPrefetchFail(this, str, th2);
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    /* renamed from: onPrefetchFail-ucI2Kkw */
    public void mo638onPrefetchFailucI2Kkw(@NotNull String pageUrl) {
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        this.composerCacheCleaner.mo629clearForAD7EpEU(getAdaptRequestForCachingDelegate().m620invokewvZU0FE(pageUrl), ClearCacheReason.PREFETCH_FAILED);
    }

    public void removeAllCacheForGroup(@NotNull ClearCacheReason reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.composerCacheCleaner.clearFor(getCacheGroup(), reason);
    }

    /* renamed from: removeCacheFor-AD7EpEU, reason: not valid java name */
    public void m639removeCacheForAD7EpEU(@NotNull String pageUrl, @NotNull ClearCacheReason reason) {
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.composerCacheCleaner.mo629clearForAD7EpEU(pageUrl, reason);
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    public boolean shouldClearAllCache(@NotNull ClearCacheReason reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        return true;
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    /* renamed from: shouldClearCacheFor-FyG2aqw */
    public boolean mo525shouldClearCacheForFyG2aqw(@NotNull String pageUrl, @NotNull ClearCacheReason reason) {
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        Intrinsics.checkNotNullParameter(reason, "reason");
        return true;
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    /* renamed from: shouldJoinRequest-VgcI5v0 */
    public boolean mo526shouldJoinRequestVgcI5v0(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return false;
    }
}
