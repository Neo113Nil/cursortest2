package androidx.media3.datasource;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import xsna.evk;
import xsna.gc6;

/* loaded from: classes12.dex */
public final class UdpDataSource extends gc6 {
    public final int r;
    public final byte[] s;
    public final DatagramPacket t;

    @Nullable
    public Uri u;

    @Nullable
    public DatagramSocket v;

    @Nullable
    public MulticastSocket w;

    @Nullable
    public InetAddress x;
    public boolean y;
    public int z;

    public static final class UdpDataSourceException extends DataSourceException {
    }

    public UdpDataSource() {
        super(true);
        this.r = 8000;
        byte[] bArr = new byte[2000];
        this.s = bArr;
        this.t = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // androidx.media3.datasource.a
    public final void close() {
        this.u = null;
        MulticastSocket multicastSocket = this.w;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.x;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.w = null;
        }
        DatagramSocket datagramSocket = this.v;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.v = null;
        }
        this.x = null;
        this.z = 0;
        if (this.y) {
            this.y = false;
            transferEnded();
        }
    }

    @Override // androidx.media3.datasource.a
    @Nullable
    public final Uri getUri() {
        return this.u;
    }

    @Override // androidx.media3.datasource.a
    public final long open(evk evkVar) throws UdpDataSourceException {
        Uri uri = evkVar.a;
        this.u = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.u.getPort();
        transferInitializing(evkVar);
        try {
            this.x = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.x, port);
            if (this.x.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.w = multicastSocket;
                multicastSocket.joinGroup(this.x);
                this.v = this.w;
            } else {
                this.v = new DatagramSocket(inetSocketAddress);
            }
            this.v.setSoTimeout(this.r);
            this.y = true;
            transferStarted(evkVar);
            return -1L;
        } catch (IOException e) {
            throw new UdpDataSourceException(e, 2001);
        } catch (SecurityException e2) {
            throw new UdpDataSourceException(e2, 2006);
        }
    }

    @Override // xsna.suk
    public final int read(byte[] bArr, int i, int i2) throws UdpDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.z;
        DatagramPacket datagramPacket = this.t;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.v;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.z = length;
                bytesTransferred(length);
            } catch (SocketTimeoutException e) {
                throw new UdpDataSourceException(e, 2002);
            } catch (IOException e2) {
                throw new UdpDataSourceException(e2, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.z;
        int min = Math.min(i4, i2);
        System.arraycopy(this.s, length2 - i4, bArr, i, min);
        this.z -= min;
        return min;
    }
}
