package ru.ozon.app.android.common.navigationblocks.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.common.navigationblocks.core.NavigationBlocksV2Config;
import ru.ozon.app.android.common.navigationblocks.core.NavigationBlocksV2ViewMapper;
import ru.ozon.app.android.composer.di.Widget;

/* loaded from: classes6.dex */
public final class NavigationBlocksV2Module_ProvideNavigationBlocksV2WidgetFactory implements e<Widget> {
    public static Widget provideNavigationBlocksV2Widget(NavigationBlocksV2Config navigationBlocksV2Config, NavigationBlocksV2ViewMapper navigationBlocksV2ViewMapper) {
        Widget provideNavigationBlocksV2Widget = NavigationBlocksV2Module.INSTANCE.provideNavigationBlocksV2Widget(navigationBlocksV2Config, navigationBlocksV2ViewMapper);
        j.d(provideNavigationBlocksV2Widget);
        return provideNavigationBlocksV2Widget;
    }
}
