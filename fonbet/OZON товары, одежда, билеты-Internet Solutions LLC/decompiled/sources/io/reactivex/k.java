package io.reactivex;

import Bl0.C2645f;
import sc.C9656b;
import wc.C10488i;
import wc.C10496q;
import wc.C10497s;

/* loaded from: classes.dex */
public abstract class k<T> implements n<T> {
    public static C10488i c(n... nVarArr) {
        h c10497s;
        h hVar;
        int i11 = h.f66520b;
        if (nVarArr.length == 0) {
            hVar = C10496q.f104024c;
        } else {
            if (nVarArr.length == 1) {
                n nVar = nVarArr[0];
                C9656b.c(nVar, "item is null");
                c10497s = new wc.w(nVar);
            } else {
                c10497s = new C10497s(nVarArr);
            }
            hVar = c10497s;
        }
        xc.q qVar = xc.q.INSTANCE;
        hVar.getClass();
        C9656b.c(qVar, "mapper is null");
        int i12 = h.f66519a;
        C9656b.d(i12, "maxConcurrency");
        C9656b.d(i12, "prefetch");
        return new C10488i(hVar, qVar, i12, i12, Gc.h.IMMEDIATE);
    }

    @Override // io.reactivex.n
    public final void a(m<? super T> mVar) {
        C9656b.c(mVar, "observer is null");
        try {
            d(mVar);
        } catch (NullPointerException e11) {
            throw e11;
        } catch (Throwable th2) {
            C2645f.c(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    protected abstract void d(m<? super T> mVar);
}
