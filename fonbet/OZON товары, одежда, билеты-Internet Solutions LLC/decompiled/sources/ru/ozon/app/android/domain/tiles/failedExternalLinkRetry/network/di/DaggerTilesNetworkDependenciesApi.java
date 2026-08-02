package ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.network.di;

import Jb.j;
import We.B;
import ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.FailedExternalLinkRetryInteractor;
import ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.di.FailedExternalLinkRetryComponentApi;
import ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.featureChecker.FailedExternalLinkRetryFeatureChecker;
import ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.network.FailedExternalLinkRetryInterceptor;
import ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.network.di.TilesNetworkDependenciesApi;

/* loaded from: classes6.dex */
public final class DaggerTilesNetworkDependenciesApi {

    private static final class Factory implements TilesNetworkDependenciesApi.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.network.di.TilesNetworkDependenciesApi.Factory
        public TilesNetworkDependenciesApi create(FailedExternalLinkRetryComponentApi failedExternalLinkRetryComponentApi) {
            failedExternalLinkRetryComponentApi.getClass();
            return new TilesNetworkDependenciesApiImpl(failedExternalLinkRetryComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class TilesNetworkDependenciesApiImpl implements TilesNetworkDependenciesApi {
        private final FailedExternalLinkRetryComponentApi failedExternalLinkRetryComponentApi;
        private final TilesNetworkDependenciesApiImpl tilesNetworkDependenciesApiImpl;

        /* synthetic */ TilesNetworkDependenciesApiImpl(FailedExternalLinkRetryComponentApi failedExternalLinkRetryComponentApi, int i11) {
            this(failedExternalLinkRetryComponentApi);
        }

        private FailedExternalLinkRetryInterceptor failedExternalLinkRetryInterceptor() {
            FailedExternalLinkRetryInteractor failedExternalLinkRetryInteractor = this.failedExternalLinkRetryComponentApi.getFailedExternalLinkRetryInteractor();
            j.c(failedExternalLinkRetryInteractor);
            FailedExternalLinkRetryFeatureChecker failedExternalLinkRetryFeatureChecker = this.failedExternalLinkRetryComponentApi.getFailedExternalLinkRetryFeatureChecker();
            j.c(failedExternalLinkRetryFeatureChecker);
            return new FailedExternalLinkRetryInterceptor(failedExternalLinkRetryInteractor, failedExternalLinkRetryFeatureChecker);
        }

        @Override // ru.ozon.app.android.composer.network.tiles.TilesNetworkDependencies
        public B getInterceptor() {
            return failedExternalLinkRetryInterceptor();
        }

        private TilesNetworkDependenciesApiImpl(FailedExternalLinkRetryComponentApi failedExternalLinkRetryComponentApi) {
            this.tilesNetworkDependenciesApiImpl = this;
            this.failedExternalLinkRetryComponentApi = failedExternalLinkRetryComponentApi;
        }
    }

    public static TilesNetworkDependenciesApi.Factory factory() {
        return new Factory(0);
    }
}
