package ru.ozon.app.android.account.orders.orderlist.v2.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.account.orders.orderlist.v2.OrderListViewMapper;
import ru.ozon.app.android.account.orders.orderlist.v2.data.OrderListConfig;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class OrderListModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(OrderListModule orderListModule, OrderListConfig orderListConfig, OrderListViewMapper orderListViewMapper) {
        Widget2 provideWidget = orderListModule.provideWidget(orderListConfig, orderListViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
