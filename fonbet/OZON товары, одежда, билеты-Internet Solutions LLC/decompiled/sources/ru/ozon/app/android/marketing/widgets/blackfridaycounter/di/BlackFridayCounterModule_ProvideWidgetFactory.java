package ru.ozon.app.android.marketing.widgets.blackfridaycounter.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.marketing.widgets.blackfridaycounter.core.BlackFridayCounterConfig;
import ru.ozon.app.android.marketing.widgets.blackfridaycounter.core.BlackFridayCounterViewMapper;

/* loaded from: classes6.dex */
public final class BlackFridayCounterModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(BlackFridayCounterConfig blackFridayCounterConfig, BlackFridayCounterViewMapper blackFridayCounterViewMapper) {
        Widget2 provideWidget = BlackFridayCounterModule.INSTANCE.provideWidget(blackFridayCounterConfig, blackFridayCounterViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
