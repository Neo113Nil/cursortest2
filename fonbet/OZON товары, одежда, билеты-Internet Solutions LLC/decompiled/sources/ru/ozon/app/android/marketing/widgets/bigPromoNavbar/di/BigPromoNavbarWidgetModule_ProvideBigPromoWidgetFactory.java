package ru.ozon.app.android.marketing.widgets.bigPromoNavbar.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.marketing.widgets.bigPromoNavbar.core.BigPromoNavbarConfig;
import ru.ozon.app.android.marketing.widgets.bigPromoNavbar.core.BigPromoNavbarViewMapper;

/* loaded from: classes6.dex */
public final class BigPromoNavbarWidgetModule_ProvideBigPromoWidgetFactory implements e<Widget2> {
    public static Widget2 provideBigPromoWidget(BigPromoNavbarConfig bigPromoNavbarConfig, BigPromoNavbarViewMapper bigPromoNavbarViewMapper) {
        Widget2 provideBigPromoWidget = BigPromoNavbarWidgetModule.INSTANCE.provideBigPromoWidget(bigPromoNavbarConfig, bigPromoNavbarViewMapper);
        j.d(provideBigPromoWidget);
        return provideBigPromoWidget;
    }
}
