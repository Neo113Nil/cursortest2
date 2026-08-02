package ru.ozon.app.android.courieronmap.di;

import IZ.a;
import Jb.e;
import Jb.j;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;

/* loaded from: classes6.dex */
public final class CourierOnMapNavigationModule_ProvideDeeplinkHandlersSetFactory implements e<a> {
    public static a provideDeeplinkHandlersSet(AuthDestinationInterceptor authDestinationInterceptor) {
        a provideDeeplinkHandlersSet = CourierOnMapNavigationModule.provideDeeplinkHandlersSet(authDestinationInterceptor);
        j.d(provideDeeplinkHandlersSet);
        return provideDeeplinkHandlersSet;
    }
}
