package ng;

import eg.f2;
import eg.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jg.u;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class b implements eg.j, f2 {

    /* renamed from: a, reason: collision with root package name */
    public final l f20892a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f20893b;

    public b(c cVar, l lVar) {
        this.f20893b = cVar;
        this.f20892a = lVar;
    }

    @Override // eg.j
    public final void a(Object obj, vf.a aVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f20894h;
        c cVar = this.f20893b;
        atomicReferenceFieldUpdater.set(cVar, null);
        a2.f fVar = new a2.f(cVar, this);
        l lVar = this.f20892a;
        lVar.B((Unit) obj, lVar.f9185c, new eg.k(0, fVar));
    }

    @Override // eg.f2
    public final void b(u uVar, int i5) {
        this.f20892a.b(uVar, i5);
    }

    @Override // eg.j
    public final com.android.billingclient.api.a f(Object obj, vf.a aVar) {
        c cVar = this.f20893b;
        eg.k kVar = new eg.k(cVar, this);
        com.android.billingclient.api.a E = this.f20892a.E((Unit) obj, kVar);
        if (E != null) {
            c.f20894h.set(cVar, null);
        }
        return E;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.f20892a.f9194e;
    }

    @Override // eg.j
    public final void i(Object obj) {
        this.f20892a.i(obj);
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.f20892a.resumeWith(obj);
    }
}
