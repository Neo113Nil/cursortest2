package zc;

import Bl0.C2645f;
import java.util.Iterator;
import sc.C9656b;
import uc.AbstractC10019c;

/* renamed from: zc.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11035f0<T> extends io.reactivex.p<T> {

    /* renamed from: a, reason: collision with root package name */
    final Iterable<? extends T> f108229a;

    /* renamed from: zc.f0$a */
    static final class a<T> extends AbstractC10019c<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f108230a;

        /* renamed from: b, reason: collision with root package name */
        final Iterator<? extends T> f108231b;

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f108232c;

        /* renamed from: d, reason: collision with root package name */
        boolean f108233d;

        /* renamed from: e, reason: collision with root package name */
        boolean f108234e;

        /* renamed from: f, reason: collision with root package name */
        boolean f108235f;

        a(io.reactivex.w<? super T> wVar, Iterator<? extends T> it) {
            this.f108230a = wVar;
            this.f108231b = it;
        }

        @Override // tc.InterfaceC9804f
        public final int a(int i11) {
            this.f108233d = true;
            return 1;
        }

        @Override // tc.InterfaceC9808j
        public final void clear() {
            this.f108234e = true;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108232c = true;
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108232c;
        }

        @Override // tc.InterfaceC9808j
        public final boolean isEmpty() {
            return this.f108234e;
        }

        @Override // tc.InterfaceC9808j
        public final T poll() {
            if (this.f108234e) {
                return null;
            }
            boolean z11 = this.f108235f;
            Iterator<? extends T> it = this.f108231b;
            if (!z11) {
                this.f108235f = true;
            } else if (!it.hasNext()) {
                this.f108234e = true;
                return null;
            }
            T next = it.next();
            C9656b.c(next, "The iterator returned a null value");
            return next;
        }
    }

    public C11035f0(Iterable<? extends T> iterable) {
        this.f108229a = iterable;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        try {
            Iterator<? extends T> it = this.f108229a.iterator();
            try {
                if (!it.hasNext()) {
                    rc.e.b(wVar);
                    return;
                }
                a aVar = new a(wVar, it);
                wVar.onSubscribe(aVar);
                if (aVar.f108233d) {
                    return;
                }
                while (!aVar.f108232c) {
                    try {
                        T next = aVar.f108231b.next();
                        C9656b.c(next, "The iterator returned a null value");
                        aVar.f108230a.onNext(next);
                        if (aVar.f108232c) {
                            return;
                        }
                        try {
                            if (!aVar.f108231b.hasNext()) {
                                if (aVar.f108232c) {
                                    return;
                                }
                                aVar.f108230a.onComplete();
                                return;
                            }
                        } catch (Throwable th2) {
                            C2645f.c(th2);
                            aVar.f108230a.onError(th2);
                            return;
                        }
                    } catch (Throwable th3) {
                        C2645f.c(th3);
                        aVar.f108230a.onError(th3);
                        return;
                    }
                }
            } catch (Throwable th4) {
                C2645f.c(th4);
                rc.e.d(th4, wVar);
            }
        } catch (Throwable th5) {
            C2645f.c(th5);
            rc.e.d(th5, wVar);
        }
    }
}
