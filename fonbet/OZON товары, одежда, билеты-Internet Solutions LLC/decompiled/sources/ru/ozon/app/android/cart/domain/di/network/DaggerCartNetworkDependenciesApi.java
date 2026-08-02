package ru.ozon.app.android.cart.domain.di.network;

import Jb.j;
import We.B;
import ru.ozon.app.android.cart.domain.di.network.CartNetworkDependenciesApi;
import ru.ozon.app.android.cart.domain.prefetch.interceptor.CartPaginationNoStoreCacheInterceptor;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;

/* loaded from: classes6.dex */
public final class DaggerCartNetworkDependenciesApi {

    private static final class CartNetworkDependenciesApiImpl implements CartNetworkDependenciesApi {
        private final CartNetworkDependenciesApiImpl cartNetworkDependenciesApiImpl;
        private final NetworkComponentApi networkComponentApi;

        /* synthetic */ CartNetworkDependenciesApiImpl(NetworkComponentApi networkComponentApi, int i11) {
            this(networkComponentApi);
        }

        private CartPaginationNoStoreCacheInterceptor cartPaginationNoStoreCacheInterceptor2() {
            FeatureChecker featureChecker = this.networkComponentApi.getFeatureChecker();
            j.c(featureChecker);
            return new CartPaginationNoStoreCacheInterceptor(featureChecker);
        }

        @Override // ru.ozon.app.android.composer.network.cart.CartNetworkDependencies
        public B cartPaginationNoStoreCacheInterceptor() {
            return cartPaginationNoStoreCacheInterceptor2();
        }

        private CartNetworkDependenciesApiImpl(NetworkComponentApi networkComponentApi) {
            this.cartNetworkDependenciesApiImpl = this;
            this.networkComponentApi = networkComponentApi;
        }
    }

    private static final class Factory implements CartNetworkDependenciesApi.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.cart.domain.di.network.CartNetworkDependenciesApi.Factory
        public CartNetworkDependenciesApi create(NetworkComponentApi networkComponentApi) {
            networkComponentApi.getClass();
            return new CartNetworkDependenciesApiImpl(networkComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static CartNetworkDependenciesApi.Factory factory() {
        return new Factory(0);
    }
}
