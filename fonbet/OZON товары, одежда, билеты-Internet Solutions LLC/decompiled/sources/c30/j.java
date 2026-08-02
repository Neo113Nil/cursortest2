package c30;

import Ae.O0;
import Ae.x0;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f56473a;

    /* renamed from: b, reason: collision with root package name */
    private final ConnectivityManager f56474b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final b f56475c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f56476d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final x0<a> f56477e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f56478a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f56479b;

        public a(String str, boolean z11) {
            this.f56478a = str;
            this.f56479b = z11;
        }

        public final String a() {
            return this.f56478a;
        }

        public final boolean b() {
            return this.f56479b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f56478a, aVar.f56478a) && this.f56479b == aVar.f56479b;
        }

        public final int hashCode() {
            String str = this.f56478a;
            return Boolean.hashCode(this.f56479b) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NetworkStatus(ssid=");
            sb2.append(this.f56478a);
            sb2.append(", isVpn=");
            return Pk0.a.a(")", sb2, this.f56479b);
        }
    }

    public static final class b extends ConnectivityManager.NetworkCallback {
        b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            j jVar = j.this;
            x0<a> d11 = jVar.d();
            a value = jVar.d().getValue();
            String c11 = jVar.c();
            boolean f7 = jVar.f();
            value.getClass();
            d11.setValue(new a(c11, f7));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            super.onLost(network);
            j jVar = j.this;
            x0<a> d11 = jVar.d();
            a value = jVar.d().getValue();
            String c11 = jVar.c();
            boolean f7 = jVar.f();
            value.getClass();
            d11.setValue(new a(c11, f7));
        }
    }

    public j(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56473a = context;
        Object systemService = context.getSystemService("connectivity");
        this.f56474b = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        this.f56475c = new b();
        this.f56477e = O0.a(new a(c(), f()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c() {
        NetworkInfo networkInfo;
        WifiInfo connectionInfo;
        ConnectivityManager connectivityManager = this.f56474b;
        if (connectivityManager == null || (networkInfo = connectivityManager.getNetworkInfo(1)) == null || !networkInfo.isConnected()) {
            return null;
        }
        Object systemService = this.f56473a.getApplicationContext().getSystemService("wifi");
        WifiManager wifiManager = systemService instanceof WifiManager ? (WifiManager) systemService : null;
        if (wifiManager == null || (connectionInfo = wifiManager.getConnectionInfo()) == null) {
            return null;
        }
        String ssid = connectionInfo.getSSID();
        Intrinsics.checkNotNullExpressionValue(ssid, "getSSID(...)");
        if (ssid.length() <= 0) {
            connectionInfo = null;
        }
        if (connectionInfo != null) {
            return connectionInfo.getSSID();
        }
        return null;
    }

    @NotNull
    public final String b() {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        Context context = this.f56473a;
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return "unknown";
        }
        if (networkCapabilities.hasTransport(1)) {
            return "wifi";
        }
        if (networkCapabilities.hasTransport(0)) {
            boolean z11 = context.getSystemService("phone") instanceof TelephonyManager;
            return "unknown";
        }
        networkCapabilities.hasTransport(3);
        return "other";
    }

    @NotNull
    public final x0<a> d() {
        return this.f56477e;
    }

    public final boolean e() {
        Network[] allNetworks;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = this.f56474b;
        if (connectivityManager == null || (allNetworks = connectivityManager.getAllNetworks()) == null) {
            return false;
        }
        boolean z11 = false;
        for (Network network : allNetworks) {
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
            if (networkInfo != null && networkInfo.isConnected() && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null && networkCapabilities.hasCapability(12)) {
                z11 = true;
            }
        }
        return z11;
    }

    public final boolean f() {
        Network activeNetwork;
        ConnectivityManager connectivityManager = this.f56474b;
        NetworkCapabilities networkCapabilities = (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null) ? null : connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities != null) {
            return networkCapabilities.hasTransport(4);
        }
        return false;
    }

    public final void g() {
        if (this.f56476d) {
            return;
        }
        this.f56476d = true;
        ConnectivityManager connectivityManager = this.f56474b;
        if (connectivityManager != null) {
            connectivityManager.registerDefaultNetworkCallback(this.f56475c);
        }
    }

    public final void h() {
        if (this.f56476d) {
            ConnectivityManager connectivityManager = this.f56474b;
            if (connectivityManager != null) {
                connectivityManager.unregisterNetworkCallback(this.f56475c);
            }
            this.f56476d = false;
        }
    }
}
