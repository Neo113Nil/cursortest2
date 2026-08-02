package Xj;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.media.AudioManager;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import android.util.TypedValue;
import kotlin.jvm.internal.Intrinsics;
import l0.AbstractC5338c;

/* loaded from: classes5.dex */
public abstract class c {
    public static final float a(Context context, float f10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return TypedValue.applyDimension(1, f10, context.getResources().getDisplayMetrics());
    }

    public static final AudioManager b(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("audio");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return (AudioManager) systemService;
    }

    public static final BluetoothManager c(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (!d(context)) {
            return null;
        }
        Object systemService = context.getSystemService("bluetooth");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
        return (BluetoothManager) systemService;
    }

    public static final boolean d(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.bluetooth");
    }

    public static final boolean e(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    public static final PowerManager f(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("power");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return (PowerManager) systemService;
    }

    public static final TelephonyManager g(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (!e(context)) {
            return null;
        }
        Object systemService = context.getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        return (TelephonyManager) systemService;
    }

    public static final boolean h(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return true;
    }

    public static final boolean i(Context context, String permission) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(permission, "permission");
        return AbstractC5338c.checkSelfPermission(context, permission) == 0;
    }

    public static final androidx.vectordrawable.graphics.drawable.c j(Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        androidx.vectordrawable.graphics.drawable.c a10 = androidx.vectordrawable.graphics.drawable.c.a(context, i10);
        Intrinsics.checkNotNull(a10);
        return a10;
    }

    public static final int k(Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return typedValue.data;
        }
        throw new IllegalStateException("Unable to resolve theme attribute.");
    }
}
