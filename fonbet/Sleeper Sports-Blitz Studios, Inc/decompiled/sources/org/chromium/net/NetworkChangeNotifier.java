package org.chromium.net;

import internal.org.jni_zero.JNINamespace;
import internal.org.jni_zero.NativeClassQualifiedName;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.ObserverList;
import org.chromium.base.metrics.ScopedSysTraceEvent;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

@JNINamespace("net")
/* loaded from: classes10.dex */
public class NetworkChangeNotifier {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static NetworkChangeNotifier sInstance;
    private NetworkChangeNotifierAutoDetect mAutoDetector;
    private int mCurrentConnectionType = 0;
    private int mCurrentConnectionCost = 0;
    private final ArrayList<Long> mNativeChangeNotifiers = new ArrayList<>();
    private final ObserverList<ConnectionTypeObserver> mConnectionTypeObservers = new ObserverList<>();

    public interface ConnectionTypeObserver {
        void onConnectionTypeChanged(int connectionType);
    }

    interface Natives {
        @NativeClassQualifiedName("NetworkChangeNotifierDelegateAndroid")
        void notifyConnectionCostChanged(long nativePtr, int newConnectionCost);

        @NativeClassQualifiedName("NetworkChangeNotifierDelegateAndroid")
        void notifyConnectionSubtypeChanged(long nativePtr, int subType);

        @NativeClassQualifiedName("NetworkChangeNotifierDelegateAndroid")
        void notifyConnectionTypeChanged(long nativePtr, int newConnectionType, long defaultNetId);

        @NativeClassQualifiedName("NetworkChangeNotifierDelegateAndroid")
        void notifyOfNetworkConnect(long nativePtr, long netId, int connectionType);

        @NativeClassQualifiedName("NetworkChangeNotifierDelegateAndroid")
        void notifyOfNetworkDisconnect(long nativePtr, long netId);

        @NativeClassQualifiedName("NetworkChangeNotifierDelegateAndroid")
        void notifyOfNetworkSoonToDisconnect(long nativePtr, long netId);

        @NativeClassQualifiedName("NetworkChangeNotifierDelegateAndroid")
        void notifyPurgeActiveNetworkList(long nativePtr, long[] activeNetIds);
    }

    protected NetworkChangeNotifier() {
    }

    public static NetworkChangeNotifier init() {
        if (sInstance == null) {
            sInstance = new NetworkChangeNotifier();
        }
        return sInstance;
    }

    public static boolean isInitialized() {
        return sInstance != null;
    }

    public static void resetInstanceForTests() {
        sInstance = new NetworkChangeNotifier();
    }

    public static void resetInstanceForTests(NetworkChangeNotifier notifier) {
        sInstance = notifier;
    }

    public int getCurrentConnectionType() {
        return this.mCurrentConnectionType;
    }

    public int getCurrentConnectionSubtype(boolean forceUpdateNetworkState) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("NetworkChangeNotifier.getCurrentConnectionSubtype");
        try {
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
            if (networkChangeNotifierAutoDetect == null) {
                if (scoped != null) {
                    scoped.close();
                }
                return 0;
            }
            if (forceUpdateNetworkState) {
                networkChangeNotifierAutoDetect.updateCurrentNetworkState();
            }
            int connectionSubtype = this.mAutoDetector.getCurrentNetworkState().getConnectionSubtype();
            if (scoped != null) {
                scoped.close();
            }
            return connectionSubtype;
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public int getCurrentConnectionCost() {
        return this.mCurrentConnectionCost;
    }

    public long getCurrentDefaultNetId() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
        if (networkChangeNotifierAutoDetect == null) {
            return -1L;
        }
        return networkChangeNotifierAutoDetect.getDefaultNetId();
    }

    public long[] getCurrentNetworksAndTypes() {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("NetworkChangeNotifierAutoDetect.getCurrentNetworksAndTypes");
        try {
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
            long[] networksAndTypes = networkChangeNotifierAutoDetect == null ? new long[0] : networkChangeNotifierAutoDetect.getNetworksAndTypes();
            if (scoped != null) {
                scoped.close();
            }
            return networksAndTypes;
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void addNativeObserver(long nativeChangeNotifier) {
        this.mNativeChangeNotifiers.add(Long.valueOf(nativeChangeNotifier));
    }

    public void removeNativeObserver(long nativeChangeNotifier) {
        this.mNativeChangeNotifiers.remove(Long.valueOf(nativeChangeNotifier));
    }

    public boolean registerNetworkCallbackFailed() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
        if (networkChangeNotifierAutoDetect == null) {
            return false;
        }
        return networkChangeNotifierAutoDetect.registerNetworkCallbackFailed();
    }

    public static NetworkChangeNotifier getInstance() {
        return sInstance;
    }

    public static void setAutoDetectConnectivityState(boolean shouldAutoDetect) {
        getInstance().setAutoDetectConnectivityStateInternal(shouldAutoDetect, new RegistrationPolicyApplicationStatus());
    }

    public static void registerToReceiveNotificationsAlways() {
        getInstance().setAutoDetectConnectivityStateInternal(true, new RegistrationPolicyAlwaysRegister());
    }

    public static void setAutoDetectConnectivityState(NetworkChangeNotifierAutoDetect.RegistrationPolicy policy, boolean forceUpdateNetworkState) {
        getInstance().setAutoDetectConnectivityStateInternal(true, policy, forceUpdateNetworkState);
    }

    private void destroyAutoDetector() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
        if (networkChangeNotifierAutoDetect != null) {
            networkChangeNotifierAutoDetect.destroy();
            this.mAutoDetector = null;
        }
    }

    private void setAutoDetectConnectivityStateInternal(boolean shouldAutoDetect, NetworkChangeNotifierAutoDetect.RegistrationPolicy policy) {
        setAutoDetectConnectivityStateInternal(shouldAutoDetect, policy, true);
    }

    private void setAutoDetectConnectivityStateInternal(boolean shouldAutoDetect, NetworkChangeNotifierAutoDetect.RegistrationPolicy policy, boolean forceUpdateNetworkState) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("NetworkChangeNotifier.setAutoDetectConnectivityStateInternal");
        try {
            if (shouldAutoDetect) {
                if (this.mAutoDetector == null) {
                    NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = new NetworkChangeNotifierAutoDetect(new NetworkChangeNotifierAutoDetect.Observer() { // from class: org.chromium.net.NetworkChangeNotifier.1
                        @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
                        public void onConnectionTypeChanged(int newConnectionType) {
                            NetworkChangeNotifier.this.updateCurrentConnectionType(newConnectionType);
                        }

                        @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
                        public void onConnectionCostChanged(int newConnectionCost) {
                            NetworkChangeNotifier.this.notifyObserversOfConnectionCostChange(newConnectionCost);
                        }

                        @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
                        public void onConnectionSubtypeChanged(int newConnectionSubtype) {
                            NetworkChangeNotifier.this.notifyObserversOfConnectionSubtypeChange(newConnectionSubtype);
                        }

                        @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
                        public void onNetworkConnect(long netId, int connectionType) {
                            NetworkChangeNotifier.this.notifyObserversOfNetworkConnect(netId, connectionType);
                        }

                        @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
                        public void onNetworkSoonToDisconnect(long netId) {
                            NetworkChangeNotifier.this.notifyObserversOfNetworkSoonToDisconnect(netId);
                        }

                        @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
                        public void onNetworkDisconnect(long netId) {
                            NetworkChangeNotifier.this.notifyObserversOfNetworkDisconnect(netId);
                        }

                        @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
                        public void purgeActiveNetworkList(long[] activeNetIds) {
                            NetworkChangeNotifier.this.notifyObserversToPurgeActiveNetworkList(activeNetIds);
                        }
                    }, policy);
                    this.mAutoDetector = networkChangeNotifierAutoDetect;
                    if (forceUpdateNetworkState) {
                        networkChangeNotifierAutoDetect.updateCurrentNetworkState();
                    }
                    NetworkChangeNotifierAutoDetect.NetworkState currentNetworkState = this.mAutoDetector.getCurrentNetworkState();
                    updateCurrentConnectionType(currentNetworkState.getConnectionType());
                    updateCurrentConnectionCost(currentNetworkState.getConnectionCost());
                    notifyObserversOfConnectionSubtypeChange(currentNetworkState.getConnectionSubtype());
                }
            } else {
                destroyAutoDetector();
            }
            if (scoped != null) {
                scoped.close();
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void forceConnectivityState(boolean networkAvailable) {
        setAutoDetectConnectivityState(false);
        getInstance().forceConnectivityStateInternal(networkAvailable);
    }

    private void forceConnectivityStateInternal(boolean z) {
        if ((this.mCurrentConnectionType != 6) != z) {
            updateCurrentConnectionType(z ? 0 : 6);
            notifyObserversOfConnectionSubtypeChange(!z ? 1 : 0);
        }
    }

    public static void fakeNetworkConnected(long netId, int connectionType) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfNetworkConnect(netId, connectionType);
    }

    public static void fakeNetworkSoonToBeDisconnected(long netId) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfNetworkSoonToDisconnect(netId);
    }

    public static void fakeNetworkDisconnected(long netId) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfNetworkDisconnect(netId);
    }

    public static void fakePurgeActiveNetworkList(long[] activeNetIds) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversToPurgeActiveNetworkList(activeNetIds);
    }

    public static void fakeDefaultNetwork(long netId, int connectionType) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfConnectionTypeChange(connectionType, netId);
    }

    public static void fakeConnectionCostChanged(int connectionCost) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfConnectionCostChange(connectionCost);
    }

    public static void fakeConnectionSubtypeChanged(int connectionSubtype) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfConnectionSubtypeChange(connectionSubtype);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCurrentConnectionType(int newConnectionType) {
        this.mCurrentConnectionType = newConnectionType;
        notifyObserversOfConnectionTypeChange(newConnectionType);
    }

    void notifyObserversOfConnectionTypeChange(int newConnectionType) {
        notifyObserversOfConnectionTypeChange(newConnectionType, getCurrentDefaultNetId());
    }

    private void notifyObserversOfConnectionTypeChange(int newConnectionType, long defaultNetId) {
        Iterator<Long> it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            NetworkChangeNotifierJni.get().notifyConnectionTypeChanged(it.next().longValue(), newConnectionType, defaultNetId);
        }
        Iterator<ConnectionTypeObserver> it2 = this.mConnectionTypeObservers.iterator();
        while (it2.hasNext()) {
            it2.next().onConnectionTypeChanged(newConnectionType);
        }
    }

    private void updateCurrentConnectionCost(int newConnectionCost) {
        this.mCurrentConnectionCost = newConnectionCost;
        notifyObserversOfConnectionCostChange(newConnectionCost);
    }

    void notifyObserversOfConnectionCostChange(int newConnectionCost) {
        Iterator<Long> it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            NetworkChangeNotifierJni.get().notifyConnectionCostChanged(it.next().longValue(), newConnectionCost);
        }
    }

    void notifyObserversOfConnectionSubtypeChange(int connectionSubtype) {
        Iterator<Long> it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            NetworkChangeNotifierJni.get().notifyConnectionSubtypeChanged(it.next().longValue(), connectionSubtype);
        }
    }

    void notifyObserversOfNetworkConnect(long netId, int connectionType) {
        Iterator<Long> it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            NetworkChangeNotifierJni.get().notifyOfNetworkConnect(it.next().longValue(), netId, connectionType);
        }
    }

    void notifyObserversOfNetworkSoonToDisconnect(long netId) {
        Iterator<Long> it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            NetworkChangeNotifierJni.get().notifyOfNetworkSoonToDisconnect(it.next().longValue(), netId);
        }
    }

    void notifyObserversOfNetworkDisconnect(long netId) {
        Iterator<Long> it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            NetworkChangeNotifierJni.get().notifyOfNetworkDisconnect(it.next().longValue(), netId);
        }
    }

    void notifyObserversToPurgeActiveNetworkList(long[] activeNetIds) {
        Iterator<Long> it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            NetworkChangeNotifierJni.get().notifyPurgeActiveNetworkList(it.next().longValue(), activeNetIds);
        }
    }

    public static void addConnectionTypeObserver(ConnectionTypeObserver observer) {
        getInstance().addConnectionTypeObserverInternal(observer);
    }

    private void addConnectionTypeObserverInternal(ConnectionTypeObserver observer) {
        this.mConnectionTypeObservers.addObserver(observer);
    }

    public static void removeConnectionTypeObserver(ConnectionTypeObserver observer) {
        getInstance().removeConnectionTypeObserverInternal(observer);
    }

    private void removeConnectionTypeObserverInternal(ConnectionTypeObserver observer) {
        this.mConnectionTypeObservers.removeObserver(observer);
    }

    public static NetworkChangeNotifierAutoDetect getAutoDetectorForTest() {
        return getInstance().mAutoDetector;
    }

    public static boolean isOnline() {
        return getInstance().getCurrentConnectionType() != 6;
    }
}
