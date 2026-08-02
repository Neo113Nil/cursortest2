package h1;

import android.net.Uri;
import com.twilio.voice.AudioFormat;
import e1.AbstractC4134a;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* renamed from: h1.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4404G extends AbstractC4406b {

    /* renamed from: e, reason: collision with root package name */
    public final int f47515e;

    /* renamed from: f, reason: collision with root package name */
    public final DatagramPacket f47516f;

    /* renamed from: g, reason: collision with root package name */
    public Uri f47517g;

    /* renamed from: h, reason: collision with root package name */
    public DatagramSocket f47518h;

    /* renamed from: i, reason: collision with root package name */
    public MulticastSocket f47519i;

    /* renamed from: j, reason: collision with root package name */
    public InetAddress f47520j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f47521k;

    /* renamed from: l, reason: collision with root package name */
    public int f47522l;
    private final byte[] packetBuffer;

    /* renamed from: h1.G$a */
    public static final class a extends C4415k {
        public a(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public C4404G() {
        this(2000);
    }

    @Override // h1.InterfaceC4411g
    public long b(C4418n c4418n) {
        Uri uri = c4418n.f47554a;
        this.f47517g = uri;
        String str = (String) AbstractC4134a.e(uri.getHost());
        int port = this.f47517g.getPort();
        q(c4418n);
        try {
            this.f47520j = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f47520j, port);
            if (this.f47520j.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f47519i = multicastSocket;
                multicastSocket.joinGroup(this.f47520j);
                this.f47518h = this.f47519i;
            } else {
                this.f47518h = new DatagramSocket(inetSocketAddress);
            }
            this.f47518h.setSoTimeout(this.f47515e);
            this.f47521k = true;
            r(c4418n);
            return -1L;
        } catch (IOException e10) {
            throw new a(e10, 2001);
        } catch (SecurityException e11) {
            throw new a(e11, 2006);
        }
    }

    @Override // h1.InterfaceC4411g
    public void close() {
        this.f47517g = null;
        MulticastSocket multicastSocket = this.f47519i;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) AbstractC4134a.e(this.f47520j));
            } catch (IOException unused) {
            }
            this.f47519i = null;
        }
        DatagramSocket datagramSocket = this.f47518h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f47518h = null;
        }
        this.f47520j = null;
        this.f47522l = 0;
        if (this.f47521k) {
            this.f47521k = false;
            p();
        }
    }

    @Override // h1.InterfaceC4411g
    public Uri getUri() {
        return this.f47517g;
    }

    @Override // b1.InterfaceC2358l
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (this.f47522l == 0) {
            try {
                ((DatagramSocket) AbstractC4134a.e(this.f47518h)).receive(this.f47516f);
                int length = this.f47516f.getLength();
                this.f47522l = length;
                o(length);
            } catch (SocketTimeoutException e10) {
                throw new a(e10, 2002);
            } catch (IOException e11) {
                throw new a(e11, 2001);
            }
        }
        int length2 = this.f47516f.getLength();
        int i12 = this.f47522l;
        int min = Math.min(i12, i11);
        System.arraycopy(this.packetBuffer, length2 - i12, bArr, i10, min);
        this.f47522l -= min;
        return min;
    }

    public C4404G(int i10) {
        this(i10, AudioFormat.AUDIO_SAMPLE_RATE_8000);
    }

    public C4404G(int i10, int i11) {
        super(true);
        this.f47515e = i11;
        byte[] bArr = new byte[i10];
        this.packetBuffer = bArr;
        this.f47516f = new DatagramPacket(bArr, 0, i10);
    }
}
