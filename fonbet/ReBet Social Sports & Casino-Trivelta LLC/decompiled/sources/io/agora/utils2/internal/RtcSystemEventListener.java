package io.agora.utils2.internal;

import io.agora.base.internal.CalledByNative;
import io.agora.utils2.internal.CommonUtility;
import io.agora.utils2.internal.NetworkTracker;

/* loaded from: classes3.dex */
public class RtcSystemEventListener implements CommonUtility.SystemEventListener {
    private static final String TAG = "RtcSystemEventListener";
    private long mNativeHandle;

    @CalledByNative
    public RtcSystemEventListener(long j10) {
        this.mNativeHandle = j10;
    }

    private native void nativeAudioRoutingPhoneChanged(boolean z10, int i10, int i11);

    private native void nativeNotifyActiveNetworkChange(NetworkTracker.ActiveNetworkInfo[] activeNetworkInfoArr);

    private native void nativeNotifyAddressBound(String str);

    private native void nativeNotifyBindSocket2NetworkIdResult(int i10, boolean z10);

    private native void nativeNotifyForegroundChanged(boolean z10);

    private native void nativeNotifyGravityOriChange(int i10);

    private native void nativeNotifyNetworkChange(CommonUtility.MediaNetworkInfo mediaNetworkInfo);

    @CalledByNative
    public long getNativeHandle() {
        return this.mNativeHandle;
    }

    @Override // io.agora.utils2.internal.CommonUtility.SystemEventListener
    public void onActiveNetworkChange(NetworkTracker.ActiveNetworkInfo[] activeNetworkInfoArr) {
        nativeNotifyActiveNetworkChange(activeNetworkInfoArr);
    }

    @Override // io.agora.utils2.internal.CommonUtility.SystemEventListener
    public void onAddressBound(String str) {
        nativeNotifyAddressBound(str);
    }

    @Override // io.agora.utils2.internal.CommonUtility.SystemEventListener
    public void onAudioRoutingPhoneChanged(boolean z10, int i10, int i11) {
        nativeAudioRoutingPhoneChanged(z10, i10, i11);
    }

    @Override // io.agora.utils2.internal.CommonUtility.SystemEventListener
    public void onBindSocket2NetworkIdResult(int i10, boolean z10) {
        nativeNotifyBindSocket2NetworkIdResult(i10, z10);
    }

    @Override // io.agora.utils2.internal.CommonUtility.SystemEventListener
    public void onForegroundChanged(boolean z10) {
        nativeNotifyForegroundChanged(z10);
    }

    @Override // io.agora.utils2.internal.CommonUtility.SystemEventListener
    public void onGravityOriChange(int i10) {
        nativeNotifyGravityOriChange(i10);
    }

    @Override // io.agora.utils2.internal.CommonUtility.SystemEventListener
    public void onNetworkChange(CommonUtility.MediaNetworkInfo mediaNetworkInfo) {
        nativeNotifyNetworkChange(mediaNetworkInfo);
    }
}
