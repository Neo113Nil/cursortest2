package ru.ozon.app.android.account.orders.navBarItem.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.account.orders.navBarItem.data.NavBarItemConfig;
import ru.ozon.app.android.account.orders.navBarItem.presentation.NavBarItemViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class NavBarModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(NavBarModule navBarModule, NavBarItemConfig navBarItemConfig, NavBarItemViewMapper navBarItemViewMapper) {
        Widget2 provideWidget = navBarModule.provideWidget(navBarItemConfig, navBarItemViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
