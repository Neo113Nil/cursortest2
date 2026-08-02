package ru.ozon.app.android.composer.network;

import We.B;
import We.G;
import We.L;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.startup.AppLaunchAnalytics;
import ru.ozon.app.android.network.interceptors.BXInterceptor;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/composer/network/ComposerReferrerInterceptor;", "Lru/ozon/app/android/network/interceptors/BXInterceptor;", "Lru/ozon/app/android/analytics/startup/AppLaunchAnalytics;", "appLaunchAnalytics", "<init>", "(Lru/ozon/app/android/analytics/startup/AppLaunchAnalytics;)V", "LWe/B$a;", "chain", "LWe/L;", "onIntercept", "(LWe/B$a;)LWe/L;", "Lru/ozon/app/android/analytics/startup/AppLaunchAnalytics;", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerReferrerInterceptor extends BXInterceptor {

    @NotNull
    private final AppLaunchAnalytics appLaunchAnalytics;
    public static final int $stable = 8;

    public ComposerReferrerInterceptor(@NotNull AppLaunchAnalytics appLaunchAnalytics) {
        Intrinsics.checkNotNullParameter(appLaunchAnalytics, "appLaunchAnalytics");
        this.appLaunchAnalytics = appLaunchAnalytics;
    }

    @Override // ru.ozon.app.android.network.interceptors.BXInterceptor
    @NotNull
    protected L onIntercept(@NotNull B.a chain) {
        Uri parse;
        String path;
        Intrinsics.checkNotNullParameter(chain, "chain");
        G request = chain.request();
        String p11 = request.j().p(ImagesContract.URL);
        if (p11 == null || (parse = Uri.parse(p11)) == null || (path = parse.getPath()) == null) {
            return chain.proceed(request);
        }
        String referrerForUrl = this.appLaunchAnalytics.referrerForUrl(path);
        if (referrerForUrl == null) {
            return chain.proceed(request);
        }
        G.a aVar = new G.a(request);
        aVar.a("Referer", referrerForUrl);
        L proceed = chain.proceed(aVar.b());
        if (!proceed.v()) {
            this.appLaunchAnalytics.associateReferrer(path, referrerForUrl);
        }
        return proceed;
    }
}
