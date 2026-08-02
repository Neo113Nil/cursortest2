package p002if;

import We.F;
import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
import org.jetbrains.annotations.NotNull;
import p002if.j;

/* renamed from: if.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7070d extends j {

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f66381e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f66382f;

    /* renamed from: d, reason: collision with root package name */
    private final Provider f66383d;

    /* renamed from: if.d$a */
    public static final class a {
        private a() {
        }

        public static boolean a() {
            Conscrypt.Version version = Conscrypt.version();
            if (version.major() != 2) {
                if (version.major() <= 2) {
                    return false;
                }
            } else if (version.minor() != 1) {
                if (version.minor() <= 1) {
                    return false;
                }
            } else if (version.patch() < 0) {
                return false;
            }
            return true;
        }

        public static C7070d b() {
            if (C7070d.f66381e) {
                return new C7070d(0);
            }
            return null;
        }

        public static boolean c() {
            return C7070d.f66381e;
        }

        public /* synthetic */ a(int i11) {
            this();
        }
    }

    /* renamed from: if.d$b */
    public static final class b implements ConscryptHostnameVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f66384a = new b();
    }

    static {
        boolean z11 = false;
        z11 = false;
        z11 = false;
        f66382f = new a(z11 ? 1 : 0);
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, a.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (a.a()) {
                    z11 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f66381e = z11;
    }

    private C7070d() {
        Provider newProvider = Conscrypt.newProvider();
        Intrinsics.checkNotNullExpressionValue(newProvider, "Conscrypt.newProvider()");
        this.f66383d = newProvider;
    }

    @Override // p002if.j
    public final void e(@NotNull SSLSocket sslSocket, String str, @NotNull List<F> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (!Conscrypt.isConscrypt(sslSocket)) {
            super.e(sslSocket, str, protocols);
            return;
        }
        Conscrypt.setUseSessionTickets(sslSocket, true);
        j.f66400c.getClass();
        Object[] array = j.a.a(protocols).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
    }

    @Override // p002if.j
    public final String g(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (Conscrypt.isConscrypt(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return null;
    }

    @Override // p002if.j
    @NotNull
    public final SSLContext m() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f66383d);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // p002if.j
    @NotNull
    public final SSLSocketFactory n(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        SSLContext m11 = m();
        m11.init(null, new TrustManager[]{trustManager}, null);
        SSLSocketFactory socketFactory = m11.getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // p002if.j
    @NotNull
    public final X509TrustManager o() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        Intrinsics.checkNotNullExpressionValue(trustManagerFactory, "TrustManagerFactory.getI…(null as KeyStore?)\n    }");
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.f(trustManagers);
        if (!(trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager))) {
            StringBuilder sb2 = new StringBuilder("Unexpected default trust managers: ");
            String arrays = Arrays.toString(trustManagers);
            Intrinsics.checkNotNullExpressionValue(arrays, "java.util.Arrays.toString(this)");
            sb2.append(arrays);
            throw new IllegalStateException(sb2.toString().toString());
        }
        TrustManager trustManager = trustManagers[0];
        if (trustManager == null) {
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
        Conscrypt.setHostnameVerifier(x509TrustManager, b.f66384a);
        return x509TrustManager;
    }

    public /* synthetic */ C7070d(int i11) {
        this();
    }
}
