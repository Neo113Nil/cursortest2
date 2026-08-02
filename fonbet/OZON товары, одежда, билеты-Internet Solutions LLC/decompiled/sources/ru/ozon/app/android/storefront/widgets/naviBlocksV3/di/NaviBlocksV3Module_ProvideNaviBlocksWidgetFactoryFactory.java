package ru.ozon.app.android.storefront.widgets.naviBlocksV3.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import n20.i;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

/* loaded from: classes7.dex */
public final class NaviBlocksV3Module_ProvideNaviBlocksWidgetFactoryFactory implements e<Set<i>> {
    public static Set<i> provideNaviBlocksWidgetFactory(NaviBlocksV3Module naviBlocksV3Module, JsonParser jsonParser) {
        Set<i> provideNaviBlocksWidgetFactory = naviBlocksV3Module.provideNaviBlocksWidgetFactory(jsonParser);
        j.d(provideNaviBlocksWidgetFactory);
        return provideNaviBlocksWidgetFactory;
    }
}
