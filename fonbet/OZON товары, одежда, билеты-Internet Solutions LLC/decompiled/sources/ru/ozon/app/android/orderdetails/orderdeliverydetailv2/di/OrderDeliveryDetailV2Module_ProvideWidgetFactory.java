package ru.ozon.app.android.orderdetails.orderdeliverydetailv2.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.orderdetails.orderdeliverydetailv2.data.OrderDeliveryDetailV2Config;
import ru.ozon.app.android.orderdetails.orderdeliverydetailv2.presentation.actions.OrderDeliveryDetailV2ActionsViewMapper;
import ru.ozon.app.android.orderdetails.orderdeliverydetailv2.presentation.header.OrderDeliveryDetailV2HeaderViewMapper;
import ru.ozon.app.android.orderdetails.orderdeliverydetailv2.presentation.leaveatdoor.OrderDeliveryDetailV2LeaveAtDoorViewMapper;
import ru.ozon.app.android.orderdetails.orderdeliverydetailv2.presentation.lsatdivider.OrderDeliveryDetailV2LastDividerViewMapper;

/* loaded from: classes6.dex */
public final class OrderDeliveryDetailV2Module_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(OrderDeliveryDetailV2Module orderDeliveryDetailV2Module, OrderDeliveryDetailV2Config orderDeliveryDetailV2Config, OrderDeliveryDetailV2HeaderViewMapper orderDeliveryDetailV2HeaderViewMapper, OrderDeliveryDetailV2ActionsViewMapper orderDeliveryDetailV2ActionsViewMapper, OrderDeliveryDetailV2LeaveAtDoorViewMapper orderDeliveryDetailV2LeaveAtDoorViewMapper, OrderDeliveryDetailV2LastDividerViewMapper orderDeliveryDetailV2LastDividerViewMapper) {
        Widget2 provideWidget = orderDeliveryDetailV2Module.provideWidget(orderDeliveryDetailV2Config, orderDeliveryDetailV2HeaderViewMapper, orderDeliveryDetailV2ActionsViewMapper, orderDeliveryDetailV2LeaveAtDoorViewMapper, orderDeliveryDetailV2LastDividerViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
