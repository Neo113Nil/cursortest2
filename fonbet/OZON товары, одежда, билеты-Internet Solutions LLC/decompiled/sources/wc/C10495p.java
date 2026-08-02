package wc;

import Bl0.C2645f;
import Kc.C3493a;
import hg.InterfaceC6950c;
import qc.InterfaceC9019a;
import sc.C9653a;

/* renamed from: wc.p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C10495p<T> extends AbstractC10480a<T, T> {

    /* renamed from: d, reason: collision with root package name */
    private final DM.i f104016d;

    /* renamed from: e, reason: collision with root package name */
    private final qc.p f104017e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC9019a f104018f;

    /* renamed from: wc.p$a */
    static final class a<T> implements io.reactivex.j<T>, InterfaceC6950c {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.j f104019a;

        /* renamed from: b, reason: collision with root package name */
        final DM.i f104020b;

        /* renamed from: c, reason: collision with root package name */
        final qc.p f104021c;

        /* renamed from: d, reason: collision with root package name */
        final InterfaceC9019a f104022d;

        /* renamed from: e, reason: collision with root package name */
        InterfaceC6950c f104023e;

        a(io.reactivex.j jVar, DM.i iVar, qc.p pVar, InterfaceC9019a interfaceC9019a) {
            this.f104019a = jVar;
            this.f104020b = iVar;
            this.f104022d = interfaceC9019a;
            this.f104021c = pVar;
        }

        @Override // hg.InterfaceC6950c
        public final void cancel() {
            InterfaceC6950c interfaceC6950c = this.f104023e;
            Fc.g gVar = Fc.g.CANCELLED;
            if (interfaceC6950c != gVar) {
                this.f104023e = gVar;
                try {
                    this.f104022d.run();
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    C3493a.f(th2);
                }
                interfaceC6950c.cancel();
            }
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            io.reactivex.j jVar = this.f104019a;
            try {
                this.f104020b.accept(interfaceC6950c);
                if (Fc.g.g(this.f104023e, interfaceC6950c)) {
                    this.f104023e = interfaceC6950c;
                    jVar.d(this);
                }
            } catch (Throwable th2) {
                C2645f.c(th2);
                interfaceC6950c.cancel();
                this.f104023e = Fc.g.CANCELLED;
                Fc.d.d(th2, jVar);
            }
        }

        @Override // hg.InterfaceC6950c
        public final void n(long j11) {
            try {
                this.f104021c.getClass();
            } catch (Throwable th2) {
                C2645f.c(th2);
                C3493a.f(th2);
            }
            this.f104023e.n(j11);
        }

        @Override // hg.InterfaceC6949b
        public final void onComplete() {
            if (this.f104023e != Fc.g.CANCELLED) {
                this.f104019a.onComplete();
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            if (this.f104023e != Fc.g.CANCELLED) {
                this.f104019a.onError(th2);
            } else {
                C3493a.f(th2);
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            this.f104019a.onNext(t2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10495p(C10479H c10479h, DM.i iVar) {
        super(c10479h);
        qc.p pVar = C9653a.f98526f;
        InterfaceC9019a interfaceC9019a = C9653a.f98523c;
        this.f104016d = iVar;
        this.f104017e = pVar;
        this.f104018f = interfaceC9019a;
    }

    @Override // io.reactivex.h
    protected final void j(io.reactivex.j jVar) {
        this.f103914c.i(new a(jVar, this.f104016d, this.f104017e, this.f104018f));
    }
}
