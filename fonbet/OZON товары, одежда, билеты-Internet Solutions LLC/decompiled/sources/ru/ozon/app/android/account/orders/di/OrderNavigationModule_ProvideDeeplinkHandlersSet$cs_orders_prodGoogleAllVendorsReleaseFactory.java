package ru.ozon.app.android.account.orders.di;

import IZ.a;
import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes6.dex */
public final class OrderNavigationModule_ProvideDeeplinkHandlersSet$cs_orders_prodGoogleAllVendorsReleaseFactory implements e<Set<a>> {
    public static Set<a> provideDeeplinkHandlersSet$cs_orders_prodGoogleAllVendorsRelease(FeatureChecker featureChecker, AuthDestinationInterceptor authDestinationInterceptor, AppType appType) {
        Set<a> provideDeeplinkHandlersSet$cs_orders_prodGoogleAllVendorsRelease = OrderNavigationModule.provideDeeplinkHandlersSet$cs_orders_prodGoogleAllVendorsRelease(featureChecker, authDestinationInterceptor, appType);
        j.d(provideDeeplinkHandlersSet$cs_orders_prodGoogleAllVendorsRelease);
        return provideDeeplinkHandlersSet$cs_orders_prodGoogleAllVendorsRelease;
    }
}
