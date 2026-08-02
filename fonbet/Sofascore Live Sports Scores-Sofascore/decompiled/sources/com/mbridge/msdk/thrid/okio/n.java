package com.mbridge.msdk.thrid.okio;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.a70;
import defpackage.is8;
import defpackage.ljg;
import defpackage.ogj;
import defpackage.vxd;
import defpackage.yhk;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
final class n implements e {
    public final c a = new c();
    public final s b;
    boolean c;

    public n(s sVar) {
        if (sVar != null) {
            this.b = sVar;
        } else {
            yhk.s("source == null");
            throw null;
        }
    }

    public long a(byte b, long j, long j2) throws IOException {
        if (this.c) {
            a70.r("closed");
            return 0L;
        }
        if (j < 0 || j2 < j) {
            StringBuilder o = ljg.o("fromIndex=", j, " toIndex=");
            o.append(j2);
            throw new IllegalArgumentException(o.toString());
        }
        long j3 = j;
        while (j3 < j2) {
            byte b2 = b;
            long j4 = j2;
            long a2 = this.a.a(b2, j3, j4);
            if (a2 == -1) {
                c cVar = this.a;
                long j5 = cVar.b;
                if (j5 >= j4 || this.b.b(cVar, 8192L) == -1) {
                    break;
                }
                j3 = Math.max(j3, j5);
                b = b2;
                j2 = j4;
            } else {
                return a2;
            }
        }
        return -1L;
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public long b(c cVar, long j) throws IOException {
        if (cVar == null) {
            a70.p("sink == null");
            return 0L;
        }
        if (j < 0) {
            a70.p(vxd.l(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.c) {
            a70.r("closed");
            return 0L;
        }
        c cVar2 = this.a;
        if (cVar2.b == 0 && this.b.b(cVar2, 8192L) == -1) {
            return -1L;
        }
        return this.a.b(cVar, Math.min(j, this.a.b));
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public byte[] c(long j) throws IOException {
        e(j);
        return this.a.c(j);
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.close();
        this.a.k();
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public String d(long j) throws IOException {
        if (j < 0) {
            a70.p(vxd.l(j, "limit < 0: "));
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long a2 = a((byte) 10, 0L, j2);
        if (a2 != -1) {
            return this.a.h(a2);
        }
        if (j2 < Long.MAX_VALUE && f(j2) && this.a.f(j2 - 1) == 13 && f(j2 + 1) && this.a.f(j2) == 10) {
            return this.a.h(j2);
        }
        c cVar = new c();
        c cVar2 = this.a;
        cVar2.a(cVar, 0L, Math.min(32L, cVar2.size()));
        a70.k(cVar.o().g(), Math.min(this.a.size(), j));
        return null;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public int e() throws IOException {
        e(4L);
        return this.a.e();
    }

    public boolean f(long j) throws IOException {
        c cVar;
        if (j < 0) {
            a70.p(vxd.l(j, "byteCount < 0: "));
            return false;
        }
        if (this.c) {
            a70.r("closed");
            return false;
        }
        do {
            cVar = this.a;
            if (cVar.b >= j) {
                return true;
            }
        } while (this.b.b(cVar, 8192L) != -1);
        return false;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public short g() throws IOException {
        e(2L);
        return this.a.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(r2)));
     */
    @Override // com.mbridge.msdk.thrid.okio.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long i() throws IOException {
        e(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!f(i2)) {
                break;
            }
            byte f = this.a.f(i);
            if ((f < 48 || f > 57) && ((f < 97 || f > 102) && (f < 65 || f > 70))) {
                break;
            }
            i = i2;
        }
        return this.a.i();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.c;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public InputStream j() {
        return new a();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        c cVar = this.a;
        if (cVar.b == 0 && this.b.b(cVar, 8192L) == -1) {
            return -1;
        }
        return this.a.read(byteBuffer);
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public byte readByte() throws IOException {
        e(1L);
        return this.a.readByte();
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void readFully(byte[] bArr) throws IOException {
        try {
            e(bArr.length);
            this.a.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                c cVar = this.a;
                long j = cVar.b;
                if (j <= 0) {
                    throw e;
                }
                int read = cVar.read(bArr, i, (int) j);
                if (read == -1) {
                    ogj.b();
                    return;
                }
                i += read;
            }
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public int readInt() throws IOException {
        e(4L);
        return this.a.readInt();
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public short readShort() throws IOException {
        e(2L);
        return this.a.readShort();
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void skip(long j) throws IOException {
        if (this.c) {
            a70.r("closed");
            return;
        }
        while (j > 0) {
            c cVar = this.a;
            if (cVar.b == 0 && this.b.b(cVar, 8192L) == -1) {
                a70.q();
                return;
            } else {
                long min = Math.min(j, this.a.size());
                this.a.skip(min);
                j -= min;
            }
        }
    }

    public String toString() {
        return "buffer(" + this.b + ")";
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public String c() throws IOException {
        return d(Long.MAX_VALUE);
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void e(long j) throws IOException {
        if (f(j)) {
            return;
        }
        a70.q();
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public boolean f() throws IOException {
        if (!this.c) {
            return this.a.f() && this.b.b(this.a, 8192L) == -1;
        }
        a70.r("closed");
        return false;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            n nVar = n.this;
            if (!nVar.c) {
                return (int) Math.min(nVar.a.b, 2147483647L);
            }
            is8.e("closed");
            return 0;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            n.this.close();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (n.this.c) {
                is8.e("closed");
                return 0;
            }
            u.a(bArr.length, i, i2);
            n nVar = n.this;
            c cVar = nVar.a;
            if (cVar.b == 0 && nVar.b.b(cVar, 8192L) == -1) {
                return -1;
            }
            return n.this.a.read(bArr, i, i2);
        }

        public String toString() {
            return n.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            n nVar = n.this;
            if (!nVar.c) {
                c cVar = nVar.a;
                if (cVar.b == 0 && nVar.b.b(cVar, 8192L) == -1) {
                    return -1;
                }
                return n.this.a.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            }
            is8.e("closed");
            return 0;
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public f b(long j) throws IOException {
        e(j);
        return this.a.b(j);
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return this.b.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public String a(Charset charset) throws IOException {
        if (charset != null) {
            this.a.a(this.b);
            return this.a.a(charset);
        }
        a70.p("charset == null");
        return null;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public long a(byte b) throws IOException {
        return a(b, 0L, Long.MAX_VALUE);
    }

    @Override // com.mbridge.msdk.thrid.okio.e, com.mbridge.msdk.thrid.okio.d
    public c a() {
        return this.a;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public boolean a(long j, f fVar) throws IOException {
        return a(j, fVar, 0, fVar.j());
    }

    public boolean a(long j, f fVar, int i, int i2) throws IOException {
        if (!this.c) {
            if (j < 0 || i < 0 || i2 < 0 || fVar.j() - i < i2) {
                return false;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = i3 + j;
                if (!f(1 + j2) || this.a.f(j2) != fVar.a(i + i3)) {
                    return false;
                }
            }
            return true;
        }
        a70.r("closed");
        return false;
    }
}
