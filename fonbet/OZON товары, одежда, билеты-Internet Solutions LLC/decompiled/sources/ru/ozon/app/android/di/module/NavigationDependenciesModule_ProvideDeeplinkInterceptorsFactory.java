package ru.ozon.app.android.di.module;

import Jb.e;
import Jb.j;
import KZ.c;
import ru.ozon.app.android.bank.navigation.BankGlobalDeeplinkInterceptor;
import ru.ozon.app.android.limb2.Limb2DeeplinkInterceptor;
import ru.ozon.app.android.navigation.globalinterceptors.deeplink.OzonFreshGlobalDeeplinkInterceptor;
import ru.ozon.app.android.navigation.globalinterceptors.deeplink.OzonSelectGlobalDeeplinkInterceptor;
import ru.ozon.app.android.navigation.globalinterceptors.deeplink.OzonTravelGlobalDeeplinkInterceptor;
import ru.ozon.app.android.search.deeplink.SourceGlobalDeeplinkInterceptor;
import ru.ozon.app.android.storefront.deeplinkhandlers.BrowserToWebViewGlobalDeeplinkInterceptor;
import ru.ozon.app.android.storefront.deeplinkhandlers.CategoryReviewDeeplinkInterceptor;
import ru.ozon.app.android.storefront.deeplinkhandlers.OzonWebViewDeeplinkInterceptor;
import ru.ozon.app.android.universalwidgets.failedExternalLinkRetry.deeplinkInterceptor.FailedExternalLinkRetryInterceptor;

/* loaded from: classes11.dex */
public final class NavigationDependenciesModule_ProvideDeeplinkInterceptorsFactory implements e<c[]> {
    public static c[] provideDeeplinkInterceptors(Limb2DeeplinkInterceptor limb2DeeplinkInterceptor, BankGlobalDeeplinkInterceptor bankGlobalDeeplinkInterceptor, SourceGlobalDeeplinkInterceptor sourceGlobalDeeplinkInterceptor, OzonTravelGlobalDeeplinkInterceptor ozonTravelGlobalDeeplinkInterceptor, CategoryReviewDeeplinkInterceptor categoryReviewDeeplinkInterceptor, OzonFreshGlobalDeeplinkInterceptor ozonFreshGlobalDeeplinkInterceptor, OzonSelectGlobalDeeplinkInterceptor ozonSelectGlobalDeeplinkInterceptor, OzonWebViewDeeplinkInterceptor ozonWebViewDeeplinkInterceptor, BrowserToWebViewGlobalDeeplinkInterceptor browserToWebViewGlobalDeeplinkInterceptor, FailedExternalLinkRetryInterceptor failedExternalLinkRetryInterceptor) {
        c[] provideDeeplinkInterceptors = NavigationDependenciesModule.INSTANCE.provideDeeplinkInterceptors(limb2DeeplinkInterceptor, bankGlobalDeeplinkInterceptor, sourceGlobalDeeplinkInterceptor, ozonTravelGlobalDeeplinkInterceptor, categoryReviewDeeplinkInterceptor, ozonFreshGlobalDeeplinkInterceptor, ozonSelectGlobalDeeplinkInterceptor, ozonWebViewDeeplinkInterceptor, browserToWebViewGlobalDeeplinkInterceptor, failedExternalLinkRetryInterceptor);
        j.d(provideDeeplinkInterceptors);
        return provideDeeplinkInterceptors;
    }
}
