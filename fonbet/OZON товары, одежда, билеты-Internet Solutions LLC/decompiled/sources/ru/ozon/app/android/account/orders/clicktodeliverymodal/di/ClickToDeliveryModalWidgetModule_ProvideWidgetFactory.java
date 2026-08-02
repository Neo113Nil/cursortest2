package ru.ozon.app.android.account.orders.clicktodeliverymodal.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.core.ClickToDeliveryModalConfig;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.core.buttons.ButtonsViewMapper;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.core.delivery.DeliveryViewMapper;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.core.title.TitleViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.separator.core.SeparatorViewMapper;

/* loaded from: classes6.dex */
public final class ClickToDeliveryModalWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(ClickToDeliveryModalWidgetModule clickToDeliveryModalWidgetModule, ClickToDeliveryModalConfig clickToDeliveryModalConfig, SeparatorViewMapper separatorViewMapper, TitleViewMapper titleViewMapper, ButtonsViewMapper buttonsViewMapper, DeliveryViewMapper deliveryViewMapper) {
        Widget2 provideWidget = clickToDeliveryModalWidgetModule.provideWidget(clickToDeliveryModalConfig, separatorViewMapper, titleViewMapper, buttonsViewMapper, deliveryViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
