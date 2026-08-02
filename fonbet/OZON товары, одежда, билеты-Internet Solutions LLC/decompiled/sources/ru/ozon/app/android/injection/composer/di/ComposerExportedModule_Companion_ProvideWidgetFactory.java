package ru.ozon.app.android.injection.composer.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.search.catalog.components.meta.MetaWidgetConfig;
import ru.ozon.app.android.search.catalog.components.meta.MetaWidgetViewMapper;

/* loaded from: classes6.dex */
public final class ComposerExportedModule_Companion_ProvideWidgetFactory implements e<Set<Widget>> {
    public static Set<Widget> provideWidget(MetaWidgetConfig metaWidgetConfig, MetaWidgetViewMapper metaWidgetViewMapper) {
        Set<Widget> provideWidget = ComposerExportedModule.INSTANCE.provideWidget(metaWidgetConfig, metaWidgetViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
