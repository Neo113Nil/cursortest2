package org.chromium.net.impl;

import org.chromium.net.QuicException;

/* loaded from: classes10.dex */
public class QuicExceptionImpl extends QuicException {
    private final NetworkExceptionImpl mNetworkException;
    private final int mQuicDetailedErrorCode;
    private final int mSource;

    @Deprecated
    public QuicExceptionImpl(String message, int errorCode, int netErrorCode, int quicDetailedErrorCode) {
        this(message, errorCode, netErrorCode, quicDetailedErrorCode, 0);
    }

    public QuicExceptionImpl(String message, int errorCode, int netErrorCode, int quicDetailedErrorCode, int source) {
        super(message, null);
        this.mNetworkException = new NetworkExceptionImpl(message, errorCode, netErrorCode);
        this.mQuicDetailedErrorCode = quicDetailedErrorCode;
        this.mSource = source;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.mNetworkException.getMessage() + ", QuicDetailedErrorCode=" + this.mQuicDetailedErrorCode + ", Source=" + this.mSource;
    }

    @Override // org.chromium.net.NetworkException
    public int getErrorCode() {
        return this.mNetworkException.getErrorCode();
    }

    @Override // org.chromium.net.NetworkException
    public int getCronetInternalErrorCode() {
        return this.mNetworkException.getCronetInternalErrorCode();
    }

    @Override // org.chromium.net.NetworkException
    public boolean immediatelyRetryable() {
        return this.mNetworkException.immediatelyRetryable();
    }

    @Override // org.chromium.net.QuicException
    public int getQuicDetailedErrorCode() {
        return this.mQuicDetailedErrorCode;
    }

    @Override // org.chromium.net.QuicException
    public int getConnectionCloseSource() {
        return this.mSource;
    }
}
