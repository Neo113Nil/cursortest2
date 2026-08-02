package com.vk.push.core.filedatastore;

import java.io.IOException;
import xsna.zcl;

/* compiled from: Exceptions.kt */
/* loaded from: classes5.dex */
public final class ReadException extends IOException {
    private final Throwable cause;
    private final String message;

    public ReadException(Throwable th, String str) {
        super(str, th);
        this.cause = th;
        this.message = str;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public /* synthetic */ ReadException(Throwable th, String str, int i, zcl zclVar) {
        this(th, (i & 2) != 0 ? "Read failed" : str);
    }
}
