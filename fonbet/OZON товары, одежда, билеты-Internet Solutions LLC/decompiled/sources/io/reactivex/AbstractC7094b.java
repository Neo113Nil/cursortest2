package io.reactivex;

import Bl0.C2645f;
import Kc.C3493a;
import nc.InterfaceC8487b;
import qc.InterfaceC9019a;
import sc.C9653a;
import sc.C9656b;
import vc.C10296a;
import vc.C10301f;

/* renamed from: io.reactivex.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7094b implements f {
    public static C10301f h(Throwable th2) {
        C9656b.c(th2, "error is null");
        return new C10301f(th2);
    }

    @Override // io.reactivex.f
    public final void a(d dVar) {
        C9656b.c(dVar, "observer is null");
        try {
            j(dVar);
        } catch (NullPointerException e11) {
            throw e11;
        } catch (Throwable th2) {
            C2645f.c(th2);
            C3493a.f(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final C10296a c(f fVar) {
        C9656b.c(fVar, "next is null");
        return new C10296a(this, fVar);
    }

    public final vc.n d(InterfaceC9019a interfaceC9019a) {
        return new vc.n(this, C9653a.g(), C9653a.g(), interfaceC9019a, C9653a.f98523c);
    }

    public final vc.n e(qc.g gVar) {
        qc.g g10 = C9653a.g();
        InterfaceC9019a interfaceC9019a = C9653a.f98523c;
        return new vc.n(this, g10, gVar, interfaceC9019a, interfaceC9019a);
    }

    public final vc.n f(qc.g gVar) {
        qc.g g10 = C9653a.g();
        InterfaceC9019a interfaceC9019a = C9653a.f98523c;
        return new vc.n(this, gVar, g10, interfaceC9019a, interfaceC9019a);
    }

    public final vc.n g(InterfaceC9019a interfaceC9019a) {
        return new vc.n(this, C9653a.g(), C9653a.g(), C9653a.f98523c, interfaceC9019a);
    }

    public final InterfaceC8487b i() {
        uc.m mVar = new uc.m();
        a(mVar);
        return mVar;
    }

    protected abstract void j(d dVar);

    public final vc.p k(x xVar) {
        C9656b.c(xVar, "scheduler is null");
        return new vc.p(this, xVar);
    }
}
