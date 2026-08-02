package p6;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.FilterInputStream;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class i extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    private int f80276a;

    public i(@NonNull d dVar) {
        super(dVar);
        this.f80276a = LinearLayoutManager.INVALID_OFFSET;
    }

    private long c(long j11) {
        int i11 = this.f80276a;
        if (i11 == 0) {
            return -1L;
        }
        return (i11 == Integer.MIN_VALUE || j11 <= ((long) i11)) ? j11 : i11;
    }

    private void d(long j11) {
        int i11 = this.f80276a;
        if (i11 == Integer.MIN_VALUE || j11 == -1) {
            return;
        }
        this.f80276a = (int) (i11 - j11);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        int i11 = this.f80276a;
        return i11 == Integer.MIN_VALUE ? super.available() : Math.min(i11, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i11) {
        super.mark(i11);
        this.f80276a = i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (c(1L) == -1) {
            return -1;
        }
        int read = super.read();
        d(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        super.reset();
        this.f80276a = LinearLayoutManager.INVALID_OFFSET;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j11) throws IOException {
        long c11 = c(j11);
        if (c11 == -1) {
            return 0L;
        }
        long skip = super.skip(c11);
        d(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(@NonNull byte[] bArr, int i11, int i12) throws IOException {
        int c11 = (int) c(i12);
        if (c11 == -1) {
            return -1;
        }
        int read = super.read(bArr, i11, c11);
        d(read);
        return read;
    }
}
