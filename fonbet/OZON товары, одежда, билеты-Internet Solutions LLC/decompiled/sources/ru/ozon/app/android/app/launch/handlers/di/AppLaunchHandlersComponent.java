package ru.ozon.app.android.app.launch.handlers.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.locale.app.di.AppLocaleComponentApi;
import ru.ozon.app.android.analytics.firebase.di.FirebaseAnalyticsComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cdn.host.manager.di.CdnHostManagerComponentApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.limb.Limb2ComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storage.di.ComposerDebugMenuHostApiComponent;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.tabbar.di.TabsComponentApi;
import ru.ozon.app.android.thirdpartylibs.config.di.ThirdPartyLibrariesConfigComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/app/launch/handlers/di/AppLaunchHandlersComponent;", "Lru/ozon/app/android/app/launch/handlers/di/AppLaunchHandlersComponentApi;", "Factory", "app-launch-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AppLaunchHandlersComponent extends AppLaunchHandlersComponentApi {

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001Jp\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH&¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/app/launch/handlers/di/AppLaunchHandlersComponent$Factory;", "", "create", "Lru/ozon/app/android/app/launch/handlers/di/AppLaunchHandlersComponent;", "composerComponentApi", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "tabsComponentApi", "Lru/ozon/app/android/tabbar/di/TabsComponentApi;", "cdnHostManagerComponentApi", "Lru/ozon/app/android/cdn/host/manager/di/CdnHostManagerComponentApi;", "cartServiceApi", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "thirdPartyLibrariesConfigComponentApi", "Lru/ozon/app/android/thirdpartylibs/config/di/ThirdPartyLibrariesConfigComponentApi;", "firebaseAnalyticsComponentApi", "Lru/ozon/app/android/analytics/firebase/di/FirebaseAnalyticsComponentApi;", "appLocaleComponentApi", "Lru/ozon/app/android/account/locale/app/di/AppLocaleComponentApi;", "limb2ComponentApi", "Lru/ozon/app/android/limb/Limb2ComponentApi;", "composerDebugMenuHostApiComponent", "Lru/ozon/app/android/storage/di/ComposerDebugMenuHostApiComponent;", "app-launch-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        AppLaunchHandlersComponent create(@NotNull ComposerComponentApi composerComponentApi, @NotNull NavigationComponentApi navigationComponentApi, @NotNull StorageComponentApi storageComponentApi, @NotNull TabsComponentApi tabsComponentApi, @NotNull CdnHostManagerComponentApi cdnHostManagerComponentApi, @NotNull CartServiceApi cartServiceApi, @NotNull NetworkComponentApi networkComponentApi, @NotNull AccountComponentApi accountComponentApi, @NotNull ThirdPartyLibrariesConfigComponentApi thirdPartyLibrariesConfigComponentApi, @NotNull FirebaseAnalyticsComponentApi firebaseAnalyticsComponentApi, @NotNull AppLocaleComponentApi appLocaleComponentApi, @NotNull Limb2ComponentApi limb2ComponentApi, @NotNull ComposerDebugMenuHostApiComponent composerDebugMenuHostApiComponent);
    }
}
