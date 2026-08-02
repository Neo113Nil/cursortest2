package io.agora.rte;

import io.agora.base.internal.CalledByNative;
import io.agora.rte.Constants;

/* loaded from: classes3.dex */
public class Error {
    private boolean mIsNativeOwner = true;
    private long mNativeHandle;

    public Error() {
        this.mNativeHandle = 0L;
        this.mNativeHandle = nativeCreateError();
    }

    private void destroy() {
        if (this.mIsNativeOwner) {
            nativeReleaseError(this.mNativeHandle);
        }
        this.mNativeHandle = 0L;
    }

    private native long nativeCreateError();

    private native int nativeGetCode(long j10);

    private native String nativeGetMessage(long j10);

    private native void nativeReleaseError(long j10);

    public Constants.ErrorCode code() {
        return Constants.ErrorCode.fromInt(nativeGetCode(this.mNativeHandle));
    }

    public void finalize() {
        destroy();
    }

    public long getNativeHandle() {
        return this.mNativeHandle;
    }

    public String message() {
        return nativeGetMessage(this.mNativeHandle);
    }

    @CalledByNative
    public Error(long j10) {
        this.mNativeHandle = j10;
    }
}
