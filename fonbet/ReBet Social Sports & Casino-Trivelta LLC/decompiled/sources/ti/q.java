package ti;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q implements G {

    /* renamed from: a, reason: collision with root package name */
    public byte f65880a;

    /* renamed from: b, reason: collision with root package name */
    public final C6467A f65881b;

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f65882c;

    /* renamed from: d, reason: collision with root package name */
    public final r f65883d;

    /* renamed from: e, reason: collision with root package name */
    public final CRC32 f65884e;

    public q(G source) {
        Intrinsics.checkNotNullParameter(source, "source");
        C6467A c6467a = new C6467A(source);
        this.f65881b = c6467a;
        Inflater inflater = new Inflater(true);
        this.f65882c = inflater;
        this.f65883d = new r((InterfaceC6480j) c6467a, inflater);
        this.f65884e = new CRC32();
    }

    public final void B(C6478h c6478h, long j10, long j11) {
        C6468B c6468b = c6478h.f65857a;
        Intrinsics.checkNotNull(c6468b);
        while (true) {
            int i10 = c6468b.f65836b;
            int i11 = c6468b.f65835a;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= i10 - i11;
            c6468b = c6468b.f65839e;
            Intrinsics.checkNotNull(c6468b);
        }
        while (j11 > 0) {
            int min = (int) Math.min(c6468b.f65836b - r6, j11);
            this.f65884e.update(c6468b.data, (int) (c6468b.f65835a + j10), min);
            j11 -= min;
            c6468b = c6468b.f65839e;
            Intrinsics.checkNotNull(c6468b);
            j10 = 0;
        }
    }

    @Override // ti.G, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f65883d.close();
    }

    public final void d(String str, int i10, int i11) {
        if (i11 == i10) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
        throw new IOException(format);
    }

    public final void k() {
        this.f65881b.G0(10L);
        byte A02 = this.f65881b.f65831b.A0(3L);
        boolean z10 = ((A02 >> 1) & 1) == 1;
        if (z10) {
            B(this.f65881b.f65831b, 0L, 10L);
        }
        d("ID1ID2", 8075, this.f65881b.readShort());
        this.f65881b.skip(8L);
        if (((A02 >> 2) & 1) == 1) {
            this.f65881b.G0(2L);
            if (z10) {
                B(this.f65881b.f65831b, 0L, 2L);
            }
            long a22 = this.f65881b.f65831b.a2() & UShort.MAX_VALUE;
            this.f65881b.G0(a22);
            if (z10) {
                B(this.f65881b.f65831b, 0L, a22);
            }
            this.f65881b.skip(a22);
        }
        if (((A02 >> 3) & 1) == 1) {
            long d10 = this.f65881b.d((byte) 0);
            if (d10 == -1) {
                throw new EOFException();
            }
            if (z10) {
                B(this.f65881b.f65831b, 0L, d10 + 1);
            }
            this.f65881b.skip(d10 + 1);
        }
        if (((A02 >> 4) & 1) == 1) {
            long d11 = this.f65881b.d((byte) 0);
            if (d11 == -1) {
                throw new EOFException();
            }
            if (z10) {
                B(this.f65881b.f65831b, 0L, d11 + 1);
            }
            this.f65881b.skip(d11 + 1);
        }
        if (z10) {
            d("FHCRC", this.f65881b.w0(), (short) this.f65884e.getValue());
            this.f65884e.reset();
        }
    }

    public final void r() {
        d("CRC", this.f65881b.U(), (int) this.f65884e.getValue());
        d("ISIZE", this.f65881b.U(), (int) this.f65882c.getBytesWritten());
    }

    @Override // ti.G
    public long read(C6478h sink, long j10) {
        q qVar;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        if (this.f65880a == 0) {
            k();
            this.f65880a = (byte) 1;
        }
        if (this.f65880a == 1) {
            long size = sink.size();
            long read = this.f65883d.read(sink, j10);
            if (read != -1) {
                B(sink, size, read);
                return read;
            }
            qVar = this;
            qVar.f65880a = (byte) 2;
        } else {
            qVar = this;
        }
        if (qVar.f65880a == 2) {
            r();
            qVar.f65880a = (byte) 3;
            if (!qVar.f65881b.X0()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // ti.G
    public H timeout() {
        return this.f65881b.timeout();
    }
}
