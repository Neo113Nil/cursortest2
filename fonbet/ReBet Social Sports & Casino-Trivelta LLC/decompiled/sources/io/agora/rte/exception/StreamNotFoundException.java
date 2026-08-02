package io.agora.rte.exception;

import io.agora.base.internal.CalledByNative;
import io.agora.rte.Constants;

/* loaded from: classes3.dex */
public class StreamNotFoundException extends RteException {
    @CalledByNative
    public StreamNotFoundException(String str) {
        super(str);
    }

    @Override // io.agora.rte.exception.RteException
    public Constants.ErrorCode errorCode() {
        return Constants.ErrorCode.STREAM_NOT_FOUND;
    }
}
