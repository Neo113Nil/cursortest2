package org.chromium.net;

import android.net.ConnectivityManager;
import internal.org.jni_zero.JNINamespace;
import internal.org.jni_zero.NativeClassQualifiedName;
import org.chromium.base.ContextUtils;

@JNINamespace("net")
/* loaded from: classes10.dex */
public class NetworkActiveNotifier implements ConnectivityManager.OnNetworkActiveListener {
    private boolean mAreNotificationsEnabled;
    private final ConnectivityManager mConnectivityManager = (ConnectivityManager) ContextUtils.getApplicationContext().getSystemService("connectivity");
    private final long mNativeNetworkActiveObserver;

    interface Natives {
        @NativeClassQualifiedName("NetworkChangeNotifierDelegateAndroid")
        void notifyOfDefaultNetworkActive(long nativePtr);
    }

    public static NetworkActiveNotifier build(long nativeNetworkActiveNotifier) {
        return new NetworkActiveNotifier(nativeNetworkActiveNotifier);
    }

    public void enableNotifications() {
        this.mAreNotificationsEnabled = true;
        this.mConnectivityManager.addDefaultNetworkActiveListener(this);
    }

    public void disableNotifications() {
        this.mAreNotificationsEnabled = false;
        this.mConnectivityManager.removeDefaultNetworkActiveListener(this);
    }

    public boolean isDefaultNetworkActive() {
        return this.mConnectivityManager.isDefaultNetworkActive();
    }

    @Override // android.net.ConnectivityManager.OnNetworkActiveListener
    public void onNetworkActive() {
        NetworkActiveNotifierJni.get().notifyOfDefaultNetworkActive(this.mNativeNetworkActiveObserver);
    }

    public void fakeDefaultNetworkActive() {
        if (this.mAreNotificationsEnabled) {
            onNetworkActive();
        }
    }

    private NetworkActiveNotifier(long nativeNetworkActiveNotifier) {
        this.mNativeNetworkActiveObserver = nativeNetworkActiveNotifier;
    }
}
