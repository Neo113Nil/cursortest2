package com.google.common.util.concurrent;

import Bl0.k0;
import T7.E;
import com.google.common.util.concurrent.a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: classes9.dex */
final class k<V> implements m<V> {

    /* renamed from: b, reason: collision with root package name */
    static final m<?> f59201b = new k(null);

    /* renamed from: c, reason: collision with root package name */
    private static final l f59202c = new l(k.class);

    /* renamed from: a, reason: collision with root package name */
    private final V f59203a;

    static final class a<V> extends a.i<V> {
        a(Throwable th2) {
            w(th2);
        }
    }

    k(V v11) {
        this.f59203a = v11;
    }

    @Override // com.google.common.util.concurrent.m
    public final void a(Runnable runnable, Executor executor) {
        k0.g(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e11) {
            f59202c.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e11);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        return this.f59203a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=SUCCESS, result=[");
        return E.c(this.f59203a, "]]", sb2);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j11, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return this.f59203a;
    }
}
