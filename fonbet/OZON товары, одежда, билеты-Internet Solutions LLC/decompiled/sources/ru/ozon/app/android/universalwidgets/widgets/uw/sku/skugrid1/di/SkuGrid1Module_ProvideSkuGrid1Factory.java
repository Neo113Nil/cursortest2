package ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid1.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.product.common.footer.FooterViewMapper;
import ru.ozon.app.android.product.common.header.HeaderWidgetViewMapper;
import ru.ozon.app.android.product.common.richheader.presentation.RichHeaderViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid1.data.SkuGrid1Config;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid1.presentation.SkuGrid1ViewMapper;

/* loaded from: classes7.dex */
public final class SkuGrid1Module_ProvideSkuGrid1Factory implements e<Widget2> {
    public static Widget2 provideSkuGrid1(SkuGrid1Config skuGrid1Config, SkuGrid1ViewMapper skuGrid1ViewMapper, HeaderWidgetViewMapper headerWidgetViewMapper, FooterViewMapper footerViewMapper, RichHeaderViewMapper richHeaderViewMapper) {
        Widget2 provideSkuGrid1 = SkuGrid1Module.INSTANCE.provideSkuGrid1(skuGrid1Config, skuGrid1ViewMapper, headerWidgetViewMapper, footerViewMapper, richHeaderViewMapper);
        j.d(provideSkuGrid1);
        return provideSkuGrid1;
    }
}
