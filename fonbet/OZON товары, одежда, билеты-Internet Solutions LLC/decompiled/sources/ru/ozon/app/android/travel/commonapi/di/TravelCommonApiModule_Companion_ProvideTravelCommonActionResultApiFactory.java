package ru.ozon.app.android.travel.commonapi.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResultApi;

/* loaded from: classes2.dex */
public final class TravelCommonApiModule_Companion_ProvideTravelCommonActionResultApiFactory implements e<TravelCommonActionResultApi> {
    public static TravelCommonActionResultApi provideTravelCommonActionResultApi(Retrofit retrofit) {
        TravelCommonActionResultApi provideTravelCommonActionResultApi = TravelCommonApiModule.INSTANCE.provideTravelCommonActionResultApi(retrofit);
        j.d(provideTravelCommonActionResultApi);
        return provideTravelCommonActionResultApi;
    }
}
