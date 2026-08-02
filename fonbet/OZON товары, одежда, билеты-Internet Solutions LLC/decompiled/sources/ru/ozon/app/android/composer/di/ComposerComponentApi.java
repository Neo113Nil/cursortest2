package ru.ozon.app.android.composer.di;

import K00.a;
import L00.d;
import L00.f;
import O00.b;
import WZ.l;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.configurator.storage.ComposerConfiguratorStorage;
import ru.ozon.app.android.composer.domain.cache.CachePreferences;
import ru.ozon.app.android.composer.domain.cache.ComposerResponseStorage;
import ru.ozon.app.android.composer.network.cache.ComposerCacheService;
import ru.ozon.app.android.composer.network.cache.interceptor.cacheError.CacheErrorInterceptor;
import ru.ozon.app.android.composer.network.prefetch.ComposerPrefetchService;
import ru.ozon.app.android.composer.network.prefetch.ComposerRunningPrefetchedRequestUrlsHolder;
import ru.ozon.app.android.composer.network.prefetch.UrlPrefetchedEventHolder;
import ru.ozon.app.android.composer.network.redirect.RestrictRedirectsNetworkInterceptor;
import ru.ozon.app.android.composer.network.referrer.ReferrerValueController;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H&¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H&¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H&¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H&¢\u0006\u0004\b+\u0010,R\u0014\u00100\u001a\u00020-8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/ozon/app/android/composer/di/ComposerComponentApi;", "Lru/ozon/app/android/composer/di/ComposerPerformanceComponentApi;", "Lru/ozon/app/android/composer/network/prefetch/UrlPrefetchedEventHolder;", "getUrlPrefetchedEventHolder", "()Lru/ozon/app/android/composer/network/prefetch/UrlPrefetchedEventHolder;", "Lru/ozon/app/android/composer/network/prefetch/ComposerPrefetchService;", "getComposerPrefetchService", "()Lru/ozon/app/android/composer/network/prefetch/ComposerPrefetchService;", "Lru/ozon/app/android/composer/network/cache/ComposerCacheService;", "getComposerCacheService", "()Lru/ozon/app/android/composer/network/cache/ComposerCacheService;", "Lru/ozon/app/android/composer/network/prefetch/ComposerRunningPrefetchedRequestUrlsHolder;", "getComposerRunningPrefetchedRequestUrlsHolder", "()Lru/ozon/app/android/composer/network/prefetch/ComposerRunningPrefetchedRequestUrlsHolder;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "Lru/ozon/app/android/composer/ComposerNavigator;", "getComposerNavigator", "()Lru/ozon/app/android/composer/ComposerNavigator;", "Lru/ozon/app/android/composer/domain/cache/ComposerResponseStorage;", "getComposerResponseStorage", "()Lru/ozon/app/android/composer/domain/cache/ComposerResponseStorage;", "Lru/ozon/app/android/composer/domain/cache/CachePreferences;", "geCachePreferences", "()Lru/ozon/app/android/composer/domain/cache/CachePreferences;", "Lru/ozon/app/android/composer/configurator/storage/ComposerConfiguratorStorage;", "getComposerConfiguratorStorage", "()Lru/ozon/app/android/composer/configurator/storage/ComposerConfiguratorStorage;", "LK00/a;", "getComposerNetwork", "()LK00/a;", "LL00/d;", "getComposerCallFactory", "()LL00/d;", "LO00/b;", "getComposerAsyncWidgetsDecoder", "()LO00/b;", "LL00/f;", "getComposerBaseUrl", "()LL00/f;", "Lru/ozon/app/android/composer/network/referrer/ReferrerValueController;", "getReferrerValueController", "()Lru/ozon/app/android/composer/network/referrer/ReferrerValueController;", "Lru/ozon/app/android/composer/network/redirect/RestrictRedirectsNetworkInterceptor;", "getRestrictRedirectsNetworkInterceptor", "()Lru/ozon/app/android/composer/network/redirect/RestrictRedirectsNetworkInterceptor;", "restrictRedirectsNetworkInterceptor", "Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CacheErrorInterceptor;", "getCacheErrorInterceptor", "()Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CacheErrorInterceptor;", "cacheErrorInterceptor", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ComposerComponentApi extends ComposerPerformanceComponentApi {
    @NotNull
    CachePreferences geCachePreferences();

    @NotNull
    CacheErrorInterceptor getCacheErrorInterceptor();

    @NotNull
    b getComposerAsyncWidgetsDecoder();

    @NotNull
    f getComposerBaseUrl();

    @NotNull
    ComposerCacheService getComposerCacheService();

    @NotNull
    d getComposerCallFactory();

    @NotNull
    ComposerConfiguratorStorage getComposerConfiguratorStorage();

    @NotNull
    ComposerNavigator getComposerNavigator();

    @NotNull
    a getComposerNetwork();

    @NotNull
    ComposerPrefetchService getComposerPrefetchService();

    @NotNull
    ComposerResponseStorage getComposerResponseStorage();

    @NotNull
    ComposerRunningPrefetchedRequestUrlsHolder getComposerRunningPrefetchedRequestUrlsHolder();

    @NotNull
    ReferrerValueController getReferrerValueController();

    @NotNull
    RestrictRedirectsNetworkInterceptor getRestrictRedirectsNetworkInterceptor();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    UrlPrefetchedEventHolder getUrlPrefetchedEventHolder();
}
