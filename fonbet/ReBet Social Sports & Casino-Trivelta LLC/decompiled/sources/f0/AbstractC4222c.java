package f0;

import Ta.o;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: f0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4222c {

    /* renamed from: f0.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public Object f46157a;

        /* renamed from: b, reason: collision with root package name */
        public d f46158b;

        /* renamed from: c, reason: collision with root package name */
        public f f46159c = f.s();

        /* renamed from: d, reason: collision with root package name */
        public boolean f46160d;

        public void a(Runnable runnable, Executor executor) {
            f fVar = this.f46159c;
            if (fVar != null) {
                fVar.l(runnable, executor);
            }
        }

        public void b() {
            this.f46157a = null;
            this.f46158b = null;
            this.f46159c.o(null);
        }

        public boolean c(Object obj) {
            this.f46160d = true;
            d dVar = this.f46158b;
            boolean z10 = dVar != null && dVar.b(obj);
            if (z10) {
                e();
            }
            return z10;
        }

        public boolean d() {
            this.f46160d = true;
            d dVar = this.f46158b;
            boolean z10 = dVar != null && dVar.a(true);
            if (z10) {
                e();
            }
            return z10;
        }

        public final void e() {
            this.f46157a = null;
            this.f46158b = null;
            this.f46159c = null;
        }

        public boolean f(Throwable th2) {
            this.f46160d = true;
            d dVar = this.f46158b;
            boolean z10 = dVar != null && dVar.c(th2);
            if (z10) {
                e();
            }
            return z10;
        }

        public void finalize() {
            f fVar;
            d dVar = this.f46158b;
            if (dVar != null && !dVar.isDone()) {
                dVar.c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f46157a));
            }
            if (this.f46160d || (fVar = this.f46159c) == null) {
                return;
            }
            fVar.o(null);
        }
    }

    /* renamed from: f0.c$b */
    public static final class b extends Throwable {
        public b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: f0.c$c, reason: collision with other inner class name */
    public interface InterfaceC0669c {
        Object a(a aVar);
    }

    /* renamed from: f0.c$d */
    public static final class d implements o {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f46161a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC4220a f46162b = new a();

        /* renamed from: f0.c$d$a */
        public class a extends AbstractC4220a {
            public a() {
            }

            @Override // f0.AbstractC4220a
            public String k() {
                a aVar = (a) d.this.f46161a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f46157a + "]";
            }
        }

        public d(a aVar) {
            this.f46161a = new WeakReference(aVar);
        }

        public boolean a(boolean z10) {
            return this.f46162b.cancel(z10);
        }

        public boolean b(Object obj) {
            return this.f46162b.o(obj);
        }

        public boolean c(Throwable th2) {
            return this.f46162b.p(th2);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            a aVar = (a) this.f46161a.get();
            boolean cancel = this.f46162b.cancel(z10);
            if (cancel && aVar != null) {
                aVar.b();
            }
            return cancel;
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f46162b.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f46162b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f46162b.isDone();
        }

        @Override // Ta.o
        public void l(Runnable runnable, Executor executor) {
            this.f46162b.l(runnable, executor);
        }

        public String toString() {
            return this.f46162b.toString();
        }

        @Override // java.util.concurrent.Future
        public Object get(long j10, TimeUnit timeUnit) {
            return this.f46162b.get(j10, timeUnit);
        }
    }

    public static o a(InterfaceC0669c interfaceC0669c) {
        a aVar = new a();
        d dVar = new d(aVar);
        aVar.f46158b = dVar;
        aVar.f46157a = interfaceC0669c.getClass();
        try {
            Object a10 = interfaceC0669c.a(aVar);
            if (a10 == null) {
                return dVar;
            }
            aVar.f46157a = a10;
            return dVar;
        } catch (Exception e10) {
            dVar.c(e10);
            return dVar;
        }
    }
}
