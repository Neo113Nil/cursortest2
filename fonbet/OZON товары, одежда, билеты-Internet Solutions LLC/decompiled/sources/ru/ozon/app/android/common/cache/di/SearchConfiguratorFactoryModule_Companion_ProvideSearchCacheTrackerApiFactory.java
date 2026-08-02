package ru.ozon.app.android.common.cache.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.common.request.SearchCacheTrackerApi;

/* loaded from: classes6.dex */
public final class SearchConfiguratorFactoryModule_Companion_ProvideSearchCacheTrackerApiFactory implements e<SearchCacheTrackerApi> {
    public static SearchCacheTrackerApi provideSearchCacheTrackerApi(Retrofit retrofit) {
        SearchCacheTrackerApi provideSearchCacheTrackerApi = SearchConfiguratorFactoryModule.INSTANCE.provideSearchCacheTrackerApi(retrofit);
        j.d(provideSearchCacheTrackerApi);
        return provideSearchCacheTrackerApi;
    }
}
