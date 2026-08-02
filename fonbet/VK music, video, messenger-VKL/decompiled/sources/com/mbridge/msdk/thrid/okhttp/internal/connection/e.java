package com.mbridge.msdk.thrid.okhttp.internal.connection;

import java.io.IOException;

/* compiled from: RouteException.java */
/* loaded from: classes14.dex */
public final class e extends RuntimeException {
    private IOException a;
    private IOException b;

    public e(IOException iOException) {
        super(iOException);
        this.a = iOException;
        this.b = iOException;
    }

    public void a(IOException iOException) {
        com.mbridge.msdk.thrid.okhttp.internal.c.a((Throwable) this.a, (Throwable) iOException);
        this.b = iOException;
    }

    public IOException d() {
        return this.a;
    }

    public IOException g() {
        return this.b;
    }
}
