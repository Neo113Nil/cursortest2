package ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.network.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.tiles.TilesNetworkDependencies;
import ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.di.FailedExternalLinkRetryComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/network/di/TilesNetworkDependenciesApi;", "Lru/ozon/app/android/composer/network/tiles/TilesNetworkDependencies;", "Factory", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface TilesNetworkDependenciesApi extends TilesNetworkDependencies {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/network/di/TilesNetworkDependenciesApi$Factory;", "", "create", "Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/network/di/TilesNetworkDependenciesApi;", "failedExternalLinkRetryComponentApi", "Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/di/FailedExternalLinkRetryComponentApi;", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        TilesNetworkDependenciesApi create(@NotNull FailedExternalLinkRetryComponentApi failedExternalLinkRetryComponentApi);
    }
}
