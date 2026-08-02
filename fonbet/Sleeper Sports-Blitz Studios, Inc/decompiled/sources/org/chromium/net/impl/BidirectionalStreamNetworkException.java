package org.chromium.net.impl;

/* loaded from: classes10.dex */
public class BidirectionalStreamNetworkException extends NetworkExceptionImpl {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public BidirectionalStreamNetworkException(String message, int errorCode, int cronetInternalErrorCode) {
        super(message, errorCode, cronetInternalErrorCode);
    }

    @Override // org.chromium.net.impl.NetworkExceptionImpl, org.chromium.net.NetworkException
    public boolean immediatelyRetryable() {
        int i = this.mCronetInternalErrorCode;
        if (i == -358 || i == -352) {
            return true;
        }
        return super.immediatelyRetryable();
    }
}
