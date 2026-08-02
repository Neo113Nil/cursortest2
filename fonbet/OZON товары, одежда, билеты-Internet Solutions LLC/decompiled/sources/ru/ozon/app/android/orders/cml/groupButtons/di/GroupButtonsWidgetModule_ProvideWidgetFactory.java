package ru.ozon.app.android.orders.cml.groupButtons.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.orders.cml.groupButtons.core.GroupButtonsConfig;
import ru.ozon.app.android.orders.cml.groupButtons.presentation.viewMapper.GroupButtonsViewMapper;

/* loaded from: classes6.dex */
public final class GroupButtonsWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(GroupButtonsWidgetModule groupButtonsWidgetModule, GroupButtonsConfig groupButtonsConfig, GroupButtonsViewMapper groupButtonsViewMapper) {
        Widget2 provideWidget = groupButtonsWidgetModule.provideWidget(groupButtonsConfig, groupButtonsViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
