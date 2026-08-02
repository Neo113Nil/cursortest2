package w4;

import android.media.MediaDataSource;
import okio.Buffer;
import okio.Source;
import okio.Timeout;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements Source {

    /* renamed from: a, reason: collision with root package name */
    public final MediaDataSource f24962a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24963b;

    /* renamed from: c, reason: collision with root package name */
    public long f24964c;

    public b(MediaDataSource mediaDataSource) {
        this.f24962a = mediaDataSource;
        this.f24963b = mediaDataSource.getSize();
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f24962a.close();
    }

    @Override // okio.Source
    public final long read(Buffer buffer, long j) {
        long j6 = this.f24964c;
        long j10 = this.f24963b;
        if (j6 >= j10) {
            return -1L;
        }
        int min = (int) Math.min(j, j10 - j6);
        byte[] bArr = new byte[min];
        int readAt = this.f24962a.readAt(this.f24964c, bArr, 0, min);
        long j11 = readAt;
        this.f24964c += j11;
        buffer.write(bArr, 0, readAt);
        return j11;
    }

    @Override // okio.Source
    /* renamed from: timeout */
    public final Timeout getTimeout() {
        return Timeout.NONE;
    }
}
