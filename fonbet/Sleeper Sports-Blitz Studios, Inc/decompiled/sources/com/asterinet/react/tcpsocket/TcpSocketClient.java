package com.asterinet.react.tcpsocket;

import android.content.Context;
import android.net.Network;
import com.facebook.react.bridge.ReadableMap;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes6.dex */
class TcpSocketClient extends TcpSocket {
    private boolean closed;
    private final ExecutorService listenExecutor;
    private final TcpEventListener receiverListener;
    private TcpReceiverTask receiverTask;
    private Socket socket;
    private final ExecutorService writeExecutor;

    TcpSocketClient(TcpEventListener tcpEventListener, Integer num, Socket socket) {
        super(num.intValue());
        this.closed = true;
        this.listenExecutor = Executors.newSingleThreadExecutor();
        this.writeExecutor = Executors.newSingleThreadExecutor();
        this.socket = socket;
        this.receiverListener = tcpEventListener;
    }

    public Socket getSocket() {
        return this.socket;
    }

    public void connect(Context context, String str, Integer num, ReadableMap readableMap, Network network, ReadableMap readableMap2) throws IOException, GeneralSecurityException {
        if (this.socket != null) {
            throw new IOException("Already connected");
        }
        if (readableMap2 != null) {
            Socket createSocket = getSSLSocketFactory(context, readableMap2).createSocket();
            this.socket = createSocket;
            ((SSLSocket) createSocket).setUseClientMode(true);
        } else {
            this.socket = new Socket();
        }
        InetAddress byName = InetAddress.getByName(readableMap.hasKey("localAddress") ? readableMap.getString("localAddress") : "0.0.0.0");
        InetAddress byName2 = InetAddress.getByName(str);
        if (network != null) {
            network.bindSocket(this.socket);
        }
        if (readableMap.hasKey("reuseAddress")) {
            this.socket.setReuseAddress(readableMap.getBoolean("reuseAddress"));
        } else {
            this.socket.setReuseAddress(true);
        }
        this.socket.bind(new InetSocketAddress(byName, readableMap.hasKey("localPort") ? readableMap.getInt("localPort") : 0));
        this.socket.connect(new InetSocketAddress(byName2, num.intValue()));
        Socket socket = this.socket;
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).startHandshake();
        }
        startListening();
    }

    public void startTLS(Context context, ReadableMap readableMap) throws IOException, GeneralSecurityException {
        if (this.socket instanceof SSLSocket) {
            return;
        }
        SSLSocketFactory sSLSocketFactory = getSSLSocketFactory(context, readableMap);
        Socket socket = this.socket;
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, socket.getInetAddress().getHostAddress(), this.socket.getPort(), true);
        sSLSocket.setUseClientMode(true);
        sSLSocket.startHandshake();
        this.socket = sSLSocket;
    }

    private SSLSocketFactory getSSLSocketFactory(Context context, ReadableMap readableMap) throws GeneralSecurityException, IOException {
        if (readableMap.hasKey("rejectUnauthorized") && !readableMap.getBoolean("rejectUnauthorized")) {
            return SSLCertificateHelper.createBlindSocketFactory();
        }
        String string = readableMap.hasKey("ca") ? readableMap.getString("ca") : null;
        return string != null ? SSLCertificateHelper.createCustomTrustedSocketFactory(context, string) : (SSLSocketFactory) SSLSocketFactory.getDefault();
    }

    public void startListening() {
        TcpReceiverTask tcpReceiverTask = new TcpReceiverTask(this, this.receiverListener);
        this.receiverTask = tcpReceiverTask;
        this.listenExecutor.execute(tcpReceiverTask);
    }

    public void write(final int i, final byte[] bArr) {
        this.writeExecutor.execute(new Runnable() { // from class: com.asterinet.react.tcpsocket.TcpSocketClient.1
            @Override // java.lang.Runnable
            public void run() {
                if (TcpSocketClient.this.socket == null) {
                    TcpSocketClient.this.receiverListener.onError(TcpSocketClient.this.getId(), new IOException("Attempted to write to closed socket"));
                    return;
                }
                try {
                    TcpSocketClient.this.socket.getOutputStream().write(bArr);
                    TcpSocketClient.this.receiverListener.onWritten(TcpSocketClient.this.getId(), i, null);
                } catch (IOException e) {
                    TcpSocketClient.this.receiverListener.onWritten(TcpSocketClient.this.getId(), i, e);
                    TcpSocketClient.this.receiverListener.onError(TcpSocketClient.this.getId(), e);
                }
            }
        });
    }

    public void destroy() {
        try {
            Socket socket = this.socket;
            if (socket == null || socket.isClosed()) {
                return;
            }
            this.closed = true;
            this.socket.close();
            this.receiverListener.onClose(getId(), null);
            this.socket = null;
        } catch (IOException e) {
            this.receiverListener.onClose(getId(), e);
        }
    }

    public void setNoDelay(boolean z) throws IOException {
        Socket socket = this.socket;
        if (socket == null) {
            throw new IOException("Socket is not connected.");
        }
        socket.setTcpNoDelay(z);
    }

    public void setKeepAlive(boolean z, int i) throws IOException {
        Socket socket = this.socket;
        if (socket == null) {
            throw new IOException("Socket is not connected.");
        }
        socket.setKeepAlive(z);
    }

    public void pause() {
        this.receiverTask.pause();
    }

    public void resume() {
        this.receiverTask.resume();
    }

    private static class TcpReceiverTask implements Runnable {
        private final TcpSocketClient clientSocket;
        private boolean paused = false;
        private final TcpEventListener receiverListener;

        public TcpReceiverTask(TcpSocketClient tcpSocketClient, TcpEventListener tcpEventListener) {
            this.clientSocket = tcpSocketClient;
            this.receiverListener = tcpEventListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            int id = this.clientSocket.getId();
            Socket socket = this.clientSocket.getSocket();
            byte[] bArr = new byte[16384];
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
                while (!socket.isClosed()) {
                    int read = bufferedInputStream.read(bArr);
                    waitIfPaused();
                    if (read > 0) {
                        this.receiverListener.onData(id, Arrays.copyOfRange(bArr, 0, read));
                    } else if (read == -1) {
                        this.clientSocket.destroy();
                    }
                }
            } catch (IOException | InterruptedException e) {
                if (this.receiverListener == null || socket.isClosed() || this.clientSocket.closed) {
                    return;
                }
                this.receiverListener.onError(id, e);
            }
        }

        public synchronized void pause() {
            this.paused = true;
        }

        public synchronized void resume() {
            this.paused = false;
            notify();
        }

        private synchronized void waitIfPaused() throws InterruptedException {
            while (this.paused) {
                wait();
            }
        }
    }
}
