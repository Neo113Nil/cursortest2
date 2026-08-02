package h1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* renamed from: h1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4426v extends C4415k {

    /* renamed from: b, reason: collision with root package name */
    public final C4418n f47618b;

    /* renamed from: c, reason: collision with root package name */
    public final int f47619c;

    public C4426v(C4418n c4418n, int i10, int i11) {
        super(b(i10, i11));
        this.f47618b = c4418n;
        this.f47619c = i11;
    }

    public static int b(int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            return 2001;
        }
        return i10;
    }

    public static C4426v c(IOException iOException, C4418n c4418n, int i10) {
        String message = iOException.getMessage();
        int i11 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !Ra.c.e(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i11 == 2007 ? new C4424t(iOException, c4418n) : new C4426v(iOException, c4418n, i11, i10);
    }

    public C4426v(String str, C4418n c4418n, int i10, int i11) {
        super(str, b(i10, i11));
        this.f47618b = c4418n;
        this.f47619c = i11;
    }

    public C4426v(IOException iOException, C4418n c4418n, int i10, int i11) {
        super(iOException, b(i10, i11));
        this.f47618b = c4418n;
        this.f47619c = i11;
    }

    public C4426v(String str, IOException iOException, C4418n c4418n, int i10, int i11) {
        super(str, iOException, b(i10, i11));
        this.f47618b = c4418n;
        this.f47619c = i11;
    }
}
