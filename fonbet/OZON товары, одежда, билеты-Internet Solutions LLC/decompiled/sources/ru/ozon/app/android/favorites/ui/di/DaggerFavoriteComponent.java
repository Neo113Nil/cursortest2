package ru.ozon.app.android.favorites.ui.di;

import HZ.d;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoritesComposerActionHandler;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEventManager;
import ru.ozon.app.android.favorites.domain.favoriteReserveButton.FavoriteReserveButtonMoleculeInteractor;
import ru.ozon.app.android.favorites.domain.favoriteToggleProductButton.FavoriteToggleProductButtonInteractor;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.FavoriteProductMoleculeInteractor;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.v4.FavoriteProductMoleculeV4Interactor;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEventManager;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponent;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.viewModel.FavProductButtonV4ViewModel;
import ru.ozon.app.android.favorites.ui.favoriteReserveButton.FavoriteReserveButtonViewModel;
import ru.ozon.app.android.favorites.ui.favoriteReserveButton.delegate.FavoriteReserveButtonDelegateProvider;
import ru.ozon.app.android.favorites.ui.favoriteToggleProductButton.delegate.FavoriteToggleProductButtonDelegateProvider;
import ru.ozon.app.android.favorites.ui.favoriteToggleProductButton.viewmodel.FavoriteToggleProductButtonViewModel;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.composeDelegate.FavoriteEntityComposeDelegateFactory;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.composeDelegate.FavoriteEntityComposeDelegateFactoryImpl;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.FavProductButtonPresenter;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.navigation.miniapp.CurrentMiniAppHolder;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

/* loaded from: classes6.dex */
public final class DaggerFavoriteComponent {

    private static final class Factory implements FavoriteComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.favorites.ui.di.FavoriteComponent.Factory
        public FavoriteComponent create(AccountComponentApi accountComponentApi, ActionComponentApi actionComponentApi, NetworkComponentApi networkComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi, NavigationComponentApi navigationComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            accountComponentApi.getClass();
            actionComponentApi.getClass();
            networkComponentApi.getClass();
            favoriteCoreComponentApi.getClass();
            navigationComponentApi.getClass();
            analyticsScreenStorageComponentApi.getClass();
            coroutineDispatchersComponentApi.getClass();
            customActionHandlersComponentApi.getClass();
            androidPlatformComponentDependencies.getClass();
            return new FavoriteComponentImpl(accountComponentApi, actionComponentApi, networkComponentApi, favoriteCoreComponentApi, navigationComponentApi, analyticsScreenStorageComponentApi, coroutineDispatchersComponentApi, customActionHandlersComponentApi, androidPlatformComponentDependencies, 0);
        }

        private Factory() {
        }
    }

    private static final class FavoriteComponentImpl implements FavoriteComponent {
        private final AccountComponentApi accountComponentApi;
        private final ActionComponentApi actionComponentApi;
        private final AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;
        private final AndroidPlatformComponentDependencies androidPlatformComponentDependencies;
        private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
        private a<FavProductButtonPresenter> favProductButtonPresenterProvider;
        private a<FavProductButtonV4ViewModel> favProductButtonV4ViewModelProvider;
        private final FavoriteComponentImpl favoriteComponentImpl;
        private final FavoriteCoreComponentApi favoriteCoreComponentApi;
        private a<FavoriteReserveButtonViewModel> favoriteReserveButtonViewModelProvider;
        private a<FavoriteToggleProductButtonViewModel> favoriteToggleProductButtonViewModelProvider;
        private final NavigationComponentApi navigationComponentApi;
        private final NetworkComponentApi networkComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {
            private final FavoriteComponentImpl favoriteComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92570id;

            SwitchingProvider(FavoriteComponentImpl favoriteComponentImpl, int i11) {
                this.favoriteComponentImpl = favoriteComponentImpl;
                this.f92570id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92570id;
                if (i11 == 0) {
                    return (T) new FavProductButtonPresenter(this.favoriteComponentImpl.favoriteProductMoleculeInteractor());
                }
                if (i11 == 1) {
                    FavoriteProductMoleculeV4Interactor favoriteProductMoleculeV4Interactor = this.favoriteComponentImpl.favoriteProductMoleculeV4Interactor();
                    CoroutineDispatcherProvider dispatcherProvider = this.favoriteComponentImpl.coroutineDispatchersComponentApi.getDispatcherProvider();
                    j.c(dispatcherProvider);
                    return (T) new FavProductButtonV4ViewModel(favoriteProductMoleculeV4Interactor, dispatcherProvider);
                }
                if (i11 != 2) {
                    if (i11 == 3) {
                        return (T) new FavoriteReserveButtonViewModel(this.favoriteComponentImpl.favoriteReserveButtonMoleculeInteractor());
                    }
                    throw new AssertionError(this.f92570id);
                }
                FavoriteToggleProductButtonInteractor favoriteToggleProductButtonInteractor = this.favoriteComponentImpl.favoriteCoreComponentApi.getFavoriteToggleProductButtonInteractor();
                j.c(favoriteToggleProductButtonInteractor);
                return (T) new FavoriteToggleProductButtonViewModel(favoriteToggleProductButtonInteractor);
            }
        }

        /* synthetic */ FavoriteComponentImpl(AccountComponentApi accountComponentApi, ActionComponentApi actionComponentApi, NetworkComponentApi networkComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi, NavigationComponentApi navigationComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies, int i11) {
            this(accountComponentApi, actionComponentApi, networkComponentApi, favoriteCoreComponentApi, navigationComponentApi, analyticsScreenStorageComponentApi, coroutineDispatchersComponentApi, customActionHandlersComponentApi, androidPlatformComponentDependencies);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public FavoriteProductMoleculeInteractor favoriteProductMoleculeInteractor() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            FavoriteManager favoriteManager = this.favoriteCoreComponentApi.getFavoriteManager();
            j.c(favoriteManager);
            d deeplinkMiniAppMapper = this.navigationComponentApi.getDeeplinkMiniAppMapper();
            j.c(deeplinkMiniAppMapper);
            Sg.a applicationAnalyticsScreenStorage = this.analyticsScreenStorageComponentApi.getApplicationAnalyticsScreenStorage();
            j.c(applicationAnalyticsScreenStorage);
            return new FavoriteProductMoleculeInteractor(actionRepository, favoriteManager, deeplinkMiniAppMapper, applicationAnalyticsScreenStorage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public FavoriteProductMoleculeV4Interactor favoriteProductMoleculeV4Interactor() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            FavoriteManager favoriteManager = this.favoriteCoreComponentApi.getFavoriteManager();
            j.c(favoriteManager);
            CurrentMiniAppHolder currentMiniAppHolder = this.navigationComponentApi.getCurrentMiniAppHolder();
            j.c(currentMiniAppHolder);
            Sg.a applicationAnalyticsScreenStorage = this.analyticsScreenStorageComponentApi.getApplicationAnalyticsScreenStorage();
            j.c(applicationAnalyticsScreenStorage);
            return new FavoriteProductMoleculeV4Interactor(actionRepository, favoriteManager, currentMiniAppHolder, applicationAnalyticsScreenStorage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public FavoriteReserveButtonMoleculeInteractor favoriteReserveButtonMoleculeInteractor() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            return new FavoriteReserveButtonMoleculeInteractor(actionRepository);
        }

        private FavoritesComposerActionHandler favoritesComposerActionHandler() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            FavoriteEventManager favEventManager = this.favoriteCoreComponentApi.getFavEventManager();
            j.c(favEventManager);
            FavoriteManager favoriteManager = this.favoriteCoreComponentApi.getFavoriteManager();
            j.c(favoriteManager);
            WishlistEventManager wishlistEventManager = this.favoriteCoreComponentApi.getWishlistEventManager();
            j.c(wishlistEventManager);
            FeatureChecker featureChecker = this.networkComponentApi.getFeatureChecker();
            j.c(featureChecker);
            return new FavoritesComposerActionHandler(actionRepository, favEventManager, favoriteManager, wishlistEventManager, featureChecker);
        }

        private void initialize(AccountComponentApi accountComponentApi, ActionComponentApi actionComponentApi, NetworkComponentApi networkComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi, NavigationComponentApi navigationComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            this.favProductButtonPresenterProvider = new SwitchingProvider(this.favoriteComponentImpl, 0);
            this.favProductButtonV4ViewModelProvider = new SwitchingProvider(this.favoriteComponentImpl, 1);
            this.favoriteToggleProductButtonViewModelProvider = new SwitchingProvider(this.favoriteComponentImpl, 2);
            this.favoriteReserveButtonViewModelProvider = new SwitchingProvider(this.favoriteComponentImpl, 3);
        }

        @Override // ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi
        public FavoriteEntityComposeDelegateFactory getFavoriteEntityComposeDelegateFactory() {
            return new FavoriteEntityComposeDelegateFactoryImpl();
        }

        @Override // ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi
        public ProductFavoriteDelegateProvider getFavoriteProductDelegate() {
            a<FavProductButtonPresenter> aVar = this.favProductButtonPresenterProvider;
            a<FavProductButtonV4ViewModel> aVar2 = this.favProductButtonV4ViewModelProvider;
            AdultHandler adultHandler = this.accountComponentApi.getAdultHandler();
            j.c(adultHandler);
            FavoritesComposerActionHandler favoritesComposerActionHandler = favoritesComposerActionHandler();
            AppType appType = this.androidPlatformComponentDependencies.getAppType();
            j.c(appType);
            return new ProductFavoriteDelegateProvider(aVar, aVar2, adultHandler, favoritesComposerActionHandler, appType);
        }

        @Override // ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi
        public FavoriteReserveButtonDelegateProvider getFavoriteReserveButtonDelegate() {
            return new FavoriteReserveButtonDelegateProvider(this.favoriteReserveButtonViewModelProvider);
        }

        @Override // ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi
        public FavoriteToggleProductButtonDelegateProvider getFavoriteToggleProductButtonDelegate() {
            Vg.d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            return new FavoriteToggleProductButtonDelegateProvider(customActionHandlersStoreFactory, this.favoriteToggleProductButtonViewModelProvider, favoritesComposerActionHandler());
        }

        private FavoriteComponentImpl(AccountComponentApi accountComponentApi, ActionComponentApi actionComponentApi, NetworkComponentApi networkComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi, NavigationComponentApi navigationComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            this.favoriteComponentImpl = this;
            this.actionComponentApi = actionComponentApi;
            this.favoriteCoreComponentApi = favoriteCoreComponentApi;
            this.navigationComponentApi = navigationComponentApi;
            this.analyticsScreenStorageComponentApi = analyticsScreenStorageComponentApi;
            this.coroutineDispatchersComponentApi = coroutineDispatchersComponentApi;
            this.accountComponentApi = accountComponentApi;
            this.networkComponentApi = networkComponentApi;
            this.androidPlatformComponentDependencies = androidPlatformComponentDependencies;
            this.customActionHandlersComponentApi = customActionHandlersComponentApi;
            initialize(accountComponentApi, actionComponentApi, networkComponentApi, favoriteCoreComponentApi, navigationComponentApi, analyticsScreenStorageComponentApi, coroutineDispatchersComponentApi, customActionHandlersComponentApi, androidPlatformComponentDependencies);
        }
    }

    public static FavoriteComponent.Factory factory() {
        return new Factory(0);
    }
}
