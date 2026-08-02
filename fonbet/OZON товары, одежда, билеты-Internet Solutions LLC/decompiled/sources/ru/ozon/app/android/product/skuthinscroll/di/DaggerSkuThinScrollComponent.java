package ru.ozon.app.android.product.skuthinscroll.di;

import Jb.j;
import WZ.l;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.product.skuthinscroll.di.SkuThinScrollComponent;
import ru.ozon.app.android.product.skuthinscroll.presentation.SkuThinScrollMapper;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.video.preload.PlayerPreloader;

/* loaded from: classes13.dex */
public final class DaggerSkuThinScrollComponent {

    private static final class Factory implements SkuThinScrollComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.product.skuthinscroll.di.SkuThinScrollComponent.Factory
        public SkuThinScrollComponent create(AccountComponentApi accountComponentApi, NetworkComponentApi networkComponentApi, CartServiceApi cartServiceApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, VideoComponentApi videoComponentApi, RetainComposerComponentApi retainComposerComponentApi) {
            accountComponentApi.getClass();
            networkComponentApi.getClass();
            cartServiceApi.getClass();
            coroutineDispatchersComponentApi.getClass();
            videoComponentApi.getClass();
            retainComposerComponentApi.getClass();
            return new SkuThinScrollComponentImpl(accountComponentApi, networkComponentApi, cartServiceApi, coroutineDispatchersComponentApi, videoComponentApi, retainComposerComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class SkuThinScrollComponentImpl implements SkuThinScrollComponent {
        private final AccountComponentApi accountComponentApi;
        private final CartServiceApi cartServiceApi;
        private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        private final NetworkComponentApi networkComponentApi;
        private final RetainComposerComponentApi retainComposerComponentApi;
        private final SkuThinScrollComponentImpl skuThinScrollComponentImpl;
        private final VideoComponentApi videoComponentApi;

        /* synthetic */ SkuThinScrollComponentImpl(AccountComponentApi accountComponentApi, NetworkComponentApi networkComponentApi, CartServiceApi cartServiceApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, VideoComponentApi videoComponentApi, RetainComposerComponentApi retainComposerComponentApi, int i11) {
            this(accountComponentApi, networkComponentApi, cartServiceApi, coroutineDispatchersComponentApi, videoComponentApi, retainComposerComponentApi);
        }

        @Override // ru.ozon.app.android.product.skuthinscroll.di.SkuThinScrollComponent
        public AdultHandler getAdultHandler() {
            AdultHandler adultHandler = this.accountComponentApi.getAdultHandler();
            j.c(adultHandler);
            return adultHandler;
        }

        @Override // ru.ozon.app.android.product.skuthinscroll.di.SkuThinScrollComponent
        public CartService getCartService() {
            CartService cartService = this.cartServiceApi.getCartService();
            j.c(cartService);
            return cartService;
        }

        @Override // ru.ozon.app.android.product.skuthinscroll.di.SkuThinScrollComponent
        public CoroutineDispatcherProvider getCoroutineDispatchersProvider() {
            CoroutineDispatcherProvider dispatcherProvider = this.coroutineDispatchersComponentApi.getDispatcherProvider();
            j.c(dispatcherProvider);
            return dispatcherProvider;
        }

        @Override // ru.ozon.app.android.product.skuthinscroll.di.SkuThinScrollComponent
        public FeatureChecker getFeatureChecker() {
            FeatureChecker featureChecker = this.networkComponentApi.getFeatureChecker();
            j.c(featureChecker);
            return featureChecker;
        }

        @Override // ru.ozon.app.android.product.skuthinscroll.di.SkuThinScrollComponent
        public SkuThinScrollMapper getMapper() {
            return new SkuThinScrollMapper();
        }

        @Override // ru.ozon.app.android.product.skuthinscroll.di.SkuThinScrollComponent
        public PlayerPreloader getPlayerPreloader() {
            PlayerPreloader playerPreloader = this.videoComponentApi.getPlayerPreloader();
            j.c(playerPreloader);
            return playerPreloader;
        }

        @Override // ru.ozon.app.android.product.skuthinscroll.di.SkuThinScrollComponent
        public l getTokenizedAnalytics() {
            l tokenizedAnalytics = this.retainComposerComponentApi.getTokenizedAnalytics();
            j.c(tokenizedAnalytics);
            return tokenizedAnalytics;
        }

        private SkuThinScrollComponentImpl(AccountComponentApi accountComponentApi, NetworkComponentApi networkComponentApi, CartServiceApi cartServiceApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, VideoComponentApi videoComponentApi, RetainComposerComponentApi retainComposerComponentApi) {
            this.skuThinScrollComponentImpl = this;
            this.cartServiceApi = cartServiceApi;
            this.networkComponentApi = networkComponentApi;
            this.accountComponentApi = accountComponentApi;
            this.coroutineDispatchersComponentApi = coroutineDispatchersComponentApi;
            this.videoComponentApi = videoComponentApi;
            this.retainComposerComponentApi = retainComposerComponentApi;
        }
    }

    public static SkuThinScrollComponent.Factory factory() {
        return new Factory(0);
    }
}
