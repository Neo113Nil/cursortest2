package c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public final Context f26489a;

    public Q(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26489a = context;
    }

    public final Map a() {
        try {
            Object systemService = this.f26489a.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            NetworkCapabilities networkCapabilities = activeNetwork != null ? connectivityManager.getNetworkCapabilities(activeNetwork) : null;
            String str = "Unknown";
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(4)) {
                    str = "VPN";
                } else if (networkCapabilities.hasTransport(1)) {
                    str = "WiFi";
                } else if (networkCapabilities.hasTransport(0)) {
                    str = "Cellular";
                } else if (networkCapabilities.hasTransport(3)) {
                    str = "Ethernet";
                }
            }
            return MapsKt.mapOf(TuplesKt.to("connection_type", str), TuplesKt.to("wifi_ssid", null), TuplesKt.to("ip_address", null));
        } catch (Exception unused) {
            return null;
        }
    }
}
