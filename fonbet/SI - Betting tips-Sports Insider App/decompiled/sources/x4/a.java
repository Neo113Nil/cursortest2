package x4;

import android.media.MediaDataSource;
import okio.FileHandle;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* renamed from: a, reason: collision with root package name */
    public final FileHandle f25387a;

    public a(FileHandle fileHandle) {
        this.f25387a = fileHandle;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f25387a.close();
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f25387a.size();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i5, int i10) {
        return this.f25387a.read(j, bArr, i5, i10);
    }
}
