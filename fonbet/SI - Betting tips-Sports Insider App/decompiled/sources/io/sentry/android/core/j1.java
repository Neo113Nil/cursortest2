package io.sentry.android.core;

import io.sentry.ILogger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j1 extends io.sentry.hints.c implements io.sentry.hints.b, io.sentry.hints.g {

    /* renamed from: d, reason: collision with root package name */
    public final long f15765d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15766e;

    public j1(long j, ILogger iLogger, long j6, boolean z5) {
        super(j, iLogger);
        this.f15765d = j6;
        this.f15766e = z5;
    }

    @Override // io.sentry.hints.b
    public final boolean a() {
        return this.f15766e;
    }

    @Override // io.sentry.hints.c
    public final boolean f(io.sentry.protocol.v vVar) {
        return true;
    }

    @Override // io.sentry.hints.c
    public final void g(io.sentry.protocol.v vVar) {
    }
}
