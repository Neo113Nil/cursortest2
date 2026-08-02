package ru.ozon.app.android.geo.addressBookBar.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoViewModel;
import ru.ozon.app.android.checkoutgeo.address.di.AddressComponentApi;
import ru.ozon.app.android.geo.addressBookBar.mapper.AddressBookBarMapper;

@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"ru/ozon/app/android/geo/addressBookBar/di/AddressBookBarComponent$Companion$create$1$1", "Lru/ozon/app/android/geo/addressBookBar/di/AddressBookBarComponent;", "Lru/ozon/app/android/checkoutgeo/address/di/AddressComponentApi;", "addressComponentApi", "Lru/ozon/app/android/checkoutgeo/address/di/AddressComponentApi;", "Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoViewModel;", "addressUiInfoViewModel", "Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoViewModel;", "getAddressUiInfoViewModel", "()Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoViewModel;", "Lru/ozon/app/android/geo/addressBookBar/mapper/AddressBookBarMapper;", "addressBookBarMapper$delegate", "LSc/j;", "getAddressBookBarMapper", "()Lru/ozon/app/android/geo/addressBookBar/mapper/AddressBookBarMapper;", "addressBookBarMapper", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressBookBarComponent$Companion$create$1$1 implements AddressBookBarComponent {

    /* renamed from: addressBookBarMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j addressBookBarMapper;
    private final AddressComponentApi addressComponentApi;
    private final AddressUiInfoViewModel addressUiInfoViewModel;

    AddressBookBarComponent$Companion$create$1$1(C7475g c7475g) {
        AddressComponentApi addressComponentApi = (AddressComponentApi) c7475g.getComponent(AddressComponentApi.class);
        this.addressComponentApi = addressComponentApi;
        this.addressUiInfoViewModel = addressComponentApi.getAddressUiInfoViewModel();
        this.addressBookBarMapper = k.b(new AddressBookBarComponent$Companion$create$1$1$addressBookBarMapper$2(this));
    }

    @Override // ru.ozon.app.android.geo.addressBookBar.di.AddressBookBarComponent
    public AddressBookBarMapper getAddressBookBarMapper() {
        return (AddressBookBarMapper) this.addressBookBarMapper.getValue();
    }

    @Override // ru.ozon.app.android.geo.addressBookBar.di.AddressBookBarComponent
    public AddressUiInfoViewModel getAddressUiInfoViewModel() {
        return this.addressUiInfoViewModel;
    }
}
