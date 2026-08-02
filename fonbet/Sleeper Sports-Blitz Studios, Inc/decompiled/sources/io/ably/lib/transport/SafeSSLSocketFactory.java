package io.ably.lib.transport;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes9.dex */
public class SafeSSLSocketFactory extends SSLSocketFactory {
    private final String[] SAFE_PROTOCOLS = {"TLSv1.2", "TLSv1.3"};
    private final SSLSocketFactory factory;

    public SafeSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.factory = sSLSocketFactory;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.factory.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.factory.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        return getSocketWithOnlySafeProtocolsEnabled(this.factory.createSocket());
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return getSocketWithOnlySafeProtocolsEnabled(this.factory.createSocket(socket, str, i, z));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException, UnknownHostException {
        return getSocketWithOnlySafeProtocolsEnabled(this.factory.createSocket(str, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        return getSocketWithOnlySafeProtocolsEnabled(this.factory.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return getSocketWithOnlySafeProtocolsEnabled(this.factory.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return getSocketWithOnlySafeProtocolsEnabled(this.factory.createSocket(inetAddress, i, inetAddress2, i2));
    }

    private Socket getSocketWithOnlySafeProtocolsEnabled(Socket socket) {
        if (!(socket instanceof SSLSocket)) {
            throw new IllegalArgumentException("The socket is not an instance of the SSL socket");
        }
        SSLSocket sSLSocket = (SSLSocket) socket;
        HashSet hashSet = new HashSet(Arrays.asList(sSLSocket.getSupportedProtocols()));
        ArrayList arrayList = new ArrayList();
        for (String str : this.SAFE_PROTOCOLS) {
            if (hashSet.contains(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            throw new SecurityException("No safe protocol version is supported for this SSL socket");
        }
        sSLSocket.setEnabledProtocols((String[]) arrayList.toArray(new String[0]));
        return sSLSocket;
    }
}
