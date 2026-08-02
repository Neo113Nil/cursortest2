package ru.ozon.app.android.fresh.feature.entry.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.tabbar.miniapp.fresh.FreshTabBarApi;

/* loaded from: classes12.dex */
public final class FreshNavigationModule_Companion_ProvideFreshTabBarApiFactory implements e<FreshTabBarApi> {
    public static FreshTabBarApi provideFreshTabBarApi(Retrofit retrofit) {
        FreshTabBarApi provideFreshTabBarApi = FreshNavigationModule.INSTANCE.provideFreshTabBarApi(retrofit);
        j.d(provideFreshTabBarApi);
        return provideFreshTabBarApi;
    }
}
