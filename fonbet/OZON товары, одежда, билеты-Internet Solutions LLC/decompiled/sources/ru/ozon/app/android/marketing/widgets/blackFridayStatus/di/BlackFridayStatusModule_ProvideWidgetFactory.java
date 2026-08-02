package ru.ozon.app.android.marketing.widgets.blackFridayStatus.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.core.BlackFridayStatusConfig;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.core.BlackFridayStatusImageTitleViewMapper;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.core.BlackFridayStatusTextTitleViewMapper;

/* loaded from: classes6.dex */
public final class BlackFridayStatusModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(BlackFridayStatusConfig blackFridayStatusConfig, BlackFridayStatusTextTitleViewMapper blackFridayStatusTextTitleViewMapper, BlackFridayStatusImageTitleViewMapper blackFridayStatusImageTitleViewMapper) {
        Widget2 provideWidget = BlackFridayStatusModule.INSTANCE.provideWidget(blackFridayStatusConfig, blackFridayStatusTextTitleViewMapper, blackFridayStatusImageTitleViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
