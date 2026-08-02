package ru.ozon.app.android.storefront.widgets.cms.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.storefront.widgets.cms.navtitle.NavTitleConfig;
import ru.ozon.app.android.storefront.widgets.cms.navtitle.NavTitleViewMapper;

/* loaded from: classes7.dex */
public final class CmsWidgetsV1DiModule_ProvideWidgetFactory implements e<Set<Widget>> {
    public static Set<Widget> provideWidget(NavTitleConfig navTitleConfig, NavTitleViewMapper navTitleViewMapper) {
        Set<Widget> provideWidget = CmsWidgetsV1DiModule.INSTANCE.provideWidget(navTitleConfig, navTitleViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
