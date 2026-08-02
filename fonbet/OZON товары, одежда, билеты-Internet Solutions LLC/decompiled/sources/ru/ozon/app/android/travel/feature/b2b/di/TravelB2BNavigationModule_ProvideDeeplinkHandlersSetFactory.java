package ru.ozon.app.android.travel.feature.b2b.di;

import IZ.a;
import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.travel.utils.destinationBehavior.behavior.FullScreenDestinationBehavior;

/* loaded from: classes7.dex */
public final class TravelB2BNavigationModule_ProvideDeeplinkHandlersSetFactory implements e<Set<a>> {
    public static Set<a> provideDeeplinkHandlersSet(AuthDestinationInterceptor authDestinationInterceptor, FullScreenDestinationBehavior fullScreenDestinationBehavior, HZ.a aVar) {
        Set<a> provideDeeplinkHandlersSet = TravelB2BNavigationModule.INSTANCE.provideDeeplinkHandlersSet(authDestinationInterceptor, fullScreenDestinationBehavior, aVar);
        j.d(provideDeeplinkHandlersSet);
        return provideDeeplinkHandlersSet;
    }
}
