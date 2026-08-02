package ru.ozon.app.android.orderdetails.orderdetailsitem.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.orderdetails.orderdetailsitem.core.OrderDetailsItemConfig;
import ru.ozon.app.android.orderdetails.orderdetailsitem.core.OrderDetailsItemViewMapper;

/* loaded from: classes6.dex */
public final class OrderDetailsItemModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(OrderDetailsItemModule orderDetailsItemModule, OrderDetailsItemConfig orderDetailsItemConfig, OrderDetailsItemViewMapper orderDetailsItemViewMapper) {
        Widget2 provideWidget = orderDetailsItemModule.provideWidget(orderDetailsItemConfig, orderDetailsItemViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
