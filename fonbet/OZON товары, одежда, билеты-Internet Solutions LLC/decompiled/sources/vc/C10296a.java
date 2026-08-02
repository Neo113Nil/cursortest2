package vc;

import io.reactivex.AbstractC7094b;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* renamed from: vc.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C10296a extends AbstractC7094b {

    /* renamed from: a, reason: collision with root package name */
    final AbstractC7094b f102752a;

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.f f102753b;

    /* renamed from: vc.a$a, reason: collision with other inner class name */
    static final class C2229a implements io.reactivex.d {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReference<InterfaceC8487b> f102754a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.d f102755b;

        public C2229a(AtomicReference<InterfaceC8487b> atomicReference, io.reactivex.d dVar) {
            this.f102754a = atomicReference;
            this.f102755b = dVar;
        }

        @Override // io.reactivex.d
        public final void onComplete() {
            this.f102755b.onComplete();
        }

        @Override // io.reactivex.d
        public final void onError(Throwable th2) {
            this.f102755b.onError(th2);
        }

        @Override // io.reactivex.d
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.d(this.f102754a, interfaceC8487b);
        }
    }

    /* renamed from: vc.a$b */
    static final class b extends AtomicReference<InterfaceC8487b> implements io.reactivex.d, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.d f102756a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.f f102757b;

        b(io.reactivex.d dVar, io.reactivex.f fVar) {
            this.f102756a = dVar;
            this.f102757b = fVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(get());
        }

        @Override // io.reactivex.d
        public final void onComplete() {
            this.f102757b.a(new C2229a(this, this.f102756a));
        }

        @Override // io.reactivex.d
        public final void onError(Throwable th2) {
            this.f102756a.onError(th2);
        }

        @Override // io.reactivex.d
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.f(this, interfaceC8487b)) {
                this.f102756a.onSubscribe(this);
            }
        }
    }

    public C10296a(AbstractC7094b abstractC7094b, io.reactivex.f fVar) {
        this.f102752a = abstractC7094b;
        this.f102753b = fVar;
    }

    @Override // io.reactivex.AbstractC7094b
    protected final void j(io.reactivex.d dVar) {
        this.f102752a.a(new b(dVar, this.f102753b));
    }
}
