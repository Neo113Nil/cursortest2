package ru.ozon.app.android.delivery.customActionsHandlers.addcard.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.delivery.customActionsHandlers.addcard.api.SelectPaymentApi;

/* loaded from: classes11.dex */
public final class SelectPaymentModule_Companion_ProvideSelectPaymentApiFactory implements e<SelectPaymentApi> {
    public static SelectPaymentApi provideSelectPaymentApi(Retrofit retrofit) {
        SelectPaymentApi provideSelectPaymentApi = SelectPaymentModule.INSTANCE.provideSelectPaymentApi(retrofit);
        j.d(provideSelectPaymentApi);
        return provideSelectPaymentApi;
    }
}
