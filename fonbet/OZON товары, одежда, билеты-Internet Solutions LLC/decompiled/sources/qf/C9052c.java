package qf;

import Sc.InterfaceC4008j;
import Sc.k;
import java.net.InetAddress;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import p002if.j;
import pf.C8916a;
import pf.C8917b;

/* renamed from: qf.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9052c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final char[] f82065a;

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC4008j f82066b;

    /* renamed from: qf.c$a */
    static final class a extends AbstractC7737t implements Function0<C8916a> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f82067b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final C8916a invoke() {
            C8917b.a aVar = new C8917b.a();
            aVar.c();
            InetAddress byName = InetAddress.getByName("localhost");
            Intrinsics.checkNotNullExpressionValue(byName, "InetAddress.getByName(\"localhost\")");
            String canonicalHostName = byName.getCanonicalHostName();
            Intrinsics.checkNotNullExpressionValue(canonicalHostName, "InetAddress.getByName(\"l…lhost\").canonicalHostName");
            aVar.a(canonicalHostName);
            C8917b b11 = aVar.b();
            C8916a.C1360a c1360a = new C8916a.C1360a();
            c1360a.d(b11, new X509Certificate[0]);
            c1360a.b(b11.a());
            return c1360a.c();
        }
    }

    static {
        char[] charArray = "password".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "(this as java.lang.String).toCharArray()");
        f82065a = charArray;
        f82066b = k.b(a.f82067b);
    }

    @NotNull
    public static final X509KeyManager a(C8917b c8917b, @NotNull X509Certificate... intermediates) {
        Intrinsics.checkNotNullParameter(intermediates, "intermediates");
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        char[] cArr = f82065a;
        keyStore.load(null, cArr);
        Intrinsics.checkNotNullExpressionValue(keyStore, "KeyStore.getInstance(key…utStream, password)\n    }");
        if (c8917b != null) {
            Certificate[] certificateArr = new Certificate[intermediates.length + 1];
            certificateArr[0] = c8917b.a();
            C7705l.u(intermediates, 0, certificateArr, 0, 12);
            keyStore.setKeyEntry("private", c8917b.b().getPrivate(), cArr, certificateArr);
        }
        KeyManagerFactory factory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        factory.init(keyStore, cArr);
        Intrinsics.checkNotNullExpressionValue(factory, "factory");
        KeyManager[] keyManagers = factory.getKeyManagers();
        Intrinsics.f(keyManagers);
        if (keyManagers.length == 1) {
            KeyManager keyManager = keyManagers[0];
            if (keyManager instanceof X509KeyManager) {
                if (keyManager != null) {
                    return (X509KeyManager) keyManager;
                }
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509KeyManager");
            }
        }
        StringBuilder sb2 = new StringBuilder("Unexpected key managers:");
        String arrays = Arrays.toString(keyManagers);
        Intrinsics.checkNotNullExpressionValue(arrays, "java.util.Arrays.toString(this)");
        sb2.append(arrays);
        throw new IllegalStateException(sb2.toString().toString());
    }

    @IgnoreJRERequirement
    @NotNull
    public static final X509TrustManager b(@NotNull ArrayList trustedCertificates, @NotNull List insecureHosts) {
        Intrinsics.checkNotNullParameter(trustedCertificates, "trustedCertificates");
        Intrinsics.checkNotNullParameter(insecureHosts, "insecureHosts");
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null, f82065a);
        Intrinsics.checkNotNullExpressionValue(keyStore, "KeyStore.getInstance(key…utStream, password)\n    }");
        int size = trustedCertificates.size();
        for (int i11 = 0; i11 < size; i11++) {
            keyStore.setCertificateEntry(Ej.b.a(i11, "cert_"), (Certificate) trustedCertificates.get(i11));
        }
        TrustManagerFactory factory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        factory.init(keyStore);
        Intrinsics.checkNotNullExpressionValue(factory, "factory");
        TrustManager[] trustManagers = factory.getTrustManagers();
        Intrinsics.f(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                if (trustManager == null) {
                    throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                }
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                if (insecureHosts.isEmpty()) {
                    return x509TrustManager;
                }
                j.f66400c.getClass();
                return j.a.c() ? new C9050a(x509TrustManager, insecureHosts) : new C9051b((X509ExtendedTrustManager) x509TrustManager, insecureHosts);
            }
        }
        StringBuilder sb2 = new StringBuilder("Unexpected trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(arrays, "java.util.Arrays.toString(this)");
        sb2.append(arrays);
        throw new IllegalStateException(sb2.toString().toString());
    }
}
