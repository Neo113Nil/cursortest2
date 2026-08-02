package ig;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class f extends e {

    /* renamed from: d, reason: collision with root package name */
    public final hg.g f11251d;

    public f(int i5, gg.a aVar, hg.g gVar, CoroutineContext coroutineContext) {
        super(coroutineContext, i5, aVar);
        this.f11251d = gVar;
    }

    @Override // ig.e, hg.g
    public final Object a(hg.h hVar, Continuation continuation) {
        if (this.f11249b == -3) {
            CoroutineContext context = continuation.getContext();
            Boolean bool = Boolean.FALSE;
            c1.k kVar = new c1.k(1);
            CoroutineContext coroutineContext = this.f11248a;
            CoroutineContext t3 = !((Boolean) coroutineContext.O(bool, kVar)).booleanValue() ? context.t(coroutineContext) : eg.u.a(context, coroutineContext, false);
            if (Intrinsics.areEqual(t3, context)) {
                Object g10 = g(hVar, continuation);
                return g10 == lf.a.f20034a ? g10 : Unit.f19194a;
            }
            kf.d dVar = kotlin.coroutines.d.f19226f0;
            if (Intrinsics.areEqual(t3.r(dVar), context.r(dVar))) {
                CoroutineContext context2 = continuation.getContext();
                if (!(hVar instanceof x) && !(hVar instanceof t)) {
                    hVar = new id.o(hVar, context2);
                }
                Object b10 = c.b(t3, hVar, jg.y.b(t3), new androidx.lifecycle.c(this, (Continuation) null, 21), continuation);
                return b10 == lf.a.f20034a ? b10 : Unit.f19194a;
            }
        }
        Object a7 = super.a(hVar, continuation);
        return a7 == lf.a.f20034a ? a7 : Unit.f19194a;
    }

    @Override // ig.e
    public final Object d(gg.w wVar, Continuation continuation) {
        Object g10 = g(new x(wVar), continuation);
        return g10 == lf.a.f20034a ? g10 : Unit.f19194a;
    }

    public abstract Object g(hg.h hVar, Continuation continuation);

    @Override // ig.e
    public final String toString() {
        return this.f11251d + " -> " + super.toString();
    }
}
