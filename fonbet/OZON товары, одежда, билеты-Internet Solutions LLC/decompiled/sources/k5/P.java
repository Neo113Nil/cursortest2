package k5;

import android.content.Context;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
final class P extends D0<String> {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70624e;

    /* renamed from: f, reason: collision with root package name */
    private final TelephonyManager f70625f;

    P(@NonNull Context context, TelephonyManager telephonyManager) {
        super(Mm0.e.MNC);
        this.f70624e = context;
        this.f70625f = telephonyManager;
    }

    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        TelephonyManager telephonyManager = this.f70625f;
        if (telephonyManager == null) {
            throw new C7571u0("mTelephonyManager == null");
        }
        if (telephonyManager.getSimState() == 1) {
            throw new C7571u0("Sim card is not inserted");
        }
        String networkOperator = telephonyManager.getNetworkOperator();
        if (networkOperator.equals("00000")) {
            return "00";
        }
        try {
            return String.valueOf((networkOperator.isEmpty() || networkOperator.length() <= 3) ? this.f70624e.getResources().getConfiguration().mnc : Integer.parseInt(networkOperator.substring(3)));
        } catch (Exception e11) {
            throw new C7571u0(e11.getMessage());
        }
    }
}
