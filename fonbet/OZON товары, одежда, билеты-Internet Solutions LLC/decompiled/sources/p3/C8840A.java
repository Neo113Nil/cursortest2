package p3;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* renamed from: p3.A, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8840A extends AbstractC8842b {

    /* renamed from: a, reason: collision with root package name */
    private final int f80035a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f80036b;

    /* renamed from: c, reason: collision with root package name */
    private final DatagramPacket f80037c;

    /* renamed from: d, reason: collision with root package name */
    private Uri f80038d;

    /* renamed from: e, reason: collision with root package name */
    private DatagramSocket f80039e;

    /* renamed from: f, reason: collision with root package name */
    private MulticastSocket f80040f;

    /* renamed from: g, reason: collision with root package name */
    private InetAddress f80041g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f80042h;

    /* renamed from: i, reason: collision with root package name */
    private int f80043i;

    /* renamed from: p3.A$a */
    public static final class a extends C8847g {
    }

    public C8840A() {
        super(true);
        this.f80035a = 8000;
        byte[] bArr = new byte[2000];
        this.f80036b = bArr;
        this.f80037c = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // p3.InterfaceC8846f
    public final void close() {
        this.f80038d = null;
        MulticastSocket multicastSocket = this.f80040f;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f80041g;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f80040f = null;
        }
        DatagramSocket datagramSocket = this.f80039e;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f80039e = null;
        }
        this.f80041g = null;
        this.f80043i = 0;
        if (this.f80042h) {
            this.f80042h = false;
            transferEnded();
        }
    }

    @Override // p3.InterfaceC8846f
    public final Uri getUri() {
        return this.f80038d;
    }

    @Override // p3.InterfaceC8846f
    public final long open(i iVar) throws a {
        Uri uri = iVar.f80066a;
        this.f80038d = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f80038d.getPort();
        transferInitializing(iVar);
        try {
            this.f80041g = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f80041g, port);
            if (this.f80041g.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f80040f = multicastSocket;
                multicastSocket.joinGroup(this.f80041g);
                this.f80039e = this.f80040f;
            } else {
                this.f80039e = new DatagramSocket(inetSocketAddress);
            }
            this.f80039e.setSoTimeout(this.f80035a);
            this.f80042h = true;
            transferStarted(iVar);
            return -1L;
        } catch (IOException e11) {
            throw new a(2001, e11);
        } catch (SecurityException e12) {
            throw new a(2006, e12);
        }
    }

    @Override // j3.InterfaceC7268j
    public final int read(byte[] bArr, int i11, int i12) throws a {
        if (i12 == 0) {
            return 0;
        }
        int i13 = this.f80043i;
        DatagramPacket datagramPacket = this.f80037c;
        if (i13 == 0) {
            try {
                DatagramSocket datagramSocket = this.f80039e;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f80043i = length;
                bytesTransferred(length);
            } catch (SocketTimeoutException e11) {
                throw new a(2002, e11);
            } catch (IOException e12) {
                throw new a(2001, e12);
            }
        }
        int length2 = datagramPacket.getLength();
        int i14 = this.f80043i;
        int min = Math.min(i14, i12);
        System.arraycopy(this.f80036b, length2 - i14, bArr, i11, min);
        this.f80043i -= min;
        return min;
    }
}
