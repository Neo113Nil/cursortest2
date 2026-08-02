package k5;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import androidx.annotation.NonNull;
import spay.sdk.api.ErrorCode;

/* renamed from: k5.k2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7534k2 extends D0<String> {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70769e;

    /* renamed from: f, reason: collision with root package name */
    private final WifiManager f70770f;

    C7534k2(@NonNull Context context, WifiManager wifiManager) {
        super(Mm0.e.BSSID);
        this.f70769e = context;
        this.f70770f = wifiManager;
    }

    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        if (!Gf.d.l(this.f70769e, "android.permission.ACCESS_WIFI_STATE")) {
            return ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE;
        }
        WifiManager wifiManager = this.f70770f;
        if (wifiManager == null) {
            throw new C7571u0("mWifiManager == null");
        }
        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
        if (connectionInfo == null) {
            throw new C7571u0("wifiInfo == null");
        }
        String bssid = connectionInfo.getBSSID();
        if (bssid != null) {
            return bssid;
        }
        throw new C7571u0("bssid == null");
    }
}
