package ru.ozon.app.android.commonwidgets.widgets.navbariconbutton.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.commonwidgets.widgets.navbariconbutton.data.NavBarIconButtonNavbarConfig;
import ru.ozon.app.android.commonwidgets.widgets.navbariconbutton.presentation.NavbarIconButtonViewMapper;
import ru.ozon.app.android.composer.di.Widget;

/* loaded from: classes6.dex */
public final class NavBarIconButtonWidgetModule_ProvideIconButtonWidgetFactory implements e<Widget> {
    public static Widget provideIconButtonWidget(NavBarIconButtonNavbarConfig navBarIconButtonNavbarConfig, NavbarIconButtonViewMapper navbarIconButtonViewMapper) {
        Widget provideIconButtonWidget = NavBarIconButtonWidgetModule.provideIconButtonWidget(navBarIconButtonNavbarConfig, navbarIconButtonViewMapper);
        j.d(provideIconButtonWidget);
        return provideIconButtonWidget;
    }
}
