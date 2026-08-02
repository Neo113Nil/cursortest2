package qh;

import android.os.Build;
import androidx.appcompat.widget.c1;
import gh.g0;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static volatile e f22190a;

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f22191b;

    static {
        try {
            for (Map.Entry entry : rh.c.f22519b.entrySet()) {
                rh.c.b((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException e7) {
            System.err.println("Possibly running android unit test without robolectric");
            e7.printStackTrace();
        } catch (UnsatisfiedLinkError e9) {
            System.err.println("Possibly running android unit test without robolectric");
            e9.printStackTrace();
        }
        e aVar = a.f22182e ? new a() : null;
        if (aVar == null) {
            aVar = c.f22187e ? new c() : null;
        }
        if (aVar == null) {
            throw new IllegalStateException(c1.i(Build.VERSION.SDK_INT, "Expected Android API level 21+ but was "));
        }
        f22190a = aVar;
        f22191b = Logger.getLogger(g0.class.getName());
    }

    public y4.a c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        return new uh.a(d(trustManager));
    }

    public uh.d d(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        return new uh.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public abstract void e(SSLSocket sSLSocket, String str, List list);

    public void f(Socket socket, InetSocketAddress address, int i5) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        socket.connect(address, i5);
    }

    public abstract String g(SSLSocket sSLSocket);

    public Object h() {
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        if (f22191b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public abstract boolean i(String str);

    public abstract void j(int i5, String str, Throwable th2);

    public void k(Object obj, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (obj == null) {
            message = k.l(message, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        j(5, message, (Throwable) obj);
    }

    public SSLContext l() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }
}
