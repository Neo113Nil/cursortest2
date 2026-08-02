package hg;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class e1 extends ig.d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f10677a = new AtomicReference(null);

    @Override // ig.d
    public final boolean a(ig.b bVar) {
        AtomicReference atomicReference = this.f10677a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(u0.f10778b);
        return true;
    }

    @Override // ig.d
    public final Continuation[] b(ig.b bVar) {
        this.f10677a.set(null);
        return ig.c.f11244a;
    }

    public final Object c(c1 frame) {
        eg.l lVar = new eg.l(1, lf.d.b(frame));
        lVar.s();
        com.android.billingclient.api.a aVar = u0.f10778b;
        while (true) {
            AtomicReference atomicReference = this.f10677a;
            if (atomicReference.compareAndSet(aVar, lVar)) {
                break;
            }
            if (atomicReference.get() != aVar) {
                gf.o oVar = gf.q.f10031a;
                lVar.resumeWith(Unit.f19194a);
                break;
            }
        }
        Object r5 = lVar.r();
        lf.a aVar2 = lf.a.f20034a;
        if (r5 == aVar2) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return r5 == aVar2 ? r5 : Unit.f19194a;
    }
}
