package c6;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
final class G extends MediaDataSource {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ByteBuffer f56540a;

    G(ByteBuffer byteBuffer) {
        this.f56540a = byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f56540a.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j11, byte[] bArr, int i11, int i12) {
        ByteBuffer byteBuffer = this.f56540a;
        if (j11 >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j11);
        int min = Math.min(i12, byteBuffer.remaining());
        byteBuffer.get(bArr, i11, min);
        return min;
    }
}
