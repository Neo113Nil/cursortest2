package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal.api.B2bRemoveLegalApi;

/* loaded from: classes12.dex */
public final class B2bRemoveLegalModule_Companion_ProvideB2bSwitchUserApiFactory implements e<B2bRemoveLegalApi> {
    public static B2bRemoveLegalApi provideB2bSwitchUserApi(Retrofit retrofit) {
        B2bRemoveLegalApi provideB2bSwitchUserApi = B2bRemoveLegalModule.INSTANCE.provideB2bSwitchUserApi(retrofit);
        j.d(provideB2bSwitchUserApi);
        return provideB2bSwitchUserApi;
    }
}
