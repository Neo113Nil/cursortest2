package ru.ozon.app.android.pdp.ui.configurators.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.pdp.ui.configurators.comparison.data.ComparisonApi;

/* loaded from: classes13.dex */
public final class PdpComparisonModule_Companion_ProvideComparisonApiFactory implements e<ComparisonApi> {
    public static ComparisonApi provideComparisonApi(Retrofit retrofit) {
        ComparisonApi provideComparisonApi = PdpComparisonModule.INSTANCE.provideComparisonApi(retrofit);
        j.d(provideComparisonApi);
        return provideComparisonApi;
    }
}
