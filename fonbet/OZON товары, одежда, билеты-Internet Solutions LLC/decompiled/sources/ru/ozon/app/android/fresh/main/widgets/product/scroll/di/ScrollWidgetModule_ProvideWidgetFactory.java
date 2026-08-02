package ru.ozon.app.android.fresh.main.widgets.product.scroll.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.main.widgets.product.common.footer.FooterViewMapper;
import ru.ozon.app.android.fresh.main.widgets.product.common.header.HeaderWidgetViewMapper;
import ru.ozon.app.android.fresh.main.widgets.product.common.richheader.presentation.RichHeaderViewMapper;
import ru.ozon.app.android.fresh.main.widgets.product.scroll.data.ScrollConfig;
import ru.ozon.app.android.fresh.main.widgets.product.scroll.presentation.ScrollViewMapper;

/* loaded from: classes6.dex */
public final class ScrollWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(ScrollWidgetModule scrollWidgetModule, ScrollViewMapper scrollViewMapper, HeaderWidgetViewMapper headerWidgetViewMapper, RichHeaderViewMapper richHeaderViewMapper, FooterViewMapper footerViewMapper, ScrollConfig scrollConfig) {
        Widget2 provideWidget = scrollWidgetModule.provideWidget(scrollViewMapper, headerWidgetViewMapper, richHeaderViewMapper, footerViewMapper, scrollConfig);
        j.d(provideWidget);
        return provideWidget;
    }
}
