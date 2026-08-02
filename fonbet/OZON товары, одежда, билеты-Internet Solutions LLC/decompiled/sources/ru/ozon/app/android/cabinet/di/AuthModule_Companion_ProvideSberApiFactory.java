package ru.ozon.app.android.cabinet.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.domain.session.api.auth.SberAuthApi;

/* loaded from: classes11.dex */
public final class AuthModule_Companion_ProvideSberApiFactory implements e<SberAuthApi> {
    public static SberAuthApi provideSberApi(Retrofit retrofit) {
        SberAuthApi provideSberApi = AuthModule.INSTANCE.provideSberApi(retrofit);
        j.d(provideSberApi);
        return provideSberApi;
    }
}
