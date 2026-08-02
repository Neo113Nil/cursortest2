package p002if;

import U7.d;
import We.E;
import We.F;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Provider;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import jf.C7420e;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import lf.AbstractC7947c;
import lf.C7945a;
import lf.C7946b;
import lf.InterfaceC7949e;
import org.jetbrains.annotations.NotNull;
import p002if.C7068b;
import p002if.C7069c;
import p002if.C7070d;
import p002if.e;
import p002if.h;
import p002if.i;
import sf.C9681g;

/* loaded from: classes6.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static volatile j f66398a;

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f66399b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f66400c = new a();

    public static final class a {
        @NotNull
        public static ArrayList a(@NotNull List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((F) obj) != F.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((F) it.next()).toString());
            }
            return arrayList2;
        }

        @NotNull
        public static byte[] b(@NotNull List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            C9681g c9681g = new C9681g();
            Iterator it = a(protocols).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                c9681g.d0(str.length());
                c9681g.H0(str);
            }
            return c9681g.g0();
        }

        public static boolean c() {
            return "Dalvik".equals(System.getProperty("java.vm.name"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if (r0 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        if (r0 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        if (r0 != null) goto L33;
     */
    static {
        j a11;
        boolean z11;
        if (a.c()) {
            C7420e.b();
            C7067a.f66370f.getClass();
            z11 = C7067a.f66369e;
            a11 = z11 ? new C7067a() : null;
            if (a11 == null) {
                C7068b.f66373g.getClass();
                a11 = C7068b.a.a();
                Intrinsics.f(a11);
            }
        } else {
            Provider provider = Security.getProviders()[0];
            Intrinsics.checkNotNullExpressionValue(provider, "Security.getProviders()[0]");
            if ("Conscrypt".equals(provider.getName())) {
                C7070d.f66382f.getClass();
                a11 = C7070d.a.b();
            }
            Provider provider2 = Security.getProviders()[0];
            Intrinsics.checkNotNullExpressionValue(provider2, "Security.getProviders()[0]");
            if ("BC".equals(provider2.getName())) {
                C7069c.f66379f.getClass();
                a11 = C7069c.a.a();
            }
            Provider provider3 = Security.getProviders()[0];
            Intrinsics.checkNotNullExpressionValue(provider3, "Security.getProviders()[0]");
            if ("OpenJSSE".equals(provider3.getName())) {
                i.f66396f.getClass();
                a11 = i.a.a();
            }
            h.f66394e.getClass();
            a11 = h.a.a();
            if (a11 == null && (a11 = e.b.a()) == null) {
                a11 = new j();
            }
        }
        f66398a = a11;
        f66399b = Logger.getLogger(E.class.getName());
    }

    public static void j(int i11, @NotNull String message, Throwable th2) {
        Intrinsics.checkNotNullParameter(message, "message");
        f66399b.log(i11 == 5 ? Level.WARNING : Level.INFO, message, th2);
    }

    public static /* synthetic */ void k(j jVar, String str, int i11) {
        int i12 = (i11 & 2) != 0 ? 4 : 5;
        jVar.getClass();
        j(i12, str, null);
    }

    public void b(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
    }

    @NotNull
    public AbstractC7947c c(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        return new C7945a(d(trustManager));
    }

    @NotNull
    public InterfaceC7949e d(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C7946b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(@NotNull SSLSocket sslSocket, String str, @NotNull List<F> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
    }

    public void f(@NotNull Socket socket, @NotNull InetSocketAddress address, int i11) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        socket.connect(address, i11);
    }

    public String g(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return null;
    }

    public Object h() {
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        if (f66399b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean i(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return true;
    }

    public void l(Object obj, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (obj == null) {
            message = d.e(message, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        j(5, message, (Throwable) obj);
    }

    @NotNull
    public SSLContext m() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Intrinsics.checkNotNullExpressionValue(sSLContext, "SSLContext.getInstance(\"TLS\")");
        return sSLContext;
    }

    @NotNull
    public SSLSocketFactory n(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            SSLContext m11 = m();
            m11.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = m11.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e11) {
            throw new AssertionError("No System TLS: " + e11, e11);
        }
    }

    @NotNull
    public X509TrustManager o() {
        TrustManagerFactory factory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        factory.init((KeyStore) null);
        Intrinsics.checkNotNullExpressionValue(factory, "factory");
        TrustManager[] trustManagers = factory.getTrustManagers();
        Intrinsics.f(trustManagers);
        if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        StringBuilder sb2 = new StringBuilder("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(arrays, "java.util.Arrays.toString(this)");
        sb2.append(arrays);
        throw new IllegalStateException(sb2.toString().toString());
    }

    @NotNull
    public final String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
