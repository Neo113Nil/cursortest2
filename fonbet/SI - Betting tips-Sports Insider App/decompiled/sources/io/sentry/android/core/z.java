package io.sentry.android.core;

import io.sentry.ILogger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z extends io.sentry.hints.c implements io.sentry.hints.b, io.sentry.hints.a {

    /* renamed from: d, reason: collision with root package name */
    public final long f15897d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15898e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f15899f;

    public z(long j, ILogger iLogger, long j6, boolean z5, boolean z7) {
        super(j, iLogger);
        this.f15897d = j6;
        this.f15898e = z5;
        this.f15899f = z7;
    }

    @Override // io.sentry.hints.b
    public final boolean a() {
        return this.f15898e;
    }

    @Override // io.sentry.hints.a
    public final Long b() {
        return Long.valueOf(this.f15897d);
    }

    @Override // io.sentry.hints.a
    public final boolean c() {
        return false;
    }

    @Override // io.sentry.hints.a
    public final String e() {
        return this.f15899f ? "anr_background" : "anr_foreground";
    }

    @Override // io.sentry.hints.c
    public final boolean f(io.sentry.protocol.v vVar) {
        return true;
    }

    @Override // io.sentry.hints.c
    public final void g(io.sentry.protocol.v vVar) {
    }
}
