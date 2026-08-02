package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class hck extends i2g implements cwh {
    public final zdc d;
    public final long e;

    public hck(zdc zdcVar, long j) {
        this.d = zdcVar;
        this.e = j;
    }

    @Override // defpackage.i2g
    public final long contentLength() {
        return this.e;
    }

    @Override // defpackage.i2g
    public final zdc contentType() {
        return this.d;
    }

    @Override // defpackage.cwh
    public final long read(x52 x52Var, long j) {
        x52Var.getClass();
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // defpackage.i2g
    public final l62 source() {
        return new lof(this);
    }

    @Override // defpackage.cwh
    public final pij timeout() {
        return pij.d;
    }

    @Override // defpackage.i2g, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
