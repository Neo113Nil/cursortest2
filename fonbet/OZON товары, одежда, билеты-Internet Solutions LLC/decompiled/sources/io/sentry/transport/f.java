package io.sentry.transport;

import io.sentry.E;
import io.sentry.V1;
import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface f extends Closeable {
    void F(@NotNull V1 v12, @NotNull E e11) throws IOException;

    void a(boolean z11) throws IOException;

    void b(long j11);

    default boolean e() {
        return true;
    }

    m h();
}
