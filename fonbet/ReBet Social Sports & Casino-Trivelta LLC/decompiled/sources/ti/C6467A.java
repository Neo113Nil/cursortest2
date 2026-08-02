package ti;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.Typography;
import ui.AbstractC6589a;

/* renamed from: ti.A, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6467A implements InterfaceC6480j {

    /* renamed from: a, reason: collision with root package name */
    public final G f65830a;

    /* renamed from: b, reason: collision with root package name */
    public final C6478h f65831b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f65832c;

    public C6467A(G source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f65830a = source;
        this.f65831b = new C6478h();
    }

    public long B(k targetBytes, long j10) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        if (this.f65832c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long n12 = this.f65831b.n1(targetBytes, j10);
            if (n12 != -1) {
                return n12;
            }
            long size = this.f65831b.size();
            if (this.f65830a.read(this.f65831b, 8192L) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, size);
        }
    }

    @Override // ti.InterfaceC6480j
    public byte[] B0(long j10) {
        G0(j10);
        return this.f65831b.B0(j10);
    }

    @Override // ti.InterfaceC6480j
    public void E(C6478h sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            G0(j10);
            this.f65831b.E(sink, j10);
        } catch (EOFException e10) {
            sink.Y(this.f65831b);
            throw e10;
        }
    }

    @Override // ti.InterfaceC6480j
    public void G0(long j10) {
        if (!v0(j10)) {
            throw new EOFException();
        }
    }

    @Override // ti.InterfaceC6480j
    public String G1() {
        this.f65831b.Y(this.f65830a);
        return this.f65831b.G1();
    }

    public boolean J(long j10, k bytes, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (this.f65832c) {
            throw new IllegalStateException("closed");
        }
        if (j10 < 0 || i10 < 0 || i11 < 0 || bytes.u() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            long j11 = i12 + j10;
            if (!v0(1 + j11) || this.f65831b.A0(j11) != bytes.f(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    @Override // ti.InterfaceC6480j
    public long K1(E sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j10 = 0;
        while (this.f65830a.read(this.f65831b, 8192L) != -1) {
            long B10 = this.f65831b.B();
            if (B10 > 0) {
                j10 += B10;
                sink.write(this.f65831b, B10);
            }
        }
        if (this.f65831b.size() <= 0) {
            return j10;
        }
        long size = j10 + this.f65831b.size();
        C6478h c6478h = this.f65831b;
        sink.write(c6478h, c6478h.size());
        return size;
    }

    @Override // ti.InterfaceC6480j
    public long N0(k bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return r(bytes, 0L);
    }

    @Override // ti.InterfaceC6480j
    public k O0(long j10) {
        G0(j10);
        return this.f65831b.O0(j10);
    }

    public int U() {
        G0(4L);
        return this.f65831b.Z1();
    }

    @Override // ti.InterfaceC6480j
    public byte[] W0() {
        this.f65831b.Y(this.f65830a);
        return this.f65831b.W0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append("Expected leading [0-9a-fA-F] character but was 0x");
        r2 = java.lang.Integer.toString(r2, kotlin.text.CharsKt.checkRadix(kotlin.text.CharsKt.checkRadix(16)));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "toString(this, checkRadix(radix))");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // ti.InterfaceC6480j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long W1() {
        G0(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!v0(i11)) {
                break;
            }
            byte A02 = this.f65831b.A0(i10);
            if ((A02 < 48 || A02 > 57) && ((A02 < 97 || A02 > 102) && (A02 < 65 || A02 > 70))) {
                break;
            }
            i10 = i11;
        }
        return this.f65831b.W1();
    }

    @Override // ti.InterfaceC6480j
    public String X(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 == LongCompanionObject.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long k10 = k((byte) 10, 0L, j11);
        if (k10 != -1) {
            return AbstractC6589a.d(this.f65831b, k10);
        }
        if (j11 < LongCompanionObject.MAX_VALUE && v0(j11) && this.f65831b.A0(j11 - 1) == 13 && v0(j11 + 1) && this.f65831b.A0(j11) == 10) {
            return AbstractC6589a.d(this.f65831b, j11);
        }
        C6478h c6478h = new C6478h();
        C6478h c6478h2 = this.f65831b;
        c6478h2.U(c6478h, 0L, Math.min(32, c6478h2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f65831b.size(), j10) + " content=" + c6478h.v1().k() + Typography.ellipsis);
    }

    @Override // ti.InterfaceC6480j
    public boolean X0() {
        if (this.f65832c) {
            throw new IllegalStateException("closed");
        }
        return this.f65831b.X0() && this.f65830a.read(this.f65831b, 8192L) == -1;
    }

    @Override // ti.InterfaceC6480j
    public InputStream X1() {
        return new a();
    }

    @Override // ti.InterfaceC6480j
    public boolean b1(long j10, k bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return J(j10, bytes, 0, bytes.u());
    }

    @Override // ti.G, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f65832c) {
            return;
        }
        this.f65832c = true;
        this.f65830a.close();
        this.f65831b.k();
    }

    public long d(byte b10) {
        return k(b10, 0L, LongCompanionObject.MAX_VALUE);
    }

    @Override // ti.InterfaceC6480j
    public int d0(w options) {
        Intrinsics.checkNotNullParameter(options, "options");
        if (this.f65832c) {
            throw new IllegalStateException("closed");
        }
        do {
            int e10 = AbstractC6589a.e(this.f65831b, options, true);
            if (e10 != -2) {
                if (e10 == -1) {
                    return -1;
                }
                this.f65831b.skip(options.e()[e10].u());
                return e10;
            }
        } while (this.f65830a.read(this.f65831b, 8192L) != -1);
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append("Expected a digit or '-' but was 0x");
        r2 = java.lang.Integer.toString(r8, kotlin.text.CharsKt.checkRadix(kotlin.text.CharsKt.checkRadix(16)));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "toString(this, checkRadix(radix))");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // ti.InterfaceC6480j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long d1() {
        G0(1L);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            if (!v0(j11)) {
                break;
            }
            byte A02 = this.f65831b.A0(j10);
            if ((A02 < 48 || A02 > 57) && !(j10 == 0 && A02 == 45)) {
                break;
            }
            j10 = j11;
        }
        return this.f65831b.d1();
    }

    @Override // ti.InterfaceC6480j
    public long f1(k targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return B(targetBytes, 0L);
    }

    @Override // ti.InterfaceC6480j
    public C6478h h() {
        return this.f65831b;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f65832c;
    }

    public long k(byte b10, long j10, long j11) {
        if (this.f65832c) {
            throw new IllegalStateException("closed");
        }
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        long j12 = j10;
        while (j12 < j11) {
            byte b11 = b10;
            long j13 = j11;
            long D02 = this.f65831b.D0(b11, j12, j13);
            if (D02 == -1) {
                long size = this.f65831b.size();
                if (size >= j13 || this.f65830a.read(this.f65831b, 8192L) == -1) {
                    break;
                }
                j12 = Math.max(j12, size);
                b10 = b11;
                j11 = j13;
            } else {
                return D02;
            }
        }
        return -1L;
    }

    @Override // ti.InterfaceC6480j
    public InterfaceC6480j peek() {
        return t.d(new y(this));
    }

    @Override // ti.InterfaceC6480j
    public String q1(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.f65831b.Y(this.f65830a);
        return this.f65831b.q1(charset);
    }

    public long r(k bytes, long j10) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (this.f65832c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long m12 = this.f65831b.m1(bytes, j10);
            if (m12 != -1) {
                return m12;
            }
            long size = this.f65831b.size();
            if (this.f65830a.read(this.f65831b, 8192L) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, (size - bytes.u()) + 1);
        }
    }

    @Override // ti.G
    public long read(C6478h sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f65832c) {
            throw new IllegalStateException("closed");
        }
        if (this.f65831b.size() == 0 && this.f65830a.read(this.f65831b, 8192L) == -1) {
            return -1L;
        }
        return this.f65831b.read(sink, Math.min(j10, this.f65831b.size()));
    }

    @Override // ti.InterfaceC6480j
    public byte readByte() {
        G0(1L);
        return this.f65831b.readByte();
    }

    @Override // ti.InterfaceC6480j
    public void readFully(byte[] sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            G0(sink.length);
            this.f65831b.readFully(sink);
        } catch (EOFException e10) {
            int i10 = 0;
            while (this.f65831b.size() > 0) {
                C6478h c6478h = this.f65831b;
                int read = c6478h.read(sink, i10, (int) c6478h.size());
                if (read == -1) {
                    throw new AssertionError();
                }
                i10 += read;
            }
            throw e10;
        }
    }

    @Override // ti.InterfaceC6480j
    public int readInt() {
        G0(4L);
        return this.f65831b.readInt();
    }

    @Override // ti.InterfaceC6480j
    public long readLong() {
        G0(8L);
        return this.f65831b.readLong();
    }

    @Override // ti.InterfaceC6480j
    public short readShort() {
        G0(2L);
        return this.f65831b.readShort();
    }

    @Override // ti.InterfaceC6480j
    public void skip(long j10) {
        if (this.f65832c) {
            throw new IllegalStateException("closed");
        }
        while (j10 > 0) {
            if (this.f65831b.size() == 0 && this.f65830a.read(this.f65831b, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j10, this.f65831b.size());
            this.f65831b.skip(min);
            j10 -= min;
        }
    }

    @Override // ti.G
    public H timeout() {
        return this.f65830a.timeout();
    }

    public String toString() {
        return "buffer(" + this.f65830a + ')';
    }

    @Override // ti.InterfaceC6480j
    public boolean v0(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f65832c) {
            throw new IllegalStateException("closed");
        }
        while (this.f65831b.size() < j10) {
            if (this.f65830a.read(this.f65831b, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // ti.InterfaceC6480j
    public k v1() {
        this.f65831b.Y(this.f65830a);
        return this.f65831b.v1();
    }

    public short w0() {
        G0(2L);
        return this.f65831b.a2();
    }

    @Override // ti.InterfaceC6480j
    public C6478h y() {
        return this.f65831b;
    }

    @Override // ti.InterfaceC6480j
    public String y0() {
        return X(LongCompanionObject.MAX_VALUE);
    }

    /* renamed from: ti.A$a */
    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() {
            C6467A c6467a = C6467A.this;
            if (c6467a.f65832c) {
                throw new IOException("closed");
            }
            return (int) Math.min(c6467a.f65831b.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C6467A.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            C6467A c6467a = C6467A.this;
            if (c6467a.f65832c) {
                throw new IOException("closed");
            }
            if (c6467a.f65831b.size() == 0) {
                C6467A c6467a2 = C6467A.this;
                if (c6467a2.f65830a.read(c6467a2.f65831b, 8192L) == -1) {
                    return -1;
                }
            }
            return C6467A.this.f65831b.readByte() & UByte.MAX_VALUE;
        }

        public String toString() {
            return C6467A.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int i10, int i11) {
            Intrinsics.checkNotNullParameter(data, "data");
            if (!C6467A.this.f65832c) {
                AbstractC6475e.b(data.length, i10, i11);
                if (C6467A.this.f65831b.size() == 0) {
                    C6467A c6467a = C6467A.this;
                    if (c6467a.f65830a.read(c6467a.f65831b, 8192L) == -1) {
                        return -1;
                    }
                }
                return C6467A.this.f65831b.read(data, i10, i11);
            }
            throw new IOException("closed");
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.f65831b.size() == 0 && this.f65830a.read(this.f65831b, 8192L) == -1) {
            return -1;
        }
        return this.f65831b.read(sink);
    }
}
