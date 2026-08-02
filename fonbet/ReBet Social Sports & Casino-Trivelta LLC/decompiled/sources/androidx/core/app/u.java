package androidx.core.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import io.agora.rtc2.internal.AudioRoutingController;

/* loaded from: classes.dex */
public abstract class u {
    public static int a(boolean z10, int i10) {
        int i11;
        if (!z10) {
            i11 = AudioRoutingController.DEVICE_OUT_USB_HEADSET;
        } else {
            if (Build.VERSION.SDK_INT < 31) {
                return i10;
            }
            i11 = 33554432;
        }
        return i11 | i10;
    }

    public static PendingIntent b(Context context, int i10, Intent intent, int i11, boolean z10) {
        return PendingIntent.getActivity(context, i10, intent, a(z10, i11));
    }
}
