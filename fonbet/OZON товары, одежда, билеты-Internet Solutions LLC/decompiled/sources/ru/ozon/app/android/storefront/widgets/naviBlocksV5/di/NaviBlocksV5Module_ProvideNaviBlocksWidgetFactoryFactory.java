package ru.ozon.app.android.storefront.widgets.naviBlocksV5.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import n20.i;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

/* loaded from: classes7.dex */
public final class NaviBlocksV5Module_ProvideNaviBlocksWidgetFactoryFactory implements e<Set<i>> {
    public static Set<i> provideNaviBlocksWidgetFactory(NaviBlocksV5Module naviBlocksV5Module, JsonParser jsonParser) {
        Set<i> provideNaviBlocksWidgetFactory = naviBlocksV5Module.provideNaviBlocksWidgetFactory(jsonParser);
        j.d(provideNaviBlocksWidgetFactory);
        return provideNaviBlocksWidgetFactory;
    }
}
