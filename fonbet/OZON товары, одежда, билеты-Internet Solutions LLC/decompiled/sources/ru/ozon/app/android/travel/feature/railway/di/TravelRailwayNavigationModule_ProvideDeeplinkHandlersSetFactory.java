package ru.ozon.app.android.travel.feature.railway.di;

import IZ.a;
import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.travel.utils.destinationBehavior.behavior.FullScreenDestinationBehavior;

/* loaded from: classes7.dex */
public final class TravelRailwayNavigationModule_ProvideDeeplinkHandlersSetFactory implements e<Set<a>> {
    public static Set<a> provideDeeplinkHandlersSet(AuthDestinationInterceptor authDestinationInterceptor, FullScreenDestinationBehavior fullScreenDestinationBehavior) {
        Set<a> provideDeeplinkHandlersSet = TravelRailwayNavigationModule.INSTANCE.provideDeeplinkHandlersSet(authDestinationInterceptor, fullScreenDestinationBehavior);
        j.d(provideDeeplinkHandlersSet);
        return provideDeeplinkHandlersSet;
    }
}
