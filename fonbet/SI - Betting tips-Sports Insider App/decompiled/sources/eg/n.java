package eg;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class n extends i1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9204e;

    /* renamed from: f, reason: collision with root package name */
    public final l f9205f;

    public /* synthetic */ n(l lVar, int i5) {
        this.f9204e = i5;
        this.f9205f = lVar;
    }

    @Override // eg.i1
    public final boolean k() {
        switch (this.f9204e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // eg.i1
    public final void l(Throwable th2) {
        int i5 = this.f9204e;
        l lVar = this.f9205f;
        switch (i5) {
            case 0:
                Throwable q = lVar.q(j());
                if (lVar.x()) {
                    Continuation continuation = lVar.f9193d;
                    Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
                    jg.g gVar = (jg.g) continuation;
                    gVar.getClass();
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = jg.g.f18497h;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(gVar);
                        com.android.billingclient.api.a aVar = jg.h.f18503b;
                        if (Intrinsics.areEqual(obj, aVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(gVar, aVar, q)) {
                                if (atomicReferenceFieldUpdater.get(gVar) != aVar) {
                                    break;
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                lVar.n(q);
                if (!lVar.x()) {
                    lVar.o();
                    break;
                }
                break;
            default:
                gf.o oVar = gf.q.f10031a;
                lVar.resumeWith(Unit.f19194a);
                break;
        }
    }
}
