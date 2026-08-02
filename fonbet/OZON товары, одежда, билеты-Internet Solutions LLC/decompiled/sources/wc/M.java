package wc;

import Bl0.C2645f;
import hg.InterfaceC6948a;
import java.util.concurrent.Callable;
import sc.C9656b;

/* loaded from: classes.dex */
public final class M {

    /* loaded from: classes9.dex */
    static final class a<T, R> extends io.reactivex.h<R> {

        /* renamed from: c, reason: collision with root package name */
        final T f103857c;

        /* renamed from: d, reason: collision with root package name */
        final qc.o<? super T, ? extends InterfaceC6948a<? extends R>> f103858d;

        a(T t2, qc.o<? super T, ? extends InterfaceC6948a<? extends R>> oVar) {
            this.f103857c = t2;
            this.f103858d = oVar;
        }

        @Override // io.reactivex.h
        public final void j(io.reactivex.j jVar) {
            try {
                InterfaceC6948a<? extends R> apply = this.f103858d.apply(this.f103857c);
                C9656b.c(apply, "The mapper returned a null Publisher");
                InterfaceC6948a<? extends R> interfaceC6948a = apply;
                if (!(interfaceC6948a instanceof Callable)) {
                    interfaceC6948a.a(jVar);
                    return;
                }
                try {
                    Object call = ((Callable) interfaceC6948a).call();
                    if (call == null) {
                        Fc.d.b(jVar);
                    } else {
                        jVar.d(new Fc.e(jVar, call));
                    }
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    Fc.d.d(th2, jVar);
                }
            } catch (Throwable th3) {
                Fc.d.d(th3, jVar);
            }
        }
    }

    public static <T, U> io.reactivex.h<U> a(T t2, qc.o<? super T, ? extends InterfaceC6948a<? extends U>> oVar) {
        return new a(t2, oVar);
    }

    public static boolean b(InterfaceC6948a interfaceC6948a, io.reactivex.j jVar, qc.o oVar) {
        if (!(interfaceC6948a instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) interfaceC6948a).call();
            if (call == null) {
                Fc.d.b(jVar);
                return true;
            }
            try {
                Object apply = oVar.apply(call);
                C9656b.c(apply, "The mapper returned a null Publisher");
                InterfaceC6948a interfaceC6948a2 = (InterfaceC6948a) apply;
                if (!(interfaceC6948a2 instanceof Callable)) {
                    interfaceC6948a2.a(jVar);
                    return true;
                }
                try {
                    Object call2 = ((Callable) interfaceC6948a2).call();
                    if (call2 == null) {
                        Fc.d.b(jVar);
                        return true;
                    }
                    jVar.d(new Fc.e(jVar, call2));
                    return true;
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    Fc.d.d(th2, jVar);
                    return true;
                }
            } catch (Throwable th3) {
                C2645f.c(th3);
                Fc.d.d(th3, jVar);
                return true;
            }
        } catch (Throwable th4) {
            C2645f.c(th4);
            Fc.d.d(th4, jVar);
            return true;
        }
    }
}
