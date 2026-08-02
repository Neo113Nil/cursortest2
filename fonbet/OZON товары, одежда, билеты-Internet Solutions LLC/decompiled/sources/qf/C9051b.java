package qf;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;

@IgnoreJRERequirement
/* renamed from: qf.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9051b extends X509ExtendedTrustManager {

    /* renamed from: a, reason: collision with root package name */
    private final X509ExtendedTrustManager f82063a;

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f82064b;

    public C9051b(@NotNull X509ExtendedTrustManager delegate, @NotNull List<String> insecureHosts) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(insecureHosts, "insecureHosts");
        this.f82063a = delegate;
        this.f82064b = insecureHosts;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] chain, String str) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        throw new CertificateException("Unsupported operation");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] chain, String authType) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(authType, "authType");
        throw new CertificateException("Unsupported operation");
    }

    @Override // javax.net.ssl.X509TrustManager
    @NotNull
    public final X509Certificate[] getAcceptedIssuers() {
        X509Certificate[] acceptedIssuers = this.f82063a.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "delegate.acceptedIssuers");
        return acceptedIssuers;
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] chain, String authType, Socket socket) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(authType, "authType");
        throw new CertificateException("Unsupported operation");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(@NotNull X509Certificate[] chain, @NotNull String authType, @NotNull Socket peerName) {
        String obj;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(authType, "authType");
        Intrinsics.checkNotNullParameter(peerName, "socket");
        byte[] bArr = Ye.b.f34900a;
        Intrinsics.checkNotNullParameter(peerName, "$this$peerName");
        SocketAddress remoteSocketAddress = peerName.getRemoteSocketAddress();
        if (remoteSocketAddress instanceof InetSocketAddress) {
            obj = ((InetSocketAddress) remoteSocketAddress).getHostName();
            Intrinsics.checkNotNullExpressionValue(obj, "address.hostName");
        } else {
            obj = remoteSocketAddress.toString();
        }
        if (this.f82064b.contains(obj)) {
            return;
        }
        this.f82063a.checkServerTrusted(chain, authType, peerName);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] chain, String authType, SSLEngine sSLEngine) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(authType, "authType");
        throw new CertificateException("Unsupported operation");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(@NotNull X509Certificate[] chain, @NotNull String authType, @NotNull SSLEngine engine) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(authType, "authType");
        Intrinsics.checkNotNullParameter(engine, "engine");
        if (this.f82064b.contains(engine.getPeerHost())) {
            return;
        }
        this.f82063a.checkServerTrusted(chain, authType, engine);
    }
}
