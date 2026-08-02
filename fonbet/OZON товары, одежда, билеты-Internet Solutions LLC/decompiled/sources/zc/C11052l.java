package zc;

import Bl0.C2645f;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import nc.InterfaceC8487b;
import sc.C9656b;

/* renamed from: zc.l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11052l<T, U extends Collection<? super T>> extends AbstractC11019a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final int f108369b;

    /* renamed from: c, reason: collision with root package name */
    final int f108370c;

    /* renamed from: d, reason: collision with root package name */
    final Callable<U> f108371d;

    /* renamed from: zc.l$a */
    static final class a<T, U extends Collection<? super T>> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super U> f108372a;

        /* renamed from: b, reason: collision with root package name */
        final int f108373b;

        /* renamed from: c, reason: collision with root package name */
        final Callable<U> f108374c;

        /* renamed from: d, reason: collision with root package name */
        U f108375d;

        /* renamed from: e, reason: collision with root package name */
        int f108376e;

        /* renamed from: f, reason: collision with root package name */
        InterfaceC8487b f108377f;

        a(io.reactivex.w<? super U> wVar, int i11, Callable<U> callable) {
            this.f108372a = wVar;
            this.f108373b = i11;
            this.f108374c = callable;
        }

        final boolean a() {
            try {
                U call = this.f108374c.call();
                C9656b.c(call, "Empty buffer supplied");
                this.f108375d = call;
                return true;
            } catch (Throwable th2) {
                C2645f.c(th2);
                this.f108375d = null;
                InterfaceC8487b interfaceC8487b = this.f108377f;
                io.reactivex.w<? super U> wVar = this.f108372a;
                if (interfaceC8487b == null) {
                    rc.e.d(th2, wVar);
                    return false;
                }
                interfaceC8487b.dispose();
                wVar.onError(th2);
                return false;
            }
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108377f.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108377f.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            U u11 = this.f108375d;
            if (u11 != null) {
                this.f108375d = null;
                boolean isEmpty = u11.isEmpty();
                io.reactivex.w<? super U> wVar = this.f108372a;
                if (!isEmpty) {
                    wVar.onNext(u11);
                }
                wVar.onComplete();
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f108375d = null;
            this.f108372a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            U u11 = this.f108375d;
            if (u11 != null) {
                u11.add(t2);
                int i11 = this.f108376e + 1;
                this.f108376e = i11;
                if (i11 >= this.f108373b) {
                    this.f108372a.onNext(u11);
                    this.f108376e = 0;
                    a();
                }
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108377f, interfaceC8487b)) {
                this.f108377f = interfaceC8487b;
                this.f108372a.onSubscribe(this);
            }
        }
    }

    /* renamed from: zc.l$b */
    static final class b<T, U extends Collection<? super T>> extends AtomicBoolean implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super U> f108378a;

        /* renamed from: b, reason: collision with root package name */
        final int f108379b;

        /* renamed from: c, reason: collision with root package name */
        final int f108380c;

        /* renamed from: d, reason: collision with root package name */
        final Callable<U> f108381d;

        /* renamed from: e, reason: collision with root package name */
        InterfaceC8487b f108382e;

        /* renamed from: f, reason: collision with root package name */
        final ArrayDeque<U> f108383f = new ArrayDeque<>();

        /* renamed from: g, reason: collision with root package name */
        long f108384g;

        b(io.reactivex.w<? super U> wVar, int i11, int i12, Callable<U> callable) {
            this.f108378a = wVar;
            this.f108379b = i11;
            this.f108380c = i12;
            this.f108381d = callable;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108382e.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108382e.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            while (true) {
                ArrayDeque<U> arrayDeque = this.f108383f;
                boolean isEmpty = arrayDeque.isEmpty();
                io.reactivex.w<? super U> wVar = this.f108378a;
                if (isEmpty) {
                    wVar.onComplete();
                    return;
                }
                wVar.onNext(arrayDeque.poll());
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f108383f.clear();
            this.f108378a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            long j11 = this.f108384g;
            this.f108384g = 1 + j11;
            long j12 = j11 % this.f108380c;
            ArrayDeque<U> arrayDeque = this.f108383f;
            io.reactivex.w<? super U> wVar = this.f108378a;
            if (j12 == 0) {
                try {
                    U call = this.f108381d.call();
                    C9656b.c(call, "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
                    arrayDeque.offer(call);
                } catch (Throwable th2) {
                    arrayDeque.clear();
                    this.f108382e.dispose();
                    wVar.onError(th2);
                    return;
                }
            }
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) it.next();
                collection.add(t2);
                if (this.f108379b <= collection.size()) {
                    it.remove();
                    wVar.onNext(collection);
                }
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108382e, interfaceC8487b)) {
                this.f108382e = interfaceC8487b;
                this.f108378a.onSubscribe(this);
            }
        }
    }

    public C11052l(io.reactivex.p pVar, int i11, int i12, Callable callable) {
        super(pVar);
        this.f108369b = i11;
        this.f108370c = i12;
        this.f108371d = callable;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super U> wVar) {
        io.reactivex.u<T> uVar = this.f108122a;
        Callable<U> callable = this.f108371d;
        int i11 = this.f108370c;
        int i12 = this.f108369b;
        if (i11 != i12) {
            uVar.subscribe(new b(wVar, i12, i11, callable));
            return;
        }
        a aVar = new a(wVar, i12, callable);
        if (aVar.a()) {
            uVar.subscribe(aVar);
        }
    }
}
