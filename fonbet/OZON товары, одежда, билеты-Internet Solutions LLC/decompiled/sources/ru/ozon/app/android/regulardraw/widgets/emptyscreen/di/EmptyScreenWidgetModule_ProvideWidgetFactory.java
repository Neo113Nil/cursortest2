package ru.ozon.app.android.regulardraw.widgets.emptyscreen.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.core.EmptyScreenConfig;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.core.button.EmptyScreenButtonViewMapper;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.core.main.EmptyScreenViewMapper;

/* loaded from: classes7.dex */
public final class EmptyScreenWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(EmptyScreenWidgetModule emptyScreenWidgetModule, EmptyScreenConfig emptyScreenConfig, EmptyScreenViewMapper emptyScreenViewMapper, EmptyScreenButtonViewMapper emptyScreenButtonViewMapper) {
        Widget2 provideWidget = emptyScreenWidgetModule.provideWidget(emptyScreenConfig, emptyScreenViewMapper, emptyScreenButtonViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
