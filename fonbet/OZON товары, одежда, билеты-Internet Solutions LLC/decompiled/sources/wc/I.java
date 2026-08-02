package wc;

import Bl0.C2645f;
import hg.InterfaceC6948a;
import hg.InterfaceC6950c;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import ru.ozon.app.android.network.websockets.OzonWebSocketImpl;
import sc.C9656b;

/* loaded from: classes9.dex */
public final class I<T> extends AbstractC10480a<T, T> {

    /* renamed from: d, reason: collision with root package name */
    final AJ.c f103801d;

    static final class a<T> extends c<T, Object> {
        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            ((b) this.f103808k).cancel();
            this.f103806i.onError(th2);
        }
    }

    static final class b<T, U> extends AtomicInteger implements io.reactivex.j<Object>, InterfaceC6950c {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC6948a<T> f103802a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference<InterfaceC6950c> f103803b = new AtomicReference<>();

        /* renamed from: c, reason: collision with root package name */
        final AtomicLong f103804c = new AtomicLong();

        /* renamed from: d, reason: collision with root package name */
        a f103805d;

        b(InterfaceC6948a<T> interfaceC6948a) {
            this.f103802a = interfaceC6948a;
        }

        @Override // hg.InterfaceC6950c
        public final void cancel() {
            Fc.g.a(this.f103803b);
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            Fc.g.d(this.f103803b, this.f103804c, interfaceC6950c);
        }

        @Override // hg.InterfaceC6950c
        public final void n(long j11) {
            Fc.g.b(this.f103803b, this.f103804c, j11);
        }

        @Override // hg.InterfaceC6949b
        public final void onComplete() {
            this.f103805d.cancel();
            this.f103805d.f103806i.onComplete();
        }

        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            this.f103805d.cancel();
            this.f103805d.f103806i.onError(th2);
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(Object obj) {
            if (getAndIncrement() == 0) {
                while (this.f103803b.get() != Fc.g.CANCELLED) {
                    this.f103802a.a(this.f103805d);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }

    static abstract class c<T, U> extends Fc.f implements io.reactivex.j<T> {

        /* renamed from: i, reason: collision with root package name */
        protected final Oc.a f103806i;

        /* renamed from: j, reason: collision with root package name */
        protected final Lc.c<U> f103807j;

        /* renamed from: k, reason: collision with root package name */
        protected final InterfaceC6950c f103808k;

        /* renamed from: l, reason: collision with root package name */
        private long f103809l;

        c(Oc.a aVar, Lc.c cVar, InterfaceC6950c interfaceC6950c) {
            super(false);
            this.f103806i = aVar;
            this.f103807j = cVar;
            this.f103808k = interfaceC6950c;
        }

        @Override // Fc.f, hg.InterfaceC6950c
        public final void cancel() {
            super.cancel();
            this.f103808k.cancel();
        }

        @Override // hg.InterfaceC6949b
        public void onComplete() {
            h(Fc.d.INSTANCE);
            long j11 = this.f103809l;
            if (j11 != 0) {
                this.f103809l = 0L;
                f(j11);
            }
            ((b) this.f103808k).n(1L);
            this.f103807j.onNext(0);
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            this.f103809l++;
            this.f103806i.onNext(t2);
        }
    }

    public I(T t2, AJ.c cVar) {
        super(t2);
        this.f103801d = cVar;
    }

    @Override // io.reactivex.h
    public final void j(io.reactivex.j jVar) {
        InterfaceC6948a socketFlowable$lambda$5;
        Oc.a aVar = new Oc.a(jVar);
        Lc.c<T> l11 = Lc.e.n().l();
        try {
            socketFlowable$lambda$5 = OzonWebSocketImpl.getSocketFlowable$lambda$5(this.f103801d.f637b, l11);
            C9656b.c(socketFlowable$lambda$5, "handler returned a null Publisher");
            b bVar = new b(this.f103914c);
            a aVar2 = new a(aVar, l11, bVar);
            bVar.f103805d = aVar2;
            jVar.d(aVar2);
            socketFlowable$lambda$5.a(bVar);
            bVar.onNext(0);
        } catch (Throwable th2) {
            C2645f.c(th2);
            Fc.d.d(th2, jVar);
        }
    }
}
