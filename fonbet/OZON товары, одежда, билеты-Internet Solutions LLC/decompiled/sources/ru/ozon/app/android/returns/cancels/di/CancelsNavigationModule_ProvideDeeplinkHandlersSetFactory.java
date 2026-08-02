package ru.ozon.app.android.returns.cancels.di;

import IZ.a;
import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;

/* loaded from: classes7.dex */
public final class CancelsNavigationModule_ProvideDeeplinkHandlersSetFactory implements e<Set<a>> {
    public static Set<a> provideDeeplinkHandlersSet(AuthDestinationInterceptor authDestinationInterceptor) {
        Set<a> provideDeeplinkHandlersSet = CancelsNavigationModule.provideDeeplinkHandlersSet(authDestinationInterceptor);
        j.d(provideDeeplinkHandlersSet);
        return provideDeeplinkHandlersSet;
    }
}
