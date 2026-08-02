package wc;

import Bl0.C2645f;
import Kc.C3493a;
import hg.InterfaceC6948a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import sc.C9656b;

/* renamed from: wc.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C10484e<T, R> extends AbstractC10482c<T, R> {

    /* renamed from: m, reason: collision with root package name */
    final io.reactivex.j f103930m;

    /* renamed from: n, reason: collision with root package name */
    final AtomicInteger f103931n;

    C10484e(io.reactivex.j jVar, qc.o oVar, int i11) {
        super(oVar, i11);
        this.f103930m = jVar;
        this.f103931n = new AtomicInteger();
    }

    @Override // wc.InterfaceC10486g
    public final void a(Throwable th2) {
        Gc.c cVar = this.f103925j;
        cVar.getClass();
        if (!Gc.i.a(cVar, th2)) {
            C3493a.f(th2);
            return;
        }
        this.f103920e.cancel();
        if (getAndIncrement() == 0) {
            this.f103930m.onError(Gc.i.b(cVar));
        }
    }

    @Override // wc.InterfaceC10486g
    public final void b(R r11) {
        if (get() == 0 && compareAndSet(0, 1)) {
            io.reactivex.j jVar = this.f103930m;
            jVar.onNext(r11);
            if (compareAndSet(1, 0)) {
                return;
            }
            Gc.c cVar = this.f103925j;
            cVar.getClass();
            jVar.onError(Gc.i.b(cVar));
        }
    }

    @Override // hg.InterfaceC6950c
    public final void cancel() {
        if (this.f103924i) {
            return;
        }
        this.f103924i = true;
        this.f103916a.cancel();
        this.f103920e.cancel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wc.AbstractC10482c
    final void e() {
        if (this.f103931n.getAndIncrement() == 0) {
            while (!this.f103924i) {
                if (!this.f103926k) {
                    boolean z11 = this.f103923h;
                    try {
                        T poll = this.f103922g.poll();
                        boolean z12 = poll == null;
                        if (z11 && z12) {
                            this.f103930m.onComplete();
                            return;
                        }
                        if (!z12) {
                            try {
                                InterfaceC6948a<? extends R> apply = this.f103917b.apply(poll);
                                C9656b.c(apply, "The mapper returned a null Publisher");
                                InterfaceC6948a<? extends R> interfaceC6948a = apply;
                                if (this.f103927l != 1) {
                                    int i11 = this.f103921f + 1;
                                    if (i11 == this.f103919d) {
                                        this.f103921f = 0;
                                        this.f103920e.n(i11);
                                    } else {
                                        this.f103921f = i11;
                                    }
                                }
                                if (interfaceC6948a instanceof Callable) {
                                    try {
                                        Object call = ((Callable) interfaceC6948a).call();
                                        if (call == null) {
                                            continue;
                                        } else if (!this.f103916a.e()) {
                                            this.f103926k = true;
                                            C10485f<R> c10485f = this.f103916a;
                                            c10485f.h(new C10487h(call, c10485f));
                                        } else if (get() == 0 && compareAndSet(0, 1)) {
                                            this.f103930m.onNext(call);
                                            if (!compareAndSet(1, 0)) {
                                                io.reactivex.j jVar = this.f103930m;
                                                Gc.c cVar = this.f103925j;
                                                cVar.getClass();
                                                jVar.onError(Gc.i.b(cVar));
                                                return;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        C2645f.c(th2);
                                        this.f103920e.cancel();
                                        Gc.c cVar2 = this.f103925j;
                                        cVar2.getClass();
                                        Gc.i.a(cVar2, th2);
                                        io.reactivex.j jVar2 = this.f103930m;
                                        Gc.c cVar3 = this.f103925j;
                                        cVar3.getClass();
                                        jVar2.onError(Gc.i.b(cVar3));
                                        return;
                                    }
                                } else {
                                    this.f103926k = true;
                                    interfaceC6948a.a(this.f103916a);
                                }
                            } catch (Throwable th3) {
                                C2645f.c(th3);
                                this.f103920e.cancel();
                                Gc.c cVar4 = this.f103925j;
                                cVar4.getClass();
                                Gc.i.a(cVar4, th3);
                                io.reactivex.j jVar3 = this.f103930m;
                                Gc.c cVar5 = this.f103925j;
                                cVar5.getClass();
                                jVar3.onError(Gc.i.b(cVar5));
                                return;
                            }
                        }
                    } catch (Throwable th4) {
                        C2645f.c(th4);
                        this.f103920e.cancel();
                        Gc.c cVar6 = this.f103925j;
                        cVar6.getClass();
                        Gc.i.a(cVar6, th4);
                        io.reactivex.j jVar4 = this.f103930m;
                        Gc.c cVar7 = this.f103925j;
                        cVar7.getClass();
                        jVar4.onError(Gc.i.b(cVar7));
                        return;
                    }
                }
                if (this.f103931n.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // wc.AbstractC10482c
    final void f() {
        this.f103930m.d(this);
    }

    @Override // hg.InterfaceC6950c
    public final void n(long j11) {
        this.f103916a.n(j11);
    }

    @Override // hg.InterfaceC6949b
    public final void onError(Throwable th2) {
        Gc.c cVar = this.f103925j;
        cVar.getClass();
        if (!Gc.i.a(cVar, th2)) {
            C3493a.f(th2);
            return;
        }
        this.f103916a.cancel();
        if (getAndIncrement() == 0) {
            this.f103930m.onError(Gc.i.b(cVar));
        }
    }
}
