package io.sentry;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x6 extends io.sentry.hints.c implements io.sentry.hints.i, io.sentry.hints.l {

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f17252d;

    public x6(long j, ILogger iLogger) {
        super(j, iLogger);
        this.f17252d = new AtomicReference();
    }

    @Override // io.sentry.hints.c
    public final boolean f(io.sentry.protocol.v vVar) {
        io.sentry.protocol.v vVar2 = (io.sentry.protocol.v) this.f17252d.get();
        return vVar2 != null && vVar2.equals(vVar);
    }

    @Override // io.sentry.hints.c
    public final void g(io.sentry.protocol.v vVar) {
        this.f17252d.set(vVar);
    }
}
