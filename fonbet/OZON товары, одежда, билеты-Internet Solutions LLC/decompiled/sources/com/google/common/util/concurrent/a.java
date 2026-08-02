package com.google.common.util.concurrent;

import Bl0.k0;
import C.C2702w;
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

/* loaded from: classes.dex */
public abstract class a<V> extends R7.a implements m<V> {

    /* renamed from: d, reason: collision with root package name */
    static final boolean f59167d;

    /* renamed from: e, reason: collision with root package name */
    static final l f59168e;

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC0902a f59169f;

    /* renamed from: g, reason: collision with root package name */
    private static final Object f59170g;

    /* renamed from: a, reason: collision with root package name */
    private volatile Object f59171a;

    /* renamed from: b, reason: collision with root package name */
    private volatile d f59172b;

    /* renamed from: c, reason: collision with root package name */
    private volatile k f59173c;

    /* renamed from: com.google.common.util.concurrent.a$a, reason: collision with other inner class name */
    private static abstract class AbstractC0902a {
        abstract boolean a(a<?> aVar, d dVar, d dVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, k kVar, k kVar2);

        abstract d d(a<?> aVar, d dVar);

        abstract k e(a aVar);

        abstract void f(k kVar, k kVar2);

        abstract void g(k kVar, Thread thread);
    }

    private static final class b {

        /* renamed from: c, reason: collision with root package name */
        static final b f59174c;

        /* renamed from: d, reason: collision with root package name */
        static final b f59175d;

        /* renamed from: a, reason: collision with root package name */
        final boolean f59176a;

        /* renamed from: b, reason: collision with root package name */
        final RuntimeException f59177b;

        static {
            if (a.f59167d) {
                f59175d = null;
                f59174c = null;
            } else {
                f59175d = new b(false, null);
                f59174c = new b(true, null);
            }
        }

        b(boolean z11, RuntimeException runtimeException) {
            this.f59176a = z11;
            this.f59177b = runtimeException;
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        final Throwable f59178a;

        /* renamed from: com.google.common.util.concurrent.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes9.dex */
        final class C0903a extends Throwable {
            C0903a() {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new c(new C0903a());
        }

        c(Throwable th2) {
            th2.getClass();
            this.f59178a = th2;
        }
    }

    /* loaded from: classes9.dex */
    private static final class e extends AbstractC0902a {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<k, Thread> f59183a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<k, k> f59184b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<? super a<?>, k> f59185c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<? super a<?>, d> f59186d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<? super a<?>, Object> f59187e;

        e(AtomicReferenceFieldUpdater<k, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<k, k> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<? super a<?>, k> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<? super a<?>, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<? super a<?>, Object> atomicReferenceFieldUpdater5) {
            this.f59183a = atomicReferenceFieldUpdater;
            this.f59184b = atomicReferenceFieldUpdater2;
            this.f59185c = atomicReferenceFieldUpdater3;
            this.f59186d = atomicReferenceFieldUpdater4;
            this.f59187e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0902a
        final boolean a(a<?> aVar, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<? super a<?>, d> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f59186d;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, dVar, dVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == dVar);
            return false;
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0902a
        final boolean b(a<?> aVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<? super a<?>, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f59187e;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == obj);
            return false;
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0902a
        final boolean c(a<?> aVar, k kVar, k kVar2) {
            AtomicReferenceFieldUpdater<? super a<?>, k> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f59185c;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, kVar, kVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == kVar);
            return false;
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0902a
        final d d(a<?> aVar, d dVar) {
            return this.f59186d.getAndSet(aVar, dVar);
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0902a
        final k e(a aVar) {
            return this.f59185c.getAndSet(aVar, k.f59194c);
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0902a
        final void f(k kVar, k kVar2) {
            this.f59184b.lazySet(kVar, kVar2);
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0902a
        final void g(k kVar, Thread thread) {
            this.f59183a.lazySet(kVar, thread);
        }
    }

    private static final class f<V> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            if (null.f59171a != this) {
                return;
            }
            if (a.f59169f.b(null, this, a.f(null))) {
                a.o(null, false);
            }
        }
    }

    /* loaded from: classes9.dex */
    private static final class g extends AbstractC0902a {
        g() {
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0902a
        final boolean a(a<?> aVar, d dVar, d dVar2) {
            synchronized (aVar) {
                try {
                    if (((a) aVar).f59172b != dVar) {
                        return false;
                    }
                    ((a) aVar).f59172b = dVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0902a
        final boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (((a) aVar).f59171a != obj) {
                        return false;
                    }
                    ((a) aVar).f59171a = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0902a
        final boolean c(a<?> aVar, k kVar, k kVar2) {
            synchronized (aVar) {
                try {
                    if (((a) aVar).f59173c != kVar) {
                        return false;
                    }
                    ((a) aVar).f59173c = kVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0902a
        final d d(a<?> aVar, d dVar) {
            d dVar2;
            synchronized (aVar) {
                try {
                    dVar2 = ((a) aVar).f59172b;
                    if (dVar2 != dVar) {
                        ((a) aVar).f59172b = dVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return dVar2;
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0902a
        final k e(a aVar) {
            k kVar;
            k kVar2 = k.f59194c;
            synchronized (aVar) {
                try {
                    kVar = aVar.f59173c;
                    if (kVar != kVar2) {
                        aVar.f59173c = kVar2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return kVar;
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0902a
        final void f(k kVar, k kVar2) {
            kVar.f59196b = kVar2;
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0902a
        final void g(k kVar, Thread thread) {
            kVar.f59195a = thread;
        }
    }

    interface h<V> extends m<V> {
    }

    static abstract class i<V> extends a<V> implements h<V> {
    }

    private static final class j extends AbstractC0902a {

        /* renamed from: a, reason: collision with root package name */
        static final Unsafe f59188a;

        /* renamed from: b, reason: collision with root package name */
        static final long f59189b;

        /* renamed from: c, reason: collision with root package name */
        static final long f59190c;

        /* renamed from: d, reason: collision with root package name */
        static final long f59191d;

        /* renamed from: e, reason: collision with root package name */
        static final long f59192e;

        /* renamed from: f, reason: collision with root package name */
        static final long f59193f;

        /* renamed from: com.google.common.util.concurrent.a$j$a, reason: collision with other inner class name */
        final class C0904a implements PrivilegedExceptionAction<Unsafe> {
            public static Unsafe a() throws Exception {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }

            @Override // java.security.PrivilegedExceptionAction
            public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
                return a();
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e11) {
                    throw new RuntimeException("Could not initialize intrinsics", e11.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new C0904a());
            }
            try {
                f59190c = unsafe.objectFieldOffset(a.class.getDeclaredField("c"));
                f59189b = unsafe.objectFieldOffset(a.class.getDeclaredField("b"));
                f59191d = unsafe.objectFieldOffset(a.class.getDeclaredField("a"));
                f59192e = unsafe.objectFieldOffset(k.class.getDeclaredField("a"));
                f59193f = unsafe.objectFieldOffset(k.class.getDeclaredField("b"));
                f59188a = unsafe;
            } catch (NoSuchFieldException e12) {
                throw new RuntimeException(e12);
            }
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0902a
        final boolean a(a<?> aVar, d dVar, d dVar2) {
            return com.google.common.util.concurrent.b.a(f59188a, aVar, f59189b, dVar, dVar2);
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0902a
        final boolean b(a<?> aVar, Object obj, Object obj2) {
            return com.google.common.util.concurrent.b.a(f59188a, aVar, f59191d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0902a
        final boolean c(a<?> aVar, k kVar, k kVar2) {
            return com.google.common.util.concurrent.b.a(f59188a, aVar, f59190c, kVar, kVar2);
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0902a
        final d d(a<?> aVar, d dVar) {
            d dVar2;
            do {
                dVar2 = ((a) aVar).f59172b;
                if (dVar == dVar2) {
                    break;
                }
            } while (!a(aVar, dVar2, dVar));
            return dVar2;
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0902a
        final k e(a aVar) {
            k kVar;
            k kVar2 = k.f59194c;
            do {
                kVar = aVar.f59173c;
                if (kVar2 == kVar) {
                    break;
                }
            } while (!c(aVar, kVar, kVar2));
            return kVar;
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0902a
        final void f(k kVar, k kVar2) {
            f59188a.putObject(kVar, f59193f, kVar2);
        }

        @Override // com.google.common.util.concurrent.a.AbstractC0902a
        final void g(k kVar, Thread thread) {
            f59188a.putObject(kVar, f59192e, thread);
        }
    }

    private static final class k {

        /* renamed from: c, reason: collision with root package name */
        static final k f59194c = new k();

        /* renamed from: a, reason: collision with root package name */
        volatile Thread f59195a;

        /* renamed from: b, reason: collision with root package name */
        volatile k f59196b;

        k() {
            a.f59169f.g(this, Thread.currentThread());
        }
    }

    static {
        boolean z11;
        Throwable th2;
        AbstractC0902a gVar;
        try {
            z11 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z11 = false;
        }
        f59167d = z11;
        f59168e = new l(a.class);
        Throwable th3 = null;
        try {
            gVar = new j();
            th2 = null;
        } catch (Error | Exception e11) {
            th2 = e11;
            try {
                gVar = new e(AtomicReferenceFieldUpdater.newUpdater(k.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(k.class, k.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, k.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            } catch (Error | Exception e12) {
                th3 = e12;
                gVar = new g();
            }
        }
        f59169f = gVar;
        if (th3 != null) {
            l lVar = f59168e;
            Logger a11 = lVar.a();
            Level level = Level.SEVERE;
            a11.log(level, "UnsafeAtomicHelper is broken!", th2);
            lVar.a().log(level, "SafeAtomicHelper is broken!", th3);
        }
        f59170g = new Object();
    }

    protected a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static Object f(m mVar) {
        Object bVar;
        Throwable a11;
        if (mVar instanceof h) {
            Object obj = ((a) mVar).f59171a;
            if (obj instanceof b) {
                b bVar2 = (b) obj;
                if (bVar2.f59176a) {
                    obj = bVar2.f59177b != null ? new b(false, bVar2.f59177b) : b.f59175d;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        }
        if ((mVar instanceof R7.a) && (a11 = R7.b.a((R7.a) mVar)) != null) {
            return new c(a11);
        }
        com.google.common.util.concurrent.k kVar = (com.google.common.util.concurrent.k) mVar;
        boolean isCancelled = kVar.isCancelled();
        try {
            try {
                try {
                    Object r11 = r(kVar);
                    if (isCancelled) {
                        r11 = new b(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + kVar));
                    } else if (r11 == null) {
                        return f59170g;
                    }
                    return r11;
                } catch (Error e11) {
                    e = e11;
                    return new c(e);
                }
            } catch (Error | Exception e12) {
                e = e12;
                return new c(e);
            }
        } catch (CancellationException e13) {
            if (isCancelled) {
                return new b(false, e13);
            }
            bVar = new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + kVar, e13));
            return bVar;
        } catch (ExecutionException e14) {
            if (!isCancelled) {
                return new c(e14.getCause());
            }
            bVar = new b(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + kVar, e14));
            return bVar;
        }
    }

    private void l(StringBuilder sb2) {
        try {
            Object r11 = r(this);
            sb2.append("SUCCESS, result=[");
            n(sb2, r11);
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        } catch (Exception e12) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e12.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    private void n(StringBuilder sb2, Object obj) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(a<?> aVar, boolean z11) {
        aVar.getClass();
        for (k e11 = f59169f.e(aVar); e11 != null; e11 = e11.f59196b) {
            Thread thread = e11.f59195a;
            if (thread != null) {
                e11.f59195a = null;
                LockSupport.unpark(thread);
            }
        }
        aVar.m();
        d d11 = f59169f.d(aVar, d.f59179d);
        d dVar = null;
        while (d11 != null) {
            d dVar2 = d11.f59182c;
            d11.f59182c = dVar;
            dVar = d11;
            d11 = dVar2;
        }
        while (dVar != null) {
            d dVar3 = dVar.f59182c;
            Runnable runnable = dVar.f59180a;
            Objects.requireNonNull(runnable);
            if (runnable instanceof f) {
                throw null;
            }
            Executor executor = dVar.f59181b;
            Objects.requireNonNull(executor);
            p(runnable, executor);
            dVar = dVar3;
        }
    }

    private static void p(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e11) {
            f59168e.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e11);
        }
    }

    private static Object q(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            RuntimeException runtimeException = ((b) obj).f59177b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(runtimeException);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f59178a);
        }
        if (obj == f59170g) {
            return null;
        }
        return obj;
    }

    private static Object r(m mVar) throws ExecutionException {
        V v11;
        boolean z11 = false;
        while (true) {
            try {
                v11 = mVar.get();
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            } catch (Throwable th2) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        return v11;
    }

    private void u(k kVar) {
        kVar.f59195a = null;
        while (true) {
            k kVar2 = this.f59173c;
            if (kVar2 == k.f59194c) {
                return;
            }
            k kVar3 = null;
            while (kVar2 != null) {
                k kVar4 = kVar2.f59196b;
                if (kVar2.f59195a != null) {
                    kVar3 = kVar2;
                } else if (kVar3 != null) {
                    kVar3.f59196b = kVar4;
                    if (kVar3.f59195a == null) {
                        break;
                    }
                } else if (!f59169f.c(this, kVar2, kVar4)) {
                    break;
                }
                kVar2 = kVar4;
            }
            return;
        }
    }

    @Override // com.google.common.util.concurrent.m
    public void a(Runnable runnable, Executor executor) {
        d dVar;
        k0.g(executor, "Executor was null.");
        if (!isDone() && (dVar = this.f59172b) != d.f59179d) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.f59182c = dVar;
                if (f59169f.a(this, dVar, dVar2)) {
                    return;
                } else {
                    dVar = this.f59172b;
                }
            } while (dVar != d.f59179d);
        }
        p(runnable, executor);
    }

    @Override // R7.a
    protected final Throwable b() {
        if (!(this instanceof h)) {
            return null;
        }
        Object obj = this.f59171a;
        if (obj instanceof c) {
            return ((c) obj).f59178a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        b bVar;
        Object obj = this.f59171a;
        if ((obj == null) | (obj instanceof f)) {
            if (f59167d) {
                bVar = new b(z11, new CancellationException("Future.cancel() was called."));
            } else {
                bVar = z11 ? b.f59174c : b.f59175d;
                Objects.requireNonNull(bVar);
            }
            while (!f59169f.b(this, obj, bVar)) {
                obj = this.f59171a;
                if (!(obj instanceof f)) {
                }
            }
            o(this, z11);
            if (!(obj instanceof f)) {
                return true;
            }
            ((f) obj).getClass();
            throw null;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public V get(long j11, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        boolean z11;
        long nanos = timeUnit.toNanos(j11);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f59171a;
        if ((obj != null) && (!(obj instanceof f))) {
            return (V) q(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            k kVar = this.f59173c;
            k kVar2 = k.f59194c;
            if (kVar != kVar2) {
                k kVar3 = new k();
                z11 = true;
                do {
                    f59169f.f(kVar3, kVar);
                    if (f59169f.c(this, kVar, kVar3)) {
                        do {
                            p.a(this, nanos);
                            if (Thread.interrupted()) {
                                u(kVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f59171a;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return (V) q(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        u(kVar3);
                    } else {
                        kVar = this.f59173c;
                    }
                } while (kVar != kVar2);
            }
            Object obj3 = this.f59171a;
            Objects.requireNonNull(obj3);
            return (V) q(obj3);
        }
        z11 = true;
        while (nanos > 0) {
            Object obj4 = this.f59171a;
            if ((obj4 != null ? z11 : false) && (!(obj4 instanceof f))) {
                return (V) q(obj4);
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
        StringBuilder d11 = C2702w.d(j11, "Waited ", " ");
        d11.append(timeUnit.toString().toLowerCase(locale));
        String sb2 = d11.toString();
        if (nanos + 1000 < 0) {
            String e11 = U7.d.e(sb2, " (plus ");
            long j12 = -nanos;
            long convert = timeUnit.convert(j12, TimeUnit.NANOSECONDS);
            long nanos2 = j12 - timeUnit.toNanos(convert);
            boolean z12 = (convert == 0 || nanos2 > 1000) ? z11 : false;
            if (convert > 0) {
                String str = e11 + convert + " " + lowerCase;
                if (z12) {
                    str = U7.d.e(str, ",");
                }
                e11 = U7.d.e(str, " ");
            }
            if (z12) {
                e11 = e11 + nanos2 + " nanoseconds ";
            }
            sb2 = U7.d.e(e11, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(U7.d.e(sb2, " but future completed as timeout expired"));
        }
        throw new TimeoutException(G.g.c(sb2, " for ", aVar));
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f59171a instanceof b;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof f)) & (this.f59171a != null);
    }

    protected void m() {
    }

    final void s(Future<?> future) {
        if ((future != null) && isCancelled()) {
            Object obj = this.f59171a;
            if (obj instanceof b) {
                boolean z11 = ((b) obj).f59176a;
            }
            future.getClass();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String t() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0096, code lost:
    
        if (r3.isEmpty() != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
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
            l(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            Object obj = this.f59171a;
            if (obj instanceof f) {
                sb2.append(", setFuture=[");
                ((f) obj).getClass();
                try {
                    sb2.append((Object) null);
                } catch (Exception | StackOverflowError e11) {
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(e11.getClass());
                }
                sb2.append("]");
            } else {
                try {
                    str = t();
                    if (str != null) {
                    }
                    str = null;
                } catch (Exception | StackOverflowError e12) {
                    str = "Exception thrown from implementation: " + e12.getClass();
                }
                if (str != null) {
                    sb2.append(", info=[");
                    sb2.append(str);
                    sb2.append("]");
                }
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                l(sb2);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    protected boolean v(V v11) {
        if (v11 == null) {
            v11 = (V) f59170g;
        }
        if (!f59169f.b(this, null, v11)) {
            return false;
        }
        o(this, false);
        return true;
    }

    protected boolean w(Throwable th2) {
        th2.getClass();
        if (!f59169f.b(this, null, new c(th2))) {
            return false;
        }
        o(this, false);
        return true;
    }

    private static final class d {

        /* renamed from: d, reason: collision with root package name */
        static final d f59179d = new d();

        /* renamed from: a, reason: collision with root package name */
        final Runnable f59180a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f59181b;

        /* renamed from: c, reason: collision with root package name */
        d f59182c;

        d(Runnable runnable, Executor executor) {
            this.f59180a = runnable;
            this.f59181b = executor;
        }

        d() {
            this.f59180a = null;
            this.f59181b = null;
        }
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f59171a;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return (V) q(obj2);
            }
            k kVar = this.f59173c;
            k kVar2 = k.f59194c;
            if (kVar != kVar2) {
                k kVar3 = new k();
                do {
                    f59169f.f(kVar3, kVar);
                    if (f59169f.c(this, kVar, kVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f59171a;
                            } else {
                                u(kVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return (V) q(obj);
                    }
                    kVar = this.f59173c;
                } while (kVar != kVar2);
            }
            Object obj3 = this.f59171a;
            Objects.requireNonNull(obj3);
            return (V) q(obj3);
        }
        throw new InterruptedException();
    }
}
