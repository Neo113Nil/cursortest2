package sf;

import I0.C3173b;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class t implements M {

    /* renamed from: a, reason: collision with root package name */
    private byte f98753a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final G f98754b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Inflater f98755c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final u f98756d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final CRC32 f98757e;

    public t(@NotNull M source) {
        Intrinsics.checkNotNullParameter(source, "source");
        G g10 = new G(source);
        this.f98754b = g10;
        Inflater inflater = new Inflater(true);
        this.f98755c = inflater;
        this.f98756d = new u(g10, inflater);
        this.f98757e = new CRC32();
    }

    private static void c(int i11, int i12, String str) {
        if (i12 != i11) {
            throw new IOException(V.e.b(new Object[]{str, Integer.valueOf(i12), Integer.valueOf(i11)}, 3, "%s: actual 0x%08x != expected 0x%08x", "format(this, *args)"));
        }
    }

    private final void d(C9681g c9681g, long j11, long j12) {
        H h11 = c9681g.f98708a;
        Intrinsics.f(h11);
        while (true) {
            int i11 = h11.f98672c;
            int i12 = h11.f98671b;
            if (j11 < i11 - i12) {
                break;
            }
            j11 -= i11 - i12;
            h11 = h11.f98675f;
            Intrinsics.f(h11);
        }
        while (j12 > 0) {
            int min = (int) Math.min(h11.f98672c - r6, j12);
            this.f98757e.update(h11.f98670a, (int) (h11.f98671b + j11), min);
            j12 -= min;
            h11 = h11.f98675f;
            Intrinsics.f(h11);
            j11 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f98756d.close();
    }

    @Override // sf.M
    public final long read(@NotNull C9681g sink, long j11) throws IOException {
        t tVar = this;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j11 < 0) {
            throw new IllegalArgumentException(C3173b.b(j11, "byteCount < 0: ").toString());
        }
        if (j11 == 0) {
            return 0L;
        }
        byte b11 = tVar.f98753a;
        CRC32 crc32 = tVar.f98757e;
        G g10 = tVar.f98754b;
        if (b11 == 0) {
            g10.r1(10L);
            C9681g c9681g = g10.f98667b;
            byte o11 = c9681g.o(3L);
            boolean z11 = ((o11 >> 1) & 1) == 1;
            if (z11) {
                tVar.d(g10.f98667b, 0L, 10L);
            }
            c(8075, g10.readShort(), "ID1ID2");
            g10.skip(8L);
            if (((o11 >> 2) & 1) == 1) {
                g10.r1(2L);
                if (z11) {
                    d(g10.f98667b, 0L, 2L);
                }
                long B11 = c9681g.B() & 65535;
                g10.r1(B11);
                if (z11) {
                    d(g10.f98667b, 0L, B11);
                }
                g10.skip(B11);
            }
            if (((o11 >> 3) & 1) == 1) {
                long b12 = g10.b1((byte) 0, 0L, Long.MAX_VALUE);
                if (b12 == -1) {
                    throw new EOFException();
                }
                if (z11) {
                    d(g10.f98667b, 0L, b12 + 1);
                }
                g10.skip(b12 + 1);
            }
            if (((o11 >> 4) & 1) == 1) {
                long b13 = g10.b1((byte) 0, 0L, Long.MAX_VALUE);
                if (b13 == -1) {
                    throw new EOFException();
                }
                if (z11) {
                    tVar = this;
                    tVar.d(g10.f98667b, 0L, b13 + 1);
                } else {
                    tVar = this;
                }
                g10.skip(b13 + 1);
            } else {
                tVar = this;
            }
            if (z11) {
                c(g10.q(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            tVar.f98753a = (byte) 1;
        }
        if (tVar.f98753a == 1) {
            long size = sink.size();
            long read = tVar.f98756d.read(sink, j11);
            if (read != -1) {
                tVar.d(sink, size, read);
                return read;
            }
            tVar.f98753a = (byte) 2;
        }
        if (tVar.f98753a == 2) {
            c(g10.o(), (int) crc32.getValue(), "CRC");
            c(g10.o(), (int) tVar.f98755c.getBytesWritten(), "ISIZE");
            tVar.f98753a = (byte) 3;
            if (!g10.c()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // sf.M
    @NotNull
    public final N timeout() {
        return this.f98754b.f98666a.timeout();
    }
}
