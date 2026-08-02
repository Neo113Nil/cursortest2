package io.intercom.android.sdk.api;

import android.net.TrafficStats;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.net.SocketFactory;

/* loaded from: classes9.dex */
public class TaggingSocketFactory extends SocketFactory {
    private final SocketFactory defaultFactory;
    private final int threadStatsTag;

    public TaggingSocketFactory(SocketFactory socketFactory, int i) {
        this.defaultFactory = socketFactory;
        this.threadStatsTag = i;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        return withTag(this.defaultFactory.createSocket());
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException, UnknownHostException {
        return withTag(this.defaultFactory.createSocket(str, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        return withTag(this.defaultFactory.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return withTag(this.defaultFactory.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return withTag(this.defaultFactory.createSocket(inetAddress, i, inetAddress2, i2));
    }

    private Socket withTag(Socket socket) throws IOException {
        TrafficStats.setThreadStatsTag(this.threadStatsTag);
        return socket;
    }
}
