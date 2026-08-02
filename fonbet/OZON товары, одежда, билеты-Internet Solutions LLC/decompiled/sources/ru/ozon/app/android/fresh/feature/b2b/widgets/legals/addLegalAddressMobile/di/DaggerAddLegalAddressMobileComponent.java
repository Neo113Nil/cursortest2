package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.di;

import Jb.d;
import Jb.j;
import Pc.a;
import retrofit2.Retrofit;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.CommonLegalsModule_Companion_ProvideLegalsApi$b2b_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.data.CheckLegalAddressRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.data.CheckLegalAddressRepositoryImpl;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.di.AddLegalAddressMobileComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.presentation.AddLegalAddressMobileViewModel;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.presentation.mapper.AddLegalAddressMobileMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.api.LegalsApi;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.app.android.mapcommon.map.di.OzonMapComponentApi;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.mapcommon.mapcommon.di.MapCommonComponentApi;
import ru.ozon.app.android.mapcommon.mapcommon.di.provider.SdkSuggestionsControllerWrapperProvider;
import ru.ozon.app.android.mapcommon.ozongeoproxyclient.OzonGeoProxyClient;
import ru.ozon.app.android.network.di.NetworkComponentApi;

/* loaded from: classes12.dex */
public final class DaggerAddLegalAddressMobileComponent {

    private static final class AddLegalAddressMobileComponentImpl implements AddLegalAddressMobileComponent {
        private final AddLegalAddressMobileComponentImpl addLegalAddressMobileComponentImpl;
        private a<AddLegalAddressMobileMapper> addLegalAddressMobileMapperProvider;
        private a<AddLegalAddressMobileViewModel> addLegalAddressMobileViewModelProvider;
        private a<CheckLegalAddressRepository> bindCheckLegalAddressRepositoryProvider;
        private a<CheckLegalAddressRepositoryImpl> checkLegalAddressRepositoryImplProvider;
        private final LocationComponentApi locationComponentApi;
        private final MapCommonComponentApi mapCommonComponentApi;
        private final NetworkComponentApi networkComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {
            private final AddLegalAddressMobileComponentImpl addLegalAddressMobileComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92646id;

            SwitchingProvider(AddLegalAddressMobileComponentImpl addLegalAddressMobileComponentImpl, int i11) {
                this.addLegalAddressMobileComponentImpl = addLegalAddressMobileComponentImpl;
                this.f92646id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92646id;
                if (i11 == 0) {
                    return (T) new AddLegalAddressMobileMapper();
                }
                if (i11 != 1) {
                    if (i11 == 2) {
                        return (T) new CheckLegalAddressRepositoryImpl(this.addLegalAddressMobileComponentImpl.legalsApi());
                    }
                    throw new AssertionError(this.f92646id);
                }
                CheckLegalAddressRepository checkLegalAddressRepository = (CheckLegalAddressRepository) this.addLegalAddressMobileComponentImpl.bindCheckLegalAddressRepositoryProvider.get();
                OzonGeoProxyClient ozonGeoProxyClient = this.addLegalAddressMobileComponentImpl.locationComponentApi.getOzonGeoProxyClient();
                j.c(ozonGeoProxyClient);
                AreaLocalStore areaLocalStore = this.addLegalAddressMobileComponentImpl.locationComponentApi.getAreaLocalStore();
                j.c(areaLocalStore);
                SdkSuggestionsControllerWrapperProvider sdkSuggestionsControllerWrapperProvider = this.addLegalAddressMobileComponentImpl.mapCommonComponentApi.getSdkSuggestionsControllerWrapperProvider();
                j.c(sdkSuggestionsControllerWrapperProvider);
                return (T) new AddLegalAddressMobileViewModel(checkLegalAddressRepository, ozonGeoProxyClient, areaLocalStore, sdkSuggestionsControllerWrapperProvider);
            }
        }

        /* synthetic */ AddLegalAddressMobileComponentImpl(MapCommonComponentApi mapCommonComponentApi, NetworkComponentApi networkComponentApi, OzonMapComponentApi ozonMapComponentApi, LocationComponentApi locationComponentApi, int i11) {
            this(mapCommonComponentApi, networkComponentApi, ozonMapComponentApi, locationComponentApi);
        }

        private void initialize(MapCommonComponentApi mapCommonComponentApi, NetworkComponentApi networkComponentApi, OzonMapComponentApi ozonMapComponentApi, LocationComponentApi locationComponentApi) {
            this.addLegalAddressMobileMapperProvider = d.b(new SwitchingProvider(this.addLegalAddressMobileComponentImpl, 0));
            SwitchingProvider switchingProvider = new SwitchingProvider(this.addLegalAddressMobileComponentImpl, 2);
            this.checkLegalAddressRepositoryImplProvider = switchingProvider;
            this.bindCheckLegalAddressRepositoryProvider = d.b(switchingProvider);
            this.addLegalAddressMobileViewModelProvider = new SwitchingProvider(this.addLegalAddressMobileComponentImpl, 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public LegalsApi legalsApi() {
            Retrofit retrofit = this.networkComponentApi.getRetrofit();
            j.c(retrofit);
            return CommonLegalsModule_Companion_ProvideLegalsApi$b2b_prodGoogleAllVendorsReleaseFactory.provideLegalsApi$b2b_prodGoogleAllVendorsRelease(retrofit);
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.di.AddLegalAddressMobileComponent
        public AddLegalAddressMobileMapper getAddLegalAddressMobileMapper() {
            return this.addLegalAddressMobileMapperProvider.get();
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.di.AddLegalAddressMobileComponent
        public a<AddLegalAddressMobileViewModel> getWidgetViewModelProvider() {
            return this.addLegalAddressMobileViewModelProvider;
        }

        private AddLegalAddressMobileComponentImpl(MapCommonComponentApi mapCommonComponentApi, NetworkComponentApi networkComponentApi, OzonMapComponentApi ozonMapComponentApi, LocationComponentApi locationComponentApi) {
            this.addLegalAddressMobileComponentImpl = this;
            this.networkComponentApi = networkComponentApi;
            this.locationComponentApi = locationComponentApi;
            this.mapCommonComponentApi = mapCommonComponentApi;
            initialize(mapCommonComponentApi, networkComponentApi, ozonMapComponentApi, locationComponentApi);
        }
    }

    private static final class Factory implements AddLegalAddressMobileComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.di.AddLegalAddressMobileComponent.Factory
        public AddLegalAddressMobileComponent create(MapCommonComponentApi mapCommonComponentApi, NetworkComponentApi networkComponentApi, OzonMapComponentApi ozonMapComponentApi, LocationComponentApi locationComponentApi) {
            mapCommonComponentApi.getClass();
            networkComponentApi.getClass();
            ozonMapComponentApi.getClass();
            locationComponentApi.getClass();
            return new AddLegalAddressMobileComponentImpl(mapCommonComponentApi, networkComponentApi, ozonMapComponentApi, locationComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static AddLegalAddressMobileComponent.Factory factory() {
        return new Factory(0);
    }
}
