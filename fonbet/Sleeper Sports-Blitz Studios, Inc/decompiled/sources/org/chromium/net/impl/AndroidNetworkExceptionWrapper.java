package org.chromium.net.impl;

import org.chromium.net.NetworkException;
import retrofit2.Reflection$Java8$$ExternalSyntheticApiModelOutline0;

/* loaded from: classes10.dex */
class AndroidNetworkExceptionWrapper extends NetworkException {
    private final android.net.http.NetworkException mBackend;

    @Override // org.chromium.net.NetworkException
    public int getCronetInternalErrorCode() {
        return -1;
    }

    AndroidNetworkExceptionWrapper(android.net.http.NetworkException backend) {
        this(backend, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    AndroidNetworkExceptionWrapper(android.net.http.NetworkException backend, boolean expectQuicException) {
        super(r0, backend);
        String message;
        message = backend.getMessage();
        this.mBackend = backend;
        if (!expectQuicException && Reflection$Java8$$ExternalSyntheticApiModelOutline0.m15661m((Object) backend)) {
            throw new IllegalArgumentException("Translating QuicException as NetworkException results in loss of information. Make sure you handle QuicException first. See the stacktrace for where the translation is being performed, and the cause for the exception being translated.", backend);
        }
    }

    @Override // org.chromium.net.NetworkException
    public int getErrorCode() {
        int errorCode;
        errorCode = this.mBackend.getErrorCode();
        return errorCode;
    }

    @Override // org.chromium.net.NetworkException
    public boolean immediatelyRetryable() {
        boolean isImmediatelyRetryable;
        isImmediatelyRetryable = this.mBackend.isImmediatelyRetryable();
        return isImmediatelyRetryable;
    }
}
