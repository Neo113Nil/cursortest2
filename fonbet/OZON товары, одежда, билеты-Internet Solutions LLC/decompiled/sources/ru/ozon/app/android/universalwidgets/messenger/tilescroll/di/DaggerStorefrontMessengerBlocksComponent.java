package ru.ozon.app.android.universalwidgets.messenger.tilescroll.di;

import Jb.j;
import WZ.l;
import android.app.Application;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.offline.PdpOfflineScreenWidgetsData;
import ru.ozon.app.android.offline.di.PdpOfflineScreenComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.storefrontcommonwidgets.core.messenger.TileScrollBlockFactory;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.TileScrollBlockProviderImpl;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.di.StorefrontMessengerBlocksComponent;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.video.preload.PlayerPreloader;

/* loaded from: classes7.dex */
public final class DaggerStorefrontMessengerBlocksComponent {

    private static final class Factory implements StorefrontMessengerBlocksComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.universalwidgets.messenger.tilescroll.di.StorefrontMessengerBlocksComponent.Factory
        public StorefrontMessengerBlocksComponent create(NetworkComponentApi networkComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies, NavigationComponentApi navigationComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, AccountComponentApi accountComponentApi, PdpOfflineScreenComponentApi pdpOfflineScreenComponentApi, VideoComponentApi videoComponentApi, CartServiceApi cartServiceApi, ComposerComponentApi composerComponentApi, ContextComponentDependencies contextComponentDependencies, FavoriteComponentApi favoriteComponentApi) {
            networkComponentApi.getClass();
            androidPlatformComponentDependencies.getClass();
            navigationComponentApi.getClass();
            coroutineDispatchersComponentApi.getClass();
            accountComponentApi.getClass();
            pdpOfflineScreenComponentApi.getClass();
            videoComponentApi.getClass();
            cartServiceApi.getClass();
            composerComponentApi.getClass();
            contextComponentDependencies.getClass();
            favoriteComponentApi.getClass();
            return new StorefrontMessengerBlocksComponentImpl(networkComponentApi, androidPlatformComponentDependencies, navigationComponentApi, coroutineDispatchersComponentApi, accountComponentApi, pdpOfflineScreenComponentApi, videoComponentApi, cartServiceApi, favoriteComponentApi, composerComponentApi, contextComponentDependencies, 0);
        }

        private Factory() {
        }
    }

    private static final class StorefrontMessengerBlocksComponentImpl implements StorefrontMessengerBlocksComponent {
        private final AccountComponentApi accountComponentApi;
        private final CartServiceApi cartServiceApi;
        private final ComposerComponentApi composerComponentApi;
        private final ContextComponentDependencies contextComponentDependencies;
        private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        private final FavoriteComponentApi favoriteComponentApi;
        private final NetworkComponentApi networkComponentApi;
        private final PdpOfflineScreenComponentApi pdpOfflineScreenComponentApi;
        private final StorefrontMessengerBlocksComponentImpl storefrontMessengerBlocksComponentImpl;
        private final VideoComponentApi videoComponentApi;

        /* synthetic */ StorefrontMessengerBlocksComponentImpl(NetworkComponentApi networkComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies, NavigationComponentApi navigationComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, AccountComponentApi accountComponentApi, PdpOfflineScreenComponentApi pdpOfflineScreenComponentApi, VideoComponentApi videoComponentApi, CartServiceApi cartServiceApi, FavoriteComponentApi favoriteComponentApi, ComposerComponentApi composerComponentApi, ContextComponentDependencies contextComponentDependencies, int i11) {
            this(networkComponentApi, androidPlatformComponentDependencies, navigationComponentApi, coroutineDispatchersComponentApi, accountComponentApi, pdpOfflineScreenComponentApi, videoComponentApi, cartServiceApi, favoriteComponentApi, composerComponentApi, contextComponentDependencies);
        }

        private TileScrollBlockProviderImpl tileScrollBlockProviderImpl() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            CoroutineDispatcherProvider dispatcherProvider = this.coroutineDispatchersComponentApi.getDispatcherProvider();
            j.c(dispatcherProvider);
            PlayerPreloader playerPreloader = this.videoComponentApi.getPlayerPreloader();
            j.c(playerPreloader);
            CartService cartService = this.cartServiceApi.getCartService();
            j.c(cartService);
            AdultHandler adultHandler = this.accountComponentApi.getAdultHandler();
            j.c(adultHandler);
            FeatureChecker featureChecker = this.networkComponentApi.getFeatureChecker();
            j.c(featureChecker);
            PdpOfflineScreenWidgetsData pdpEmptyScreenService = this.pdpOfflineScreenComponentApi.pdpEmptyScreenService();
            j.c(pdpEmptyScreenService);
            ProductFavoriteDelegateProvider favoriteProductDelegate = this.favoriteComponentApi.getFavoriteProductDelegate();
            j.c(favoriteProductDelegate);
            l tokenizedAnalytics = this.composerComponentApi.getTokenizedAnalytics();
            j.c(tokenizedAnalytics);
            Application application = this.contextComponentDependencies.getApplication();
            j.c(application);
            return new TileScrollBlockProviderImpl(jsonDeserializer, dispatcherProvider, playerPreloader, cartService, adultHandler, featureChecker, pdpEmptyScreenService, favoriteProductDelegate, tokenizedAnalytics, application);
        }

        @Override // ru.ozon.app.android.storefrontcommonwidgets.di.component.StorefrontMessengerBlocksApi
        public TileScrollBlockFactory getTileScrollBlockProvider() {
            return tileScrollBlockProviderImpl();
        }

        private StorefrontMessengerBlocksComponentImpl(NetworkComponentApi networkComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies, NavigationComponentApi navigationComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, AccountComponentApi accountComponentApi, PdpOfflineScreenComponentApi pdpOfflineScreenComponentApi, VideoComponentApi videoComponentApi, CartServiceApi cartServiceApi, FavoriteComponentApi favoriteComponentApi, ComposerComponentApi composerComponentApi, ContextComponentDependencies contextComponentDependencies) {
            this.storefrontMessengerBlocksComponentImpl = this;
            this.networkComponentApi = networkComponentApi;
            this.coroutineDispatchersComponentApi = coroutineDispatchersComponentApi;
            this.videoComponentApi = videoComponentApi;
            this.cartServiceApi = cartServiceApi;
            this.accountComponentApi = accountComponentApi;
            this.pdpOfflineScreenComponentApi = pdpOfflineScreenComponentApi;
            this.favoriteComponentApi = favoriteComponentApi;
            this.composerComponentApi = composerComponentApi;
            this.contextComponentDependencies = contextComponentDependencies;
        }
    }

    public static StorefrontMessengerBlocksComponent.Factory factory() {
        return new Factory(0);
    }
}
