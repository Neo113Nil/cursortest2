package ru.ozon.app.android.travel.feature.entry.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.travel.feature.entry.network.OzonTravelTabConfigApi;

/* loaded from: classes3.dex */
public final class OzonTravelTabConfigModule_Companion_ProvideTabConfigApiFactory implements e<OzonTravelTabConfigApi> {
    public static OzonTravelTabConfigApi provideTabConfigApi(Retrofit retrofit) {
        OzonTravelTabConfigApi provideTabConfigApi = OzonTravelTabConfigModule.INSTANCE.provideTabConfigApi(retrofit);
        j.d(provideTabConfigApi);
        return provideTabConfigApi;
    }
}
