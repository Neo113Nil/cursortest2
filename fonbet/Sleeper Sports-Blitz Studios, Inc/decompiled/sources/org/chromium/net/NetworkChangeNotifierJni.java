package org.chromium.net;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.net.NetworkChangeNotifier;

/* loaded from: classes10.dex */
class NetworkChangeNotifierJni implements NetworkChangeNotifier.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    NetworkChangeNotifierJni() {
    }

    public static NetworkChangeNotifier.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (NetworkChangeNotifier.Natives) jniTestInstanceHolder.value;
        }
        return new NetworkChangeNotifierJni();
    }

    public static void setInstanceForTesting(NetworkChangeNotifier.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyConnectionCostChanged(long nativePtr, int newConnectionCost) {
        GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyConnectionCostChanged(nativePtr, newConnectionCost);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyConnectionSubtypeChanged(long nativePtr, int subType) {
        GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyConnectionSubtypeChanged(nativePtr, subType);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyConnectionTypeChanged(long nativePtr, int newConnectionType, long defaultNetId) {
        GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyConnectionTypeChanged(nativePtr, newConnectionType, defaultNetId);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyOfNetworkConnect(long nativePtr, long netId, int connectionType) {
        GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyOfNetworkConnect(nativePtr, netId, connectionType);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyOfNetworkDisconnect(long nativePtr, long netId) {
        GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyOfNetworkDisconnect(nativePtr, netId);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyOfNetworkSoonToDisconnect(long nativePtr, long netId) {
        GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyOfNetworkSoonToDisconnect(nativePtr, netId);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyPurgeActiveNetworkList(long nativePtr, long[] activeNetIds) {
        GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyPurgeActiveNetworkList(nativePtr, activeNetIds);
    }
}
