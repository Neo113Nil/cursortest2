package ru.ozon.app.android.account.orders.barcode.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.barcode.presentation.utils.FloorBrightnessChanger;
import ru.ozon.app.android.account.orders.barcode.presentation.utils.MaxBrightnessChanger;
import ru.ozon.app.android.account.orders.barcode.presentation.utils.ScreenBrightnessChanger;
import ru.ozon.app.android.account.orders.barcode.presentation.utils.ScreenBrightnessChangerRouter;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/di/ScreenBrightnessChangerModule;", "", "<init>", "()V", "provideBarcodeScreenBrightnessChanger", "Lru/ozon/app/android/account/orders/barcode/presentation/utils/ScreenBrightnessChanger;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "maxBrightnessChanger", "Lru/ozon/app/android/account/orders/barcode/presentation/utils/MaxBrightnessChanger;", "floorBrightnessChanger", "Lru/ozon/app/android/account/orders/barcode/presentation/utils/FloorBrightnessChanger;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScreenBrightnessChangerModule {
    @NotNull
    public final ScreenBrightnessChanger provideBarcodeScreenBrightnessChanger(@NotNull FeatureChecker featureChecker, @NotNull MaxBrightnessChanger maxBrightnessChanger, @NotNull FloorBrightnessChanger floorBrightnessChanger) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(maxBrightnessChanger, "maxBrightnessChanger");
        Intrinsics.checkNotNullParameter(floorBrightnessChanger, "floorBrightnessChanger");
        return new ScreenBrightnessChangerRouter(featureChecker, floorBrightnessChanger, maxBrightnessChanger);
    }
}
