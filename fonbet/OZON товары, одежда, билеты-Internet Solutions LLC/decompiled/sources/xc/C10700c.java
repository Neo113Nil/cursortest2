package xc;

import Bl0.C2645f;
import Kc.C3493a;
import T7.Z;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import rc.C9243b;
import ru.ozon.app.android.composer.network.prefetch.ComposerPrefetchServiceImpl;

/* renamed from: xc.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10700c<T> extends io.reactivex.k<T> {

    /* renamed from: a, reason: collision with root package name */
    final Kr.c f105269a;

    /* renamed from: xc.c$a */
    static final class a<T> extends AtomicReference<InterfaceC8487b> implements io.reactivex.l<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.m<? super T> f105270a;

        a(io.reactivex.m<? super T> mVar) {
            this.f105270a = mVar;
        }

        @Override // io.reactivex.l
        public final void a(qc.f fVar) {
            rc.d.e(this, new C9243b(fVar));
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this);
        }

        @Override // io.reactivex.l, nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(get());
        }

        @Override // io.reactivex.l
        public final void onError(Throwable th2) {
            InterfaceC8487b andSet;
            Throwable nullPointerException = th2 == null ? new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.") : th2;
            InterfaceC8487b interfaceC8487b = get();
            rc.d dVar = rc.d.DISPOSED;
            if (interfaceC8487b == dVar || (andSet = getAndSet(dVar)) == dVar) {
                C3493a.f(th2);
                return;
            }
            try {
                this.f105270a.onError(nullPointerException);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.l
        public final void onSuccess(T t2) {
            InterfaceC8487b andSet;
            InterfaceC8487b interfaceC8487b = get();
            rc.d dVar = rc.d.DISPOSED;
            if (interfaceC8487b == dVar || (andSet = getAndSet(dVar)) == dVar) {
                return;
            }
            io.reactivex.m<? super T> mVar = this.f105270a;
            try {
                if (t2 == null) {
                    mVar.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    mVar.onSuccess(t2);
                }
                if (andSet != null) {
                    andSet.dispose();
                }
            } catch (Throwable th2) {
                if (andSet != null) {
                    andSet.dispose();
                }
                throw th2;
            }
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return Z.a(a.class.getSimpleName(), "{", super.toString(), "}");
        }
    }

    public C10700c(Kr.c cVar) {
        this.f105269a = cVar;
    }

    @Override // io.reactivex.k
    protected final void d(io.reactivex.m<? super T> mVar) {
        a aVar = new a(mVar);
        mVar.onSubscribe(aVar);
        try {
            Kr.c cVar = this.f105269a;
            ComposerPrefetchServiceImpl.internalPrefetch$lambda$0(cVar.f16034a, cVar.f16035b, aVar);
        } catch (Throwable th2) {
            C2645f.c(th2);
            aVar.onError(th2);
        }
    }
}
