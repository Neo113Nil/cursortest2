package ru.ozon.app.android.checkoutcomposer.di;

import IZ.a;
import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.checkoutcomposer.common.scrollToWidget.CheckoutScrollToWidgetKeyRepository;
import ru.ozon.app.android.checkoutgeo.checkout.localgoods.LocalGoodsForCheckoutRepository;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.network.abtool.FeatureChecker;

/* loaded from: classes6.dex */
public final class CheckoutNavigationModule_ProvideDeeplinkHandlersSet$checkout_prodGoogleAllVendorsReleaseFactory implements e<Set<a>> {
    public static Set<a> provideDeeplinkHandlersSet$checkout_prodGoogleAllVendorsRelease(LocalGoodsForCheckoutRepository localGoodsForCheckoutRepository, AuthDestinationInterceptor authDestinationInterceptor, CheckoutScrollToWidgetKeyRepository checkoutScrollToWidgetKeyRepository, FeatureChecker featureChecker) {
        Set<a> provideDeeplinkHandlersSet$checkout_prodGoogleAllVendorsRelease = CheckoutNavigationModule.INSTANCE.provideDeeplinkHandlersSet$checkout_prodGoogleAllVendorsRelease(localGoodsForCheckoutRepository, authDestinationInterceptor, checkoutScrollToWidgetKeyRepository, featureChecker);
        j.d(provideDeeplinkHandlersSet$checkout_prodGoogleAllVendorsRelease);
        return provideDeeplinkHandlersSet$checkout_prodGoogleAllVendorsRelease;
    }
}
