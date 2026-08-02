package ru.ozon.app.android.fresh.navigation.addressSearch.di;

import Jb.e;
import Jb.j;
import Pc.a;
import retrofit2.Retrofit;
import ru.ozon.app.android.fresh.navigation.addressSearch.data.ValidateAddressApi;

/* loaded from: classes12.dex */
public final class AddressSearchModule_Companion_ProvideValidateAddressApiFactory implements e<ValidateAddressApi> {
    private final a<Retrofit> retrofitProvider;

    public AddressSearchModule_Companion_ProvideValidateAddressApiFactory(a<Retrofit> aVar) {
        this.retrofitProvider = aVar;
    }

    public static AddressSearchModule_Companion_ProvideValidateAddressApiFactory create(a<Retrofit> aVar) {
        return new AddressSearchModule_Companion_ProvideValidateAddressApiFactory(aVar);
    }

    public static ValidateAddressApi provideValidateAddressApi(Retrofit retrofit) {
        ValidateAddressApi provideValidateAddressApi = AddressSearchModule.INSTANCE.provideValidateAddressApi(retrofit);
        j.d(provideValidateAddressApi);
        return provideValidateAddressApi;
    }

    @Override // Pc.a
    public ValidateAddressApi get() {
        return provideValidateAddressApi(this.retrofitProvider.get());
    }
}
