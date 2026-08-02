package ru.ozon.app.android.session.logoutonall.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.session.logoutonall.data.LogoutOnAllDevicesApi;

/* loaded from: classes2.dex */
public final class LogoutOnAllDevicesWidgetModule_ProvideApiFactory implements e<LogoutOnAllDevicesApi> {
    public static LogoutOnAllDevicesApi provideApi(LogoutOnAllDevicesWidgetModule logoutOnAllDevicesWidgetModule, Retrofit retrofit) {
        LogoutOnAllDevicesApi provideApi = logoutOnAllDevicesWidgetModule.provideApi(retrofit);
        j.d(provideApi);
        return provideApi;
    }
}
