package w30;

import android.content.Context;
import android.telephony.TelephonyManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final TelephonyManager f103507a;

    public b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TelephonyManager telephonyManager = null;
        try {
            Object systemService = context.getSystemService("phone");
            if (systemService instanceof TelephonyManager) {
                telephonyManager = (TelephonyManager) systemService;
            }
        } catch (Exception unused) {
            L80.a.a("CarrierInfoProvider", "Error while get TelephonyManager");
        }
        this.f103507a = telephonyManager;
    }

    public final boolean a() {
        TelephonyManager telephonyManager = this.f103507a;
        if (telephonyManager != null) {
            return telephonyManager.isNetworkRoaming();
        }
        return false;
    }

    public final long b() {
        Long l11;
        String networkOperator;
        try {
            TelephonyManager telephonyManager = this.f103507a;
            l11 = (telephonyManager == null || (networkOperator = telephonyManager.getNetworkOperator()) == null) ? null : Long.valueOf(Long.parseLong(networkOperator));
        } catch (Exception unused) {
            l11 = -1L;
        }
        if (l11 != null) {
            return l11.longValue();
        }
        return -1L;
    }

    @NotNull
    public final String c() {
        TelephonyManager telephonyManager = this.f103507a;
        String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
        return networkOperatorName == null ? "" : networkOperatorName;
    }

    @NotNull
    public final String d() {
        TelephonyManager telephonyManager = this.f103507a;
        String networkCountryIso = telephonyManager != null ? telephonyManager.getNetworkCountryIso() : null;
        return networkCountryIso == null ? "" : networkCountryIso;
    }
}
