package wc;

import Bl0.C2645f;
import Kc.C3493a;
import hg.InterfaceC6950c;
import ru.ozon.app.android.network.websockets.OzonWebSocketImpl;

/* loaded from: classes9.dex */
public final class T<T> extends AbstractC10480a<T, T> {

    /* renamed from: d, reason: collision with root package name */
    final DJ.c f103897d;

    static final class a<T> implements io.reactivex.j<T>, InterfaceC6950c {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.j f103898a;

        /* renamed from: b, reason: collision with root package name */
        final DJ.c f103899b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC6950c f103900c;

        /* renamed from: d, reason: collision with root package name */
        boolean f103901d;

        a(io.reactivex.j jVar, DJ.c cVar) {
            this.f103898a = jVar;
            this.f103899b = cVar;
        }

        @Override // hg.InterfaceC6950c
        public final void cancel() {
            this.f103900c.cancel();
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            if (Fc.g.g(this.f103900c, interfaceC6950c)) {
                this.f103900c = interfaceC6950c;
                this.f103898a.d(this);
            }
        }

        @Override // hg.InterfaceC6950c
        public final void n(long j11) {
            this.f103900c.n(j11);
        }

        @Override // hg.InterfaceC6949b
        public final void onComplete() {
            if (this.f103901d) {
                return;
            }
            this.f103901d = true;
            this.f103898a.onComplete();
        }

        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            if (this.f103901d) {
                C3493a.f(th2);
            } else {
                this.f103901d = true;
                this.f103898a.onError(th2);
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            boolean socketFlowable$lambda$4;
            if (this.f103901d) {
                return;
            }
            io.reactivex.j jVar = this.f103898a;
            jVar.onNext(t2);
            try {
                socketFlowable$lambda$4 = OzonWebSocketImpl.getSocketFlowable$lambda$4(this.f103899b.f6234b, t2);
                if (socketFlowable$lambda$4) {
                    this.f103901d = true;
                    this.f103900c.cancel();
                    jVar.onComplete();
                }
            } catch (Throwable th2) {
                C2645f.c(th2);
                this.f103900c.cancel();
                onError(th2);
            }
        }
    }

    public T(N n11, DJ.c cVar) {
        super(n11);
        this.f103897d = cVar;
    }

    @Override // io.reactivex.h
    protected final void j(io.reactivex.j jVar) {
        this.f103914c.i(new a(jVar, this.f103897d));
    }
}
