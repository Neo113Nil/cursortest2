package ru.ozon.app.android.composer.network.redirect;

import Qj0.s0;
import We.A;
import We.B;
import We.G;
import We.InterfaceC4875q;
import We.L;
import a10.j;
import com.google.android.gms.common.internal.ImagesContract;
import ef.C6355e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.composer.domain.decode.OkHttpHeaders;
import ru.ozon.app.android.composer.network.cache.ComposerCacheService;
import ru.ozon.app.android.composer.network.cache.cacheGroup.CacheGroup;
import ru.ozon.app.android.composer.network.cache.flags.AdaptUrlInterceptorsBeforeCacheFlag;
import ru.ozon.app.android.composer.network.prefetch.ComposerPrefetchedUrlsHolder;
import ru.ozon.app.android.composer.network.util.RequestsKt;
import ru.ozon.app.android.composer.network.util.ResponsesKt;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.interceptors.BXInterceptor;
import ru.ozon.app.android.utils.UriExtKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u0014*\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u0014*\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/composer/network/redirect/RedirectNetworkInterceptor;", "Lru/ozon/app/android/network/interceptors/BXInterceptor;", "Lru/ozon/app/android/composer/network/prefetch/ComposerPrefetchedUrlsHolder;", "prefetchedUrlsHolder", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "LWe/q;", "cookieJar", "Lru/ozon/app/android/composer/network/cache/ComposerCacheService;", "composerCacheService", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/composer/network/prefetch/ComposerPrefetchedUrlsHolder;Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;LWe/q;Lru/ozon/app/android/composer/network/cache/ComposerCacheService;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "LWe/L;", "response", "LWe/G;", "request", "", "redirectUrl", "", "rememberPrefetchUrl", "(LWe/L;LWe/G;Ljava/lang/String;)V", "redirectLink", "fixPrefetchRedirect", "(LWe/L;Ljava/lang/String;)LWe/L;", "", "isNetworkLBRedirect", "(LWe/L;)Z", "trackNetworkLBRedirect", "(LWe/G;)V", "saveCookies", "(LWe/L;)V", "LWe/B$a;", "chain", "onIntercept", "(LWe/B$a;)LWe/L;", "Lru/ozon/app/android/composer/network/prefetch/ComposerPrefetchedUrlsHolder;", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "LWe/q;", "Lru/ozon/app/android/composer/network/cache/ComposerCacheService;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RedirectNetworkInterceptor extends BXInterceptor {

    @NotNull
    private final ComposerCacheService composerCacheService;

    @NotNull
    private final InterfaceC4875q cookieJar;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final PerformanceTrackerDelegate performanceTrackerDelegate;

    @NotNull
    private final ComposerPrefetchedUrlsHolder prefetchedUrlsHolder;

    public RedirectNetworkInterceptor(@NotNull ComposerPrefetchedUrlsHolder prefetchedUrlsHolder, @NotNull PerformanceTrackerDelegate performanceTrackerDelegate, @NotNull InterfaceC4875q cookieJar, @NotNull ComposerCacheService composerCacheService, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(prefetchedUrlsHolder, "prefetchedUrlsHolder");
        Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        Intrinsics.checkNotNullParameter(composerCacheService, "composerCacheService");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.prefetchedUrlsHolder = prefetchedUrlsHolder;
        this.performanceTrackerDelegate = performanceTrackerDelegate;
        this.cookieJar = cookieJar;
        this.composerCacheService = composerCacheService;
        this.featureChecker = featureChecker;
    }

    private final L fixPrefetchRedirect(L response, String redirectLink) {
        String removeSchema;
        if (redirectLink == null || (removeSchema = UriExtKt.removeSchema(redirectLink)) == null) {
            return response;
        }
        A.a j11 = response.L().j().j();
        j11.o();
        j11.d(ImagesContract.URL, removeSchema);
        String a11 = j11.e().toString();
        L.a aVar = new L.a(response);
        aVar.i("location", a11);
        return aVar.c();
    }

    private final boolean isNetworkLBRedirect(L l11) {
        String q11;
        String p11;
        Integer w02;
        Integer w03;
        if (l11.m() == 307 && (q11 = L.q(l11, "location")) != null) {
            A.f33515l.getClass();
            A e11 = A.b.e(q11);
            if (e11 != null && (p11 = e11.p("__rr")) != null && (w02 = h.w0(p11)) != null) {
                int intValue = w02.intValue();
                String p12 = l11.L().j().p("__rr");
                if (intValue > ((p12 == null || (w03 = h.w0(p12)) == null) ? 0 : w03.intValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void rememberPrefetchUrl(L response, G request, String redirectUrl) {
        CacheGroup cacheGroup = RequestsKt.cacheGroup(request);
        Integer valueOf = Integer.valueOf(response.d().c());
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        Long valueOf2 = valueOf != null ? Long.valueOf(valueOf.intValue()) : null;
        if (valueOf2 != null) {
            if (this.featureChecker.isEnabled(AdaptUrlInterceptorsBeforeCacheFlag.INSTANCE)) {
                request = this.composerCacheService.adaptRequestForCaching(request);
            }
            this.prefetchedUrlsHolder.upsert(request.j().toString(), cacheGroup, valueOf2.longValue(), redirectUrl);
        }
    }

    private final void saveCookies(L l11) {
        C6355e.e(this.cookieJar, l11.L().j(), l11.r());
    }

    private final void trackNetworkLBRedirect(G g10) {
        this.performanceTrackerDelegate.beginTrace(s0.a(g10), RedirectNetworkInterceptor$trackNetworkLBRedirect$1.INSTANCE);
    }

    @Override // ru.ozon.app.android.network.interceptors.BXInterceptor
    @NotNull
    protected L onIntercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        G request = chain.request();
        boolean isPrefetch = ru.ozon.app.android.network.utils.RequestsKt.isPrefetch(request);
        L proceed = chain.proceed(request);
        boolean t2 = proceed.t();
        boolean isNetworkLBRedirect = isNetworkLBRedirect(proceed);
        if (isNetworkLBRedirect) {
            trackNetworkLBRedirect(request);
        }
        String redirectUrl = (!t2 || isNetworkLBRedirect) ? null : ResponsesKt.getRedirectUrl(proceed);
        if (isPrefetch) {
            rememberPrefetchUrl(proceed, request, redirectUrl);
        }
        if (t2 && !isNetworkLBRedirect) {
            if (isPrefetch) {
                return fixPrefetchRedirect(proceed, redirectUrl);
            }
            if (redirectUrl != null) {
                saveCookies(proceed);
                s0.a(request);
                throw new j(proceed.m(), proceed.w(), new OkHttpHeaders(proceed.r()), proceed);
            }
        }
        return proceed;
    }
}
