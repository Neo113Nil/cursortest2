package f4;

import java.nio.ByteBuffer;
import okio.Buffer;
import okio.Source;
import okio.Timeout;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d implements Source {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f9448a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9449b;

    public d(ByteBuffer byteBuffer) {
        ByteBuffer slice = byteBuffer.slice();
        this.f9448a = slice;
        this.f9449b = slice.capacity();
    }

    @Override // okio.Source
    public final long read(Buffer buffer, long j) {
        ByteBuffer byteBuffer = this.f9448a;
        int position = byteBuffer.position();
        int i5 = this.f9449b;
        if (position == i5) {
            return -1L;
        }
        int position2 = (int) (byteBuffer.position() + j);
        if (position2 <= i5) {
            i5 = position2;
        }
        byteBuffer.limit(i5);
        return buffer.write(byteBuffer);
    }

    @Override // okio.Source
    /* renamed from: timeout */
    public final Timeout getTimeout() {
        return Timeout.NONE;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
