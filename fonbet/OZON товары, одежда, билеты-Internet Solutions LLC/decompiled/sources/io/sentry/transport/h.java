package io.sentry.transport;

import io.sentry.E;
import io.sentry.V1;
import java.util.Collections;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class h implements io.sentry.cache.g {

    /* renamed from: a, reason: collision with root package name */
    private static final h f68530a = new h();

    public static h a() {
        return f68530a;
    }

    @Override // io.sentry.cache.g
    public final void E1(@NotNull V1 v12, @NotNull E e11) {
    }

    @Override // io.sentry.cache.g
    public final boolean L1(@NotNull V1 v12, @NotNull E e11) {
        return false;
    }

    @Override // io.sentry.cache.g
    public final void M0(@NotNull V1 v12) {
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<V1> iterator() {
        return Collections.emptyIterator();
    }
}
