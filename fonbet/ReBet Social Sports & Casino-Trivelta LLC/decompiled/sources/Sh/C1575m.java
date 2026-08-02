package Sh;

import Ph.InterfaceC1456i0;
import Ph.InterfaceC1465n;
import Ph.W;
import Ph.Z;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* renamed from: Sh.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1575m extends Ph.L implements Z {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10796h = AtomicIntegerFieldUpdater.newUpdater(C1575m.class, "runningWorkers$volatile");

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z f10797b;

    /* renamed from: c, reason: collision with root package name */
    public final Ph.L f10798c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10799d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10800e;

    /* renamed from: f, reason: collision with root package name */
    public final r f10801f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f10802g;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* renamed from: Sh.m$a */
    public final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public Runnable f10803a;

        public a(Runnable runnable) {
            this.f10803a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f10803a.run();
                } catch (Throwable th2) {
                    Ph.N.a(EmptyCoroutineContext.INSTANCE, th2);
                }
                Runnable j22 = C1575m.this.j2();
                if (j22 == null) {
                    return;
                }
                try {
                    this.f10803a = j22;
                    i10++;
                    if (i10 >= 16 && AbstractC1572j.d(C1575m.this.f10798c, C1575m.this)) {
                        AbstractC1572j.c(C1575m.this.f10798c, C1575m.this, this);
                        return;
                    }
                } catch (Throwable th3) {
                    Object obj = C1575m.this.f10802g;
                    C1575m c1575m = C1575m.this;
                    synchronized (obj) {
                        C1575m.i2().decrementAndGet(c1575m);
                        throw th3;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1575m(Ph.L l10, int i10, String str) {
        Z z10 = l10 instanceof Z ? (Z) l10 : null;
        this.f10797b = z10 == null ? W.a() : z10;
        this.f10798c = l10;
        this.f10799d = i10;
        this.f10800e = str;
        this.f10801f = new r(false);
        this.f10802g = new Object();
    }

    public static final /* synthetic */ AtomicIntegerFieldUpdater i2() {
        return f10796h;
    }

    @Override // Ph.Z
    public InterfaceC1456i0 J(long j10, Runnable runnable, CoroutineContext coroutineContext) {
        return this.f10797b.J(j10, runnable, coroutineContext);
    }

    @Override // Ph.L
    public void Y1(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable j22;
        this.f10801f.a(runnable);
        if (f10796h.get(this) >= this.f10799d || !k2() || (j22 = j2()) == null) {
            return;
        }
        try {
            AbstractC1572j.c(this.f10798c, this, new a(j22));
        } catch (Throwable th2) {
            f10796h.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // Ph.L
    public void Z1(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable j22;
        this.f10801f.a(runnable);
        if (f10796h.get(this) >= this.f10799d || !k2() || (j22 = j2()) == null) {
            return;
        }
        try {
            this.f10798c.Z1(this, new a(j22));
        } catch (Throwable th2) {
            f10796h.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // Ph.L
    public Ph.L c2(int i10, String str) {
        AbstractC1576n.a(i10);
        return i10 >= this.f10799d ? AbstractC1576n.b(this, str) : super.c2(i10, str);
    }

    public final Runnable j2() {
        while (true) {
            Runnable runnable = (Runnable) this.f10801f.e();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f10802g) {
                f10796h.decrementAndGet(this);
                if (this.f10801f.c() == 0) {
                    return null;
                }
                f10796h.incrementAndGet(this);
            }
        }
    }

    public final boolean k2() {
        synchronized (this.f10802g) {
            if (f10796h.get(this) >= this.f10799d) {
                return false;
            }
            f10796h.incrementAndGet(this);
            return true;
        }
    }

    @Override // Ph.L
    public String toString() {
        String str = this.f10800e;
        if (str != null) {
            return str;
        }
        return this.f10798c + ".limitedParallelism(" + this.f10799d + ')';
    }

    @Override // Ph.Z
    public void w0(long j10, InterfaceC1465n interfaceC1465n) {
        this.f10797b.w0(j10, interfaceC1465n);
    }
}
