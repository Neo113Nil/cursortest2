package ru.ozon.app.android.fresh.geo.widgets.orderInfo.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.geo.widgets.orderInfo.data.OrderInfoConfig;
import ru.ozon.app.android.fresh.geo.widgets.orderInfo.presentation.OrderInfoViewMapper;

/* loaded from: classes6.dex */
public final class OrderInfoWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(OrderInfoWidgetModule orderInfoWidgetModule, OrderInfoConfig orderInfoConfig, OrderInfoViewMapper orderInfoViewMapper) {
        Widget2 provideWidget = orderInfoWidgetModule.provideWidget(orderInfoConfig, orderInfoViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
