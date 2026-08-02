package ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.data.FreshPaymentInfoConfig;
import ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.presentation.FreshPaymentInfoViewMapper;

/* loaded from: classes6.dex */
public final class FreshPaymentInfoWidgetModule_ProvidePaymentInfoV2WidgetFactory implements e<Widget2> {
    public static Widget2 providePaymentInfoV2Widget(FreshPaymentInfoConfig freshPaymentInfoConfig, FreshPaymentInfoViewMapper freshPaymentInfoViewMapper) {
        Widget2 providePaymentInfoV2Widget = FreshPaymentInfoWidgetModule.INSTANCE.providePaymentInfoV2Widget(freshPaymentInfoConfig, freshPaymentInfoViewMapper);
        j.d(providePaymentInfoV2Widget);
        return providePaymentInfoV2Widget;
    }
}
