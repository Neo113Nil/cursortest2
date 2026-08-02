package com.ironsource;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class U3 {
    public static final String a = "NETWORK_TYPE_WIFI";
    public static final String b = "NETWORK_TYPE_VPN";
    public static final String c = "NETWORK_TYPE_ETHERNET";
    public static final String d = "NETWORK_TYPE_UNKNOWN";
    public static final String e = "notReachable";
    public static final String f = "PHONE_TYPE_NONE";
    public static final String g = "NETWORK_TYPE_GPRS";
    public static final String h = "NETWORK_TYPE_EDGE";
    public static final String i = "NETWORK_TYPE_UMTS";
    public static final String j = "NETWORK_TYPE_CDMA";
    public static final String k = "NETWORK_TYPE_EVDO_0";
    public static final String l = "NETWORK_TYPE_EVDO_A";
    public static final String m = "NETWORK_TYPE_1xRTT";
    public static final String n = "NETWORK_TYPE_HSDPA";
    public static final String o = "NETWORK_TYPE_HSUPA";
    public static final String p = "NETWORK_TYPE_HSPA";
    public static final String q = "NETWORK_TYPE_IDEN";
    public static final String r = "NETWORK_TYPE_EVDO_B";
    public static final String s = "NETWORK_TYPE_LTE";
    public static final String t = "NETWORK_TYPE_EHRPD";
    public static final String u = "NETWORK_TYPE_HSPAP";
    public static final String v = "NETWORK_TYPE_GSM";
    public static final String w = "NETWORK_TYPE_TD_SCDMA";
    public static final String x = "NETWORK_TYPE_IWLAN";
    public static final String y = "NETWORK_TYPE_LTE_CA";
    public static final String z = "NETWORK_TYPE_NR";

    private static String c(Context context) {
        String a2 = T3.a(context);
        return TextUtils.isEmpty(a2) ? "none" : a2;
    }

    public static boolean e(Context context) {
        return b(context, a(context)).equals("vpn");
    }

    public static String b(Context context) {
        return a(a(context), context);
    }

    public static String a(Network network, Context context) {
        if (context == null) {
            return "none";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (network != null && connectivityManager != null) {
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities == null) {
                    return c(context);
                }
                if (networkCapabilities.hasTransport(1)) {
                    return "wifi";
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "3g";
                }
                return c(context);
            } catch (Exception e2) {
                C2556n4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        }
        return "none";
    }

    public static String d(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            Network a2 = a(connectivityManager);
            if (a2 == null) {
                return e;
            }
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(a2);
                if (networkCapabilities == null) {
                    return d;
                }
                if (networkCapabilities.hasTransport(1)) {
                    return a;
                }
                if (networkCapabilities.hasTransport(0) && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                    return a(activeNetworkInfo.getSubtype());
                }
            } catch (Throwable th) {
                C2556n4.d().a(th);
                IronLog.INTERNAL.error("Error getting network capabilities: " + th);
            }
        }
        return d;
    }

    private static String b(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (network == null || context == null) {
            return "";
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null) {
                if (networkCapabilities.hasTransport(1)) {
                    return "wifi";
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "cellular";
                }
                if (networkCapabilities.hasTransport(4)) {
                    return "vpn";
                }
                if (networkCapabilities.hasTransport(3)) {
                    return "ethernet";
                }
                if (networkCapabilities.hasTransport(5)) {
                    return T3.h;
                }
                if (networkCapabilities.hasTransport(6)) {
                    return T3.i;
                }
                return networkCapabilities.hasTransport(2) ? T3.d : "";
            }
            return "";
        } catch (Exception e2) {
            C2556n4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return "";
        }
    }

    public static Network a(Context context) {
        if (context == null) {
            return null;
        }
        return a((ConnectivityManager) context.getSystemService("connectivity"));
    }

    public static JSONObject a(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (context == null) {
            return IronSourceNetworkBridge.jsonObjectInit();
        }
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        if (network != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null) {
                    jsonObjectInit.put("networkCapabilities", networkCapabilities.toString());
                    jsonObjectInit.put("downloadSpeed", networkCapabilities.getLinkDownstreamBandwidthKbps());
                    jsonObjectInit.put("uploadSpeed", networkCapabilities.getLinkUpstreamBandwidthKbps());
                    jsonObjectInit.put(X3.j.v, e(context));
                    return jsonObjectInit;
                }
            } catch (Exception e2) {
                C2556n4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        }
        return jsonObjectInit;
    }

    private static String a(int i2) {
        switch (i2) {
            case 0:
                return f;
            case 1:
                return g;
            case 2:
                return h;
            case 3:
                return i;
            case 4:
                return j;
            case 5:
                return k;
            case 6:
                return l;
            case 7:
                return m;
            case 8:
                return n;
            case 9:
                return o;
            case 10:
                return p;
            case 11:
                return q;
            case 12:
                return r;
            case 13:
                return s;
            case 14:
                return t;
            case 15:
                return u;
            case 16:
                return v;
            case 17:
                return w;
            case 18:
                return x;
            case 19:
                return y;
            case 20:
                return z;
            default:
                return d;
        }
    }

    private static Network a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetwork();
        } catch (Throwable th) {
            C2556n4.d().a(th);
            return null;
        }
    }
}
