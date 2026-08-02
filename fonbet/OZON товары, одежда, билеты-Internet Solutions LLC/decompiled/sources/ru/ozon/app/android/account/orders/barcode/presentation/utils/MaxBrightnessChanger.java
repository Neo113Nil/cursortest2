package ru.ozon.app.android.account.orders.barcode.presentation.utils;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/presentation/utils/MaxBrightnessChanger;", "Lru/ozon/app/android/account/orders/barcode/presentation/utils/ScreenBrightnessChanger;", "<init>", "()V", "screenBrightness", "", "increaseBrightness", "", "activity", "Landroid/app/Activity;", "returnUserBrightness", "shouldDisableOverride", "", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MaxBrightnessChanger implements ScreenBrightnessChanger {
    private float screenBrightness;

    @Override // ru.ozon.app.android.account.orders.barcode.presentation.utils.ScreenBrightnessChanger
    public void increaseBrightness(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        this.screenBrightness = window.getAttributes().screenBrightness;
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = 1.0f;
        window.setAttributes(attributes);
    }

    @Override // ru.ozon.app.android.account.orders.barcode.presentation.utils.ScreenBrightnessChanger
    public void returnUserBrightness(@NotNull Activity activity, boolean shouldDisableOverride) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = this.screenBrightness;
        window.setAttributes(attributes);
    }
}
