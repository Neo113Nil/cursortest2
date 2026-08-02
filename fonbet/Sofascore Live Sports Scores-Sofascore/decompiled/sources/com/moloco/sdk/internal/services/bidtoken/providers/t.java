package com.moloco.sdk.internal.services.bidtoken.providers;

import android.content.Context;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import com.moloco.sdk.internal.MolocoLogger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class t implements j {
    public final com.moloco.sdk.internal.services.c a;
    public s b;

    public t(com.moloco.sdk.internal.services.c cVar) {
        cVar.getClass();
        this.a = cVar;
        this.b = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final void a() {
        this.b = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final boolean b() {
        s d = d();
        boolean z = !d.equals(this.b);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "NISignalProvider", "[CBT] NIS needsRefresh: " + z + ", with nis: " + d + ", cached: " + this.b, false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final String c() {
        return "NISignalProvider";
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s d() {
        Integer num;
        String networkOperator;
        Integer num2;
        com.moloco.sdk.internal.services.c cVar = this.a;
        try {
            Context context = cVar.a;
            Context context2 = cVar.a;
            Object systemService = context.getSystemService("phone");
            systemService.getClass();
            String networkOperator2 = ((TelephonyManager) systemService).getNetworkOperator();
            if (networkOperator2 != null && networkOperator2.length() != 0) {
                num = Integer.valueOf(Integer.parseInt(networkOperator2.substring(0, 3)));
                Object systemService2 = context2.getSystemService("phone");
                systemService2.getClass();
                networkOperator = ((TelephonyManager) systemService2).getNetworkOperator();
                if (networkOperator != null && networkOperator.length() != 0) {
                    num2 = Integer.valueOf(Integer.parseInt(networkOperator.substring(3)));
                    Object systemService3 = context2.getSystemService("connectivity");
                    systemService3.getClass();
                    s sVar = new s(num, num2, Boolean.valueOf(((ConnectivityManager) systemService3).getRestrictBackgroundStatus() == 3), cVar.a());
                    MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "NISignalProvider", "[CBT] NIS providing " + sVar, false, 4, null);
                    return sVar;
                }
                num2 = null;
                Object systemService32 = context2.getSystemService("connectivity");
                systemService32.getClass();
                s sVar2 = new s(num, num2, Boolean.valueOf(((ConnectivityManager) systemService32).getRestrictBackgroundStatus() == 3), cVar.a());
                MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "NISignalProvider", "[CBT] NIS providing " + sVar2, false, 4, null);
                return sVar2;
            }
            num = null;
            Object systemService22 = context2.getSystemService("phone");
            systemService22.getClass();
            networkOperator = ((TelephonyManager) systemService22).getNetworkOperator();
            if (networkOperator != null) {
                num2 = Integer.valueOf(Integer.parseInt(networkOperator.substring(3)));
                Object systemService322 = context2.getSystemService("connectivity");
                systemService322.getClass();
                s sVar22 = new s(num, num2, Boolean.valueOf(((ConnectivityManager) systemService322).getRestrictBackgroundStatus() == 3), cVar.a());
                MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "NISignalProvider", "[CBT] NIS providing " + sVar22, false, 4, null);
                return sVar22;
            }
            num2 = null;
            Object systemService3222 = context2.getSystemService("connectivity");
            systemService3222.getClass();
            s sVar222 = new s(num, num2, Boolean.valueOf(((ConnectivityManager) systemService3222).getRestrictBackgroundStatus() == 3), cVar.a());
            MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "NISignalProvider", "[CBT] NIS providing " + sVar222, false, 4, null);
            return sVar222;
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "NISignalProvider", "[CBT] NIS Error", e, false, 8, null);
            return new s(null, null, null, null);
        }
    }
}
