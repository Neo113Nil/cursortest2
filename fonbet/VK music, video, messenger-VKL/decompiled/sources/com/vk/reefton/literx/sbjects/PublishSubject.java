package com.vk.reefton.literx.sbjects;

import java.lang.Thread;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import xsna.bum0;
import xsna.er70;
import xsna.ign;
import xsna.jfv0;
import xsna.z1v;

/* compiled from: PublishSubject.kt */
/* loaded from: classes5.dex */
public final class PublishSubject<T> extends bum0<T> {
    public final AtomicBoolean b = new AtomicBoolean();
    public final AtomicReference<HashSet<Subscriber<T>>> c;
    public Throwable d;

    /* compiled from: PublishSubject.kt */
    public static final class Subscriber<T> extends AtomicBoolean implements ign {
        private final er70<T> downstream;
        private final PublishSubject<T> parent;

        public Subscriber(PublishSubject<T> publishSubject, er70<T> er70Var) {
            this.parent = publishSubject;
            this.downstream = er70Var;
        }

        public final void d() {
            if (get()) {
                return;
            }
            this.downstream.onComplete();
        }

        @Override // xsna.ign
        public final void dispose() {
            if (get()) {
                return;
            }
            PublishSubject<T> publishSubject = this.parent;
            AtomicReference<HashSet<Subscriber<T>>> atomicReference = publishSubject.c;
            if (publishSubject.b.get()) {
                return;
            }
            HashSet<Subscriber<T>> hashSet = new HashSet<>();
            hashSet.addAll(atomicReference.get());
            hashSet.remove(this);
            atomicReference.set(hashSet);
        }

        public final void e(Throwable th) {
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

        public final void f(T t) {
            if (get()) {
                return;
            }
            this.downstream.onNext(t);
        }

        @Override // xsna.ign
        public final boolean h() {
            return get();
        }
    }

    public PublishSubject() {
        AtomicReference<HashSet<Subscriber<T>>> atomicReference = new AtomicReference<>();
        this.c = atomicReference;
        atomicReference.set(new HashSet<>());
    }

    @Override // xsna.er70
    public final void a(ign ignVar) {
        if (this.b.get()) {
            ignVar.dispose();
        }
    }

    @Override // xsna.iq70
    public final void d(er70<T> er70Var) {
        Subscriber<T> subscriber = new Subscriber<>(this, er70Var);
        er70Var.a(subscriber);
        if (this.b.get()) {
            Throwable th = this.d;
            if (th != null) {
                er70Var.onError(th);
                return;
            } else {
                er70Var.onComplete();
                return;
            }
        }
        HashSet<Subscriber<T>> hashSet = new HashSet<>();
        AtomicReference<HashSet<Subscriber<T>>> atomicReference = this.c;
        hashSet.addAll(atomicReference.get());
        hashSet.add(subscriber);
        atomicReference.set(hashSet);
    }

    @Override // xsna.er70
    public final void onComplete() {
        AtomicBoolean atomicBoolean = this.b;
        if (atomicBoolean.get()) {
            return;
        }
        Iterator<Subscriber<T>> it = this.c.get().iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        atomicBoolean.set(true);
    }

    @Override // xsna.er70
    public final void onError(Throwable th) {
        AtomicBoolean atomicBoolean = this.b;
        if (!atomicBoolean.get()) {
            this.d = th;
            Iterator<Subscriber<T>> it = this.c.get().iterator();
            while (it.hasNext()) {
                it.next().e(th);
            }
            atomicBoolean.set(true);
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

    @Override // xsna.er70
    public final void onNext(T t) {
        Iterator<Subscriber<T>> it = this.c.get().iterator();
        while (it.hasNext()) {
            it.next().f(t);
        }
    }
}
