package ru.ozon.app.android.orders.cml.di;

import IZ.a;
import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;

/* loaded from: classes6.dex */
public final class CmlOrdersNavigationModule_ProvideDeeplinkHandlersSetFactory implements e<Set<a>> {
    public static Set<a> provideDeeplinkHandlersSet(CmlOrdersNavigationModule cmlOrdersNavigationModule, AuthDestinationInterceptor authDestinationInterceptor) {
        Set<a> provideDeeplinkHandlersSet = cmlOrdersNavigationModule.provideDeeplinkHandlersSet(authDestinationInterceptor);
        j.d(provideDeeplinkHandlersSet);
        return provideDeeplinkHandlersSet;
    }
}
