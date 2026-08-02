package ru.ozon.app.android.sellerproducts.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.sellerproducts.header.HeaderWidgetViewMapper;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.SellerProductsWidgetConfig;
import ru.ozon.app.android.sellerproducts.sellerProducts.presentation.SellerProductsViewMapper;

/* loaded from: classes7.dex */
public final class SellerProductsWidgetsModule_ProvideWidgetFactory implements e<Set<Widget2>> {
    public static Set<Widget2> provideWidget(SellerProductsWidgetsModule sellerProductsWidgetsModule, SellerProductsWidgetConfig sellerProductsWidgetConfig, SellerProductsViewMapper sellerProductsViewMapper, HeaderWidgetViewMapper headerWidgetViewMapper) {
        Set<Widget2> provideWidget = sellerProductsWidgetsModule.provideWidget(sellerProductsWidgetConfig, sellerProductsViewMapper, headerWidgetViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
