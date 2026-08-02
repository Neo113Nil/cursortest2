package ru.ozon.app.android.product.skuthinscroll.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.product.skuthinscroll.data.SkuThinScrollConfig;
import ru.ozon.app.android.product.skuthinscroll.presentation.SkuThinScrollViewMapper;

/* loaded from: classes7.dex */
public final class SkuThinScrollModule_ProvideSkuThinScrollModuleWidgetFactory implements e<Widget2> {
    public static Widget2 provideSkuThinScrollModuleWidget(SkuThinScrollConfig skuThinScrollConfig, SkuThinScrollViewMapper skuThinScrollViewMapper) {
        Widget2 provideSkuThinScrollModuleWidget = SkuThinScrollModule.INSTANCE.provideSkuThinScrollModuleWidget(skuThinScrollConfig, skuThinScrollViewMapper);
        j.d(provideSkuThinScrollModuleWidget);
        return provideSkuThinScrollModuleWidget;
    }
}
