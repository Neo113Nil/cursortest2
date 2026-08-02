package com.vk.reefton.literx.observable;

import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.er70;
import xsna.ign;
import xsna.izs;
import xsna.jfv0;
import xsna.l7i;
import xsna.lx60;
import xsna.u7i;
import xsna.z1v;

/* compiled from: ObservableFlatMapCompletable.kt */
/* loaded from: classes5.dex */
public final class ObservableFlatMapCompletable<T> extends l7i {
    public final ObservableFromIterable a;
    public final lx60 b;

    public ObservableFlatMapCompletable(ObservableFromIterable observableFromIterable, lx60 lx60Var) {
        this.a = observableFromIterable;
        this.b = lx60Var;
    }

    @Override // xsna.l7i
    public final void a(u7i u7iVar) {
        FlatMapCompletableObserver flatMapCompletableObserver = new FlatMapCompletableObserver(u7iVar, this.b);
        this.a.d(flatMapCompletableObserver);
        flatMapCompletableObserver.g = flatMapCompletableObserver;
    }

    /* compiled from: ObservableFlatMapCompletable.kt */
    public static final class FlatMapCompletableObserver<T> implements er70<T>, ign {
        public final Object b;
        public final izs<T, l7i> c;
        public final AtomicInteger d;
        public final ArrayList<FlatMapCompletableObserver<T>.InnerObserver> e;
        public final AtomicBoolean f;
        public ign g;
        public boolean h;

        public FlatMapCompletableObserver(u7i u7iVar, lx60 lx60Var) {
            this.b = u7iVar;
            this.c = lx60Var;
            AtomicInteger atomicInteger = new AtomicInteger();
            atomicInteger.lazySet(1);
            this.d = atomicInteger;
            this.e = new ArrayList<>();
            this.f = new AtomicBoolean();
        }

        @Override // xsna.er70
        public final void a(ign ignVar) {
            this.g = ignVar;
        }

        @Override // xsna.ign
        public final void dispose() {
            this.f.set(true);
            ign ignVar = this.g;
            if (ignVar != null) {
                ignVar.dispose();
            }
            Iterator<FlatMapCompletableObserver<T>.InnerObserver> it = this.e.iterator();
            while (it.hasNext()) {
                it.next().set(true);
            }
        }

        @Override // xsna.ign
        public final boolean h() {
            return this.f.get();
        }

        /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, xsna.u7i] */
        @Override // xsna.er70
        public final void onComplete() {
            if (this.f.get() || this.h || this.d.decrementAndGet() != 0) {
                return;
            }
            this.h = true;
            this.b.onComplete();
        }

        /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, xsna.u7i] */
        @Override // xsna.er70
        public final void onError(Throwable th) {
            if (!this.f.get() && !this.h) {
                this.h = true;
                this.b.onError(th);
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
            try {
                l7i invoke = this.c.invoke(t);
                if (this.f.get()) {
                    return;
                }
                this.d.getAndIncrement();
                FlatMapCompletableObserver<T>.InnerObserver innerObserver = new InnerObserver();
                synchronized (this.e) {
                    this.e.add(innerObserver);
                }
                invoke.a(innerObserver);
            } catch (Throwable th) {
                if (th instanceof VirtualMachineError) {
                    throw ((VirtualMachineError) th);
                }
                if (th instanceof ThreadDeath) {
                    throw ((ThreadDeath) th);
                }
                if (th instanceof LinkageError) {
                    throw ((LinkageError) th);
                }
                onError(th);
                dispose();
            }
        }

        /* compiled from: ObservableFlatMapCompletable.kt */
        public final class InnerObserver extends AtomicBoolean implements u7i, ign {
            public InnerObserver() {
            }

            @Override // xsna.ign
            public final void dispose() {
                set(true);
            }

            @Override // xsna.ign
            public final boolean h() {
                return get();
            }

            @Override // xsna.u7i
            public final void onComplete() {
                FlatMapCompletableObserver.this.onComplete();
            }

            @Override // xsna.u7i
            public final void onError(Throwable th) {
                FlatMapCompletableObserver.this.onError(th);
            }

            @Override // xsna.u7i
            public final void a(ign ignVar) {
            }
        }
    }
}
