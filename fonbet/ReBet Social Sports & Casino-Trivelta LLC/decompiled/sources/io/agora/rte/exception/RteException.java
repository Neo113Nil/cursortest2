package io.agora.rte.exception;

import io.agora.base.internal.CalledByNative;
import io.agora.rte.Constants;

/* loaded from: classes3.dex */
public class RteException extends Exception {
    private int mErrorCode;

    public RteException(String str) {
        super(str);
    }

    public Constants.ErrorCode errorCode() {
        return Constants.ErrorCode.fromInt(this.mErrorCode);
    }

    @CalledByNative
    public RteException(String str, int i10) {
        super(str);
        this.mErrorCode = i10;
    }
}
