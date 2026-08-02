package ru.ozon.app.android.storefront.deeplinkhandlers.home;

import GZ.j;
import IZ.a;
import android.content.Context;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.featureChecker.FailedExternalLinkRetryFeatureChecker;
import ru.ozon.app.android.network.utils.UriExtKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/storefront/deeplinkhandlers/home/HomeDeeplinkHandler;", "LIZ/a;", "Lru/ozon/app/android/storefront/deeplinkhandlers/home/HomeDestinationFactory;", "homeDestinationFactory", "Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/featureChecker/FailedExternalLinkRetryFeatureChecker;", "failedExternalLinkRetryFeatureChecker", "<init>", "(Lru/ozon/app/android/storefront/deeplinkhandlers/home/HomeDestinationFactory;Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/featureChecker/FailedExternalLinkRetryFeatureChecker;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/storefront/deeplinkhandlers/home/HomeDestinationFactory;", "Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/featureChecker/FailedExternalLinkRetryFeatureChecker;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HomeDeeplinkHandler implements a {

    @NotNull
    private final FailedExternalLinkRetryFeatureChecker failedExternalLinkRetryFeatureChecker;

    @NotNull
    private final HomeDestinationFactory homeDestinationFactory;

    public HomeDeeplinkHandler(@NotNull HomeDestinationFactory homeDestinationFactory, @NotNull FailedExternalLinkRetryFeatureChecker failedExternalLinkRetryFeatureChecker) {
        Intrinsics.checkNotNullParameter(homeDestinationFactory, "homeDestinationFactory");
        Intrinsics.checkNotNullParameter(failedExternalLinkRetryFeatureChecker, "failedExternalLinkRetryFeatureChecker");
        this.homeDestinationFactory = homeDestinationFactory;
        this.failedExternalLinkRetryFeatureChecker = failedExternalLinkRetryFeatureChecker;
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        String queryParameter;
        String queryParameter2;
        Intrinsics.checkNotNullParameter(route, "route");
        String authority = route.b().getAuthority();
        return ((authority == null || authority.length() == 0) && (((queryParameter = route.b().getQueryParameter("orderNumber")) == null || queryParameter.length() == 0) && ((queryParameter2 = route.b().getQueryParameter("payment")) == null || queryParameter2.length() == 0))) || Lh.a.f(route, "home");
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        Uri build = route.b().buildUpon().authority("home").build();
        String queryParameter = build.getQueryParameter("OzonRouterKt.REDIRECT_DEEPLINK");
        String queryParameter2 = build.getQueryParameter("OzonRouterKt.QUERY_FRAGMENT_DESTINATION");
        boolean parseBoolean = queryParameter2 != null ? Boolean.parseBoolean(queryParameter2) : true;
        String uri = UriExtKt.removeQueryParameter(build, "OzonRouterKt.QUERY_FRAGMENT_DESTINATION", "OzonRouterKt.REDIRECT_DEEPLINK").toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return parseBoolean ? this.homeDestinationFactory.createFragmentDestination(uri, this.failedExternalLinkRetryFeatureChecker.isEnabled()) : this.homeDestinationFactory.createActivityDestination(context, queryParameter);
    }
}
