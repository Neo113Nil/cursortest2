package ru.ozon.app.android.uikit.extensions.view;

import Sc.o;
import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pX.a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroid/content/Context;", "Landroid/os/Vibrator;", "vibrator", "(Landroid/content/Context;)Landroid/os/Vibrator;", "Landroid/view/View;", "", "vibrateSingle", "(Landroid/view/View;)V", "", "versionOS", "I", "Lru/ozon/app/android/uikit/extensions/view/DEVICE;", "device", "Lru/ozon/app/android/uikit/extensions/view/DEVICE;", "ui-kit_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VibrationExtKt {

    @NotNull
    private static final DEVICE device;
    private static final int versionOS;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DEVICE.values().length];
            try {
                iArr[DEVICE.MIN_31.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DEVICE.MIN_26.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DEVICE.SAMSUNG_PIE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DEVICE.OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        int i11 = Build.VERSION.SDK_INT;
        versionOS = i11;
        device = (31 > i11 || i11 >= 34) ? i11 < 31 ? (i11 < 28 || !Build.BRAND.equals("samsung")) ? DEVICE.MIN_26 : DEVICE.SAMSUNG_PIE : DEVICE.OTHER : DEVICE.MIN_31;
    }

    public static final void vibrateSingle(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Vibrator vibrator = vibrator(context);
        int i11 = WhenMappings.$EnumSwitchMapping$0[device.ordinal()];
        if (i11 == 1) {
            view.performHapticFeedback(16);
            return;
        }
        if (i11 == 2) {
            vibrator.vibrate(VibrationEffect.createOneShot(80L, 2));
        } else if (i11 == 3) {
            vibrator.vibrate(VibrationEffect.createOneShot(80L, 13));
        } else {
            if (i11 != 4) {
                throw new o();
            }
            vibrator.vibrate(80L);
        }
    }

    @NotNull
    public static final Vibrator vibrator(@NotNull Context context) {
        Vibrator vibrator;
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (versionOS >= 31) {
            Object systemService = context.getSystemService("vibrator_manager");
            Intrinsics.g(systemService, "null cannot be cast to non-null type android.os.VibratorManager");
            vibrator = a.b(systemService).getDefaultVibrator();
        } else {
            Object systemService2 = context.getSystemService("vibrator");
            Intrinsics.g(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
            vibrator = (Vibrator) systemService2;
        }
        Intrinsics.f(vibrator);
        return vibrator;
    }
}
