package ru.ozon.app.android.travel.feature.general.booking.di;

import IZ.a;
import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.travel.utils.destinationBehavior.behavior.FullScreenDestinationBehavior;

/* loaded from: classes7.dex */
public final class TravelGeneralBookingNavigationModule_ProvideDeeplinkHandlersSetFactory implements e<Set<a>> {
    public static Set<a> provideDeeplinkHandlersSet(AuthDestinationInterceptor authDestinationInterceptor, FullScreenDestinationBehavior fullScreenDestinationBehavior) {
        Set<a> provideDeeplinkHandlersSet = TravelGeneralBookingNavigationModule.INSTANCE.provideDeeplinkHandlersSet(authDestinationInterceptor, fullScreenDestinationBehavior);
        j.d(provideDeeplinkHandlersSet);
        return provideDeeplinkHandlersSet;
    }
}
