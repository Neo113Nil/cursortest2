package ru.ozon.app.android.cabinet.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.domain.session.api.auth.AuthBiometricApi;

/* loaded from: classes11.dex */
public final class AuthModule_Companion_ProvideAuthBiometricApiFactory implements e<AuthBiometricApi> {
    public static AuthBiometricApi provideAuthBiometricApi(Retrofit retrofit) {
        AuthBiometricApi provideAuthBiometricApi = AuthModule.INSTANCE.provideAuthBiometricApi(retrofit);
        j.d(provideAuthBiometricApi);
        return provideAuthBiometricApi;
    }
}
