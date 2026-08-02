package Ta;

import Ta.e;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes3.dex */
public class w extends e.a implements RunnableFuture {

    /* renamed from: h, reason: collision with root package name */
    public volatile m f11392h;

    public final class a extends m {

        /* renamed from: c, reason: collision with root package name */
        public final Callable f11393c;

        public a(Callable callable) {
            this.f11393c = (Callable) Ra.n.k(callable);
        }

        @Override // Ta.m
        public void a(Throwable th2) {
            w.this.y(th2);
        }

        @Override // Ta.m
        public void b(Object obj) {
            w.this.x(obj);
        }

        @Override // Ta.m
        public final boolean d() {
            return w.this.isDone();
        }

        @Override // Ta.m
        public Object e() {
            return this.f11393c.call();
        }

        @Override // Ta.m
        public String f() {
            return this.f11393c.toString();
        }
    }

    public w(Callable callable) {
        this.f11392h = new a(callable);
    }

    public static w A(Runnable runnable, Object obj) {
        return new w(Executors.callable(runnable, obj));
    }

    public static w B(Callable callable) {
        return new w(callable);
    }

    @Override // Ta.a
    public void k() {
        m mVar;
        super.k();
        if (z() && (mVar = this.f11392h) != null) {
            mVar.c();
        }
        this.f11392h = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        m mVar = this.f11392h;
        if (mVar != null) {
            mVar.run();
        }
        this.f11392h = null;
    }

    @Override // Ta.a
    public String u() {
        m mVar = this.f11392h;
        if (mVar == null) {
            return super.u();
        }
        return "task=[" + mVar + "]";
    }
}
