package vc;

import Bl0.C2645f;
import Kc.C3493a;
import io.reactivex.AbstractC7094b;
import nc.C8488c;
import nc.InterfaceC8487b;
import qc.InterfaceC9019a;
import sc.C9653a;

/* renamed from: vc.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10302g extends AbstractC7094b {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC9019a f102775a;

    public C10302g(InterfaceC9019a interfaceC9019a) {
        this.f102775a = interfaceC9019a;
    }

    @Override // io.reactivex.AbstractC7094b
    protected final void j(io.reactivex.d dVar) {
        InterfaceC8487b a11 = C8488c.a(C9653a.f98522b);
        dVar.onSubscribe(a11);
        try {
            this.f102775a.run();
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
