package um0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qm0.C9085a;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f100840a;

    public e(@NotNull Context context, @NotNull C9085a settings) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f100840a = context;
    }

    @NotNull
    public final String a() {
        Context context = this.f100840a;
        if (!ym0.a.a(context, "android.permission.READ_PHONE_STATE")) {
            return "";
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
        return networkOperatorName == null ? "" : networkOperatorName;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c A[LOOP:0: B:10:0x002d->B:15:0x004c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a A[SYNTHETIC] */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String b() {
        ConnectivityManager connectivityManager;
        String str;
        Context context = this.f100840a;
        if (ym0.a.a(context, "android.permission.ACCESS_NETWORK_STATE") && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            Network[] allNetworks = connectivityManager.getAllNetworks();
            Intrinsics.checkNotNullExpressionValue(allNetworks, "cm.allNetworks");
            String str2 = null;
            if (allNetworks.length != 0) {
                int length = allNetworks.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    }
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(allNetworks[i11]);
                    if (networkCapabilities != null) {
                        if (networkCapabilities.hasTransport(1)) {
                            str = "WIFI";
                        } else if (networkCapabilities.hasTransport(0)) {
                            str = "CELLULAR";
                        }
                        if (str == null) {
                            str2 = str;
                            break;
                        }
                        i11++;
                    }
                    str = null;
                    if (str == null) {
                    }
                }
            }
            if (str2 != null) {
                return str2;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                return type != 0 ? type != 1 ? "" : "WIFI" : "CELLULAR";
            }
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x009c, code lost:
    
        r5 = r6.getHostAddress();
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0038  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String c() {
        boolean z11;
        WifiInfo connectionInfo;
        String b11 = b();
        String str = null;
        if (b11.equals("WIFI")) {
            Context context = this.f100840a;
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (wifiManager != null) {
                try {
                    z11 = ym0.a.a(context, "android.permission.ACCESS_WIFI_STATE");
                } catch (Exception unused) {
                    z11 = false;
                }
                if (z11) {
                    try {
                        connectionInfo = wifiManager.getConnectionInfo();
                    } catch (SecurityException throwable) {
                        Intrinsics.checkNotNullParameter("NetworkProvider", "tag");
                        Intrinsics.checkNotNullParameter(throwable, "throwable");
                    }
                    if (connectionInfo != null) {
                        int ipAddress = connectionInfo.getIpAddress();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(ipAddress & 255);
                        sb2.append('.');
                        sb2.append((ipAddress >> 8) & 255);
                        sb2.append('.');
                        sb2.append((ipAddress >> 16) & 255);
                        sb2.append('.');
                        sb2.append((ipAddress >> 24) & 255);
                        str = sb2.toString();
                    }
                }
            }
            connectionInfo = null;
            if (connectionInfo != null) {
            }
        } else if (b11.equals("CELLULAR")) {
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                if (networkInterfaces != null) {
                    loop0: while (true) {
                        if (!networkInterfaces.hasMoreElements()) {
                            break;
                        }
                        Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                        while (inetAddresses.hasMoreElements()) {
                            InetAddress nextElement = inetAddresses.nextElement();
                            if (!nextElement.isLoopbackAddress()) {
                                break loop0;
                            }
                        }
                    }
                }
            } catch (SocketException throwable2) {
                Intrinsics.checkNotNullParameter("NetworkProvider", "tag");
                Intrinsics.checkNotNullParameter(throwable2, "throwable");
            }
        }
        return str == null ? "" : str;
    }
}
