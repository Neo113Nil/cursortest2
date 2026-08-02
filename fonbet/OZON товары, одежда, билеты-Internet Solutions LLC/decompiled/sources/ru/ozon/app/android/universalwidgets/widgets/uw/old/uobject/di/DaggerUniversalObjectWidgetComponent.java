package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.di;

import Jb.d;
import Jb.j;
import Pc.a;
import android.content.Context;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.ads.data.pixel.PixelApiRepository;
import ru.ozon.app.android.ads.data.pixel.di.PixelRepositoryComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.universalwidgets.di.UniversalWidgetsModule_Companion_ProvideUWidgetObjectBannerImageInfoProviderFactory;
import ru.ozon.app.android.universalwidgets.di.UniversalWidgetsModule_Companion_ProvideUWidgetObjectGrid3ImageInfoProviderFactory;
import ru.ozon.app.android.universalwidgets.di.UniversalWidgetsModule_Companion_ProvideUWidgetObjectGridImageInfoProviderFactory;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.core.UniversalObjectMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.core.UniversalObjectMapper_Factory;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.di.UniversalObjectWidgetComponent;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.footer.FooterMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.footer.FooterMapper_Factory;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.grid3.core.UniversalObjectGrid3Mapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.grid3.core.UniversalObjectGrid3Mapper_Factory;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.UniversalObjectGridOneMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.UniversalObjectGridOneMapper_Factory;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.header.HeaderMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.header.HeaderMapper_Factory;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.imageprefetch.UniversalGrid3ImagePrefetchInfoProvider;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.imageprefetch.UniversalObjectGridImagePrefetchInfoProvider;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.imageprefetch.UniversalObjectGridOneSingleItemBannerImageSizeProvider;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.pixel.PixelAnalyticsViewModel;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.pixel.PixelAnalyticsViewModel_Factory;

/* loaded from: classes2.dex */
public final class DaggerUniversalObjectWidgetComponent {

    private static final class Factory implements UniversalObjectWidgetComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.di.UniversalObjectWidgetComponent.Factory
        public UniversalObjectWidgetComponent create(NetworkComponentApi networkComponentApi, AccountComponentApi accountComponentApi, ContextComponentDependencies contextComponentDependencies, PixelRepositoryComponentApi pixelRepositoryComponentApi) {
            networkComponentApi.getClass();
            accountComponentApi.getClass();
            contextComponentDependencies.getClass();
            pixelRepositoryComponentApi.getClass();
            return new UniversalObjectWidgetComponentImpl(networkComponentApi, accountComponentApi, contextComponentDependencies, pixelRepositoryComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class UniversalObjectWidgetComponentImpl implements UniversalObjectWidgetComponent {
        private final AccountComponentApi accountComponentApi;
        private final ContextComponentDependencies contextComponentDependencies;
        private a<FooterMapper> footerMapperProvider;
        private a<Context> getContextProvider;
        private a<PixelApiRepository> getPixelRepositoryProvider;
        private a<HeaderMapper> headerMapperProvider;
        private final NetworkComponentApi networkComponentApi;
        private a<PixelAnalyticsViewModel> pixelAnalyticsViewModelProvider;
        private a<UniversalObjectGridOneSingleItemBannerImageSizeProvider> provideUWidgetObjectBannerImageInfoProvider;
        private a<UniversalGrid3ImagePrefetchInfoProvider> provideUWidgetObjectGrid3ImageInfoProvider;
        private a<UniversalObjectGridImagePrefetchInfoProvider> provideUWidgetObjectGridImageInfoProvider;
        private a<UniversalObjectGrid3Mapper> universalObjectGrid3MapperProvider;
        private a<UniversalObjectGridOneMapper> universalObjectGridOneMapperProvider;
        private a<UniversalObjectMapper> universalObjectMapperProvider;
        private final UniversalObjectWidgetComponentImpl universalObjectWidgetComponentImpl;

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

        private static final class GetPixelRepositoryProvider implements a<PixelApiRepository> {
            private final PixelRepositoryComponentApi pixelRepositoryComponentApi;

            GetPixelRepositoryProvider(PixelRepositoryComponentApi pixelRepositoryComponentApi) {
                this.pixelRepositoryComponentApi = pixelRepositoryComponentApi;
            }

            @Override // Pc.a
            public PixelApiRepository get() {
                PixelApiRepository pixelRepository = this.pixelRepositoryComponentApi.getPixelRepository();
                j.c(pixelRepository);
                return pixelRepository;
            }
        }

        /* synthetic */ UniversalObjectWidgetComponentImpl(NetworkComponentApi networkComponentApi, AccountComponentApi accountComponentApi, ContextComponentDependencies contextComponentDependencies, PixelRepositoryComponentApi pixelRepositoryComponentApi, int i11) {
            this(networkComponentApi, accountComponentApi, contextComponentDependencies, pixelRepositoryComponentApi);
        }

        private void initialize(NetworkComponentApi networkComponentApi, AccountComponentApi accountComponentApi, ContextComponentDependencies contextComponentDependencies, PixelRepositoryComponentApi pixelRepositoryComponentApi) {
            this.universalObjectMapperProvider = d.b(UniversalObjectMapper_Factory.create());
            GetContextProvider getContextProvider = new GetContextProvider(contextComponentDependencies);
            this.getContextProvider = getContextProvider;
            this.universalObjectGridOneMapperProvider = d.b(UniversalObjectGridOneMapper_Factory.create(getContextProvider));
            this.universalObjectGrid3MapperProvider = d.b(UniversalObjectGrid3Mapper_Factory.create(this.getContextProvider));
            this.headerMapperProvider = d.b(HeaderMapper_Factory.create());
            this.footerMapperProvider = d.b(FooterMapper_Factory.create());
            this.provideUWidgetObjectGrid3ImageInfoProvider = d.b(UniversalWidgetsModule_Companion_ProvideUWidgetObjectGrid3ImageInfoProviderFactory.create());
            this.provideUWidgetObjectGridImageInfoProvider = d.b(UniversalWidgetsModule_Companion_ProvideUWidgetObjectGridImageInfoProviderFactory.create());
            this.provideUWidgetObjectBannerImageInfoProvider = d.b(UniversalWidgetsModule_Companion_ProvideUWidgetObjectBannerImageInfoProviderFactory.create());
            GetPixelRepositoryProvider getPixelRepositoryProvider = new GetPixelRepositoryProvider(pixelRepositoryComponentApi);
            this.getPixelRepositoryProvider = getPixelRepositoryProvider;
            this.pixelAnalyticsViewModelProvider = PixelAnalyticsViewModel_Factory.create(getPixelRepositoryProvider);
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.di.UniversalObjectWidgetComponent
        public AdultHandler getAdultHandler() {
            AdultHandler adultHandler = this.accountComponentApi.getAdultHandler();
            j.c(adultHandler);
            return adultHandler;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.di.UniversalObjectWidgetComponent
        public FeatureChecker getFeatureChecker() {
            FeatureChecker featureChecker = this.networkComponentApi.getFeatureChecker();
            j.c(featureChecker);
            return featureChecker;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.di.UniversalObjectWidgetComponent
        public FooterMapper getFooterMapper() {
            return this.footerMapperProvider.get();
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.di.UniversalObjectWidgetComponent
        public UniversalObjectGrid3Mapper getGrid3Mapper() {
            return this.universalObjectGrid3MapperProvider.get();
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.di.UniversalObjectWidgetComponent
        public UniversalGrid3ImagePrefetchInfoProvider getGridImagePrefetchInfoProvider() {
            return this.provideUWidgetObjectGrid3ImageInfoProvider.get();
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.di.UniversalObjectWidgetComponent
        public UniversalObjectGridOneMapper getGridOneMapper() {
            return this.universalObjectGridOneMapperProvider.get();
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.di.UniversalObjectWidgetComponent
        public UniversalObjectGridOneSingleItemBannerImageSizeProvider getGridOneSingleItemBannerImageSizeProvider() {
            return this.provideUWidgetObjectBannerImageInfoProvider.get();
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.di.UniversalObjectWidgetComponent
        public HeaderMapper getHeaderMapper() {
            return this.headerMapperProvider.get();
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.di.UniversalObjectWidgetComponent
        public UniversalObjectMapper getMapper() {
            return this.universalObjectMapperProvider.get();
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.di.UniversalObjectWidgetComponent
        public a<PixelAnalyticsViewModel> getPixelAnalyticsViewModelProvider() {
            return this.pixelAnalyticsViewModelProvider;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.di.UniversalObjectWidgetComponent
        public UniversalObjectGridImagePrefetchInfoProvider getUniversalGridImagePrefetchInfoProvider() {
            return this.provideUWidgetObjectGridImageInfoProvider.get();
        }

        private UniversalObjectWidgetComponentImpl(NetworkComponentApi networkComponentApi, AccountComponentApi accountComponentApi, ContextComponentDependencies contextComponentDependencies, PixelRepositoryComponentApi pixelRepositoryComponentApi) {
            this.universalObjectWidgetComponentImpl = this;
            this.networkComponentApi = networkComponentApi;
            this.accountComponentApi = accountComponentApi;
            this.contextComponentDependencies = contextComponentDependencies;
            initialize(networkComponentApi, accountComponentApi, contextComponentDependencies, pixelRepositoryComponentApi);
        }
    }

    public static UniversalObjectWidgetComponent.Factory factory() {
        return new Factory(0);
    }
}
