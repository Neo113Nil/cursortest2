package ru.ozon.app.android.account.subscription.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.account.subscription.SubscriptionApi;

/* loaded from: classes6.dex */
public final class SubscriptionModule_Companion_ProvideSubscriptionApiFactory implements e<SubscriptionApi> {
    public static SubscriptionApi provideSubscriptionApi(Retrofit retrofit) {
        SubscriptionApi provideSubscriptionApi = SubscriptionModule.INSTANCE.provideSubscriptionApi(retrofit);
        j.d(provideSubscriptionApi);
        return provideSubscriptionApi;
    }
}
