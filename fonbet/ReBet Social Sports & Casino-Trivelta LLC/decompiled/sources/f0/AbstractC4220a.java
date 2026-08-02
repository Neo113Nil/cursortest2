package f0;

import Ta.o;
import com.facebook.hermes.intl.Constants;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4220a implements o {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f46132d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", Constants.CASEFIRST_FALSE));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f46133e = Logger.getLogger(AbstractC4220a.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final b f46134f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f46135g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f46136a;

    /* renamed from: b, reason: collision with root package name */
    public volatile e f46137b;

    /* renamed from: c, reason: collision with root package name */
    public volatile h f46138c;

    /* renamed from: f0.a$b */
    public static abstract class b {
        public b() {
        }

        public abstract boolean a(AbstractC4220a abstractC4220a, e eVar, e eVar2);

        public abstract boolean b(AbstractC4220a abstractC4220a, Object obj, Object obj2);

        public abstract boolean c(AbstractC4220a abstractC4220a, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    /* renamed from: f0.a$c */
    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        public static final c f46139c;

        /* renamed from: d, reason: collision with root package name */
        public static final c f46140d;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f46141a;

        /* renamed from: b, reason: collision with root package name */
        public final Throwable f46142b;

        static {
            if (AbstractC4220a.f46132d) {
                f46140d = null;
                f46139c = null;
            } else {
                f46140d = new c(false, null);
                f46139c = new c(true, null);
            }
        }

        public c(boolean z10, Throwable th2) {
            this.f46141a = z10;
            this.f46142b = th2;
        }
    }

    /* renamed from: f0.a$d */
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f46143b = new d(new C0668a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f46144a;

        /* renamed from: f0.a$d$a, reason: collision with other inner class name */
        public class C0668a extends Throwable {
            public C0668a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th2) {
            this.f46144a = (Throwable) AbstractC4220a.d(th2);
        }
    }

    /* renamed from: f0.a$e */
    public static final class e {

        /* renamed from: d, reason: collision with root package name */
        public static final e f46145d = new e(null, null);

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f46146a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f46147b;

        /* renamed from: c, reason: collision with root package name */
        public e f46148c;

        public e(Runnable runnable, Executor executor) {
            this.f46146a = runnable;
            this.f46147b = executor;
        }
    }

    /* renamed from: f0.a$f */
    public static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f46149a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f46150b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f46151c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f46152d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f46153e;

        public f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f46149a = atomicReferenceFieldUpdater;
            this.f46150b = atomicReferenceFieldUpdater2;
            this.f46151c = atomicReferenceFieldUpdater3;
            this.f46152d = atomicReferenceFieldUpdater4;
            this.f46153e = atomicReferenceFieldUpdater5;
        }

        @Override // f0.AbstractC4220a.b
        public boolean a(AbstractC4220a abstractC4220a, e eVar, e eVar2) {
            return AbstractC4221b.a(this.f46152d, abstractC4220a, eVar, eVar2);
        }

        @Override // f0.AbstractC4220a.b
        public boolean b(AbstractC4220a abstractC4220a, Object obj, Object obj2) {
            return AbstractC4221b.a(this.f46153e, abstractC4220a, obj, obj2);
        }

        @Override // f0.AbstractC4220a.b
        public boolean c(AbstractC4220a abstractC4220a, h hVar, h hVar2) {
            return AbstractC4221b.a(this.f46151c, abstractC4220a, hVar, hVar2);
        }

        @Override // f0.AbstractC4220a.b
        public void d(h hVar, h hVar2) {
            this.f46150b.lazySet(hVar, hVar2);
        }

        @Override // f0.AbstractC4220a.b
        public void e(h hVar, Thread thread) {
            this.f46149a.lazySet(hVar, thread);
        }
    }

    /* renamed from: f0.a$g */
    public static final class g extends b {
        public g() {
            super();
        }

        @Override // f0.AbstractC4220a.b
        public boolean a(AbstractC4220a abstractC4220a, e eVar, e eVar2) {
            synchronized (abstractC4220a) {
                try {
                    if (abstractC4220a.f46137b != eVar) {
                        return false;
                    }
                    abstractC4220a.f46137b = eVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // f0.AbstractC4220a.b
        public boolean b(AbstractC4220a abstractC4220a, Object obj, Object obj2) {
            synchronized (abstractC4220a) {
                try {
                    if (abstractC4220a.f46136a != obj) {
                        return false;
                    }
                    abstractC4220a.f46136a = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // f0.AbstractC4220a.b
        public boolean c(AbstractC4220a abstractC4220a, h hVar, h hVar2) {
            synchronized (abstractC4220a) {
                try {
                    if (abstractC4220a.f46138c != hVar) {
                        return false;
                    }
                    abstractC4220a.f46138c = hVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // f0.AbstractC4220a.b
        public void d(h hVar, h hVar2) {
            hVar.f46156b = hVar2;
        }

        @Override // f0.AbstractC4220a.b
        public void e(h hVar, Thread thread) {
            hVar.f46155a = thread;
        }
    }

    /* renamed from: f0.a$h */
    public static final class h {

        /* renamed from: c, reason: collision with root package name */
        public static final h f46154c = new h(false);

        /* renamed from: a, reason: collision with root package name */
        public volatile Thread f46155a;

        /* renamed from: b, reason: collision with root package name */
        public volatile h f46156b;

        public h(boolean z10) {
        }

        public void a(h hVar) {
            AbstractC4220a.f46134f.d(this, hVar);
        }

        public void b() {
            Thread thread = this.f46155a;
            if (thread != null) {
                this.f46155a = null;
                LockSupport.unpark(thread);
            }
        }

        public h() {
            AbstractC4220a.f46134f.e(this, Thread.currentThread());
        }
    }

    static {
        b gVar;
        try {
            gVar = new f(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, com.google.crypto.tink.integration.android.b.f37029b), AtomicReferenceFieldUpdater.newUpdater(AbstractC4220a.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC4220a.class, e.class, com.google.crypto.tink.integration.android.b.f37029b), AtomicReferenceFieldUpdater.newUpdater(AbstractC4220a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            gVar = new g();
        }
        f46134f = gVar;
        if (th != null) {
            f46133e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f46135g = new Object();
    }

    private void a(StringBuilder sb2) {
        try {
            Object i10 = i(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(q(i10));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        }
    }

    private static CancellationException c(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    public static Object d(Object obj) {
        obj.getClass();
        return obj;
    }

    public static void f(AbstractC4220a abstractC4220a) {
        abstractC4220a.m();
        abstractC4220a.b();
        e e10 = abstractC4220a.e(null);
        while (e10 != null) {
            e eVar = e10.f46148c;
            g(e10.f46146a, e10.f46147b);
            e10 = eVar;
        }
    }

    private static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f46133e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    private Object h(Object obj) {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f46142b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f46144a);
        }
        if (obj == f46135g) {
            return null;
        }
        return obj;
    }

    public static Object i(Future future) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private void m() {
        h hVar;
        do {
            hVar = this.f46138c;
        } while (!f46134f.c(this, hVar, h.f46154c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.f46156b;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f46136a;
        if (obj == null) {
            if (f46134f.b(this, obj, f46132d ? new c(z10, new CancellationException("Future.cancel() was called.")) : z10 ? c.f46139c : c.f46140d)) {
                if (z10) {
                    j();
                }
                f(this);
                return true;
            }
        }
        return false;
    }

    public final e e(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f46137b;
        } while (!f46134f.a(this, eVar2, e.f46145d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f46148c;
            eVar4.f46148c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f46136a;
        if (obj != null) {
            return h(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f46138c;
            if (hVar != h.f46154c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f46134f.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                n(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f46136a;
                            if (obj2 != null) {
                                return h(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        n(hVar2);
                    } else {
                        hVar = this.f46138c;
                    }
                } while (hVar != h.f46154c);
            }
            return h(this.f46136a);
        }
        while (nanos > 0) {
            Object obj3 = this.f46136a;
            if (obj3 != null) {
                return h(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractC4220a = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j11 = -nanos;
            long convert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(convert);
            boolean z10 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str3 = str2 + convert + " " + lowerCase;
                if (z10) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z10) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + abstractC4220a);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f46136a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f46136a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String k() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // Ta.o
    public final void l(Runnable runnable, Executor executor) {
        d(runnable);
        d(executor);
        e eVar = this.f46137b;
        if (eVar != e.f46145d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f46148c = eVar;
                if (f46134f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f46137b;
                }
            } while (eVar != e.f46145d);
        }
        g(runnable, executor);
    }

    public final void n(h hVar) {
        hVar.f46155a = null;
        while (true) {
            h hVar2 = this.f46138c;
            if (hVar2 == h.f46154c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f46156b;
                if (hVar2.f46155a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f46156b = hVar4;
                    if (hVar3.f46155a == null) {
                        break;
                    }
                } else if (!f46134f.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    public boolean o(Object obj) {
        if (obj == null) {
            obj = f46135g;
        }
        if (!f46134f.b(this, null, obj)) {
            return false;
        }
        f(this);
        return true;
    }

    public boolean p(Throwable th2) {
        if (!f46134f.b(this, null, new d((Throwable) d(th2)))) {
            return false;
        }
        f(this);
        return true;
    }

    public final String q(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public final boolean r() {
        Object obj = this.f46136a;
        return (obj instanceof c) && ((c) obj).f46141a;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                str = k();
            } catch (RuntimeException e10) {
                str = "Exception thrown from implementation: " + e10.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public void b() {
    }

    public void j() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f46136a;
            if (obj2 != null) {
                return h(obj2);
            }
            h hVar = this.f46138c;
            if (hVar != h.f46154c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f46134f.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f46136a;
                            } else {
                                n(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!(obj != null));
                        return h(obj);
                    }
                    hVar = this.f46138c;
                } while (hVar != h.f46154c);
            }
            return h(this.f46136a);
        }
        throw new InterruptedException();
    }
}
