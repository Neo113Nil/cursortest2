package com.socure.idplus.device.internal.utils;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.socure.idplus.device.internal.sigmaDeviceV2.model.MobileNetwork;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class d {
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if (r4 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList a(Context context) {
        MobileNetwork mobileNetwork;
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList();
        Object systemService = context.getApplicationContext().getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        try {
            if (e.a() >= 30) {
                MobileNetwork a2 = a(context, 0, telephonyManager);
                if (a2 != null) {
                    arrayList.add(a2);
                }
                mobileNetwork = a(context, 1, telephonyManager);
            } else {
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                Intrinsics.checkNotNullExpressionValue(networkOperatorName, "getNetworkOperatorName(...)");
                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                Intrinsics.checkNotNullExpressionValue(networkCountryIso, "getNetworkCountryIso(...)");
                mobileNetwork = new MobileNetwork(networkOperatorName, networkCountryIso);
            }
            arrayList.add(mobileNetwork);
        } catch (Exception e) {
            com.socure.idplus.device.internal.logger.b.b("NetworkUtils", "Exception when reading mobile network state: " + e.getMessage());
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static MobileNetwork a(Context context, int i, TelephonyManager telephonyManager) {
        int simState;
        int activeModemCount;
        String networkCountryIso;
        simState = telephonyManager.getSimState(i);
        if (simState != 5) {
            return null;
        }
        activeModemCount = telephonyManager.getActiveModemCount();
        if (i >= activeModemCount) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33 && !context.getPackageManager().hasSystemFeature("android.hardware.telephony.radio.access")) {
            return null;
        }
        String networkOperatorName = telephonyManager.getNetworkOperatorName();
        Intrinsics.checkNotNullExpressionValue(networkOperatorName, "getNetworkOperatorName(...)");
        networkCountryIso = telephonyManager.getNetworkCountryIso(i);
        Intrinsics.checkNotNullExpressionValue(networkCountryIso, "getNetworkCountryIso(...)");
        return new MobileNetwork(networkOperatorName, networkCountryIso);
    }
}
