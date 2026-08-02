package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1ySDK;
import com.braze.Constants;
import com.caverock.androidsvg.SVGParser;

/* loaded from: classes6.dex */
public final class AFa1zSDK implements AFd1ySDK {
    private static IntentFilter getMonetizationNetwork = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    @Override // com.appsflyer.internal.AFd1ySDK
    public final AFd1ySDK.AFa1uSDK getRevenue(Context context) {
        String str = null;
        float f = 0.0f;
        try {
            Intent registerReceiver = context.registerReceiver(null, getMonetizationNetwork);
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
                    str = SVGParser.XML_STYLESHEET_ATTR_ALTERNATE_NO;
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
        return new AFd1ySDK.AFa1uSDK(f, str);
    }
}
