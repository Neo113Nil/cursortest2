package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public class soh {
    public p4d a;
    public String b;
    public int c;
    public Socket d;
    public boolean e = false;
    public InputStream f;
    public OutputStream g;

    public void b() {
        Socket socket = this.d;
        if (socket != null) {
            socket.close();
        }
    }

    public void c(p4d p4dVar, v5d v5dVar, long j) {
        this.a = p4dVar;
        vvd vvdVar = p4dVar.a;
        long j2 = j / 1000000;
        this.b = v5dVar.a.getHost();
        URI uri = v5dVar.a;
        this.c = uri.getPort();
        try {
            vvdVar.getClass();
            Socket socket = new Socket();
            socket.setTcpNoDelay(true);
            socket.setReceiveBufferSize(2097152);
            socket.setSendBufferSize(2097152);
            this.d = socket;
            this.d.connect(new InetSocketAddress(this.b, this.c), (int) j2);
            if (v5dVar.c) {
                if ("wss".equalsIgnoreCase(uri.getScheme())) {
                    d();
                }
                try {
                    Socket socket2 = this.d;
                    String str = this.b;
                    List list = Collections.EMPTY_LIST;
                    this.d = new m0l(socket2, str, uri.getPath());
                } catch (Exception e) {
                    this.d.close();
                    throw e;
                }
            }
            this.f = this.d.getInputStream();
            this.g = this.d.getOutputStream();
        } catch (Exception e2) {
            Socket socket3 = this.d;
            if (socket3 != null) {
                try {
                    socket3.close();
                } catch (Exception unused) {
                }
            }
            this.d = null;
            if (!(e2 instanceof IOException)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    public final void d() {
        vvd vvdVar = this.a.a;
        SSLSocketFactory socketFactory = vvdVar.d.getSocketFactory();
        Duration duration = vvdVar.i;
        SSLSocket sSLSocket = (SSLSocket) socketFactory.createSocket(this.d, this.b, this.c, true);
        sSLSocket.setUseClientMode(true);
        final CompletableFuture completableFuture = new CompletableFuture();
        HandshakeCompletedListener handshakeCompletedListener = new HandshakeCompletedListener() { // from class: roh
            @Override // javax.net.ssl.HandshakeCompletedListener
            public final void handshakeCompleted(HandshakeCompletedEvent handshakeCompletedEvent) {
                completableFuture.complete(null);
            }
        };
        sSLSocket.addHandshakeCompletedListener(handshakeCompletedListener);
        sSLSocket.startHandshake();
        try {
            try {
                completableFuture.get(duration.toNanos(), TimeUnit.NANOSECONDS);
                sSLSocket.removeHandshakeCompletedListener(handshakeCompletedListener);
                this.d = sSLSocket;
                this.f = sSLSocket.getInputStream();
                this.g = sSLSocket.getOutputStream();
                this.e = true;
            } catch (Exception e) {
                this.a.t(e);
                sSLSocket.removeHandshakeCompletedListener(handshakeCompletedListener);
            }
        } catch (Throwable th) {
            sSLSocket.removeHandshakeCompletedListener(handshakeCompletedListener);
            throw th;
        }
    }

    public void e(int i, byte[] bArr) {
        this.g.write(bArr, 0, i);
    }

    public void a(vvd vvdVar) {
    }
}
