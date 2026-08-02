package com.asterinet.react.tcpsocket;

import android.content.Context;
import com.facebook.react.bridge.ReadableMap;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.jacoco.core.runtime.AgentOptions;

/* loaded from: classes6.dex */
public final class TcpSocketServer extends TcpSocket {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private int clientSocketIds;
    private final boolean isTLS;
    private final ExecutorService listenExecutor;
    private final TcpEventListener mReceiverListener;
    private ServerSocket serverSocket;
    private final ConcurrentHashMap<Integer, TcpSocket> socketClients;

    public TcpSocketServer(Context context, ConcurrentHashMap<Integer, TcpSocket> concurrentHashMap, TcpEventListener tcpEventListener, Integer num, ReadableMap readableMap) throws IOException, GeneralSecurityException {
        super(num.intValue());
        this.listenExecutor = Executors.newSingleThreadExecutor();
        int i = readableMap.getInt(AgentOptions.PORT);
        String string = readableMap.getString("host");
        this.socketClients = concurrentHashMap;
        this.clientSocketIds = (getId() + 1) * 1000;
        InetAddress byName = InetAddress.getByName(string);
        ReadableMap map = readableMap.getMap("tls");
        if (map != null) {
            this.serverSocket = SSLCertificateHelper.createServerSocketFactory(context, map.getString("keystore")).createServerSocket(i, 50, byName);
            this.isTLS = true;
        } else {
            this.serverSocket = new ServerSocket(i, 50, byName);
            this.isTLS = false;
        }
        try {
            this.serverSocket.setReuseAddress(readableMap.getBoolean("reuseAddress"));
        } catch (Exception unused) {
            this.serverSocket.setReuseAddress(true);
        }
        this.mReceiverListener = tcpEventListener;
        listen();
    }

    public ServerSocket getServerSocket() {
        return this.serverSocket;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addClient(Socket socket) {
        int clientId = getClientId();
        TcpSocketClient tcpSocketClient = new TcpSocketClient(this.mReceiverListener, Integer.valueOf(clientId), socket);
        this.socketClients.put(Integer.valueOf(clientId), tcpSocketClient);
        if (this.isTLS) {
            this.mReceiverListener.onSecureConnection(getId(), clientId, socket);
        } else {
            this.mReceiverListener.onConnection(getId(), clientId, socket);
        }
        tcpSocketClient.startListening();
    }

    private int getClientId() {
        int i = this.clientSocketIds;
        this.clientSocketIds = i + 1;
        return i;
    }

    private void listen() {
        this.listenExecutor.execute(new TcpListenTask(this.mReceiverListener));
    }

    public void close() {
        try {
            ServerSocket serverSocket = this.serverSocket;
            if (serverSocket == null || serverSocket.isClosed()) {
                return;
            }
            this.serverSocket.close();
            this.mReceiverListener.onClose(getId(), null);
            this.serverSocket = null;
        } catch (IOException e) {
            this.mReceiverListener.onClose(getId(), e);
        }
    }

    private static class TcpListenTask implements Runnable {
        private final TcpEventListener receiverListener;
        private final TcpSocketServer server;

        private TcpListenTask(TcpSocketServer tcpSocketServer, TcpEventListener tcpEventListener) {
            this.server = tcpSocketServer;
            this.receiverListener = tcpEventListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            ServerSocket serverSocket = this.server.getServerSocket();
            while (!serverSocket.isClosed()) {
                try {
                    this.server.addClient(serverSocket.accept());
                } catch (IOException e) {
                    if (serverSocket.isClosed()) {
                        return;
                    }
                    this.receiverListener.onError(this.server.getId(), e);
                    return;
                }
            }
        }
    }
}
