package ru.ozon.app.android.account.orders.productsPackage.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.account.orders.productsPackage.data.ProductsPackageConfig;
import ru.ozon.app.android.account.orders.productsPackage.presentation.ProductsPackageViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class ProductsPackageModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(ProductsPackageModule productsPackageModule, ProductsPackageConfig productsPackageConfig, ProductsPackageViewMapper productsPackageViewMapper) {
        Widget2 provideWidget = productsPackageModule.provideWidget(productsPackageConfig, productsPackageViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
