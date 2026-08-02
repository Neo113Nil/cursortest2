package io.agora.utils2.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.RouteInfo;
import android.net.TransportInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public class ConnectivityUtility {
    private static final boolean DEBUG = false;
    public static final String PREFERENCE_ACCESS_NETWORK_PERMISSION_KEY = "rtc_access_network_state_permission";
    public static final String PREFERENCE_CHANGE_NETWORK_PERMISSION_KEY = "rtc_change_network_state_permission";
    private static final String TAG = "ConnectivityUtility";
    private static Method getTransportTypesMethod;
    private BroadcastReceiver connectionRecevier;
    private ConnectivityManager connectivityManager;
    private CustomTelephonyCallback customTelephonyCallback;
    private AgoraNetworkInfo defaultNetworkInfo;
    private SharedPreferences rtcSharedPreferences;
    private TelephonyManager telephonyManager;
    private WifiManager wifiManager;
    private CustomNetworkCallback callback = null;
    private VpnNetworkCallback vpnCallback = null;
    private ConnectivityManager.NetworkCallback cellularNetworkCallback = null;
    private Boolean vpnEnabled = null;
    private Boolean hasChangeNetworkStatePermission = null;
    private Boolean hasAccessNetworkStatePermission = null;
    private HashMap<String, AgoraNetworkInfo> activeNetworkInfoHashMap = new HashMap<>();
    private HashMap<Integer, AgoraNetworkInfo> networkInfoByCategoryHashMap = new HashMap<>();
    private CopyOnWriteArrayList<NetworkListener> networkListeners = new CopyOnWriteArrayList<>();

    /* renamed from: io.agora.utils2.internal.ConnectivityUtility$2, reason: invalid class name */
    public class AnonymousClass2 extends BroadcastReceiver {
        public AnonymousClass2() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ConnectivityUtility.logD("onReceive: CONNECTIVITY_ACTION + " + intent.getBooleanExtra("FAILOVER_CONNECTION", false) + " EXTRA_NO_CONNECTIVITY " + intent.getBooleanExtra("EXTRA_NO_CONNECTIVITY", false));
            Bundle extras = intent.getExtras();
            if (extras != null) {
                NetworkInfo networkInfo = (NetworkInfo) extras.getParcelable("networkInfo");
                ConnectivityUtility.logD("onReceive:  networkInfo " + networkInfo.toString());
                AgoraNetworkInfo buildFromNetworkInfo = AgoraNetworkInfo.buildFromNetworkInfo(networkInfo);
                synchronized (ConnectivityUtility.this.activeNetworkInfoHashMap) {
                    ConnectivityUtility.this.activeNetworkInfoHashMap.put(buildFromNetworkInfo.networkInfo.getTypeName(), buildFromNetworkInfo);
                }
                Logging.i(ConnectivityUtility.TAG, "Network onReceive " + buildFromNetworkInfo.toString());
            }
        }
    }

    public static class AgoraNetworkInfo {
        public String gatewayIp;
        public String interfaceName;
        public String localAddressIpV4;
        public String localAddressIpV6;
        public Network network;
        public NetworkInfo networkInfo;
        public int transportType;
        public int rssi = 0;
        public int signalLevel = 0;
        public int linkSpeed = 0;
        public int frequency = 0;
        public int networkSubtype = 0;
        public int networkType = 0;

        public AgoraNetworkInfo() {
        }

        public static AgoraNetworkInfo buildFromNetwork(@NonNull ConnectivityManager connectivityManager, @NonNull TelephonyManager telephonyManager, @NonNull Network network) {
            AgoraNetworkInfo agoraNetworkInfo = new AgoraNetworkInfo();
            agoraNetworkInfo.network = network;
            int transportType = ConnectivityUtility.getTransportType(connectivityManager.getNetworkCapabilities(network));
            agoraNetworkInfo.transportType = transportType;
            agoraNetworkInfo.networkType = determineNetworkType(telephonyManager, transportType);
            LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
            if (linkProperties != null) {
                agoraNetworkInfo.updateLinkProperties(linkProperties);
            }
            return agoraNetworkInfo;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[Catch: SocketException -> 0x0089, TryCatch #0 {SocketException -> 0x0089, blocks: (B:10:0x0032, B:11:0x003e, B:13:0x0044, B:14:0x0056, B:16:0x005c, B:18:0x0066, B:33:0x006a, B:21:0x0071, B:24:0x0075, B:27:0x0079, B:37:0x0080, B:40:0x0084), top: B:9:0x0032 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static AgoraNetworkInfo buildFromNetworkInfo(@NonNull NetworkInfo networkInfo) {
            int networkTypeFromTelephonyNetworkType;
            Iterator it;
            AgoraNetworkInfo agoraNetworkInfo = new AgoraNetworkInfo();
            agoraNetworkInfo.networkInfo = networkInfo;
            agoraNetworkInfo.networkSubtype = networkInfo.getSubtype();
            int type = networkInfo.getType();
            try {
                if (type == 0) {
                    agoraNetworkInfo.transportType = 0;
                    networkTypeFromTelephonyNetworkType = Connectivity.getNetworkTypeFromTelephonyNetworkType(agoraNetworkInfo.networkSubtype);
                } else if (type == 1) {
                    agoraNetworkInfo.transportType = 1;
                    networkTypeFromTelephonyNetworkType = 2;
                } else {
                    if (type == 9) {
                        agoraNetworkInfo.transportType = 3;
                        agoraNetworkInfo.networkType = 1;
                        it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                        while (it.hasNext()) {
                            for (InetAddress inetAddress : Collections.list(((NetworkInterface) it.next()).getInetAddresses())) {
                                if (agoraNetworkInfo.localAddressIpV4 == null && (inetAddress instanceof Inet4Address)) {
                                    agoraNetworkInfo.localAddressIpV4 = inetAddress.getHostAddress();
                                } else if (agoraNetworkInfo.localAddressIpV6 == null && (inetAddress instanceof Inet6Address)) {
                                    agoraNetworkInfo.localAddressIpV6 = inetAddress.getHostAddress();
                                }
                            }
                            if (agoraNetworkInfo.localAddressIpV4 != null && agoraNetworkInfo.localAddressIpV6 != null) {
                                break;
                            }
                        }
                        return agoraNetworkInfo;
                    }
                    networkTypeFromTelephonyNetworkType = -1;
                }
                it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                while (it.hasNext()) {
                }
                return agoraNetworkInfo;
            } catch (SocketException unused) {
                Logging.e(ConnectivityUtility.TAG, "get inetaddress failed");
                return agoraNetworkInfo;
            }
            agoraNetworkInfo.networkType = networkTypeFromTelephonyNetworkType;
        }

        public static int determineNetworkType(TelephonyManager telephonyManager, int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    return i10 != 3 ? -1 : 1;
                }
                return 2;
            }
            try {
                int networkType = telephonyManager.getNetworkType();
                if (networkType == 0) {
                    Logging.e(ConnectivityUtility.TAG, "seems app has no permission to get network type, use LTE as default");
                    networkType = 13;
                }
                return Connectivity.getNetworkTypeFromTelephonyNetworkType(networkType);
            } catch (Exception e10) {
                Logging.e(ConnectivityUtility.TAG, "Failed to get cellular network type return 4G by default", e10);
                return 5;
            }
        }

        public String toString() {
            return "AgoraNetworkInfo{network=" + this.network + ", networkInfo=" + this.networkInfo + ", transportType=" + this.transportType + ", localAddressIpV4='" + this.localAddressIpV4 + "', localAddressIpV6='" + this.localAddressIpV6 + "', rssi=" + this.rssi + ", signalLevel=" + this.signalLevel + ", linkSpeed=" + this.linkSpeed + ", frequency=" + this.frequency + ", networkSubtype=" + this.networkSubtype + ", networkType=" + this.networkType + ", interfaceName='" + this.interfaceName + "', gatewayIp='" + this.gatewayIp + "'}";
        }

        public void updateLinkProperties(@NonNull LinkProperties linkProperties) {
            if (linkProperties == null) {
                return;
            }
            List<LinkAddress> linkAddresses = linkProperties.getLinkAddresses();
            if (linkAddresses != null) {
                Iterator<LinkAddress> it = linkAddresses.iterator();
                while (it.hasNext()) {
                    InetAddress address = it.next().getAddress();
                    if (address != null) {
                        if (this.localAddressIpV4 == null && (address instanceof Inet4Address)) {
                            this.localAddressIpV4 = address.getHostAddress();
                        } else if (this.localAddressIpV6 == null && (address instanceof Inet6Address)) {
                            this.localAddressIpV6 = address.getHostAddress();
                        }
                    }
                }
            }
            List<RouteInfo> routes = linkProperties.getRoutes();
            if (routes != null && !routes.isEmpty() && routes.get(0).getGateway() != null) {
                this.gatewayIp = routes.get(0).getGateway().getHostAddress();
            }
            this.interfaceName = linkProperties.getInterfaceName();
        }

        public void updateNetworkCapabilities(@NonNull NetworkCapabilities networkCapabilities, WifiInfo wifiInfo) {
            TransportInfo transportInfo;
            if (this.transportType == 1) {
                if (Build.VERSION.SDK_INT < 29) {
                    if (wifiInfo != null) {
                        updateWifiInfo(wifiInfo);
                    }
                } else {
                    transportInfo = networkCapabilities.getTransportInfo();
                    if (transportInfo instanceof WifiInfo) {
                        updateWifiInfo((WifiInfo) transportInfo);
                    }
                }
            }
        }

        public void updateWifiInfo(@NonNull WifiInfo wifiInfo) {
            int i10;
            ConnectivityUtility.logD("updateWifiInfo");
            if (wifiInfo != null) {
                this.rssi = wifiInfo.getRssi();
                this.linkSpeed = wifiInfo.getLinkSpeed();
                int frequency = wifiInfo.getFrequency();
                this.frequency = frequency;
                if (frequency < 5000) {
                    i10 = frequency >= 2400 ? 100 : 101;
                    this.signalLevel = WifiManager.calculateSignalLevel(this.rssi, 5);
                    ConnectivityUtility.logD(String.format("updateWifiInfo: rssi=%d linkSpeed=%d frequency=%d networkSubtype=%d signalLevel=%d", Integer.valueOf(this.rssi), Integer.valueOf(this.linkSpeed), Integer.valueOf(this.frequency), Integer.valueOf(this.networkSubtype), Integer.valueOf(this.signalLevel)));
                }
                this.networkSubtype = i10;
                this.signalLevel = WifiManager.calculateSignalLevel(this.rssi, 5);
                ConnectivityUtility.logD(String.format("updateWifiInfo: rssi=%d linkSpeed=%d frequency=%d networkSubtype=%d signalLevel=%d", Integer.valueOf(this.rssi), Integer.valueOf(this.linkSpeed), Integer.valueOf(this.frequency), Integer.valueOf(this.networkSubtype), Integer.valueOf(this.signalLevel)));
            }
        }

        public AgoraNetworkInfo(Network network, int i10, String str, String str2) {
            this.network = network;
            this.transportType = i10;
            this.localAddressIpV4 = str;
            this.localAddressIpV6 = str2;
        }
    }

    public interface CellularNetworkChangeListener {
        void onCellularNetworkChanged(int i10);
    }

    public class CustomNetworkCallback extends ConnectivityManager.NetworkCallback {
        public CustomNetworkCallback() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@NonNull Network network) {
            super.onAvailable(network);
            ConnectivityUtility.logD("onAvailable: " + ConnectivityUtility.this.getNetworkDescription(network));
            AgoraNetworkInfo buildFromNetwork = AgoraNetworkInfo.buildFromNetwork(ConnectivityUtility.this.connectivityManager, ConnectivityUtility.this.telephonyManager, network);
            synchronized (ConnectivityUtility.this.activeNetworkInfoHashMap) {
                try {
                    if (!ConnectivityUtility.this.activeNetworkInfoHashMap.containsKey(network.toString())) {
                        ConnectivityUtility.this.activeNetworkInfoHashMap.put(network.toString(), buildFromNetwork);
                    }
                    if (ConnectivityUtility.this.defaultNetworkInfo == null || buildFromNetwork.transportType > ConnectivityUtility.this.defaultNetworkInfo.transportType) {
                        ConnectivityUtility.this.defaultNetworkInfo = buildFromNetwork;
                    }
                } finally {
                }
            }
            Logging.i(ConnectivityUtility.TAG, "Network onAvailable: " + buildFromNetwork.toString());
            synchronized (ConnectivityUtility.this.networkListeners) {
                try {
                    Iterator it = ConnectivityUtility.this.networkListeners.iterator();
                    while (it.hasNext()) {
                        NetworkListener networkListener = (NetworkListener) it.next();
                        Logging.i(ConnectivityUtility.TAG, "Network onDefaultNetworkChanged: " + buildFromNetwork.toString());
                        networkListener.onDefaultNetworkChanged();
                    }
                } finally {
                }
            }
            synchronized (ConnectivityUtility.this.networkInfoByCategoryHashMap) {
                ConnectivityUtility.this.networkInfoByCategoryHashMap.put(Integer.valueOf(buildFromNetwork.transportType), buildFromNetwork);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(@NonNull Network network, @NonNull NetworkCapabilities networkCapabilities) {
            super.onCapabilitiesChanged(network, networkCapabilities);
            ConnectivityUtility.logD("onCapabilitiesChanged: " + networkCapabilities.toString());
            synchronized (ConnectivityUtility.this.activeNetworkInfoHashMap) {
                try {
                    if (ConnectivityUtility.this.activeNetworkInfoHashMap.containsKey(network.toString())) {
                        ((AgoraNetworkInfo) ConnectivityUtility.this.activeNetworkInfoHashMap.get(network.toString())).updateNetworkCapabilities(networkCapabilities, null);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(@NonNull Network network, @NonNull LinkProperties linkProperties) {
            super.onLinkPropertiesChanged(network, linkProperties);
            ConnectivityUtility.logD("onLinkPropertiesChanged: " + network.toString() + " properties " + linkProperties.toString());
            synchronized (ConnectivityUtility.this.activeNetworkInfoHashMap) {
                try {
                    if (ConnectivityUtility.this.activeNetworkInfoHashMap.containsKey(network.toString())) {
                        ((AgoraNetworkInfo) ConnectivityUtility.this.activeNetworkInfoHashMap.get(network.toString())).updateLinkProperties(linkProperties);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NonNull Network network) {
            AgoraNetworkInfo agoraNetworkInfo;
            boolean z10;
            super.onLost(network);
            Logging.i(ConnectivityUtility.TAG, "Network onLost: " + ConnectivityUtility.this.getNetworkDescription(network));
            synchronized (ConnectivityUtility.this.activeNetworkInfoHashMap) {
                try {
                    if (ConnectivityUtility.this.activeNetworkInfoHashMap.containsKey(network.toString())) {
                        agoraNetworkInfo = (AgoraNetworkInfo) ConnectivityUtility.this.activeNetworkInfoHashMap.get(network.toString());
                        ConnectivityUtility.this.activeNetworkInfoHashMap.remove(network.toString());
                        Logging.i(ConnectivityUtility.TAG, "Network onLost: " + agoraNetworkInfo.toString());
                    } else {
                        agoraNetworkInfo = null;
                    }
                    AgoraNetworkInfo agoraNetworkInfo2 = ConnectivityUtility.this.activeNetworkInfoHashMap.size() > 0 ? (AgoraNetworkInfo) ConnectivityUtility.this.activeNetworkInfoHashMap.values().iterator().next() : null;
                    if ((ConnectivityUtility.this.defaultNetworkInfo == null || (agoraNetworkInfo2 != null && ConnectivityUtility.this.defaultNetworkInfo.transportType == agoraNetworkInfo2.transportType)) && (ConnectivityUtility.this.defaultNetworkInfo != null || agoraNetworkInfo2 == null)) {
                        z10 = false;
                    } else {
                        ConnectivityUtility.this.defaultNetworkInfo = agoraNetworkInfo2;
                        String str = ConnectivityUtility.TAG;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Network onDefaultNetworkChanged: ");
                        sb2.append(ConnectivityUtility.this.defaultNetworkInfo != null ? ConnectivityUtility.this.defaultNetworkInfo.toString() : "null");
                        Logging.i(str, sb2.toString());
                        z10 = true;
                    }
                } finally {
                }
            }
            if (z10) {
                synchronized (ConnectivityUtility.this.networkListeners) {
                    try {
                        Iterator it = ConnectivityUtility.this.networkListeners.iterator();
                        while (it.hasNext()) {
                            ((NetworkListener) it.next()).onDefaultNetworkChanged();
                        }
                    } finally {
                    }
                }
            }
            if (agoraNetworkInfo == null || agoraNetworkInfo.transportType == 0) {
                return;
            }
            synchronized (ConnectivityUtility.this.networkInfoByCategoryHashMap) {
                try {
                    if (ConnectivityUtility.this.networkInfoByCategoryHashMap.containsKey(Integer.valueOf(agoraNetworkInfo.transportType))) {
                        ConnectivityUtility.this.networkInfoByCategoryHashMap.remove(Integer.valueOf(agoraNetworkInfo.transportType));
                    }
                } finally {
                }
            }
        }
    }

    public static class CustomTelephonyCallback extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
        private CellularNetworkChangeListener listener;

        public CustomTelephonyCallback(@NonNull CellularNetworkChangeListener cellularNetworkChangeListener) {
            this.listener = cellularNetworkChangeListener;
        }

        public void onDisplayInfoChanged(@NonNull TelephonyDisplayInfo telephonyDisplayInfo) {
            int networkType;
            String unused = ConnectivityUtility.TAG;
            telephonyDisplayInfo.toString();
            CellularNetworkChangeListener cellularNetworkChangeListener = this.listener;
            if (cellularNetworkChangeListener != null) {
                networkType = telephonyDisplayInfo.getNetworkType();
                cellularNetworkChangeListener.onCellularNetworkChanged(networkType);
            }
        }
    }

    public interface NetworkListener {
        void onDefaultNetworkChanged();
    }

    public class VpnNetworkCallback extends ConnectivityManager.NetworkCallback {
        public VpnNetworkCallback() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@NonNull Network network) {
            super.onAvailable(network);
            NetworkCapabilities networkCapabilities = ConnectivityUtility.this.connectivityManager.getNetworkCapabilities(network);
            ConnectivityUtility.this.vpnEnabled = Boolean.valueOf(networkCapabilities == null ? false : networkCapabilities.hasTransport(4));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NonNull Network network) {
            super.onLost(network);
            ConnectivityUtility.this.vpnEnabled = Boolean.FALSE;
        }
    }

    public ConnectivityUtility(Context context) {
        initialize(context);
    }

    private boolean checkPermission(Context context, Boolean bool, String str, String str2) {
        if (bool == null) {
            if (this.rtcSharedPreferences.contains(str)) {
                bool = Boolean.valueOf(this.rtcSharedPreferences.getBoolean(str, false));
            } else {
                boolean z10 = context.checkPermission(str2, Process.myPid(), Process.myUid()) == 0;
                bool = Boolean.valueOf(z10);
                SharedPreferences.Editor edit = this.rtcSharedPreferences.edit();
                edit.putBoolean(str, z10);
                edit.apply();
            }
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getNetworkDescription(Network network) {
        NetworkCapabilities networkCapabilities = this.connectivityManager.getNetworkCapabilities(network);
        if (networkCapabilities == null) {
            return "id:" + network.toString();
        }
        return "id:" + network.toString() + " capabilities:" + networkCapabilities.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getTransportType(NetworkCapabilities networkCapabilities) {
        String str;
        String str2;
        if (networkCapabilities == null) {
            str = TAG;
            str2 = "NetworkCapabilities is null, returning TRANSPORT_WIFI by default";
        } else {
            int[] iArr = {3, 1, 0};
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = iArr[i10];
                if (networkCapabilities.hasTransport(i11)) {
                    return i11;
                }
            }
            str = TAG;
            str2 = "No transport type found, returning TRANSPORT_WIFI by default";
        }
        Logging.e(str, str2);
        return 1;
    }

    private void initialize(Context context) {
        if (context == null) {
            return;
        }
        this.connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.telephonyManager = (TelephonyManager) context.getSystemService("phone");
        this.rtcSharedPreferences = context.getSharedPreferences("shengwang_rtc_sdk", 0);
        this.wifiManager = (WifiManager) context.getSystemService("wifi");
        if (!checkAccessNetworkStatePermission(context)) {
            Logging.e(TAG, "startMonitor has no ACCESS_NETWORK_STATE permission");
            return;
        }
        if (this.telephonyManager == null || this.connectivityManager == null || this.wifiManager == null) {
            Logging.e(TAG, "startMonitor get system service failed");
        } else {
            this.rtcSharedPreferences = context.getSharedPreferences("shengwang_rtc_sdk", 0);
            updateNetworkInfo(this.connectivityManager.getActiveNetwork());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logD(String str) {
    }

    private void updateNetworkInfo(Network network) {
        AgoraNetworkInfo buildFromNetwork;
        if (network == null || (buildFromNetwork = AgoraNetworkInfo.buildFromNetwork(this.connectivityManager, this.telephonyManager, network)) == null) {
            return;
        }
        buildFromNetwork.networkType = AgoraNetworkInfo.determineNetworkType(this.telephonyManager, buildFromNetwork.transportType);
        updateNetworkMaps(network, buildFromNetwork);
        if (buildFromNetwork.transportType == 1) {
            updateWifiCapabilities(network, buildFromNetwork);
        }
        synchronized (this.activeNetworkInfoHashMap) {
            this.defaultNetworkInfo = buildFromNetwork;
        }
    }

    private void updateNetworkMaps(Network network, AgoraNetworkInfo agoraNetworkInfo) {
        synchronized (this.activeNetworkInfoHashMap) {
            logD("startMonitor: put active network to map " + network.toString());
            this.activeNetworkInfoHashMap.put(network.toString(), agoraNetworkInfo);
        }
        synchronized (this.networkInfoByCategoryHashMap) {
            this.networkInfoByCategoryHashMap.put(Integer.valueOf(agoraNetworkInfo.transportType), agoraNetworkInfo);
        }
    }

    private void updateWifiCapabilities(Network network, AgoraNetworkInfo agoraNetworkInfo) {
        TransportInfo transportInfo;
        NetworkCapabilities networkCapabilities = this.connectivityManager.getNetworkCapabilities(network);
        if (networkCapabilities != null && Build.VERSION.SDK_INT >= 29) {
            transportInfo = networkCapabilities.getTransportInfo();
            if (transportInfo instanceof WifiInfo) {
                agoraNetworkInfo.updateWifiInfo((WifiInfo) transportInfo);
            }
        }
    }

    public void addNetworkListener(NetworkListener networkListener) {
        if (networkListener != null) {
            this.networkListeners.addIfAbsent(networkListener);
        }
    }

    public boolean checkAccessNetworkStatePermission(Context context) {
        return checkPermission(context, this.hasAccessNetworkStatePermission, PREFERENCE_ACCESS_NETWORK_PERMISSION_KEY, "android.permission.ACCESS_NETWORK_STATE");
    }

    public boolean checkChangeNetworkStatePermission(Context context) {
        return checkPermission(context, this.hasChangeNetworkStatePermission, PREFERENCE_CHANGE_NETWORK_PERMISSION_KEY, "android.permission.CHANGE_NETWORK_STATE");
    }

    public List<AgoraNetworkInfo> getCurrentActiveInfo() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.activeNetworkInfoHashMap) {
            arrayList.addAll(this.activeNetworkInfoHashMap.values());
        }
        logD("getCurrentActiveInfo: " + arrayList.toString());
        return arrayList;
    }

    public int getNetworkType() {
        int i10;
        synchronized (this.activeNetworkInfoHashMap) {
            try {
                AgoraNetworkInfo agoraNetworkInfo = this.defaultNetworkInfo;
                i10 = agoraNetworkInfo != null ? agoraNetworkInfo.networkType : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    public boolean isVpnEnabled() {
        Boolean bool = this.vpnEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        NetworkCapabilities networkCapabilities = this.connectivityManager.getNetworkCapabilities(this.connectivityManager.getActiveNetwork());
        Boolean valueOf = Boolean.valueOf(networkCapabilities == null ? false : networkCapabilities.hasTransport(4));
        this.vpnEnabled = valueOf;
        return valueOf.booleanValue();
    }

    public void removeNetworkListener(NetworkListener networkListener) {
        if (networkListener != null) {
            this.networkListeners.remove(networkListener);
        }
    }

    public void requestCellularNetwork() {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        builder.addTransportType(0);
        builder.addCapability(12);
        if (this.cellularNetworkCallback == null) {
            this.cellularNetworkCallback = new ConnectivityManager.NetworkCallback() { // from class: io.agora.utils2.internal.ConnectivityUtility.3
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(@NonNull Network network) {
                    super.onAvailable(network);
                }
            };
        }
        this.connectivityManager.requestNetwork(builder.build(), this.cellularNetworkCallback);
    }

    public void startMonitor(Context context) {
        logD("startMonitor: ");
        if (this.connectivityManager == null || this.wifiManager == null || this.telephonyManager == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            this.customTelephonyCallback = new CustomTelephonyCallback(new CellularNetworkChangeListener() { // from class: io.agora.utils2.internal.ConnectivityUtility.1
                @Override // io.agora.utils2.internal.ConnectivityUtility.CellularNetworkChangeListener
                public void onCellularNetworkChanged(int i10) {
                    boolean z10;
                    Logging.i(ConnectivityUtility.TAG, "onCellularNetworkChanged: " + i10);
                    synchronized (ConnectivityUtility.this.activeNetworkInfoHashMap) {
                        try {
                            if (ConnectivityUtility.this.defaultNetworkInfo == null || ConnectivityUtility.this.defaultNetworkInfo.networkType == i10 || ConnectivityUtility.this.defaultNetworkInfo.transportType != 0) {
                                z10 = false;
                            } else {
                                ConnectivityUtility.this.defaultNetworkInfo.networkType = Connectivity.getNetworkTypeFromTelephonyNetworkType(i10);
                                z10 = true;
                            }
                        } finally {
                        }
                    }
                    if (z10) {
                        synchronized (ConnectivityUtility.this.networkListeners) {
                            try {
                                Iterator it = ConnectivityUtility.this.networkListeners.iterator();
                                while (it.hasNext()) {
                                    ((NetworkListener) it.next()).onDefaultNetworkChanged();
                                }
                            } finally {
                            }
                        }
                    }
                }
            });
            try {
                this.telephonyManager.registerTelephonyCallback(Executors.newSingleThreadExecutor(), this.customTelephonyCallback);
            } catch (Exception e10) {
                Logging.e(TAG, "registerTelephonyCallback failed: " + e10.getMessage());
            }
        }
        if (this.callback == null) {
            this.callback = new CustomNetworkCallback();
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            builder.addCapability(12);
            try {
                this.connectivityManager.registerNetworkCallback(builder.build(), this.callback);
            } catch (Exception unused) {
                Logging.e(TAG, "startMonitor: register network callback failed");
            }
        }
        if (this.vpnCallback == null) {
            NetworkRequest.Builder builder2 = new NetworkRequest.Builder();
            builder2.addTransportType(4);
            builder2.removeCapability(15);
            this.vpnCallback = new VpnNetworkCallback();
            try {
                this.connectivityManager.registerNetworkCallback(builder2.build(), this.vpnCallback);
            } catch (Exception unused2) {
                Logging.e(TAG, "startMonitor: register vpn network callback failed");
            }
        }
    }

    public void stopMonitor(Context context) {
        CustomTelephonyCallback customTelephonyCallback;
        if (Build.VERSION.SDK_INT >= 31 && (customTelephonyCallback = this.customTelephonyCallback) != null) {
            try {
                this.telephonyManager.unregisterTelephonyCallback(customTelephonyCallback);
            } catch (Exception e10) {
                Logging.e(TAG, "unregisterTelephonyCallback failed: " + e10.getMessage());
            }
        }
        if (this.connectivityManager != null) {
            try {
                if (this.callback != null) {
                    logD("stopMonitor: unregisterNetworkCallback callback");
                    this.connectivityManager.unregisterNetworkCallback(this.callback);
                    this.callback = null;
                }
                if (this.cellularNetworkCallback != null) {
                    logD("stopMonitor: unregisterNetworkCallback cellularNetworkCallback");
                    this.connectivityManager.unregisterNetworkCallback(this.cellularNetworkCallback);
                    this.cellularNetworkCallback = null;
                }
                if (this.vpnCallback != null) {
                    logD("stopMonitor: unregisterNetworkCallback vpnCallback");
                    this.connectivityManager.unregisterNetworkCallback(this.vpnCallback);
                    this.vpnCallback = null;
                }
            } catch (IllegalArgumentException e11) {
                Logging.e(TAG, "Failed to unregister network callbacks", e11);
            }
        }
        synchronized (this.activeNetworkInfoHashMap) {
            this.activeNetworkInfoHashMap.clear();
        }
        synchronized (this.networkInfoByCategoryHashMap) {
            this.networkInfoByCategoryHashMap.clear();
        }
    }
}
