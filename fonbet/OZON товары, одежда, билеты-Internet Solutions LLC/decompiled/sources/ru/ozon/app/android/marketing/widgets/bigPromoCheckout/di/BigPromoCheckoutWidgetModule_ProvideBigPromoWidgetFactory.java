package ru.ozon.app.android.marketing.widgets.bigPromoCheckout.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.marketing.widgets.bigPromoCheckout.core.BigPromoCheckoutConfig;
import ru.ozon.app.android.marketing.widgets.bigPromoCheckout.core.BigPromoCheckoutViewMapper;

/* loaded from: classes6.dex */
public final class BigPromoCheckoutWidgetModule_ProvideBigPromoWidgetFactory implements e<Widget2> {
    public static Widget2 provideBigPromoWidget(BigPromoCheckoutWidgetModule bigPromoCheckoutWidgetModule, BigPromoCheckoutConfig bigPromoCheckoutConfig, BigPromoCheckoutViewMapper bigPromoCheckoutViewMapper) {
        Widget2 provideBigPromoWidget = bigPromoCheckoutWidgetModule.provideBigPromoWidget(bigPromoCheckoutConfig, bigPromoCheckoutViewMapper);
        j.d(provideBigPromoWidget);
        return provideBigPromoWidget;
    }
}
