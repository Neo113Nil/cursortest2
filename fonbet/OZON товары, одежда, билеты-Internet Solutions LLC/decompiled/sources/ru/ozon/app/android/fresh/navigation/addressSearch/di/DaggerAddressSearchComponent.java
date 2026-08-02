package ru.ozon.app.android.fresh.navigation.addressSearch.di;

import GZ.g;
import Jb.d;
import Jb.j;
import Jb.m;
import Pc.a;
import retrofit2.Retrofit;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor_Factory;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.fresh.navigation.addressSearch.data.AddressValidationRepositoryImpl;
import ru.ozon.app.android.fresh.navigation.addressSearch.data.AddressValidationRepositoryImpl_Factory;
import ru.ozon.app.android.fresh.navigation.addressSearch.data.ValidateAddressApi;
import ru.ozon.app.android.fresh.navigation.addressSearch.di.AddressSearchComponent;
import ru.ozon.app.android.fresh.navigation.addressSearch.domain.AddressValidationRepository;
import ru.ozon.app.android.fresh.navigation.addressSearch.presentation.AddressSearchFragment;
import ru.ozon.app.android.fresh.navigation.addressSearch.presentation.AddressSearchFragment_MembersInjector;
import ru.ozon.app.android.fresh.navigation.addressSearch.presentation.AddressSearchViewModel;
import ru.ozon.app.android.fresh.navigation.addressSearch.presentation.AddressSearchViewModelImpl;
import ru.ozon.app.android.fresh.navigation.addressSearch.presentation.AddressSearchViewModelImpl_Factory;
import ru.ozon.app.android.mapcommon.map.di.OzonMapComponentApi;
import ru.ozon.app.android.mapcommon.mapcommon.di.MapCommonComponentApi;
import ru.ozon.app.android.mapcommon.mapcommon.di.provider.SdkSuggestionsControllerWrapperProvider;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;

/* loaded from: classes12.dex */
public final class DaggerAddressSearchComponent {

    private static final class AddressSearchComponentImpl implements AddressSearchComponent {
        private final AddressSearchComponentImpl addressSearchComponentImpl;
        private a<AddressSearchViewModelImpl> addressSearchViewModelImplProvider;
        private a<AddressValidationRepositoryImpl> addressValidationRepositoryImplProvider;
        private a<AddressSearchViewModel> bindPresenter$navigation_prodGoogleAllVendorsReleaseProvider;
        private a<AddressValidationRepository> bindRepository$navigation_prodGoogleAllVendorsReleaseProvider;
        private a<g> getOzonRouterProvider;
        private a<Retrofit> getRetrofitProvider;
        private a<SdkSuggestionsControllerWrapperProvider> getSdkSuggestionsControllerWrapperProvider;
        private a<HandlersInhibitor> handlersInhibitorProvider;
        private final NavigationComponentApi navigationComponentApi;
        private a<ValidateAddressApi> provideValidateAddressApiProvider;

        private static final class GetOzonRouterProvider implements a<g> {
            private final NavigationComponentApi navigationComponentApi;

            GetOzonRouterProvider(NavigationComponentApi navigationComponentApi) {
                this.navigationComponentApi = navigationComponentApi;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public g get() {
                g ozonRouter = this.navigationComponentApi.getOzonRouter();
                j.c(ozonRouter);
                return ozonRouter;
            }
        }

        private static final class GetRetrofitProvider implements a<Retrofit> {
            private final NetworkComponentApi networkComponentApi;

            GetRetrofitProvider(NetworkComponentApi networkComponentApi) {
                this.networkComponentApi = networkComponentApi;
            }

            @Override // Pc.a
            public Retrofit get() {
                Retrofit retrofit = this.networkComponentApi.getRetrofit();
                j.c(retrofit);
                return retrofit;
            }
        }

        private static final class GetSdkSuggestionsControllerWrapperProviderProvider implements a<SdkSuggestionsControllerWrapperProvider> {
            private final MapCommonComponentApi mapCommonComponentApi;

            GetSdkSuggestionsControllerWrapperProviderProvider(MapCommonComponentApi mapCommonComponentApi) {
                this.mapCommonComponentApi = mapCommonComponentApi;
            }

            @Override // Pc.a
            public SdkSuggestionsControllerWrapperProvider get() {
                SdkSuggestionsControllerWrapperProvider sdkSuggestionsControllerWrapperProvider = this.mapCommonComponentApi.getSdkSuggestionsControllerWrapperProvider();
                j.c(sdkSuggestionsControllerWrapperProvider);
                return sdkSuggestionsControllerWrapperProvider;
            }
        }

        /* synthetic */ AddressSearchComponentImpl(NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ContextComponentDependencies contextComponentDependencies, OzonMapComponentApi ozonMapComponentApi, MapCommonComponentApi mapCommonComponentApi, int i11) {
            this(networkComponentApi, navigationComponentApi, composerComponentApi, contextComponentDependencies, ozonMapComponentApi, mapCommonComponentApi);
        }

        private void initialize(NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ContextComponentDependencies contextComponentDependencies, OzonMapComponentApi ozonMapComponentApi, MapCommonComponentApi mapCommonComponentApi) {
            this.getOzonRouterProvider = new GetOzonRouterProvider(navigationComponentApi);
            this.handlersInhibitorProvider = m.a(HandlersInhibitor_Factory.create());
            GetRetrofitProvider getRetrofitProvider = new GetRetrofitProvider(networkComponentApi);
            this.getRetrofitProvider = getRetrofitProvider;
            a<ValidateAddressApi> b11 = d.b(AddressSearchModule_Companion_ProvideValidateAddressApiFactory.create(getRetrofitProvider));
            this.provideValidateAddressApiProvider = b11;
            AddressValidationRepositoryImpl_Factory create = AddressValidationRepositoryImpl_Factory.create(b11);
            this.addressValidationRepositoryImplProvider = create;
            this.bindRepository$navigation_prodGoogleAllVendorsReleaseProvider = d.b(create);
            GetSdkSuggestionsControllerWrapperProviderProvider getSdkSuggestionsControllerWrapperProviderProvider = new GetSdkSuggestionsControllerWrapperProviderProvider(mapCommonComponentApi);
            this.getSdkSuggestionsControllerWrapperProvider = getSdkSuggestionsControllerWrapperProviderProvider;
            AddressSearchViewModelImpl_Factory create2 = AddressSearchViewModelImpl_Factory.create(this.getOzonRouterProvider, this.handlersInhibitorProvider, this.bindRepository$navigation_prodGoogleAllVendorsReleaseProvider, getSdkSuggestionsControllerWrapperProviderProvider);
            this.addressSearchViewModelImplProvider = create2;
            this.bindPresenter$navigation_prodGoogleAllVendorsReleaseProvider = d.b(create2);
        }

        private AddressSearchFragment injectAddressSearchFragment(AddressSearchFragment addressSearchFragment) {
            AddressSearchFragment_MembersInjector.injectViewModel(addressSearchFragment, this.bindPresenter$navigation_prodGoogleAllVendorsReleaseProvider.get());
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            AddressSearchFragment_MembersInjector.injectOzonRouter(addressSearchFragment, ozonRouter);
            return addressSearchFragment;
        }

        @Override // ru.ozon.app.android.fresh.navigation.addressSearch.di.AddressSearchComponent
        public void inject(AddressSearchFragment addressSearchFragment) {
            injectAddressSearchFragment(addressSearchFragment);
        }

        private AddressSearchComponentImpl(NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ContextComponentDependencies contextComponentDependencies, OzonMapComponentApi ozonMapComponentApi, MapCommonComponentApi mapCommonComponentApi) {
            this.addressSearchComponentImpl = this;
            this.navigationComponentApi = navigationComponentApi;
            initialize(networkComponentApi, navigationComponentApi, composerComponentApi, contextComponentDependencies, ozonMapComponentApi, mapCommonComponentApi);
        }
    }

    private static final class Factory implements AddressSearchComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.fresh.navigation.addressSearch.di.AddressSearchComponent.Factory
        public AddressSearchComponent create(NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ContextComponentDependencies contextComponentDependencies, OzonMapComponentApi ozonMapComponentApi, MapCommonComponentApi mapCommonComponentApi) {
            networkComponentApi.getClass();
            navigationComponentApi.getClass();
            composerComponentApi.getClass();
            contextComponentDependencies.getClass();
            ozonMapComponentApi.getClass();
            mapCommonComponentApi.getClass();
            return new AddressSearchComponentImpl(networkComponentApi, navigationComponentApi, composerComponentApi, contextComponentDependencies, ozonMapComponentApi, mapCommonComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static AddressSearchComponent.Factory factory() {
        return new Factory(0);
    }
}
