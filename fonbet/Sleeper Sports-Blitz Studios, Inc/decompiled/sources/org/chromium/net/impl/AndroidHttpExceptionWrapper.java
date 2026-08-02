package org.chromium.net.impl;

import android.net.http.HttpException;
import org.chromium.net.CronetException;

/* loaded from: classes10.dex */
class AndroidHttpExceptionWrapper extends CronetException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    AndroidHttpExceptionWrapper(HttpException e) {
        super(r0, e);
        String message;
        message = e.getMessage();
    }
}
