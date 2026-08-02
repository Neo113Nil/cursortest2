package ru.ozon.app.android.account.orders.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.payment.ui.changepayment.data.ChangePaymentApi;

/* loaded from: classes11.dex */
public final class OrderDetailsCoreModule_Companion_ProvideChangePaymentApiFactory implements e<ChangePaymentApi> {
    public static ChangePaymentApi provideChangePaymentApi(Retrofit retrofit) {
        ChangePaymentApi provideChangePaymentApi = OrderDetailsCoreModule.INSTANCE.provideChangePaymentApi(retrofit);
        j.d(provideChangePaymentApi);
        return provideChangePaymentApi;
    }
}
