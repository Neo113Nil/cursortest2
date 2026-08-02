package wc;

import Bl0.C2645f;
import Kc.C3493a;
import hg.InterfaceC6948a;
import java.util.concurrent.Callable;
import sc.C9656b;

/* renamed from: wc.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C10483d<T, R> extends AbstractC10482c<T, R> {

    /* renamed from: m, reason: collision with root package name */
    final io.reactivex.j f103928m;

    /* renamed from: n, reason: collision with root package name */
    final boolean f103929n;

    C10483d(io.reactivex.j jVar, qc.o oVar, int i11, boolean z11) {
        super(oVar, i11);
        this.f103928m = jVar;
        this.f103929n = z11;
    }

    @Override // wc.InterfaceC10486g
    public final void a(Throwable th2) {
        Gc.c cVar = this.f103925j;
        cVar.getClass();
        if (!Gc.i.a(cVar, th2)) {
            C3493a.f(th2);
            return;
        }
        if (!this.f103929n) {
            this.f103920e.cancel();
            this.f103923h = true;
        }
        this.f103926k = false;
        e();
    }

    @Override // wc.InterfaceC10486g
    public final void b(R r11) {
        this.f103928m.onNext(r11);
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
        Object obj;
        if (getAndIncrement() == 0) {
            while (!this.f103924i) {
                if (!this.f103926k) {
                    boolean z11 = this.f103923h;
                    if (z11 && !this.f103929n && this.f103925j.get() != null) {
                        io.reactivex.j jVar = this.f103928m;
                        Gc.c cVar = this.f103925j;
                        cVar.getClass();
                        jVar.onError(Gc.i.b(cVar));
                        return;
                    }
                    try {
                        T poll = this.f103922g.poll();
                        boolean z12 = poll == null;
                        if (z11 && z12) {
                            Gc.c cVar2 = this.f103925j;
                            cVar2.getClass();
                            Throwable b11 = Gc.i.b(cVar2);
                            if (b11 != null) {
                                this.f103928m.onError(b11);
                                return;
                            } else {
                                this.f103928m.onComplete();
                                return;
                            }
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
                                        obj = ((Callable) interfaceC6948a).call();
                                    } catch (Throwable th2) {
                                        C2645f.c(th2);
                                        Gc.c cVar3 = this.f103925j;
                                        cVar3.getClass();
                                        Gc.i.a(cVar3, th2);
                                        if (!this.f103929n) {
                                            this.f103920e.cancel();
                                            io.reactivex.j jVar2 = this.f103928m;
                                            Gc.c cVar4 = this.f103925j;
                                            cVar4.getClass();
                                            jVar2.onError(Gc.i.b(cVar4));
                                            return;
                                        }
                                        obj = null;
                                    }
                                    if (obj == null) {
                                        continue;
                                    } else if (this.f103916a.e()) {
                                        this.f103928m.onNext(obj);
                                    } else {
                                        this.f103926k = true;
                                        C10485f<R> c10485f = this.f103916a;
                                        c10485f.h(new C10487h(obj, c10485f));
                                    }
                                } else {
                                    this.f103926k = true;
                                    interfaceC6948a.a(this.f103916a);
                                }
                            } catch (Throwable th3) {
                                C2645f.c(th3);
                                this.f103920e.cancel();
                                Gc.c cVar5 = this.f103925j;
                                cVar5.getClass();
                                Gc.i.a(cVar5, th3);
                                io.reactivex.j jVar3 = this.f103928m;
                                Gc.c cVar6 = this.f103925j;
                                cVar6.getClass();
                                jVar3.onError(Gc.i.b(cVar6));
                                return;
                            }
                        }
                    } catch (Throwable th4) {
                        C2645f.c(th4);
                        this.f103920e.cancel();
                        Gc.c cVar7 = this.f103925j;
                        cVar7.getClass();
                        Gc.i.a(cVar7, th4);
                        io.reactivex.j jVar4 = this.f103928m;
                        Gc.c cVar8 = this.f103925j;
                        cVar8.getClass();
                        jVar4.onError(Gc.i.b(cVar8));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // wc.AbstractC10482c
    final void f() {
        this.f103928m.d(this);
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
        } else {
            this.f103923h = true;
            e();
        }
    }
}
