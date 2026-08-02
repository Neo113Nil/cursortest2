package bo.app;

import bo.app.nf;
import com.braze.support.BrazeLogger;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nf extends SSLSocketFactory {

    /* renamed from: a, reason: collision with root package name */
    public final SSLSocketFactory f25836a;

    public nf() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, null, null);
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "getSocketFactory(...)");
        this.f25836a = socketFactory;
    }

    public final Socket a(Socket socket) {
        if (socket instanceof SSLSocket) {
            final ArrayList arrayList = new ArrayList();
            SSLSocket sSLSocket = (SSLSocket) socket;
            String[] supportedProtocols = sSLSocket.getSupportedProtocols();
            Intrinsics.checkNotNullExpressionValue(supportedProtocols, "getSupportedProtocols(...)");
            for (String str : supportedProtocols) {
                if (!Intrinsics.areEqual(str, "SSLv3")) {
                    Intrinsics.checkNotNull(str);
                    arrayList.add(str);
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.U6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return nf.a(arrayList);
                }
            }, 6, (Object) null);
            sSLSocket.setEnabledProtocols((String[]) arrayList.toArray(new String[0]));
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        Socket createSocket = this.f25836a.createSocket();
        Intrinsics.checkNotNullExpressionValue(createSocket, "createSocket(...)");
        return a(createSocket);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.f25836a.getDefaultCipherSuites();
        Intrinsics.checkNotNullExpressionValue(defaultCipherSuites, "getDefaultCipherSuites(...)");
        return defaultCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.f25836a.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "getSupportedCipherSuites(...)");
        return supportedCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String host, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(host, "host");
        Socket createSocket = this.f25836a.createSocket(socket, host, i10, z10);
        Intrinsics.checkNotNullExpressionValue(createSocket, "createSocket(...)");
        return a(createSocket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String host, int i10) {
        Intrinsics.checkNotNullParameter(host, "host");
        Socket createSocket = this.f25836a.createSocket(host, i10);
        Intrinsics.checkNotNullExpressionValue(createSocket, "createSocket(...)");
        return a(createSocket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String host, int i10, InetAddress localHost, int i11) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(localHost, "localHost");
        Socket createSocket = this.f25836a.createSocket(host, i10, localHost, i11);
        Intrinsics.checkNotNullExpressionValue(createSocket, "createSocket(...)");
        return a(createSocket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress host, int i10) {
        Intrinsics.checkNotNullParameter(host, "host");
        Socket createSocket = this.f25836a.createSocket(host, i10);
        Intrinsics.checkNotNullExpressionValue(createSocket, "createSocket(...)");
        return a(createSocket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress address, int i10, InetAddress localAddress, int i11) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(localAddress, "localAddress");
        Socket createSocket = this.f25836a.createSocket(address, i10, localAddress, i11);
        Intrinsics.checkNotNullExpressionValue(createSocket, "createSocket(...)");
        return a(createSocket);
    }

    public static final String a(List list) {
        return "Enabling SSL protocols: " + list;
    }
}
