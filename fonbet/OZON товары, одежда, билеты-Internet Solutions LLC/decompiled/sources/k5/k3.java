package k5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import androidx.annotation.NonNull;
import java.net.NetworkInterface;
import java.util.Collections;

/* loaded from: classes8.dex */
final class k3 extends D0<String> implements InterfaceC7580w1 {

    /* renamed from: f, reason: collision with root package name */
    private static final String f70771f = C7563s0.a(new byte[]{-44, 87, -109, -41, -35, 102, -4, 61, -85, 91, 74, -119, 46, 64, 31, -4});

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70772e;

    k3(@NonNull Context context) {
        super(Mm0.e.WiFiMacAddress);
        this.f70772e = context;
    }

    @Override // k5.D0
    @NonNull
    @SuppressLint({"HardwareIds", "MissingPermission"})
    protected final String s() throws D1 {
        byte[] hardwareAddress;
        WifiManager wifiManager = (WifiManager) this.f70772e.getApplicationContext().getSystemService("wifi");
        String str = null;
        WifiInfo connectionInfo = wifiManager != null ? wifiManager.getConnectionInfo() : null;
        if (connectionInfo == null || connectionInfo.getMacAddress() == null) {
            throw new C7571u0(C7563s0.a(new byte[]{46, 95, -41, -15, -87, 87, 12, -58, -18, -31, -7, 99, 39, 90, 116, 17, -92, 107, -86, -21, -81, -36, 40, 76, 40, -30, -86, 29, 65, -53, -121, -15, -126, 96, -25, -29, -114, 36, -120, 97, -24, 15, 121, 111, -112, -62, -10, -65, 28, -3, -123, 101, -106, 19, 75, 87, -12, -54, -72, 47, 6, 105, -116, 20, -76, 41, 6, -62, -51, 95, -72, -27, -36, -5, -107, -80, -17, 122, -113, -19}));
        }
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (networkInterface.getName().equalsIgnoreCase(f70771f) && (hardwareAddress = networkInterface.getHardwareAddress()) != null) {
                    StringBuilder sb2 = new StringBuilder();
                    for (byte b11 : hardwareAddress) {
                        sb2.append(String.format(C7563s0.a(new byte[]{71, -18, 19, -71, -76, 58, 122, -14, 51, 19, 66, 108, -120, -1, 30, -86}), Integer.valueOf(b11 & 255)));
                        sb2.append(':');
                    }
                    if (sb2.length() > 0) {
                        sb2.deleteCharAt(sb2.length() - 1);
                    }
                    str = sb2.toString();
                }
            }
        } catch (Exception unused) {
        }
        if (str != null) {
            return str;
        }
        throw new C7571u0(C7563s0.a(new byte[]{67, -33, -109, 12, 121, 44, -33, 47, -37, -39, 24, 124, 116, 26, 41, 99, 83, -121, -39, 28, 2, 20, -18, 121, 24, 99, -91, 115, 91, 103, 111, 77}));
    }

    @Override // k5.InterfaceC7580w1
    public final int z() {
        return 30;
    }
}
