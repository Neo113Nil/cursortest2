package ru.ozon.app.android.orderdetails.customsfees.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.orderdetails.customsfees.core.CustomsFeesConfig;
import ru.ozon.app.android.orderdetails.customsfees.core.CustomsFeesViewMapper;

/* loaded from: classes6.dex */
public final class CustomsFeesModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(CustomsFeesModule customsFeesModule, CustomsFeesConfig customsFeesConfig, CustomsFeesViewMapper customsFeesViewMapper) {
        Widget2 provideWidget = customsFeesModule.provideWidget(customsFeesConfig, customsFeesViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
