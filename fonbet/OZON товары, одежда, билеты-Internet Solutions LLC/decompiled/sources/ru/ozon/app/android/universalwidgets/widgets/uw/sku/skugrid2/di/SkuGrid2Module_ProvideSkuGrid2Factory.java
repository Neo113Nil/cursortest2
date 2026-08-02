package ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid2.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.product.common.footer.FooterViewMapper;
import ru.ozon.app.android.product.common.header.HeaderWidgetViewMapper;
import ru.ozon.app.android.product.common.richheader.presentation.RichHeaderViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.separator.SkuSeparatorViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid2.data.SkuGrid2Config;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid2.presentation.SkuGrid2ThinViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid2.presentation.SkuGrid2ViewMapper;

/* loaded from: classes7.dex */
public final class SkuGrid2Module_ProvideSkuGrid2Factory implements e<Widget2> {
    public static Widget2 provideSkuGrid2(SkuGrid2Config skuGrid2Config, SkuGrid2ViewMapper skuGrid2ViewMapper, SkuGrid2ThinViewMapper skuGrid2ThinViewMapper, HeaderWidgetViewMapper headerWidgetViewMapper, FooterViewMapper footerViewMapper, RichHeaderViewMapper richHeaderViewMapper, SkuSeparatorViewMapper skuSeparatorViewMapper) {
        Widget2 provideSkuGrid2 = SkuGrid2Module.INSTANCE.provideSkuGrid2(skuGrid2Config, skuGrid2ViewMapper, skuGrid2ThinViewMapper, headerWidgetViewMapper, footerViewMapper, richHeaderViewMapper, skuSeparatorViewMapper);
        j.d(provideSkuGrid2);
        return provideSkuGrid2;
    }
}
