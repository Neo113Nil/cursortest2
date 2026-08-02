package io.sentry;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* renamed from: io.sentry.h1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4756h1 implements InterfaceC4760i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C4756h1 f52093a = new C4756h1();

    public static /* synthetic */ Object c() {
        return null;
    }

    public static /* synthetic */ Object d() {
        return null;
    }

    public static InterfaceC4760i0 e() {
        return f52093a;
    }

    @Override // io.sentry.InterfaceC4760i0
    public void a(long j10) {
    }

    @Override // io.sentry.InterfaceC4760i0
    public Future b(Runnable runnable, long j10) {
        return new FutureTask(new Callable() { // from class: io.sentry.g1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4756h1.d();
            }
        });
    }

    @Override // io.sentry.InterfaceC4760i0
    public boolean isClosed() {
        return false;
    }

    @Override // io.sentry.InterfaceC4760i0
    public Future submit(Runnable runnable) {
        return new FutureTask(new Callable() { // from class: io.sentry.f1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4756h1.c();
            }
        });
    }
}
