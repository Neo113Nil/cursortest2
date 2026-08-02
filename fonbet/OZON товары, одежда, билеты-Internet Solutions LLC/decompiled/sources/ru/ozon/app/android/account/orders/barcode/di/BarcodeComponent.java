package ru.ozon.app.android.account.orders.barcode.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.barcode.presentation.BarcodeFragment;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.barcodecache.di.BarcodeCacheComponentApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.universalscreen.di.ComposerFragmentComponentDependencies;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/di/BarcodeComponent;", "", "Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeFragment;", "view", "", "inject", "(Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeFragment;)V", "Factory", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BarcodeComponent {

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001JH\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H&¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/di/BarcodeComponent$Factory;", "", "create", "Lru/ozon/app/android/account/orders/barcode/di/BarcodeComponent;", "barcodeCacheComponentApi", "Lru/ozon/app/android/barcodecache/di/BarcodeCacheComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "composerComponentApi", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "componentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "composerFragmentComponentDependencies", "Lru/ozon/app/android/composer/universalscreen/di/ComposerFragmentComponentDependencies;", "androidPlatformComponentApi", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentApi;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        BarcodeComponent create(@NotNull BarcodeCacheComponentApi barcodeCacheComponentApi, @NotNull NetworkComponentApi networkComponentApi, @NotNull NavigationComponentApi navigationComponentApi, @NotNull ComposerComponentApi composerComponentApi, @NotNull ActionComponentApi actionComponentApi, @NotNull ContextComponentDependencies componentDependencies, @NotNull ComposerFragmentComponentDependencies composerFragmentComponentDependencies, @NotNull AndroidPlatformComponentApi androidPlatformComponentApi);
    }

    void inject(@NotNull BarcodeFragment view);
}
