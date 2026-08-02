package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonetotal.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonetotal.core.OrderDoneTotalConfig;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonetotal.core.OrderDoneTotalElementViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class OrderDoneTotalWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(OrderDoneTotalWidgetModule orderDoneTotalWidgetModule, OrderDoneTotalConfig orderDoneTotalConfig, OrderDoneTotalElementViewMapper orderDoneTotalElementViewMapper) {
        Widget2 provideWidget = orderDoneTotalWidgetModule.provideWidget(orderDoneTotalConfig, orderDoneTotalElementViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
