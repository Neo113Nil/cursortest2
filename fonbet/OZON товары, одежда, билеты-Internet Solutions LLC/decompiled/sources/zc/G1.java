package zc;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class G1<T> extends AbstractC11019a<T, io.reactivex.p<T>> {

    /* renamed from: b, reason: collision with root package name */
    final long f107677b;

    /* renamed from: c, reason: collision with root package name */
    final long f107678c;

    /* renamed from: d, reason: collision with root package name */
    final int f107679d;

    static final class a<T> extends AtomicInteger implements io.reactivex.w<T>, InterfaceC8487b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super io.reactivex.p<T>> f107680a;

        /* renamed from: b, reason: collision with root package name */
        final long f107681b;

        /* renamed from: c, reason: collision with root package name */
        final int f107682c;

        /* renamed from: d, reason: collision with root package name */
        long f107683d;

        /* renamed from: e, reason: collision with root package name */
        InterfaceC8487b f107684e;

        /* renamed from: f, reason: collision with root package name */
        Nc.f<T> f107685f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f107686g;

        a(io.reactivex.w<? super io.reactivex.p<T>> wVar, long j11, int i11) {
            this.f107680a = wVar;
            this.f107681b = j11;
            this.f107682c = i11;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f107686g = true;
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f107686g;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            Nc.f<T> fVar = this.f107685f;
            if (fVar != null) {
                this.f107685f = null;
                fVar.onComplete();
            }
            this.f107680a.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            Nc.f<T> fVar = this.f107685f;
            if (fVar != null) {
                this.f107685f = null;
                fVar.onError(th2);
            }
            this.f107680a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            Nc.f<T> fVar = this.f107685f;
            if (fVar == null && !this.f107686g) {
                fVar = Nc.f.f(this, this.f107682c);
                this.f107685f = fVar;
                this.f107680a.onNext(fVar);
            }
            if (fVar != null) {
                fVar.onNext(t2);
                long j11 = this.f107683d + 1;
                this.f107683d = j11;
                if (j11 >= this.f107681b) {
                    this.f107683d = 0L;
                    this.f107685f = null;
                    fVar.onComplete();
                    if (this.f107686g) {
                        this.f107684e.dispose();
                    }
                }
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f107684e, interfaceC8487b)) {
                this.f107684e = interfaceC8487b;
                this.f107680a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f107686g) {
                this.f107684e.dispose();
            }
        }
    }

    static final class b<T> extends AtomicBoolean implements io.reactivex.w<T>, InterfaceC8487b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super io.reactivex.p<T>> f107687a;

        /* renamed from: b, reason: collision with root package name */
        final long f107688b;

        /* renamed from: c, reason: collision with root package name */
        final long f107689c;

        /* renamed from: d, reason: collision with root package name */
        final int f107690d;

        /* renamed from: f, reason: collision with root package name */
        long f107692f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f107693g;

        /* renamed from: h, reason: collision with root package name */
        long f107694h;

        /* renamed from: i, reason: collision with root package name */
        InterfaceC8487b f107695i;

        /* renamed from: j, reason: collision with root package name */
        final AtomicInteger f107696j = new AtomicInteger();

        /* renamed from: e, reason: collision with root package name */
        final ArrayDeque<Nc.f<T>> f107691e = new ArrayDeque<>();

        b(io.reactivex.w<? super io.reactivex.p<T>> wVar, long j11, long j12, int i11) {
            this.f107687a = wVar;
            this.f107688b = j11;
            this.f107689c = j12;
            this.f107690d = i11;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f107693g = true;
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f107693g;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            ArrayDeque<Nc.f<T>> arrayDeque = this.f107691e;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onComplete();
            }
            this.f107687a.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            ArrayDeque<Nc.f<T>> arrayDeque = this.f107691e;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onError(th2);
            }
            this.f107687a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            ArrayDeque<Nc.f<T>> arrayDeque = this.f107691e;
            long j11 = this.f107692f;
            long j12 = this.f107689c;
            if (j11 % j12 == 0 && !this.f107693g) {
                this.f107696j.getAndIncrement();
                Nc.f<T> f7 = Nc.f.f(this, this.f107690d);
                arrayDeque.offer(f7);
                this.f107687a.onNext(f7);
            }
            long j13 = this.f107694h + 1;
            Iterator<Nc.f<T>> it = arrayDeque.iterator();
            while (it.hasNext()) {
                it.next().onNext(t2);
            }
            if (j13 >= this.f107688b) {
                arrayDeque.poll().onComplete();
                if (arrayDeque.isEmpty() && this.f107693g) {
                    this.f107695i.dispose();
                    return;
                }
                this.f107694h = j13 - j12;
            } else {
                this.f107694h = j13;
            }
            this.f107692f = j11 + 1;
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f107695i, interfaceC8487b)) {
                this.f107695i = interfaceC8487b;
                this.f107687a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f107696j.decrementAndGet() == 0 && this.f107693g) {
                this.f107695i.dispose();
            }
        }
    }

    public G1(io.reactivex.p pVar, long j11, long j12, int i11) {
        super(pVar);
        this.f107677b = j11;
        this.f107678c = j12;
        this.f107679d = i11;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super io.reactivex.p<T>> wVar) {
        long j11 = this.f107677b;
        long j12 = this.f107678c;
        io.reactivex.u<T> uVar = this.f108122a;
        if (j11 == j12) {
            uVar.subscribe(new a(wVar, j11, this.f107679d));
        } else {
            uVar.subscribe(new b(wVar, this.f107677b, this.f107678c, this.f107679d));
        }
    }
}
