package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.data.SearchSheetApi;

/* loaded from: classes11.dex */
public final class SearchSheetFragmentModule_ProvideSearchSheetApiFactory implements e<SearchSheetApi> {
    public static SearchSheetApi provideSearchSheetApi(Retrofit retrofit) {
        SearchSheetApi provideSearchSheetApi = SearchSheetFragmentModule.provideSearchSheetApi(retrofit);
        j.d(provideSearchSheetApi);
        return provideSearchSheetApi;
    }
}
