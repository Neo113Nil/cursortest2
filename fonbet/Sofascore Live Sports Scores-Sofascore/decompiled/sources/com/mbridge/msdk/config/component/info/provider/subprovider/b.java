package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.ironsource.Y1;
import com.mbridge.msdk.foundation.tools.q0;
import defpackage.xtl;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class b {
    private static volatile b f;
    private ConnectivityManager a;
    private TelephonyManager b;
    public int c = 0;
    public String d = "UNKNOWN";
    public int e = 0;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* loaded from: classes2.dex */
    public final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
        public a() {
        }

        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            if (overrideNetworkType == 1 || overrideNetworkType == 2) {
                b.this.c = 4;
                return;
            }
            if (overrideNetworkType == 3) {
                b bVar = b.this;
                bVar.c = 5;
                bVar.d = "5G NSA";
            } else {
                if (overrideNetworkType != 5) {
                    return;
                }
                b bVar2 = b.this;
                bVar2.c = 5;
                bVar2.d = "5G+";
            }
        }
    }

    private b() {
        a();
    }

    private void a() {
        Context d = com.mbridge.msdk.foundation.controller.c.n().d();
        if (d == null) {
            this.c = 0;
            this.d = "UNKNOWN";
            this.e = 0;
            return;
        }
        ConnectivityManager connectivityManager = this.a;
        if (connectivityManager == null || this.b == null) {
            if (connectivityManager == null) {
                this.a = (ConnectivityManager) d.getSystemService("connectivity");
            }
            if (this.b == null) {
                TelephonyManager telephonyManager = (TelephonyManager) d.getSystemService("phone");
                this.b = telephonyManager;
                if (Build.VERSION.SDK_INT < 31 || telephonyManager == null) {
                    return;
                }
                this.b.registerTelephonyCallback(com.mbridge.msdk.foundation.same.threadpool.a.d(), new a());
            }
        }
    }

    public static b e() {
        if (f == null) {
            synchronized (b.class) {
                try {
                    if (f == null) {
                        f = new b();
                    }
                } finally {
                }
            }
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        NetworkCapabilities networkCapabilities = this.a.getNetworkCapabilities(this.a.getActiveNetwork());
        if (networkCapabilities != null) {
            if (networkCapabilities.hasTransport(1)) {
                this.c = 9;
                this.d = "WIFI";
            }
            if (networkCapabilities.hasTransport(0)) {
                this.c = c();
            }
            this.e = networkCapabilities.hasTransport(4) ? 1 : g();
        }
    }

    public void b() {
        a();
        com.mbridge.msdk.foundation.same.threadpool.a.d().execute(new xtl(this, 1));
    }

    public int c() {
        try {
            TelephonyManager telephonyManager = this.b;
            if (telephonyManager == null) {
                return 0;
            }
            int dataNetworkType = telephonyManager.getDataNetworkType();
            this.d = String.valueOf(dataNetworkType);
            return a(dataNetworkType);
        } catch (Throwable th) {
            q0.b("NetworkStatusProvider", th.getMessage());
            return 0;
        }
    }

    public int d() {
        try {
            TelephonyManager telephonyManager = this.b;
            if (telephonyManager == null) {
                return 0;
            }
            int networkType = telephonyManager.getNetworkType();
            this.d = String.valueOf(networkType);
            return a(networkType);
        } catch (Throwable th) {
            q0.b("NetworkStatusProvider", th.getMessage());
            return 0;
        }
    }

    public int g() {
        try {
            String property = System.getProperty("http.proxyHost");
            String property2 = System.getProperty("http.proxyPort");
            if (TextUtils.isEmpty(property2)) {
                property2 = Y1.f;
            }
            return (TextUtils.isEmpty(property) || Integer.parseInt(property2) == -1) ? 0 : 2;
        } catch (Throwable th) {
            q0.b("NetworkStatusProvider", th.getMessage());
            return 0;
        }
    }

    private int a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return 3;
            case 13:
            case 18:
            case 19:
                return 4;
            case 20:
                return 5;
            default:
                return 0;
        }
    }
}
