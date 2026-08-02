package rc;

import hg.o0;
import hg.t0;
import hg.u0;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.Intrinsics;
import nh.d0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static volatile t0 f22389a = u0.a(0, 20, gg.a.f10049b);

    /* renamed from: b, reason: collision with root package name */
    public static final o0 f22390b = new o0(f22389a);

    public static void a(Exception e7) {
        int i5;
        Intrinsics.checkNotNullParameter(e7, "e");
        if ((e7 instanceof ConnectException) || (e7 instanceof SocketException) || (e7 instanceof nh.a) || (e7 instanceof d0) || (e7 instanceof SSLPeerUnverifiedException) || (e7 instanceof SSLHandshakeException) || (e7 instanceof SSLException) || (e7 instanceof SocketTimeoutException) || (e7 instanceof TimeoutException) || (e7 instanceof ProtocolException) || (e7 instanceof UnknownHostException)) {
            i5 = 69;
        } else if (e7 instanceof oi.q) {
            i5 = ((oi.q) e7).code();
        } else {
            zc.d.b(6, null, e7);
            i5 = 400;
        }
        if (200 > i5 || i5 >= 300) {
            b(i5);
        }
    }

    public static boolean b(int i5) {
        if (200 > i5 || i5 >= 300) {
            return f22389a.b(Integer.valueOf(i5));
        }
        return false;
    }
}
