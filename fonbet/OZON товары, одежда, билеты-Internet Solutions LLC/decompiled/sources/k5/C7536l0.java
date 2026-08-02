package k5;

import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import androidx.annotation.NonNull;

/* renamed from: k5.l0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7536l0 extends D0<String> {

    /* renamed from: e, reason: collision with root package name */
    private final WifiManager f70774e;

    C7536l0(WifiManager wifiManager) {
        super(Mm0.e.SSID);
        this.f70774e = wifiManager;
    }

    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        WifiManager wifiManager = this.f70774e;
        if (wifiManager == null) {
            throw new C7571u0("mWifiManager == null");
        }
        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
        if (connectionInfo == null) {
            throw new C7571u0("wifiInfo == null");
        }
        if (connectionInfo.getSupplicantState() != SupplicantState.COMPLETED) {
            throw new C7571u0("wifiInfo.getSupplicantState() != SupplicantState.COMPLETED");
        }
        String ssid = connectionInfo.getSSID();
        if (ssid != null) {
            ssid = ssid.replace("\"", "");
        }
        if (ssid == null || ssid.equals("<unknown ssid>")) {
            throw new C7571u0("ssid == null || ssid.equals(UNKNOWN_SSID)");
        }
        return ssid;
    }
}
