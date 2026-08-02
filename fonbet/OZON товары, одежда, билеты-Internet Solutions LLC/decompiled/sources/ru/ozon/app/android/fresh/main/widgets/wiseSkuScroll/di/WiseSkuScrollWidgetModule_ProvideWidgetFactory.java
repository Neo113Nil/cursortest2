package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.core.WiseSkuScrollConfig;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.core.WiseSkuScrollViewMapper;

/* loaded from: classes6.dex */
public final class WiseSkuScrollWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(WiseSkuScrollWidgetModule wiseSkuScrollWidgetModule, WiseSkuScrollConfig wiseSkuScrollConfig, WiseSkuScrollViewMapper wiseSkuScrollViewMapper) {
        Widget2 provideWidget = wiseSkuScrollWidgetModule.provideWidget(wiseSkuScrollConfig, wiseSkuScrollViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
