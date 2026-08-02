package ru.ozon.app.android.deliveryreview.di;

import IZ.a;
import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;

/* loaded from: classes6.dex */
public final class DeliveryReviewNavigationModule_ProvideDeeplinkHandlersSetFactory implements e<Set<a>> {
    public static Set<a> provideDeeplinkHandlersSet(AuthDestinationInterceptor authDestinationInterceptor) {
        Set<a> provideDeeplinkHandlersSet = DeliveryReviewNavigationModule.provideDeeplinkHandlersSet(authDestinationInterceptor);
        j.d(provideDeeplinkHandlersSet);
        return provideDeeplinkHandlersSet;
    }
}
