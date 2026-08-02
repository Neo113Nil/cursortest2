package vc;

import Bl0.C2645f;
import Kc.C3493a;
import io.reactivex.AbstractC7094b;
import java.util.concurrent.atomic.AtomicInteger;
import nc.InterfaceC8487b;
import qc.InterfaceC9019a;

/* renamed from: vc.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10299d extends AbstractC7094b {

    /* renamed from: a, reason: collision with root package name */
    final AbstractC7094b f102768a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC9019a f102769b;

    /* renamed from: vc.d$a */
    static final class a extends AtomicInteger implements io.reactivex.d, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.d f102770a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC9019a f102771b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f102772c;

        a(io.reactivex.d dVar, InterfaceC9019a interfaceC9019a) {
            this.f102770a = dVar;
            this.f102771b = interfaceC9019a;
        }

        final void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f102771b.run();
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    C3493a.f(th2);
                }
            }
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f102772c.dispose();
            a();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f102772c.isDisposed();
        }

        @Override // io.reactivex.d
        public final void onComplete() {
            this.f102770a.onComplete();
            a();
        }

        @Override // io.reactivex.d
        public final void onError(Throwable th2) {
            this.f102770a.onError(th2);
            a();
        }

        @Override // io.reactivex.d
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f102772c, interfaceC8487b)) {
                this.f102772c = interfaceC8487b;
                this.f102770a.onSubscribe(this);
            }
        }
    }

    public C10299d(AbstractC7094b abstractC7094b, InterfaceC9019a interfaceC9019a) {
        this.f102768a = abstractC7094b;
        this.f102769b = interfaceC9019a;
    }

    @Override // io.reactivex.AbstractC7094b
    protected final void j(io.reactivex.d dVar) {
        this.f102768a.a(new a(dVar, this.f102769b));
    }
}
