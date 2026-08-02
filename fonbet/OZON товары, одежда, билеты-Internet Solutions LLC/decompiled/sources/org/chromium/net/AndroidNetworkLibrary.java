package org.chromium.net;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.TransportInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.util.Log;
import androidx.recyclerview.widget.LinearLayoutManager;
import internal.org.jni_zero.CalledByNative;
import internal.org.jni_zero.CalledByNativeUnchecked;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketImpl;
import java.net.URLConnection;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Enumeration;
import java.util.List;

/* loaded from: classes6.dex */
final class AndroidNetworkLibrary {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f78597a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f78598b;

    /* loaded from: classes10.dex */
    public static class a {
        public static boolean a() {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }

        public static boolean b(String str) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
    }

    /* loaded from: classes10.dex */
    private static class b extends Socket {

        private static class a extends SocketImpl {
            a(FileDescriptor fileDescriptor) {
                ((SocketImpl) this).fd = fileDescriptor;
            }

            @Override // java.net.SocketImpl
            protected final void accept(SocketImpl socketImpl) {
                throw new RuntimeException("accept not implemented");
            }

            @Override // java.net.SocketImpl
            protected final int available() {
                throw new RuntimeException("accept not implemented");
            }

            @Override // java.net.SocketImpl
            protected final void bind(InetAddress inetAddress, int i11) {
                throw new RuntimeException("accept not implemented");
            }

            @Override // java.net.SocketImpl
            protected final void close() {
            }

            @Override // java.net.SocketImpl
            protected final void connect(InetAddress inetAddress, int i11) {
                throw new RuntimeException("connect not implemented");
            }

            @Override // java.net.SocketImpl
            protected final void create(boolean z11) {
            }

            @Override // java.net.SocketImpl
            protected final InputStream getInputStream() {
                throw new RuntimeException("getInputStream not implemented");
            }

            @Override // java.net.SocketOptions
            public final Object getOption(int i11) {
                throw new RuntimeException("getOption not implemented");
            }

            @Override // java.net.SocketImpl
            protected final OutputStream getOutputStream() {
                throw new RuntimeException("getOutputStream not implemented");
            }

            @Override // java.net.SocketImpl
            protected final void listen(int i11) {
                throw new RuntimeException("listen not implemented");
            }

            @Override // java.net.SocketImpl
            protected final void sendUrgentData(int i11) {
                throw new RuntimeException("sendUrgentData not implemented");
            }

            @Override // java.net.SocketOptions
            public final void setOption(int i11, Object obj) {
                throw new RuntimeException("setOption not implemented");
            }

            @Override // java.net.SocketImpl
            protected final void connect(SocketAddress socketAddress, int i11) {
                throw new RuntimeException("connect not implemented");
            }

            @Override // java.net.SocketImpl
            protected final void connect(String str, int i11) {
                throw new RuntimeException("connect not implemented");
            }
        }

        b(FileDescriptor fileDescriptor) throws IOException {
            super(new a(fileDescriptor));
        }
    }

    AndroidNetworkLibrary() {
    }

    public static DnsStatus a(Network network) {
        ConnectivityManager connectivityManager;
        boolean isPrivateDnsActive;
        String privateDnsServerName;
        int i11;
        if (f78597a == null) {
            try {
                i11 = org.chromium.base.e.b().checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid());
            } catch (RuntimeException unused) {
                i11 = -1;
            }
            f78597a = Boolean.valueOf(i11 == 0);
        }
        if (!f78597a.booleanValue() || (connectivityManager = (ConnectivityManager) org.chromium.base.e.b().getSystemService("connectivity")) == null) {
            return null;
        }
        if (network == null) {
            network = connectivityManager.getActiveNetwork();
        }
        if (network == null) {
            return null;
        }
        try {
            LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
            if (linkProperties == null) {
                return null;
            }
            List<InetAddress> dnsServers = linkProperties.getDnsServers();
            String domains = linkProperties.getDomains();
            if (Build.VERSION.SDK_INT < 28) {
                return new DnsStatus(dnsServers, false, "", domains);
            }
            isPrivateDnsActive = linkProperties.isPrivateDnsActive();
            privateDnsServerName = linkProperties.getPrivateDnsServerName();
            return new DnsStatus(dnsServers, isPrivateDnsActive, privateDnsServerName, domains);
        } catch (RuntimeException unused2) {
            return null;
        }
    }

    @CalledByNativeUnchecked
    public static void addTestRootCertificate(byte[] bArr) throws CertificateException, KeyStoreException, NoSuchAlgorithmException {
        E.b(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r5 = r5.getTransportInfo();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static WifiInfo b() {
        TransportInfo transportInfo;
        if (!c()) {
            Intent d11 = org.chromium.base.e.d(org.chromium.base.e.b(), null, new IntentFilter("android.net.wifi.STATE_CHANGE"));
            if (d11 != null) {
                return (WifiInfo) d11.getParcelableExtra("wifiInfo");
            }
        } else {
            if (Build.VERSION.SDK_INT < 31) {
                return ((WifiManager) org.chromium.base.e.b().getSystemService("wifi")).getConnectionInfo();
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) org.chromium.base.e.b().getSystemService("connectivity");
            for (Network network : connectivityManager.getAllNetworks()) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities != null && networkCapabilities.hasTransport(1) && transportInfo != null && (transportInfo instanceof WifiInfo)) {
                    return (WifiInfo) transportInfo;
                }
            }
        }
        return null;
    }

    private static boolean c() {
        int i11;
        if (f78598b == null) {
            try {
                i11 = org.chromium.base.e.b().checkPermission("android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid());
            } catch (RuntimeException unused) {
                i11 = -1;
            }
            f78598b = Boolean.valueOf(i11 == 0);
        }
        return f78598b.booleanValue();
    }

    @CalledByNativeUnchecked
    public static void clearTestRootCertificates() throws NoSuchAlgorithmException, CertificateException, KeyStoreException {
        E.d();
    }

    @CalledByNative
    public static DnsStatus getCurrentDnsStatus() {
        return a(null);
    }

    @CalledByNative
    public static DnsStatus getDnsStatusForNetwork(long j11) {
        Network fromNetworkHandle;
        try {
            fromNetworkHandle = Network.fromNetworkHandle(j11);
            return a(fromNetworkHandle);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @CalledByNative
    private static boolean getIsCaptivePortal() {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) org.chromium.base.e.b().getSystemService("connectivity");
        return (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(17)) ? false : true;
    }

    @CalledByNative
    private static boolean getIsRoaming() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) org.chromium.base.e.b().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        return activeNetworkInfo.isRoaming();
    }

    @CalledByNative
    public static String getMimeTypeFromExtension(String str) {
        return URLConnection.guessContentTypeFromName("foo." + str);
    }

    @CalledByNative
    private static String getNetworkOperator() {
        TelephonyManager telephonyManager = (TelephonyManager) org.chromium.base.e.b().getSystemService("phone");
        return telephonyManager == null ? "" : telephonyManager.getNetworkOperator();
    }

    @CalledByNative
    public static byte[][] getUserAddedRoots() {
        return E.h();
    }

    @CalledByNative
    public static String getWifiSSID() {
        String ssid;
        WifiInfo b11 = b();
        return (b11 == null || (ssid = b11.getSSID()) == null || ssid.equals("<unknown ssid>")) ? "" : ssid;
    }

    @CalledByNative
    public static int getWifiSignalLevel(int i11) {
        int intExtra;
        int calculateSignalLevel;
        if (org.chromium.base.e.b() == null || org.chromium.base.e.b().getContentResolver() == null) {
            return -1;
        }
        if (c()) {
            WifiInfo b11 = b();
            if (b11 == null) {
                return -1;
            }
            intExtra = b11.getRssi();
        } else {
            try {
                Intent d11 = org.chromium.base.e.d(org.chromium.base.e.b(), null, new IntentFilter("android.net.wifi.RSSI_CHANGED"));
                if (d11 == null) {
                    return -1;
                }
                intExtra = d11.getIntExtra("newRssi", LinearLayoutManager.INVALID_OFFSET);
            } catch (IllegalArgumentException unused) {
            }
        }
        if (intExtra != Integer.MIN_VALUE && (calculateSignalLevel = WifiManager.calculateSignalLevel(intExtra, i11)) >= 0 && calculateSignalLevel < i11) {
            return calculateSignalLevel;
        }
        return -1;
    }

    @CalledByNative
    public static boolean haveOnlyLoopbackAddresses() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return false;
            }
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                try {
                    if (nextElement.isUp() && !nextElement.isLoopback()) {
                        return false;
                    }
                } catch (SocketException unused) {
                }
            }
            return true;
        } catch (Exception e11) {
            Log.w("AndroidNetworkLibrary", "could not get network interfaces: ".concat(String.valueOf(e11)));
            return false;
        }
    }

    @CalledByNative
    private static boolean isCleartextPermitted(String str) {
        try {
            return a.b(str);
        } catch (IllegalArgumentException unused) {
            return a.a();
        }
    }

    @CalledByNative
    public static void registerQuicConnectionClosePayload(int i11, byte[] bArr) {
    }

    @CalledByNative
    private static boolean reportBadDefaultNetwork() {
        ConnectivityManager connectivityManager = (ConnectivityManager) org.chromium.base.e.b().getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        connectivityManager.reportNetworkConnectivity(null, false);
        return true;
    }

    @CalledByNative
    private static void tagSocket(int i11, int i12, int i13) throws IOException {
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        if (i13 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(i13);
        }
        if (i12 != -1) {
            z.b(i12);
        }
        ParcelFileDescriptor adoptFd = ParcelFileDescriptor.adoptFd(i11);
        b bVar = new b(adoptFd.getFileDescriptor());
        TrafficStats.tagSocket(bVar);
        bVar.close();
        adoptFd.detachFd();
        if (i13 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(threadStatsTag);
        }
        if (i12 != -1) {
            z.a();
        }
    }

    @CalledByNative
    public static void unregisterQuicConnectionClosePayload(int i11) {
    }

    @CalledByNative
    public static AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, String str, String str2, byte[] bArr2, byte[] bArr3) {
        try {
            return E.k(bArr, str, str2, bArr2, bArr3);
        } catch (IllegalArgumentException unused) {
            return new AndroidCertVerifyResult(-1);
        } catch (KeyStoreException unused2) {
            return new AndroidCertVerifyResult(-1);
        } catch (NoSuchAlgorithmException unused3) {
            return new AndroidCertVerifyResult(-1);
        }
    }
}
