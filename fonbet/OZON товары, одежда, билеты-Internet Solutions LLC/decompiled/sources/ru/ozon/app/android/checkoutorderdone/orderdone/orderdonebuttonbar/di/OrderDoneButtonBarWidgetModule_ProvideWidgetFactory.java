package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.core.OrderDoneButtonBarConfig;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.core.OrderDoneButtonBarStickyWidgetViewMapper;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.core.OrderDoneButtonBarWidgetViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class OrderDoneButtonBarWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(OrderDoneButtonBarWidgetModule orderDoneButtonBarWidgetModule, OrderDoneButtonBarConfig orderDoneButtonBarConfig, OrderDoneButtonBarStickyWidgetViewMapper orderDoneButtonBarStickyWidgetViewMapper, OrderDoneButtonBarWidgetViewMapper orderDoneButtonBarWidgetViewMapper) {
        Widget2 provideWidget = orderDoneButtonBarWidgetModule.provideWidget(orderDoneButtonBarConfig, orderDoneButtonBarStickyWidgetViewMapper, orderDoneButtonBarWidgetViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
