package ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid3.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.product.common.footer.FooterViewMapper;
import ru.ozon.app.android.product.common.header.HeaderWidgetViewMapper;
import ru.ozon.app.android.product.common.richheader.presentation.RichHeaderViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.separator.SkuSeparatorViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid3.data.SkuGrid3Config;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid3.presentation.SkuGrid3ThinViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid3.presentation.SkuGrid3ViewMapper;

/* loaded from: classes7.dex */
public final class SkuGrid3Module_ProvideSkuGrid3Factory implements e<Widget2> {
    public static Widget2 provideSkuGrid3(SkuGrid3Config skuGrid3Config, SkuGrid3ViewMapper skuGrid3ViewMapper, SkuGrid3ThinViewMapper skuGrid3ThinViewMapper, HeaderWidgetViewMapper headerWidgetViewMapper, FooterViewMapper footerViewMapper, RichHeaderViewMapper richHeaderViewMapper, SkuSeparatorViewMapper skuSeparatorViewMapper) {
        Widget2 provideSkuGrid3 = SkuGrid3Module.INSTANCE.provideSkuGrid3(skuGrid3Config, skuGrid3ViewMapper, skuGrid3ThinViewMapper, headerWidgetViewMapper, footerViewMapper, richHeaderViewMapper, skuSeparatorViewMapper);
        j.d(provideSkuGrid3);
        return provideSkuGrid3;
    }
}
