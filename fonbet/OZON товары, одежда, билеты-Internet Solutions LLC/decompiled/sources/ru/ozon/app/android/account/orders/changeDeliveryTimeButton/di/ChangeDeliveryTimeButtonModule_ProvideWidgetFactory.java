package ru.ozon.app.android.account.orders.changeDeliveryTimeButton.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.account.orders.changeDeliveryTimeButton.data.ChangeDeliveryTimeButtonConfig;
import ru.ozon.app.android.account.orders.changeDeliveryTimeButton.presentation.ChangeDeliveryTimeButtonViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class ChangeDeliveryTimeButtonModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(ChangeDeliveryTimeButtonModule changeDeliveryTimeButtonModule, ChangeDeliveryTimeButtonConfig changeDeliveryTimeButtonConfig, ChangeDeliveryTimeButtonViewMapper changeDeliveryTimeButtonViewMapper) {
        Widget2 provideWidget = changeDeliveryTimeButtonModule.provideWidget(changeDeliveryTimeButtonConfig, changeDeliveryTimeButtonViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
