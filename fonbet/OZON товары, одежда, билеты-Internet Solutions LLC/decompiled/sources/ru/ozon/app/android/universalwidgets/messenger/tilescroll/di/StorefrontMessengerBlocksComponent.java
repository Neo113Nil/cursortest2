package ru.ozon.app.android.universalwidgets.messenger.tilescroll.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.offline.di.PdpOfflineScreenComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.storefrontcommonwidgets.di.component.StorefrontMessengerBlocksApi;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;
import ru.ozon.app.android.video.di.VideoComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/di/StorefrontMessengerBlocksComponent;", "Lru/ozon/app/android/storefrontcommonwidgets/di/component/StorefrontMessengerBlocksApi;", "Factory", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface StorefrontMessengerBlocksComponent extends StorefrontMessengerBlocksApi {

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J`\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/di/StorefrontMessengerBlocksComponent$Factory;", "", "create", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/di/StorefrontMessengerBlocksComponent;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "platformComponentDependencies", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "coroutineDispatchersComponentApi", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "pdpOfflineScreenComponentApi", "Lru/ozon/app/android/offline/di/PdpOfflineScreenComponentApi;", "videoComponentApi", "Lru/ozon/app/android/video/di/VideoComponentApi;", "cartServiceApi", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "composerComponentApi", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "favoriteComponentApi", "Lru/ozon/app/android/favorites/ui/di/FavoriteComponentApi;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        StorefrontMessengerBlocksComponent create(@NotNull NetworkComponentApi networkComponentApi, @NotNull AndroidPlatformComponentDependencies platformComponentDependencies, @NotNull NavigationComponentApi navigationComponentApi, @NotNull CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, @NotNull AccountComponentApi accountComponentApi, @NotNull PdpOfflineScreenComponentApi pdpOfflineScreenComponentApi, @NotNull VideoComponentApi videoComponentApi, @NotNull CartServiceApi cartServiceApi, @NotNull ComposerComponentApi composerComponentApi, @NotNull ContextComponentDependencies contextComponentDependencies, @NotNull FavoriteComponentApi favoriteComponentApi);
    }
}
