package ru.ozon.app.android.common.productselectormobile.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.common.productselectormobile.core.ProductSelectorMobileConfig;
import ru.ozon.app.android.common.productselectormobile.core.ProductSelectorMobileViewMapper;
import ru.ozon.app.android.composer.di.Widget;

/* loaded from: classes6.dex */
public final class ProductSelectorMobileModule_ProvideExportWidgetsFactory implements e<Set<Widget>> {
    public static Set<Widget> provideExportWidgets(ProductSelectorMobileConfig productSelectorMobileConfig, ProductSelectorMobileViewMapper productSelectorMobileViewMapper) {
        Set<Widget> provideExportWidgets = ProductSelectorMobileModule.INSTANCE.provideExportWidgets(productSelectorMobileConfig, productSelectorMobileViewMapper);
        j.d(provideExportWidgets);
        return provideExportWidgets;
    }
}
