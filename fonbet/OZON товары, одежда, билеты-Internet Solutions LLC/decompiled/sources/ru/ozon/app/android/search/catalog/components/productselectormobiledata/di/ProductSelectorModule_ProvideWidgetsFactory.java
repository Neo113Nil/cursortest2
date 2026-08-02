package ru.ozon.app.android.search.catalog.components.productselectormobiledata.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.allstep.ProductSelectorDataAllStepNoUiViewMapper;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.data.ProductSelectorMobileDataConfig;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.ProductSelectorDataConcreteStepNoUiViewMapper;

/* loaded from: classes7.dex */
public final class ProductSelectorModule_ProvideWidgetsFactory implements e<Set<Widget>> {
    public static Set<Widget> provideWidgets(ProductSelectorMobileDataConfig productSelectorMobileDataConfig, ProductSelectorDataAllStepNoUiViewMapper productSelectorDataAllStepNoUiViewMapper, ProductSelectorDataConcreteStepNoUiViewMapper productSelectorDataConcreteStepNoUiViewMapper) {
        Set<Widget> provideWidgets = ProductSelectorModule.provideWidgets(productSelectorMobileDataConfig, productSelectorDataAllStepNoUiViewMapper, productSelectorDataConcreteStepNoUiViewMapper);
        j.d(provideWidgets);
        return provideWidgets;
    }
}
