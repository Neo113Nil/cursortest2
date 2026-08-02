package io.seon.androidsdk.service;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class L1 extends AbstractC4950j {

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f53016h = {"wifi_mac_address", "wifi_ssid", "vpn_state", "proxy_state", "proxy_address", "wifi_private_ip"};

    /* renamed from: o, reason: collision with root package name */
    public static final Lh.a f53017o = Lh.a.d(L1.class);

    /* renamed from: e, reason: collision with root package name */
    public Context f53018e;

    /* renamed from: g, reason: collision with root package name */
    public ConnectivityManager f53019g;

    /* renamed from: n, reason: collision with root package name */
    public WifiManager f53020n;

    @Override // io.seon.androidsdk.service.InterfaceC4966l
    public final void a(C4878a c4878a) {
        this.f53018e = c4878a.a();
        this.f53368b = c4878a;
        Runnable runnable = new Runnable() { // from class: io.seon.androidsdk.service.B1
            @Override // java.lang.Runnable
            public final void run() {
                L1.this.p();
            }
        };
        AtomicInteger atomicInteger = V.f53166a;
        try {
            runnable.run();
        } catch (Throwable unused) {
        }
        try {
            new Runnable() { // from class: io.seon.androidsdk.service.C1
                @Override // java.lang.Runnable
                public final void run() {
                    L1.this.q();
                }
            }.run();
        } catch (Throwable unused2) {
        }
    }

    @Override // io.seon.androidsdk.service.InterfaceC4966l
    public final Map b() {
        HashMap hashMap = new HashMap();
        hashMap.put("wifi_gw", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.J1
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return L1.this.l();
            }
        }));
        hashMap.put("nw_if_list", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.K1
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return L1.this.h();
            }
        }));
        return hashMap;
    }

    public final List h() {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                NetworkInterface networkInterface = (NetworkInterface) it.next();
                Locale locale = Locale.ENGLISH;
                String displayName = networkInterface.getDisplayName();
                boolean isUp = networkInterface.isUp();
                AtomicInteger atomicInteger = V.f53166a;
                arrayList.add(String.format(locale, "%s:%s", displayName, Integer.valueOf(isUp ? 1 : 0)));
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public final String i() {
        ProxyInfo defaultProxy;
        try {
            ConnectivityManager connectivityManager = this.f53019g;
            if (connectivityManager == null || (defaultProxy = connectivityManager.getDefaultProxy()) == null) {
                return null;
            }
            return defaultProxy.getHost() + ":" + defaultProxy.getPort();
        } catch (Exception unused) {
            return null;
        }
    }

    public final NetworkProbe$NetworkEnum j() {
        try {
            ConnectivityManager connectivityManager = this.f53019g;
            if (connectivityManager != null) {
                return connectivityManager.getDefaultProxy() != null ? NetworkProbe$NetworkEnum.CONNECTED : NetworkProbe$NetworkEnum.NOT_CONNECTED;
            }
        } catch (Exception unused) {
        }
        return NetworkProbe$NetworkEnum.UNKNOWN;
    }

    public final NetworkProbe$NetworkEnum k() {
        try {
            ConnectivityManager connectivityManager = this.f53019g;
            if (connectivityManager != null) {
                return connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()).hasTransport(4) ? NetworkProbe$NetworkEnum.CONNECTED : NetworkProbe$NetworkEnum.NOT_CONNECTED;
            }
        } catch (Exception unused) {
        }
        return NetworkProbe$NetworkEnum.UNKNOWN;
    }

    public final String l() {
        try {
            return V.c(this.f53020n.getDhcpInfo().gateway);
        } catch (Exception unused) {
            return null;
        }
    }

    public final String m() {
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    if (hardwareAddress == null) {
                        return null;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    for (byte b10 : hardwareAddress) {
                        sb2.append(String.format("%02X:", Byte.valueOf(b10)));
                    }
                    if (sb2.length() > 0) {
                        sb2.deleteCharAt(sb2.length() - 1);
                    }
                    return sb2.toString();
                }
            }
        } catch (Exception e10) {
            f53017o.c(e10, 6);
        }
        return null;
    }

    public final String n() {
        try {
            return V.c(this.f53020n.getConnectionInfo().getIpAddress());
        } catch (Exception unused) {
            return null;
        }
    }

    public final String o() {
        String ssid;
        WifiManager wifiManager = (WifiManager) this.f53018e.getApplicationContext().getSystemService("wifi");
        if (V.k(this.f53018e, "android.permission.ACCESS_WIFI_STATE")) {
            WifiInfo connectionInfo = wifiManager != null ? wifiManager.getConnectionInfo() : null;
            if (connectionInfo != null && (ssid = connectionInfo.getSSID()) != null && !ssid.toLowerCase().contains("unknown")) {
                String replace = ssid.replace("\"", "");
                if (replace.equals("0x")) {
                    return null;
                }
                return replace;
            }
        }
        return null;
    }

    public final /* synthetic */ void p() {
        this.f53019g = (ConnectivityManager) this.f53018e.getSystemService("connectivity");
    }

    public final /* synthetic */ void q() {
        this.f53020n = (WifiManager) this.f53018e.getApplicationContext().getSystemService("wifi");
    }

    @Override // io.seon.androidsdk.service.InterfaceC4966l
    public final Map a() {
        HashMap hashMap = new HashMap();
        hashMap.put("wifi_mac_address", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.D1
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return L1.this.m();
            }
        }));
        hashMap.put("wifi_ssid", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.E1
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return L1.this.o();
            }
        }));
        hashMap.put("vpn_state", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.F1
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return L1.this.k();
            }
        }));
        hashMap.put("proxy_state", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.G1
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return L1.this.j();
            }
        }));
        hashMap.put("proxy_address", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.H1
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return L1.this.i();
            }
        }));
        hashMap.put("wifi_private_ip", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.I1
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return L1.this.n();
            }
        }));
        return hashMap;
    }
}
