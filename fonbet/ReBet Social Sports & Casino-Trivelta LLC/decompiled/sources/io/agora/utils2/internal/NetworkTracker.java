package io.agora.utils2.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Handler;
import io.agora.base.internal.CalledByNative;
import java.io.FileDescriptor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class NetworkTracker {
    public static final int Internet_BLUETOOTH = 3;
    public static final int Internet_CELLULAR = 1;
    public static final int Internet_ETHERNET = 2;
    public static final int Internet_SATELLITE = 5;
    public static final int Internet_UNKNOWN = 6;
    public static final int Internet_USB = 4;
    public static final int Internet_WIFI = 0;
    public static final int Multipath_Enabled = 1;
    public static final int Multipath_No_Permission = 2;
    public static final int Multipath_Uninitialized = 0;
    public static final int Multipath_Version_Under24 = 3;
    private static final String TAG = "NWTracker";
    private final WeakReference<CommonUtility> mCommonUtilityRef;
    private final WeakReference<Context> mContextRef;
    private final WeakReference<Handler> mHandlerRef;
    private int mMultipathDisabledReason = 0;
    private ConnectivityManager.NetworkCallback mDefaultCallback = null;
    private ConnectivityManager.NetworkCallback mCellularCallback = null;
    private final Map<Network, ActiveNetworkInfo> mActiveNetworks = new HashMap();
    private Network mDefaultNetwork = null;
    private int mNetworkId = 1;

    public static class ActiveNetworkInfo {
        int networkId = 0;
        int internetType = 6;
        boolean isDefault = false;

        @CalledByNative("ActiveNetworkInfo")
        public int getInternetType() {
            return this.internetType;
        }

        @CalledByNative("ActiveNetworkInfo")
        public int getNetworkId() {
            return this.networkId;
        }

        @CalledByNative("ActiveNetworkInfo")
        public boolean isDefault() {
            return this.isDefault;
        }
    }

    public NetworkTracker(CommonUtility commonUtility, Context context, Handler handler) {
        this.mCommonUtilityRef = new WeakReference<>(commonUtility);
        this.mContextRef = new WeakReference<>(context);
        this.mHandlerRef = new WeakReference<>(handler);
    }

    private ConnectivityManager.NetworkCallback CreateNetworkCallback(final boolean z10) {
        return new ConnectivityManager.NetworkCallback() { // from class: io.agora.utils2.internal.NetworkTracker.2
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(z10 ? "default " : "");
                sb2.append("callback onAvailable network: ");
                sb2.append(network.toString());
                Logging.i(NetworkTracker.TAG, sb2.toString());
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onBlockedStatusChanged(Network network, boolean z11) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(z10 ? "default " : "");
                sb2.append("callback onBlockedStatusChanged ");
                sb2.append(z11 ? "blocked" : "unblocked");
                sb2.append(", network: ");
                sb2.append(network.toString());
                Logging.i(NetworkTracker.TAG, sb2.toString());
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                NetworkTracker.this.OnActiveNetworkUpdated(z10, network, networkCapabilities);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLosing(Network network, int i10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(z10 ? "default " : "");
                sb2.append("callback onLosing network: ");
                sb2.append(network.toString());
                sb2.append(", mtl: ");
                sb2.append(i10);
                Logging.i(NetworkTracker.TAG, sb2.toString());
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(z10 ? "default " : "");
                sb2.append("callback onLost network: ");
                sb2.append(network.toString());
                Logging.i(NetworkTracker.TAG, sb2.toString());
                NetworkTracker.this.OnActiveNetworkLost(network);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onUnavailable() {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(z10 ? "default " : "");
                sb2.append("callback onUnavailable");
                Logging.i(NetworkTracker.TAG, sb2.toString());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int CreateNetworkId() {
        int i10 = this.mNetworkId;
        this.mNetworkId = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ActiveNetworkInfo[] GetActiveNetworks() {
        ActiveNetworkInfo[] activeNetworkInfoArr = new ActiveNetworkInfo[this.mActiveNetworks.size()];
        Iterator<Map.Entry<Network, ActiveNetworkInfo>> it = this.mActiveNetworks.entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            activeNetworkInfoArr[i10] = it.next().getValue();
            i10++;
        }
        return activeNetworkInfoArr;
    }

    private int GetInternetType(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(1)) {
            return 0;
        }
        if (networkCapabilities.hasTransport(0)) {
            return 1;
        }
        if (networkCapabilities.hasTransport(3)) {
            return 2;
        }
        return networkCapabilities.hasTransport(2) ? 3 : 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NotifyBindSocket2NetworkIdResult(int i10, boolean z10) {
        CommonUtility commonUtility = this.mCommonUtilityRef.get();
        if (commonUtility != null) {
            commonUtility.notifyBindSocket2NetworkIdResult(i10, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void OnActiveNetworkLost(final Network network) {
        Handler handler = this.mHandlerRef.get();
        if (handler == null) {
            return;
        }
        handler.post(new Runnable() { // from class: io.agora.utils2.internal.NetworkTracker.4
            @Override // java.lang.Runnable
            public void run() {
                if (network.equals(NetworkTracker.this.mDefaultNetwork)) {
                    NetworkTracker.this.mDefaultNetwork = null;
                }
                if (NetworkTracker.this.mActiveNetworks.containsKey(network)) {
                    Logging.i(NetworkTracker.TAG, "OnActiveNetworkLost, network: " + network.toString());
                    if (((ActiveNetworkInfo) NetworkTracker.this.mActiveNetworks.get(network)).internetType == 1) {
                        NetworkTracker.this.RequestForCellular();
                        Logging.i(NetworkTracker.TAG, "Request for cellular again for cellular lost");
                    }
                    NetworkTracker.this.mActiveNetworks.remove(network);
                    CommonUtility commonUtility = (CommonUtility) NetworkTracker.this.mCommonUtilityRef.get();
                    if (commonUtility != null) {
                        commonUtility.notifyActiveNetworkChange(NetworkTracker.this.GetActiveNetworks());
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void OnActiveNetworkUpdated(final boolean z10, final Network network, final NetworkCapabilities networkCapabilities) {
        Handler handler = this.mHandlerRef.get();
        if (handler == null) {
            return;
        }
        final int GetInternetType = GetInternetType(networkCapabilities);
        handler.post(new Runnable() { // from class: io.agora.utils2.internal.NetworkTracker.3
            @Override // java.lang.Runnable
            public void run() {
                CommonUtility commonUtility;
                if (z10 && network.equals(NetworkTracker.this.mDefaultNetwork)) {
                    return;
                }
                boolean z11 = false;
                if (z10 && NetworkTracker.this.mDefaultNetwork != null && NetworkTracker.this.mActiveNetworks.containsKey(NetworkTracker.this.mDefaultNetwork)) {
                    ((ActiveNetworkInfo) NetworkTracker.this.mActiveNetworks.get(NetworkTracker.this.mDefaultNetwork)).isDefault = false;
                }
                boolean z12 = true;
                if (z10) {
                    NetworkTracker.this.mDefaultNetwork = network;
                    z11 = true;
                }
                if (NetworkTracker.this.mActiveNetworks.containsKey(network)) {
                    if (z10) {
                        ((ActiveNetworkInfo) NetworkTracker.this.mActiveNetworks.get(network)).isDefault = true;
                    }
                    z12 = z11;
                } else {
                    ActiveNetworkInfo activeNetworkInfo = new ActiveNetworkInfo();
                    activeNetworkInfo.networkId = NetworkTracker.this.CreateNetworkId();
                    activeNetworkInfo.internetType = GetInternetType;
                    activeNetworkInfo.isDefault = z10;
                    NetworkTracker.this.mActiveNetworks.put(network, activeNetworkInfo);
                }
                if (!z12 || (commonUtility = (CommonUtility) NetworkTracker.this.mCommonUtilityRef.get()) == null) {
                    return;
                }
                Logging.i(NetworkTracker.TAG, "OnActiveNetworkUpdated, network: " + network.toString() + ", isDefault: " + z10 + ", type: " + GetInternetType + ", id: " + ((ActiveNetworkInfo) NetworkTracker.this.mActiveNetworks.get(network)).networkId + ", capabilities: " + networkCapabilities.toString());
                commonUtility.notifyActiveNetworkChange(NetworkTracker.this.GetActiveNetworks());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean RequestForCellular() {
        Context context = this.mContextRef.get();
        if (context == null) {
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkRequest build = new NetworkRequest.Builder().addCapability(12).addTransportType(0).build();
        ConnectivityManager.NetworkCallback networkCallback = this.mCellularCallback;
        if (networkCallback != null) {
            connectivityManager.unregisterNetworkCallback(networkCallback);
        } else {
            this.mCellularCallback = CreateNetworkCallback(false);
        }
        try {
            connectivityManager.requestNetwork(build, this.mCellularCallback);
            return true;
        } catch (Exception e10) {
            this.mMultipathDisabledReason = 2;
            ConnectivityManager.NetworkCallback networkCallback2 = this.mDefaultCallback;
            if (networkCallback2 != null) {
                connectivityManager.unregisterNetworkCallback(networkCallback2);
            }
            Logging.w(TAG, "not support multipath, requestNetwork for internet failed: " + e10.toString());
            return false;
        }
    }

    public void BindSocket2NetworkId(final int i10, final int i11, final int i12) {
        Handler handler = this.mHandlerRef.get();
        if (handler != null) {
            handler.post(new Runnable() { // from class: io.agora.utils2.internal.NetworkTracker.1
                @Override // java.lang.Runnable
                public void run() {
                    Network network;
                    Iterator it = NetworkTracker.this.mActiveNetworks.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            network = null;
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (((ActiveNetworkInfo) entry.getValue()).networkId == i11) {
                            network = (Network) entry.getKey();
                            break;
                        }
                    }
                    if (network == null) {
                        Logging.w(NetworkTracker.TAG, "BindSocket2NetworkId " + i11 + " failed: id not found");
                        NetworkTracker.this.NotifyBindSocket2NetworkIdResult(i12, false);
                        return;
                    }
                    FileDescriptor fileDescriptor = new FileDescriptor();
                    try {
                        Field declaredField = FileDescriptor.class.getDeclaredField("descriptor");
                        declaredField.setAccessible(true);
                        declaredField.setInt(fileDescriptor, i10);
                        network.bindSocket(fileDescriptor);
                        Logging.i(NetworkTracker.TAG, "BindSocket2NetworkId " + i11 + " success");
                        NetworkTracker.this.NotifyBindSocket2NetworkIdResult(i12, true);
                    } catch (Exception e10) {
                        Logging.w(NetworkTracker.TAG, "BindSocket2NetworkId " + i11 + " failed: " + e10.toString());
                        NetworkTracker.this.NotifyBindSocket2NetworkIdResult(i12, false);
                        NetworkTracker.this.mActiveNetworks.remove(network);
                        CommonUtility commonUtility = (CommonUtility) NetworkTracker.this.mCommonUtilityRef.get();
                        if (commonUtility != null) {
                            commonUtility.notifyActiveNetworkChange(NetworkTracker.this.GetActiveNetworks());
                        }
                    }
                }
            });
            return;
        }
        Logging.w(TAG, "BindSocket2NetworkId " + i11 + " failed: thread not running");
        NotifyBindSocket2NetworkIdResult(i12, false);
    }

    public int GetMultipathDisabledReason() {
        return this.mMultipathDisabledReason;
    }

    public void StartTrack() {
        Context context = this.mContextRef.get();
        if (context == null) {
            Logging.w(TAG, "context is null");
            return;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        try {
            ConnectivityManager.NetworkCallback CreateNetworkCallback = CreateNetworkCallback(true);
            this.mDefaultCallback = CreateNetworkCallback;
            connectivityManager.registerDefaultNetworkCallback(CreateNetworkCallback);
            if (RequestForCellular()) {
                this.mMultipathDisabledReason = 1;
                Logging.i(TAG, "support multipath");
            }
        } catch (Exception e10) {
            this.mMultipathDisabledReason = 2;
            Logging.w(TAG, "not support multipath, registerDefaultNetworkCallback failed: " + e10.toString());
        }
    }

    public void StopTrack() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("StopTrack, multipath is ");
        sb2.append(this.mMultipathDisabledReason == 1 ? "supported" : "not supported");
        Logging.i(TAG, sb2.toString());
        this.mMultipathDisabledReason = 0;
        Context context = this.mContextRef.get();
        if (context == null) {
            return;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        ConnectivityManager.NetworkCallback networkCallback = this.mDefaultCallback;
        if (networkCallback != null) {
            connectivityManager.unregisterNetworkCallback(networkCallback);
            this.mDefaultCallback = null;
        }
        ConnectivityManager.NetworkCallback networkCallback2 = this.mCellularCallback;
        if (networkCallback2 != null) {
            connectivityManager.unregisterNetworkCallback(networkCallback2);
            this.mCellularCallback = null;
        }
    }
}
