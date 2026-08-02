package vc;

import Bl0.C2645f;
import Kc.C3493a;
import io.reactivex.AbstractC7094b;
import java.util.concurrent.Callable;
import nc.C8488c;
import nc.InterfaceC8487b;
import sc.C9653a;

/* loaded from: classes.dex */
public final class h extends AbstractC7094b {

    /* renamed from: a, reason: collision with root package name */
    final Callable<?> f102776a;

    public h(Callable<?> callable) {
        this.f102776a = callable;
    }

    @Override // io.reactivex.AbstractC7094b
    protected final void j(io.reactivex.d dVar) {
        InterfaceC8487b a11 = C8488c.a(C9653a.f98522b);
        dVar.onSubscribe(a11);
        try {
            this.f102776a.call();
            if (a11.isDisposed()) {
                return;
            }
            dVar.onComplete();
        } catch (Throwable th2) {
            C2645f.c(th2);
            if (a11.isDisposed()) {
                C3493a.f(th2);
            } else {
                dVar.onError(th2);
            }
        }
    }
}
