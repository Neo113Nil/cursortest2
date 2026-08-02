package k5;

import android.net.wifi.WifiManager;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
final class u3 extends D0<String> {

    /* renamed from: e, reason: collision with root package name */
    private final WifiManager f70873e;

    u3(WifiManager wifiManager) {
        super(Mm0.e.SignalStrength);
        this.f70873e = wifiManager;
    }

    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        WifiManager wifiManager = this.f70873e;
        if (wifiManager != null) {
            return String.valueOf(wifiManager.getConnectionInfo().getRssi());
        }
        throw new C7571u0("mWifiManager == null");
    }
}
