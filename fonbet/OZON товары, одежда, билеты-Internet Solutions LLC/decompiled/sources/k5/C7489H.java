package k5;

import android.content.Context;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;

/* renamed from: k5.H, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7489H extends D0<String> {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70566e;

    /* renamed from: f, reason: collision with root package name */
    private final TelephonyManager f70567f;

    C7489H(@NonNull Context context, TelephonyManager telephonyManager) {
        super(Mm0.e.MCC);
        this.f70566e = context;
        this.f70567f = telephonyManager;
    }

    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        TelephonyManager telephonyManager = this.f70567f;
        if (telephonyManager == null) {
            throw new C7571u0("mTelephonyManager == null");
        }
        if (telephonyManager.getSimState() == 1) {
            throw new C7571u0("Sim card is not inserted");
        }
        String networkOperator = telephonyManager.getNetworkOperator();
        if (networkOperator.equals("00000")) {
            return "000";
        }
        int i11 = 0;
        try {
            i11 = !networkOperator.isEmpty() ? Integer.parseInt(networkOperator.substring(0, 3)) : this.f70566e.getResources().getConfiguration().mcc;
        } catch (Exception unused) {
        }
        if (i11 != 0) {
            return String.valueOf(i11);
        }
        throw new C7571u0("mcc == 0");
    }
}
