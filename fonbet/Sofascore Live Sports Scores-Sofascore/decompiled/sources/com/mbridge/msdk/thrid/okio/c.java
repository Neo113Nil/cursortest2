package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import defpackage.a70;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.ilg;
import defpackage.ljg;
import defpackage.lnb;
import defpackage.ogj;
import defpackage.vxd;
import defpackage.x5n;
import defpackage.yhk;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class c implements e, d, Cloneable, ByteChannel {
    private static final byte[] c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    @Nullable
    o a;
    long b;

    public c a(String str, int i, int i2) {
        char charAt;
        if (str == null) {
            a70.p("string == null");
            return null;
        }
        if (i < 0) {
            a70.p(ljg.j(i, "beginIndex < 0: "));
            return null;
        }
        if (i2 < i) {
            a70.p(dmi.k(i2, i, "endIndex < beginIndex: ", " < "));
            return null;
        }
        if (i2 > str.length()) {
            yhk.h(str.length(), lnb.t(i2, "endIndex > string.length: ", " > "));
            return null;
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                o b = b(1);
                byte[] bArr = b.a;
                int i3 = b.c - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = b.c;
                int i6 = (i3 + i) - i5;
                b.c = i5 + i6;
                this.b += i6;
            } else {
                if (charAt2 < 2048) {
                    writeByte((charAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                    writeByte((charAt2 & '?') | 128);
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    writeByte((charAt2 >> '\f') | 224);
                    writeByte(((charAt2 >> 6) & 63) | 128);
                    writeByte((charAt2 & '?') | 128);
                } else {
                    int i7 = i + 1;
                    char charAt3 = i7 < i2 ? str.charAt(i7) : (char) 0;
                    if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                        writeByte(63);
                        i = i7;
                    } else {
                        int i8 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + C.DEFAULT_BUFFER_SEGMENT_SIZE;
                        writeByte((i8 >> 18) | 240);
                        writeByte(((i8 >> 12) & 63) | 128);
                        writeByte(((i8 >> 6) & 63) | 128);
                        writeByte((i8 & 63) | 128);
                        i += 2;
                    }
                }
                i++;
            }
        }
        return this;
    }

    public o b(int i) {
        if (i < 1 || i > 8192) {
            ilg.c();
            return null;
        }
        o oVar = this.a;
        if (oVar != null) {
            o oVar2 = oVar.g;
            return (oVar2.c + i > 8192 || !oVar2.e) ? oVar2.a(p.a()) : oVar2;
        }
        o a2 = p.a();
        this.a = a2;
        a2.g = a2;
        a2.f = a2;
        return a2;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public byte[] c(long j) throws EOFException {
        u.a(this.b, 0L, j);
        if (j > 2147483647L) {
            a70.p(vxd.l(j, "byteCount > Integer.MAX_VALUE: "));
            return null;
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public String d(long j) throws EOFException {
        if (j < 0) {
            a70.p(vxd.l(j, "limit < 0: "));
            return null;
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long a2 = a((byte) 10, 0L, j2);
        if (a2 != -1) {
            return h(a2);
        }
        if (j2 < size() && f(j2 - 1) == 13 && f(j2) == 10) {
            return h(j2);
        }
        c cVar = new c();
        a(cVar, 0L, Math.min(32L, size()));
        a70.k(cVar.o().g(), Math.min(size(), j));
        return null;
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public c writeShort(int i) {
        o b = b(2);
        byte[] bArr = b.a;
        int i2 = b.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        b.c = i2 + 2;
        this.b += 2;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        long j = this.b;
        if (j != cVar.b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        o oVar = this.a;
        o oVar2 = cVar.a;
        int i = oVar.b;
        int i2 = oVar2.b;
        while (j2 < this.b) {
            long min = Math.min(oVar.c - i, oVar2.c - i2);
            int i3 = 0;
            while (i3 < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (oVar.a[i] != oVar2.a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == oVar.c) {
                oVar = oVar.f;
                i = oVar.b;
            }
            if (i2 == oVar2.c) {
                oVar2 = oVar2.f;
                i2 = oVar2.b;
            }
            j2 += min;
        }
        return true;
    }

    public c f(int i) {
        if (i < 128) {
            writeByte(i);
            return this;
        }
        if (i < 2048) {
            writeByte((i >> 6) | PsExtractor.AUDIO_STREAM);
            writeByte((i & 63) | 128);
            return this;
        }
        if (i < 65536) {
            if (i >= 55296 && i <= 57343) {
                writeByte(63);
                return this;
            }
            writeByte((i >> 12) | 224);
            writeByte(((i >> 6) & 63) | 128);
            writeByte((i & 63) | 128);
            return this;
        }
        if (i > 1114111) {
            a70.p(bf3.i(i, new StringBuilder("Unexpected code point: ")));
            return null;
        }
        writeByte((i >> 18) | 240);
        writeByte(((i >> 12) & 63) | 128);
        writeByte(((i >> 6) & 63) | 128);
        writeByte((i & 63) | 128);
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public short g() {
        return u.a(readShort());
    }

    public String h(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (f(j2) == 13) {
                String g = g(j2);
                skip(2L);
                return g;
            }
        }
        String g2 = g(j);
        skip(1L);
        return g2;
    }

    public int hashCode() {
        o oVar = this.a;
        if (oVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = oVar.c;
            for (int i3 = oVar.b; i3 < i2; i3++) {
                i = (i * 31) + oVar.a[i3];
            }
            oVar = oVar.f;
        } while (oVar != this.a);
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095 A[EDGE_INSN: B:40:0x0095->B:37:0x0095 BREAK  A[LOOP:0: B:4:0x000b->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d  */
    @Override // com.mbridge.msdk.thrid.okio.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long i() {
        int i;
        if (this.b == 0) {
            a70.r("size == 0");
            return 0L;
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            o oVar = this.a;
            byte[] bArr = oVar.a;
            int i3 = oVar.b;
            int i4 = oVar.c;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else if (b >= 65 && b <= 70) {
                    i = b - 55;
                } else {
                    if (i2 == 0) {
                        throw new NumberFormatException(bf3.i(b, new StringBuilder("Expected leading [0-9a-fA-F] character but was 0x")));
                    }
                    z = true;
                    if (i3 != i4) {
                        this.a = oVar.b();
                        p.a(oVar);
                    } else {
                        oVar.b = i3;
                    }
                    if (!z) {
                        break;
                    }
                }
                if (((-1152921504606846976L) & j) != 0) {
                    throw new NumberFormatException("Number too large: " + new c().a(j).writeByte((int) b).p());
                }
                j = (j << 4) | i;
                i3++;
                i2++;
            }
            if (i3 != i4) {
            }
            if (!z) {
            }
        } while (this.a != null);
        this.b -= i2;
        return j;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public InputStream j() {
        return new a();
    }

    public final void k() {
        try {
            skip(this.b);
        } catch (EOFException e) {
            a70.j(e);
        }
    }

    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public c clone() {
        c cVar = new c();
        if (this.b == 0) {
            return cVar;
        }
        o c2 = this.a.c();
        cVar.a = c2;
        c2.g = c2;
        c2.f = c2;
        for (o oVar = this.a.f; oVar != this.a; oVar = oVar.f) {
            cVar.a.g.a(oVar.c());
        }
        cVar.b = this.b;
        return cVar;
    }

    public final long m() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        o oVar = this.a.g;
        return (oVar.c >= 8192 || !oVar.e) ? j : j - (r2 - oVar.b);
    }

    public byte[] n() {
        try {
            return c(this.b);
        } catch (EOFException e) {
            a70.j(e);
            return null;
        }
    }

    public f o() {
        return new f(n());
    }

    public String p() {
        try {
            return a(this.b, u.a);
        } catch (EOFException e) {
            a70.j(e);
            return null;
        }
    }

    public final f q() {
        long j = this.b;
        if (j <= 2147483647L) {
            return a((int) j);
        }
        ogj.f(this.b, "size > Integer.MAX_VALUE: ");
        return null;
    }

    public int read(byte[] bArr, int i, int i2) {
        u.a(bArr.length, i, i2);
        o oVar = this.a;
        if (oVar == null) {
            return -1;
        }
        int min = Math.min(i2, oVar.c - oVar.b);
        System.arraycopy(oVar.a, oVar.b, bArr, i, min);
        int i3 = oVar.b + min;
        oVar.b = i3;
        this.b -= min;
        if (i3 == oVar.c) {
            this.a = oVar.b();
            p.a(oVar);
        }
        return min;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public byte readByte() {
        long j = this.b;
        if (j == 0) {
            a70.r("size == 0");
            return (byte) 0;
        }
        o oVar = this.a;
        int i = oVar.b;
        int i2 = oVar.c;
        int i3 = i + 1;
        byte b = oVar.a[i];
        this.b = j - 1;
        if (i3 != i2) {
            oVar.b = i3;
            return b;
        }
        this.a = oVar.b();
        p.a(oVar);
        return b;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read == -1) {
                a70.q();
                return;
            }
            i += read;
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public int readInt() {
        long j = this.b;
        if (j < 4) {
            throw new IllegalStateException("size < 4: " + this.b);
        }
        o oVar = this.a;
        int i = oVar.b;
        int i2 = oVar.c;
        if (i2 - i < 4) {
            return (readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        }
        byte[] bArr = oVar.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i4;
        this.b = j - 4;
        if (i5 != i2) {
            oVar.b = i5;
            return i6;
        }
        this.a = oVar.b();
        p.a(oVar);
        return i6;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public short readShort() {
        long j = this.b;
        if (j < 2) {
            throw new IllegalStateException("size < 2: " + this.b);
        }
        o oVar = this.a;
        int i = oVar.b;
        int i2 = oVar.c;
        if (i2 - i < 2) {
            return (short) ((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8));
        }
        byte[] bArr = oVar.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i4;
        this.b = j - 2;
        if (i5 == i2) {
            this.a = oVar.b();
            p.a(oVar);
        } else {
            oVar.b = i5;
        }
        return (short) i6;
    }

    public final long size() {
        return this.b;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void skip(long j) throws EOFException {
        while (j > 0) {
            if (this.a == null) {
                a70.q();
                return;
            }
            int min = (int) Math.min(j, r0.c - r0.b);
            long j2 = min;
            this.b -= j2;
            j -= j2;
            o oVar = this.a;
            int i = oVar.b + min;
            oVar.b = i;
            if (i == oVar.c) {
                this.a = oVar.b();
                p.a(oVar);
            }
        }
    }

    public String toString() {
        return q().toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            a70.p("source == null");
            return 0;
        }
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            o b = b(1);
            int min = Math.min(i, 8192 - b.c);
            byteBuffer.get(b.a, b.c, min);
            i -= min;
            b.c += min;
        }
        this.b += remaining;
        return remaining;
    }

    public String g(long j) throws EOFException {
        return a(j, u.a);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(c.this.b, 2147483647L);
        }

        @Override // java.io.InputStream
        public int read() {
            c cVar = c.this;
            if (cVar.b > 0) {
                return cVar.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            }
            return -1;
        }

        public String toString() {
            return c.this + ".inputStream()";
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            return c.this.read(bArr, i, i2);
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.mbridge.msdk.thrid.okio.d, com.mbridge.msdk.thrid.okio.r, java.io.Flushable
    public void flush() {
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public String c() throws EOFException {
        return d(Long.MAX_VALUE);
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public c writeByte(int i) {
        o b = b(1);
        byte[] bArr = b.a;
        int i2 = b.c;
        b.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public int e() {
        return u.a(readInt());
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void e(long j) throws EOFException {
        if (this.b >= j) {
            return;
        }
        a70.q();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c a(String str) {
        return a(str, 0, str.length());
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public f b(long j) throws EOFException {
        return new f(c(j));
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public long b(c cVar, long j) {
        if (cVar == null) {
            a70.p("sink == null");
            return 0L;
        }
        if (j >= 0) {
            long j2 = this.b;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            cVar.a(this, j);
            return j;
        }
        a70.p(vxd.l(j, "byteCount < 0: "));
        return 0L;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        o oVar = this.a;
        if (oVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), oVar.c - oVar.b);
        byteBuffer.put(oVar.a, oVar.b, min);
        int i = oVar.b + min;
        oVar.b = i;
        this.b -= min;
        if (i == oVar.c) {
            this.a = oVar.b();
            p.a(oVar);
        }
        return min;
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return t.d;
    }

    public final byte f(long j) {
        u.a(this.b, j, 1L);
        long j2 = this.b;
        long j3 = j2 - j;
        o oVar = this.a;
        if (j3 > j) {
            long j4 = j;
            while (true) {
                int i = oVar.c;
                int i2 = oVar.b;
                long j5 = i - i2;
                if (j4 < j5) {
                    return oVar.a[i2 + ((int) j4)];
                }
                j4 -= j5;
                oVar = oVar.f;
            }
        } else {
            long j6 = j - j2;
            o oVar2 = oVar.g;
            while (true) {
                int i3 = oVar2.c;
                int i4 = oVar2.b;
                j6 += i3 - i4;
                if (j6 >= 0) {
                    return oVar2.a[i4 + ((int) j6)];
                }
                oVar2 = oVar2.g;
            }
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public boolean f() {
        return this.b == 0;
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public c writeInt(int i) {
        o b = b(4);
        byte[] bArr = b.a;
        int i2 = b.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        b.c = i2 + 4;
        this.b += 4;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public c a(long j) {
        if (j == 0) {
            return writeByte(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        o b = b(numberOfTrailingZeros);
        byte[] bArr = b.a;
        int i = b.c;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = c[(int) (15 & j)];
            j >>>= 4;
        }
        b.c += numberOfTrailingZeros;
        this.b += numberOfTrailingZeros;
        return this;
    }

    public final c a(c cVar, long j, long j2) {
        if (cVar != null) {
            long j3 = j;
            u.a(this.b, j3, j2);
            if (j2 != 0) {
                cVar.b += j2;
                o oVar = this.a;
                while (true) {
                    long j4 = oVar.c - oVar.b;
                    if (j3 < j4) {
                        break;
                    }
                    j3 -= j4;
                    oVar = oVar.f;
                }
                o oVar2 = oVar;
                long j5 = j2;
                while (j5 > 0) {
                    o c2 = oVar2.c();
                    int i = (int) (c2.b + j3);
                    c2.b = i;
                    c2.c = Math.min(i + ((int) j5), c2.c);
                    o oVar3 = cVar.a;
                    if (oVar3 == null) {
                        c2.g = c2;
                        c2.f = c2;
                        cVar.a = c2;
                    } else {
                        oVar3.g.a(c2);
                    }
                    j5 -= c2.c - c2.b;
                    oVar2 = oVar2.f;
                    j3 = 0;
                }
            }
            return this;
        }
        a70.p("out == null");
        return null;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public String a(Charset charset) {
        try {
            return a(this.b, charset);
        } catch (EOFException e) {
            a70.j(e);
            return null;
        }
    }

    public String a(long j, Charset charset) throws EOFException {
        u.a(this.b, 0L, j);
        if (charset == null) {
            a70.p("charset == null");
            return null;
        }
        if (j > 2147483647L) {
            a70.p(vxd.l(j, "byteCount > Integer.MAX_VALUE: "));
            return null;
        }
        if (j == 0) {
            return "";
        }
        o oVar = this.a;
        int i = oVar.b;
        if (i + j > oVar.c) {
            return new String(c(j), charset);
        }
        String str = new String(oVar.a, i, (int) j, charset);
        int i2 = (int) (oVar.b + j);
        oVar.b = i2;
        this.b -= j;
        if (i2 == oVar.c) {
            this.a = oVar.b();
            p.a(oVar);
        }
        return str;
    }

    public c a(f fVar) {
        if (fVar != null) {
            fVar.a(this);
            return this;
        }
        a70.p("byteString == null");
        return null;
    }

    @Override // com.mbridge.msdk.thrid.okio.e, com.mbridge.msdk.thrid.okio.d
    public c a() {
        return this;
    }

    public c a(String str, int i, int i2, Charset charset) {
        if (str == null) {
            a70.p("string == null");
            return null;
        }
        if (i < 0) {
            throw new IllegalAccessError(ljg.j(i, "beginIndex < 0: "));
        }
        if (i2 >= i) {
            if (i2 > str.length()) {
                yhk.h(str.length(), lnb.t(i2, "endIndex > string.length: ", " > "));
                return null;
            }
            if (charset != null) {
                if (charset.equals(u.a)) {
                    return a(str, i, i2);
                }
                byte[] bytes = str.substring(i, i2).getBytes(charset);
                return write(bytes, 0, bytes.length);
            }
            a70.p("charset == null");
            return null;
        }
        a70.p(dmi.k(i2, i, "endIndex < beginIndex: ", " < "));
        return null;
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public c write(byte[] bArr) {
        if (bArr != null) {
            return write(bArr, 0, bArr.length);
        }
        a70.p("source == null");
        return null;
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public c write(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = i2;
            u.a(bArr.length, i, j);
            int i3 = i2 + i;
            while (i < i3) {
                o b = b(1);
                int min = Math.min(i3 - i, 8192 - b.c);
                System.arraycopy(bArr, i, b.a, b.c, min);
                i += min;
                b.c += min;
            }
            this.b += j;
            return this;
        }
        a70.p("source == null");
        return null;
    }

    public long a(s sVar) throws IOException {
        long j = 0;
        if (sVar == null) {
            a70.p("source == null");
            return 0L;
        }
        while (true) {
            long b = sVar.b(this, 8192L);
            if (b == -1) {
                return j;
            }
            j += b;
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public void a(c cVar, long j) {
        if (cVar == null) {
            a70.p("source == null");
            return;
        }
        if (cVar != this) {
            u.a(cVar.b, 0L, j);
            while (j > 0) {
                o oVar = cVar.a;
                if (j < oVar.c - oVar.b) {
                    o oVar2 = this.a;
                    o oVar3 = oVar2 != null ? oVar2.g : null;
                    if (oVar3 != null && oVar3.e) {
                        if ((oVar3.c + j) - (oVar3.d ? 0 : oVar3.b) <= 8192) {
                            oVar.a(oVar3, (int) j);
                            cVar.b -= j;
                            this.b += j;
                            return;
                        }
                    }
                    oVar = oVar.a((int) j);
                    cVar.a = oVar;
                }
                long j2 = oVar.c - oVar.b;
                cVar.a = oVar.b();
                o oVar4 = this.a;
                if (oVar4 == null) {
                    this.a = oVar;
                    oVar.g = oVar;
                    oVar.f = oVar;
                } else {
                    oVar4.g.a(oVar).a();
                }
                cVar.b -= j2;
                this.b += j2;
                j -= j2;
            }
            return;
        }
        a70.p("source == this");
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public long a(byte b) {
        return a(b, 0L, Long.MAX_VALUE);
    }

    public long a(byte b, long j, long j2) {
        o oVar;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (j3 >= 0 && j4 >= j3) {
            long j6 = this.b;
            if (j4 > j6) {
                j4 = j6;
            }
            if (j3 == j4 || (oVar = this.a) == null) {
                return -1L;
            }
            if (j6 - j3 < j3) {
                while (j6 > j3) {
                    oVar = oVar.g;
                    j6 -= oVar.c - oVar.b;
                }
            } else {
                while (true) {
                    long j7 = (oVar.c - oVar.b) + j5;
                    if (j7 >= j3) {
                        break;
                    }
                    oVar = oVar.f;
                    j5 = j7;
                }
                j6 = j5;
            }
            while (j6 < j4) {
                byte[] bArr = oVar.a;
                int min = (int) Math.min(oVar.c, (oVar.b + j4) - j6);
                for (int i = (int) ((oVar.b + j3) - j6); i < min; i++) {
                    if (bArr[i] == b) {
                        return (i - oVar.b) + j6;
                    }
                }
                j6 += oVar.c - oVar.b;
                oVar = oVar.f;
                j3 = j6;
            }
            return -1L;
        }
        StringBuilder o = ljg.o("size=", this.b, " fromIndex=");
        o.append(j3);
        a70.p(x5n.m(j4, " toIndex=", o));
        return 0L;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public boolean a(long j, f fVar) {
        return a(j, fVar, 0, fVar.j());
    }

    public boolean a(long j, f fVar, int i, int i2) {
        if (j < 0 || i < 0 || i2 < 0 || this.b - j < i2 || fVar.j() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (f(i3 + j) != fVar.a(i + i3)) {
                return false;
            }
        }
        return true;
    }

    public final f a(int i) {
        if (i == 0) {
            return f.e;
        }
        return new q(this, i);
    }
}
