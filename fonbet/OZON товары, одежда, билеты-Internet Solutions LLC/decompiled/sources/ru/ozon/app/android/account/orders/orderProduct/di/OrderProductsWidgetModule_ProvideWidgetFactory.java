package ru.ozon.app.android.account.orders.orderProduct.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.account.orders.orderProduct.core.OrderProductsConfig;
import ru.ozon.app.android.account.orders.orderProduct.presentation.item.OrderProductItemViewMapper;
import ru.ozon.app.android.account.orders.orderProduct.presentation.separator.OrderProductSeparatorViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class OrderProductsWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(OrderProductsWidgetModule orderProductsWidgetModule, OrderProductsConfig orderProductsConfig, OrderProductItemViewMapper orderProductItemViewMapper, OrderProductSeparatorViewMapper orderProductSeparatorViewMapper) {
        Widget2 provideWidget = orderProductsWidgetModule.provideWidget(orderProductsConfig, orderProductItemViewMapper, orderProductSeparatorViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
