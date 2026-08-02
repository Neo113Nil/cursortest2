package com.fyber.inneractive.sdk.config.cellular;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import com.fyber.inneractive.sdk.util.a1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final ExecutorService a = Executors.newSingleThreadExecutor();
    public h b;
    public final TelephonyManager c;

    public b(TelephonyManager telephonyManager, h hVar) {
        this.c = telephonyManager;
        this.b = hVar;
    }

    public final void a() {
        this.b = null;
        TelephonyManager telephonyManager = this.c;
        if (telephonyManager != null) {
            telephonyManager.unregisterTelephonyCallback(this);
        }
        this.a.shutdownNow();
    }

    public final void b() {
        TelephonyManager telephonyManager = this.c;
        if (telephonyManager != null) {
            telephonyManager.registerTelephonyCallback(this.a, this);
        }
    }

    public final void c() {
        TelephonyManager telephonyManager = this.c;
        if (telephonyManager != null) {
            telephonyManager.unregisterTelephonyCallback(this);
        }
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        a1 a1Var;
        int networkType = telephonyDisplayInfo.getNetworkType();
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        if (overrideNetworkType == 2 || overrideNetworkType == 3 || overrideNetworkType == 5) {
            a1Var = a1.MOBILE_5G;
        } else if (networkType != 0) {
            if (networkType != 3) {
                if (networkType == 18) {
                    a1Var = a1.WIFI;
                } else if (networkType == 20) {
                    a1Var = a1.MOBILE_5G;
                } else if (networkType != 5 && networkType != 6) {
                    switch (networkType) {
                        default:
                            switch (networkType) {
                                case 12:
                                case 14:
                                case 15:
                                    break;
                                case 13:
                                    a1Var = a1.MOBILE_4G;
                                    break;
                                default:
                                    a1Var = a1.CELLULAR;
                                    break;
                            }
                        case 8:
                        case 9:
                        case 10:
                            a1Var = a1.MOBILE_3G;
                            break;
                    }
                }
            }
            a1Var = a1.MOBILE_3G;
        } else {
            a1Var = a1.UNKNOWN;
        }
        h hVar = this.b;
        if (hVar != null) {
            hVar.a(a1Var);
        }
    }
}
