package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFf1aSDK;
import com.braze.Constants;

/* loaded from: classes8.dex */
public final class AFg1sSDK implements AFf1aSDK {
    private static IntentFilter getCurrencyIso4217Code = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    @Override // com.appsflyer.internal.AFf1aSDK
    public final AFf1aSDK.AFa1ySDK getMonetizationNetwork(Context context) {
        String str = null;
        float f = 0.0f;
        try {
            Intent registerReceiver = context.registerReceiver(null, getCurrencyIso4217Code);
            if (registerReceiver != null) {
                if (2 == registerReceiver.getIntExtra("status", -1)) {
                    int intExtra = registerReceiver.getIntExtra("plugged", -1);
                    if (intExtra == 1) {
                        str = Constants.BRAZE_PUSH_ACCENT_KEY;
                    } else if (intExtra == 2) {
                        str = "usb";
                    } else if (intExtra == 4) {
                        str = "wireless";
                    } else {
                        str = "other";
                    }
                } else {
                    str = "no";
                }
                int intExtra2 = registerReceiver.getIntExtra("level", -1);
                int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                if (-1 != intExtra2 && -1 != intExtra3) {
                    f = (intExtra2 * 100.0f) / intExtra3;
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("Device that failed to register receiver", th);
        }
        return new AFf1aSDK.AFa1ySDK(f, str);
    }
}
