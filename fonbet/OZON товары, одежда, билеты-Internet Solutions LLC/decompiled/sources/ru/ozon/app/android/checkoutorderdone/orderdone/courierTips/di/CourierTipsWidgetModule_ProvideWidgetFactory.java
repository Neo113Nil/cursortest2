package ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.data.CourierTipsConfig;
import ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.presentation.CourierTipsViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class CourierTipsWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(CourierTipsWidgetModule courierTipsWidgetModule, CourierTipsConfig courierTipsConfig, CourierTipsViewMapper courierTipsViewMapper) {
        Widget2 provideWidget = courierTipsWidgetModule.provideWidget(courierTipsConfig, courierTipsViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
