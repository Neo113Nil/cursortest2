package vc;

import Bl0.C2645f;
import Kc.C3493a;
import T7.Z;
import io.reactivex.AbstractC7094b;
import io.reactivex.InterfaceC7095c;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import rc.C9243b;

/* renamed from: vc.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C10298c extends AbstractC7094b {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.e f102766a;

    /* renamed from: vc.c$a */
    static final class a extends AtomicReference<InterfaceC8487b> implements InterfaceC7095c, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.d f102767a;

        a(io.reactivex.d dVar) {
            this.f102767a = dVar;
        }

        @Override // io.reactivex.InterfaceC7095c
        public final void a(qc.f fVar) {
            rc.d.e(this, new C9243b(fVar));
        }

        @Override // io.reactivex.InterfaceC7095c
        public final boolean b(Throwable th2) {
            InterfaceC8487b andSet;
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            InterfaceC8487b interfaceC8487b = get();
            rc.d dVar = rc.d.DISPOSED;
            if (interfaceC8487b == dVar || (andSet = getAndSet(dVar)) == dVar) {
                return false;
            }
            try {
                this.f102767a.onError(th2);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(get());
        }

        @Override // io.reactivex.InterfaceC7095c
        public final void onComplete() {
            InterfaceC8487b andSet;
            InterfaceC8487b interfaceC8487b = get();
            rc.d dVar = rc.d.DISPOSED;
            if (interfaceC8487b == dVar || (andSet = getAndSet(dVar)) == dVar) {
                return;
            }
            try {
                this.f102767a.onComplete();
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.InterfaceC7095c
        public final void onError(Throwable th2) {
            if (b(th2)) {
                return;
            }
            C3493a.f(th2);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return Z.a(a.class.getSimpleName(), "{", super.toString(), "}");
        }
    }

    public C10298c(io.reactivex.e eVar) {
        this.f102766a = eVar;
    }

    @Override // io.reactivex.AbstractC7094b
    protected final void j(io.reactivex.d dVar) {
        a aVar = new a(dVar);
        dVar.onSubscribe(aVar);
        try {
            this.f102766a.a(aVar);
        } catch (Throwable th2) {
            C2645f.c(th2);
            aVar.onError(th2);
        }
    }
}
