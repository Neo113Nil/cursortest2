package ru.ozon.app.android.common.twocards.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.common.twocards.core.TwoCardsConfig;
import ru.ozon.app.android.common.twocards.core.TwoCardsViewMapper;
import ru.ozon.app.android.composer.di.Widget;

/* loaded from: classes6.dex */
public final class TwoCardsModule_ProvideTwoCardsWidgetFactory implements e<Widget> {
    public static Widget provideTwoCardsWidget(TwoCardsConfig twoCardsConfig, TwoCardsViewMapper twoCardsViewMapper) {
        Widget provideTwoCardsWidget = TwoCardsModule.provideTwoCardsWidget(twoCardsConfig, twoCardsViewMapper);
        j.d(provideTwoCardsWidget);
        return provideTwoCardsWidget;
    }
}
