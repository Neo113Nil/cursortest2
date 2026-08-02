package c6;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class y extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    private volatile byte[] f56609a;

    /* renamed from: b, reason: collision with root package name */
    private int f56610b;

    /* renamed from: c, reason: collision with root package name */
    private int f56611c;

    /* renamed from: d, reason: collision with root package name */
    private int f56612d;

    /* renamed from: e, reason: collision with root package name */
    private int f56613e;

    /* renamed from: f, reason: collision with root package name */
    private final W5.b f56614f;

    /* loaded from: classes8.dex */
    static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    public y(@NonNull InputStream inputStream, @NonNull W5.b bVar) {
        super(inputStream);
        this.f56612d = -1;
        this.f56614f = bVar;
        this.f56609a = (byte[]) bVar.b(65536, byte[].class);
    }

    private int c(InputStream inputStream, byte[] bArr) throws IOException {
        int i11 = this.f56612d;
        if (i11 != -1) {
            int i12 = this.f56613e - i11;
            int i13 = this.f56611c;
            if (i12 < i13) {
                if (i11 == 0 && i13 > bArr.length && this.f56610b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i13) {
                        i13 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f56614f.b(i13, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f56609a = bArr2;
                    this.f56614f.a(bArr);
                    bArr = bArr2;
                } else if (i11 > 0) {
                    System.arraycopy(bArr, i11, bArr, 0, bArr.length - i11);
                }
                int i14 = this.f56613e - this.f56612d;
                this.f56613e = i14;
                this.f56612d = 0;
                this.f56610b = 0;
                int read = inputStream.read(bArr, i14, bArr.length - i14);
                int i15 = this.f56613e;
                if (read > 0) {
                    i15 += read;
                }
                this.f56610b = i15;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f56612d = -1;
            this.f56613e = 0;
            this.f56610b = read2;
        }
        return read2;
    }

    private static void j() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f56609a == null || inputStream == null) {
            j();
            throw null;
        }
        return (this.f56610b - this.f56613e) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f56609a != null) {
            this.f56614f.a(this.f56609a);
            this.f56609a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final synchronized void d() {
        this.f56611c = this.f56609a.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i11) {
        this.f56611c = Math.max(this.f56611c, i11);
        this.f56612d = this.f56613e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() throws IOException {
        byte[] bArr = this.f56609a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            j();
            throw null;
        }
        if (this.f56613e >= this.f56610b && c(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f56609a && (bArr = this.f56609a) == null) {
            j();
            throw null;
        }
        int i11 = this.f56610b;
        int i12 = this.f56613e;
        if (i11 - i12 <= 0) {
            return -1;
        }
        this.f56613e = i12 + 1;
        return bArr[i12] & 255;
    }

    public final synchronized void release() {
        if (this.f56609a != null) {
            this.f56614f.a(this.f56609a);
            this.f56609a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        if (this.f56609a == null) {
            throw new IOException("Stream is closed");
        }
        int i11 = this.f56612d;
        if (-1 == i11) {
            throw new a("Mark has been invalidated, pos: " + this.f56613e + " markLimit: " + this.f56611c);
        }
        this.f56613e = i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j11) throws IOException {
        if (j11 < 1) {
            return 0L;
        }
        byte[] bArr = this.f56609a;
        if (bArr == null) {
            j();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            j();
            throw null;
        }
        int i11 = this.f56610b;
        int i12 = this.f56613e;
        if (i11 - i12 >= j11) {
            this.f56613e = (int) (i12 + j11);
            return j11;
        }
        long j12 = i11 - i12;
        this.f56613e = i11;
        if (this.f56612d == -1 || j11 > this.f56611c) {
            long skip = inputStream.skip(j11 - j12);
            if (skip > 0) {
                this.f56612d = -1;
            }
            return j12 + skip;
        }
        if (c(inputStream, bArr) == -1) {
            return j12;
        }
        int i13 = this.f56610b;
        int i14 = this.f56613e;
        if (i13 - i14 >= j11 - j12) {
            this.f56613e = (int) ((i14 + j11) - j12);
            return j11;
        }
        long j13 = (j12 + i13) - i14;
        this.f56613e = i13;
        return j13;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(@NonNull byte[] bArr, int i11, int i12) throws IOException {
        int i13;
        int i14;
        byte[] bArr2 = this.f56609a;
        if (bArr2 == null) {
            j();
            throw null;
        }
        if (i12 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i15 = this.f56613e;
            int i16 = this.f56610b;
            if (i15 < i16) {
                int i17 = i16 - i15;
                if (i17 >= i12) {
                    i17 = i12;
                }
                System.arraycopy(bArr2, i15, bArr, i11, i17);
                this.f56613e += i17;
                if (i17 == i12 || inputStream.available() == 0) {
                    return i17;
                }
                i11 += i17;
                i13 = i12 - i17;
            } else {
                i13 = i12;
            }
            while (true) {
                if (this.f56612d == -1 && i13 >= bArr2.length) {
                    i14 = inputStream.read(bArr, i11, i13);
                    if (i14 == -1) {
                        return i13 != i12 ? i12 - i13 : -1;
                    }
                } else {
                    if (c(inputStream, bArr2) == -1) {
                        return i13 != i12 ? i12 - i13 : -1;
                    }
                    if (bArr2 != this.f56609a && (bArr2 = this.f56609a) == null) {
                        j();
                        throw null;
                    }
                    int i18 = this.f56610b;
                    int i19 = this.f56613e;
                    i14 = i18 - i19;
                    if (i14 >= i13) {
                        i14 = i13;
                    }
                    System.arraycopy(bArr2, i19, bArr, i11, i14);
                    this.f56613e += i14;
                }
                i13 -= i14;
                if (i13 == 0) {
                    return i12;
                }
                if (inputStream.available() == 0) {
                    return i12 - i13;
                }
                i11 += i14;
            }
        } else {
            j();
            throw null;
        }
    }
}
