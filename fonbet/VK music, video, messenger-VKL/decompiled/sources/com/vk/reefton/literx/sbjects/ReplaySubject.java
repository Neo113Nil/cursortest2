package com.vk.reefton.literx.sbjects;

import java.lang.Thread;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import xsna.bum0;
import xsna.epx;
import xsna.er70;
import xsna.ign;
import xsna.jfv0;
import xsna.s3q0;
import xsna.so;
import xsna.z1v;

/* compiled from: ReplaySubject.kt */
/* loaded from: classes5.dex */
public final class ReplaySubject<T> extends bum0<T> {
    public final a b;
    public final AtomicBoolean c = new AtomicBoolean();
    public final AtomicReference<HashSet<Subscriber<T>>> d;
    public Throwable e;

    /* compiled from: ReplaySubject.kt */
    public static final class Subscriber<T> extends AtomicBoolean implements ign {
        private final er70<T> downstream;
        private b<T> index;
        private final ReplaySubject<T> parent;

        public Subscriber(ReplaySubject<T> replaySubject, er70<T> er70Var) {
            this.parent = replaySubject;
            this.downstream = er70Var;
        }

        public final b<T> d() {
            return this.index;
        }

        @Override // xsna.ign
        public final void dispose() {
            if (get()) {
                return;
            }
            set(true);
            ReplaySubject<T> replaySubject = this.parent;
            AtomicReference<HashSet<Subscriber<T>>> atomicReference = replaySubject.d;
            if (replaySubject.c.get()) {
                return;
            }
            HashSet<Subscriber<T>> hashSet = new HashSet<>();
            hashSet.addAll(atomicReference.get());
            hashSet.remove(this);
            atomicReference.set(hashSet);
        }

        public final void g() {
            if (get()) {
                return;
            }
            this.downstream.onComplete();
        }

        @Override // xsna.ign
        public final boolean h() {
            return get();
        }

        public final void i(Throwable th) {
            if (!get()) {
                this.downstream.onError(th);
                return;
            }
            jfv0.b bVar = z1v.a;
            if (bVar != null) {
                bVar.invoke(th);
                return;
            }
            th.printStackTrace();
            Thread currentThread = Thread.currentThread();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(currentThread, th);
            }
        }

        public final void j(T t) {
            if (get()) {
                return;
            }
            this.downstream.onNext(t);
        }

        public final void k(b<T> bVar) {
            this.index = bVar;
        }
    }

    /* compiled from: ReplaySubject.kt */
    public static final class a<T> {
        public boolean a;
        public int b;
        public b<T> c;
        public b<T> d;

        public final void a(b<T> bVar) {
            b<T> bVar2;
            synchronized (this) {
                try {
                    if (this.a) {
                        return;
                    }
                    if (this.c != null && (bVar2 = this.d) != null) {
                        this.d = bVar;
                        bVar2.a.set(bVar);
                        int i = this.b + 1;
                        this.b = i;
                        if (i > 50) {
                            this.c = this.c.a.get();
                            this.b--;
                        }
                        s3q0 s3q0Var = s3q0.a;
                        return;
                    }
                    this.c = bVar;
                    this.d = bVar;
                    this.b++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b(Subscriber<T> subscriber) {
            b<T> bVar;
            while (true) {
                if (subscriber.d() == null) {
                    bVar = this.c;
                    if (bVar == null) {
                        return;
                    }
                } else {
                    b<T> d = subscriber.d();
                    if ((d == null && (d = this.c) == null) || (bVar = d.a.get()) == null) {
                        return;
                    }
                }
                if (bVar instanceof b.C1756b) {
                    subscriber.j(((b.C1756b) bVar).b);
                } else {
                    if (!(bVar instanceof b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    subscriber.i(((b.a) bVar).b);
                }
                subscriber.k(bVar);
            }
        }
    }

    /* compiled from: ReplaySubject.kt */
    public static abstract class b<T> {
        public final AtomicReference<b<T>> a = new AtomicReference<>();

        /* compiled from: ReplaySubject.kt */
        public static final class a<T> extends b<T> {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "ErrorNode(t=" + this.b + ")";
            }
        }

        /* compiled from: ReplaySubject.kt */
        /* renamed from: com.vk.reefton.literx.sbjects.ReplaySubject$b$b, reason: collision with other inner class name */
        public static final class C1756b<T> extends b<T> {
            public final T b;

            public C1756b(T t) {
                this.b = t;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1756b) && epx.f(this.b, ((C1756b) obj).b);
            }

            public final int hashCode() {
                T t = this.b;
                if (t == null) {
                    return 0;
                }
                return t.hashCode();
            }

            public final String toString() {
                return so.a(this.b, "ItemNode(item=", ")");
            }
        }
    }

    public ReplaySubject(a aVar) {
        this.b = aVar;
        AtomicReference<HashSet<Subscriber<T>>> atomicReference = new AtomicReference<>();
        atomicReference.set(new HashSet<>());
        this.d = atomicReference;
    }

    @Override // xsna.er70
    public final void a(ign ignVar) {
        if (this.c.get()) {
            ignVar.dispose();
        }
    }

    @Override // xsna.iq70
    public final void d(er70<T> er70Var) {
        Subscriber<T> subscriber = new Subscriber<>(this, er70Var);
        er70Var.a(subscriber);
        if (this.c.get()) {
            Throwable th = this.e;
            if (th != null) {
                er70Var.onError(th);
                return;
            } else {
                er70Var.onComplete();
                return;
            }
        }
        HashSet<Subscriber<T>> hashSet = new HashSet<>();
        AtomicReference<HashSet<Subscriber<T>>> atomicReference = this.d;
        hashSet.addAll(atomicReference.get());
        hashSet.add(subscriber);
        atomicReference.set(hashSet);
        this.b.b(subscriber);
    }

    @Override // xsna.er70
    public final void onComplete() {
        AtomicBoolean atomicBoolean = this.c;
        if (atomicBoolean.get()) {
            return;
        }
        Iterator<Subscriber<T>> it = this.d.get().iterator();
        while (it.hasNext()) {
            it.next().g();
        }
        atomicBoolean.set(true);
    }

    @Override // xsna.er70
    public final void onError(Throwable th) {
        a aVar = this.b;
        AtomicBoolean atomicBoolean = this.c;
        if (atomicBoolean.get()) {
            jfv0.b bVar = z1v.a;
            if (bVar != null) {
                bVar.invoke(th);
                return;
            }
            th.printStackTrace();
            Thread currentThread = Thread.currentThread();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(currentThread, th);
                return;
            }
            return;
        }
        this.e = th;
        b.a aVar2 = new b.a(th);
        synchronized (aVar) {
            if (!aVar.a) {
                aVar.a(aVar2);
                aVar.a = true;
                s3q0 s3q0Var = s3q0.a;
            }
        }
        Iterator<Subscriber<T>> it = this.d.get().iterator();
        while (it.hasNext()) {
            aVar.b(it.next());
        }
        atomicBoolean.set(true);
    }

    @Override // xsna.er70
    public final void onNext(T t) {
        b.C1756b c1756b = new b.C1756b(t);
        a aVar = this.b;
        aVar.a(c1756b);
        Iterator<Subscriber<T>> it = this.d.get().iterator();
        while (it.hasNext()) {
            aVar.b(it.next());
        }
    }
}
