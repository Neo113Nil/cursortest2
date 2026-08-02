package ru.ozon.app.android.session.userSocialsMobile.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.session.userSocialsMobile.data.item.UserSocialsMobileApi;

/* loaded from: classes2.dex */
public final class UserSocialsMobileModule_Companion_ProvideUserSocialsMobileApiFactory implements e<UserSocialsMobileApi> {
    public static UserSocialsMobileApi provideUserSocialsMobileApi(Retrofit retrofit) {
        UserSocialsMobileApi provideUserSocialsMobileApi = UserSocialsMobileModule.INSTANCE.provideUserSocialsMobileApi(retrofit);
        j.d(provideUserSocialsMobileApi);
        return provideUserSocialsMobileApi;
    }
}
