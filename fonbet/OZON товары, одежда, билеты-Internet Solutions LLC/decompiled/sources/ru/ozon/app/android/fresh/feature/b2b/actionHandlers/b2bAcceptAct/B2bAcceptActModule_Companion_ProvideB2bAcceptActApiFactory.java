package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bAcceptAct;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bAcceptAct.api.B2bAcceptActApi;

/* loaded from: classes12.dex */
public final class B2bAcceptActModule_Companion_ProvideB2bAcceptActApiFactory implements e<B2bAcceptActApi> {
    public static B2bAcceptActApi provideB2bAcceptActApi(Retrofit retrofit) {
        B2bAcceptActApi provideB2bAcceptActApi = B2bAcceptActModule.INSTANCE.provideB2bAcceptActApi(retrofit);
        j.d(provideB2bAcceptActApi);
        return provideB2bAcceptActApi;
    }
}
