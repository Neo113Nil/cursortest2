package ru.ozon.app.android.cart.domain.di.module;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.cart.domain.data.CartDomainApi;

/* loaded from: classes6.dex */
public final class CartDomainModule_Companion_ProvideCartDomainApiFactory implements e<CartDomainApi> {
    public static CartDomainApi provideCartDomainApi(Retrofit retrofit) {
        CartDomainApi provideCartDomainApi = CartDomainModule.INSTANCE.provideCartDomainApi(retrofit);
        j.d(provideCartDomainApi);
        return provideCartDomainApi;
    }
}
