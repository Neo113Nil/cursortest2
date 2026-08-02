package d4;

import java.io.InputStream;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f8138a;

    /* renamed from: b, reason: collision with root package name */
    public int f8139b = 1073741824;

    public n(InputStream inputStream) {
        this.f8138a = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f8139b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f8138a.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        int read = this.f8138a.read();
        if (read == -1) {
            this.f8139b = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.f8138a.skip(j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        int read = this.f8138a.read(bArr);
        if (read == -1) {
            this.f8139b = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i5, int i10) {
        int read = this.f8138a.read(bArr, i5, i10);
        if (read == -1) {
            this.f8139b = 0;
        }
        return read;
    }
}
