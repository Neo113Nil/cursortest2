package com.vk.reefton.literx.observable;

import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import xsna.b8h0;
import xsna.epx;
import xsna.er70;
import xsna.ign;
import xsna.iq70;
import xsna.so;

/* compiled from: ObservableObserveOn.kt */
/* loaded from: classes5.dex */
public final class ObservableObserveOn<T> extends iq70<T> {
    public final iq70<T> b;
    public final b8h0 c;

    /* compiled from: ObservableObserveOn.kt */
    public static final class ObserveOnObserver<T> extends AtomicReference<ign> implements er70<T>, ign, Runnable {
        private volatile boolean disposed;
        private final er70<T> downstream;
        private final b8h0 scheduler;
        private final AtomicInteger wip = new AtomicInteger();
        private final ConcurrentLinkedDeque<a<T>> queue = new ConcurrentLinkedDeque<>();

        public ObserveOnObserver(er70<T> er70Var, b8h0 b8h0Var) {
            this.downstream = er70Var;
            this.scheduler = b8h0Var;
        }

        @Override // xsna.er70
        public final void a(ign ignVar) {
            set(ignVar);
        }

        @Override // xsna.ign
        public final void dispose() {
            if (this.disposed) {
                return;
            }
            this.disposed = true;
            get().dispose();
            this.queue.clear();
        }

        @Override // xsna.ign
        public final boolean h() {
            return this.disposed;
        }

        @Override // xsna.er70
        public final void onComplete() {
            this.queue.offer(new a.C1755a());
            if (this.wip.getAndIncrement() == 0) {
                this.scheduler.b(this);
            }
        }

        @Override // xsna.er70
        public final void onError(Throwable th) {
            this.queue.offer(new a.b(th));
            if (this.wip.getAndIncrement() == 0) {
                this.scheduler.b(this);
            }
        }

        @Override // xsna.er70
        public final void onNext(T t) {
            this.queue.offer(new a.c(t));
            if (this.wip.getAndIncrement() == 0) {
                this.scheduler.b(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            do {
                a<T> poll = this.queue.poll();
                if (poll == null) {
                    return;
                }
                if (poll instanceof a.c) {
                    this.downstream.onNext(((a.c) poll).a);
                } else if (poll instanceof a.b) {
                    this.downstream.onError(((a.b) poll).a);
                } else {
                    if (!(poll instanceof a.C1755a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.downstream.onComplete();
                }
            } while (this.wip.decrementAndGet() != 0);
        }
    }

    /* compiled from: ObservableObserveOn.kt */
    public static abstract class a<T> {

        /* compiled from: ObservableObserveOn.kt */
        /* renamed from: com.vk.reefton.literx.observable.ObservableObserveOn$a$a, reason: collision with other inner class name */
        public static final class C1755a<T> extends a<T> {
        }

        /* compiled from: ObservableObserveOn.kt */
        public static final class b<T> extends a<T> {
            public final Throwable a;

            public b(Throwable th) {
                this.a = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Error(error=" + this.a + ")";
            }
        }

        /* compiled from: ObservableObserveOn.kt */
        public static final class c<T> extends a<T> {
            public final T a;

            public c(T t) {
                this.a = t;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                T t = this.a;
                if (t == null) {
                    return 0;
                }
                return t.hashCode();
            }

            public final String toString() {
                return so.a(this.a, "Item(item=", ")");
            }
        }
    }

    public ObservableObserveOn(iq70<T> iq70Var, b8h0 b8h0Var) {
        this.b = iq70Var;
        this.c = b8h0Var;
    }

    @Override // xsna.iq70
    public final void d(er70<T> er70Var) {
        ObserveOnObserver observeOnObserver = new ObserveOnObserver(er70Var, this.c);
        this.b.d(observeOnObserver);
        er70Var.a(observeOnObserver);
    }
}
