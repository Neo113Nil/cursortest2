package mf;

import T7.E;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;
import sf.InterfaceC9683i;

/* loaded from: classes10.dex */
public final class h implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private boolean f74803a;

    /* renamed from: b, reason: collision with root package name */
    private int f74804b;

    /* renamed from: c, reason: collision with root package name */
    private long f74805c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f74806d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f74807e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f74808f;

    /* renamed from: g, reason: collision with root package name */
    private final C9681g f74809g;

    /* renamed from: h, reason: collision with root package name */
    private final C9681g f74810h;

    /* renamed from: i, reason: collision with root package name */
    private c f74811i;

    /* renamed from: j, reason: collision with root package name */
    private final byte[] f74812j;

    /* renamed from: k, reason: collision with root package name */
    private final C9681g.a f74813k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f74814l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final InterfaceC9683i f74815m;

    /* renamed from: n, reason: collision with root package name */
    private final d f74816n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f74817o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f74818p;

    public h(boolean z11, @NotNull InterfaceC9683i source, @NotNull d frameCallback, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(frameCallback, "frameCallback");
        this.f74814l = z11;
        this.f74815m = source;
        this.f74816n = frameCallback;
        this.f74817o = z12;
        this.f74818p = z13;
        this.f74809g = new C9681g();
        this.f74810h = new C9681g();
        this.f74812j = z11 ? null : new byte[4];
        this.f74813k = z11 ? null : new C9681g.a();
    }

    private final void d() throws IOException {
        short s11;
        String str;
        long j11 = this.f74805c;
        C9681g c9681g = this.f74809g;
        if (j11 > 0) {
            this.f74815m.a0(c9681g, j11);
            if (!this.f74814l) {
                C9681g.a aVar = this.f74813k;
                Intrinsics.f(aVar);
                c9681g.t(aVar);
                aVar.d(0L);
                byte[] bArr = this.f74812j;
                Intrinsics.f(bArr);
                g.a(aVar, bArr);
                aVar.close();
            }
        }
        int i11 = this.f74804b;
        d dVar = this.f74816n;
        switch (i11) {
            case 8:
                long size = c9681g.size();
                if (size == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (size != 0) {
                    s11 = c9681g.readShort();
                    str = c9681g.G0();
                    String a11 = (s11 < 1000 || s11 >= 5000) ? Ej.b.a(s11, "Code must be in range [1000,5000): ") : ((1004 > s11 || 1006 < s11) && (1015 > s11 || 2999 < s11)) ? null : E.a(s11, "Code ", " is reserved and may not be used.");
                    if (a11 != null) {
                        throw new ProtocolException(a11);
                    }
                } else {
                    s11 = 1005;
                    str = "";
                }
                dVar.m(s11, str);
                this.f74803a = true;
                return;
            case 9:
                dVar.p(c9681g.v0());
                return;
            case 10:
                dVar.q(c9681g.v0());
                return;
            default:
                StringBuilder sb2 = new StringBuilder("Unknown control opcode: ");
                int i12 = this.f74804b;
                byte[] bArr2 = Ye.b.f34900a;
                String hexString = Integer.toHexString(i12);
                Intrinsics.checkNotNullExpressionValue(hexString, "Integer.toHexString(this)");
                sb2.append(hexString);
                throw new ProtocolException(sb2.toString());
        }
    }

    private final void j() throws IOException, ProtocolException {
        boolean z11;
        if (this.f74803a) {
            throw new IOException("closed");
        }
        InterfaceC9683i interfaceC9683i = this.f74815m;
        long h11 = interfaceC9683i.timeout().h();
        interfaceC9683i.timeout().b();
        try {
            byte readByte = interfaceC9683i.readByte();
            byte[] bArr = Ye.b.f34900a;
            interfaceC9683i.timeout().g(h11, TimeUnit.NANOSECONDS);
            int i11 = readByte & 15;
            this.f74804b = i11;
            boolean z12 = (readByte & 128) != 0;
            this.f74806d = z12;
            boolean z13 = (readByte & 8) != 0;
            this.f74807e = z13;
            if (z13 && !z12) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z14 = (readByte & 64) != 0;
            if (i11 == 1 || i11 == 2) {
                if (!z14) {
                    z11 = false;
                } else {
                    if (!this.f74817o) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z11 = true;
                }
                this.f74808f = z11;
            } else if (z14) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((readByte & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((readByte & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte readByte2 = interfaceC9683i.readByte();
            boolean z15 = (readByte2 & 128) != 0;
            boolean z16 = this.f74814l;
            if (z15 == z16) {
                throw new ProtocolException(z16 ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j11 = readByte2 & Byte.MAX_VALUE;
            this.f74805c = j11;
            if (j11 == 126) {
                this.f74805c = interfaceC9683i.readShort() & 65535;
            } else if (j11 == 127) {
                long readLong = interfaceC9683i.readLong();
                this.f74805c = readLong;
                if (readLong < 0) {
                    StringBuilder sb2 = new StringBuilder("Frame length 0x");
                    String hexString = Long.toHexString(this.f74805c);
                    Intrinsics.checkNotNullExpressionValue(hexString, "java.lang.Long.toHexString(this)");
                    sb2.append(hexString);
                    sb2.append(" > 0x7FFFFFFFFFFFFFFF");
                    throw new ProtocolException(sb2.toString());
                }
            }
            if (this.f74807e && this.f74805c > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z15) {
                byte[] bArr2 = this.f74812j;
                Intrinsics.f(bArr2);
                interfaceC9683i.readFully(bArr2);
            }
        } catch (Throwable th2) {
            interfaceC9683i.timeout().g(h11, TimeUnit.NANOSECONDS);
            throw th2;
        }
    }

    public final void c() throws IOException {
        j();
        if (this.f74807e) {
            d();
            return;
        }
        int i11 = this.f74804b;
        if (i11 != 1 && i11 != 2) {
            StringBuilder sb2 = new StringBuilder("Unknown opcode: ");
            byte[] bArr = Ye.b.f34900a;
            String hexString = Integer.toHexString(i11);
            Intrinsics.checkNotNullExpressionValue(hexString, "Integer.toHexString(this)");
            sb2.append(hexString);
            throw new ProtocolException(sb2.toString());
        }
        while (!this.f74803a) {
            long j11 = this.f74805c;
            C9681g c9681g = this.f74810h;
            if (j11 > 0) {
                this.f74815m.a0(c9681g, j11);
                if (!this.f74814l) {
                    C9681g.a aVar = this.f74813k;
                    Intrinsics.f(aVar);
                    c9681g.t(aVar);
                    aVar.d(c9681g.size() - this.f74805c);
                    byte[] bArr2 = this.f74812j;
                    Intrinsics.f(bArr2);
                    g.a(aVar, bArr2);
                    aVar.close();
                }
            }
            if (this.f74806d) {
                if (this.f74808f) {
                    c cVar = this.f74811i;
                    if (cVar == null) {
                        cVar = new c(this.f74818p);
                        this.f74811i = cVar;
                    }
                    cVar.c(c9681g);
                }
                d dVar = this.f74816n;
                if (i11 == 1) {
                    dVar.n(c9681g.G0());
                    return;
                } else {
                    dVar.o(c9681g.v0());
                    return;
                }
            }
            while (!this.f74803a) {
                j();
                if (!this.f74807e) {
                    break;
                } else {
                    d();
                }
            }
            if (this.f74804b != 0) {
                StringBuilder sb3 = new StringBuilder("Expected continuation opcode. Got: ");
                int i12 = this.f74804b;
                byte[] bArr3 = Ye.b.f34900a;
                String hexString2 = Integer.toHexString(i12);
                Intrinsics.checkNotNullExpressionValue(hexString2, "Integer.toHexString(this)");
                sb3.append(hexString2);
                throw new ProtocolException(sb3.toString());
            }
        }
        throw new IOException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        c cVar = this.f74811i;
        if (cVar != null) {
            cVar.close();
        }
    }
}
