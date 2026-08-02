package ru.ozon.app.android.common.actionHandlers.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.common.actionHandlers.removeSuggestion.RemoveSuggestionApi;

/* loaded from: classes11.dex */
public final class CommonActionHandlersDiModule_Companion_ProvideSearchHistoryApiFactory implements e<RemoveSuggestionApi> {
    public static RemoveSuggestionApi provideSearchHistoryApi(Retrofit retrofit) {
        RemoveSuggestionApi provideSearchHistoryApi = CommonActionHandlersDiModule.INSTANCE.provideSearchHistoryApi(retrofit);
        j.d(provideSearchHistoryApi);
        return provideSearchHistoryApi;
    }
}
