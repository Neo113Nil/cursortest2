package ru.ozon.app.android.partpayment.homecredit;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;

/* loaded from: classes13.dex */
public final class HomeCreditActionHandlerModule_Companion_ProvideHomeCreditApiFactory implements e<HomeCreditApi> {
    public static HomeCreditApi provideHomeCreditApi(Retrofit retrofit) {
        HomeCreditApi provideHomeCreditApi = HomeCreditActionHandlerModule.INSTANCE.provideHomeCreditApi(retrofit);
        j.d(provideHomeCreditApi);
        return provideHomeCreditApi;
    }
}
