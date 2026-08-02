package ru.ozon.app.android.geo.addressbook.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi;
import ru.ozon.app.android.geo.addressbook.presentation.AddressBookAddressMapper;
import ru.ozon.app.android.geo.addressbook.presentation.AddressBookAnalyticsMapper;
import ru.ozon.app.android.geo.addressbook.presentation.AddressBookOnBoardingViewModel;

@Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001b\u0010\n\u001a\u00020\u00058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"ru/ozon/app/android/geo/addressbook/di/AddressBookWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/geo/addressbook/di/AddressBookWidgetComponent;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "onBoardingComponentApi", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "Lru/ozon/app/android/geo/addressbook/presentation/AddressBookAddressMapper;", "addressMapper$delegate", "LSc/j;", "getAddressMapper", "()Lru/ozon/app/android/geo/addressbook/presentation/AddressBookAddressMapper;", "addressMapper", "Lru/ozon/app/android/geo/addressbook/presentation/AddressBookAnalyticsMapper;", "analyticsMapper$delegate", "getAnalyticsMapper", "()Lru/ozon/app/android/geo/addressbook/presentation/AddressBookAnalyticsMapper;", "analyticsMapper", "Lru/ozon/app/android/geo/addressbook/presentation/AddressBookOnBoardingViewModel;", "addressBookOnBoardingViewModel$delegate", "getAddressBookOnBoardingViewModel", "()Lru/ozon/app/android/geo/addressbook/presentation/AddressBookOnBoardingViewModel;", "addressBookOnBoardingViewModel", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "LVg/d;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressBookWidgetComponent$Companion$create$1$1 implements AddressBookWidgetComponent {
    private final CustomActionHandlersComponentApi customActionComponentApi;
    private final OnBoardingComponentApi onBoardingComponentApi;

    /* renamed from: addressMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j addressMapper = k.b(AddressBookWidgetComponent$Companion$create$1$1$addressMapper$2.INSTANCE);

    /* renamed from: analyticsMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j analyticsMapper = k.b(AddressBookWidgetComponent$Companion$create$1$1$analyticsMapper$2.INSTANCE);

    /* renamed from: addressBookOnBoardingViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j addressBookOnBoardingViewModel = k.b(new AddressBookWidgetComponent$Companion$create$1$1$addressBookOnBoardingViewModel$2(this));

    AddressBookWidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.onBoardingComponentApi = (OnBoardingComponentApi) c7475g.getComponent(OnBoardingComponentApi.class);
        this.customActionComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
    }

    @Override // ru.ozon.app.android.geo.addressbook.di.AddressBookWidgetComponent
    public AddressBookOnBoardingViewModel getAddressBookOnBoardingViewModel() {
        return (AddressBookOnBoardingViewModel) this.addressBookOnBoardingViewModel.getValue();
    }

    @Override // ru.ozon.app.android.geo.addressbook.di.AddressBookWidgetComponent
    public AddressBookAddressMapper getAddressMapper() {
        return (AddressBookAddressMapper) this.addressMapper.getValue();
    }

    @Override // ru.ozon.app.android.geo.addressbook.di.AddressBookWidgetComponent
    public AddressBookAnalyticsMapper getAnalyticsMapper() {
        return (AddressBookAnalyticsMapper) this.analyticsMapper.getValue();
    }

    @Override // ru.ozon.app.android.geo.addressbook.di.AddressBookWidgetComponent
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionComponentApi.getCustomActionHandlersStoreFactory();
    }
}
