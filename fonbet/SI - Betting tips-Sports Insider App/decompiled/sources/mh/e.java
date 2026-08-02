package mh;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okio.Buffer;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class e extends a {

    /* renamed from: e, reason: collision with root package name */
    public boolean f20752e;

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f20742c) {
            return;
        }
        if (!this.f20752e) {
            c(f.f20753f);
        }
        this.f20742c = true;
    }

    @Override // mh.a, okio.Source
    public final long read(Buffer sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(d9.e.g(j, "byteCount < 0: ").toString());
        }
        if (this.f20742c) {
            throw new IllegalStateException("closed");
        }
        if (this.f20752e) {
            return -1L;
        }
        long read = super.read(sink, j);
        if (read != -1) {
            return read;
        }
        this.f20752e = true;
        c(Headers.EMPTY);
        return -1L;
    }
}
