package bo.app;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes5.dex */
class w5 implements Closeable {
    private final InputStream b;
    private final Charset c;
    private byte[] d;
    private int e;
    private int f;

    class a extends ByteArrayOutputStream {
        a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0) {
                int i2 = i - 1;
                if (((ByteArrayOutputStream) this).buf[i2] == 13) {
                    i = i2;
                }
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, w5.this.c.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public w5(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    public boolean b() {
        return this.f == -1;
    }

    public String c() {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.b) {
            if (this.d == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.e >= this.f) {
                a();
            }
            for (int i3 = this.e; i3 != this.f; i3++) {
                byte[] bArr2 = this.d;
                if (bArr2[i3] == 10) {
                    int i4 = this.e;
                    if (i3 != i4) {
                        i2 = i3 - 1;
                        if (bArr2[i2] == 13) {
                            String str = new String(bArr2, i4, i2 - i4, this.c.name());
                            this.e = i3 + 1;
                            return str;
                        }
                    }
                    i2 = i3;
                    String str2 = new String(bArr2, i4, i2 - i4, this.c.name());
                    this.e = i3 + 1;
                    return str2;
                }
            }
            a aVar = new a((this.f - this.e) + 80);
            loop1: while (true) {
                byte[] bArr3 = this.d;
                int i5 = this.e;
                aVar.write(bArr3, i5, this.f - i5);
                this.f = -1;
                a();
                i = this.e;
                while (i != this.f) {
                    bArr = this.d;
                    if (bArr[i] == 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            int i6 = this.e;
            if (i != i6) {
                aVar.write(bArr, i6, i - i6);
            }
            this.e = i + 1;
            return aVar.toString();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.b) {
            if (this.d != null) {
                this.d = null;
                this.b.close();
            }
        }
    }

    public w5(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(y6.a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.b = inputStream;
        this.c = charset;
        this.d = new byte[i];
    }

    private void a() {
        InputStream inputStream = this.b;
        byte[] bArr = this.d;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.e = 0;
        this.f = read;
    }
}
