package com.bumptech.glide.load.resource.bitmap;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public class F extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public int f29992a;

    /* renamed from: b, reason: collision with root package name */
    public int f29993b;
    private volatile byte[] buf;

    /* renamed from: c, reason: collision with root package name */
    public int f29994c;

    /* renamed from: d, reason: collision with root package name */
    public int f29995d;

    /* renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.b f29996e;

    public static class a extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        public a(String str) {
            super(str);
        }
    }

    public F(InputStream inputStream, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this(inputStream, bVar, PKIFailureInfo.notAuthorized);
    }

    public static IOException B() {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.buf == null || inputStream == null) {
            throw B();
        }
        return (this.f29992a - this.f29995d) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.buf != null) {
            this.f29996e.put(this.buf);
            this.buf = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final int d(InputStream inputStream, byte[] bArr) {
        int i10 = this.f29994c;
        if (i10 != -1) {
            int i11 = this.f29995d - i10;
            int i12 = this.f29993b;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f29992a == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f29996e.c(i12, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.buf = bArr2;
                    this.f29996e.put(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f29995d - this.f29994c;
                this.f29995d = i13;
                this.f29994c = 0;
                this.f29992a = 0;
                int read = inputStream.read(bArr, i13, bArr.length - i13);
                int i14 = this.f29995d;
                if (read > 0) {
                    i14 += read;
                }
                this.f29992a = i14;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f29994c = -1;
            this.f29995d = 0;
            this.f29992a = read2;
        }
        return read2;
    }

    public synchronized void k() {
        this.f29993b = this.buf.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        this.f29993b = Math.max(this.f29993b, i10);
        this.f29994c = this.f29995d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    public synchronized void r() {
        if (this.buf != null) {
            this.f29996e.put(this.buf);
            this.buf = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.buf;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw B();
        }
        if (this.f29995d >= this.f29992a && d(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.buf && (bArr = this.buf) == null) {
            throw B();
        }
        int i10 = this.f29992a;
        int i11 = this.f29995d;
        if (i10 - i11 <= 0) {
            return -1;
        }
        this.f29995d = i11 + 1;
        return bArr[i11] & UByte.MAX_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.buf == null) {
            throw new IOException("Stream is closed");
        }
        int i10 = this.f29994c;
        if (-1 == i10) {
            throw new a("Mark has been invalidated, pos: " + this.f29995d + " markLimit: " + this.f29993b);
        }
        this.f29995d = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j10) {
        if (j10 < 1) {
            return 0L;
        }
        byte[] bArr = this.buf;
        if (bArr == null) {
            throw B();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw B();
        }
        int i10 = this.f29992a;
        int i11 = this.f29995d;
        if (i10 - i11 >= j10) {
            this.f29995d = (int) (i11 + j10);
            return j10;
        }
        long j11 = i10 - i11;
        this.f29995d = i10;
        if (this.f29994c == -1 || j10 > this.f29993b) {
            long skip = inputStream.skip(j10 - j11);
            if (skip > 0) {
                this.f29994c = -1;
            }
            return j11 + skip;
        }
        if (d(inputStream, bArr) == -1) {
            return j11;
        }
        int i12 = this.f29992a;
        int i13 = this.f29995d;
        if (i12 - i13 >= j10 - j11) {
            this.f29995d = (int) ((i13 + j10) - j11);
            return j10;
        }
        long j12 = (j11 + i12) - i13;
        this.f29995d = i12;
        return j12;
    }

    public F(InputStream inputStream, com.bumptech.glide.load.engine.bitmap_recycle.b bVar, int i10) {
        super(inputStream);
        this.f29994c = -1;
        this.f29996e = bVar;
        this.buf = (byte[]) bVar.c(i10, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        byte[] bArr2 = this.buf;
        if (bArr2 == null) {
            throw B();
        }
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i14 = this.f29995d;
            int i15 = this.f29992a;
            if (i14 < i15) {
                int i16 = i15 - i14 >= i11 ? i11 : i15 - i14;
                System.arraycopy(bArr2, i14, bArr, i10, i16);
                this.f29995d += i16;
                if (i16 == i11 || inputStream.available() == 0) {
                    return i16;
                }
                i10 += i16;
                i12 = i11 - i16;
            } else {
                i12 = i11;
            }
            while (true) {
                if (this.f29994c == -1 && i12 >= bArr2.length) {
                    i13 = inputStream.read(bArr, i10, i12);
                    if (i13 == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                } else {
                    if (d(inputStream, bArr2) == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                    if (bArr2 != this.buf && (bArr2 = this.buf) == null) {
                        throw B();
                    }
                    int i17 = this.f29992a;
                    int i18 = this.f29995d;
                    i13 = i17 - i18 >= i12 ? i12 : i17 - i18;
                    System.arraycopy(bArr2, i18, bArr, i10, i13);
                    this.f29995d += i13;
                }
                i12 -= i13;
                if (i12 == 0) {
                    return i11;
                }
                if (inputStream.available() == 0) {
                    return i11 - i12;
                }
                i10 += i13;
            }
        } else {
            throw B();
        }
    }
}
