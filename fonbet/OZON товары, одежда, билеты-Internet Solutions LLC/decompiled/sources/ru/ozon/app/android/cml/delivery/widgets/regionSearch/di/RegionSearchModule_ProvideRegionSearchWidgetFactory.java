package ru.ozon.app.android.cml.delivery.widgets.regionSearch.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.cml.delivery.widgets.regionSearch.data.RegionSearchConfig;
import ru.ozon.app.android.cml.delivery.widgets.regionSearch.presentation.RegionSearchViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class RegionSearchModule_ProvideRegionSearchWidgetFactory implements e<Widget2> {
    public static Widget2 provideRegionSearchWidget(RegionSearchConfig regionSearchConfig, RegionSearchViewMapper regionSearchViewMapper) {
        Widget2 provideRegionSearchWidget = RegionSearchModule.INSTANCE.provideRegionSearchWidget(regionSearchConfig, regionSearchViewMapper);
        j.d(provideRegionSearchWidget);
        return provideRegionSearchWidget;
    }
}
