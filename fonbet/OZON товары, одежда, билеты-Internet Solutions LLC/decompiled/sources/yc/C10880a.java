package yc;

import io.reactivex.AbstractC7094b;
import io.reactivex.p;
import io.reactivex.w;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* renamed from: yc.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C10880a<R> extends p<R> {

    /* renamed from: a, reason: collision with root package name */
    final AbstractC7094b f106458a;

    /* renamed from: b, reason: collision with root package name */
    final p f106459b;

    /* renamed from: yc.a$a, reason: collision with other inner class name */
    static final class C2297a<R> extends AtomicReference<InterfaceC8487b> implements w<R>, io.reactivex.d, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final w<? super R> f106460a;

        /* renamed from: b, reason: collision with root package name */
        p f106461b;

        C2297a(p pVar, w wVar) {
            this.f106461b = pVar;
            this.f106460a = wVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(get());
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            p pVar = this.f106461b;
            if (pVar == null) {
                this.f106460a.onComplete();
            } else {
                this.f106461b = null;
                pVar.subscribe(this);
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f106460a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(R r11) {
            this.f106460a.onNext(r11);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.d(this, interfaceC8487b);
        }
    }

    public C10880a(AbstractC7094b abstractC7094b, p pVar) {
        this.f106458a = abstractC7094b;
        this.f106459b = pVar;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(w<? super R> wVar) {
        C2297a c2297a = new C2297a(this.f106459b, wVar);
        wVar.onSubscribe(c2297a);
        this.f106458a.a(c2297a);
    }
}
