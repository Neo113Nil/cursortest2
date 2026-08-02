package c;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import com.surt.guardian.utils.Logger;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import l0.AbstractC5338c;

/* renamed from: c.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2445h0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Cc.f f26574b = new Cc.f(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f26575a;

    public C2445h0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26575a = context;
    }

    public final Map a() {
        String str;
        if (!b()) {
            Logger.f41582a.f("WifiModule", "WiFi info requires location permission on Android 10+");
            return null;
        }
        try {
            Object systemService = this.f26575a.getApplicationContext().getSystemService("wifi");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
            WifiManager wifiManager = (WifiManager) systemService;
            if (!wifiManager.isWifiEnabled()) {
                return MapsKt.mapOf(TuplesKt.to("wifi_enabled", Boolean.FALSE));
            }
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            Pair pair = TuplesKt.to("wifi_enabled", Boolean.TRUE);
            String ssid = connectionInfo.getSSID();
            if (ssid == null || (str = StringsKt.removeSurrounding(ssid, (CharSequence) "\"")) == null || Intrinsics.areEqual(str, "<unknown ssid>")) {
                str = null;
            }
            return MapsKt.mapOf(pair, TuplesKt.to("ssid", str), TuplesKt.to("bssid", connectionInfo.getBSSID()), TuplesKt.to("link_speed", Integer.valueOf(connectionInfo.getLinkSpeed())), TuplesKt.to("rssi", Integer.valueOf(connectionInfo.getRssi())), TuplesKt.to("frequency", Integer.valueOf(connectionInfo.getFrequency())), TuplesKt.to("network_id", Integer.valueOf(connectionInfo.getNetworkId())));
        } catch (Exception e10) {
            Logger.f41582a.b("WifiModule", "Error collecting WiFi info", e10);
            return null;
        }
    }

    public final boolean b() {
        return Build.VERSION.SDK_INT < 29 || AbstractC5338c.checkSelfPermission(this.f26575a, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }
}
