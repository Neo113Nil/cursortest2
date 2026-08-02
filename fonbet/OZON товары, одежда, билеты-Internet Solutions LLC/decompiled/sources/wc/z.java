package wc;

import Bl0.C2645f;
import hg.InterfaceC6949b;
import hg.InterfaceC6950c;
import java.util.concurrent.atomic.AtomicLong;
import qc.InterfaceC9019a;
import sc.C9653a;
import tc.InterfaceC9807i;

/* loaded from: classes9.dex */
public final class z<T> extends AbstractC10480a<T, T> {

    /* renamed from: d, reason: collision with root package name */
    final int f104090d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f104091e;

    /* renamed from: f, reason: collision with root package name */
    final InterfaceC9019a f104092f;

    static final class a<T> extends Fc.a<T> implements io.reactivex.j<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.j f104093a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC9807i<T> f104094b;

        /* renamed from: c, reason: collision with root package name */
        final InterfaceC9019a f104095c;

        /* renamed from: d, reason: collision with root package name */
        InterfaceC6950c f104096d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f104097e;

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f104098f;

        /* renamed from: g, reason: collision with root package name */
        Throwable f104099g;

        /* renamed from: h, reason: collision with root package name */
        final AtomicLong f104100h = new AtomicLong();

        /* renamed from: i, reason: collision with root package name */
        boolean f104101i;

        a(io.reactivex.j jVar, int i11, boolean z11, InterfaceC9019a interfaceC9019a) {
            this.f104093a = jVar;
            this.f104095c = interfaceC9019a;
            this.f104094b = z11 ? new Cc.c<>(i11) : new Cc.b<>(i11);
        }

        @Override // tc.InterfaceC9804f
        public final int a(int i11) {
            this.f104101i = true;
            return 2;
        }

        final boolean b(boolean z11, boolean z12, InterfaceC6949b<? super T> interfaceC6949b) {
            if (this.f104097e) {
                this.f104094b.clear();
                return true;
            }
            if (!z11) {
                return false;
            }
            Throwable th2 = this.f104099g;
            if (th2 != null) {
                this.f104094b.clear();
                interfaceC6949b.onError(th2);
                return true;
            }
            if (!z12) {
                return false;
            }
            interfaceC6949b.onComplete();
            return true;
        }

        @Override // hg.InterfaceC6950c
        public final void cancel() {
            if (this.f104097e) {
                return;
            }
            this.f104097e = true;
            this.f104096d.cancel();
            if (getAndIncrement() == 0) {
                this.f104094b.clear();
            }
        }

        @Override // tc.InterfaceC9808j
        public final void clear() {
            this.f104094b.clear();
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            if (Fc.g.g(this.f104096d, interfaceC6950c)) {
                this.f104096d = interfaceC6950c;
                this.f104093a.d(this);
                interfaceC6950c.n(Long.MAX_VALUE);
            }
        }

        final void e() {
            if (getAndIncrement() == 0) {
                InterfaceC9807i<T> interfaceC9807i = this.f104094b;
                io.reactivex.j jVar = this.f104093a;
                int i11 = 1;
                while (!b(this.f104098f, interfaceC9807i.isEmpty(), jVar)) {
                    long j11 = this.f104100h.get();
                    long j12 = 0;
                    while (j12 != j11) {
                        boolean z11 = this.f104098f;
                        T poll = interfaceC9807i.poll();
                        boolean z12 = poll == null;
                        if (b(z11, z12, jVar)) {
                            return;
                        }
                        if (z12) {
                            break;
                        }
                        jVar.onNext(poll);
                        j12++;
                    }
                    if (j12 == j11 && b(this.f104098f, interfaceC9807i.isEmpty(), jVar)) {
                        return;
                    }
                    if (j12 != 0 && j11 != Long.MAX_VALUE) {
                        this.f104100h.addAndGet(-j12);
                    }
                    i11 = addAndGet(-i11);
                    if (i11 == 0) {
                        return;
                    }
                }
            }
        }

        @Override // tc.InterfaceC9808j
        public final boolean isEmpty() {
            return this.f104094b.isEmpty();
        }

        @Override // hg.InterfaceC6950c
        public final void n(long j11) {
            if (this.f104101i || !Fc.g.f(j11)) {
                return;
            }
            Gc.d.a(this.f104100h, j11);
            e();
        }

        @Override // hg.InterfaceC6949b
        public final void onComplete() {
            this.f104098f = true;
            if (this.f104101i) {
                this.f104093a.onComplete();
            } else {
                e();
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            this.f104099g = th2;
            this.f104098f = true;
            if (this.f104101i) {
                this.f104093a.onError(th2);
            } else {
                e();
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            if (this.f104094b.offer(t2)) {
                if (this.f104101i) {
                    this.f104093a.onNext(null);
                    return;
                } else {
                    e();
                    return;
                }
            }
            this.f104096d.cancel();
            oc.b bVar = new oc.b("Buffer is full");
            try {
                this.f104095c.getClass();
            } catch (Throwable th2) {
                C2645f.c(th2);
                bVar.initCause(th2);
            }
            onError(bVar);
        }

        @Override // tc.InterfaceC9808j
        public final T poll() throws Exception {
            return this.f104094b.poll();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C10499u c10499u, int i11) {
        super(c10499u);
        InterfaceC9019a interfaceC9019a = C9653a.f98523c;
        this.f104090d = i11;
        this.f104091e = true;
        this.f104092f = interfaceC9019a;
    }

    @Override // io.reactivex.h
    protected final void j(io.reactivex.j jVar) {
        this.f103914c.i(new a(jVar, this.f104090d, this.f104091e, this.f104092f));
    }
}
