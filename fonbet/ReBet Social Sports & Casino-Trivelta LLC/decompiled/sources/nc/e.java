package nc;

import android.net.ConnectivityManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Locale;
import oc.EnumC5865a;
import oc.EnumC5866b;
import org.bouncycastle.i18n.ErrorBundle;

/* loaded from: classes4.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f57231a;

    /* renamed from: b, reason: collision with root package name */
    public final WifiManager f57232b;

    /* renamed from: c, reason: collision with root package name */
    public final TelephonyManager f57233c;

    /* renamed from: d, reason: collision with root package name */
    public final ReactApplicationContext f57234d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f57235e = false;

    /* renamed from: f, reason: collision with root package name */
    public EnumC5866b f57236f = EnumC5866b.UNKNOWN;

    /* renamed from: g, reason: collision with root package name */
    public EnumC5865a f57237g = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f57238h = false;

    /* renamed from: i, reason: collision with root package name */
    public Boolean f57239i;

    public e(ReactApplicationContext reactApplicationContext) {
        this.f57234d = reactApplicationContext;
        this.f57231a = (ConnectivityManager) reactApplicationContext.getSystemService("connectivity");
        this.f57232b = (WifiManager) reactApplicationContext.getApplicationContext().getSystemService("wifi");
        this.f57233c = (TelephonyManager) reactApplicationContext.getSystemService("phone");
    }

    public static String f(InetAddress inetAddress) {
        short s10;
        Iterator<InterfaceAddress> it = NetworkInterface.getByInetAddress(inetAddress).getInterfaceAddresses().iterator();
        while (true) {
            if (!it.hasNext()) {
                s10 = 0;
                break;
            }
            InterfaceAddress next = it.next();
            if (next.getAddress().getAddress().length == 4) {
                s10 = next.getNetworkPrefixLength();
                break;
            }
        }
        int i10 = (-1) << (32 - s10);
        return String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf((i10 >> 24) & 255), Integer.valueOf((i10 >> 16) & 255), Integer.valueOf((i10 >> 8) & 255), Integer.valueOf(i10 & 255));
    }

    public WritableMap a(String str) {
        WritableMap createMap = Arguments.createMap();
        boolean z10 = false;
        if (i.b(e())) {
            WifiManager wifiManager = this.f57232b;
            createMap.putBoolean("isWifiEnabled", wifiManager != null ? wifiManager.isWifiEnabled() : false);
        }
        createMap.putString("type", str != null ? str : this.f57236f.f59603a);
        boolean z11 = (this.f57236f.equals(EnumC5866b.NONE) || this.f57236f.equals(EnumC5866b.UNKNOWN)) ? false : true;
        createMap.putBoolean("isConnected", z11);
        if (this.f57238h && (str == null || str.equals(this.f57236f.f59603a))) {
            z10 = true;
        }
        createMap.putBoolean("isInternetReachable", z10);
        if (str == null) {
            str = this.f57236f.f59603a;
        }
        WritableMap b10 = b(str);
        if (z11) {
            b10.putBoolean("isConnectionExpensive", c() != null ? c().isActiveNetworkMetered() : true);
        }
        createMap.putMap(ErrorBundle.DETAIL_ENTRY, b10);
        return createMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final WritableMap b(String str) {
        WritableMap createMap;
        WifiManager wifiManager;
        WifiInfo connectionInfo;
        int txLinkSpeedMbps;
        int rxLinkSpeedMbps;
        createMap = Arguments.createMap();
        str.getClass();
        switch (str) {
            case "ethernet":
                try {
                    Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                    while (networkInterfaces.hasMoreElements()) {
                        Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                        while (inetAddresses.hasMoreElements()) {
                            InetAddress nextElement = inetAddresses.nextElement();
                            if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                                createMap.putString("ipAddress", nextElement.getHostAddress());
                                createMap.putString("subnet", f(nextElement));
                                return createMap;
                            }
                        }
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                return createMap;
            case "cellular":
                EnumC5865a enumC5865a = this.f57237g;
                if (enumC5865a != null) {
                    createMap.putString("cellularGeneration", enumC5865a.f59594a);
                }
                String networkOperatorName = this.f57233c.getNetworkOperatorName();
                if (networkOperatorName != null) {
                    createMap.putString("carrier", networkOperatorName);
                    return createMap;
                }
                return createMap;
            case "wifi":
                if (i.b(e()) && (wifiManager = this.f57232b) != null && (connectionInfo = wifiManager.getConnectionInfo()) != null) {
                    try {
                        String ssid = connectionInfo.getSSID();
                        if (ssid != null && !ssid.contains("<unknown ssid>")) {
                            createMap.putString("ssid", ssid.replace("\"", ""));
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        String bssid = connectionInfo.getBSSID();
                        if (bssid != null) {
                            createMap.putString("bssid", bssid);
                        }
                    } catch (Exception unused2) {
                    }
                    try {
                        createMap.putInt("strength", WifiManager.calculateSignalLevel(connectionInfo.getRssi(), 100));
                    } catch (Exception unused3) {
                    }
                    try {
                        createMap.putInt("frequency", connectionInfo.getFrequency());
                    } catch (Exception unused4) {
                    }
                    try {
                        byte[] byteArray = BigInteger.valueOf(connectionInfo.getIpAddress()).toByteArray();
                        i.c(byteArray);
                        createMap.putString("ipAddress", InetAddress.getByAddress(byteArray).getHostAddress());
                    } catch (Exception unused5) {
                    }
                    try {
                        byte[] byteArray2 = BigInteger.valueOf(connectionInfo.getIpAddress()).toByteArray();
                        i.c(byteArray2);
                        createMap.putString("subnet", f(InetAddress.getByAddress(byteArray2)));
                    } catch (Exception unused6) {
                    }
                    try {
                        createMap.putInt("linkSpeed", connectionInfo.getLinkSpeed());
                    } catch (Exception unused7) {
                    }
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            rxLinkSpeedMbps = connectionInfo.getRxLinkSpeedMbps();
                            createMap.putInt("rxLinkSpeed", rxLinkSpeedMbps);
                        }
                    } catch (Exception unused8) {
                    }
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            txLinkSpeedMbps = connectionInfo.getTxLinkSpeedMbps();
                            createMap.putInt("txLinkSpeed", txLinkSpeedMbps);
                        }
                    } catch (Exception unused9) {
                    }
                }
                return createMap;
            default:
                return createMap;
        }
    }

    public ConnectivityManager c() {
        return this.f57231a;
    }

    public void d(String str, Promise promise) {
        promise.resolve(a(str));
    }

    public ReactApplicationContext e() {
        return this.f57234d;
    }

    public abstract void g();

    public void h() {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) e().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("netInfo.networkStatusDidChange", a(null));
    }

    public void i(boolean z10) {
        this.f57239i = Boolean.valueOf(z10);
        k(this.f57236f, this.f57237g, this.f57238h);
    }

    public abstract void j();

    public void k(EnumC5866b enumC5866b, EnumC5865a enumC5865a, boolean z10) {
        Boolean bool = this.f57239i;
        if (bool != null) {
            z10 = bool.booleanValue();
        }
        boolean z11 = enumC5866b != this.f57236f;
        boolean z12 = enumC5865a != this.f57237g;
        boolean z13 = z10 != this.f57238h;
        if (z11 || z12 || z13) {
            this.f57236f = enumC5866b;
            this.f57237g = enumC5865a;
            this.f57238h = z10;
            if (this.f57235e) {
                h();
            }
        }
    }
}
