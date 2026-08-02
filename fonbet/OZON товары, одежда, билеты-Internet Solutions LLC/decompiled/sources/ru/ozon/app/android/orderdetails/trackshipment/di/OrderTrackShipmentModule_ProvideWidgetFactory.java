package ru.ozon.app.android.orderdetails.trackshipment.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.orderdetails.trackshipment.data.OrderTrackShipmentConfig;
import ru.ozon.app.android.orderdetails.trackshipment.presentation.OrderTrackShipmentViewMapper;

/* loaded from: classes6.dex */
public final class OrderTrackShipmentModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(OrderTrackShipmentModule orderTrackShipmentModule, OrderTrackShipmentConfig orderTrackShipmentConfig, OrderTrackShipmentViewMapper orderTrackShipmentViewMapper) {
        Widget2 provideWidget = orderTrackShipmentModule.provideWidget(orderTrackShipmentConfig, orderTrackShipmentViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
