package ru.ozon.app.android.autopicker.di;

import Jb.d;
import Jb.j;
import Pc.a;
import android.content.Context;
import retrofit2.Retrofit;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.modules.NonComposerPageViewAnalyticsHelper;
import ru.ozon.app.android.analytics.modules.NonComposerPageViewAnalyticsHelper_Factory;
import ru.ozon.app.android.analytics.plugins.PluginsManager;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.autopicker.di.AutoPickerComponent;
import ru.ozon.app.android.autopicker.view.productpickersearch.data.ProductPickerSearchApi;
import ru.ozon.app.android.autopicker.view.productpickersearch.data.ProductPickerSearchMapperImpl_Factory;
import ru.ozon.app.android.autopicker.view.productpickersearch.data.repo.ProductPickerSearchLocalDataSource_Factory;
import ru.ozon.app.android.autopicker.view.productpickersearch.data.repo.ProductPickerSearchNetworkDataSource;
import ru.ozon.app.android.autopicker.view.productpickersearch.data.repo.ProductPickerSearchNetworkDataSource_Factory;
import ru.ozon.app.android.autopicker.view.productpickersearch.data.repo.ProductPickerSearchRepository;
import ru.ozon.app.android.autopicker.view.productpickersearch.data.repo.ProductPickerSearchRepository_Factory;
import ru.ozon.app.android.autopicker.view.productpickersearch.di.ProductPickerSearchModule_Companion_ProvideProductPickerSearchApiFactory;
import ru.ozon.app.android.autopicker.view.productpickersearch.domain.ProductPickerSearchInteractor;
import ru.ozon.app.android.autopicker.view.productpickersearch.domain.ProductPickerSearchInteractor_Factory;
import ru.ozon.app.android.autopicker.view.productpickersearch.domain.ProductPickerSearchListFilter;
import ru.ozon.app.android.autopicker.view.productpickersearch.domain.ProductPickerSearchListFilter_Factory;
import ru.ozon.app.android.autopicker.view.productpickersearch.domain.ProductPickerSearchTreeFilter;
import ru.ozon.app.android.autopicker.view.productpickersearch.domain.ProductPickerSearchTreeFilter_Factory;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchAnalytics;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchAnalytics_Factory;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchBinder;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchFragment;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchFragment_MembersInjector;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchViewModelImpl;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchViewModelImpl_Factory;
import ru.ozon.app.android.composer.universalscreen.di.ComposerFragmentComponentDependencies;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;

/* loaded from: classes11.dex */
public final class DaggerAutoPickerComponent {

    private static final class AutoPickerComponentImpl implements AutoPickerComponent {
        private final AutoPickerComponentImpl autoPickerComponentImpl;
        private a<Sg.a> bindAnalyticsScreenStorageProvider;
        private a<AnalyticsDataLayer> getAnalyticsDataLayerProvider;
        private a<Sg.a> getAnalyticsScreenStorageProvider;
        private a<Sg.a> getApplicationAnalyticsScreenStorageProvider;
        private a<Context> getContextProvider;
        private a<PluginsManager> getPluginsManagerProvider;
        private a<Retrofit> getRetrofitProvider;
        private a<NonComposerPageViewAnalyticsHelper> nonComposerPageViewAnalyticsHelperProvider;
        private a<ProductPickerSearchAnalytics> productPickerSearchAnalyticsProvider;
        private a<ProductPickerSearchInteractor> productPickerSearchInteractorProvider;
        private a<ProductPickerSearchListFilter> productPickerSearchListFilterProvider;
        private a<ProductPickerSearchNetworkDataSource> productPickerSearchNetworkDataSourceProvider;
        private a<ProductPickerSearchRepository> productPickerSearchRepositoryProvider;
        private a<ProductPickerSearchTreeFilter> productPickerSearchTreeFilterProvider;
        private a<ProductPickerSearchViewModelImpl> productPickerSearchViewModelImplProvider;
        private a<ProductPickerSearchApi> provideProductPickerSearchApiProvider;

        private static final class GetAnalyticsDataLayerProvider implements a<AnalyticsDataLayer> {
            private final AnalyticsComponentApi analyticsComponentApi;

            GetAnalyticsDataLayerProvider(AnalyticsComponentApi analyticsComponentApi) {
                this.analyticsComponentApi = analyticsComponentApi;
            }

            @Override // Pc.a
            public AnalyticsDataLayer get() {
                AnalyticsDataLayer analyticsDataLayer = this.analyticsComponentApi.getAnalyticsDataLayer();
                j.c(analyticsDataLayer);
                return analyticsDataLayer;
            }
        }

        private static final class GetAnalyticsScreenStorageProvider implements a<Sg.a> {
            private final AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;

            GetAnalyticsScreenStorageProvider(AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
                this.analyticsScreenStorageComponentApi = analyticsScreenStorageComponentApi;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public Sg.a get() {
                Sg.a analyticsScreenStorage = this.analyticsScreenStorageComponentApi.getAnalyticsScreenStorage();
                j.c(analyticsScreenStorage);
                return analyticsScreenStorage;
            }
        }

        private static final class GetApplicationAnalyticsScreenStorageProvider implements a<Sg.a> {
            private final AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;

            GetApplicationAnalyticsScreenStorageProvider(AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
                this.analyticsScreenStorageComponentApi = analyticsScreenStorageComponentApi;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public Sg.a get() {
                Sg.a applicationAnalyticsScreenStorage = this.analyticsScreenStorageComponentApi.getApplicationAnalyticsScreenStorage();
                j.c(applicationAnalyticsScreenStorage);
                return applicationAnalyticsScreenStorage;
            }
        }

        private static final class GetContextProvider implements a<Context> {
            private final ContextComponentDependencies contextComponentDependencies;

            GetContextProvider(ContextComponentDependencies contextComponentDependencies) {
                this.contextComponentDependencies = contextComponentDependencies;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public Context get() {
                Context context = this.contextComponentDependencies.getContext();
                j.c(context);
                return context;
            }
        }

        private static final class GetPluginsManagerProvider implements a<PluginsManager> {
            private final AnalyticsComponentApi analyticsComponentApi;

            GetPluginsManagerProvider(AnalyticsComponentApi analyticsComponentApi) {
                this.analyticsComponentApi = analyticsComponentApi;
            }

            @Override // Pc.a
            public PluginsManager get() {
                PluginsManager pluginsManager = this.analyticsComponentApi.getPluginsManager();
                j.c(pluginsManager);
                return pluginsManager;
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

        /* synthetic */ AutoPickerComponentImpl(NavigationComponentApi navigationComponentApi, ComposerFragmentComponentDependencies composerFragmentComponentDependencies, ContextComponentDependencies contextComponentDependencies, AnalyticsComponentApi analyticsComponentApi, NetworkComponentApi networkComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, int i11) {
            this(navigationComponentApi, composerFragmentComponentDependencies, contextComponentDependencies, analyticsComponentApi, networkComponentApi, analyticsScreenStorageComponentApi);
        }

        private void initialize(NavigationComponentApi navigationComponentApi, ComposerFragmentComponentDependencies composerFragmentComponentDependencies, ContextComponentDependencies contextComponentDependencies, AnalyticsComponentApi analyticsComponentApi, NetworkComponentApi networkComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            GetRetrofitProvider getRetrofitProvider = new GetRetrofitProvider(networkComponentApi);
            this.getRetrofitProvider = getRetrofitProvider;
            ProductPickerSearchModule_Companion_ProvideProductPickerSearchApiFactory create = ProductPickerSearchModule_Companion_ProvideProductPickerSearchApiFactory.create(getRetrofitProvider);
            this.provideProductPickerSearchApiProvider = create;
            this.productPickerSearchNetworkDataSourceProvider = ProductPickerSearchNetworkDataSource_Factory.create(create, ProductPickerSearchMapperImpl_Factory.create());
            this.productPickerSearchRepositoryProvider = ProductPickerSearchRepository_Factory.create(ProductPickerSearchLocalDataSource_Factory.create(), this.productPickerSearchNetworkDataSourceProvider);
            GetContextProvider getContextProvider = new GetContextProvider(contextComponentDependencies);
            this.getContextProvider = getContextProvider;
            this.productPickerSearchTreeFilterProvider = ProductPickerSearchTreeFilter_Factory.create(getContextProvider);
            ProductPickerSearchListFilter_Factory create2 = ProductPickerSearchListFilter_Factory.create(this.getContextProvider);
            this.productPickerSearchListFilterProvider = create2;
            this.productPickerSearchInteractorProvider = ProductPickerSearchInteractor_Factory.create(this.productPickerSearchRepositoryProvider, this.productPickerSearchTreeFilterProvider, create2);
            this.getAnalyticsDataLayerProvider = new GetAnalyticsDataLayerProvider(analyticsComponentApi);
            this.getPluginsManagerProvider = new GetPluginsManagerProvider(analyticsComponentApi);
            GetAnalyticsScreenStorageProvider getAnalyticsScreenStorageProvider = new GetAnalyticsScreenStorageProvider(analyticsScreenStorageComponentApi);
            this.getAnalyticsScreenStorageProvider = getAnalyticsScreenStorageProvider;
            this.bindAnalyticsScreenStorageProvider = d.b(getAnalyticsScreenStorageProvider);
            GetApplicationAnalyticsScreenStorageProvider getApplicationAnalyticsScreenStorageProvider = new GetApplicationAnalyticsScreenStorageProvider(analyticsScreenStorageComponentApi);
            this.getApplicationAnalyticsScreenStorageProvider = getApplicationAnalyticsScreenStorageProvider;
            NonComposerPageViewAnalyticsHelper_Factory create3 = NonComposerPageViewAnalyticsHelper_Factory.create(this.getAnalyticsDataLayerProvider, this.getPluginsManagerProvider, this.bindAnalyticsScreenStorageProvider, getApplicationAnalyticsScreenStorageProvider);
            this.nonComposerPageViewAnalyticsHelperProvider = create3;
            ProductPickerSearchAnalytics_Factory create4 = ProductPickerSearchAnalytics_Factory.create(this.getAnalyticsDataLayerProvider, this.getPluginsManagerProvider, this.bindAnalyticsScreenStorageProvider, create3);
            this.productPickerSearchAnalyticsProvider = create4;
            this.productPickerSearchViewModelImplProvider = ProductPickerSearchViewModelImpl_Factory.create(this.productPickerSearchInteractorProvider, create4);
        }

        private ProductPickerSearchFragment injectProductPickerSearchFragment(ProductPickerSearchFragment productPickerSearchFragment) {
            ProductPickerSearchFragment_MembersInjector.injectBinder(productPickerSearchFragment, getProductPickerSearchBinder());
            return productPickerSearchFragment;
        }

        public ProductPickerSearchBinder getProductPickerSearchBinder() {
            return new ProductPickerSearchBinder(this.productPickerSearchViewModelImplProvider);
        }

        @Override // ru.ozon.app.android.autopicker.di.AutoPickerComponent
        public void inject(ProductPickerSearchFragment productPickerSearchFragment) {
            injectProductPickerSearchFragment(productPickerSearchFragment);
        }

        private AutoPickerComponentImpl(NavigationComponentApi navigationComponentApi, ComposerFragmentComponentDependencies composerFragmentComponentDependencies, ContextComponentDependencies contextComponentDependencies, AnalyticsComponentApi analyticsComponentApi, NetworkComponentApi networkComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            this.autoPickerComponentImpl = this;
            initialize(navigationComponentApi, composerFragmentComponentDependencies, contextComponentDependencies, analyticsComponentApi, networkComponentApi, analyticsScreenStorageComponentApi);
        }
    }

    private static final class Factory implements AutoPickerComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.autopicker.di.AutoPickerComponent.Factory
        public AutoPickerComponent create(NavigationComponentApi navigationComponentApi, ComposerFragmentComponentDependencies composerFragmentComponentDependencies, ContextComponentDependencies contextComponentDependencies, AnalyticsComponentApi analyticsComponentApi, NetworkComponentApi networkComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            navigationComponentApi.getClass();
            composerFragmentComponentDependencies.getClass();
            contextComponentDependencies.getClass();
            analyticsComponentApi.getClass();
            networkComponentApi.getClass();
            analyticsScreenStorageComponentApi.getClass();
            return new AutoPickerComponentImpl(navigationComponentApi, composerFragmentComponentDependencies, contextComponentDependencies, analyticsComponentApi, networkComponentApi, analyticsScreenStorageComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static AutoPickerComponent.Factory factory() {
        return new Factory(0);
    }
}
