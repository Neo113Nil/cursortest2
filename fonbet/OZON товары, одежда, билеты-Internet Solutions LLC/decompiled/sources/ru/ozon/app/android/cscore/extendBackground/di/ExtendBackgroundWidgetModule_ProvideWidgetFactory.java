package ru.ozon.app.android.cscore.extendBackground.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.cscore.extendBackground.core.ExtendBackgroundConfig;
import ru.ozon.app.android.cscore.extendBackground.presentation.ExtendBackgroundViewMapper;

/* loaded from: classes6.dex */
public final class ExtendBackgroundWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(ExtendBackgroundWidgetModule extendBackgroundWidgetModule, ExtendBackgroundConfig extendBackgroundConfig, ExtendBackgroundViewMapper extendBackgroundViewMapper) {
        Widget2 provideWidget = extendBackgroundWidgetModule.provideWidget(extendBackgroundConfig, extendBackgroundViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
