package io.sentry;

import j$.time.Instant;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x4 extends k4 {

    /* renamed from: a, reason: collision with root package name */
    public final Instant f17251a = Instant.now();

    @Override // io.sentry.k4
    public final long d() {
        return (this.f17251a.getEpochSecond() * 1000000000) + r0.getNano();
    }
}
