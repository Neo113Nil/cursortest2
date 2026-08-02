package E1;

import D1.m;
import android.os.SystemClock;
import e1.AbstractC4134a;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import kotlin.UByte;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f2931a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f2932b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f2933c = false;

    /* renamed from: d, reason: collision with root package name */
    public static long f2934d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static String f2935e = "time.android.com";

    /* renamed from: f, reason: collision with root package name */
    public static int f2936f = 1000;

    /* renamed from: g, reason: collision with root package name */
    public static long f2937g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public static long f2938h = -9223372036854775807L;

    public interface b {
        void a();

        void b(IOException iOException);
    }

    public static void h(byte b10, byte b11, int i10, long j10) {
        if (b10 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b11 != 4 && b11 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + ((int) b11));
        }
        if (i10 != 0 && i10 <= 15) {
            if (j10 == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            throw new IOException("SNTP: Untrusted stratum: " + i10);
        }
    }

    public static long i() {
        long j10;
        synchronized (f2932b) {
            try {
                j10 = f2933c ? f2934d : -9223372036854775807L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j10;
    }

    public static String j() {
        String str;
        synchronized (f2932b) {
            str = f2935e;
        }
        return str;
    }

    public static int k() {
        int i10;
        synchronized (f2932b) {
            i10 = f2936f;
        }
        return i10;
    }

    public static void l(m mVar, b bVar) {
        if (m()) {
            if (bVar != null) {
                bVar.a();
            }
        } else {
            if (mVar == null) {
                mVar = new m("SntpClient");
            }
            mVar.n(new d(), new C0063c(bVar), 1);
        }
    }

    public static boolean m() {
        boolean z10;
        synchronized (f2932b) {
            try {
                if (f2938h != -9223372036854775807L && f2937g != -9223372036854775807L) {
                    f2933c = f2933c && SystemClock.elapsedRealtime() - f2938h < f2937g;
                }
                z10 = f2933c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public static long n() {
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(k());
            InetAddress[] allByName = InetAddress.getAllByName(j());
            int length = allByName.length;
            SocketTimeoutException socketTimeoutException = null;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                byte[] bArr = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, allByName[i10], 123);
                bArr[0] = 27;
                long currentTimeMillis = System.currentTimeMillis();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                q(bArr, 40, currentTimeMillis);
                datagramSocket.send(datagramPacket);
                try {
                    datagramSocket.receive(new DatagramPacket(bArr, 48));
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j10 = currentTimeMillis + (elapsedRealtime2 - elapsedRealtime);
                    byte b10 = bArr[0];
                    int i12 = bArr[1] & UByte.MAX_VALUE;
                    long p10 = p(bArr, 24);
                    long p11 = p(bArr, 32);
                    long p12 = p(bArr, 40);
                    h((byte) ((b10 >> 6) & 3), (byte) (b10 & 7), i12, p12);
                    long j11 = (j10 + (((p11 - p10) + (p12 - j10)) / 2)) - elapsedRealtime2;
                    datagramSocket.close();
                    return j11;
                } catch (SocketTimeoutException e10) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException = e10;
                    } else {
                        socketTimeoutException.addSuppressed(e10);
                    }
                    int i13 = i11 + 1;
                    if (i11 >= 10) {
                        break;
                    }
                    i10++;
                    i11 = i13;
                }
            }
            throw ((SocketTimeoutException) AbstractC4134a.e(socketTimeoutException));
        } finally {
        }
    }

    public static long o(byte[] bArr, int i10) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = bArr[i10 + 2];
        int i14 = bArr[i10 + 3];
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        return (i11 << 24) + (i12 << 16) + (i13 << 8) + i14;
    }

    public static long p(byte[] bArr, int i10) {
        long o10 = o(bArr, i10);
        long o11 = o(bArr, i10 + 4);
        if (o10 == 0 && o11 == 0) {
            return 0L;
        }
        return ((o10 - 2208988800L) * 1000) + ((o11 * 1000) / 4294967296L);
    }

    public static void q(byte[] bArr, int i10, long j10) {
        if (j10 == 0) {
            Arrays.fill(bArr, i10, i10 + 8, (byte) 0);
            return;
        }
        long j11 = j10 / 1000;
        long j12 = j10 - (j11 * 1000);
        bArr[i10] = (byte) (r2 >> 24);
        bArr[i10 + 1] = (byte) (r2 >> 16);
        bArr[i10 + 2] = (byte) (r2 >> 8);
        bArr[i10 + 3] = (byte) (j11 + 2208988800L);
        long j13 = (j12 * 4294967296L) / 1000;
        bArr[i10 + 4] = (byte) (j13 >> 24);
        bArr[i10 + 5] = (byte) (j13 >> 16);
        bArr[i10 + 6] = (byte) (j13 >> 8);
        bArr[i10 + 7] = (byte) (Math.random() * 255.0d);
    }

    public static final class d implements m.e {
        public d() {
        }

        @Override // D1.m.e
        public void a() {
            synchronized (c.f2931a) {
                synchronized (c.f2932b) {
                    if (c.f2933c) {
                        return;
                    }
                    long n10 = c.n();
                    synchronized (c.f2932b) {
                        long unused = c.f2938h = SystemClock.elapsedRealtime();
                        long unused2 = c.f2934d = n10;
                        boolean unused3 = c.f2933c = true;
                    }
                }
            }
        }

        @Override // D1.m.e
        public void c() {
        }
    }

    /* renamed from: E1.c$c, reason: collision with other inner class name */
    public static final class C0063c implements m.b {

        /* renamed from: a, reason: collision with root package name */
        public final b f2939a;

        public C0063c(b bVar) {
            this.f2939a = bVar;
        }

        @Override // D1.m.b
        public void i(m.e eVar, long j10, long j11) {
            if (this.f2939a != null) {
                if (c.m()) {
                    this.f2939a.a();
                } else {
                    this.f2939a.b(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // D1.m.b
        public m.c o(m.e eVar, long j10, long j11, IOException iOException, int i10) {
            b bVar = this.f2939a;
            if (bVar != null) {
                bVar.b(iOException);
            }
            return m.f2456f;
        }

        @Override // D1.m.b
        public void l(m.e eVar, long j10, long j11, boolean z10) {
        }
    }
}
