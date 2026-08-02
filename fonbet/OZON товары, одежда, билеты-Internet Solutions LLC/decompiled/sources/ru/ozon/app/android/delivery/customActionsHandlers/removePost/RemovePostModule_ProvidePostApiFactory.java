package ru.ozon.app.android.delivery.customActionsHandlers.removePost;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;

/* loaded from: classes11.dex */
public final class RemovePostModule_ProvidePostApiFactory implements e<PostApi> {
    public static PostApi providePostApi(RemovePostModule removePostModule, Retrofit retrofit) {
        PostApi providePostApi = removePostModule.providePostApi(retrofit);
        j.d(providePostApi);
        return providePostApi;
    }
}
