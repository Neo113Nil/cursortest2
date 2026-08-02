package ru.ozon.app.android.marketing.widgets.bigPromoPDP.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.marketing.widgets.bigPromoPDP.core.BigPromoPDPConfig;
import ru.ozon.app.android.marketing.widgets.bigPromoPDP.core.BigPromoPDPViewMapper;

/* loaded from: classes6.dex */
public final class BigPromoPDPWidgetModule_ProvideBigPromoWidgetFactory implements e<Widget2> {
    public static Widget2 provideBigPromoWidget(BigPromoPDPConfig bigPromoPDPConfig, BigPromoPDPViewMapper bigPromoPDPViewMapper) {
        Widget2 provideBigPromoWidget = BigPromoPDPWidgetModule.INSTANCE.provideBigPromoWidget(bigPromoPDPConfig, bigPromoPDPViewMapper);
        j.d(provideBigPromoWidget);
        return provideBigPromoWidget;
    }
}
