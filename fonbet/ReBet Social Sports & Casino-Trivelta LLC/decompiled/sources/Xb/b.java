package Xb;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public class b implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f13701a;

    /* renamed from: b, reason: collision with root package name */
    public final Charset f13702b;
    private byte[] buf;

    /* renamed from: c, reason: collision with root package name */
    public int f13703c;

    /* renamed from: d, reason: collision with root package name */
    public int f13704d;

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
                return new String(((ByteArrayOutputStream) this).buf, 0, i10, b.this.f13702b.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f13701a) {
            try {
                if (this.buf != null) {
                    this.buf = null;
                    this.f13701a.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k() {
        InputStream inputStream = this.f13701a;
        byte[] bArr = this.buf;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.f13703c = 0;
        this.f13704d = read;
    }

    public String r() {
        int i10;
        byte[] bArr;
        int i11;
        synchronized (this.f13701a) {
            try {
                if (this.buf == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f13703c >= this.f13704d) {
                    k();
                }
                for (int i12 = this.f13703c; i12 != this.f13704d; i12++) {
                    byte[] bArr2 = this.buf;
                    if (bArr2[i12] == 10) {
                        int i13 = this.f13703c;
                        if (i12 != i13) {
                            i11 = i12 - 1;
                            if (bArr2[i11] == 13) {
                                String str = new String(bArr2, i13, i11 - i13, this.f13702b.name());
                                this.f13703c = i12 + 1;
                                return str;
                            }
                        }
                        i11 = i12;
                        String str2 = new String(bArr2, i13, i11 - i13, this.f13702b.name());
                        this.f13703c = i12 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f13704d - this.f13703c) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.buf;
                    int i14 = this.f13703c;
                    aVar.write(bArr3, i14, this.f13704d - i14);
                    this.f13704d = -1;
                    k();
                    i10 = this.f13703c;
                    while (i10 != this.f13704d) {
                        bArr = this.buf;
                        if (bArr[i10] == 10) {
                            break loop1;
                        }
                        i10++;
                    }
                }
                int i15 = this.f13703c;
                if (i10 != i15) {
                    aVar.write(bArr, i15, i10 - i15);
                }
                this.f13703c = i10 + 1;
                return aVar.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(InputStream inputStream, int i10, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(c.f13706a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f13701a = inputStream;
        this.f13702b = charset;
        this.buf = new byte[i10];
    }
}
