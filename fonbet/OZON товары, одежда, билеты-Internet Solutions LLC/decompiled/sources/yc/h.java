package yc;

import Bc.z;
import Bl0.C2645f;
import io.reactivex.C;
import io.reactivex.n;
import io.reactivex.w;
import java.util.concurrent.Callable;
import qc.o;
import sc.C9656b;
import xc.p;

/* loaded from: classes.dex */
final class h {
    static <T> boolean a(Object obj, o<? super T, ? extends io.reactivex.f> oVar, io.reactivex.d dVar) {
        io.reactivex.f fVar;
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            A0.h hVar = (Object) ((Callable) obj).call();
            if (hVar != null) {
                io.reactivex.f apply = oVar.apply(hVar);
                C9656b.c(apply, "The mapper returned a null CompletableSource");
                fVar = apply;
            } else {
                fVar = null;
            }
            if (fVar != null) {
                fVar.a(dVar);
                return true;
            }
            dVar.onSubscribe(rc.e.INSTANCE);
            dVar.onComplete();
            return true;
        } catch (Throwable th2) {
            C2645f.c(th2);
            dVar.onSubscribe(rc.e.INSTANCE);
            dVar.onError(th2);
            return true;
        }
    }

    static <T, R> boolean b(Object obj, o<? super T, ? extends n<? extends R>> oVar, w<? super R> wVar) {
        n<? extends R> nVar;
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            A0.h hVar = (Object) ((Callable) obj).call();
            if (hVar != null) {
                n<? extends R> apply = oVar.apply(hVar);
                C9656b.c(apply, "The mapper returned a null MaybeSource");
                nVar = apply;
            } else {
                nVar = null;
            }
            if (nVar == null) {
                rc.e.b(wVar);
                return true;
            }
            nVar.a(p.c(wVar));
            return true;
        } catch (Throwable th2) {
            C2645f.c(th2);
            rc.e.d(th2, wVar);
            return true;
        }
    }

    static <T, R> boolean c(Object obj, o<? super T, ? extends C<? extends R>> oVar, w<? super R> wVar) {
        C<? extends R> c11;
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            A0.h hVar = (Object) ((Callable) obj).call();
            if (hVar != null) {
                C<? extends R> apply = oVar.apply(hVar);
                C9656b.c(apply, "The mapper returned a null SingleSource");
                c11 = apply;
            } else {
                c11 = null;
            }
            if (c11 == null) {
                rc.e.b(wVar);
                return true;
            }
            c11.c(z.c(wVar));
            return true;
        } catch (Throwable th2) {
            C2645f.c(th2);
            rc.e.d(th2, wVar);
            return true;
        }
    }
}
