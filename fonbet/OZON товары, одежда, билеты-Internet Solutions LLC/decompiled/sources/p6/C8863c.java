package p6;

import C.C2702w;
import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: p6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8863c extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    private final long f80259a;

    /* renamed from: b, reason: collision with root package name */
    private int f80260b;

    private C8863c(@NonNull InputStream inputStream, long j11) {
        super(inputStream);
        this.f80259a = j11;
    }

    private void c(int i11) throws IOException {
        if (i11 >= 0) {
            this.f80260b += i11;
            return;
        }
        long j11 = this.f80260b;
        long j12 = this.f80259a;
        if (j12 - j11 <= 0) {
            return;
        }
        StringBuilder d11 = C2702w.d(j12, "Failed to read all expected data, expected: ", ", but read: ");
        d11.append(this.f80260b);
        throw new IOException(d11.toString());
    }

    @NonNull
    public static C8863c d(@NonNull InputStream inputStream, long j11) {
        return new C8863c(inputStream, j11);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() throws IOException {
        return (int) Math.max(this.f80259a - this.f80260b, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() throws IOException {
        int read;
        read = super.read();
        c(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i11, int i12) throws IOException {
        int read;
        read = super.read(bArr, i11, i12);
        c(read);
        return read;
    }
}
