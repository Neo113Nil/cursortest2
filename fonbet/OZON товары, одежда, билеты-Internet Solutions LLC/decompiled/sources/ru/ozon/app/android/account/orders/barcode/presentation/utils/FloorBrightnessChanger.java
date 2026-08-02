package ru.ozon.app.android.account.orders.barcode.presentation.utils;

import android.app.Activity;
import android.content.Context;
import android.provider.Settings;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0002¢\u0006\u0002\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/presentation/utils/FloorBrightnessChanger;", "Lru/ozon/app/android/account/orders/barcode/presentation/utils/ScreenBrightnessChanger;", "<init>", "()V", "floor", "", "savedBrightness", "Ljava/lang/Float;", "increaseBrightness", "", "activity", "Landroid/app/Activity;", "returnUserBrightness", "shouldDisableOverride", "", "isAdaptiveBrightnessEnabled", "context", "Landroid/content/Context;", "readManualBrightness", "(Landroid/content/Context;)Ljava/lang/Float;", "setWindowBrightness", AppMeasurementSdk.ConditionalUserProperty.VALUE, "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FloorBrightnessChanger implements ScreenBrightnessChanger {
    private final float floor = 0.6f;
    private Float savedBrightness;

    private final boolean isAdaptiveBrightnessEnabled(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "screen_brightness_mode", 0) == 1;
    }

    private final Float readManualBrightness(Context context) {
        try {
            return Float.valueOf(h.d(Settings.System.getInt(context.getContentResolver(), "screen_brightness") / 255.0f, 0.0f, 1.0f));
        } catch (Settings.SettingNotFoundException unused) {
            return null;
        }
    }

    private final void setWindowBrightness(Activity activity, float value) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        attributes.screenBrightness = value;
        window.setAttributes(attributes);
    }

    @Override // ru.ozon.app.android.account.orders.barcode.presentation.utils.ScreenBrightnessChanger
    public void increaseBrightness(@NotNull Activity activity) {
        Float readManualBrightness;
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (isAdaptiveBrightnessEnabled(activity) || (readManualBrightness = readManualBrightness(activity)) == null || readManualBrightness.floatValue() >= this.floor) {
            return;
        }
        this.savedBrightness = Float.valueOf(activity.getWindow().getAttributes().screenBrightness);
        setWindowBrightness(activity, this.floor);
    }

    @Override // ru.ozon.app.android.account.orders.barcode.presentation.utils.ScreenBrightnessChanger
    public void returnUserBrightness(@NotNull Activity activity, boolean shouldDisableOverride) {
        float floatValue;
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (shouldDisableOverride) {
            floatValue = -1.0f;
        } else {
            Float f7 = this.savedBrightness;
            if (f7 == null) {
                return;
            } else {
                floatValue = f7.floatValue();
            }
        }
        setWindowBrightness(activity, floatValue);
        this.savedBrightness = null;
    }
}
