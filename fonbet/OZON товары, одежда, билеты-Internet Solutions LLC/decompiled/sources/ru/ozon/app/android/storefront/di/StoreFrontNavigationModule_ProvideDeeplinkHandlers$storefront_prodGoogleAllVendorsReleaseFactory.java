package ru.ozon.app.android.storefront.di;

import IZ.a;
import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.featureChecker.FailedExternalLinkRetryFeatureChecker;
import ru.ozon.app.android.navigation.interceptors.AtMostQaUserDestinationInterceptor;
import ru.ozon.app.android.push.OzonPushManager;
import ru.ozon.app.android.storefront.deeplinkhandlers.home.HomeDestinationFactory;
import ru.ozon.app.android.storefrontcommonwidgets.services.TeensModeService;
import ru.ozon.app.android.tabbar.data.TabConfigManager;

/* loaded from: classes7.dex */
public final class StoreFrontNavigationModule_ProvideDeeplinkHandlers$storefront_prodGoogleAllVendorsReleaseFactory implements e<Set<a>> {
    public static Set<a> provideDeeplinkHandlers$storefront_prodGoogleAllVendorsRelease(TabConfigManager tabConfigManager, TeensModeService teensModeService, OzonPushManager ozonPushManager, ActionV2Repository actionV2Repository, AtMostQaUserDestinationInterceptor atMostQaUserDestinationInterceptor, HomeDestinationFactory homeDestinationFactory, FailedExternalLinkRetryFeatureChecker failedExternalLinkRetryFeatureChecker) {
        Set<a> provideDeeplinkHandlers$storefront_prodGoogleAllVendorsRelease = StoreFrontNavigationModule.INSTANCE.provideDeeplinkHandlers$storefront_prodGoogleAllVendorsRelease(tabConfigManager, teensModeService, ozonPushManager, actionV2Repository, atMostQaUserDestinationInterceptor, homeDestinationFactory, failedExternalLinkRetryFeatureChecker);
        j.d(provideDeeplinkHandlers$storefront_prodGoogleAllVendorsRelease);
        return provideDeeplinkHandlers$storefront_prodGoogleAllVendorsRelease;
    }
}
