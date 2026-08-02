package com.vungle.ads.internal.platform;

import android.content.Context;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.ProxyInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import com.appsflyer.sdk_base.referrer.Payload;
import com.ironsource.Q3;
import defpackage.e5h;
import defpackage.p2g;
import defpackage.ph0;
import defpackage.u2g;
import defpackage.w2g;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.Locale;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class e {
    public static boolean a() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = Build.FINGERPRINT;
        String str7 = "";
        if (str6 != null) {
            str = str6.toLowerCase(Locale.ROOT);
            str.getClass();
        } else {
            str = "";
        }
        String str8 = Build.MODEL;
        if (str8 != null) {
            str2 = str8.toLowerCase(Locale.ROOT);
            str2.getClass();
        } else {
            str2 = "";
        }
        String str9 = Build.PRODUCT;
        if (str9 != null) {
            str3 = str9.toLowerCase(Locale.ROOT);
            str3.getClass();
        } else {
            str3 = "";
        }
        String str10 = Build.BRAND;
        if (str10 != null) {
            str4 = str10.toLowerCase(Locale.ROOT);
            str4.getClass();
        } else {
            str4 = "";
        }
        String str11 = Build.MANUFACTURER;
        if (str11 != null) {
            str5 = str11.toLowerCase(Locale.ROOT);
            str5.getClass();
        } else {
            str5 = "";
        }
        String str12 = Build.BOARD;
        if (str12 != null) {
            str7 = str12.toLowerCase(Locale.ROOT);
            str7.getClass();
        }
        String[] strArr = Build.SUPPORTED_ABIS;
        strArr.getClass();
        String lowerCase = ph0.K(strArr, null, null, null, null, 63).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return StringsKt.J(str, "generic", false) || StringsKt.J(str, "emulator", false) || StringsKt.J(str2, "google_sdk", false) || StringsKt.J(str2, "emulator", false) || StringsKt.J(str3, "sdk", false) || StringsKt.J(str3, "vbox", false) || StringsKt.J(str4, "generic", false) || StringsKt.J(str5, "genymotion", false) || StringsKt.J(str7, "nox", false) || StringsKt.J(lowerCase, "x86", false);
    }

    public static String b(Context context) {
        Object u2gVar;
        context.getClass();
        if (Build.VERSION.SDK_INT < 28) {
            return "n/a";
        }
        try {
            p2g p2gVar = w2g.b;
            u2gVar = Settings.Global.getString(context.getContentResolver(), "private_dns_mode");
            if (u2gVar == null) {
                u2gVar = "opportunistic";
            }
            if (u2gVar.equals("hostname")) {
                String string = Settings.Global.getString(context.getContentResolver(), "private_dns_specifier");
                if (string == null) {
                    string = "";
                }
                u2gVar = "hostname(" + string + ')';
            }
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (u2gVar instanceof u2g) {
            u2gVar = "unknown";
        }
        return (String) u2gVar;
    }

    public static int c(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        return ((SensorManager) systemService).getSensorList(-1).size();
    }

    public static boolean d(Context context) {
        context.getClass();
        return Settings.canDrawOverlays(context);
    }

    public static boolean e(Context context) {
        Object u2gVar;
        boolean a;
        context.getClass();
        try {
            p2g p2gVar = w2g.b;
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                a = false;
            } else {
                LinkProperties linkProperties = connectivityManager.getLinkProperties(activeNetwork);
                a = a(linkProperties != null ? linkProperties.getHttpProxy() : null);
            }
            u2gVar = Boolean.valueOf(a);
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        Object obj = Boolean.FALSE;
        if (u2gVar instanceof u2g) {
            u2gVar = obj;
        }
        return ((Boolean) u2gVar).booleanValue();
    }

    public static boolean f(Context context) {
        Object u2gVar;
        context.getClass();
        try {
            p2g p2gVar = w2g.b;
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network[] allNetworks = connectivityManager.getAllNetworks();
            allNetworks.getClass();
            int length = allNetworks.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i < length) {
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(allNetworks[i]);
                    if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            u2gVar = Boolean.valueOf(z);
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        Object obj = Boolean.FALSE;
        p2g p2gVar3 = w2g.b;
        if (u2gVar instanceof u2g) {
            u2gVar = obj;
        }
        return ((Boolean) u2gVar).booleanValue();
    }

    public static boolean a(ProxyInfo proxyInfo) {
        if (proxyInfo == null) {
            return false;
        }
        String host = proxyInfo.getHost();
        return (host != null && host.length() > 0 && proxyInfo.getPort() > 0) || (proxyInfo.getPacFileUrl() != null && !Intrinsics.c(proxyInfo.getPacFileUrl(), Uri.EMPTY));
    }

    public static String a(Context context) {
        Object u2gVar;
        context.getClass();
        try {
            p2g p2gVar = w2g.b;
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                u2gVar = "none";
            } else {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities == null) {
                    u2gVar = "unknown";
                } else {
                    StringBuilder sb = new StringBuilder();
                    if (networkCapabilities.hasTransport(1)) {
                        sb.append(Q3.b);
                    } else if (networkCapabilities.hasTransport(0)) {
                        sb.append(Q3.g);
                    } else if (networkCapabilities.hasTransport(3)) {
                        sb.append(Q3.e);
                    } else {
                        sb.append("other");
                    }
                    if (networkCapabilities.hasTransport(4)) {
                        sb.append("+vpn");
                    }
                    if (connectivityManager.isActiveNetworkMetered()) {
                        sb.append("+metered");
                    }
                    u2gVar = sb.toString();
                }
            }
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        return (String) (u2gVar instanceof u2g ? "unknown" : u2gVar);
    }

    public static String a(Throwable th) {
        boolean z;
        if (th == null) {
            return "none";
        }
        Iterator it = e5h.e(th, d.a).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (((Throwable) it.next()) instanceof CertificateException) {
                z = true;
                break;
            }
        }
        boolean z2 = th instanceof SSLHandshakeException;
        if (z2 && z) {
            return "SSL_CERT_ERROR";
        }
        if (z2) {
            return "SSL_HANDSHAKE";
        }
        if (th instanceof SSLPeerUnverifiedException) {
            return "SSL_PEER_UNVERIFIED";
        }
        if (th instanceof SSLException) {
            return "SSL_ERROR";
        }
        if (th instanceof UnknownHostException) {
            return "DNS_FAILURE";
        }
        if (th instanceof ConnectException) {
            return "CONNECT_FAILURE";
        }
        if (th instanceof SocketTimeoutException) {
            return Payload.RESPONSE_TIMEOUT;
        }
        if (th instanceof SocketException) {
            SocketException socketException = (SocketException) th;
            String message = socketException.getMessage();
            if (message != null && StringsKt.J(message, "reset", true)) {
                return "CONNECTION_RESET";
            }
            String message2 = socketException.getMessage();
            if (message2 != null && StringsKt.J(message2, "abort", true)) {
                return "CONNECTION_ABORT";
            }
            String message3 = socketException.getMessage();
            return (message3 == null || !StringsKt.J(message3, "closed", true)) ? "SOCKET_ERROR" : "CONNECTION_CLOSED";
        }
        return th.getClass().getSimpleName();
    }
}
