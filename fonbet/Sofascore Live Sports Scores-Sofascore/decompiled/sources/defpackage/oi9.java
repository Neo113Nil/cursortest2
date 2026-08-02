package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class oi9 extends te4 {
    public final int b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public oi9(int i, int i2, IOException iOException) {
        super(i, iOException);
        if (i == 2000 && i2 == 1) {
            i = 2001;
        }
        this.b = i2;
    }

    public static oi9 a(int i, IOException iOException) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !rz8.W(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new mi9(2007, iOException, "Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted") : new oi9(i2, i, iOException);
    }

    public oi9(String str, int i) {
        super(str, i == 2000 ? 2001 : i);
        this.b = 1;
    }

    public oi9() {
        super(2008);
        this.b = 1;
    }

    public oi9(int i, IOException iOException, String str) {
        super(i == 2000 ? 2001 : i, str, iOException);
        this.b = 1;
    }
}
