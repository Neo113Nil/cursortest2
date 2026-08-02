package ru.ozon.app.android.fresh.navigation.di.modules;

import Jb.e;
import Jb.j;
import Pc.a;
import retrofit2.Retrofit;
import ru.ozon.app.android.tabbar.miniapp.fresh.FreshTabBarApi;

/* loaded from: classes6.dex */
public final class FreshNavigationModule_Companion_ProvideFreshTabBarApiFactory implements e<FreshTabBarApi> {
    private final a<Retrofit> retrofitProvider;

    public FreshNavigationModule_Companion_ProvideFreshTabBarApiFactory(a<Retrofit> aVar) {
        this.retrofitProvider = aVar;
    }

    public static FreshNavigationModule_Companion_ProvideFreshTabBarApiFactory create(a<Retrofit> aVar) {
        return new FreshNavigationModule_Companion_ProvideFreshTabBarApiFactory(aVar);
    }

    public static FreshTabBarApi provideFreshTabBarApi(Retrofit retrofit) {
        FreshTabBarApi provideFreshTabBarApi = FreshNavigationModule.INSTANCE.provideFreshTabBarApi(retrofit);
        j.d(provideFreshTabBarApi);
        return provideFreshTabBarApi;
    }

    @Override // Pc.a
    public FreshTabBarApi get() {
        return provideFreshTabBarApi(this.retrofitProvider.get());
    }
}
