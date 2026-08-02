package ru.ozon.app.android.storefront.deeplinkhandlers;

import GZ.j;
import KZ.c;
import Sc.InterfaceC4008j;
import Sc.k;
import android.app.Application;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.domain.flags.ShouldRedirectBrowserToWebView;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.whitelist.domain.DomainsInteractor;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00060\u0006j\u0002`\u00072\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/storefront/deeplinkhandlers/BrowserToWebViewGlobalDeeplinkInterceptor;", "LKZ/c;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canIntercept", "(LGZ/j;)Z", "intercept", "(LGZ/j;)LGZ/j;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker$delegate", "LSc/j;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;", "domainsInteractor$delegate", "getDomainsInteractor", "()Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;", "domainsInteractor", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BrowserToWebViewGlobalDeeplinkInterceptor implements c {

    /* renamed from: domainsInteractor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j domainsInteractor;

    /* renamed from: featureChecker$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j featureChecker;

    public BrowserToWebViewGlobalDeeplinkInterceptor(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.featureChecker = k.b(new BrowserToWebViewGlobalDeeplinkInterceptor$featureChecker$2(application));
        this.domainsInteractor = k.b(new BrowserToWebViewGlobalDeeplinkInterceptor$domainsInteractor$2(application));
    }

    private final DomainsInteractor getDomainsInteractor() {
        return (DomainsInteractor) this.domainsInteractor.getValue();
    }

    private final FeatureChecker getFeatureChecker() {
        return (FeatureChecker) this.featureChecker.getValue();
    }

    @Override // KZ.c
    public boolean canIntercept(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        String queryParameter = b11.getQueryParameter(ImagesContract.URL);
        if (queryParameter == null) {
            return false;
        }
        return getFeatureChecker().isEnabled(ShouldRedirectBrowserToWebView.INSTANCE) && (Intrinsics.d(b11.getAuthority(), "browser") || Intrinsics.d(b11.getAuthority(), "external")) && getDomainsInteractor().isUrlSubdomainOfNetworkRequestDomains(queryParameter);
    }

    @Override // KZ.a
    @NotNull
    public j intercept(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        String queryParameter = b11.getQueryParameter("isFullScreen");
        if (queryParameter == null) {
            queryParameter = "true";
        }
        Uri build = b11.buildUpon().authority("web").appendQueryParameter("isFullScreen", queryParameter).build();
        Intrinsics.f(build);
        return j.a(route, build);
    }
}
