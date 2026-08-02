package ru.ozon.app.android.checkoutgeo.address.di;

import Jb.d;
import Jb.j;
import Pc.a;
import retrofit2.Retrofit;
import ru.ozon.app.android.checkoutgeo.address.AddressUpdateManager;
import ru.ozon.app.android.checkoutgeo.address.AddressUpdateManagerImpl;
import ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.ActionAddressBookBarGeoApi;
import ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoApi;
import ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoViewModel;
import ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoViewModelImpl;
import ru.ozon.app.android.checkoutgeo.address.di.AddressComponent;
import ru.ozon.app.android.checkoutgeo.address.di.module.AddressModule_Companion_ProvideActionAddressBookBarGeoApiFactory;
import ru.ozon.app.android.checkoutgeo.address.di.module.AddressModule_Companion_ProvideAddressUiInfoApiFactory;
import ru.ozon.app.android.location.ComposerLocationRepository;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.tabbar.di.TabsComponentApi;
import ru.ozon.app.android.tabbar.domain.TabConfigUpdateDelegate;

/* loaded from: classes6.dex */
public final class DaggerAddressComponent {

    private static final class AddressComponentImpl implements AddressComponent {
        private final AddressComponentImpl addressComponentImpl;
        private a<AddressUiInfoViewModelImpl> addressUiInfoViewModelImplProvider;
        private a<AddressUpdateManagerImpl> addressUpdateManagerImplProvider;
        private a<AddressUiInfoViewModel> bindAddressUiInfoViewModelProvider;
        private final LocationComponentApi locationComponentApi;
        private final NetworkComponentApi networkComponentApi;
        private a<ActionAddressBookBarGeoApi> provideActionAddressBookBarGeoApiProvider;
        private a<AddressUiInfoApi> provideAddressUiInfoApiProvider;
        private a<AddressUpdateManager> provideAddressUpdateManagerProvider;
        private final StorageComponentApi storageComponentApi;
        private final TabsComponentApi tabsComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {
            private final AddressComponentImpl addressComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92339id;

            SwitchingProvider(AddressComponentImpl addressComponentImpl, int i11) {
                this.addressComponentImpl = addressComponentImpl;
                this.f92339id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92339id;
                if (i11 == 0) {
                    AddressUiInfoApi addressUiInfoApi = (AddressUiInfoApi) this.addressComponentImpl.provideAddressUiInfoApiProvider.get();
                    ActionAddressBookBarGeoApi actionAddressBookBarGeoApi = (ActionAddressBookBarGeoApi) this.addressComponentImpl.provideActionAddressBookBarGeoApiProvider.get();
                    TabConfigUpdateDelegate tabConfigRequestDelegate = this.addressComponentImpl.tabsComponentApi.getTabConfigRequestDelegate();
                    j.c(tabConfigRequestDelegate);
                    ComposerLocationRepository composerLocationRepository = this.addressComponentImpl.locationComponentApi.getComposerLocationRepository();
                    j.c(composerLocationRepository);
                    AuthStateStorage authStateStorage = this.addressComponentImpl.storageComponentApi.getAuthStateStorage();
                    j.c(authStateStorage);
                    return (T) new AddressUiInfoViewModelImpl(addressUiInfoApi, actionAddressBookBarGeoApi, tabConfigRequestDelegate, composerLocationRepository, authStateStorage);
                }
                if (i11 == 1) {
                    Retrofit retrofit = this.addressComponentImpl.networkComponentApi.getRetrofit();
                    j.c(retrofit);
                    return (T) AddressModule_Companion_ProvideAddressUiInfoApiFactory.provideAddressUiInfoApi(retrofit);
                }
                if (i11 != 2) {
                    if (i11 == 3) {
                        return (T) new AddressUpdateManagerImpl();
                    }
                    throw new AssertionError(this.f92339id);
                }
                Retrofit retrofit3 = this.addressComponentImpl.networkComponentApi.getRetrofit();
                j.c(retrofit3);
                return (T) AddressModule_Companion_ProvideActionAddressBookBarGeoApiFactory.provideActionAddressBookBarGeoApi(retrofit3);
            }
        }

        /* synthetic */ AddressComponentImpl(NetworkComponentApi networkComponentApi, TabsComponentApi tabsComponentApi, LocationComponentApi locationComponentApi, StorageComponentApi storageComponentApi, int i11) {
            this(networkComponentApi, tabsComponentApi, locationComponentApi, storageComponentApi);
        }

        private void initialize(NetworkComponentApi networkComponentApi, TabsComponentApi tabsComponentApi, LocationComponentApi locationComponentApi, StorageComponentApi storageComponentApi) {
            this.provideAddressUiInfoApiProvider = d.b(new SwitchingProvider(this.addressComponentImpl, 1));
            this.provideActionAddressBookBarGeoApiProvider = d.b(new SwitchingProvider(this.addressComponentImpl, 2));
            SwitchingProvider switchingProvider = new SwitchingProvider(this.addressComponentImpl, 0);
            this.addressUiInfoViewModelImplProvider = switchingProvider;
            this.bindAddressUiInfoViewModelProvider = d.b(switchingProvider);
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.addressComponentImpl, 3);
            this.addressUpdateManagerImplProvider = switchingProvider2;
            this.provideAddressUpdateManagerProvider = d.b(switchingProvider2);
        }

        @Override // ru.ozon.app.android.checkoutgeo.address.di.AddressComponentApi
        public AddressUpdateManager getAddressManager() {
            return this.provideAddressUpdateManagerProvider.get();
        }

        @Override // ru.ozon.app.android.checkoutgeo.address.di.AddressComponentApi
        public AddressUiInfoViewModel getAddressUiInfoViewModel() {
            return this.bindAddressUiInfoViewModelProvider.get();
        }

        private AddressComponentImpl(NetworkComponentApi networkComponentApi, TabsComponentApi tabsComponentApi, LocationComponentApi locationComponentApi, StorageComponentApi storageComponentApi) {
            this.addressComponentImpl = this;
            this.networkComponentApi = networkComponentApi;
            this.tabsComponentApi = tabsComponentApi;
            this.locationComponentApi = locationComponentApi;
            this.storageComponentApi = storageComponentApi;
            initialize(networkComponentApi, tabsComponentApi, locationComponentApi, storageComponentApi);
        }
    }

    private static final class Factory implements AddressComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.checkoutgeo.address.di.AddressComponent.Factory
        public AddressComponent create(NetworkComponentApi networkComponentApi, TabsComponentApi tabsComponentApi, LocationComponentApi locationComponentApi, StorageComponentApi storageComponentApi) {
            networkComponentApi.getClass();
            tabsComponentApi.getClass();
            locationComponentApi.getClass();
            storageComponentApi.getClass();
            return new AddressComponentImpl(networkComponentApi, tabsComponentApi, locationComponentApi, storageComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static AddressComponent.Factory factory() {
        return new Factory(0);
    }
}
