package com.vungle.ads.internal.executor;

import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b implements Future {
    public static final String b = "b";
    public final Future a;

    public b(Future future) {
        this.a = future;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Future future = this.a;
        if (future != null) {
            return future.cancel(z);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        try {
            Future future = this.a;
            if (future != null) {
                return future.get(j, timeUnit);
            }
            return null;
        } catch (InterruptedException unused) {
            boolean z = u.a;
            String str = b;
            str.getClass();
            t.c(str, "future.get() Interrupted on Thread " + Thread.currentThread().getName());
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e) {
            boolean z2 = u.a;
            String str2 = b;
            str2.getClass();
            t.a(str2, "error on execution", e);
            return null;
        } catch (TimeoutException e2) {
            boolean z3 = u.a;
            String str3 = b;
            str3.getClass();
            t.a(str3, "error on timeout", e2);
            str3.getClass();
            t.c(str3, "future.get() Timeout on Thread " + Thread.currentThread().getName());
            return null;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        Future future = this.a;
        if (future != null) {
            return future.isCancelled();
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Future future = this.a;
        if (future != null) {
            return future.isDone();
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            Future future = this.a;
            if (future != null) {
                return future.get();
            }
            return null;
        } catch (InterruptedException unused) {
            boolean z = u.a;
            String str = b;
            str.getClass();
            t.c(str, "future.get() Interrupted on Thread " + Thread.currentThread().getName());
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e) {
            boolean z2 = u.a;
            String str2 = b;
            str2.getClass();
            t.a(str2, "error on execution", e);
            return null;
        }
    }
}
