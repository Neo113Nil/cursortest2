package org.chromium.net.impl;

import org.chromium.net.CallbackException;

/* loaded from: classes10.dex */
class AndroidCallbackExceptionWrapper extends CallbackException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected AndroidCallbackExceptionWrapper(android.net.http.CallbackException e) {
        super(r0, r2);
        String message;
        Throwable cause;
        message = e.getMessage();
        cause = e.getCause();
    }
}
