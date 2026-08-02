package ru.ozon.app.android.composer.network.cache.cacheHandler;

import We.L;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.cache.ClearCacheReason;
import ru.ozon.app.android.composer.network.cache.cacheGroup.CacheGroup;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0012\u0010\u000fJ3\u0010\u001b\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020 2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\u001f\u0010#J\u001f\u0010'\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b%\u0010&J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H&¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010)\u001a\u00020(H&¢\u0006\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00105\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00104¨\u00068"}, d2 = {"Lru/ozon/app/android/composer/network/cache/cacheHandler/ComposerCacheHandler;", "", "Lru/ozon/app/android/composer/network/cache/util/Url;", ImagesContract.URL, "", "shouldJoinRequest-VgcI5v0", "(Ljava/lang/String;)Z", "shouldJoinRequest", "Lru/ozon/app/android/composer/network/cache/util/PageUrl;", "pageUrl", "canHandle-46iOEHo", "(Ljava/lang/String;Ljava/lang/String;)Z", "canHandle", "Lru/ozon/app/android/composer/network/cache/util/AdaptedUrl;", "adaptRequestForCaching-j-pqkY4", "(Ljava/lang/String;)Ljava/lang/String;", "adaptRequestForCaching", "Lru/ozon/app/android/composer/network/cache/util/AdaptedPageUrl;", "adaptPageUrlForCaching-wvZU0FE", "adaptPageUrlForCaching", "isPrefetch", "", "responseMaxAge", "LWe/L;", "response", "formatMaxAgeForCaching-pM1TDTc", "(Ljava/lang/String;ZLjava/lang/Integer;LWe/L;)Ljava/lang/Integer;", "formatMaxAgeForCaching", "", "onPrefetchFail-ucI2Kkw", "(Ljava/lang/String;)V", "onPrefetchFail", "", "", "throwable", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "requestUrl", "onCacheHit-zMoF2ac", "(Ljava/lang/String;LWe/L;)V", "onCacheHit", "Lru/ozon/app/android/composer/network/cache/ClearCacheReason;", "reason", "shouldClearAllCache", "(Lru/ozon/app/android/composer/network/cache/ClearCacheReason;)Z", "shouldClearCacheFor-FyG2aqw", "(Ljava/lang/String;Lru/ozon/app/android/composer/network/cache/ClearCacheReason;)Z", "shouldClearCacheFor", "Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "getCacheGroup", "()Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "cacheGroup", "getIgnorePrefetchIfAlreadyRunning", "()Z", "ignorePrefetchIfAlreadyRunning", "getIgnorePrefetchIfHasInCache", "ignorePrefetchIfHasInCache", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ComposerCacheHandler {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class DefaultImpls {
        public static void onPrefetchFail(@NotNull ComposerCacheHandler composerCacheHandler, @NotNull String url, @NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
        }
    }

    @NotNull
    /* renamed from: adaptPageUrlForCaching-wvZU0FE, reason: not valid java name */
    String mo637adaptPageUrlForCachingwvZU0FE(@NotNull String pageUrl);

    @NotNull
    /* renamed from: adaptRequestForCaching-j-pqkY4 */
    String mo607adaptRequestForCachingjpqkY4(@NotNull String url);

    /* renamed from: canHandle-46iOEHo */
    boolean mo521canHandle46iOEHo(@NotNull String url, String pageUrl);

    /* renamed from: formatMaxAgeForCaching-pM1TDTc */
    Integer mo522formatMaxAgeForCachingpM1TDTc(@NotNull String url, boolean isPrefetch, Integer responseMaxAge, @NotNull L response);

    @NotNull
    CacheGroup getCacheGroup();

    boolean getIgnorePrefetchIfAlreadyRunning();

    boolean getIgnorePrefetchIfHasInCache();

    /* renamed from: onCacheHit-zMoF2ac */
    void mo523onCacheHitzMoF2ac(@NotNull String requestUrl, @NotNull L response);

    void onPrefetchFail(@NotNull String url, @NotNull Throwable throwable);

    /* renamed from: onPrefetchFail-ucI2Kkw, reason: not valid java name */
    void mo638onPrefetchFailucI2Kkw(@NotNull String pageUrl);

    boolean shouldClearAllCache(@NotNull ClearCacheReason reason);

    /* renamed from: shouldClearCacheFor-FyG2aqw */
    boolean mo525shouldClearCacheForFyG2aqw(@NotNull String pageUrl, @NotNull ClearCacheReason reason);

    /* renamed from: shouldJoinRequest-VgcI5v0 */
    boolean mo526shouldJoinRequestVgcI5v0(@NotNull String url);
}
