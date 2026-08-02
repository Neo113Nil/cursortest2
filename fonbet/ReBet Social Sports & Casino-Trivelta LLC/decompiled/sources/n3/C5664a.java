package n3;

import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyStore;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: n3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5664a extends SSLSocketFactory {

    /* renamed from: a, reason: collision with root package name */
    public SSLSocketFactory f57001a;

    /* renamed from: b, reason: collision with root package name */
    public X509TrustManager f57002b;

    public C5664a() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        sSLContext.init(null, trustManagers, null);
        for (TrustManager trustManager : trustManagers) {
            if (trustManager instanceof X509TrustManager) {
                this.f57002b = (X509TrustManager) trustManager;
            }
        }
        this.f57001a = sSLContext.getSocketFactory();
    }

    public final Socket a(Socket socket) {
        if (socket != null && (socket instanceof SSLSocket)) {
            ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1.2"});
        }
        return socket;
    }

    public X509TrustManager b() {
        return this.f57002b;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i10, boolean z10) {
        return a(this.f57001a.createSocket(socket, str, i10, z10));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.f57001a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.f57001a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10) {
        return a(this.f57001a.createSocket(str, i10));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) {
        return a(this.f57001a.createSocket(str, i10, inetAddress, i11));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10) {
        return a(this.f57001a.createSocket(inetAddress, i10));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) {
        return a(this.f57001a.createSocket(inetAddress, i10, inetAddress2, i11));
    }
}
