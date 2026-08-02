package zc;

import Kc.C3493a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: zc.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11031e<T> implements Iterable<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.p f108211a;

    /* renamed from: zc.e$a */
    static final class a<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        private final b<T> f108212a;

        /* renamed from: b, reason: collision with root package name */
        private final io.reactivex.p f108213b;

        /* renamed from: c, reason: collision with root package name */
        private T f108214c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f108215d = true;

        /* renamed from: e, reason: collision with root package name */
        private boolean f108216e = true;

        /* renamed from: f, reason: collision with root package name */
        private Throwable f108217f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f108218g;

        a(io.reactivex.p pVar, b bVar) {
            this.f108213b = pVar;
            this.f108212a = bVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Throwable th2 = this.f108217f;
            if (th2 != null) {
                throw Gc.i.d(th2);
            }
            if (this.f108215d) {
                if (!this.f108216e) {
                    return true;
                }
                boolean z11 = this.f108218g;
                b<T> bVar = this.f108212a;
                if (!z11) {
                    this.f108218g = true;
                    bVar.f108220c.set(1);
                    new C11083y0((io.reactivex.u) this.f108213b).subscribe(bVar);
                }
                try {
                    io.reactivex.o<T> a11 = bVar.a();
                    if (a11.h()) {
                        this.f108216e = false;
                        this.f108214c = a11.e();
                        return true;
                    }
                    this.f108215d = false;
                    if (!a11.f()) {
                        Throwable d11 = a11.d();
                        this.f108217f = d11;
                        throw Gc.i.d(d11);
                    }
                } catch (InterruptedException e11) {
                    bVar.dispose();
                    this.f108217f = e11;
                    throw Gc.i.d(e11);
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public final T next() {
            Throwable th2 = this.f108217f;
            if (th2 != null) {
                throw Gc.i.d(th2);
            }
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            this.f108216e = true;
            return this.f108214c;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    /* renamed from: zc.e$b */
    static final class b<T> extends Ic.c<io.reactivex.o<T>> {

        /* renamed from: b, reason: collision with root package name */
        private final ArrayBlockingQueue f108219b = new ArrayBlockingQueue(1);

        /* renamed from: c, reason: collision with root package name */
        final AtomicInteger f108220c = new AtomicInteger();

        b() {
        }

        public final io.reactivex.o<T> a() throws InterruptedException {
            this.f108220c.set(1);
            return (io.reactivex.o) this.f108219b.take();
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
            io.reactivex.o oVar = (io.reactivex.o) obj;
            if (this.f108220c.getAndSet(0) != 1 && oVar.h()) {
                return;
            }
            while (true) {
                ArrayBlockingQueue arrayBlockingQueue = this.f108219b;
                if (arrayBlockingQueue.offer(oVar)) {
                    return;
                }
                io.reactivex.o oVar2 = (io.reactivex.o) arrayBlockingQueue.poll();
                if (oVar2 != null && !oVar2.h()) {
                    oVar = oVar2;
                }
            }
        }
    }

    public C11031e(io.reactivex.p pVar) {
        this.f108211a = pVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        return new a(this.f108211a, new b());
    }
}
