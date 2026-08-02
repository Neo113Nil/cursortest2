package ru.ozon.app.android.cabinet.activationtitle.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.cabinet.activationtitle.data.DiscountCodeApi;

/* loaded from: classes11.dex */
public final class ActivationTitleModule_Companion_ProvideDiscountCodeApiFactory implements e<DiscountCodeApi> {
    public static DiscountCodeApi provideDiscountCodeApi(Retrofit retrofit) {
        DiscountCodeApi provideDiscountCodeApi = ActivationTitleModule.INSTANCE.provideDiscountCodeApi(retrofit);
        j.d(provideDiscountCodeApi);
        return provideDiscountCodeApi;
    }
}
