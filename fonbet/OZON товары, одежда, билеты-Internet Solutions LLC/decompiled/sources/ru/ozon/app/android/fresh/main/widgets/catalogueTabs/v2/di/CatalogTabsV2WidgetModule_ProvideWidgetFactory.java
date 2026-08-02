package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import n20.i;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.data.CatalogTabsV2Config;

/* loaded from: classes6.dex */
public final class CatalogTabsV2WidgetModule_ProvideWidgetFactory implements e<Set<i>> {
    public static Set<i> provideWidget(CatalogTabsV2WidgetModule catalogTabsV2WidgetModule, CatalogTabsV2Config catalogTabsV2Config) {
        Set<i> provideWidget = catalogTabsV2WidgetModule.provideWidget(catalogTabsV2Config);
        j.d(provideWidget);
        return provideWidget;
    }
}
