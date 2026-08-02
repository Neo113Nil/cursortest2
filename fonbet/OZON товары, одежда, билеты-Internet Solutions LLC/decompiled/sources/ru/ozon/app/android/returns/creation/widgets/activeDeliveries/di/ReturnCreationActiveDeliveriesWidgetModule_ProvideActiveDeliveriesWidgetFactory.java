package ru.ozon.app.android.returns.creation.widgets.activeDeliveries.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.returns.creation.widgets.activeDeliveries.core.ReturnCreationActiveDeliveriesConfig;
import ru.ozon.app.android.returns.creation.widgets.activeDeliveries.presentation.element.viewMapper.ElementViewMapper;
import ru.ozon.app.android.returns.creation.widgets.activeDeliveries.presentation.header.viewMapper.HeaderViewMapper;
import ru.ozon.app.android.returns.creation.widgets.activeDeliveries.presentation.sticky.viewMapper.StickyViewMapper;

/* loaded from: classes7.dex */
public final class ReturnCreationActiveDeliveriesWidgetModule_ProvideActiveDeliveriesWidgetFactory implements e<Widget2> {
    public static Widget2 provideActiveDeliveriesWidget(ReturnCreationActiveDeliveriesWidgetModule returnCreationActiveDeliveriesWidgetModule, ReturnCreationActiveDeliveriesConfig returnCreationActiveDeliveriesConfig, HeaderViewMapper headerViewMapper, ElementViewMapper elementViewMapper, StickyViewMapper stickyViewMapper, CommonIslandSeparatorViewMapper2 commonIslandSeparatorViewMapper2) {
        Widget2 provideActiveDeliveriesWidget = returnCreationActiveDeliveriesWidgetModule.provideActiveDeliveriesWidget(returnCreationActiveDeliveriesConfig, headerViewMapper, elementViewMapper, stickyViewMapper, commonIslandSeparatorViewMapper2);
        j.d(provideActiveDeliveriesWidget);
        return provideActiveDeliveriesWidget;
    }
}
