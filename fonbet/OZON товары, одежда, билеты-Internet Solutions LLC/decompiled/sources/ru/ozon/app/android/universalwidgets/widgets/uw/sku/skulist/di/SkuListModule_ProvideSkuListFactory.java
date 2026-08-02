package ru.ozon.app.android.universalwidgets.widgets.uw.sku.skulist.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.product.common.footer.FooterViewMapper;
import ru.ozon.app.android.product.common.header.HeaderWidgetViewMapper;
import ru.ozon.app.android.product.common.richheader.presentation.RichHeaderViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skulist.data.SkuListConfig;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skulist.presentation.SkuListViewMapper;

/* loaded from: classes7.dex */
public final class SkuListModule_ProvideSkuListFactory implements e<Widget2> {
    public static Widget2 provideSkuList(SkuListConfig skuListConfig, SkuListViewMapper skuListViewMapper, HeaderWidgetViewMapper headerWidgetViewMapper, FooterViewMapper footerViewMapper, RichHeaderViewMapper richHeaderViewMapper) {
        Widget2 provideSkuList = SkuListModule.INSTANCE.provideSkuList(skuListConfig, skuListViewMapper, headerWidgetViewMapper, footerViewMapper, richHeaderViewMapper);
        j.d(provideSkuList);
        return provideSkuList;
    }
}
