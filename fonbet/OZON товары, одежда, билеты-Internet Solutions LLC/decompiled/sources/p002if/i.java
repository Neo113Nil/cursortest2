package p002if;

import We.F;
import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.openjsse.net.ssl.OpenJSSE;

/* loaded from: classes10.dex */
public final class i extends j {

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f66395e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f66396f = new a(0 == true ? 1 : 0);

    /* renamed from: d, reason: collision with root package name */
    private final Provider f66397d;

    public static final class a {
        private a() {
        }

        public static i a() {
            if (i.f66395e) {
                return new i(0);
            }
            return null;
        }

        public /* synthetic */ a(int i11) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z11 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, a.class.getClassLoader());
            z11 = true;
        } catch (ClassNotFoundException unused) {
        }
        f66395e = z11;
    }

    private i() {
        this.f66397d = new OpenJSSE();
    }

    @Override // p002if.j
    public final void e(@NotNull SSLSocket sslSocket, String str, @NotNull List<F> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        super.e(sslSocket, str, protocols);
    }

    @Override // p002if.j
    public final String g(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return null;
    }

    @Override // p002if.j
    @NotNull
    public final SSLContext m() {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f66397d);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "SSLContext.getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // p002if.j
    @NotNull
    public final X509TrustManager o() {
        TrustManagerFactory factory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f66397d);
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

    public /* synthetic */ i(int i11) {
        this();
    }
}
