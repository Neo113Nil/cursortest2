package ru.ozon.app.android.composer.network.redirect;

import Lm0.a;
import Sc.r;
import We.B;
import We.L;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.plugins.af.AppsFlyerResolver;
import ru.ozon.app.android.analytics.startup.AppLaunchAnalytics;
import ru.ozon.app.android.composer.network.util.ResponsesKt;
import ru.ozon.app.android.network.interceptors.BXInterceptor;
import xe.C10727i;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\b*\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/composer/network/redirect/AppsFlyerRedirectNetworkInterceptor;", "Lru/ozon/app/android/network/interceptors/BXInterceptor;", "Lru/ozon/app/android/analytics/plugins/af/AppsFlyerResolver;", "appsFlyerResolver", "Lru/ozon/app/android/analytics/startup/AppLaunchAnalytics;", "appLaunchAnalytics", "<init>", "(Lru/ozon/app/android/analytics/plugins/af/AppsFlyerResolver;Lru/ozon/app/android/analytics/startup/AppLaunchAnalytics;)V", "LWe/L;", "response", "replaceOneLink", "(LWe/L;)LWe/L;", "", "redirectUrl", "buildRedirectResponse", "(LWe/L;Ljava/lang/String;)LWe/L;", ImagesContract.URL, "", "trackCampaign", "(Ljava/lang/String;)V", "LWe/B$a;", "chain", "onIntercept", "(LWe/B$a;)LWe/L;", "Lru/ozon/app/android/analytics/plugins/af/AppsFlyerResolver;", "Lru/ozon/app/android/analytics/startup/AppLaunchAnalytics;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppsFlyerRedirectNetworkInterceptor extends BXInterceptor {

    @NotNull
    private final AppLaunchAnalytics appLaunchAnalytics;

    @NotNull
    private final AppsFlyerResolver appsFlyerResolver;

    public AppsFlyerRedirectNetworkInterceptor(@NotNull AppsFlyerResolver appsFlyerResolver, @NotNull AppLaunchAnalytics appLaunchAnalytics) {
        Intrinsics.checkNotNullParameter(appsFlyerResolver, "appsFlyerResolver");
        Intrinsics.checkNotNullParameter(appLaunchAnalytics, "appLaunchAnalytics");
        this.appsFlyerResolver = appsFlyerResolver;
        this.appLaunchAnalytics = appLaunchAnalytics;
    }

    private final L buildRedirectResponse(L l11, String str) {
        l11.getClass();
        L.a aVar = new L.a(l11);
        aVar.i("location", str);
        return aVar.c();
    }

    private final L replaceOneLink(L response) {
        String redirectUrl;
        if (response.t() && (redirectUrl = ResponsesKt.getRedirectUrl(response)) != null) {
            Uri parse = Uri.parse(redirectUrl);
            if (this.appsFlyerResolver.isLinkSupported(parse)) {
                Object f26106a = ((r) C10727i.d(g.f71771a, new AppsFlyerRedirectNetworkInterceptor$replaceOneLink$1(this, parse, null))).getF26106a();
                if (!(f26106a instanceof r.b)) {
                    String str = (String) f26106a;
                    Intrinsics.f(str);
                    trackCampaign(str);
                    return buildRedirectResponse(response, str);
                }
                Throwable b11 = r.b(f26106a);
                if (b11 != null) {
                    a.f17149a.e(b11);
                }
            }
        }
        return response;
    }

    private final void trackCampaign(String url) {
        Uri parse = Uri.parse(url);
        if (parse == null) {
            return;
        }
        this.appLaunchAnalytics.trackCampaign(parse, null);
    }

    @Override // ru.ozon.app.android.network.interceptors.BXInterceptor
    @NotNull
    protected L onIntercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        return replaceOneLink(chain.proceed(chain.request()));
    }
}
