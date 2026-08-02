package ru.ozon.app.android.bank.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.bank.domain.FintechLibApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.limb.Limb2ComponentApi;
import ru.ozon.app.android.mapcommon.map.di.OzonMapComponentApi;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkOzonIdComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/bank/di/FintechLibComponent;", "Lru/ozon/app/android/bank/domain/FintechLibApi;", "Builder", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FintechLibComponent extends FintechLibApi {

    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0010\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018H&J\u0010\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001dH&J\u0010\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001fH&J\b\u0010 \u001a\u00020!H&¨\u0006\""}, d2 = {"Lru/ozon/app/android/bank/di/FintechLibComponent$Builder;", "", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "androidPlatformComponentApi", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkOzonIdComponentApi", "Lru/ozon/app/android/network/di/NetworkOzonIdComponentApi;", "analyticsComponentApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "analyticsScreenStorageComponentApi", "Lru/ozon/app/android/analytics/screen/storage/di/AnalyticsScreenStorageComponentApi;", "ozonMapComponentApi", "ozonMapComponentDependencies", "Lru/ozon/app/android/mapcommon/map/di/OzonMapComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "locationComponentApi", "Lru/ozon/app/android/mapcommon/mapcommon/di/LocationComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "fintechComponentDependencies", "deps", "Lru/ozon/app/android/bank/di/FintechComponentDependencies;", "limb2ComponentApi", "Lru/ozon/app/android/limb/Limb2ComponentApi;", "build", "Lru/ozon/app/android/bank/di/FintechLibComponent;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Builder {
        @NotNull
        Builder accountComponentApi(@NotNull AccountComponentApi accountComponentApi);

        @NotNull
        Builder actionComponentApi(@NotNull ActionComponentApi actionComponentApi);

        @NotNull
        Builder analyticsComponentApi(@NotNull AnalyticsComponentApi analyticsComponentApi);

        @NotNull
        Builder analyticsScreenStorageComponentApi(@NotNull AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi);

        @NotNull
        Builder androidPlatformComponentApi(@NotNull AndroidPlatformComponentApi androidPlatformComponentApi);

        @NotNull
        FintechLibComponent build();

        @NotNull
        Builder contextComponentDependencies(@NotNull ContextComponentDependencies contextComponentDependencies);

        @NotNull
        Builder fintechComponentDependencies(@NotNull FintechComponentDependencies deps);

        @NotNull
        Builder limb2ComponentApi(@NotNull Limb2ComponentApi deps);

        @NotNull
        Builder locationComponentApi(@NotNull LocationComponentApi locationComponentApi);

        @NotNull
        Builder navigationComponentApi(@NotNull NavigationComponentApi navigationComponentApi);

        @NotNull
        Builder networkComponentApi(@NotNull NetworkComponentApi networkComponentApi);

        @NotNull
        Builder networkOzonIdComponentApi(@NotNull NetworkOzonIdComponentApi networkOzonIdComponentApi);

        @NotNull
        Builder ozonMapComponentApi(@NotNull OzonMapComponentApi ozonMapComponentDependencies);

        @NotNull
        Builder storageComponentApi(@NotNull StorageComponentApi storageComponentApi);
    }
}
