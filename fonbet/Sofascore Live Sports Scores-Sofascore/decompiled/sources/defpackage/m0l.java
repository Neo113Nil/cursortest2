package defpackage;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m0l extends Socket {
    public final Socket a;
    public final n1l b;
    public final o1l c;
    public final ReentrantLock d;

    public m0l(Socket socket, String str, String str2) {
        List list = Collections.EMPTY_LIST;
        this.d = new ReentrantLock();
        this.a = socket;
        str2 = (str2 == null || str2.isEmpty()) ? "/" : str2;
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        wj9 wj9Var = new wj9(0);
        wj9Var.b = str2;
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        int[] iArr = ln5.a;
        String encodeToString = Base64.getEncoder().encodeToString(bArr);
        p89 p89Var = (p89) wj9Var.c;
        p89Var.a("Host", str);
        p89Var.a("Upgrade", "websocket");
        p89Var.a("Connection", "Upgrade");
        p89Var.a("Sec-WebSocket-Key", encodeToString);
        p89Var.a("Sec-WebSocket-Protocol", "nats");
        p89Var.a("Sec-WebSocket-Version", "13");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).accept(wj9Var);
        }
        outputStream.write(wj9Var.toString().getBytes(StandardCharsets.UTF_8));
        byte[] bArr2 = new byte[8192];
        String e = e(inputStream, bArr2);
        if (e == null) {
            a70.r("Expected HTTP response line not to exceed 8192");
            throw null;
        }
        if (!e.toLowerCase().startsWith("HTTP/1.1 101 Switching Protocols".toLowerCase())) {
            a70.r("Expected HTTP/1.1 101 Switching Protocols, but got ".concat(e));
            throw null;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String e2 = e(inputStream, bArr2);
            if (e2 == null) {
                a70.r("Expected HTTP header to not exceed 8192");
                throw null;
            }
            if ("".equals(e2)) {
                if (!"websocket".equalsIgnoreCase((String) hashMap.get("upgrade"))) {
                    a70.r("Expected HTTP `Upgrade: websocket` header");
                    throw null;
                }
                if (!"upgrade".equalsIgnoreCase((String) hashMap.get("connection"))) {
                    a70.r("Expected HTTP `Connection: Upgrade` header");
                    throw null;
                }
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
                    Charset charset = StandardCharsets.UTF_8;
                    messageDigest.update(encodeToString.getBytes(charset));
                    messageDigest.update("258EAFA5-E914-47DA-95CA-C5AB0DC85B11".getBytes(charset));
                    String encodeToString2 = Base64.getEncoder().encodeToString(messageDigest.digest());
                    String str3 = (String) hashMap.get("sec-websocket-accept");
                    if (!encodeToString2.equals(str3)) {
                        a70.r(fc6.n("Expected HTTP `Sec-WebSocket-Accept: ", encodeToString2, ", but got ", str3));
                        throw null;
                    }
                    InputStream inputStream2 = socket.getInputStream();
                    n1l n1lVar = new n1l();
                    n1lVar.a = new byte[14];
                    n1lVar.b = new m1l();
                    n1lVar.d = new byte[1];
                    n1lVar.c = inputStream2;
                    this.b = n1lVar;
                    OutputStream outputStream2 = socket.getOutputStream();
                    o1l o1lVar = new o1l();
                    o1lVar.c = new byte[1];
                    o1lVar.d = new byte[1440];
                    m1l m1lVar = new m1l();
                    m1lVar.a = (byte) (dmi.a(3) | 128);
                    m1lVar.b = false;
                    o1lVar.e = m1lVar;
                    o1lVar.f = new SecureRandom();
                    o1lVar.a = outputStream2;
                    o1lVar.b = true;
                    this.c = o1lVar;
                    return;
                } catch (NoSuchAlgorithmException e3) {
                    yhk.q(e3);
                    throw null;
                }
            }
            int indexOf = e2.indexOf(58);
            if (indexOf < 0) {
                a70.r("Expected HTTP header to contain ':', but got ".concat(e2));
                throw null;
            }
            if (hashMap.size() >= 100) {
                a70.r("Exceeded max HTTP headers=100");
                throw null;
            }
            hashMap.put(e2.substring(0, indexOf).trim().toLowerCase(), e2.substring(indexOf + 1).trim());
        }
    }

    public static String e(InputStream inputStream, byte[] bArr) {
        int i = 0;
        int i2 = -1;
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                return new String(bArr, 0, i, StandardCharsets.ISO_8859_1);
            }
            if (read == 10) {
                if (13 == i2) {
                    i--;
                }
                return new String(bArr, 0, i, StandardCharsets.ISO_8859_1);
            }
            if (i >= bArr.length) {
                return null;
            }
            bArr[i] = (byte) read;
            i++;
            i2 = read;
        }
    }

    @Override // java.net.Socket
    public final void bind(SocketAddress socketAddress) {
        throw new UnsupportedOperationException();
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            this.a.close();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.net.Socket
    public final void connect(SocketAddress socketAddress) {
        throw new UnsupportedOperationException();
    }

    @Override // java.net.Socket
    public final SocketChannel getChannel() {
        throw new UnsupportedOperationException();
    }

    @Override // java.net.Socket
    public final InetAddress getInetAddress() {
        return this.a.getInetAddress();
    }

    @Override // java.net.Socket
    public final InputStream getInputStream() {
        return this.b;
    }

    @Override // java.net.Socket
    public final boolean getKeepAlive() {
        return this.a.getKeepAlive();
    }

    @Override // java.net.Socket
    public final InetAddress getLocalAddress() {
        return this.a.getLocalAddress();
    }

    @Override // java.net.Socket
    public final int getLocalPort() {
        return this.a.getLocalPort();
    }

    @Override // java.net.Socket
    public final SocketAddress getLocalSocketAddress() {
        return this.a.getLocalSocketAddress();
    }

    @Override // java.net.Socket
    public final boolean getOOBInline() {
        return this.a.getOOBInline();
    }

    @Override // java.net.Socket
    public final OutputStream getOutputStream() {
        return this.c;
    }

    @Override // java.net.Socket
    public final int getPort() {
        return this.a.getPort();
    }

    @Override // java.net.Socket
    public final int getReceiveBufferSize() {
        return this.a.getReceiveBufferSize();
    }

    @Override // java.net.Socket
    public final SocketAddress getRemoteSocketAddress() {
        return this.a.getRemoteSocketAddress();
    }

    @Override // java.net.Socket
    public final boolean getReuseAddress() {
        return this.a.getReuseAddress();
    }

    @Override // java.net.Socket
    public final int getSendBufferSize() {
        return this.a.getSendBufferSize();
    }

    @Override // java.net.Socket
    public final int getSoLinger() {
        return this.a.getSoLinger();
    }

    @Override // java.net.Socket
    public final int getSoTimeout() {
        return this.a.getSoTimeout();
    }

    @Override // java.net.Socket
    public final boolean getTcpNoDelay() {
        return this.a.getTcpNoDelay();
    }

    @Override // java.net.Socket
    public final int getTrafficClass() {
        return this.a.getTrafficClass();
    }

    @Override // java.net.Socket
    public final boolean isBound() {
        return this.a.isBound();
    }

    @Override // java.net.Socket
    public final boolean isClosed() {
        return this.a.isClosed();
    }

    @Override // java.net.Socket
    public final boolean isConnected() {
        return this.a.isConnected();
    }

    @Override // java.net.Socket
    public final boolean isInputShutdown() {
        return this.a.isInputShutdown();
    }

    @Override // java.net.Socket
    public final boolean isOutputShutdown() {
        return this.a.isOutputShutdown();
    }

    @Override // java.net.Socket
    public final void sendUrgentData(int i) {
        this.a.sendUrgentData(i);
    }

    @Override // java.net.Socket
    public final void setKeepAlive(boolean z) {
        this.a.setKeepAlive(z);
    }

    @Override // java.net.Socket
    public final void setOOBInline(boolean z) {
        this.a.setOOBInline(z);
    }

    @Override // java.net.Socket
    public final void setPerformancePreferences(int i, int i2, int i3) {
        this.a.setPerformancePreferences(i, i2, i3);
    }

    @Override // java.net.Socket
    public final void setReceiveBufferSize(int i) {
        this.a.setReceiveBufferSize(i);
    }

    @Override // java.net.Socket
    public final void setReuseAddress(boolean z) {
        this.a.setReuseAddress(z);
    }

    @Override // java.net.Socket
    public final void setSendBufferSize(int i) {
        this.a.setSendBufferSize(i);
    }

    @Override // java.net.Socket
    public final void setSoLinger(boolean z, int i) {
        this.a.setSoLinger(z, i);
    }

    @Override // java.net.Socket
    public final void setSoTimeout(int i) {
        this.a.setSoTimeout(i);
    }

    @Override // java.net.Socket
    public final void setTcpNoDelay(boolean z) {
        this.a.setTcpNoDelay(z);
    }

    @Override // java.net.Socket
    public final void setTrafficClass(int i) {
        this.a.setTrafficClass(i);
    }

    @Override // java.net.Socket
    public final void shutdownInput() {
        this.a.shutdownInput();
    }

    @Override // java.net.Socket
    public final void shutdownOutput() {
        this.a.shutdownOutput();
    }

    @Override // java.net.Socket
    public final void connect(SocketAddress socketAddress, int i) {
        throw new UnsupportedOperationException();
    }
}
