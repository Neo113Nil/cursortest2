package ti;

import com.plaid.internal.EnumC3631g;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.UByte;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Typography;
import okhttp3.internal.connection.RealConnection;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.Nullable;
import ui.AbstractC6589a;

/* renamed from: ti.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6478h implements InterfaceC6480j, InterfaceC6479i, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    public C6468B f65857a;

    /* renamed from: b, reason: collision with root package name */
    public long f65858b;

    /* renamed from: ti.h$a */
    public static final class a implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        public C6478h f65859a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f65860b;

        /* renamed from: c, reason: collision with root package name */
        public C6468B f65861c;

        @JvmField
        @Nullable
        public byte[] data;

        /* renamed from: d, reason: collision with root package name */
        public long f65862d = -1;

        /* renamed from: e, reason: collision with root package name */
        public int f65863e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f65864f = -1;

        public final int B(long j10) {
            C6468B c6468b;
            C6478h c6478h = this.f65859a;
            if (c6478h == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j10 < -1 || j10 > c6478h.size()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + j10 + " > size=" + c6478h.size());
            }
            if (j10 == -1 || j10 == c6478h.size()) {
                J(null);
                this.f65862d = j10;
                this.data = null;
                this.f65863e = -1;
                this.f65864f = -1;
                return -1;
            }
            long size = c6478h.size();
            C6468B c6468b2 = c6478h.f65857a;
            long j11 = 0;
            if (d() != null) {
                long j12 = this.f65862d;
                int i10 = this.f65863e;
                Intrinsics.checkNotNull(d());
                long j13 = j12 - (i10 - r9.f65835a);
                if (j13 > j10) {
                    c6468b = c6468b2;
                    c6468b2 = d();
                    size = j13;
                } else {
                    c6468b = d();
                    j11 = j13;
                }
            } else {
                c6468b = c6468b2;
            }
            if (size - j10 > j10 - j11) {
                while (true) {
                    Intrinsics.checkNotNull(c6468b);
                    int i11 = c6468b.f65836b;
                    int i12 = c6468b.f65835a;
                    if (j10 < (i11 - i12) + j11) {
                        break;
                    }
                    j11 += i11 - i12;
                    c6468b = c6468b.f65839e;
                }
            } else {
                while (size > j10) {
                    Intrinsics.checkNotNull(c6468b2);
                    c6468b2 = c6468b2.f65840f;
                    Intrinsics.checkNotNull(c6468b2);
                    size -= c6468b2.f65836b - c6468b2.f65835a;
                }
                j11 = size;
                c6468b = c6468b2;
            }
            if (this.f65860b) {
                Intrinsics.checkNotNull(c6468b);
                if (c6468b.f65837c) {
                    C6468B f10 = c6468b.f();
                    if (c6478h.f65857a == c6468b) {
                        c6478h.f65857a = f10;
                    }
                    c6468b = c6468b.c(f10);
                    C6468B c6468b3 = c6468b.f65840f;
                    Intrinsics.checkNotNull(c6468b3);
                    c6468b3.b();
                }
            }
            J(c6468b);
            this.f65862d = j10;
            Intrinsics.checkNotNull(c6468b);
            this.data = c6468b.data;
            int i13 = c6468b.f65835a + ((int) (j10 - j11));
            this.f65863e = i13;
            int i14 = c6468b.f65836b;
            this.f65864f = i14;
            return i14 - i13;
        }

        public final void J(C6468B c6468b) {
            this.f65861c = c6468b;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f65859a == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f65859a = null;
            J(null);
            this.f65862d = -1L;
            this.data = null;
            this.f65863e = -1;
            this.f65864f = -1;
        }

        public final C6468B d() {
            return this.f65861c;
        }

        public final int k() {
            long j10 = this.f65862d;
            C6478h c6478h = this.f65859a;
            Intrinsics.checkNotNull(c6478h);
            if (j10 == c6478h.size()) {
                throw new IllegalStateException("no more bytes");
            }
            long j11 = this.f65862d;
            return B(j11 == -1 ? 0L : j11 + (this.f65864f - this.f65863e));
        }

        public final long r(long j10) {
            C6478h c6478h = this.f65859a;
            if (c6478h == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.f65860b) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long size = c6478h.size();
            if (j10 <= size) {
                if (j10 < 0) {
                    throw new IllegalArgumentException(("newSize < 0: " + j10).toString());
                }
                long j11 = size - j10;
                while (true) {
                    if (j11 <= 0) {
                        break;
                    }
                    C6468B c6468b = c6478h.f65857a;
                    Intrinsics.checkNotNull(c6468b);
                    C6468B c6468b2 = c6468b.f65840f;
                    Intrinsics.checkNotNull(c6468b2);
                    int i10 = c6468b2.f65836b;
                    long j12 = i10 - c6468b2.f65835a;
                    if (j12 > j11) {
                        c6468b2.f65836b = i10 - ((int) j11);
                        break;
                    }
                    c6478h.f65857a = c6468b2.b();
                    C6469C.b(c6468b2);
                    j11 -= j12;
                }
                J(null);
                this.f65862d = j10;
                this.data = null;
                this.f65863e = -1;
                this.f65864f = -1;
            } else if (j10 > size) {
                long j13 = j10 - size;
                boolean z10 = true;
                while (j13 > 0) {
                    C6468B h22 = c6478h.h2(1);
                    int min = (int) Math.min(j13, 8192 - h22.f65836b);
                    h22.f65836b += min;
                    j13 -= min;
                    if (z10) {
                        J(h22);
                        this.f65862d = size;
                        this.data = h22.data;
                        int i11 = h22.f65836b;
                        this.f65863e = i11 - min;
                        this.f65864f = i11;
                        z10 = false;
                    }
                }
            }
            c6478h.e2(j10);
            return size;
        }
    }

    /* renamed from: ti.h$c */
    public static final class c extends OutputStream {
        public c() {
        }

        public String toString() {
            return C6478h.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            C6478h.this.writeByte(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i10, int i11) {
            Intrinsics.checkNotNullParameter(data, "data");
            C6478h.this.write(data, i10, i11);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }
    }

    public static /* synthetic */ a Y1(C6478h c6478h, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = AbstractC6475e.d();
        }
        return c6478h.T1(aVar);
    }

    public final byte A0(long j10) {
        AbstractC6475e.b(size(), j10, 1L);
        C6468B c6468b = this.f65857a;
        if (c6468b == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        if (size() - j10 < j10) {
            long size = size();
            while (size > j10) {
                c6468b = c6468b.f65840f;
                Intrinsics.checkNotNull(c6468b);
                size -= c6468b.f65836b - c6468b.f65835a;
            }
            Intrinsics.checkNotNull(c6468b);
            return c6468b.data[(int) ((c6468b.f65835a + j10) - size)];
        }
        long j11 = 0;
        while (true) {
            long j12 = (c6468b.f65836b - c6468b.f65835a) + j11;
            if (j12 > j10) {
                Intrinsics.checkNotNull(c6468b);
                return c6468b.data[(int) ((c6468b.f65835a + j10) - j11)];
            }
            c6468b = c6468b.f65839e;
            Intrinsics.checkNotNull(c6468b);
            j11 = j12;
        }
    }

    public final long B() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        C6468B c6468b = this.f65857a;
        Intrinsics.checkNotNull(c6468b);
        C6468B c6468b2 = c6468b.f65840f;
        Intrinsics.checkNotNull(c6468b2);
        return (c6468b2.f65836b >= 8192 || !c6468b2.f65838d) ? size : size - (r3 - c6468b2.f65835a);
    }

    @Override // ti.InterfaceC6480j
    public byte[] B0(long j10) {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j10];
        readFully(bArr);
        return bArr;
    }

    public long D0(byte b10, long j10, long j11) {
        C6468B c6468b;
        int i10;
        long j12 = 0;
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        if (j11 > size()) {
            j11 = size();
        }
        if (j10 == j11 || (c6468b = this.f65857a) == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            j12 = size();
            while (j12 > j10) {
                c6468b = c6468b.f65840f;
                Intrinsics.checkNotNull(c6468b);
                j12 -= c6468b.f65836b - c6468b.f65835a;
            }
            while (j12 < j11) {
                byte[] bArr = c6468b.data;
                int min = (int) Math.min(c6468b.f65836b, (c6468b.f65835a + j11) - j12);
                i10 = (int) ((c6468b.f65835a + j10) - j12);
                while (i10 < min) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                j12 += c6468b.f65836b - c6468b.f65835a;
                c6468b = c6468b.f65839e;
                Intrinsics.checkNotNull(c6468b);
                j10 = j12;
            }
            return -1L;
        }
        while (true) {
            long j13 = (c6468b.f65836b - c6468b.f65835a) + j12;
            if (j13 > j10) {
                break;
            }
            c6468b = c6468b.f65839e;
            Intrinsics.checkNotNull(c6468b);
            j12 = j13;
        }
        while (j12 < j11) {
            byte[] bArr2 = c6468b.data;
            int min2 = (int) Math.min(c6468b.f65836b, (c6468b.f65835a + j11) - j12);
            i10 = (int) ((c6468b.f65835a + j10) - j12);
            while (i10 < min2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            j12 += c6468b.f65836b - c6468b.f65835a;
            c6468b = c6468b.f65839e;
            Intrinsics.checkNotNull(c6468b);
            j10 = j12;
        }
        return -1L;
        return (i10 - c6468b.f65835a) + j12;
    }

    @Override // ti.InterfaceC6480j
    public void E(C6478h sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (size() >= j10) {
            sink.write(this, j10);
        } else {
            sink.write(this, size());
            throw new EOFException();
        }
    }

    @Override // ti.InterfaceC6480j
    public void G0(long j10) {
        if (this.f65858b < j10) {
            throw new EOFException();
        }
    }

    @Override // ti.InterfaceC6480j
    public String G1() {
        return b2(this.f65858b, Charsets.UTF_8);
    }

    public final C6478h J() {
        C6478h c6478h = new C6478h();
        if (size() == 0) {
            return c6478h;
        }
        C6468B c6468b = this.f65857a;
        Intrinsics.checkNotNull(c6468b);
        C6468B d10 = c6468b.d();
        c6478h.f65857a = d10;
        d10.f65840f = d10;
        d10.f65839e = d10;
        for (C6468B c6468b2 = c6468b.f65839e; c6468b2 != c6468b; c6468b2 = c6468b2.f65839e) {
            C6468B c6468b3 = d10.f65840f;
            Intrinsics.checkNotNull(c6468b3);
            Intrinsics.checkNotNull(c6468b2);
            c6468b3.c(c6468b2.d());
        }
        c6478h.e2(size());
        return c6478h;
    }

    @Override // ti.InterfaceC6480j
    public long K1(E sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.write(this, size);
        }
        return size;
    }

    @Override // ti.InterfaceC6480j
    public long N0(k bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return m1(bytes, 0L);
    }

    @Override // ti.InterfaceC6480j
    public k O0(long j10) {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        if (j10 < 4096) {
            return new k(B0(j10));
        }
        k g22 = g2((int) j10);
        skip(j10);
        return g22;
    }

    public final a T1(a unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return AbstractC6589a.a(this, unsafeCursor);
    }

    public final C6478h U(C6478h out, long j10, long j11) {
        Intrinsics.checkNotNullParameter(out, "out");
        long j12 = j10;
        AbstractC6475e.b(size(), j12, j11);
        if (j11 != 0) {
            out.e2(out.size() + j11);
            C6468B c6468b = this.f65857a;
            while (true) {
                Intrinsics.checkNotNull(c6468b);
                int i10 = c6468b.f65836b;
                int i11 = c6468b.f65835a;
                if (j12 < i10 - i11) {
                    break;
                }
                j12 -= i10 - i11;
                c6468b = c6468b.f65839e;
            }
            C6468B c6468b2 = c6468b;
            long j13 = j11;
            while (j13 > 0) {
                Intrinsics.checkNotNull(c6468b2);
                C6468B d10 = c6468b2.d();
                int i12 = d10.f65835a + ((int) j12);
                d10.f65835a = i12;
                d10.f65836b = Math.min(i12 + ((int) j13), d10.f65836b);
                C6468B c6468b3 = out.f65857a;
                if (c6468b3 == null) {
                    d10.f65840f = d10;
                    d10.f65839e = d10;
                    out.f65857a = d10;
                } else {
                    Intrinsics.checkNotNull(c6468b3);
                    C6468B c6468b4 = c6468b3.f65840f;
                    Intrinsics.checkNotNull(c6468b4);
                    c6468b4.c(d10);
                }
                j13 -= d10.f65836b - d10.f65835a;
                c6468b2 = c6468b2.f65839e;
                j12 = 0;
            }
        }
        return this;
    }

    @Override // ti.InterfaceC6479i
    public OutputStream U1() {
        return new c();
    }

    @Override // ti.InterfaceC6480j
    public byte[] W0() {
        return B0(size());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7 A[EDGE_INSN: B:40:0x00a7->B:37:0x00a7 BREAK  A[LOOP:0: B:4:0x000d->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    @Override // ti.InterfaceC6480j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long W1() {
        int i10;
        if (size() == 0) {
            throw new EOFException();
        }
        int i11 = 0;
        boolean z10 = false;
        long j10 = 0;
        do {
            C6468B c6468b = this.f65857a;
            Intrinsics.checkNotNull(c6468b);
            byte[] bArr = c6468b.data;
            int i12 = c6468b.f65835a;
            int i13 = c6468b.f65836b;
            while (i12 < i13) {
                byte b10 = bArr[i12];
                if (b10 >= 48 && b10 <= 57) {
                    i10 = b10 - 48;
                } else if (b10 >= 97 && b10 <= 102) {
                    i10 = b10 - 87;
                } else if (b10 >= 65 && b10 <= 70) {
                    i10 = b10 - 55;
                } else {
                    if (i11 == 0) {
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + AbstractC6475e.j(b10));
                    }
                    z10 = true;
                    if (i12 != i13) {
                        this.f65857a = c6468b.b();
                        C6469C.b(c6468b);
                    } else {
                        c6468b.f65835a = i12;
                    }
                    if (!z10) {
                        break;
                    }
                }
                if (((-1152921504606846976L) & j10) != 0) {
                    throw new NumberFormatException("Number too large: " + new C6478h().u1(j10).writeByte(b10).G1());
                }
                j10 = (j10 << 4) | i10;
                i12++;
                i11++;
            }
            if (i12 != i13) {
            }
            if (!z10) {
            }
        } while (this.f65857a != null);
        e2(size() - i11);
        return j10;
    }

    @Override // ti.InterfaceC6480j
    public String X(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = LongCompanionObject.MAX_VALUE;
        if (j10 != LongCompanionObject.MAX_VALUE) {
            j11 = j10 + 1;
        }
        long j12 = j11;
        long D02 = D0((byte) 10, 0L, j12);
        if (D02 != -1) {
            return AbstractC6589a.d(this, D02);
        }
        if (j12 < size() && A0(j12 - 1) == 13 && A0(j12) == 10) {
            return AbstractC6589a.d(this, j12);
        }
        C6478h c6478h = new C6478h();
        U(c6478h, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j10) + " content=" + c6478h.v1().k() + Typography.ellipsis);
    }

    @Override // ti.InterfaceC6480j
    public boolean X0() {
        return this.f65858b == 0;
    }

    @Override // ti.InterfaceC6480j
    public InputStream X1() {
        return new b();
    }

    @Override // ti.InterfaceC6479i
    public long Y(G source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = 0;
        while (true) {
            long read = source.read(this, 8192L);
            if (read == -1) {
                return j10;
            }
            j10 += read;
        }
    }

    public int Z1() {
        return AbstractC6475e.h(readInt());
    }

    public short a2() {
        return AbstractC6475e.i(readShort());
    }

    @Override // ti.InterfaceC6480j
    public boolean b1(long j10, k bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return y1(j10, bytes, 0, bytes.u());
    }

    public String b2(long j10, Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (this.f65858b < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        C6468B c6468b = this.f65857a;
        Intrinsics.checkNotNull(c6468b);
        int i10 = c6468b.f65835a;
        if (i10 + j10 > c6468b.f65836b) {
            return new String(B0(j10), charset);
        }
        int i11 = (int) j10;
        String str = new String(c6468b.data, i10, i11, charset);
        int i12 = c6468b.f65835a + i11;
        c6468b.f65835a = i12;
        this.f65858b -= j10;
        if (i12 == c6468b.f65836b) {
            this.f65857a = c6468b.b();
            C6469C.b(c6468b);
        }
        return str;
    }

    public String c2(long j10) {
        return b2(j10, Charsets.UTF_8);
    }

    public final long d() {
        return this.f65858b;
    }

    @Override // ti.InterfaceC6480j
    public int d0(w options) {
        Intrinsics.checkNotNullParameter(options, "options");
        int f10 = AbstractC6589a.f(this, options, false, 2, null);
        if (f10 == -1) {
            return -1;
        }
        skip(options.e()[f10].u());
        return f10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a2, code lost:
    
        e2(size() - r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ab, code lost:
    
        if (r2 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ad, code lost:
    
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b0, code lost:
    
        if (r1 >= r14) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b8, code lost:
    
        if (size() == r17) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ba, code lost:
    
        if (r2 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bc, code lost:
    
        r1 = "Expected a digit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e4, code lost:
    
        throw new java.lang.NumberFormatException(r1 + " but was 0x" + ti.AbstractC6475e.j(A0(r17)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bf, code lost:
    
        r1 = "Expected a digit or '-'";
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ea, code lost:
    
        throw new java.io.EOFException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00eb, code lost:
    
        if (r2 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ed, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ef, code lost:
    
        return -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00af, code lost:
    
        r14 = 1;
     */
    @Override // ti.InterfaceC6480j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long d1() {
        long j10;
        byte b10;
        long j11 = 0;
        if (size() == 0) {
            throw new EOFException();
        }
        int i10 = 0;
        boolean z10 = false;
        long j12 = 0;
        long j13 = -7;
        boolean z11 = false;
        loop0: while (true) {
            C6468B c6468b = this.f65857a;
            Intrinsics.checkNotNull(c6468b);
            byte[] bArr = c6468b.data;
            int i11 = c6468b.f65835a;
            int i12 = c6468b.f65836b;
            while (i11 < i12) {
                b10 = bArr[i11];
                if (b10 >= 48 && b10 <= 57) {
                    int i13 = 48 - b10;
                    if (j12 < -922337203685477580L) {
                        break loop0;
                    }
                    j10 = j11;
                    if (j12 == -922337203685477580L && i13 < j13) {
                        break loop0;
                    }
                    j12 = (j12 * 10) + i13;
                } else {
                    j10 = j11;
                    if (b10 != 45 || i10 != 0) {
                        z11 = true;
                        break;
                    }
                    j13--;
                    z10 = true;
                }
                i11++;
                i10++;
                j11 = j10;
            }
            j10 = j11;
            if (i11 == i12) {
                this.f65857a = c6468b.b();
                C6469C.b(c6468b);
            } else {
                c6468b.f65835a = i11;
            }
            if (z11 || this.f65857a == null) {
                break;
            }
            j11 = j10;
        }
        C6478h writeByte = new C6478h().I0(j12).writeByte(b10);
        if (!z10) {
            writeByte.readByte();
        }
        throw new NumberFormatException("Number too large: " + writeByte.G1());
    }

    public int d2() {
        int i10;
        int i11;
        int i12;
        if (size() == 0) {
            throw new EOFException();
        }
        byte A02 = A0(0L);
        if ((A02 & ByteCompanionObject.MIN_VALUE) == 0) {
            i10 = A02 & ByteCompanionObject.MAX_VALUE;
            i12 = 0;
            i11 = 1;
        } else if ((A02 & 224) == 192) {
            i10 = A02 & 31;
            i11 = 2;
            i12 = 128;
        } else if ((A02 & 240) == 224) {
            i10 = A02 & 15;
            i11 = 3;
            i12 = 2048;
        } else {
            if ((A02 & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i10 = A02 & 7;
            i11 = 4;
            i12 = PKIFailureInfo.notAuthorized;
        }
        long j10 = i11;
        if (size() < j10) {
            throw new EOFException("size < " + i11 + ": " + size() + " (to read code point prefixed 0x" + AbstractC6475e.j(A02) + ')');
        }
        for (int i13 = 1; i13 < i11; i13++) {
            long j11 = i13;
            byte A03 = A0(j11);
            if ((A03 & 192) != 128) {
                skip(j11);
                return 65533;
            }
            i10 = (i10 << 6) | (A03 & 63);
        }
        skip(j10);
        if (i10 > 1114111) {
            return 65533;
        }
        if ((55296 > i10 || i10 >= 57344) && i10 >= i12) {
            return i10;
        }
        return 65533;
    }

    public final void e2(long j10) {
        this.f65858b = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6478h)) {
            return false;
        }
        C6478h c6478h = (C6478h) obj;
        if (size() != c6478h.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        C6468B c6468b = this.f65857a;
        Intrinsics.checkNotNull(c6468b);
        C6468B c6468b2 = c6478h.f65857a;
        Intrinsics.checkNotNull(c6468b2);
        int i10 = c6468b.f65835a;
        int i11 = c6468b2.f65835a;
        long j10 = 0;
        while (j10 < size()) {
            long min = Math.min(c6468b.f65836b - i10, c6468b2.f65836b - i11);
            long j11 = 0;
            while (j11 < min) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (c6468b.data[i10] != c6468b2.data[i11]) {
                    return false;
                }
                j11++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == c6468b.f65836b) {
                c6468b = c6468b.f65839e;
                Intrinsics.checkNotNull(c6468b);
                i10 = c6468b.f65835a;
            }
            if (i11 == c6468b2.f65836b) {
                c6468b2 = c6468b2.f65839e;
                Intrinsics.checkNotNull(c6468b2);
                i11 = c6468b2.f65835a;
            }
            j10 += min;
        }
        return true;
    }

    @Override // ti.InterfaceC6480j
    public long f1(k targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return n1(targetBytes, 0L);
    }

    public final k f2() {
        if (size() <= 2147483647L) {
            return g2((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    public final k g2(int i10) {
        if (i10 == 0) {
            return k.f65868d;
        }
        AbstractC6475e.b(size(), 0L, i10);
        C6468B c6468b = this.f65857a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Intrinsics.checkNotNull(c6468b);
            int i14 = c6468b.f65836b;
            int i15 = c6468b.f65835a;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            c6468b = c6468b.f65839e;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        C6468B c6468b2 = this.f65857a;
        int i16 = 0;
        while (i11 < i10) {
            Intrinsics.checkNotNull(c6468b2);
            bArr[i16] = c6468b2.data;
            i11 += c6468b2.f65836b - c6468b2.f65835a;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = c6468b2.f65835a;
            c6468b2.f65837c = true;
            i16++;
            c6468b2 = c6468b2.f65839e;
        }
        return new C6470D(bArr, iArr);
    }

    public final C6468B h2(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        C6468B c6468b = this.f65857a;
        if (c6468b != null) {
            Intrinsics.checkNotNull(c6468b);
            C6468B c6468b2 = c6468b.f65840f;
            Intrinsics.checkNotNull(c6468b2);
            return (c6468b2.f65836b + i10 > 8192 || !c6468b2.f65838d) ? c6468b2.c(C6469C.c()) : c6468b2;
        }
        C6468B c10 = C6469C.c();
        this.f65857a = c10;
        c10.f65840f = c10;
        c10.f65839e = c10;
        return c10;
    }

    public int hashCode() {
        C6468B c6468b = this.f65857a;
        if (c6468b == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = c6468b.f65836b;
            for (int i12 = c6468b.f65835a; i12 < i11; i12++) {
                i10 = (i10 * 31) + c6468b.data[i12];
            }
            c6468b = c6468b.f65839e;
            Intrinsics.checkNotNull(c6468b);
        } while (c6468b != this.f65857a);
        return i10;
    }

    @Override // ti.InterfaceC6479i
    /* renamed from: i2, reason: merged with bridge method [inline-methods] */
    public C6478h T0(k byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.z(this, 0, byteString.u());
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public C6478h j2(G source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        while (j10 > 0) {
            long read = source.read(this, j10);
            if (read == -1) {
                throw new EOFException();
            }
            j10 -= read;
        }
        return this;
    }

    public final void k() {
        skip(size());
    }

    @Override // ti.InterfaceC6479i
    /* renamed from: k2, reason: merged with bridge method [inline-methods] */
    public C6478h write(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return write(source, 0, source.length);
    }

    @Override // ti.InterfaceC6479i
    /* renamed from: l2, reason: merged with bridge method [inline-methods] */
    public C6478h write(byte[] source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = i11;
        AbstractC6475e.b(source.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            C6468B h22 = h2(1);
            int min = Math.min(i12 - i10, 8192 - h22.f65836b);
            int i13 = i10 + min;
            ArraysKt.copyInto(source, h22.data, h22.f65836b, i10, i13);
            h22.f65836b += min;
            i10 = i13;
        }
        e2(size() + j10);
        return this;
    }

    public long m1(k bytes, long j10) {
        int i10;
        long j11 = j10;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.u() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j12 = 0;
        if (j11 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j11).toString());
        }
        C6468B c6468b = this.f65857a;
        if (c6468b == null) {
            return -1L;
        }
        if (size() - j11 >= j11) {
            while (true) {
                long j13 = (c6468b.f65836b - c6468b.f65835a) + j12;
                if (j13 > j11) {
                    break;
                }
                c6468b = c6468b.f65839e;
                Intrinsics.checkNotNull(c6468b);
                j12 = j13;
            }
            byte[] l10 = bytes.l();
            byte b10 = l10[0];
            int u10 = bytes.u();
            long size = (size() - u10) + 1;
            while (j12 < size) {
                byte[] bArr = c6468b.data;
                int min = (int) Math.min(c6468b.f65836b, (c6468b.f65835a + size) - j12);
                i10 = (int) ((c6468b.f65835a + j11) - j12);
                while (i10 < min) {
                    if (bArr[i10] == b10 && AbstractC6589a.c(c6468b, i10 + 1, l10, 1, u10)) {
                    }
                    i10++;
                }
                j12 += c6468b.f65836b - c6468b.f65835a;
                c6468b = c6468b.f65839e;
                Intrinsics.checkNotNull(c6468b);
                j11 = j12;
            }
            return -1L;
        }
        j12 = size();
        while (j12 > j11) {
            c6468b = c6468b.f65840f;
            Intrinsics.checkNotNull(c6468b);
            j12 -= c6468b.f65836b - c6468b.f65835a;
        }
        byte[] l11 = bytes.l();
        byte b11 = l11[0];
        int u11 = bytes.u();
        long size2 = (size() - u11) + 1;
        while (j12 < size2) {
            byte[] bArr2 = c6468b.data;
            long j14 = size2;
            int min2 = (int) Math.min(c6468b.f65836b, (c6468b.f65835a + size2) - j12);
            i10 = (int) ((c6468b.f65835a + j11) - j12);
            while (i10 < min2) {
                if (bArr2[i10] != b11 || !AbstractC6589a.c(c6468b, i10 + 1, l11, 1, u11)) {
                    i10++;
                }
            }
            j12 += c6468b.f65836b - c6468b.f65835a;
            c6468b = c6468b.f65839e;
            Intrinsics.checkNotNull(c6468b);
            j11 = j12;
            size2 = j14;
        }
        return -1L;
        return (i10 - c6468b.f65835a) + j12;
    }

    @Override // ti.InterfaceC6479i
    /* renamed from: m2, reason: merged with bridge method [inline-methods] */
    public C6478h writeByte(int i10) {
        C6468B h22 = h2(1);
        byte[] bArr = h22.data;
        int i11 = h22.f65836b;
        h22.f65836b = i11 + 1;
        bArr[i11] = (byte) i10;
        e2(size() + 1);
        return this;
    }

    public long n1(k targetBytes, long j10) {
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long j11 = 0;
        if (j10 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j10).toString());
        }
        C6468B c6468b = this.f65857a;
        if (c6468b == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            j11 = size();
            while (j11 > j10) {
                c6468b = c6468b.f65840f;
                Intrinsics.checkNotNull(c6468b);
                j11 -= c6468b.f65836b - c6468b.f65835a;
            }
            if (targetBytes.u() == 2) {
                byte f10 = targetBytes.f(0);
                byte f11 = targetBytes.f(1);
                while (j11 < size()) {
                    byte[] bArr = c6468b.data;
                    i10 = (int) ((c6468b.f65835a + j10) - j11);
                    int i12 = c6468b.f65836b;
                    while (i10 < i12) {
                        byte b10 = bArr[i10];
                        if (b10 != f10 && b10 != f11) {
                            i10++;
                        }
                        i11 = c6468b.f65835a;
                    }
                    j11 += c6468b.f65836b - c6468b.f65835a;
                    c6468b = c6468b.f65839e;
                    Intrinsics.checkNotNull(c6468b);
                    j10 = j11;
                }
            } else {
                byte[] l10 = targetBytes.l();
                while (j11 < size()) {
                    byte[] bArr2 = c6468b.data;
                    i10 = (int) ((c6468b.f65835a + j10) - j11);
                    int i13 = c6468b.f65836b;
                    while (i10 < i13) {
                        byte b11 = bArr2[i10];
                        for (byte b12 : l10) {
                            if (b11 == b12) {
                                i11 = c6468b.f65835a;
                            }
                        }
                        i10++;
                    }
                    j11 += c6468b.f65836b - c6468b.f65835a;
                    c6468b = c6468b.f65839e;
                    Intrinsics.checkNotNull(c6468b);
                    j10 = j11;
                }
            }
            return -1L;
        }
        while (true) {
            long j12 = (c6468b.f65836b - c6468b.f65835a) + j11;
            if (j12 > j10) {
                break;
            }
            c6468b = c6468b.f65839e;
            Intrinsics.checkNotNull(c6468b);
            j11 = j12;
        }
        if (targetBytes.u() == 2) {
            byte f12 = targetBytes.f(0);
            byte f13 = targetBytes.f(1);
            while (j11 < size()) {
                byte[] bArr3 = c6468b.data;
                i10 = (int) ((c6468b.f65835a + j10) - j11);
                int i14 = c6468b.f65836b;
                while (i10 < i14) {
                    byte b13 = bArr3[i10];
                    if (b13 != f12 && b13 != f13) {
                        i10++;
                    }
                    i11 = c6468b.f65835a;
                }
                j11 += c6468b.f65836b - c6468b.f65835a;
                c6468b = c6468b.f65839e;
                Intrinsics.checkNotNull(c6468b);
                j10 = j11;
            }
        } else {
            byte[] l11 = targetBytes.l();
            while (j11 < size()) {
                byte[] bArr4 = c6468b.data;
                i10 = (int) ((c6468b.f65835a + j10) - j11);
                int i15 = c6468b.f65836b;
                while (i10 < i15) {
                    byte b14 = bArr4[i10];
                    for (byte b15 : l11) {
                        if (b14 == b15) {
                            i11 = c6468b.f65835a;
                        }
                    }
                    i10++;
                }
                j11 += c6468b.f65836b - c6468b.f65835a;
                c6468b = c6468b.f65839e;
                Intrinsics.checkNotNull(c6468b);
                j10 = j11;
            }
        }
        return -1L;
        return (i10 - i11) + j11;
    }

    @Override // ti.InterfaceC6479i
    /* renamed from: n2, reason: merged with bridge method [inline-methods] */
    public C6478h I0(long j10) {
        boolean z10;
        if (j10 == 0) {
            return writeByte(48);
        }
        int i10 = 1;
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return h0("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (j10 >= 100000000) {
            i10 = j10 < 1000000000000L ? j10 < RealConnection.IDLE_CONNECTION_HEALTHY_NS ? j10 < 1000000000 ? 9 : 10 : j10 < 100000000000L ? 11 : 12 : j10 < 1000000000000000L ? j10 < 10000000000000L ? 13 : j10 < 100000000000000L ? 14 : 15 : j10 < 100000000000000000L ? j10 < 10000000000000000L ? 16 : 17 : j10 < 1000000000000000000L ? 18 : 19;
        } else if (j10 >= 10000) {
            i10 = j10 < 1000000 ? j10 < 100000 ? 5 : 6 : j10 < 10000000 ? 7 : 8;
        } else if (j10 >= 100) {
            i10 = j10 < 1000 ? 3 : 4;
        } else if (j10 >= 10) {
            i10 = 2;
        }
        if (z10) {
            i10++;
        }
        C6468B h22 = h2(i10);
        byte[] bArr = h22.data;
        int i11 = h22.f65836b + i10;
        while (j10 != 0) {
            long j11 = 10;
            i11--;
            bArr[i11] = AbstractC6589a.b()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i11 - 1] = 45;
        }
        h22.f65836b += i10;
        e2(size() + i10);
        return this;
    }

    @Override // ti.InterfaceC6479i
    /* renamed from: o2, reason: merged with bridge method [inline-methods] */
    public C6478h u1(long j10) {
        if (j10 == 0) {
            return writeByte(48);
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + 3) / 4);
        C6468B h22 = h2(i10);
        byte[] bArr = h22.data;
        int i11 = h22.f65836b;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = AbstractC6589a.b()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        h22.f65836b += i10;
        e2(size() + i10);
        return this;
    }

    @Override // ti.InterfaceC6479i
    /* renamed from: p2, reason: merged with bridge method [inline-methods] */
    public C6478h writeInt(int i10) {
        C6468B h22 = h2(4);
        byte[] bArr = h22.data;
        int i11 = h22.f65836b;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        h22.f65836b = i11 + 4;
        e2(size() + 4);
        return this;
    }

    @Override // ti.InterfaceC6480j
    public InterfaceC6480j peek() {
        return t.d(new y(this));
    }

    @Override // ti.InterfaceC6480j
    public String q1(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return b2(this.f65858b, charset);
    }

    public C6478h q2(int i10) {
        return writeInt(AbstractC6475e.h(i10));
    }

    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public C6478h clone() {
        return J();
    }

    public C6478h r2(long j10) {
        C6468B h22 = h2(8);
        byte[] bArr = h22.data;
        int i10 = h22.f65836b;
        bArr[i10] = (byte) ((j10 >>> 56) & 255);
        bArr[i10 + 1] = (byte) ((j10 >>> 48) & 255);
        bArr[i10 + 2] = (byte) ((j10 >>> 40) & 255);
        bArr[i10 + 3] = (byte) ((j10 >>> 32) & 255);
        bArr[i10 + 4] = (byte) ((j10 >>> 24) & 255);
        bArr[i10 + 5] = (byte) ((j10 >>> 16) & 255);
        bArr[i10 + 6] = (byte) ((j10 >>> 8) & 255);
        bArr[i10 + 7] = (byte) (j10 & 255);
        h22.f65836b = i10 + 8;
        e2(size() + 8);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        C6468B c6468b = this.f65857a;
        if (c6468b == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), c6468b.f65836b - c6468b.f65835a);
        sink.put(c6468b.data, c6468b.f65835a, min);
        int i10 = c6468b.f65835a + min;
        c6468b.f65835a = i10;
        this.f65858b -= min;
        if (i10 == c6468b.f65836b) {
            this.f65857a = c6468b.b();
            C6469C.b(c6468b);
        }
        return min;
    }

    @Override // ti.InterfaceC6480j
    public byte readByte() {
        if (size() == 0) {
            throw new EOFException();
        }
        C6468B c6468b = this.f65857a;
        Intrinsics.checkNotNull(c6468b);
        int i10 = c6468b.f65835a;
        int i11 = c6468b.f65836b;
        int i12 = i10 + 1;
        byte b10 = c6468b.data[i10];
        e2(size() - 1);
        if (i12 != i11) {
            c6468b.f65835a = i12;
            return b10;
        }
        this.f65857a = c6468b.b();
        C6469C.b(c6468b);
        return b10;
    }

    @Override // ti.InterfaceC6480j
    public void readFully(byte[] sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int read = read(sink, i10, sink.length - i10);
            if (read == -1) {
                throw new EOFException();
            }
            i10 += read;
        }
    }

    @Override // ti.InterfaceC6480j
    public int readInt() {
        if (size() < 4) {
            throw new EOFException();
        }
        C6468B c6468b = this.f65857a;
        Intrinsics.checkNotNull(c6468b);
        int i10 = c6468b.f65835a;
        int i11 = c6468b.f65836b;
        if (i11 - i10 < 4) {
            return ((readByte() & UByte.MAX_VALUE) << 24) | ((readByte() & UByte.MAX_VALUE) << 16) | ((readByte() & UByte.MAX_VALUE) << 8) | (readByte() & UByte.MAX_VALUE);
        }
        byte[] bArr = c6468b.data;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i10] & UByte.MAX_VALUE) << 24) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & UByte.MAX_VALUE) | i13;
        e2(size() - 4);
        if (i14 != i11) {
            c6468b.f65835a = i14;
            return i15;
        }
        this.f65857a = c6468b.b();
        C6469C.b(c6468b);
        return i15;
    }

    @Override // ti.InterfaceC6480j
    public long readLong() {
        if (size() < 8) {
            throw new EOFException();
        }
        C6468B c6468b = this.f65857a;
        Intrinsics.checkNotNull(c6468b);
        int i10 = c6468b.f65835a;
        int i11 = c6468b.f65836b;
        if (i11 - i10 < 8) {
            return ((readInt() & BodyPartID.bodyIdMax) << 32) | (BodyPartID.bodyIdMax & readInt());
        }
        byte[] bArr = c6468b.data;
        int i12 = i10 + 7;
        long j10 = ((bArr[i10] & 255) << 56) | ((bArr[i10 + 1] & 255) << 48) | ((bArr[i10 + 2] & 255) << 40) | ((bArr[i10 + 3] & 255) << 32) | ((bArr[i10 + 4] & 255) << 24) | ((bArr[i10 + 5] & 255) << 16) | ((bArr[i10 + 6] & 255) << 8);
        int i13 = i10 + 8;
        long j11 = j10 | (bArr[i12] & 255);
        e2(size() - 8);
        if (i13 != i11) {
            c6468b.f65835a = i13;
            return j11;
        }
        this.f65857a = c6468b.b();
        C6469C.b(c6468b);
        return j11;
    }

    @Override // ti.InterfaceC6480j
    public short readShort() {
        if (size() < 2) {
            throw new EOFException();
        }
        C6468B c6468b = this.f65857a;
        Intrinsics.checkNotNull(c6468b);
        int i10 = c6468b.f65835a;
        int i11 = c6468b.f65836b;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & UByte.MAX_VALUE) << 8) | (readByte() & UByte.MAX_VALUE));
        }
        byte[] bArr = c6468b.data;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & UByte.MAX_VALUE) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & UByte.MAX_VALUE) | i13;
        e2(size() - 2);
        if (i14 == i11) {
            this.f65857a = c6468b.b();
            C6469C.b(c6468b);
        } else {
            c6468b.f65835a = i14;
        }
        return (short) i15;
    }

    @Override // ti.InterfaceC6479i
    /* renamed from: s2, reason: merged with bridge method [inline-methods] */
    public C6478h writeShort(int i10) {
        C6468B h22 = h2(2);
        byte[] bArr = h22.data;
        int i11 = h22.f65836b;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        h22.f65836b = i11 + 2;
        e2(size() + 2);
        return this;
    }

    public final long size() {
        return this.f65858b;
    }

    @Override // ti.InterfaceC6480j
    public void skip(long j10) {
        while (j10 > 0) {
            C6468B c6468b = this.f65857a;
            if (c6468b == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j10, c6468b.f65836b - c6468b.f65835a);
            long j11 = min;
            e2(size() - j11);
            j10 -= j11;
            int i10 = c6468b.f65835a + min;
            c6468b.f65835a = i10;
            if (i10 == c6468b.f65836b) {
                this.f65857a = c6468b.b();
                C6469C.b(c6468b);
            }
        }
    }

    public C6478h t2(String string, int i10, int i11, Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (i11 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + string.length()).toString());
        }
        if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
            return q0(string, i10, i11);
        }
        String substring = string.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        byte[] bytes = substring.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return write(bytes, 0, bytes.length);
    }

    @Override // ti.G
    public H timeout() {
        return H.NONE;
    }

    public String toString() {
        return f2().toString();
    }

    public C6478h u2(String string, Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return t2(string, 0, string.length(), charset);
    }

    @Override // ti.InterfaceC6480j
    public boolean v0(long j10) {
        return this.f65858b >= j10;
    }

    @Override // ti.InterfaceC6480j
    public k v1() {
        return O0(size());
    }

    @Override // ti.InterfaceC6479i
    /* renamed from: v2, reason: merged with bridge method [inline-methods] */
    public C6478h h0(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return q0(string, 0, string.length());
    }

    @Override // ti.InterfaceC6479i
    /* renamed from: w2, reason: merged with bridge method [inline-methods] */
    public C6478h q0(String string, int i10, int i11) {
        char charAt;
        Intrinsics.checkNotNullParameter(string, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (i11 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + string.length()).toString());
        }
        while (i10 < i11) {
            char charAt2 = string.charAt(i10);
            if (charAt2 < 128) {
                C6468B h22 = h2(1);
                byte[] bArr = h22.data;
                int i12 = h22.f65836b - i10;
                int min = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) charAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= min || (charAt = string.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) charAt;
                }
                int i14 = h22.f65836b;
                int i15 = (i12 + i10) - i14;
                h22.f65836b = i14 + i15;
                e2(size() + i15);
            } else {
                if (charAt2 < 2048) {
                    C6468B h23 = h2(2);
                    byte[] bArr2 = h23.data;
                    int i16 = h23.f65836b;
                    bArr2[i16] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i16 + 1] = (byte) ((charAt2 & '?') | 128);
                    h23.f65836b = i16 + 2;
                    e2(size() + 2);
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    C6468B h24 = h2(3);
                    byte[] bArr3 = h24.data;
                    int i17 = h24.f65836b;
                    bArr3[i17] = (byte) ((charAt2 >> '\f') | EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_CONFIRMED_CIRCLE_VALUE);
                    bArr3[i17 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((charAt2 & '?') | 128);
                    h24.f65836b = i17 + 3;
                    e2(size() + 3);
                } else {
                    int i18 = i10 + 1;
                    char charAt3 = i18 < i11 ? string.charAt(i18) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        writeByte(63);
                        i10 = i18;
                    } else {
                        int i19 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + PKIFailureInfo.notAuthorized;
                        C6468B h25 = h2(4);
                        byte[] bArr4 = h25.data;
                        int i20 = h25.f65836b;
                        bArr4[i20] = (byte) ((i19 >> 18) | EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                        h25.f65836b = i20 + 4;
                        e2(size() + 4);
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
        return this;
    }

    public C6478h x2(int i10) {
        if (i10 < 128) {
            writeByte(i10);
            return this;
        }
        if (i10 < 2048) {
            C6468B h22 = h2(2);
            byte[] bArr = h22.data;
            int i11 = h22.f65836b;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            h22.f65836b = i11 + 2;
            e2(size() + 2);
            return this;
        }
        if (55296 <= i10 && i10 < 57344) {
            writeByte(63);
            return this;
        }
        if (i10 < 65536) {
            C6468B h23 = h2(3);
            byte[] bArr2 = h23.data;
            int i12 = h23.f65836b;
            bArr2[i12] = (byte) ((i10 >> 12) | EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_CONFIRMED_CIRCLE_VALUE);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            h23.f65836b = i12 + 3;
            e2(size() + 3);
            return this;
        }
        if (i10 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + AbstractC6475e.k(i10));
        }
        C6468B h24 = h2(4);
        byte[] bArr3 = h24.data;
        int i13 = h24.f65836b;
        bArr3[i13] = (byte) ((i10 >> 18) | EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
        bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
        bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
        bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
        h24.f65836b = i13 + 4;
        e2(size() + 4);
        return this;
    }

    @Override // ti.InterfaceC6480j
    public String y0() {
        return X(LongCompanionObject.MAX_VALUE);
    }

    public boolean y1(long j10, k bytes, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (j10 < 0 || i10 < 0 || i11 < 0 || size() - j10 < i11 || bytes.u() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (A0(i12 + j10) != bytes.f(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ti.h$b */
    public static final class b extends InputStream {
        public b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C6478h.this.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream
        public int read() {
            if (C6478h.this.size() > 0) {
                return C6478h.this.readByte() & UByte.MAX_VALUE;
            }
            return -1;
        }

        public String toString() {
            return C6478h.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int i10, int i11) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return C6478h.this.read(sink, i10, i11);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        int remaining = source.remaining();
        int i10 = remaining;
        while (i10 > 0) {
            C6468B h22 = h2(1);
            int min = Math.min(i10, 8192 - h22.f65836b);
            source.get(h22.data, h22.f65836b, min);
            i10 -= min;
            h22.f65836b += min;
        }
        this.f65858b += remaining;
        return remaining;
    }

    public int read(byte[] sink, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        AbstractC6475e.b(sink.length, i10, i11);
        C6468B c6468b = this.f65857a;
        if (c6468b == null) {
            return -1;
        }
        int min = Math.min(i11, c6468b.f65836b - c6468b.f65835a);
        byte[] bArr = c6468b.data;
        int i12 = c6468b.f65835a;
        ArraysKt.copyInto(bArr, sink, i10, i12, i12 + min);
        c6468b.f65835a += min;
        e2(size() - min);
        if (c6468b.f65835a == c6468b.f65836b) {
            this.f65857a = c6468b.b();
            C6469C.b(c6468b);
        }
        return min;
    }

    @Override // ti.E
    public void write(C6478h source, long j10) {
        C6468B c6468b;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source != this) {
            AbstractC6475e.b(source.size(), 0L, j10);
            while (j10 > 0) {
                C6468B c6468b2 = source.f65857a;
                Intrinsics.checkNotNull(c6468b2);
                int i10 = c6468b2.f65836b;
                Intrinsics.checkNotNull(source.f65857a);
                if (j10 < i10 - r1.f65835a) {
                    C6468B c6468b3 = this.f65857a;
                    if (c6468b3 != null) {
                        Intrinsics.checkNotNull(c6468b3);
                        c6468b = c6468b3.f65840f;
                    } else {
                        c6468b = null;
                    }
                    if (c6468b != null && c6468b.f65838d) {
                        if ((c6468b.f65836b + j10) - (c6468b.f65837c ? 0 : c6468b.f65835a) <= 8192) {
                            C6468B c6468b4 = source.f65857a;
                            Intrinsics.checkNotNull(c6468b4);
                            c6468b4.g(c6468b, (int) j10);
                            source.e2(source.size() - j10);
                            e2(size() + j10);
                            return;
                        }
                    }
                    C6468B c6468b5 = source.f65857a;
                    Intrinsics.checkNotNull(c6468b5);
                    source.f65857a = c6468b5.e((int) j10);
                }
                C6468B c6468b6 = source.f65857a;
                Intrinsics.checkNotNull(c6468b6);
                long j11 = c6468b6.f65836b - c6468b6.f65835a;
                source.f65857a = c6468b6.b();
                C6468B c6468b7 = this.f65857a;
                if (c6468b7 == null) {
                    this.f65857a = c6468b6;
                    c6468b6.f65840f = c6468b6;
                    c6468b6.f65839e = c6468b6;
                } else {
                    Intrinsics.checkNotNull(c6468b7);
                    C6468B c6468b8 = c6468b7.f65840f;
                    Intrinsics.checkNotNull(c6468b8);
                    c6468b8.c(c6468b6).a();
                }
                source.e2(source.size() - j11);
                e2(size() + j11);
                j10 -= j11;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // ti.G
    public long read(C6478h sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (j10 > size()) {
            j10 = size();
        }
        sink.write(this, j10);
        return j10;
    }

    @Override // ti.G, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // ti.InterfaceC6479i, ti.E, java.io.Flushable
    public void flush() {
    }

    @Override // ti.InterfaceC6480j
    public C6478h h() {
        return this;
    }

    @Override // ti.InterfaceC6479i
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public C6478h A() {
        return this;
    }

    @Override // ti.InterfaceC6480j
    public C6478h y() {
        return this;
    }

    @Override // ti.InterfaceC6479i
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public C6478h W() {
        return this;
    }
}
