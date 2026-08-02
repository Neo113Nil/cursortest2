package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonecrossbutton.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonecrossbutton.core.OrderDoneCrossButtonConfig;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonecrossbutton.core.OrderDoneCrossButtonWidgetViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class OrderDoneCrossButtonWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(OrderDoneCrossButtonWidgetModule orderDoneCrossButtonWidgetModule, OrderDoneCrossButtonConfig orderDoneCrossButtonConfig, OrderDoneCrossButtonWidgetViewMapper orderDoneCrossButtonWidgetViewMapper) {
        Widget2 provideWidget = orderDoneCrossButtonWidgetModule.provideWidget(orderDoneCrossButtonConfig, orderDoneCrossButtonWidgetViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
