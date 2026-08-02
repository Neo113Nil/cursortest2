package ru.ozon.app.android.travel.feature.general.common.tab.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.tabbar.miniapp.travel.TravelTabConfigApi;

/* loaded from: classes3.dex */
public final class TravelTabModule_Companion_ProvideTabConfigApiFactory implements e<TravelTabConfigApi> {
    public static TravelTabConfigApi provideTabConfigApi(Retrofit retrofit) {
        TravelTabConfigApi provideTabConfigApi = TravelTabModule.INSTANCE.provideTabConfigApi(retrofit);
        j.d(provideTabConfigApi);
        return provideTabConfigApi;
    }
}
