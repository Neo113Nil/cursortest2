package qh;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import gh.g0;
import io.sentry.android.core.w0;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.p;
import kotlin.jvm.internal.Intrinsics;
import rh.h;
import rh.k;
import rh.m;
import rh.n;
import rh.o;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class c extends e implements d {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f22187e;

    /* renamed from: c, reason: collision with root package name */
    public Context f22188c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f22189d;

    static {
        f22187e = Build.VERSION.SDK_INT < 29;
    }

    public c() {
        o oVar;
        int i5 = o.f22538g;
        Intrinsics.checkNotNullParameter("com.android.org.conscrypt", "packageName");
        try {
            Class<?> sslSocketClass = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            Intrinsics.checkNotNull(sslSocketClass, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
            Class<?> sslSocketFactoryClass = Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl");
            Intrinsics.checkNotNull(sslSocketFactoryClass, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
            Class<?> paramClass = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Intrinsics.checkNotNull(paramClass);
            Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
            Intrinsics.checkNotNullParameter(sslSocketFactoryClass, "sslSocketFactoryClass");
            Intrinsics.checkNotNullParameter(paramClass, "paramClass");
            oVar = new o(sslSocketClass);
        } catch (Exception e7) {
            CopyOnWriteArraySet copyOnWriteArraySet = rh.c.f22518a;
            String name = g0.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            rh.c.a(name, 5, "unable to load android socket classes", e7);
            oVar = null;
        }
        n[] elements = {oVar, new m(rh.e.f22521f), new m(k.f22534a), new m(h.f22532a)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList q = p.q(elements);
        ArrayList arrayList = new ArrayList();
        Iterator it = q.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((n) next).isSupported()) {
                arrayList.add(next);
            }
        }
        this.f22189d = arrayList;
    }

    @Override // qh.d
    public final void a(Context context) {
        this.f22188c = context;
    }

    @Override // qh.d
    public final Context b() {
        return this.f22188c;
    }

    @Override // qh.e
    public final y4.a c(X509TrustManager trustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        rh.b bVar = x509TrustManagerExtensions != null ? new rh.b(trustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : super.c(trustManager);
    }

    @Override // qh.e
    public final uh.d d(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            Intrinsics.checkNotNull(declaredMethod);
            return new b(trustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(trustManager);
        }
    }

    @Override // qh.e
    public final void e(SSLSocket sslSocket, String str, List protocols) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f22189d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((n) obj).b(sslSocket)) {
                    break;
                }
            }
        }
        n nVar = (n) obj;
        if (nVar != null) {
            nVar.c(sslSocket, str, protocols);
        }
    }

    @Override // qh.e
    public final void f(Socket socket, InetSocketAddress address, int i5) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        try {
            socket.connect(address, i5);
        } catch (ClassCastException e7) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e7;
            }
            throw new IOException("Exception in connect", e7);
        }
    }

    @Override // qh.e
    public final String g(SSLSocket sslSocket) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f22189d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((n) obj).b(sslSocket)) {
                break;
            }
        }
        n nVar = (n) obj;
        if (nVar != null) {
            return nVar.a(sslSocket);
        }
        return null;
    }

    @Override // qh.e
    public final boolean i(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return Build.VERSION.SDK_INT >= 24 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname) : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    @Override // qh.e
    public final void j(int i5, String message, Throwable th2) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (i5 == 5) {
            w0.n("OkHttp", message, th2);
        } else {
            Log.i("OkHttp", message, th2);
        }
    }

    @Override // qh.e
    public final SSLContext l() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.l();
    }
}
