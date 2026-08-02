package ru.ozon.app.android.orderdetails.di;

import IZ.a;
import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.data.repository.OrderDetailsScrollToShipmentRepository;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes6.dex */
public final class OrderDetailsNavigationModule_ProvideDeeplinkHandlersSetFactory implements e<Set<a>> {
    public static Set<a> provideDeeplinkHandlersSet(AuthDestinationInterceptor authDestinationInterceptor, OrderDetailsScrollToShipmentRepository orderDetailsScrollToShipmentRepository, AppType appType, BZ.e eVar) {
        Set<a> provideDeeplinkHandlersSet = OrderDetailsNavigationModule.provideDeeplinkHandlersSet(authDestinationInterceptor, orderDetailsScrollToShipmentRepository, appType, eVar);
        j.d(provideDeeplinkHandlersSet);
        return provideDeeplinkHandlersSet;
    }
}
