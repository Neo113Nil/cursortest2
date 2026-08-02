package ru.ozon.app.android.cabinet.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.domain.session.api.auth.CredentialsApi;

/* loaded from: classes11.dex */
public final class AuthModule_Companion_ProvideApiFactory implements e<CredentialsApi> {
    public static CredentialsApi provideApi(Retrofit retrofit) {
        CredentialsApi provideApi = AuthModule.INSTANCE.provideApi(retrofit);
        j.d(provideApi);
        return provideApi;
    }
}
