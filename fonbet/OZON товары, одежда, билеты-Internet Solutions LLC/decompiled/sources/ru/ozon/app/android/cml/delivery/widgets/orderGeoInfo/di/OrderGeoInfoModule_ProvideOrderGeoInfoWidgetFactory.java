package ru.ozon.app.android.cml.delivery.widgets.orderGeoInfo.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.cml.delivery.widgets.orderGeoInfo.data.OrderGeoInfoConfig;
import ru.ozon.app.android.cml.delivery.widgets.orderGeoInfo.presentation.OrderGeoInfoViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class OrderGeoInfoModule_ProvideOrderGeoInfoWidgetFactory implements e<Widget2> {
    public static Widget2 provideOrderGeoInfoWidget(OrderGeoInfoConfig orderGeoInfoConfig, OrderGeoInfoViewMapper orderGeoInfoViewMapper) {
        Widget2 provideOrderGeoInfoWidget = OrderGeoInfoModule.INSTANCE.provideOrderGeoInfoWidget(orderGeoInfoConfig, orderGeoInfoViewMapper);
        j.d(provideOrderGeoInfoWidget);
        return provideOrderGeoInfoWidget;
    }
}
