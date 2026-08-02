package ru.ozon.app.android.commonwidgets.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.common.disclaimer.DisclaimerViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.cell.core.CellConfig;
import ru.ozon.app.android.commonwidgets.widgets.cell.core.CellViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.cellList.core.CellListConfig;
import ru.ozon.app.android.commonwidgets.widgets.cellList.core.CellListHeaderViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.cellList.core.CellListViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.disclaimer.data.DisclaimerConfig;
import ru.ozon.app.android.commonwidgets.widgets.emptyState.core.CommonEmptyStateViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.emptyState.core.EmptyStateConfig;
import ru.ozon.app.android.commonwidgets.widgets.headerWidget.data.PageHeaderConfig;
import ru.ozon.app.android.commonwidgets.widgets.headerWidget.presentation.PageHeaderViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.pixel.data.PixelConfig;
import ru.ozon.app.android.commonwidgets.widgets.pixel.presentation.PixelViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.restrictions.core.RestrictionsConfig;
import ru.ozon.app.android.commonwidgets.widgets.restrictions.core.RestrictionsNoUIViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.tabs.core.TabsConfig;
import ru.ozon.app.android.commonwidgets.widgets.tabs.core.TabsViewMapper;
import ru.ozon.app.android.composer.di.Widget;

/* loaded from: classes6.dex */
public final class CommonWidgetsV1DiModule_ProvideWidgetFactory implements e<Set<Widget>> {
    public static Set<Widget> provideWidget(PageHeaderConfig pageHeaderConfig, PageHeaderViewMapper pageHeaderViewMapper, CellConfig cellConfig, CellViewMapper cellViewMapper, TabsConfig tabsConfig, TabsViewMapper tabsViewMapper, CellListConfig cellListConfig, CellListHeaderViewMapper cellListHeaderViewMapper, CellListViewMapper cellListViewMapper, PixelViewMapper pixelViewMapper, PixelConfig pixelConfig, DisclaimerViewMapper disclaimerViewMapper, DisclaimerConfig disclaimerConfig, EmptyStateConfig emptyStateConfig, CommonEmptyStateViewMapper commonEmptyStateViewMapper, RestrictionsConfig restrictionsConfig, RestrictionsNoUIViewMapper restrictionsNoUIViewMapper) {
        Set<Widget> provideWidget = CommonWidgetsV1DiModule.INSTANCE.provideWidget(pageHeaderConfig, pageHeaderViewMapper, cellConfig, cellViewMapper, tabsConfig, tabsViewMapper, cellListConfig, cellListHeaderViewMapper, cellListViewMapper, pixelViewMapper, pixelConfig, disclaimerViewMapper, disclaimerConfig, emptyStateConfig, commonEmptyStateViewMapper, restrictionsConfig, restrictionsNoUIViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
