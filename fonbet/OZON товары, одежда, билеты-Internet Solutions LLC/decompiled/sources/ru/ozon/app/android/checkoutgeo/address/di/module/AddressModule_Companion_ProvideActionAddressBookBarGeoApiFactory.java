package ru.ozon.app.android.checkoutgeo.address.di.module;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.ActionAddressBookBarGeoApi;

/* loaded from: classes6.dex */
public final class AddressModule_Companion_ProvideActionAddressBookBarGeoApiFactory implements e<ActionAddressBookBarGeoApi> {
    public static ActionAddressBookBarGeoApi provideActionAddressBookBarGeoApi(Retrofit retrofit) {
        ActionAddressBookBarGeoApi provideActionAddressBookBarGeoApi = AddressModule.INSTANCE.provideActionAddressBookBarGeoApi(retrofit);
        j.d(provideActionAddressBookBarGeoApi);
        return provideActionAddressBookBarGeoApi;
    }
}
