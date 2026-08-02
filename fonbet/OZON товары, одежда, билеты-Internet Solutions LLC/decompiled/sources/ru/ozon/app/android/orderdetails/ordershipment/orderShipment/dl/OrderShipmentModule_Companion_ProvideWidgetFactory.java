package ru.ozon.app.android.orderdetails.ordershipment.orderShipment.dl;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.data.OrderShipmentConfig;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.action.ActionOrderShipmentViewMapper;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.annotation.AnnotationOrderShipmentViewMapper;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.posting.PositingOrderShipmentViewMapper;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.provider.StatusProviderOrderShipmentViewMapper;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.status.StatusOrderShipmentViewMapper;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.text.TextOrderShipmentViewMapper;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.title.TitleOrderShipmentViewMapper;

/* loaded from: classes6.dex */
public final class OrderShipmentModule_Companion_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(OrderShipmentConfig orderShipmentConfig, PositingOrderShipmentViewMapper positingOrderShipmentViewMapper, AnnotationOrderShipmentViewMapper annotationOrderShipmentViewMapper, ActionOrderShipmentViewMapper actionOrderShipmentViewMapper, StatusOrderShipmentViewMapper statusOrderShipmentViewMapper, TextOrderShipmentViewMapper textOrderShipmentViewMapper, TitleOrderShipmentViewMapper titleOrderShipmentViewMapper, StatusProviderOrderShipmentViewMapper statusProviderOrderShipmentViewMapper) {
        Widget2 provideWidget = OrderShipmentModule.INSTANCE.provideWidget(orderShipmentConfig, positingOrderShipmentViewMapper, annotationOrderShipmentViewMapper, actionOrderShipmentViewMapper, statusOrderShipmentViewMapper, textOrderShipmentViewMapper, titleOrderShipmentViewMapper, statusProviderOrderShipmentViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
