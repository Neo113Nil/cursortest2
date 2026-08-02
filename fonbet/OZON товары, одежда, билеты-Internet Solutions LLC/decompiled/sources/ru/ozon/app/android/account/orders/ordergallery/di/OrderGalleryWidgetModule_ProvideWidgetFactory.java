package ru.ozon.app.android.account.orders.ordergallery.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.account.orders.ordergallery.core.OrderGalleryConfig;
import ru.ozon.app.android.account.orders.ordergallery.core.OrderGalleryViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class OrderGalleryWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(OrderGalleryWidgetModule orderGalleryWidgetModule, OrderGalleryConfig orderGalleryConfig, OrderGalleryViewMapper orderGalleryViewMapper) {
        Widget2 provideWidget = orderGalleryWidgetModule.provideWidget(orderGalleryConfig, orderGalleryViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
