package zc;

import Bl0.C2645f;
import Kc.C3493a;

/* renamed from: zc.v0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11077v0<R, T> extends AbstractC11019a<T, R> {
    public C11077v0(io.reactivex.p pVar) {
        super(pVar);
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super R> wVar) {
        try {
            throw null;
        } catch (NullPointerException e11) {
            throw e11;
        } catch (Throwable th2) {
            C2645f.c(th2);
            C3493a.f(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }
}
