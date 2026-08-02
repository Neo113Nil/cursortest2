package n5;

import java.io.InputStream;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class i extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InputStream f76524a;

    /* renamed from: b, reason: collision with root package name */
    private int f76525b = 1073741824;

    public i(@NotNull InputStream inputStream) {
        this.f76524a = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f76525b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f76524a.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        int read = this.f76524a.read();
        if (read == -1) {
            this.f76525b = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j11) {
        return this.f76524a.skip(j11);
    }

    @Override // java.io.InputStream
    public final int read(@NotNull byte[] bArr) {
        int read = this.f76524a.read(bArr);
        if (read == -1) {
            this.f76525b = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(@NotNull byte[] bArr, int i11, int i12) {
        int read = this.f76524a.read(bArr, i11, i12);
        if (read == -1) {
            this.f76525b = 0;
        }
        return read;
    }
}
