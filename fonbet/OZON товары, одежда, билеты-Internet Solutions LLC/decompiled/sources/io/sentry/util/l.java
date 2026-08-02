package io.sentry.util;

import io.sentry.InterfaceC7097a0;
import io.sentry.util.a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class l<T> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a<T> f68590b;

    /* renamed from: a, reason: collision with root package name */
    private volatile T f68589a = null;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f68591c = new io.sentry.util.a();

    public interface a<T> {
        @NotNull
        T g();
    }

    public l(@NotNull a<T> aVar) {
        this.f68590b = aVar;
    }

    @NotNull
    public final T a() {
        if (this.f68589a == null) {
            InterfaceC7097a0 a11 = this.f68591c.a();
            try {
                if (this.f68589a == null) {
                    this.f68589a = this.f68590b.g();
                }
                ((a.C1121a) a11).close();
            } catch (Throwable th2) {
                try {
                    ((a.C1121a) a11).close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return this.f68589a;
    }

    public final void b() {
        InterfaceC7097a0 a11 = this.f68591c.a();
        try {
            this.f68589a = null;
            ((a.C1121a) a11).close();
        } catch (Throwable th2) {
            try {
                ((a.C1121a) a11).close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void c(T t2) {
        InterfaceC7097a0 a11 = this.f68591c.a();
        try {
            this.f68589a = t2;
            ((a.C1121a) a11).close();
        } catch (Throwable th2) {
            try {
                ((a.C1121a) a11).close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
