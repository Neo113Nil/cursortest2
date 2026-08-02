package zc;

import Kc.C3493a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zc.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11025c<T> implements Iterable<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.p f108159a;

    /* renamed from: zc.c$a */
    static final class a<T> extends Ic.c<io.reactivex.o<T>> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.o<T> f108160b;

        /* renamed from: c, reason: collision with root package name */
        final Semaphore f108161c = new Semaphore(0);

        /* renamed from: d, reason: collision with root package name */
        final AtomicReference<io.reactivex.o<T>> f108162d = new AtomicReference<>();

        a() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            io.reactivex.o<T> oVar = this.f108160b;
            if (oVar != null && oVar.g()) {
                throw Gc.i.d(this.f108160b.d());
            }
            if (this.f108160b == null) {
                try {
                    this.f108161c.acquire();
                    io.reactivex.o<T> andSet = this.f108162d.getAndSet(null);
                    this.f108160b = andSet;
                    if (andSet.g()) {
                        throw Gc.i.d(andSet.d());
                    }
                } catch (InterruptedException e11) {
                    dispose();
                    this.f108160b = io.reactivex.o.b(e11);
                    throw Gc.i.d(e11);
                }
            }
            return this.f108160b.h();
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T e11 = this.f108160b.e();
            this.f108160b = null;
            return e11;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            C3493a.f(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(Object obj) {
            if (this.f108162d.getAndSet((io.reactivex.o) obj) == null) {
                this.f108161c.release();
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }
    }

    public C11025c(io.reactivex.p pVar) {
        this.f108159a = pVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        a aVar = new a();
        io.reactivex.p.wrap(this.f108159a).materialize().subscribe(aVar);
        return aVar;
    }
}
