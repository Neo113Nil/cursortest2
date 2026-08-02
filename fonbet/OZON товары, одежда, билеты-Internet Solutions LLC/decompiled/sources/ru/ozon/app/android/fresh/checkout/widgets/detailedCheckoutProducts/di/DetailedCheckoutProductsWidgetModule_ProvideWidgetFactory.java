package ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.data.DetailedCheckoutProductsConfig;
import ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.presentation.DetailedCheckoutProductsViewMapper;
import ru.ozon.app.android.fresh.common.widgets.header.HeaderApi;

/* loaded from: classes6.dex */
public final class DetailedCheckoutProductsWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(DetailedCheckoutProductsWidgetModule detailedCheckoutProductsWidgetModule, DetailedCheckoutProductsConfig detailedCheckoutProductsConfig, DetailedCheckoutProductsViewMapper detailedCheckoutProductsViewMapper, HeaderApi headerApi) {
        Widget2 provideWidget = detailedCheckoutProductsWidgetModule.provideWidget(detailedCheckoutProductsConfig, detailedCheckoutProductsViewMapper, headerApi);
        j.d(provideWidget);
        return provideWidget;
    }
}
