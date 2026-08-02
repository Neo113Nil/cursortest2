package ru.ozon.app.android.separator.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.separator.core.SeparatorConfig;
import ru.ozon.app.android.separator.core.SeparatorViewMapper;

/* loaded from: classes7.dex */
public final class SeparatorModule_ProvideSeparatorWidgetFactory implements e<Widget2> {
    public static Widget2 provideSeparatorWidget(SeparatorConfig separatorConfig, SeparatorViewMapper separatorViewMapper) {
        Widget2 provideSeparatorWidget = SeparatorModule.INSTANCE.provideSeparatorWidget(separatorConfig, separatorViewMapper);
        j.d(provideSeparatorWidget);
        return provideSeparatorWidget;
    }
}
