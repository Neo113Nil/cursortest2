package p3;

import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public class q extends C8847g {

    /* renamed from: c, reason: collision with root package name */
    public final int f80118c;

    public q(int i11) {
        super(i11 == 2000 ? 2001 : i11);
        this.f80118c = 1;
    }

    public static q a(int i11, IOException iOException) {
        String message = iOException.getMessage();
        int i12 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION : (message == null || !O7.b.b(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i12 == 2007 ? new o(iOException) : new q(iOException, i12, i11);
    }

    public q(String str, int i11) {
        super(str, i11 == 2000 ? 2001 : i11);
        this.f80118c = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(IOException iOException, int i11, int i12) {
        super(i11, iOException);
        if (i11 == 2000 && i12 == 1) {
            i11 = 2001;
        }
        this.f80118c = i12;
    }

    public q(String str, int i11, IOException iOException) {
        super(i11 == 2000 ? 2001 : i11, iOException, str);
        this.f80118c = 1;
    }
}
