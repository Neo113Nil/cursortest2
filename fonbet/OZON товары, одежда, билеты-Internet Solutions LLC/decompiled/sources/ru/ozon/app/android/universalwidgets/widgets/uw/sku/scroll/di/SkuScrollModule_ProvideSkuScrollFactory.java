package ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.product.common.footer.FooterViewMapper;
import ru.ozon.app.android.product.common.header.HeaderWidgetViewMapper;
import ru.ozon.app.android.product.common.richheader.presentation.RichHeaderViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.data.ScrollConfig;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.presentation.SkuScrollViewMapper;

/* loaded from: classes7.dex */
public final class SkuScrollModule_ProvideSkuScrollFactory implements e<Set<Widget2>> {
    public static Set<Widget2> provideSkuScroll(SkuScrollViewMapper skuScrollViewMapper, ScrollConfig scrollConfig, HeaderWidgetViewMapper headerWidgetViewMapper, FooterViewMapper footerViewMapper, RichHeaderViewMapper richHeaderViewMapper) {
        Set<Widget2> provideSkuScroll = SkuScrollModule.provideSkuScroll(skuScrollViewMapper, scrollConfig, headerWidgetViewMapper, footerViewMapper, richHeaderViewMapper);
        j.d(provideSkuScroll);
        return provideSkuScroll;
    }
}
