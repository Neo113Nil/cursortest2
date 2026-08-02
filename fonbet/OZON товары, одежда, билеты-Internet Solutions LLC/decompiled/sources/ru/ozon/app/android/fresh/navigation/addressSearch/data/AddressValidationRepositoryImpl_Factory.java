package ru.ozon.app.android.fresh.navigation.addressSearch.data;

import Jb.e;
import Pc.a;

/* loaded from: classes12.dex */
public final class AddressValidationRepositoryImpl_Factory implements e<AddressValidationRepositoryImpl> {
    private final a<ValidateAddressApi> apiProvider;

    public AddressValidationRepositoryImpl_Factory(a<ValidateAddressApi> aVar) {
        this.apiProvider = aVar;
    }

    public static AddressValidationRepositoryImpl_Factory create(a<ValidateAddressApi> aVar) {
        return new AddressValidationRepositoryImpl_Factory(aVar);
    }

    public static AddressValidationRepositoryImpl newInstance(ValidateAddressApi validateAddressApi) {
        return new AddressValidationRepositoryImpl(validateAddressApi);
    }

    @Override // Pc.a
    public AddressValidationRepositoryImpl get() {
        return newInstance(this.apiProvider.get());
    }
}
