package G6;

import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;

/* loaded from: classes2.dex */
public class g extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f3902a;

    /* renamed from: b, reason: collision with root package name */
    public final H6.h f3903b;

    /* renamed from: c, reason: collision with root package name */
    public int f3904c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f3905d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3906e = false;
    private final byte[] mByteArray;

    public g(InputStream inputStream, byte[] bArr, H6.h hVar) {
        this.f3902a = (InputStream) D6.k.g(inputStream);
        this.mByteArray = (byte[]) D6.k.g(bArr);
        this.f3903b = (H6.h) D6.k.g(hVar);
    }

    @Override // java.io.InputStream
    public int available() {
        D6.k.i(this.f3905d <= this.f3904c);
        k();
        return (this.f3904c - this.f3905d) + this.f3902a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f3906e) {
            return;
        }
        this.f3906e = true;
        this.f3903b.release(this.mByteArray);
        super.close();
    }

    public final boolean d() {
        if (this.f3905d < this.f3904c) {
            return true;
        }
        int read = this.f3902a.read(this.mByteArray);
        if (read <= 0) {
            return false;
        }
        this.f3904c = read;
        this.f3905d = 0;
        return true;
    }

    public void finalize() {
        if (!this.f3906e) {
            E6.a.m("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    public final void k() {
        if (this.f3906e) {
            throw new IOException("stream already closed");
        }
    }

    @Override // java.io.InputStream
    public int read() {
        D6.k.i(this.f3905d <= this.f3904c);
        k();
        if (!d()) {
            return -1;
        }
        byte[] bArr = this.mByteArray;
        int i10 = this.f3905d;
        this.f3905d = i10 + 1;
        return bArr[i10] & UByte.MAX_VALUE;
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        D6.k.i(this.f3905d <= this.f3904c);
        k();
        int i10 = this.f3904c;
        int i11 = this.f3905d;
        long j11 = i10 - i11;
        if (j11 >= j10) {
            this.f3905d = (int) (i11 + j10);
            return j10;
        }
        this.f3905d = i10;
        return j11 + this.f3902a.skip(j10 - j11);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        D6.k.i(this.f3905d <= this.f3904c);
        k();
        if (!d()) {
            return -1;
        }
        int min = Math.min(this.f3904c - this.f3905d, i11);
        System.arraycopy(this.mByteArray, this.f3905d, bArr, i10, min);
        this.f3905d += min;
        return min;
    }
}
