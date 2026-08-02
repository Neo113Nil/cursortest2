package wc;

import hg.InterfaceC6950c;
import nc.InterfaceC8487b;

/* renamed from: wc.u, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C10499u<T> extends io.reactivex.h<T> {

    /* renamed from: c, reason: collision with root package name */
    private final io.reactivex.p<T> f104066c;

    /* renamed from: wc.u$a */
    static final class a<T> implements io.reactivex.w<T>, InterfaceC6950c {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.j f104067a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC8487b f104068b;

        a(io.reactivex.j jVar) {
            this.f104067a = jVar;
        }

        @Override // hg.InterfaceC6950c
        public final void cancel() {
            this.f104068b.dispose();
        }

        @Override // hg.InterfaceC6950c
        public final void n(long j11) {
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f104067a.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f104067a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f104067a.onNext(t2);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            this.f104068b = interfaceC8487b;
            this.f104067a.d(this);
        }
    }

    public C10499u(io.reactivex.p<T> pVar) {
        this.f104066c = pVar;
    }

    @Override // io.reactivex.h
    protected final void j(io.reactivex.j jVar) {
        this.f104066c.subscribe(new a(jVar));
    }
}
