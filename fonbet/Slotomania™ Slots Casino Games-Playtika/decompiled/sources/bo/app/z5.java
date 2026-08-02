package bo.app;

import com.braze.Constants;
import com.braze.support.BrazeLogger;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0004\b\t\u0010\bJ\b\u0010\n\u001a\u00020\u0002H\u0016J(\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016J(\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0016J(\u0010\n\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\fH\u0016¨\u0006\u0017"}, d2 = {"Lbo/app/z5;", "Ljavax/net/ssl/SSLSocketFactory;", "Ljava/net/Socket;", "socket", Constants.BRAZE_PUSH_CONTENT_KEY, "", "", "getDefaultCipherSuites", "()[Ljava/lang/String;", "getSupportedCipherSuites", "createSocket", "host", "", "port", "", "autoClose", "Ljava/net/InetAddress;", "localHost", "localPort", "address", "localAddress", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class z5 extends SSLSocketFactory {
    public static final a b = new a(null);
    private SSLSocketFactory a;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lbo/app/z5$a;", "", "", "SSL_V3_PROTOCOL", "Ljava/lang/String;", "TLS_PROTOCOL", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        final /* synthetic */ List<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<String> list) {
            super(0);
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Enabling SSL protocols: ", this.b);
        }
    }

    public z5() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, null, null);
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "sslContext.socketFactory");
        this.a = socketFactory;
    }

    private final Socket a(Socket socket) {
        if (!(socket instanceof SSLSocket)) {
            return socket;
        }
        ArrayList arrayList = new ArrayList();
        SSLSocket sSLSocket = (SSLSocket) socket;
        String[] supportedProtocols = sSLSocket.getSupportedProtocols();
        Intrinsics.checkNotNullExpressionValue(supportedProtocols, "socket.supportedProtocols");
        int length = supportedProtocols.length;
        int i = 0;
        while (i < length) {
            String protocol = supportedProtocols[i];
            i++;
            if (!Intrinsics.areEqual(protocol, "SSLv3")) {
                Intrinsics.checkNotNullExpressionValue(protocol, "protocol");
                arrayList.add(protocol);
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new b(arrayList), 2, (Object) null);
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        sSLSocket.setEnabledProtocols((String[]) array);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        Socket createSocket = this.a.createSocket();
        Intrinsics.checkNotNullExpressionValue(createSocket, "internalSSLSocketFactory.createSocket()");
        return a(createSocket);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.a.getDefaultCipherSuites();
        Intrinsics.checkNotNullExpressionValue(defaultCipherSuites, "internalSSLSocketFactory.defaultCipherSuites");
        return defaultCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.a.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "internalSSLSocketFactory.supportedCipherSuites");
        return supportedCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String host, int port, boolean autoClose) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(host, "host");
        Socket createSocket = this.a.createSocket(socket, host, port, autoClose);
        Intrinsics.checkNotNullExpressionValue(createSocket, "internalSSLSocketFactory…t, host, port, autoClose)");
        return a(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String host, int port) {
        Intrinsics.checkNotNullParameter(host, "host");
        Socket createSocket = this.a.createSocket(host, port);
        Intrinsics.checkNotNullExpressionValue(createSocket, "internalSSLSocketFactory.createSocket(host, port)");
        return a(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String host, int port, InetAddress localHost, int localPort) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(localHost, "localHost");
        Socket createSocket = this.a.createSocket(host, port, localHost, localPort);
        Intrinsics.checkNotNullExpressionValue(createSocket, "internalSSLSocketFactory…rt, localHost, localPort)");
        return a(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress host, int port) {
        Intrinsics.checkNotNullParameter(host, "host");
        Socket createSocket = this.a.createSocket(host, port);
        Intrinsics.checkNotNullExpressionValue(createSocket, "internalSSLSocketFactory.createSocket(host, port)");
        return a(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress address, int port, InetAddress localAddress, int localPort) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(localAddress, "localAddress");
        Socket createSocket = this.a.createSocket(address, port, localAddress, localPort);
        Intrinsics.checkNotNullExpressionValue(createSocket, "internalSSLSocketFactory… localAddress, localPort)");
        return a(createSocket);
    }
}
