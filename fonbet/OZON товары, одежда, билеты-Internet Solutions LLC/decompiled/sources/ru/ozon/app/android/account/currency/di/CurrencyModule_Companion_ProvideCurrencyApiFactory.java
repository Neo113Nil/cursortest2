package ru.ozon.app.android.account.currency.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.account.currency.api.CurrencyApi;

/* loaded from: classes6.dex */
public final class CurrencyModule_Companion_ProvideCurrencyApiFactory implements e<CurrencyApi> {
    public static CurrencyApi provideCurrencyApi(Retrofit retrofit) {
        CurrencyApi provideCurrencyApi = CurrencyModule.INSTANCE.provideCurrencyApi(retrofit);
        j.d(provideCurrencyApi);
        return provideCurrencyApi;
    }
}
