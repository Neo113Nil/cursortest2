package io.ably.lib.transport;

import io.ably.lib.types.ErrorInfo;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes9.dex */
public abstract class NetworkConnectivity {
    protected Set<NetworkConnectivityListener> listeners = new HashSet();

    public static class DefaultNetworkConnectivity extends NetworkConnectivity {
    }

    public interface NetworkConnectivityListener {
        void onNetworkAvailable();

        void onNetworkUnavailable(ErrorInfo errorInfo);
    }

    protected void onEmpty() {
    }

    protected void onNonempty() {
    }

    public void addListener(NetworkConnectivityListener networkConnectivityListener) {
        boolean isEmpty;
        synchronized (this) {
            isEmpty = this.listeners.isEmpty();
            this.listeners.add(networkConnectivityListener);
        }
        if (isEmpty) {
            onNonempty();
        }
    }

    public void removeListener(NetworkConnectivityListener networkConnectivityListener) {
        boolean isEmpty;
        synchronized (this) {
            this.listeners.remove(networkConnectivityListener);
            isEmpty = this.listeners.isEmpty();
        }
        if (isEmpty) {
            onEmpty();
        }
    }

    protected void notifyNetworkAvailable() {
        NetworkConnectivityListener[] networkConnectivityListenerArr;
        synchronized (this) {
            Set<NetworkConnectivityListener> set = this.listeners;
            networkConnectivityListenerArr = (NetworkConnectivityListener[]) set.toArray(new NetworkConnectivityListener[set.size()]);
        }
        for (NetworkConnectivityListener networkConnectivityListener : networkConnectivityListenerArr) {
            networkConnectivityListener.onNetworkAvailable();
        }
    }

    protected void notifyNetworkUnavailable(ErrorInfo errorInfo) {
        NetworkConnectivityListener[] networkConnectivityListenerArr;
        synchronized (this) {
            Set<NetworkConnectivityListener> set = this.listeners;
            networkConnectivityListenerArr = (NetworkConnectivityListener[]) set.toArray(new NetworkConnectivityListener[set.size()]);
        }
        for (NetworkConnectivityListener networkConnectivityListener : networkConnectivityListenerArr) {
            networkConnectivityListener.onNetworkUnavailable(errorInfo);
        }
    }

    protected synchronized boolean isEmpty() {
        return this.listeners.isEmpty();
    }

    public static class DelegatedNetworkConnectivity extends NetworkConnectivity implements NetworkConnectivityListener {
        @Override // io.ably.lib.transport.NetworkConnectivity.NetworkConnectivityListener
        public void onNetworkAvailable() {
            notifyNetworkAvailable();
        }

        @Override // io.ably.lib.transport.NetworkConnectivity.NetworkConnectivityListener
        public void onNetworkUnavailable(ErrorInfo errorInfo) {
            notifyNetworkUnavailable(errorInfo);
        }
    }
}
