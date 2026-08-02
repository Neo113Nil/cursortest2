package zc;

import Ic.AbstractC3233b;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: zc.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11028d<T> implements Iterable<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.p f108187a;

    /* renamed from: b, reason: collision with root package name */
    final T f108188b;

    /* renamed from: zc.d$a */
    static final class a<T> extends AbstractC3233b<T> {

        /* renamed from: b, reason: collision with root package name */
        volatile Object f108189b;

        /* renamed from: zc.d$a$a, reason: collision with other inner class name */
        final class C2340a implements Iterator<T> {

            /* renamed from: a, reason: collision with root package name */
            private Object f108190a;

            C2340a() {
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                this.f108190a = a.this.f108189b;
                return !Gc.k.h(r0);
            }

            @Override // java.util.Iterator
            public final T next() {
                try {
                    if (this.f108190a == null) {
                        this.f108190a = a.this.f108189b;
                    }
                    if (Gc.k.h(this.f108190a)) {
                        throw new NoSuchElementException();
                    }
                    if (Gc.k.i(this.f108190a)) {
                        throw Gc.i.d(Gc.k.g(this.f108190a));
                    }
                    T t2 = (T) this.f108190a;
                    this.f108190a = null;
                    return t2;
                } catch (Throwable th2) {
                    this.f108190a = null;
                    throw th2;
                }
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f108189b = Gc.k.COMPLETE;
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f108189b = Gc.k.f(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f108189b = t2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11028d(io.reactivex.p pVar, Object obj) {
        this.f108187a = pVar;
        this.f108188b = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        T t2 = this.f108188b;
        a aVar = new a();
        aVar.f108189b = t2;
        this.f108187a.subscribe(aVar);
        return new a.C2340a();
    }
}
