package s;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class c extends e {

    /* renamed from: c, reason: collision with root package name */
    public static volatile c f64420c;

    /* renamed from: d, reason: collision with root package name */
    public static final Executor f64421d = new Executor() { // from class: s.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.h().d(runnable);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public static final Executor f64422e = new Executor() { // from class: s.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.h().a(runnable);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public e f64423a;

    /* renamed from: b, reason: collision with root package name */
    public final e f64424b;

    public c() {
        d dVar = new d();
        this.f64424b = dVar;
        this.f64423a = dVar;
    }

    public static Executor g() {
        return f64422e;
    }

    public static c h() {
        if (f64420c != null) {
            return f64420c;
        }
        synchronized (c.class) {
            try {
                if (f64420c == null) {
                    f64420c = new c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f64420c;
    }

    @Override // s.e
    public void a(Runnable runnable) {
        this.f64423a.a(runnable);
    }

    @Override // s.e
    public boolean c() {
        return this.f64423a.c();
    }

    @Override // s.e
    public void d(Runnable runnable) {
        this.f64423a.d(runnable);
    }
}
