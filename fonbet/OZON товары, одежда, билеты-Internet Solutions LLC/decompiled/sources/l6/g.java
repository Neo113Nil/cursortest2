package l6;

import C.o0;
import V5.q;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p6.l;

/* loaded from: classes8.dex */
public final class g<R> implements InterfaceFutureC7881d<R>, h<R> {

    /* renamed from: j, reason: collision with root package name */
    private static final a f72860j = new a();

    /* renamed from: a, reason: collision with root package name */
    private final int f72861a;

    /* renamed from: b, reason: collision with root package name */
    private final int f72862b;

    /* renamed from: c, reason: collision with root package name */
    private final a f72863c;

    /* renamed from: d, reason: collision with root package name */
    private R f72864d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC7882e f72865e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f72866f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f72867g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f72868h;

    /* renamed from: i, reason: collision with root package name */
    private q f72869i;

    static class a {
    }

    public g(int i11, int i12) {
        a aVar = f72860j;
        this.f72861a = i11;
        this.f72862b = i12;
        this.f72863c = aVar;
    }

    private synchronized R b(Long l11) throws ExecutionException, InterruptedException, TimeoutException {
        if (!isDone()) {
            int i11 = l.f80283d;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalArgumentException("You must call this method on a background thread");
            }
        }
        if (this.f72866f) {
            throw new CancellationException();
        }
        if (this.f72868h) {
            throw new ExecutionException(this.f72869i);
        }
        if (this.f72867g) {
            return this.f72864d;
        }
        if (l11 == null) {
            wait(0L);
        } else if (l11.longValue() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long longValue = l11.longValue() + currentTimeMillis;
            while (!isDone() && currentTimeMillis < longValue) {
                wait(longValue - currentTimeMillis);
                currentTimeMillis = System.currentTimeMillis();
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this.f72868h) {
            throw new ExecutionException(this.f72869i);
        }
        if (this.f72866f) {
            throw new CancellationException();
        }
        if (this.f72867g) {
            return this.f72864d;
        }
        throw new TimeoutException();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.f72866f = true;
                notifyAll();
                InterfaceC7882e interfaceC7882e = null;
                if (z11) {
                    InterfaceC7882e interfaceC7882e2 = this.f72865e;
                    this.f72865e = null;
                    interfaceC7882e = interfaceC7882e2;
                }
                if (interfaceC7882e != null) {
                    interfaceC7882e.clear();
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final R get() throws InterruptedException, ExecutionException {
        try {
            return b(null);
        } catch (TimeoutException e11) {
            throw new AssertionError(e11);
        }
    }

    @Override // m6.h
    public final synchronized InterfaceC7882e getRequest() {
        return this.f72865e;
    }

    @Override // m6.h
    public final void getSize(@NonNull m6.g gVar) {
        gVar.c(this.f72861a, this.f72862b);
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.f72866f;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        boolean z11;
        if (!this.f72866f && !this.f72867g) {
            z11 = this.f72868h;
        }
        return z11;
    }

    @Override // i6.m
    public final void onDestroy() {
    }

    @Override // m6.h
    public final void onLoadCleared(Drawable drawable) {
    }

    @Override // m6.h
    public final synchronized void onLoadFailed(Drawable drawable) {
    }

    @Override // m6.h
    public final void onLoadStarted(Drawable drawable) {
    }

    @Override // m6.h
    public final synchronized void onResourceReady(@NonNull R r11, n6.c<? super R> cVar) {
    }

    @Override // i6.m
    public final void onStart() {
    }

    @Override // i6.m
    public final void onStop() {
    }

    @Override // m6.h
    public final void removeCallback(@NonNull m6.g gVar) {
    }

    @Override // m6.h
    public final synchronized void setRequest(InterfaceC7882e interfaceC7882e) {
        this.f72865e = interfaceC7882e;
    }

    public final String toString() {
        InterfaceC7882e interfaceC7882e;
        String str;
        String c11 = o0.c(new StringBuilder(), super.toString(), "[status=");
        synchronized (this) {
            try {
                interfaceC7882e = null;
                if (this.f72866f) {
                    str = "CANCELLED";
                } else if (this.f72868h) {
                    str = "FAILURE";
                } else if (this.f72867g) {
                    str = "SUCCESS";
                } else {
                    str = "PENDING";
                    interfaceC7882e = this.f72865e;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (interfaceC7882e == null) {
            return G.g.c(c11, str, "]");
        }
        return c11 + str + ", request=[" + interfaceC7882e + "]]";
    }

    @Override // l6.h
    public final synchronized boolean onLoadFailed(q qVar, Object obj, @NonNull m6.h<R> hVar, boolean z11) {
        this.f72868h = true;
        this.f72869i = qVar;
        this.f72863c.getClass();
        notifyAll();
        return false;
    }

    @Override // l6.h
    public final synchronized boolean onResourceReady(@NonNull R r11, @NonNull Object obj, m6.h<R> hVar, @NonNull T5.a aVar, boolean z11) {
        this.f72867g = true;
        this.f72864d = r11;
        notifyAll();
        return false;
    }

    @Override // java.util.concurrent.Future
    public final R get(long j11, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return b(Long.valueOf(timeUnit.toMillis(j11)));
    }
}
