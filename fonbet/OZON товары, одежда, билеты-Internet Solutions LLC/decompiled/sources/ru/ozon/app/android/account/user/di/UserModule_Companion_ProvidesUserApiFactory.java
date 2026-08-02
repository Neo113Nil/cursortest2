package ru.ozon.app.android.account.user.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.account.user.UserApi;

/* loaded from: classes6.dex */
public final class UserModule_Companion_ProvidesUserApiFactory implements e<UserApi> {
    public static UserApi providesUserApi(Retrofit retrofit) {
        UserApi providesUserApi = UserModule.INSTANCE.providesUserApi(retrofit);
        j.d(providesUserApi);
        return providesUserApi;
    }
}
