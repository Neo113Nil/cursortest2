package c;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.facebook.react.uimanager.ViewProps;
import com.surt.guardian.utils.Logger;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import l0.AbstractC5338c;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Cc.d f26690b = new Cc.d(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f26691a;

    public u0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26691a = context;
    }

    public final Map a() {
        if (AbstractC5338c.checkSelfPermission(this.f26691a, "android.permission.READ_PHONE_STATE") != 0) {
            Logger.f41582a.f("SimCardModule", "SIM card info requires READ_PHONE_STATE permission");
            return null;
        }
        try {
            Object systemService = this.f26691a.getSystemService("phone");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            TelephonyManager telephonyManager = (TelephonyManager) systemService;
            Pair pair = TuplesKt.to("carrier_name", telephonyManager.getNetworkOperatorName());
            Pair pair2 = TuplesKt.to("carrier_country", telephonyManager.getNetworkCountryIso());
            Pair pair3 = TuplesKt.to("sim_country", telephonyManager.getSimCountryIso());
            Pair pair4 = TuplesKt.to("sim_operator", telephonyManager.getSimOperator());
            Pair pair5 = TuplesKt.to("network_operator", telephonyManager.getNetworkOperator());
            int simState = telephonyManager.getSimState();
            String str = "unknown";
            Pair pair6 = TuplesKt.to("sim_state", simState != 1 ? simState != 2 ? simState != 3 ? simState != 4 ? simState != 5 ? "unknown" : "ready" : "network_locked" : "puk_required" : "pin_required" : "absent");
            int phoneType = telephonyManager.getPhoneType();
            Pair pair7 = TuplesKt.to("phone_type", phoneType != 1 ? phoneType != 2 ? phoneType != 3 ? ViewProps.NONE : "sip" : "cdma" : "gsm");
            int networkType = telephonyManager.getNetworkType();
            if (networkType == 1 || networkType == 2) {
                str = "2G";
            } else if (networkType == 3 || networkType == 8) {
                str = "3G";
            } else if (networkType == 13) {
                str = "4G";
            } else if (networkType == 20) {
                str = "5G";
            }
            return MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, TuplesKt.to("network_type", str));
        } catch (SecurityException e10) {
            Logger.f41582a.b("SimCardModule", "Security exception getting SIM info", e10);
            return null;
        } catch (Exception e11) {
            Logger.f41582a.b("SimCardModule", "Error getting SIM info", e11);
            return null;
        }
    }
}
