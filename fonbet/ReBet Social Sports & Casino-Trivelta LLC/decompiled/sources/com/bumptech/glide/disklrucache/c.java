package com.bumptech.glide.disklrucache;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class c implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f29552a;

    /* renamed from: b, reason: collision with root package name */
    public final Charset f29553b;
    private byte[] buf;

    /* renamed from: c, reason: collision with root package name */
    public int f29554c;

    /* renamed from: d, reason: collision with root package name */
    public int f29555d;

    public class a extends ByteArrayOutputStream {
        public a(int i10) {
            super(i10);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i10 = ((ByteArrayOutputStream) this).count;
            if (i10 > 0 && ((ByteArrayOutputStream) this).buf[i10 - 1] == 13) {
                i10--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i10, c.this.f29553b.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    public String B() {
        int i10;
        byte[] bArr;
        int i11;
        synchronized (this.f29552a) {
            try {
                if (this.buf == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f29554c >= this.f29555d) {
                    k();
                }
                for (int i12 = this.f29554c; i12 != this.f29555d; i12++) {
                    byte[] bArr2 = this.buf;
                    if (bArr2[i12] == 10) {
                        int i13 = this.f29554c;
                        if (i12 != i13) {
                            i11 = i12 - 1;
                            if (bArr2[i11] == 13) {
                                String str = new String(bArr2, i13, i11 - i13, this.f29553b.name());
                                this.f29554c = i12 + 1;
                                return str;
                            }
                        }
                        i11 = i12;
                        String str2 = new String(bArr2, i13, i11 - i13, this.f29553b.name());
                        this.f29554c = i12 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f29555d - this.f29554c) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.buf;
                    int i14 = this.f29554c;
                    aVar.write(bArr3, i14, this.f29555d - i14);
                    this.f29555d = -1;
                    k();
                    i10 = this.f29554c;
                    while (i10 != this.f29555d) {
                        bArr = this.buf;
                        if (bArr[i10] == 10) {
                            break loop1;
                        }
                        i10++;
                    }
                }
                int i15 = this.f29554c;
                if (i10 != i15) {
                    aVar.write(bArr, i15, i10 - i15);
                }
                this.f29554c = i10 + 1;
                return aVar.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f29552a) {
            try {
                if (this.buf != null) {
                    this.buf = null;
                    this.f29552a.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k() {
        InputStream inputStream = this.f29552a;
        byte[] bArr = this.buf;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.f29554c = 0;
        this.f29555d = read;
    }

    public boolean r() {
        return this.f29555d == -1;
    }

    public c(InputStream inputStream, int i10, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(d.f29557a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f29552a = inputStream;
        this.f29553b = charset;
        this.buf = new byte[i10];
    }
}
