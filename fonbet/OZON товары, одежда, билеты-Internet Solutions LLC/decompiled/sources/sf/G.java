package sf;

import C.C2702w;
import I0.C3173b;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import tf.C9869a;

/* loaded from: classes6.dex */
public final class G implements InterfaceC9683i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final M f98666a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final C9681g f98667b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f98668c;

    public G(@NotNull M source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f98666a = source;
        this.f98667b = new C9681g();
    }

    @Override // sf.InterfaceC9683i
    public final long F0(@NotNull C9684j targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        if (this.f98668c) {
            throw new IllegalStateException("closed");
        }
        long j11 = 0;
        while (true) {
            C9681g c9681g = this.f98667b;
            long q11 = c9681g.q(j11, targetBytes);
            if (q11 != -1) {
                return q11;
            }
            long size = c9681g.size();
            if (this.f98666a.read(c9681g, 8192L) == -1) {
                return -1L;
            }
            j11 = Math.max(j11, size);
        }
    }

    @Override // sf.InterfaceC9683i
    @NotNull
    public final String G0() {
        M m11 = this.f98666a;
        C9681g c9681g = this.f98667b;
        c9681g.y0(m11);
        return c9681g.G0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        return -1;
     */
    @Override // sf.InterfaceC9683i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R0(@NotNull C9674B options) {
        Intrinsics.checkNotNullParameter(options, "options");
        if (this.f98668c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            C9681g c9681g = this.f98667b;
            int d11 = C9869a.d(c9681g, options, true);
            if (d11 != -2) {
                if (d11 != -1) {
                    c9681g.skip(options.b()[d11].g());
                    return d11;
                }
            } else if (this.f98666a.read(c9681g, 8192L) == -1) {
                break;
            }
        }
    }

    @Override // sf.InterfaceC9683i
    public final void a0(@NotNull C9681g sink, long j11) {
        C9681g c9681g = this.f98667b;
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            r1(j11);
            c9681g.a0(sink, j11);
        } catch (EOFException e11) {
            sink.y0(c9681g);
            throw e11;
        }
    }

    @Override // sf.InterfaceC9683i
    @NotNull
    public final InputStream a2() {
        return new a();
    }

    @Override // sf.InterfaceC9683i
    public final long b1(byte b11, long j11, long j12) {
        if (this.f98668c) {
            throw new IllegalStateException("closed");
        }
        if (0 > j11 || j11 > j12) {
            StringBuilder d11 = C2702w.d(j11, "fromIndex=", " toIndex=");
            d11.append(j12);
            throw new IllegalArgumentException(d11.toString().toString());
        }
        long j13 = j11;
        while (j13 < j12) {
            byte b12 = b11;
            long j14 = j12;
            long b13 = this.f98667b.b1(b12, j13, j14);
            if (b13 == -1) {
                C9681g c9681g = this.f98667b;
                long size = c9681g.size();
                if (size >= j14 || this.f98666a.read(c9681g, 8192L) == -1) {
                    break;
                }
                j13 = Math.max(j13, size);
                b11 = b12;
                j12 = j14;
            } else {
                return b13;
            }
        }
        return -1L;
    }

    public final boolean c() {
        if (this.f98668c) {
            throw new IllegalStateException("closed");
        }
        C9681g c9681g = this.f98667b;
        return c9681g.m() && this.f98666a.read(c9681g, 8192L) == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f98668c) {
            return;
        }
        this.f98668c = true;
        this.f98666a.close();
        this.f98667b.c();
    }

    @NotNull
    public final C9684j d(long j11) {
        r1(j11);
        return this.f98667b.w(j11);
    }

    @Override // sf.InterfaceC9683i
    @NotNull
    public final C9681g f() {
        return this.f98667b;
    }

    @Override // sf.InterfaceC9683i
    @NotNull
    public final byte[] g0() {
        M m11 = this.f98666a;
        C9681g c9681g = this.f98667b;
        c9681g.y0(m11);
        return c9681g.g0();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f98668c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        r1 = new java.lang.StringBuilder("Expected a digit or '-' but was 0x");
        r2 = java.lang.Integer.toString(r8, kotlin.text.CharsKt.checkRadix(kotlin.text.CharsKt.checkRadix(16)));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "toString(this, checkRadix(radix))");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long j() {
        C9681g c9681g;
        r1(1L);
        long j11 = 0;
        while (true) {
            long j12 = j11 + 1;
            boolean n11 = n(j12);
            c9681g = this.f98667b;
            if (!n11) {
                break;
            }
            byte o11 = c9681g.o(j11);
            if ((o11 < 48 || o11 > 57) && !(j11 == 0 && o11 == 45)) {
                break;
            }
            j11 = j12;
        }
        return c9681g.x();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        r1 = new java.lang.StringBuilder("Expected leading [0-9a-fA-F] character but was 0x");
        r2 = java.lang.Integer.toString(r2, kotlin.text.CharsKt.checkRadix(kotlin.text.CharsKt.checkRadix(16)));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "toString(this, checkRadix(radix))");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long k() {
        C9681g c9681g;
        r1(1L);
        int i11 = 0;
        while (true) {
            int i12 = i11 + 1;
            boolean n11 = n(i12);
            c9681g = this.f98667b;
            if (!n11) {
                break;
            }
            byte o11 = c9681g.o(i11);
            if ((o11 < 48 || o11 > 57) && ((o11 < 97 || o11 > 102) && (o11 < 65 || o11 > 70))) {
                break;
            }
            i11 = i12;
        }
        return c9681g.y();
    }

    public final int m() {
        r1(4L);
        return this.f98667b.z();
    }

    @Override // sf.InterfaceC9683i
    public final boolean n(long j11) {
        C9681g c9681g;
        if (j11 < 0) {
            throw new IllegalArgumentException(C3173b.b(j11, "byteCount < 0: ").toString());
        }
        if (this.f98668c) {
            throw new IllegalStateException("closed");
        }
        do {
            c9681g = this.f98667b;
            if (c9681g.size() >= j11) {
                return true;
            }
        } while (this.f98666a.read(c9681g, 8192L) != -1);
        return false;
    }

    @Override // sf.InterfaceC9683i
    public final long n0(@NotNull C9684j bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (this.f98668c) {
            throw new IllegalStateException("closed");
        }
        long j11 = 0;
        while (true) {
            C9681g c9681g = this.f98667b;
            long p11 = c9681g.p(j11, bytes);
            if (p11 != -1) {
                return p11;
            }
            long size = c9681g.size();
            if (this.f98666a.read(c9681g, 8192L) == -1) {
                return -1L;
            }
            j11 = Math.max(j11, (size - bytes.g()) + 1);
        }
    }

    public final int o() {
        r1(4L);
        return C9676b.h(this.f98667b.z());
    }

    @Override // sf.InterfaceC9683i
    public final long o1(@NotNull InterfaceC9682h sink) {
        C9681g c9681g;
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j11 = 0;
        while (true) {
            M m11 = this.f98666a;
            c9681g = this.f98667b;
            if (m11.read(c9681g, 8192L) == -1) {
                break;
            }
            long j12 = c9681g.j();
            if (j12 > 0) {
                j11 += j12;
                sink.z0(c9681g, j12);
            }
        }
        if (c9681g.size() <= 0) {
            return j11;
        }
        long size = c9681g.size() + j11;
        sink.z0(c9681g, c9681g.size());
        return size;
    }

    public final long p() {
        r1(8L);
        long readLong = this.f98667b.readLong();
        int i11 = C9676b.f98695c;
        return ((readLong & 255) << 56) | (((-72057594037927936L) & readLong) >>> 56) | ((71776119061217280L & readLong) >>> 40) | ((280375465082880L & readLong) >>> 24) | ((1095216660480L & readLong) >>> 8) | ((4278190080L & readLong) << 8) | ((16711680 & readLong) << 24) | ((65280 & readLong) << 40);
    }

    @Override // sf.InterfaceC9683i
    @NotNull
    public final G peek() {
        return z.d(new E(this));
    }

    public final short q() {
        r1(2L);
        return this.f98667b.B();
    }

    @NotNull
    public final String r(long j11) {
        r1(j11);
        C9681g c9681g = this.f98667b;
        c9681g.getClass();
        return c9681g.I(j11, Charsets.UTF_8);
    }

    @Override // sf.InterfaceC9683i
    public final void r1(long j11) {
        if (!n(j11)) {
            throw new EOFException();
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(@NotNull ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        C9681g c9681g = this.f98667b;
        if (c9681g.size() == 0 && this.f98666a.read(c9681g, 8192L) == -1) {
            return -1;
        }
        return c9681g.read(sink);
    }

    @Override // sf.InterfaceC9683i
    public final byte readByte() {
        r1(1L);
        return this.f98667b.readByte();
    }

    @Override // sf.InterfaceC9683i
    public final void readFully(@NotNull byte[] sink) {
        C9681g c9681g = this.f98667b;
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            r1(sink.length);
            c9681g.readFully(sink);
        } catch (EOFException e11) {
            int i11 = 0;
            while (c9681g.size() > 0) {
                int s11 = c9681g.s(sink, i11, (int) c9681g.size());
                if (s11 == -1) {
                    throw new AssertionError();
                }
                i11 += s11;
            }
            throw e11;
        }
    }

    @Override // sf.InterfaceC9683i
    public final long readLong() {
        r1(8L);
        return this.f98667b.readLong();
    }

    @Override // sf.InterfaceC9683i
    public final short readShort() {
        r1(2L);
        return this.f98667b.readShort();
    }

    @NotNull
    public final String s(long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException(C3173b.b(j11, "limit < 0: ").toString());
        }
        long j12 = j11 == Long.MAX_VALUE ? Long.MAX_VALUE : j11 + 1;
        long b12 = b1((byte) 10, 0L, j12);
        C9681g c9681g = this.f98667b;
        if (b12 != -1) {
            return C9869a.c(c9681g, b12);
        }
        if (j12 < Long.MAX_VALUE && n(j12) && c9681g.o(j12 - 1) == 13 && n(j12 + 1) && c9681g.o(j12) == 10) {
            return C9869a.c(c9681g, j12);
        }
        C9681g c9681g2 = new C9681g();
        c9681g.k(c9681g2, 0L, Math.min(32, c9681g.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(c9681g.size(), j11) + " content=" + c9681g2.v0().h() + (char) 8230);
    }

    @Override // sf.InterfaceC9683i
    public final void skip(long j11) {
        if (this.f98668c) {
            throw new IllegalStateException("closed");
        }
        while (j11 > 0) {
            C9681g c9681g = this.f98667b;
            if (c9681g.size() == 0 && this.f98666a.read(c9681g, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j11, c9681g.size());
            c9681g.skip(min);
            j11 -= min;
        }
    }

    @Override // sf.InterfaceC9683i
    @NotNull
    public final String t0(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        M m11 = this.f98666a;
        C9681g c9681g = this.f98667b;
        c9681g.y0(m11);
        return c9681g.t0(charset);
    }

    @Override // sf.M
    @NotNull
    public final N timeout() {
        return this.f98666a.timeout();
    }

    @NotNull
    public final String toString() {
        return "buffer(" + this.f98666a + ')';
    }

    @Override // sf.InterfaceC9683i
    @NotNull
    public final C9684j v0() {
        M m11 = this.f98666a;
        C9681g c9681g = this.f98667b;
        c9681g.y0(m11);
        return c9681g.v0();
    }

    @Override // sf.InterfaceC9683i
    public final boolean w1(long j11, @NotNull C9684j bytes) {
        int i11;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int g10 = bytes.g();
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (this.f98668c) {
            throw new IllegalStateException("closed");
        }
        if (j11 >= 0 && g10 >= 0 && bytes.g() >= g10) {
            for (0; i11 < g10; i11 + 1) {
                long j12 = i11 + j11;
                i11 = (n(1 + j12) && this.f98667b.o(j12) == bytes.n(i11)) ? i11 + 1 : 0;
            }
            return true;
        }
        return false;
    }

    @Override // sf.M
    public final long read(@NotNull C9681g sink, long j11) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j11 >= 0) {
            if (!this.f98668c) {
                C9681g c9681g = this.f98667b;
                if (c9681g.size() == 0 && this.f98666a.read(c9681g, 8192L) == -1) {
                    return -1L;
                }
                return c9681g.read(sink, Math.min(j11, c9681g.size()));
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(C3173b.b(j11, "byteCount < 0: ").toString());
    }

    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public final int available() {
            G g10 = G.this;
            if (g10.f98668c) {
                throw new IOException("closed");
            }
            return (int) Math.min(g10.f98667b.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            G.this.close();
        }

        @Override // java.io.InputStream
        public final int read() {
            G g10 = G.this;
            if (g10.f98668c) {
                throw new IOException("closed");
            }
            C9681g c9681g = g10.f98667b;
            if (c9681g.size() == 0 && g10.f98666a.read(c9681g, 8192L) == -1) {
                return -1;
            }
            return c9681g.readByte() & 255;
        }

        @NotNull
        public final String toString() {
            return G.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(@NotNull byte[] data, int i11, int i12) {
            Intrinsics.checkNotNullParameter(data, "data");
            G g10 = G.this;
            if (!g10.f98668c) {
                C9676b.b(data.length, i11, i12);
                C9681g c9681g = g10.f98667b;
                if (c9681g.size() == 0 && g10.f98666a.read(c9681g, 8192L) == -1) {
                    return -1;
                }
                return c9681g.s(data, i11, i12);
            }
            throw new IOException("closed");
        }
    }
}
