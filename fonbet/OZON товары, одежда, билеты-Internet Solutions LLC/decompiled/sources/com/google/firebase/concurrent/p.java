package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes9.dex */
final class p<V> extends androidx.concurrent.futures.a<V> implements ScheduledFuture<V> {

    /* renamed from: h, reason: collision with root package name */
    private final ScheduledFuture<?> f59548h;

    final class a {
        a() {
        }

        public final void a(V v11) {
            p.this.j(v11);
        }

        public final void b(Exception exc) {
            p.this.k(exc);
        }
    }

    interface b<T> {
        ScheduledFuture a(a aVar);
    }

    p(b<V> bVar) {
        this.f59548h = bVar.a(new a());
    }

    @Override // androidx.concurrent.futures.a
    protected final void c() {
        this.f59548h.cancel(l());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f59548h.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f59548h.getDelay(timeUnit);
    }
}
