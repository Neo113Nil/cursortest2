package ru.ozon.app.android.account.orders.orderfilters.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.account.orders.orderfilters.core.OrderFiltersConfig;
import ru.ozon.app.android.account.orders.orderfilters.core.OrderFiltersViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class OrderFiltersModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(OrderFiltersModule orderFiltersModule, OrderFiltersConfig orderFiltersConfig, OrderFiltersViewMapper orderFiltersViewMapper) {
        Widget2 provideWidget = orderFiltersModule.provideWidget(orderFiltersConfig, orderFiltersViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
