package ru.ozon.app.android.common.tabs.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.common.tabs.core.TabsV2Config;
import ru.ozon.app.android.common.tabs.core.TabsV2StickyViewMapper;
import ru.ozon.app.android.common.tabs.core.TabsV2ViewMapper;
import ru.ozon.app.android.composer.di.Widget;

/* loaded from: classes6.dex */
public final class TabsV2Module_ProvideTabsV2WidgetFactory implements e<Widget> {
    public static Widget provideTabsV2Widget(TabsV2Config tabsV2Config, TabsV2ViewMapper tabsV2ViewMapper, TabsV2StickyViewMapper tabsV2StickyViewMapper) {
        Widget provideTabsV2Widget = TabsV2Module.provideTabsV2Widget(tabsV2Config, tabsV2ViewMapper, tabsV2StickyViewMapper);
        j.d(provideTabsV2Widget);
        return provideTabsV2Widget;
    }
}
