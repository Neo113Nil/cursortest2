package ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.data.OrderStatusV3Config;
import ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.presentation.OrderStatusV3ViewMapper;

/* loaded from: classes6.dex */
public final class OrderStatusV3WidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(OrderStatusV3WidgetModule orderStatusV3WidgetModule, OrderStatusV3Config orderStatusV3Config, OrderStatusV3ViewMapper orderStatusV3ViewMapper) {
        Widget2 provideWidget = orderStatusV3WidgetModule.provideWidget(orderStatusV3Config, orderStatusV3ViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
