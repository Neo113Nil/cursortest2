package ru.ozon.app.android.commonwidgets.widgets.resultheader.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.commonwidgets.widgets.resultheader.domain.ResultsHeaderApi;

/* loaded from: classes6.dex */
public final class ResultsHeaderModule_Companion_ProvideResultsHeaderApiFactory implements e<ResultsHeaderApi> {
    public static ResultsHeaderApi provideResultsHeaderApi(Retrofit retrofit) {
        ResultsHeaderApi provideResultsHeaderApi = ResultsHeaderModule.INSTANCE.provideResultsHeaderApi(retrofit);
        j.d(provideResultsHeaderApi);
        return provideResultsHeaderApi;
    }
}
