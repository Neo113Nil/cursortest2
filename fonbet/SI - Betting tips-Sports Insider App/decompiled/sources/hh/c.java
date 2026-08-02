package hh;

import gh.b0;
import gh.r0;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;
import okio.Timeout;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class c extends r0 implements Source {

    /* renamed from: c, reason: collision with root package name */
    public final b0 f10818c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10819d;

    public c(b0 b0Var, long j) {
        this.f10818c = b0Var;
        this.f10819d = j;
    }

    @Override // gh.r0
    public final long k() {
        return this.f10819d;
    }

    @Override // gh.r0
    public final BufferedSource m0() {
        return Okio.buffer(this);
    }

    @Override // gh.r0
    public final b0 n() {
        return this.f10818c;
    }

    @Override // okio.Source
    public final long read(Buffer sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // okio.Source
    /* renamed from: timeout */
    public final Timeout getTimeout() {
        return Timeout.NONE;
    }

    @Override // gh.r0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
