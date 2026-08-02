package ru.ozon.app.android.fresh.navigation.di.modules;

import Jb.e;
import Jb.j;
import Pc.a;
import retrofit2.Retrofit;
import ru.ozon.app.android.fresh.navigation.profileAvatar.data.repository.AvatarApi;

/* loaded from: classes6.dex */
public final class FreshNavigationModule_Companion_ProvideAvatarApiFactory implements e<AvatarApi> {
    private final a<Retrofit> retrofitProvider;

    public FreshNavigationModule_Companion_ProvideAvatarApiFactory(a<Retrofit> aVar) {
        this.retrofitProvider = aVar;
    }

    public static FreshNavigationModule_Companion_ProvideAvatarApiFactory create(a<Retrofit> aVar) {
        return new FreshNavigationModule_Companion_ProvideAvatarApiFactory(aVar);
    }

    public static AvatarApi provideAvatarApi(Retrofit retrofit) {
        AvatarApi provideAvatarApi = FreshNavigationModule.INSTANCE.provideAvatarApi(retrofit);
        j.d(provideAvatarApi);
        return provideAvatarApi;
    }

    @Override // Pc.a
    public AvatarApi get() {
        return provideAvatarApi(this.retrofitProvider.get());
    }
}
