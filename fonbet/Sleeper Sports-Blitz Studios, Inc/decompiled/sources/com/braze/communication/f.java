package com.braze.communication;

import com.braze.support.BrazeLogger;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class f extends SSLSocketFactory {

    /* renamed from: a, reason: collision with root package name */
    public final SSLSocketFactory f484a;

    public f() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, null, null);
        this.f484a = sSLContext.getSocketFactory();
    }

    public final Socket a(Socket socket) {
        if (socket instanceof SSLSocket) {
            final ArrayList arrayList = new ArrayList();
            SSLSocket sSLSocket = (SSLSocket) socket;
            Iterator it = ArrayIteratorKt.iterator(sSLSocket.getSupportedProtocols());
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!Intrinsics.areEqual(str, "SSLv3")) {
                    Intrinsics.checkNotNull(str);
                    arrayList.add(str);
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.communication.f$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f.a(arrayList);
                }
            }, 6, (Object) null);
            sSLSocket.setEnabledProtocols((String[]) arrayList.toArray(new String[0]));
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        Socket createSocket = this.f484a.createSocket();
        Intrinsics.checkNotNullExpressionValue(createSocket, "createSocket(...)");
        return a(createSocket);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.f484a.getDefaultCipherSuites();
        Intrinsics.checkNotNullExpressionValue(defaultCipherSuites, "getDefaultCipherSuites(...)");
        return defaultCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.f484a.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "getSupportedCipherSuites(...)");
        return supportedCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String host, int i, boolean z) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(host, "host");
        Socket createSocket = this.f484a.createSocket(socket, host, i, z);
        Intrinsics.checkNotNullExpressionValue(createSocket, "createSocket(...)");
        return a(createSocket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String host, int i) {
        Intrinsics.checkNotNullParameter(host, "host");
        Socket createSocket = this.f484a.createSocket(host, i);
        Intrinsics.checkNotNullExpressionValue(createSocket, "createSocket(...)");
        return a(createSocket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String host, int i, InetAddress localHost, int i2) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(localHost, "localHost");
        Socket createSocket = this.f484a.createSocket(host, i, localHost, i2);
        Intrinsics.checkNotNullExpressionValue(createSocket, "createSocket(...)");
        return a(createSocket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress host, int i) {
        Intrinsics.checkNotNullParameter(host, "host");
        Socket createSocket = this.f484a.createSocket(host, i);
        Intrinsics.checkNotNullExpressionValue(createSocket, "createSocket(...)");
        return a(createSocket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress address, int i, InetAddress localAddress, int i2) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(localAddress, "localAddress");
        Socket createSocket = this.f484a.createSocket(address, i, localAddress, i2);
        Intrinsics.checkNotNullExpressionValue(createSocket, "createSocket(...)");
        return a(createSocket);
    }

    public static final String a(List list) {
        return "Enabling SSL protocols: " + list;
    }
}
