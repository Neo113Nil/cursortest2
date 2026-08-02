package ru.ozon.app.android.marketing.widgets.blackFridayStatus.di;

import Jb.d;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.favorites.data.service.FavoritesServiceProvider;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoriteComposerActionExecutor;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoriteComposerActionExecutor_Factory;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoritesCustomActionHandlerInteractor;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoritesCustomActionHandlerInteractor_Factory;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.core.BlackFridayStatusImageTitleMapper;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.core.BlackFridayStatusImageTitleMapper_Factory;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.core.BlackFridayStatusTextTitleMapper;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.core.BlackFridayStatusTextTitleMapper_Factory;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.di.BlackFridayStatusComponent;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;
import ru.ozon.app.android.ui.switchingbutton.delegates.RemoveFromFavoritesSwitchingButtonDelegate;
import ru.ozon.app.android.ui.switchingbutton.delegates.RemoveFromFavoritesSwitchingButtonDelegate_Factory;
import ru.ozon.app.android.ui.switchingbutton.delegates.SwitchingButtonAddToFavoriteActionDelegate;
import ru.ozon.app.android.ui.switchingbutton.delegates.SwitchingButtonAddToFavoriteActionDelegate_Factory;
import ru.ozon.app.android.ui.switchingbutton.delegates.SwitchingButtonComposerActionWithRedirectDelegate;
import ru.ozon.app.android.ui.switchingbutton.delegates.SwitchingButtonComposerActionWithRedirectDelegate_Factory;
import ru.ozon.app.android.ui.switchingbutton.di.SwitchingButtonComponentApi;
import ru.ozon.app.android.ui.switchingbutton.state.SwitchingButtonStateStorage;
import ru.ozon.app.android.ui.switchingbutton.switchingbuttondelegate.SwitchingButtonDelegate;
import ru.ozon.app.android.ui.switchingbutton.switchingbuttondelegate.SwitchingButtonDelegate_Factory;

/* loaded from: classes12.dex */
public final class DaggerBlackFridayStatusComponent {

    private static final class BlackFridayStatusComponentImpl implements BlackFridayStatusComponent {
        private final BlackFridayStatusComponentImpl blackFridayStatusComponentImpl;
        private a<BlackFridayStatusImageTitleMapper> blackFridayStatusImageTitleMapperProvider;
        private a<BlackFridayStatusTextTitleMapper> blackFridayStatusTextTitleMapperProvider;
        private a<FavoriteComposerActionExecutor> favoriteComposerActionExecutorProvider;
        private a<FavoritesCustomActionHandlerInteractor> favoritesCustomActionHandlerInteractorProvider;
        private a<ActionV2Repository> getActionRepositoryProvider;
        private a<AdultHandler> getAdultHandlerProvider;
        private a<FavoriteManager> getFavoriteManagerProvider;
        private a<FavoritesServiceProvider> getFavoritesServiceProvider;
        private a<SwitchingButtonStateStorage> getSwitchingButtonStorageProvider;
        private a<RemoveFromFavoritesSwitchingButtonDelegate> removeFromFavoritesSwitchingButtonDelegateProvider;
        private final StorageComponentApi storageComponentApi;
        private a<SwitchingButtonAddToFavoriteActionDelegate> switchingButtonAddToFavoriteActionDelegateProvider;
        private a<SwitchingButtonComposerActionWithRedirectDelegate> switchingButtonComposerActionWithRedirectDelegateProvider;
        private a<SwitchingButtonDelegate> switchingButtonDelegateProvider;

        private static final class GetActionRepositoryProvider implements a<ActionV2Repository> {
            private final ActionComponentApi actionComponentApi;

            GetActionRepositoryProvider(ActionComponentApi actionComponentApi) {
                this.actionComponentApi = actionComponentApi;
            }

            @Override // Pc.a
            public ActionV2Repository get() {
                ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
                j.c(actionRepository);
                return actionRepository;
            }
        }

        private static final class GetAdultHandlerProvider implements a<AdultHandler> {
            private final AccountComponentApi accountComponentApi;

            GetAdultHandlerProvider(AccountComponentApi accountComponentApi) {
                this.accountComponentApi = accountComponentApi;
            }

            @Override // Pc.a
            public AdultHandler get() {
                AdultHandler adultHandler = this.accountComponentApi.getAdultHandler();
                j.c(adultHandler);
                return adultHandler;
            }
        }

        private static final class GetFavoriteManagerProvider implements a<FavoriteManager> {
            private final FavoriteCoreComponentApi favoriteCoreComponentApi;

            GetFavoriteManagerProvider(FavoriteCoreComponentApi favoriteCoreComponentApi) {
                this.favoriteCoreComponentApi = favoriteCoreComponentApi;
            }

            @Override // Pc.a
            public FavoriteManager get() {
                FavoriteManager favoriteManager = this.favoriteCoreComponentApi.getFavoriteManager();
                j.c(favoriteManager);
                return favoriteManager;
            }
        }

        private static final class GetFavoritesServiceProviderProvider implements a<FavoritesServiceProvider> {
            private final FavoriteCoreComponentApi favoriteCoreComponentApi;

            GetFavoritesServiceProviderProvider(FavoriteCoreComponentApi favoriteCoreComponentApi) {
                this.favoriteCoreComponentApi = favoriteCoreComponentApi;
            }

            @Override // Pc.a
            public FavoritesServiceProvider get() {
                FavoritesServiceProvider favoritesServiceProvider = this.favoriteCoreComponentApi.getFavoritesServiceProvider();
                j.c(favoritesServiceProvider);
                return favoritesServiceProvider;
            }
        }

        private static final class GetSwitchingButtonStorageProvider implements a<SwitchingButtonStateStorage> {
            private final SwitchingButtonComponentApi switchingButtonComponentApi;

            GetSwitchingButtonStorageProvider(SwitchingButtonComponentApi switchingButtonComponentApi) {
                this.switchingButtonComponentApi = switchingButtonComponentApi;
            }

            @Override // Pc.a
            public SwitchingButtonStateStorage get() {
                SwitchingButtonStateStorage switchingButtonStorage = this.switchingButtonComponentApi.getSwitchingButtonStorage();
                j.c(switchingButtonStorage);
                return switchingButtonStorage;
            }
        }

        /* synthetic */ BlackFridayStatusComponentImpl(AccountComponentApi accountComponentApi, ActionComponentApi actionComponentApi, SwitchingButtonComponentApi switchingButtonComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi, StorageComponentApi storageComponentApi, int i11) {
            this(accountComponentApi, actionComponentApi, switchingButtonComponentApi, favoriteCoreComponentApi, storageComponentApi);
        }

        private void initialize(AccountComponentApi accountComponentApi, ActionComponentApi actionComponentApi, SwitchingButtonComponentApi switchingButtonComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi, StorageComponentApi storageComponentApi) {
            this.blackFridayStatusImageTitleMapperProvider = d.b(BlackFridayStatusImageTitleMapper_Factory.create());
            this.blackFridayStatusTextTitleMapperProvider = d.b(BlackFridayStatusTextTitleMapper_Factory.create());
            this.getSwitchingButtonStorageProvider = new GetSwitchingButtonStorageProvider(switchingButtonComponentApi);
            this.getFavoriteManagerProvider = new GetFavoriteManagerProvider(favoriteCoreComponentApi);
            this.getAdultHandlerProvider = new GetAdultHandlerProvider(accountComponentApi);
            GetFavoritesServiceProviderProvider getFavoritesServiceProviderProvider = new GetFavoritesServiceProviderProvider(favoriteCoreComponentApi);
            this.getFavoritesServiceProvider = getFavoritesServiceProviderProvider;
            FavoriteComposerActionExecutor_Factory create = FavoriteComposerActionExecutor_Factory.create(getFavoritesServiceProviderProvider, this.getFavoriteManagerProvider);
            this.favoriteComposerActionExecutorProvider = create;
            FavoritesCustomActionHandlerInteractor_Factory create2 = FavoritesCustomActionHandlerInteractor_Factory.create(create);
            this.favoritesCustomActionHandlerInteractorProvider = create2;
            this.switchingButtonAddToFavoriteActionDelegateProvider = SwitchingButtonAddToFavoriteActionDelegate_Factory.create(this.getAdultHandlerProvider, create2, this.getFavoriteManagerProvider);
            this.removeFromFavoritesSwitchingButtonDelegateProvider = RemoveFromFavoritesSwitchingButtonDelegate_Factory.create(this.favoritesCustomActionHandlerInteractorProvider);
            GetActionRepositoryProvider getActionRepositoryProvider = new GetActionRepositoryProvider(actionComponentApi);
            this.getActionRepositoryProvider = getActionRepositoryProvider;
            SwitchingButtonComposerActionWithRedirectDelegate_Factory create3 = SwitchingButtonComposerActionWithRedirectDelegate_Factory.create(getActionRepositoryProvider, this.getSwitchingButtonStorageProvider);
            this.switchingButtonComposerActionWithRedirectDelegateProvider = create3;
            this.switchingButtonDelegateProvider = SwitchingButtonDelegate_Factory.create(this.getSwitchingButtonStorageProvider, this.getFavoriteManagerProvider, this.switchingButtonAddToFavoriteActionDelegateProvider, this.removeFromFavoritesSwitchingButtonDelegateProvider, create3);
        }

        @Override // ru.ozon.app.android.marketing.widgets.blackFridayStatus.di.BlackFridayStatusComponent
        public BlackFridayStatusImageTitleMapper getImageMapper() {
            return this.blackFridayStatusImageTitleMapperProvider.get();
        }

        @Override // ru.ozon.app.android.marketing.widgets.blackFridayStatus.di.BlackFridayStatusComponent
        public StartupArgsService getStartupArgsService() {
            StartupArgsService startupArgsService = this.storageComponentApi.getStartupArgsService();
            j.c(startupArgsService);
            return startupArgsService;
        }

        @Override // ru.ozon.app.android.marketing.widgets.blackFridayStatus.di.BlackFridayStatusComponent
        public a<SwitchingButtonDelegate> getSwitchingButtonDelegateProvider() {
            return this.switchingButtonDelegateProvider;
        }

        @Override // ru.ozon.app.android.marketing.widgets.blackFridayStatus.di.BlackFridayStatusComponent
        public BlackFridayStatusTextTitleMapper getTextTitleMapper() {
            return this.blackFridayStatusTextTitleMapperProvider.get();
        }

        private BlackFridayStatusComponentImpl(AccountComponentApi accountComponentApi, ActionComponentApi actionComponentApi, SwitchingButtonComponentApi switchingButtonComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi, StorageComponentApi storageComponentApi) {
            this.blackFridayStatusComponentImpl = this;
            this.storageComponentApi = storageComponentApi;
            initialize(accountComponentApi, actionComponentApi, switchingButtonComponentApi, favoriteCoreComponentApi, storageComponentApi);
        }
    }

    private static final class Factory implements BlackFridayStatusComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.marketing.widgets.blackFridayStatus.di.BlackFridayStatusComponent.Factory
        public BlackFridayStatusComponent create(AccountComponentApi accountComponentApi, ActionComponentApi actionComponentApi, SwitchingButtonComponentApi switchingButtonComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi, StorageComponentApi storageComponentApi) {
            accountComponentApi.getClass();
            actionComponentApi.getClass();
            switchingButtonComponentApi.getClass();
            favoriteCoreComponentApi.getClass();
            storageComponentApi.getClass();
            return new BlackFridayStatusComponentImpl(accountComponentApi, actionComponentApi, switchingButtonComponentApi, favoriteCoreComponentApi, storageComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static BlackFridayStatusComponent.Factory factory() {
        return new Factory(0);
    }
}
