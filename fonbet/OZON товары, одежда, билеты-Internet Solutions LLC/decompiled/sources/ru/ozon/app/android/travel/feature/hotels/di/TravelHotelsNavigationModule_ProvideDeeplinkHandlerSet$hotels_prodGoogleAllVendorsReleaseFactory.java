package ru.ozon.app.android.travel.feature.hotels.di;

import IZ.a;
import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.tabbar.data.local.TabConfigCache;
import ru.ozon.app.android.travel.feature.hotels.interceptor.EnsureMiniappTravelDeeplinkInterceptor;

/* loaded from: classes7.dex */
public final class TravelHotelsNavigationModule_ProvideDeeplinkHandlerSet$hotels_prodGoogleAllVendorsReleaseFactory implements e<Set<a>> {
    public static Set<a> provideDeeplinkHandlerSet$hotels_prodGoogleAllVendorsRelease(AuthDestinationInterceptor authDestinationInterceptor, EnsureMiniappTravelDeeplinkInterceptor ensureMiniappTravelDeeplinkInterceptor, TabConfigCache tabConfigCache) {
        Set<a> provideDeeplinkHandlerSet$hotels_prodGoogleAllVendorsRelease = TravelHotelsNavigationModule.INSTANCE.provideDeeplinkHandlerSet$hotels_prodGoogleAllVendorsRelease(authDestinationInterceptor, ensureMiniappTravelDeeplinkInterceptor, tabConfigCache);
        j.d(provideDeeplinkHandlerSet$hotels_prodGoogleAllVendorsRelease);
        return provideDeeplinkHandlerSet$hotels_prodGoogleAllVendorsRelease;
    }
}
