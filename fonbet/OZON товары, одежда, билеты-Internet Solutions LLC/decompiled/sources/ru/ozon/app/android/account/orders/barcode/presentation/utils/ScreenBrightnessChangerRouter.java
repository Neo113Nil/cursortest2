package ru.ozon.app.android.account.orders.barcode.presentation.utils;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.csma.flags.BarcodeFloorBrightnessChangerEnabledFlag;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/presentation/utils/ScreenBrightnessChangerRouter;", "Lru/ozon/app/android/account/orders/barcode/presentation/utils/ScreenBrightnessChanger;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/account/orders/barcode/presentation/utils/FloorBrightnessChanger;", "floor", "Lru/ozon/app/android/account/orders/barcode/presentation/utils/MaxBrightnessChanger;", "max", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/account/orders/barcode/presentation/utils/FloorBrightnessChanger;Lru/ozon/app/android/account/orders/barcode/presentation/utils/MaxBrightnessChanger;)V", "Landroid/app/Activity;", "activity", "", "increaseBrightness", "(Landroid/app/Activity;)V", "", "shouldDisableOverride", "returnUserBrightness", "(Landroid/app/Activity;Z)V", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/account/orders/barcode/presentation/utils/FloorBrightnessChanger;", "getFloor", "()Lru/ozon/app/android/account/orders/barcode/presentation/utils/FloorBrightnessChanger;", "Lru/ozon/app/android/account/orders/barcode/presentation/utils/MaxBrightnessChanger;", "getMax", "()Lru/ozon/app/android/account/orders/barcode/presentation/utils/MaxBrightnessChanger;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ScreenBrightnessChangerRouter implements ScreenBrightnessChanger {
    private final /* synthetic */ ScreenBrightnessChanger $$delegate_0;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final FloorBrightnessChanger floor;

    @NotNull
    private final MaxBrightnessChanger max;

    /* JADX WARN: Multi-variable type inference failed */
    public ScreenBrightnessChangerRouter(@NotNull FeatureChecker featureChecker, @NotNull FloorBrightnessChanger floor, @NotNull MaxBrightnessChanger max) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(floor, "floor");
        Intrinsics.checkNotNullParameter(max, "max");
        this.$$delegate_0 = featureChecker.isEnabled(BarcodeFloorBrightnessChangerEnabledFlag.INSTANCE) ? floor : max;
        this.featureChecker = featureChecker;
        this.floor = floor;
        this.max = max;
    }

    @Override // ru.ozon.app.android.account.orders.barcode.presentation.utils.ScreenBrightnessChanger
    public void increaseBrightness(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.$$delegate_0.increaseBrightness(activity);
    }

    @Override // ru.ozon.app.android.account.orders.barcode.presentation.utils.ScreenBrightnessChanger
    public void returnUserBrightness(@NotNull Activity activity, boolean shouldDisableOverride) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.$$delegate_0.returnUserBrightness(activity, shouldDisableOverride);
    }
}
