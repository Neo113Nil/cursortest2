package io.sentry.transport;

import io.sentry.E;
import io.sentry.V1;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class i implements f {

    /* renamed from: a, reason: collision with root package name */
    private static final i f68531a = new i();

    @NotNull
    public static i c() {
        return f68531a;
    }

    @Override // io.sentry.transport.f
    public final void F(@NotNull V1 v12, @NotNull E e11) throws IOException {
    }

    @Override // io.sentry.transport.f
    public final void a(boolean z11) throws IOException {
    }

    @Override // io.sentry.transport.f
    public final void b(long j11) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // io.sentry.transport.f
    public final m h() {
        return null;
    }
}
