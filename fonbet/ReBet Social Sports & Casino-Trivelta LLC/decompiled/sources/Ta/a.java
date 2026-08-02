package Ta;

import com.facebook.hermes.intl.Constants;
import f0.AbstractC4221b;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
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
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public abstract class a extends Ua.a implements o {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f11347d;

    /* renamed from: e, reason: collision with root package name */
    public static final n f11348e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f11349f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f11350g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f11351a;

    /* renamed from: b, reason: collision with root package name */
    public volatile e f11352b;

    /* renamed from: c, reason: collision with root package name */
    public volatile k f11353c;

    public static abstract class b {
        public b() {
        }

        public abstract boolean a(a aVar, e eVar, e eVar2);

        public abstract boolean b(a aVar, Object obj, Object obj2);

        public abstract boolean c(a aVar, k kVar, k kVar2);

        public abstract e d(a aVar, e eVar);

        public abstract k e(a aVar, k kVar);

        public abstract void f(k kVar, k kVar2);

        public abstract void g(k kVar, Thread thread);
    }

    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        public static final c f11354c;

        /* renamed from: d, reason: collision with root package name */
        public static final c f11355d;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f11356a;

        /* renamed from: b, reason: collision with root package name */
        public final Throwable f11357b;

        static {
            if (a.f11347d) {
                f11355d = null;
                f11354c = null;
            } else {
                f11355d = new c(false, null);
                f11354c = new c(true, null);
            }
        }

        public c(boolean z10, Throwable th2) {
            this.f11356a = z10;
            this.f11357b = th2;
        }
    }

    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f11358b = new d(new C0220a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f11359a;

        /* renamed from: Ta.a$d$a, reason: collision with other inner class name */
        public class C0220a extends Throwable {
            public C0220a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th2) {
            this.f11359a = (Throwable) Ra.n.k(th2);
        }
    }

    public static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f11364a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f11365b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f11366c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f11367d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f11368e;

        public f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f11364a = atomicReferenceFieldUpdater;
            this.f11365b = atomicReferenceFieldUpdater2;
            this.f11366c = atomicReferenceFieldUpdater3;
            this.f11367d = atomicReferenceFieldUpdater4;
            this.f11368e = atomicReferenceFieldUpdater5;
        }

        @Override // Ta.a.b
        public boolean a(a aVar, e eVar, e eVar2) {
            return AbstractC4221b.a(this.f11367d, aVar, eVar, eVar2);
        }

        @Override // Ta.a.b
        public boolean b(a aVar, Object obj, Object obj2) {
            return AbstractC4221b.a(this.f11368e, aVar, obj, obj2);
        }

        @Override // Ta.a.b
        public boolean c(a aVar, k kVar, k kVar2) {
            return AbstractC4221b.a(this.f11366c, aVar, kVar, kVar2);
        }

        @Override // Ta.a.b
        public e d(a aVar, e eVar) {
            return (e) this.f11367d.getAndSet(aVar, eVar);
        }

        @Override // Ta.a.b
        public k e(a aVar, k kVar) {
            return (k) this.f11366c.getAndSet(aVar, kVar);
        }

        @Override // Ta.a.b
        public void f(k kVar, k kVar2) {
            this.f11365b.lazySet(kVar, kVar2);
        }

        @Override // Ta.a.b
        public void g(k kVar, Thread thread) {
            this.f11364a.lazySet(kVar, thread);
        }
    }

    public static final class g extends b {
        public g() {
            super();
        }

        @Override // Ta.a.b
        public boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f11352b != eVar) {
                        return false;
                    }
                    aVar.f11352b = eVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // Ta.a.b
        public boolean b(a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f11351a != obj) {
                        return false;
                    }
                    aVar.f11351a = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // Ta.a.b
        public boolean c(a aVar, k kVar, k kVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f11353c != kVar) {
                        return false;
                    }
                    aVar.f11353c = kVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // Ta.a.b
        public e d(a aVar, e eVar) {
            e eVar2;
            synchronized (aVar) {
                try {
                    eVar2 = aVar.f11352b;
                    if (eVar2 != eVar) {
                        aVar.f11352b = eVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return eVar2;
        }

        @Override // Ta.a.b
        public k e(a aVar, k kVar) {
            k kVar2;
            synchronized (aVar) {
                try {
                    kVar2 = aVar.f11353c;
                    if (kVar2 != kVar) {
                        aVar.f11353c = kVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return kVar2;
        }

        @Override // Ta.a.b
        public void f(k kVar, k kVar2) {
            kVar.f11377b = kVar2;
        }

        @Override // Ta.a.b
        public void g(k kVar, Thread thread) {
            kVar.f11376a = thread;
        }
    }

    public interface h extends o {
    }

    public static abstract class i extends a implements h {
        @Override // Ta.a, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            return super.cancel(z10);
        }

        @Override // Ta.a, java.util.concurrent.Future
        public Object get() {
            return super.get();
        }

        @Override // Ta.a, java.util.concurrent.Future
        public boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // Ta.a, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // Ta.a, Ta.o
        public final void l(Runnable runnable, Executor executor) {
            super.l(runnable, executor);
        }

        @Override // Ta.a, java.util.concurrent.Future
        public final Object get(long j10, TimeUnit timeUnit) {
            return super.get(j10, timeUnit);
        }
    }

    public static final class j extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final Unsafe f11369a;

        /* renamed from: b, reason: collision with root package name */
        public static final long f11370b;

        /* renamed from: c, reason: collision with root package name */
        public static final long f11371c;

        /* renamed from: d, reason: collision with root package name */
        public static final long f11372d;

        /* renamed from: e, reason: collision with root package name */
        public static final long f11373e;

        /* renamed from: f, reason: collision with root package name */
        public static final long f11374f;

        /* renamed from: Ta.a$j$a, reason: collision with other inner class name */
        public class C0221a implements PrivilegedExceptionAction {
            @Override // java.security.PrivilegedExceptionAction
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Unsafe run() {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e10) {
                    throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new C0221a());
            }
            try {
                f11371c = unsafe.objectFieldOffset(a.class.getDeclaredField("c"));
                f11370b = unsafe.objectFieldOffset(a.class.getDeclaredField(com.google.crypto.tink.integration.android.b.f37029b));
                f11372d = unsafe.objectFieldOffset(a.class.getDeclaredField("a"));
                f11373e = unsafe.objectFieldOffset(k.class.getDeclaredField("a"));
                f11374f = unsafe.objectFieldOffset(k.class.getDeclaredField(com.google.crypto.tink.integration.android.b.f37029b));
                f11369a = unsafe;
            } catch (NoSuchFieldException e11) {
                throw new RuntimeException(e11);
            }
        }

        public j() {
            super();
        }

        @Override // Ta.a.b
        public boolean a(a aVar, e eVar, e eVar2) {
            return Ta.b.a(f11369a, aVar, f11370b, eVar, eVar2);
        }

        @Override // Ta.a.b
        public boolean b(a aVar, Object obj, Object obj2) {
            return Ta.b.a(f11369a, aVar, f11372d, obj, obj2);
        }

        @Override // Ta.a.b
        public boolean c(a aVar, k kVar, k kVar2) {
            return Ta.b.a(f11369a, aVar, f11371c, kVar, kVar2);
        }

        @Override // Ta.a.b
        public e d(a aVar, e eVar) {
            e eVar2;
            do {
                eVar2 = aVar.f11352b;
                if (eVar == eVar2) {
                    break;
                }
            } while (!a(aVar, eVar2, eVar));
            return eVar2;
        }

        @Override // Ta.a.b
        public k e(a aVar, k kVar) {
            k kVar2;
            do {
                kVar2 = aVar.f11353c;
                if (kVar == kVar2) {
                    break;
                }
            } while (!c(aVar, kVar2, kVar));
            return kVar2;
        }

        @Override // Ta.a.b
        public void f(k kVar, k kVar2) {
            f11369a.putObject(kVar, f11374f, kVar2);
        }

        @Override // Ta.a.b
        public void g(k kVar, Thread thread) {
            f11369a.putObject(kVar, f11373e, thread);
        }
    }

    public static final class k {

        /* renamed from: c, reason: collision with root package name */
        public static final k f11375c = new k(false);

        /* renamed from: a, reason: collision with root package name */
        public volatile Thread f11376a;

        /* renamed from: b, reason: collision with root package name */
        public volatile k f11377b;

        public k(boolean z10) {
        }

        public void a(k kVar) {
            a.f11349f.f(this, kVar);
        }

        public void b() {
            Thread thread = this.f11376a;
            if (thread != null) {
                this.f11376a = null;
                LockSupport.unpark(thread);
            }
        }

        public k() {
            a.f11349f.g(this, Thread.currentThread());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Error] */
    /* JADX WARN: Type inference failed for: r5v0, types: [Ta.a$a] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v3 */
    static {
        boolean z10;
        Throwable th2;
        b bVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", Constants.CASEFIRST_FALSE));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f11347d = z10;
        f11348e = new n(a.class);
        ?? r52 = 0;
        r52 = 0;
        try {
            bVar = new j();
            th2 = null;
        } catch (Error | Exception e10) {
            th2 = e10;
            try {
                bVar = new f(AtomicReferenceFieldUpdater.newUpdater(k.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(k.class, k.class, com.google.crypto.tink.integration.android.b.f37029b), AtomicReferenceFieldUpdater.newUpdater(a.class, k.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, com.google.crypto.tink.integration.android.b.f37029b), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            } catch (Error | Exception e11) {
                g gVar = new g();
                r52 = e11;
                bVar = gVar;
            }
        }
        f11349f = bVar;
        if (r52 != 0) {
            n nVar = f11348e;
            Logger a10 = nVar.a();
            Level level = Level.SEVERE;
            a10.log(level, "UnsafeAtomicHelper is broken!", th2);
            nVar.a().log(level, "SafeAtomicHelper is broken!", r52);
        }
        f11350g = new Object();
    }

    public static CancellationException n(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    public static void p(a aVar, boolean z10) {
        aVar.v();
        if (z10) {
            aVar.t();
        }
        aVar.k();
        e o10 = aVar.o(null);
        while (o10 != null) {
            e eVar = o10.f11363c;
            Runnable runnable = o10.f11361a;
            Objects.requireNonNull(runnable);
            Executor executor = o10.f11362b;
            Objects.requireNonNull(executor);
            q(runnable, executor);
            o10 = eVar;
        }
    }

    public static void q(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f11348e.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    private static Object s(Future future) {
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

    @Override // Ua.a
    public final Throwable a() {
        if (!(this instanceof h)) {
            return null;
        }
        Object obj = this.f11351a;
        if (obj instanceof d) {
            return ((d) obj).f11359a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f11351a;
        if (obj == null) {
            if (f11347d) {
                cVar = new c(z10, new CancellationException("Future.cancel() was called."));
            } else {
                cVar = z10 ? c.f11354c : c.f11355d;
                Objects.requireNonNull(cVar);
            }
            if (f11349f.b(this, obj, cVar)) {
                p(this, z10);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f11351a;
        if (obj != null) {
            return r(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            k kVar = this.f11353c;
            if (kVar != k.f11375c) {
                k kVar2 = new k();
                do {
                    kVar2.a(kVar);
                    if (f11349f.c(this, kVar, kVar2)) {
                        do {
                            t.a(this, nanos);
                            if (Thread.interrupted()) {
                                w(kVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f11351a;
                            if (obj2 != null) {
                                return r(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        w(kVar2);
                    } else {
                        kVar = this.f11353c;
                    }
                } while (kVar != k.f11375c);
            }
            Object obj3 = this.f11351a;
            Objects.requireNonNull(obj3);
            return r(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f11351a;
            if (obj4 != null) {
                return r(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String aVar = toString();
        String obj5 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj5.toLowerCase(locale);
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
        throw new TimeoutException(str + " for " + aVar);
    }

    public final void i(StringBuilder sb2) {
        try {
            Object s10 = s(this);
            sb2.append("SUCCESS, result=[");
            m(sb2, s10);
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        } catch (Exception e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f11351a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f11351a != null;
    }

    public final void j(StringBuilder sb2) {
        String str;
        int length = sb2.length();
        sb2.append("PENDING");
        try {
            str = Ra.s.a(u());
        } catch (Exception | StackOverflowError e10) {
            str = "Exception thrown from implementation: " + e10.getClass();
        }
        if (str != null) {
            sb2.append(", info=[");
            sb2.append(str);
            sb2.append("]");
        }
        if (isDone()) {
            sb2.delete(length, sb2.length());
            i(sb2);
        }
    }

    @Override // Ta.o
    public void l(Runnable runnable, Executor executor) {
        e eVar;
        Ra.n.l(runnable, "Runnable was null.");
        Ra.n.l(executor, "Executor was null.");
        if (!isDone() && (eVar = this.f11352b) != e.f11360d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f11363c = eVar;
                if (f11349f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f11352b;
                }
            } while (eVar != e.f11360d);
        }
        q(runnable, executor);
    }

    public final void m(StringBuilder sb2, Object obj) {
        if (obj == null) {
            sb2.append("null");
        } else {
            if (obj == this) {
                sb2.append("this future");
                return;
            }
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    public final e o(e eVar) {
        e eVar2 = eVar;
        e d10 = f11349f.d(this, e.f11360d);
        while (d10 != null) {
            e eVar3 = d10.f11363c;
            d10.f11363c = eVar2;
            eVar2 = d10;
            d10 = eVar3;
        }
        return eVar2;
    }

    public final Object r(Object obj) {
        if (obj instanceof c) {
            throw n("Task was cancelled.", ((c) obj).f11357b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f11359a);
        }
        return obj == f11350g ? s.b() : obj;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            i(sb2);
        } else {
            j(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String u() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void v() {
        for (k e10 = f11349f.e(this, k.f11375c); e10 != null; e10 = e10.f11377b) {
            e10.b();
        }
    }

    public final void w(k kVar) {
        kVar.f11376a = null;
        while (true) {
            k kVar2 = this.f11353c;
            if (kVar2 == k.f11375c) {
                return;
            }
            k kVar3 = null;
            while (kVar2 != null) {
                k kVar4 = kVar2.f11377b;
                if (kVar2.f11376a != null) {
                    kVar3 = kVar2;
                } else if (kVar3 != null) {
                    kVar3.f11377b = kVar4;
                    if (kVar3.f11376a == null) {
                        break;
                    }
                } else if (!f11349f.c(this, kVar2, kVar4)) {
                    break;
                }
                kVar2 = kVar4;
            }
            return;
        }
    }

    public boolean x(Object obj) {
        if (obj == null) {
            obj = f11350g;
        }
        if (!f11349f.b(this, null, obj)) {
            return false;
        }
        p(this, false);
        return true;
    }

    public boolean y(Throwable th2) {
        if (!f11349f.b(this, null, new d((Throwable) Ra.n.k(th2)))) {
            return false;
        }
        p(this, false);
        return true;
    }

    public final boolean z() {
        Object obj = this.f11351a;
        return (obj instanceof c) && ((c) obj).f11356a;
    }

    public static final class e {

        /* renamed from: d, reason: collision with root package name */
        public static final e f11360d = new e();

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f11361a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f11362b;

        /* renamed from: c, reason: collision with root package name */
        public e f11363c;

        public e(Runnable runnable, Executor executor) {
            this.f11361a = runnable;
            this.f11362b = executor;
        }

        public e() {
            this.f11361a = null;
            this.f11362b = null;
        }
    }

    public void k() {
    }

    public void t() {
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f11351a;
            if (obj2 != null) {
                return r(obj2);
            }
            k kVar = this.f11353c;
            if (kVar != k.f11375c) {
                k kVar2 = new k();
                do {
                    kVar2.a(kVar);
                    if (f11349f.c(this, kVar, kVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f11351a;
                            } else {
                                w(kVar2);
                                throw new InterruptedException();
                            }
                        } while (!(obj != null));
                        return r(obj);
                    }
                    kVar = this.f11353c;
                } while (kVar != k.f11375c);
            }
            Object obj3 = this.f11351a;
            Objects.requireNonNull(obj3);
            return r(obj3);
        }
        throw new InterruptedException();
    }
}
