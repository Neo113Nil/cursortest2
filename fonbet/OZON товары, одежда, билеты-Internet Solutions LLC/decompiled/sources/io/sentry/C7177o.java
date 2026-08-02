package io.sentry;

import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7177o implements X {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final ThreadLocal<W> f68120a = new ThreadLocal<>();

    /* renamed from: io.sentry.o$a */
    static final class a implements InterfaceC7097a0 {

        /* renamed from: a, reason: collision with root package name */
        private final W f68121a;

        a(W w11) {
            this.f68121a = w11;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            C7177o.f68120a.set(this.f68121a);
        }
    }

    @Override // io.sentry.X
    public final InterfaceC7097a0 a(W w11) {
        W w12 = get();
        f68120a.set(w11);
        return new a(w12);
    }

    @Override // io.sentry.X
    public final void close() {
        f68120a.remove();
    }

    @Override // io.sentry.X
    public final W get() {
        return f68120a.get();
    }
}
