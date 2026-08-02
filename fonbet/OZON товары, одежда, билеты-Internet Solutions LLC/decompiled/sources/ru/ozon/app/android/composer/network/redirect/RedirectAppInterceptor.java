package ru.ozon.app.android.composer.network.redirect;

import We.B;
import We.G;
import We.L;
import a10.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.domain.decode.OkHttpHeaders;
import ru.ozon.app.android.composer.network.prefetch.ComposerPrefetchedUrlsHolder;
import ru.ozon.app.android.network.interceptors.BXInterceptor;
import ru.ozon.app.android.network.utils.RequestsKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/composer/network/redirect/RedirectAppInterceptor;", "Lru/ozon/app/android/network/interceptors/BXInterceptor;", "Lru/ozon/app/android/composer/network/prefetch/ComposerPrefetchedUrlsHolder;", "prefetchedUrlsHolder", "<init>", "(Lru/ozon/app/android/composer/network/prefetch/ComposerPrefetchedUrlsHolder;)V", "LWe/L;", "", "redirectUrl", "buildRedirectResponse", "(LWe/L;Ljava/lang/String;)LWe/L;", "LWe/B$a;", "chain", "onIntercept", "(LWe/B$a;)LWe/L;", "Lru/ozon/app/android/composer/network/prefetch/ComposerPrefetchedUrlsHolder;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RedirectAppInterceptor extends BXInterceptor {

    @NotNull
    private final ComposerPrefetchedUrlsHolder prefetchedUrlsHolder;

    public RedirectAppInterceptor(@NotNull ComposerPrefetchedUrlsHolder prefetchedUrlsHolder) {
        Intrinsics.checkNotNullParameter(prefetchedUrlsHolder, "prefetchedUrlsHolder");
        this.prefetchedUrlsHolder = prefetchedUrlsHolder;
    }

    private final L buildRedirectResponse(L l11, String str) {
        l11.getClass();
        L.a aVar = new L.a(l11);
        aVar.f(302);
        aVar.l("Temporary Redirect");
        aVar.i("location", str);
        return aVar.c();
    }

    @Override // ru.ozon.app.android.network.interceptors.BXInterceptor
    @NotNull
    protected L onIntercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        G request = chain.request();
        String a11 = request.j().toString();
        L proceed = chain.proceed(request);
        ComposerPrefetchedUrlsHolder.PrefetchedUrl prefetchedUrl = this.prefetchedUrlsHolder.get(a11);
        L j11 = proceed.j();
        boolean z11 = (RequestsKt.isPrefetch(request) || prefetchedUrl == null) ? false : true;
        String redirectUrl = prefetchedUrl != null ? prefetchedUrl.getRedirectUrl() : null;
        if (j11 == null || !z11 || redirectUrl == null) {
            return proceed;
        }
        L buildRedirectResponse = buildRedirectResponse(j11, redirectUrl);
        throw new j(buildRedirectResponse.m(), buildRedirectResponse.w(), new OkHttpHeaders(buildRedirectResponse.r()), buildRedirectResponse);
    }
}
