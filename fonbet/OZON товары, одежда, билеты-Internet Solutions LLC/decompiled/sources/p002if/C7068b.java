package p002if;

import We.F;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import jf.C7419d;
import jf.g;
import jf.h;
import jf.i;
import jf.j;
import jf.k;
import jf.l;
import jf.m;
import jf.n;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import lf.AbstractC7947c;
import lf.InterfaceC7949e;
import org.jetbrains.annotations.NotNull;
import p002if.j;

/* renamed from: if.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7068b extends j {

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f66372f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f66373g = new a();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f66374d;

    /* renamed from: e, reason: collision with root package name */
    private final j f66375e;

    /* renamed from: if.b$a */
    public static final class a {
        public static C7068b a() {
            if (C7068b.f66372f) {
                return new C7068b();
            }
            return null;
        }

        public static boolean b() {
            return C7068b.f66372f;
        }
    }

    /* renamed from: if.b$b, reason: collision with other inner class name */
    public static final class C1098b implements InterfaceC7949e {

        /* renamed from: a, reason: collision with root package name */
        private final X509TrustManager f66376a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f66377b;

        public C1098b(@NotNull X509TrustManager trustManager, @NotNull Method findByIssuerAndSignatureMethod) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f66376a = trustManager;
            this.f66377b = findByIssuerAndSignatureMethod;
        }

        @Override // lf.InterfaceC7949e
        public final X509Certificate a(@NotNull X509Certificate cert) {
            Intrinsics.checkNotNullParameter(cert, "cert");
            try {
                Object invoke = this.f66377b.invoke(this.f66376a, cert);
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e11) {
                throw new AssertionError("unable to get issues and signature", e11);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1098b)) {
                return false;
            }
            C1098b c1098b = (C1098b) obj;
            return Intrinsics.d(this.f66376a, c1098b.f66376a) && Intrinsics.d(this.f66377b, c1098b.f66377b);
        }

        public final int hashCode() {
            X509TrustManager x509TrustManager = this.f66376a;
            int hashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.f66377b;
            return hashCode + (method != null ? method.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f66376a + ", findByIssuerAndSignatureMethod=" + this.f66377b + ")";
        }
    }

    static {
        boolean z11 = false;
        j.f66400c.getClass();
        if (j.a.c() && Build.VERSION.SDK_INT < 30) {
            z11 = true;
        }
        f66372f = z11;
    }

    public C7068b() {
        j jVar;
        n nVar;
        g gVar;
        k.a aVar;
        i.a aVar2;
        Method method;
        Method method2;
        int i11 = n.f70000h;
        Intrinsics.checkNotNullParameter("com.android.org.conscrypt", "packageName");
        Method method3 = null;
        try {
            Class<?> sslSocketClass = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            Class<?> sslSocketFactoryClass = Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl");
            Class<?> paramClass = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Intrinsics.checkNotNullExpressionValue(paramClass, "paramsClass");
            Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
            Intrinsics.checkNotNullParameter(sslSocketFactoryClass, "sslSocketFactoryClass");
            Intrinsics.checkNotNullParameter(paramClass, "paramClass");
            nVar = new n(sslSocketClass);
        } catch (Exception e11) {
            j.f66400c.getClass();
            jVar = j.f66398a;
            jVar.getClass();
            j.j(5, "unable to load android socket classes", e11);
            nVar = null;
        }
        gVar = h.f69986f;
        l lVar = new l(gVar);
        aVar = k.f69997a;
        l lVar2 = new l(aVar);
        aVar2 = i.f69993a;
        m[] elements = {nVar, lVar, lVar2, new l(aVar2)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList B11 = C7705l.B(elements);
        ArrayList arrayList = new ArrayList();
        Iterator it = B11.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((m) next).b()) {
                arrayList.add(next);
            }
        }
        this.f66374d = arrayList;
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls.getMethod("get", new Class[0]);
            method2 = cls.getMethod("open", String.class);
            method = cls.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f66375e = new jf.j(method3, method2, method);
    }

    @Override // p002if.j
    @NotNull
    public final AbstractC7947c c(@NotNull X509TrustManager trustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        C7419d c7419d = x509TrustManagerExtensions != null ? new C7419d(trustManager, x509TrustManagerExtensions) : null;
        return c7419d != null ? c7419d : super.c(trustManager);
    }

    @Override // p002if.j
    @NotNull
    public final InterfaceC7949e d(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            Intrinsics.checkNotNullExpressionValue(method, "method");
            method.setAccessible(true);
            return new C1098b(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.d(trustManager);
        }
    }

    @Override // p002if.j
    public final void e(@NotNull SSLSocket sslSocket, String str, @NotNull List<F> protocols) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f66374d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((m) obj).a(sslSocket)) {
                    break;
                }
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            mVar.d(sslSocket, str, protocols);
        }
    }

    @Override // p002if.j
    public final void f(@NotNull Socket socket, @NotNull InetSocketAddress address, int i11) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        try {
            socket.connect(address, i11);
        } catch (ClassCastException e11) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e11;
            }
            throw new IOException("Exception in connect", e11);
        }
    }

    @Override // p002if.j
    public final String g(@NotNull SSLSocket sslSocket) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f66374d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((m) obj).a(sslSocket)) {
                break;
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            return mVar.c(sslSocket);
        }
        return null;
    }

    @Override // p002if.j
    public final Object h() {
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        return this.f66375e.a();
    }

    @Override // p002if.j
    public final boolean i(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // p002if.j
    public final void l(Object obj, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.f66375e.b(obj)) {
            return;
        }
        j.k(this, message, 4);
    }
}
