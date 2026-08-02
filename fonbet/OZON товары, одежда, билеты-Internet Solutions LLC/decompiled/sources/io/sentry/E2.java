package io.sentry;

import java.time.Instant;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class E2 extends T1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Instant f66617a = Instant.now();

    @Override // io.sentry.T1
    public final long d() {
        return (this.f66617a.getEpochSecond() * 1000000000) + r0.getNano();
    }
}
