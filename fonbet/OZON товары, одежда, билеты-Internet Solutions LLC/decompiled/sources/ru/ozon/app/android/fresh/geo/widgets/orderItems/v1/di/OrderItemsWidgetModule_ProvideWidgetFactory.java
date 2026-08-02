package ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.data.OrderItemsConfig;
import ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.presentation.items.OrderItemsViewMapper;
import ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.presentation.title.OrderItemsTitleViewMapper;

/* loaded from: classes6.dex */
public final class OrderItemsWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(OrderItemsWidgetModule orderItemsWidgetModule, OrderItemsConfig orderItemsConfig, OrderItemsTitleViewMapper orderItemsTitleViewMapper, OrderItemsViewMapper orderItemsViewMapper) {
        Widget2 provideWidget = orderItemsWidgetModule.provideWidget(orderItemsConfig, orderItemsTitleViewMapper, orderItemsViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
