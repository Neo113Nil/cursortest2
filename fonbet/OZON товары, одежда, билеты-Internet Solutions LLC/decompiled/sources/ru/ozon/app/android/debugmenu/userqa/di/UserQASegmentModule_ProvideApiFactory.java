package ru.ozon.app.android.debugmenu.userqa.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.debugmenu.userqa.api.UserQASegmentApi;

/* loaded from: classes6.dex */
public final class UserQASegmentModule_ProvideApiFactory implements e<UserQASegmentApi> {
    public static UserQASegmentApi provideApi(UserQASegmentModule userQASegmentModule, Retrofit retrofit) {
        UserQASegmentApi provideApi = userQASegmentModule.provideApi(retrofit);
        j.d(provideApi);
        return provideApi;
    }
}
