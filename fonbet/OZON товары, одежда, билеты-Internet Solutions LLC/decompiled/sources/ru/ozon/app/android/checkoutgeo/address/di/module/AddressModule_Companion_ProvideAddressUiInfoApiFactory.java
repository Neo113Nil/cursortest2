package ru.ozon.app.android.checkoutgeo.address.di.module;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoApi;

/* loaded from: classes6.dex */
public final class AddressModule_Companion_ProvideAddressUiInfoApiFactory implements e<AddressUiInfoApi> {
    public static AddressUiInfoApi provideAddressUiInfoApi(Retrofit retrofit) {
        AddressUiInfoApi provideAddressUiInfoApi = AddressModule.INSTANCE.provideAddressUiInfoApi(retrofit);
        j.d(provideAddressUiInfoApi);
        return provideAddressUiInfoApi;
    }
}
