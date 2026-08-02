package ru.ozon.app.android.session.logoutonall.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.session.logoutonall.data.LogoutOnAllDevicesConfig;
import ru.ozon.app.android.session.logoutonall.presentation.LogoutOnAllDevicesViewMapper;

/* loaded from: classes7.dex */
public final class LogoutOnAllDevicesWidgetModule_ProvideLogoutOnAllDevicesWidgetFactory implements e<Widget> {
    public static Widget provideLogoutOnAllDevicesWidget(LogoutOnAllDevicesWidgetModule logoutOnAllDevicesWidgetModule, LogoutOnAllDevicesConfig logoutOnAllDevicesConfig, LogoutOnAllDevicesViewMapper logoutOnAllDevicesViewMapper) {
        Widget provideLogoutOnAllDevicesWidget = logoutOnAllDevicesWidgetModule.provideLogoutOnAllDevicesWidget(logoutOnAllDevicesConfig, logoutOnAllDevicesViewMapper);
        j.d(provideLogoutOnAllDevicesWidget);
        return provideLogoutOnAllDevicesWidget;
    }
}
