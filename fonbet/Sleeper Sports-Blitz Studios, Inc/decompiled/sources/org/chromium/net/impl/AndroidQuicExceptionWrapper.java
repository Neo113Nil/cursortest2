package org.chromium.net.impl;

import org.chromium.net.QuicException;

/* loaded from: classes10.dex */
class AndroidQuicExceptionWrapper extends QuicException {
    private final AndroidNetworkExceptionWrapper mBackend;

    @Override // org.chromium.net.QuicException
    public int getConnectionCloseSource() {
        return 0;
    }

    @Override // org.chromium.net.QuicException
    public int getQuicDetailedErrorCode() {
        return 0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    AndroidQuicExceptionWrapper(android.net.http.QuicException backend) {
        super(r0, backend);
        String message;
        message = backend.getMessage();
        this.mBackend = new AndroidNetworkExceptionWrapper(backend, true);
    }

    @Override // org.chromium.net.NetworkException
    public int getErrorCode() {
        return this.mBackend.getErrorCode();
    }

    @Override // org.chromium.net.NetworkException
    public int getCronetInternalErrorCode() {
        return this.mBackend.getCronetInternalErrorCode();
    }

    @Override // org.chromium.net.NetworkException
    public boolean immediatelyRetryable() {
        return this.mBackend.immediatelyRetryable();
    }
}
