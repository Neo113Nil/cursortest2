package io.sentry.util;

import io.sentry.InterfaceC7097a0;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a extends ReentrantLock {

    /* renamed from: io.sentry.util.a$a, reason: collision with other inner class name */
    static final class C1121a implements InterfaceC7097a0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final a f68585a;

        C1121a(@NotNull a aVar) {
            this.f68585a = aVar;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            this.f68585a.unlock();
        }
    }

    public final InterfaceC7097a0 a() {
        lock();
        return new C1121a(this);
    }
}
