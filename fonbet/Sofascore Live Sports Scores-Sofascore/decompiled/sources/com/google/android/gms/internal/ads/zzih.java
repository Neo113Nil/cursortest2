package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzih extends zzht {
    public final int b;

    public zzih(int i, int i2, IOException iOException) {
        super(i == 2000 ? i2 != 1 ? 2000 : 2001 : i, iOException);
        this.b = i2;
    }

    public static zzih a(int i, IOException iOException) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !zzgts.a(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new zzig("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007, 1) : new zzih(i2, i, iOException);
    }

    public zzih() {
        this.b = 1;
    }

    public zzih(String str, int i, int i2) {
        super(str, i == 2000 ? i2 != 1 ? 2000 : 2001 : i);
        this.b = i2;
    }

    public zzih(String str, IOException iOException, int i, int i2) {
        super(i == 2000 ? i2 != 1 ? 2000 : 2001 : i, str, iOException);
        this.b = i2;
    }
}
