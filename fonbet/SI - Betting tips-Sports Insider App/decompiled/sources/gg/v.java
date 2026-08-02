package gg;

import eg.c0;
import eg.f1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class v extends eg.a implements w, l {

    /* renamed from: d, reason: collision with root package name */
    public final h f10105d;

    public v(CoroutineContext coroutineContext, h hVar) {
        super(coroutineContext, true);
        this.f10105d = hVar;
    }

    @Override // gg.y
    public final Object b(ig.o oVar) {
        h hVar = this.f10105d;
        hVar.getClass();
        Object C = h.C(hVar, oVar);
        lf.a aVar = lf.a.f20034a;
        return C;
    }

    @Override // gg.y
    public final com.google.firebase.messaging.x d() {
        return this.f10105d.d();
    }

    @Override // gg.y
    public final Object e() {
        return this.f10105d.e();
    }

    @Override // gg.z
    public final Object g(Object obj) {
        return this.f10105d.g(obj);
    }

    @Override // gg.z
    public final Object h(Object obj, Continuation continuation) {
        return this.f10105d.h(obj, continuation);
    }

    @Override // eg.a
    public final void h0(Throwable th2, boolean z5) {
        if (this.f10105d.l(th2, false) || z5) {
            return;
        }
        c0.q(th2, this.f9135c);
    }

    @Override // eg.a
    public final void i0(Object obj) {
        this.f10105d.j(null);
    }

    @Override // gg.y
    public final c iterator() {
        h hVar = this.f10105d;
        hVar.getClass();
        return new c(hVar);
    }

    @Override // eg.m1, eg.e1
    public final void k(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new f1(s(), null, this);
        }
        p(cancellationException);
    }

    public final boolean k0(Throwable th2) {
        return this.f10105d.l(th2, false);
    }

    public final void l0(u uVar) {
        h hVar = this.f10105d;
        hVar.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.j;
        while (!atomicReferenceFieldUpdater.compareAndSet(hVar, null, uVar)) {
            if (atomicReferenceFieldUpdater.get(hVar) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(hVar);
                    com.android.billingclient.api.a aVar = j.q;
                    if (obj != aVar) {
                        if (obj == j.f10089r) {
                            throw new IllegalStateException("Another handler was already registered and successfully invoked");
                        }
                        throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                    }
                    com.android.billingclient.api.a aVar2 = j.f10089r;
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, aVar, aVar2)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != aVar) {
                            break;
                        }
                    }
                    uVar.invoke(hVar.q());
                    return;
                }
            }
        }
    }

    @Override // eg.m1
    public final void p(CancellationException cancellationException) {
        this.f10105d.l(cancellationException, true);
        o(cancellationException);
    }
}
