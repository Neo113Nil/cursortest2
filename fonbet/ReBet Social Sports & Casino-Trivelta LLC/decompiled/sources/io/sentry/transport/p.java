package io.sentry.transport;

import io.sentry.C4866x2;
import io.sentry.J;
import java.io.Closeable;

/* loaded from: classes3.dex */
public interface p extends Closeable {
    default void E1(C4866x2 c4866x2) {
        R(c4866x2, new J());
    }

    void R(C4866x2 c4866x2, J j10);

    void a(boolean z10);

    void b(long j10);

    default boolean c() {
        return true;
    }

    z e();
}
