package wc;

import Bl0.C2645f;
import Ec.AbstractC2965a;
import Kc.C3493a;
import hg.InterfaceC6949b;
import oc.C8691a;
import qA.C9002a;
import qc.InterfaceC9019a;
import sc.C9653a;
import tc.InterfaceC9799a;

/* renamed from: wc.o, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C10494o<T> extends AbstractC10480a<T, T> {

    /* renamed from: d, reason: collision with root package name */
    final qc.g<? super T> f104004d;

    /* renamed from: e, reason: collision with root package name */
    final qc.g<? super Throwable> f104005e;

    /* renamed from: f, reason: collision with root package name */
    final C9002a f104006f;

    /* renamed from: g, reason: collision with root package name */
    final InterfaceC9019a f104007g;

    /* renamed from: wc.o$a */
    static final class a<T> extends AbstractC2965a<T, T> {

        /* renamed from: f, reason: collision with root package name */
        final qc.g<? super T> f104008f;

        /* renamed from: g, reason: collision with root package name */
        final qc.g<? super Throwable> f104009g;

        /* renamed from: h, reason: collision with root package name */
        final C9002a f104010h;

        /* renamed from: i, reason: collision with root package name */
        final InterfaceC9019a f104011i;

        a(InterfaceC9799a interfaceC9799a, qc.g gVar, qc.g gVar2, C9002a c9002a, InterfaceC9019a interfaceC9019a) {
            super(interfaceC9799a);
            this.f104008f = gVar;
            this.f104009g = gVar2;
            this.f104010h = c9002a;
            this.f104011i = interfaceC9019a;
        }

        @Override // tc.InterfaceC9799a
        public final boolean g(T t2) {
            if (this.f7804d) {
                return false;
            }
            try {
                this.f104008f.getClass();
                return this.f7801a.g(t2);
            } catch (Throwable th2) {
                b(th2);
                return false;
            }
        }

        @Override // Ec.AbstractC2965a, hg.InterfaceC6949b
        public final void onComplete() {
            if (this.f7804d) {
                return;
            }
            try {
                this.f104010h.run();
                this.f7804d = true;
                this.f7801a.onComplete();
                try {
                    this.f104011i.getClass();
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    C3493a.f(th2);
                }
            } catch (Throwable th3) {
                b(th3);
            }
        }

        @Override // Ec.AbstractC2965a, hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            InterfaceC6949b interfaceC6949b = this.f7801a;
            if (this.f7804d) {
                C3493a.f(th2);
                return;
            }
            this.f7804d = true;
            try {
                this.f104009g.accept(th2);
                interfaceC6949b.onError(th2);
            } catch (Throwable th3) {
                C2645f.c(th3);
                interfaceC6949b.onError(new C8691a(th2, th3));
            }
            try {
                this.f104011i.getClass();
            } catch (Throwable th4) {
                C2645f.c(th4);
                C3493a.f(th4);
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            if (this.f7804d) {
                return;
            }
            int i11 = this.f7805e;
            InterfaceC6949b interfaceC6949b = this.f7801a;
            if (i11 != 0) {
                interfaceC6949b.onNext(null);
                return;
            }
            try {
                this.f104008f.getClass();
                interfaceC6949b.onNext(t2);
            } catch (Throwable th2) {
                b(th2);
            }
        }

        @Override // tc.InterfaceC9808j
        public final T poll() throws Exception {
            C8691a c8691a;
            qc.g<? super Throwable> gVar = this.f104009g;
            try {
                T poll = this.f7803c.poll();
                InterfaceC9019a interfaceC9019a = this.f104011i;
                if (poll == null) {
                    if (this.f7805e == 1) {
                        this.f104010h.run();
                        interfaceC9019a.getClass();
                    }
                    return poll;
                }
                try {
                    this.f104008f.getClass();
                    interfaceC9019a.getClass();
                    return poll;
                } catch (Throwable th2) {
                    try {
                        C2645f.c(th2);
                        try {
                            gVar.accept(th2);
                            Throwable th3 = Gc.i.f9907a;
                            if (th2 instanceof Exception) {
                                throw th2;
                            }
                            throw th2;
                        } finally {
                        }
                    } catch (Throwable th4) {
                        interfaceC9019a.getClass();
                        throw th4;
                    }
                }
            } catch (Throwable th22) {
                C2645f.c(th22);
                try {
                    gVar.accept(th22);
                    Throwable th5 = Gc.i.f9907a;
                    if (th22 instanceof Exception) {
                        throw th22;
                    }
                    throw th22;
                } finally {
                }
            }
        }
    }

    /* renamed from: wc.o$b */
    static final class b<T> extends Ec.b<T, T> {

        /* renamed from: f, reason: collision with root package name */
        final qc.g<? super T> f104012f;

        /* renamed from: g, reason: collision with root package name */
        final qc.g<? super Throwable> f104013g;

        /* renamed from: h, reason: collision with root package name */
        final C9002a f104014h;

        /* renamed from: i, reason: collision with root package name */
        final InterfaceC9019a f104015i;

        b(io.reactivex.j jVar, qc.g gVar, qc.g gVar2, C9002a c9002a, InterfaceC9019a interfaceC9019a) {
            super(jVar);
            this.f104012f = gVar;
            this.f104013g = gVar2;
            this.f104014h = c9002a;
            this.f104015i = interfaceC9019a;
        }

        @Override // Ec.b, hg.InterfaceC6949b
        public final void onComplete() {
            if (this.f7809d) {
                return;
            }
            try {
                this.f104014h.run();
                this.f7809d = true;
                this.f7806a.onComplete();
                try {
                    this.f104015i.getClass();
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    C3493a.f(th2);
                }
            } catch (Throwable th3) {
                b(th3);
            }
        }

        @Override // Ec.b, hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            io.reactivex.j jVar = this.f7806a;
            if (this.f7809d) {
                C3493a.f(th2);
                return;
            }
            this.f7809d = true;
            try {
                this.f104013g.accept(th2);
                jVar.onError(th2);
            } catch (Throwable th3) {
                C2645f.c(th3);
                jVar.onError(new C8691a(th2, th3));
            }
            try {
                this.f104015i.getClass();
            } catch (Throwable th4) {
                C2645f.c(th4);
                C3493a.f(th4);
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            if (this.f7809d) {
                return;
            }
            int i11 = this.f7810e;
            io.reactivex.j jVar = this.f7806a;
            if (i11 != 0) {
                jVar.onNext(null);
                return;
            }
            try {
                this.f104012f.getClass();
                jVar.onNext(t2);
            } catch (Throwable th2) {
                b(th2);
            }
        }

        @Override // tc.InterfaceC9808j
        public final T poll() throws Exception {
            C8691a c8691a;
            qc.g<? super Throwable> gVar = this.f104013g;
            try {
                T poll = this.f7808c.poll();
                InterfaceC9019a interfaceC9019a = this.f104015i;
                if (poll == null) {
                    if (this.f7810e == 1) {
                        this.f104014h.run();
                        interfaceC9019a.getClass();
                    }
                    return poll;
                }
                try {
                    this.f104012f.getClass();
                    interfaceC9019a.getClass();
                    return poll;
                } catch (Throwable th2) {
                    try {
                        C2645f.c(th2);
                        try {
                            gVar.accept(th2);
                            Throwable th3 = Gc.i.f9907a;
                            if (th2 instanceof Exception) {
                                throw th2;
                            }
                            throw th2;
                        } finally {
                        }
                    } catch (Throwable th4) {
                        interfaceC9019a.getClass();
                        throw th4;
                    }
                }
            } catch (Throwable th22) {
                C2645f.c(th22);
                try {
                    gVar.accept(th22);
                    Throwable th5 = Gc.i.f9907a;
                    if (th22 instanceof Exception) {
                        throw th22;
                    }
                    throw th22;
                } finally {
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10494o(x xVar, qc.g gVar, qc.g gVar2, C9002a c9002a) {
        super(xVar);
        InterfaceC9019a interfaceC9019a = C9653a.f98523c;
        this.f104004d = gVar;
        this.f104005e = gVar2;
        this.f104006f = c9002a;
        this.f104007g = interfaceC9019a;
    }

    @Override // io.reactivex.h
    protected final void j(io.reactivex.j jVar) {
        boolean z11 = jVar instanceof InterfaceC9799a;
        qc.g<? super Throwable> gVar = this.f104005e;
        qc.g<? super T> gVar2 = this.f104004d;
        InterfaceC9019a interfaceC9019a = this.f104007g;
        io.reactivex.h<T> hVar = this.f103914c;
        if (z11) {
            hVar.i(new a((InterfaceC9799a) jVar, gVar2, gVar, this.f104006f, interfaceC9019a));
        } else {
            hVar.i(new b(jVar, gVar2, gVar, this.f104006f, interfaceC9019a));
        }
    }
}
