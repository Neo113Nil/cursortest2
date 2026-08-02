package ru.ozon.app.android.account.orders.selectPayment.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.account.orders.selectPayment.data.SelectPaymentConfig;
import ru.ozon.app.android.account.orders.selectPayment.presentation.SelectPaymentOverlayViewMapper;
import ru.ozon.app.android.account.orders.selectPayment.presentation.SelectPaymentViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class SelectPaymentModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(SelectPaymentModule selectPaymentModule, SelectPaymentConfig selectPaymentConfig, SelectPaymentViewMapper selectPaymentViewMapper, SelectPaymentOverlayViewMapper selectPaymentOverlayViewMapper) {
        Widget2 provideWidget = selectPaymentModule.provideWidget(selectPaymentConfig, selectPaymentViewMapper, selectPaymentOverlayViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
