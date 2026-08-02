package ru.ozon.app.android.debugmenu.ozondebugmenu.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.locale.app.di.AppLocaleComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.checkoutgeo.payment.di.CheckoutPaymentComponentApi;
import ru.ozon.app.android.composer.di.ComposerPerformanceComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkOzonIdComponentApi;
import ru.ozon.app.android.network.di.NetworkUserDependencies;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.push.di.PushComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.update.di.InAppUpdateComponentApi;
import ru.ozon.app.android.video.di.VideoComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/debugmenu/ozondebugmenu/di/OzonDebugMenuComponent;", "Lru/ozon/app/android/debugmenu/ozondebugmenu/di/OzonDebugMenuComponentApi;", "Factory", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface OzonDebugMenuComponent extends OzonDebugMenuComponentApi {

    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0080\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H&¨\u0006\""}, d2 = {"Lru/ozon/app/android/debugmenu/ozondebugmenu/di/OzonDebugMenuComponent$Factory;", "", "create", "Lru/ozon/app/android/debugmenu/ozondebugmenu/di/OzonDebugMenuComponent;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "androidPlatformComponentApi", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentApi;", "composerPerformanceComponentApi", "Lru/ozon/app/android/composer/di/ComposerPerformanceComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "pushComponentApi", "Lru/ozon/app/android/push/di/PushComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkOzonIdComponentApi", "Lru/ozon/app/android/network/di/NetworkOzonIdComponentApi;", "networkUserDependencies", "Lru/ozon/app/android/network/di/NetworkUserDependencies;", "videoComponentApi", "Lru/ozon/app/android/video/di/VideoComponentApi;", "inAppUpdateComponentApi", "Lru/ozon/app/android/update/di/InAppUpdateComponentApi;", "checkoutPaymentComponentApi", "Lru/ozon/app/android/checkoutgeo/payment/di/CheckoutPaymentComponentApi;", "locationComponentApi", "Lru/ozon/app/android/mapcommon/mapcommon/di/LocationComponentApi;", "appLocaleComponentApi", "Lru/ozon/app/android/account/locale/app/di/AppLocaleComponentApi;", "analyticsComponentApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        OzonDebugMenuComponent create(@NotNull ContextComponentDependencies contextComponentDependencies, @NotNull AndroidPlatformComponentApi androidPlatformComponentApi, @NotNull ComposerPerformanceComponentApi composerPerformanceComponentApi, @NotNull StorageComponentApi storageComponentApi, @NotNull NavigationComponentApi navigationComponentApi, @NotNull PushComponentApi pushComponentApi, @NotNull NetworkComponentApi networkComponentApi, @NotNull NetworkOzonIdComponentApi networkOzonIdComponentApi, @NotNull NetworkUserDependencies networkUserDependencies, @NotNull VideoComponentApi videoComponentApi, @NotNull InAppUpdateComponentApi inAppUpdateComponentApi, @NotNull CheckoutPaymentComponentApi checkoutPaymentComponentApi, @NotNull LocationComponentApi locationComponentApi, @NotNull AppLocaleComponentApi appLocaleComponentApi, @NotNull AnalyticsComponentApi analyticsComponentApi);
    }
}
