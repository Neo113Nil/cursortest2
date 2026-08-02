package ru.ozon.app.android.account.orders.barcode.di;

import Pc.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.barcode.presentation.viewmodel.BarcodeViewModel;
import ru.ozon.app.android.barcodecache.cache.BarcodeCacheManager;
import ru.ozon.app.android.network.networkhandler.ConnectionHandler;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/di/BarcodeViewModelModule;", "", "<init>", "()V", "LPc/a;", "Lru/ozon/app/android/barcodecache/cache/BarcodeCacheManager;", "barcodeCacheManagerProvider", "Lru/ozon/app/android/network/networkhandler/ConnectionHandler;", "connectionHandler", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/account/orders/barcode/presentation/viewmodel/BarcodeViewModel;", "provideBarcodeViewModel", "(LPc/a;Lru/ozon/app/android/network/networkhandler/ConnectionHandler;Lru/ozon/app/android/utils/AppType;)Lru/ozon/app/android/account/orders/barcode/presentation/viewmodel/BarcodeViewModel;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BarcodeViewModelModule {
    @NotNull
    public final BarcodeViewModel provideBarcodeViewModel(@NotNull a<BarcodeCacheManager> barcodeCacheManagerProvider, @NotNull ConnectionHandler connectionHandler, @NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(barcodeCacheManagerProvider, "barcodeCacheManagerProvider");
        Intrinsics.checkNotNullParameter(connectionHandler, "connectionHandler");
        Intrinsics.checkNotNullParameter(appType, "appType");
        BarcodeCacheManager barcodeCacheManager = barcodeCacheManagerProvider.get();
        Intrinsics.checkNotNullExpressionValue(barcodeCacheManager, "get(...)");
        return new BarcodeViewModel(barcodeCacheManager, connectionHandler, appType);
    }
}
