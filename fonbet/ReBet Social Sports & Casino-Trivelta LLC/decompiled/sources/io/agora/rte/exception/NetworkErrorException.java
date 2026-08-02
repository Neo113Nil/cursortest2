package io.agora.rte.exception;

import io.agora.base.internal.CalledByNative;
import io.agora.rte.Constants;

/* loaded from: classes3.dex */
public class NetworkErrorException extends RteException {
    @CalledByNative
    public NetworkErrorException(String str) {
        super(str);
    }

    @Override // io.agora.rte.exception.RteException
    public Constants.ErrorCode errorCode() {
        return Constants.ErrorCode.NETWORK_ERROR;
    }
}
