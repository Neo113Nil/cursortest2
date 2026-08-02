package ru.ozon.app.android.tabbar.di.module;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.tabbar.data.api.TabConfigApi;

/* loaded from: classes7.dex */
public final class TabModule_Companion_ProvideTabConfigApiFactory implements e<TabConfigApi> {
    public static TabConfigApi provideTabConfigApi(Retrofit retrofit) {
        TabConfigApi provideTabConfigApi = TabModule.INSTANCE.provideTabConfigApi(retrofit);
        j.d(provideTabConfigApi);
        return provideTabConfigApi;
    }
}
