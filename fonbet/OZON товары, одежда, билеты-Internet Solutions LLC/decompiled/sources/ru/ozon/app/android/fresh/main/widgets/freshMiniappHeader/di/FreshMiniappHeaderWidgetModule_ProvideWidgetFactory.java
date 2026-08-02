package ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.data.FreshMiniappHeaderConfig;
import ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.presentation.FreshMiniappHeaderViewMapper;

/* loaded from: classes6.dex */
public final class FreshMiniappHeaderWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(FreshMiniappHeaderWidgetModule freshMiniappHeaderWidgetModule, FreshMiniappHeaderConfig freshMiniappHeaderConfig, FreshMiniappHeaderViewMapper freshMiniappHeaderViewMapper) {
        Widget2 provideWidget = freshMiniappHeaderWidgetModule.provideWidget(freshMiniappHeaderConfig, freshMiniappHeaderViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
