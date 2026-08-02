package ru.ozon.app.android.travel.feature.general.common.di;

import IZ.a;
import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.navigation.interceptors.AtMostQaUserDestinationInterceptor;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.travel.utils.destinationBehavior.behavior.BackgroundColorDestinationBehavior;
import ru.ozon.app.android.travel.utils.destinationBehavior.behavior.FullScreenDestinationBehavior;

/* loaded from: classes7.dex */
public final class TravelGeneralNavigationModule_ProvideDeeplinkHandlersSetFactory implements e<Set<a>> {
    public static Set<a> provideDeeplinkHandlersSet(AuthDestinationInterceptor authDestinationInterceptor, AtMostQaUserDestinationInterceptor atMostQaUserDestinationInterceptor, FullScreenDestinationBehavior fullScreenDestinationBehavior, BackgroundColorDestinationBehavior backgroundColorDestinationBehavior, HZ.a aVar) {
        Set<a> provideDeeplinkHandlersSet = TravelGeneralNavigationModule.INSTANCE.provideDeeplinkHandlersSet(authDestinationInterceptor, atMostQaUserDestinationInterceptor, fullScreenDestinationBehavior, backgroundColorDestinationBehavior, aVar);
        j.d(provideDeeplinkHandlersSet);
        return provideDeeplinkHandlersSet;
    }
}
