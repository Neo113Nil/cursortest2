package ru.ozon.app.android.fresh.unsorted.widgets.bottomContainer.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomContainer.data.BottomContainerConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomContainer.presentation.BottomContainerViewMapper;

/* loaded from: classes6.dex */
public final class BottomContainerWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(BottomContainerWidgetModule bottomContainerWidgetModule, BottomContainerConfig bottomContainerConfig, BottomContainerViewMapper bottomContainerViewMapper) {
        Widget2 provideWidget = bottomContainerWidgetModule.provideWidget(bottomContainerConfig, bottomContainerViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
