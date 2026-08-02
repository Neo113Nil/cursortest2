package ru.ozon.app.android.fresh.navigation.di.components;

import Jb.d;
import Jb.j;
import Pc.a;
import android.content.Context;
import retrofit2.Retrofit;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.fresh.navigation.deeplinks.FreshPdpInBottomSheetHandler;
import ru.ozon.app.android.fresh.navigation.deeplinks.FreshPdpInBottomSheetHandlerImpl_Factory;
import ru.ozon.app.android.fresh.navigation.di.components.FreshNavigationComponent;
import ru.ozon.app.android.fresh.navigation.di.modules.FreshNavigationModule_Companion_ProvideAvatarApiFactory;
import ru.ozon.app.android.fresh.navigation.di.modules.FreshNavigationModule_Companion_ProvideDispatcherProviderFactory;
import ru.ozon.app.android.fresh.navigation.di.modules.FreshNavigationModule_Companion_ProvideFreshTabBarApiFactory;
import ru.ozon.app.android.fresh.navigation.di.modules.FreshNavigationModule_Companion_ProvideImageResizerFactory;
import ru.ozon.app.android.fresh.navigation.interceptors.MoveCartItemsPayloadHandler;
import ru.ozon.app.android.fresh.navigation.interceptors.MoveCartItemsPayloadHandler_Factory;
import ru.ozon.app.android.fresh.navigation.profileAvatar.data.repository.AvatarApi;
import ru.ozon.app.android.fresh.navigation.profileAvatar.data.repository.AvatarRepository;
import ru.ozon.app.android.fresh.navigation.profileAvatar.data.repository.AvatarRepositoryImpl;
import ru.ozon.app.android.fresh.navigation.profileAvatar.data.repository.AvatarRepositoryImpl_Factory;
import ru.ozon.app.android.fresh.navigation.profileAvatar.presentation.AvatarProfileViewModel;
import ru.ozon.app.android.fresh.navigation.profileAvatar.presentation.AvatarProfileViewModel_Factory;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.image.ImageResizer;
import ru.ozon.app.android.tabbar.miniapp.fresh.FreshDefaultTabs;
import ru.ozon.app.android.tabbar.miniapp.fresh.FreshDefaultTabs_Factory;
import ru.ozon.app.android.tabbar.miniapp.fresh.FreshTabBarApi;
import ru.ozon.app.android.tabbar.miniapp.fresh.FreshTabConfigMapper;
import ru.ozon.app.android.tabbar.miniapp.fresh.FreshTabConfigMapper_Factory;
import ru.ozon.app.android.tabbar.miniapp.fresh.FreshTabConfigRepository;
import ru.ozon.app.android.tabbar.miniapp.fresh.FreshTabConfigRepositoryImpl;
import ru.ozon.app.android.tabbar.miniapp.fresh.FreshTabConfigRepositoryImpl_Factory;
import ru.ozon.app.android.tabbar.miniapp.fresh.FreshTabIdMapper_Factory;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;

/* loaded from: classes6.dex */
public final class DaggerFreshNavigationComponent {

    private static final class Factory implements FreshNavigationComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.fresh.navigation.di.components.FreshNavigationComponent.Factory
        public FreshNavigationComponent create(NetworkComponentApi networkComponentApi, ContextComponentDependencies contextComponentDependencies) {
            networkComponentApi.getClass();
            contextComponentDependencies.getClass();
            return new FreshNavigationComponentImpl(0, contextComponentDependencies, networkComponentApi);
        }

        private Factory() {
        }
    }

    private static final class FreshNavigationComponentImpl implements FreshNavigationComponent {
        private a<AvatarProfileViewModel> avatarProfileViewModelProvider;
        private a<AvatarRepositoryImpl> avatarRepositoryImplProvider;
        private a<AvatarRepository> bindAvatarRepositoryProvider;
        private a<FreshPdpInBottomSheetHandler> bindFreshPdpInBottomSheetHandlerProvider;
        private a<FreshTabConfigRepository> bindFreshTabConfigRepoProvider;
        private a<FreshDefaultTabs> freshDefaultTabsProvider;
        private final FreshNavigationComponentImpl freshNavigationComponentImpl;
        private a<FreshTabConfigMapper> freshTabConfigMapperProvider;
        private a<FreshTabConfigRepositoryImpl> freshTabConfigRepositoryImplProvider;
        private a<Context> getContextProvider;
        private a<FeatureChecker> getFeatureCheckerProvider;
        private a<Retrofit> getRetrofitProvider;
        private a<MoveCartItemsPayloadHandler> moveCartItemsPayloadHandlerProvider;
        private a<AvatarApi> provideAvatarApiProvider;
        private a<CoroutineDispatcherProvider> provideDispatcherProvider;
        private a<FreshTabBarApi> provideFreshTabBarApiProvider;
        private a<ImageResizer> provideImageResizerProvider;

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

        private static final class GetFeatureCheckerProvider implements a<FeatureChecker> {
            private final NetworkComponentApi networkComponentApi;

            GetFeatureCheckerProvider(NetworkComponentApi networkComponentApi) {
                this.networkComponentApi = networkComponentApi;
            }

            @Override // Pc.a
            public FeatureChecker get() {
                FeatureChecker featureChecker = this.networkComponentApi.getFeatureChecker();
                j.c(featureChecker);
                return featureChecker;
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

        /* synthetic */ FreshNavigationComponentImpl(int i11, ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi) {
            this(networkComponentApi, contextComponentDependencies);
        }

        private void initialize(NetworkComponentApi networkComponentApi, ContextComponentDependencies contextComponentDependencies) {
            GetRetrofitProvider getRetrofitProvider = new GetRetrofitProvider(networkComponentApi);
            this.getRetrofitProvider = getRetrofitProvider;
            this.provideFreshTabBarApiProvider = d.b(FreshNavigationModule_Companion_ProvideFreshTabBarApiFactory.create(getRetrofitProvider));
            this.freshTabConfigMapperProvider = FreshTabConfigMapper_Factory.create(FreshTabIdMapper_Factory.create());
            GetFeatureCheckerProvider getFeatureCheckerProvider = new GetFeatureCheckerProvider(networkComponentApi);
            this.getFeatureCheckerProvider = getFeatureCheckerProvider;
            FreshDefaultTabs_Factory create = FreshDefaultTabs_Factory.create(this.freshTabConfigMapperProvider, getFeatureCheckerProvider);
            this.freshDefaultTabsProvider = create;
            FreshTabConfigRepositoryImpl_Factory create2 = FreshTabConfigRepositoryImpl_Factory.create(this.provideFreshTabBarApiProvider, this.freshTabConfigMapperProvider, create);
            this.freshTabConfigRepositoryImplProvider = create2;
            this.bindFreshTabConfigRepoProvider = d.b(create2);
            this.bindFreshPdpInBottomSheetHandlerProvider = d.b(FreshPdpInBottomSheetHandlerImpl_Factory.create());
            a<AvatarApi> b11 = d.b(FreshNavigationModule_Companion_ProvideAvatarApiFactory.create(this.getRetrofitProvider));
            this.provideAvatarApiProvider = b11;
            AvatarRepositoryImpl_Factory create3 = AvatarRepositoryImpl_Factory.create(b11);
            this.avatarRepositoryImplProvider = create3;
            this.bindAvatarRepositoryProvider = d.b(create3);
            GetContextProvider getContextProvider = new GetContextProvider(contextComponentDependencies);
            this.getContextProvider = getContextProvider;
            this.provideDispatcherProvider = d.b(FreshNavigationModule_Companion_ProvideDispatcherProviderFactory.create(getContextProvider));
            a<ImageResizer> b12 = d.b(FreshNavigationModule_Companion_ProvideImageResizerFactory.create(this.getContextProvider));
            this.provideImageResizerProvider = b12;
            this.avatarProfileViewModelProvider = AvatarProfileViewModel_Factory.create(this.bindAvatarRepositoryProvider, this.provideDispatcherProvider, b12);
            this.moveCartItemsPayloadHandlerProvider = d.b(MoveCartItemsPayloadHandler_Factory.create());
        }

        @Override // ru.ozon.app.android.fresh.navigation.di.components.FreshNavigationComponentApi
        public AvatarRepository getAvatarProfileRepository() {
            return this.bindAvatarRepositoryProvider.get();
        }

        @Override // ru.ozon.app.android.fresh.navigation.di.components.FreshNavigationComponentApi
        public a<AvatarProfileViewModel> getAvatarProfileViewModelProvider() {
            return this.avatarProfileViewModelProvider;
        }

        @Override // ru.ozon.app.android.fresh.navigation.di.components.FreshNavigationComponentApi
        public FreshPdpInBottomSheetHandler getFreshPdpInBottomSheetHandler() {
            return this.bindFreshPdpInBottomSheetHandlerProvider.get();
        }

        @Override // ru.ozon.app.android.fresh.navigation.di.components.FreshNavigationComponentApi
        public FreshTabConfigRepository getFreshTabConfigRepository() {
            return this.bindFreshTabConfigRepoProvider.get();
        }

        @Override // ru.ozon.app.android.fresh.navigation.di.components.FreshNavigationComponentApi
        public MoveCartItemsPayloadHandler getMoveCartItemsPayloadHandler() {
            return this.moveCartItemsPayloadHandlerProvider.get();
        }

        private FreshNavigationComponentImpl(NetworkComponentApi networkComponentApi, ContextComponentDependencies contextComponentDependencies) {
            this.freshNavigationComponentImpl = this;
            initialize(networkComponentApi, contextComponentDependencies);
        }
    }

    public static FreshNavigationComponent.Factory factory() {
        return new Factory(0);
    }
}
