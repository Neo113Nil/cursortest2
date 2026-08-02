package zc;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import nc.InterfaceC8487b;

/* renamed from: zc.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11022b<T> implements Iterable<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.p f108141a;

    /* renamed from: b, reason: collision with root package name */
    final int f108142b;

    /* renamed from: zc.b$a */
    static final class a<T> extends AtomicReference<InterfaceC8487b> implements io.reactivex.w<T>, Iterator<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final Cc.c<T> f108143a;

        /* renamed from: b, reason: collision with root package name */
        final ReentrantLock f108144b;

        /* renamed from: c, reason: collision with root package name */
        final Condition f108145c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f108146d;

        /* renamed from: e, reason: collision with root package name */
        Throwable f108147e;

        a(int i11) {
            this.f108143a = new Cc.c<>(i11);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f108144b = reentrantLock;
            this.f108145c = reentrantLock.newCondition();
        }

        final void a() {
            ReentrantLock reentrantLock = this.f108144b;
            reentrantLock.lock();
            try {
                this.f108145c.signalAll();
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            while (true) {
                boolean z11 = this.f108146d;
                boolean isEmpty = this.f108143a.isEmpty();
                if (z11) {
                    Throwable th2 = this.f108147e;
                    if (th2 != null) {
                        throw Gc.i.d(th2);
                    }
                    if (isEmpty) {
                        return false;
                    }
                }
                if (!isEmpty) {
                    return true;
                }
                try {
                    this.f108144b.lock();
                    while (!this.f108146d && this.f108143a.isEmpty()) {
                        try {
                            this.f108145c.await();
                        } finally {
                        }
                    }
                    this.f108144b.unlock();
                } catch (InterruptedException e11) {
                    rc.d.a(this);
                    a();
                    throw Gc.i.d(e11);
                }
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(get());
        }

        @Override // java.util.Iterator
        public final T next() {
            if (hasNext()) {
                return this.f108143a.poll();
            }
            throw new NoSuchElementException();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f108146d = true;
            a();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f108147e = th2;
            this.f108146d = true;
            a();
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f108143a.offer(t2);
            a();
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.f(this, interfaceC8487b);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException(ProductAction.ACTION_REMOVE);
        }
    }

    public C11022b(io.reactivex.p pVar, int i11) {
        this.f108141a = pVar;
        this.f108142b = i11;
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        a aVar = new a(this.f108142b);
        this.f108141a.subscribe(aVar);
        return aVar;
    }
}
