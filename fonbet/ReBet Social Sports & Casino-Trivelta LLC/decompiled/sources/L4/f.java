package L4;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.q;
import com.bumptech.glide.util.l;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public class f implements c, g {

    /* renamed from: k, reason: collision with root package name */
    public static final a f7003k = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f7004a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7005b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7006c;

    /* renamed from: d, reason: collision with root package name */
    public final a f7007d;

    /* renamed from: e, reason: collision with root package name */
    public Object f7008e;

    /* renamed from: f, reason: collision with root package name */
    public d f7009f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7010g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7011h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7012i;

    /* renamed from: j, reason: collision with root package name */
    public q f7013j;

    public static class a {
        public void a(Object obj) {
            obj.notifyAll();
        }

        public void b(Object obj, long j10) {
            obj.wait(j10);
        }
    }

    public f(int i10, int i11) {
        this(i10, i11, true, f7003k);
    }

    @Override // M4.j
    public synchronized d c() {
        return this.f7009f;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.f7010g = true;
                this.f7007d.a(this);
                d dVar = null;
                if (z10) {
                    d dVar2 = this.f7009f;
                    this.f7009f = null;
                    dVar = dVar2;
                }
                if (dVar != null) {
                    dVar.clear();
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // L4.g
    public synchronized boolean f(Object obj, Object obj2, M4.j jVar, com.bumptech.glide.load.a aVar, boolean z10) {
        this.f7011h = true;
        this.f7008e = obj;
        this.f7007d.a(this);
        return false;
    }

    @Override // M4.j
    public synchronized void g(d dVar) {
        this.f7009f = dVar;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        try {
            return o(null);
        } catch (TimeoutException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // M4.j
    public void h(M4.i iVar) {
        iVar.d(this.f7004a, this.f7005b);
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.f7010g;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        boolean z10;
        if (!this.f7010g && !this.f7011h) {
            z10 = this.f7012i;
        }
        return z10;
    }

    @Override // L4.g
    public synchronized boolean k(q qVar, Object obj, M4.j jVar, boolean z10) {
        this.f7012i = true;
        this.f7013j = qVar;
        this.f7007d.a(this);
        return false;
    }

    @Override // M4.j
    public synchronized void m(Object obj, N4.d dVar) {
    }

    @Override // M4.j
    public synchronized void n(Drawable drawable) {
    }

    public final synchronized Object o(Long l10) {
        try {
            if (this.f7006c && !isDone()) {
                l.a();
            }
            if (this.f7010g) {
                throw new CancellationException();
            }
            if (this.f7012i) {
                throw new ExecutionException(this.f7013j);
            }
            if (this.f7011h) {
                return this.f7008e;
            }
            if (l10 == null) {
                this.f7007d.b(this, 0L);
            } else if (l10.longValue() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long longValue = l10.longValue() + currentTimeMillis;
                while (!isDone() && currentTimeMillis < longValue) {
                    this.f7007d.b(this, longValue - currentTimeMillis);
                    currentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (this.f7012i) {
                throw new ExecutionException(this.f7013j);
            }
            if (this.f7010g) {
                throw new CancellationException();
            }
            if (!this.f7011h) {
                throw new TimeoutException();
            }
            return this.f7008e;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public String toString() {
        d dVar;
        String str;
        String str2 = super.toString() + "[status=";
        synchronized (this) {
            try {
                dVar = null;
                if (this.f7010g) {
                    str = "CANCELLED";
                } else if (this.f7012i) {
                    str = "FAILURE";
                } else if (this.f7011h) {
                    str = "SUCCESS";
                } else {
                    str = "PENDING";
                    dVar = this.f7009f;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (dVar == null) {
            return str2 + str + "]";
        }
        return str2 + str + ", request=[" + dVar + "]]";
    }

    public f(int i10, int i11, boolean z10, a aVar) {
        this.f7004a = i10;
        this.f7005b = i11;
        this.f7006c = z10;
        this.f7007d = aVar;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        return o(Long.valueOf(timeUnit.toMillis(j10)));
    }

    @Override // com.bumptech.glide.manager.k
    public void a() {
    }

    @Override // com.bumptech.glide.manager.k
    public void b() {
    }

    @Override // com.bumptech.glide.manager.k
    public void d() {
    }

    @Override // M4.j
    public void e(M4.i iVar) {
    }

    @Override // M4.j
    public void i(Drawable drawable) {
    }

    @Override // M4.j
    public void j(Drawable drawable) {
    }
}
