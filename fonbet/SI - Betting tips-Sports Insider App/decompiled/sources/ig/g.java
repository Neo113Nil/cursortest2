package ig;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class g extends f {
    public g(hg.g gVar, CoroutineContext coroutineContext, int i5, gg.a aVar, int i10) {
        super((i10 & 4) != 0 ? -3 : i5, (i10 & 8) != 0 ? gg.a.f10048a : aVar, gVar, (i10 & 2) != 0 ? kotlin.coroutines.g.f19227a : coroutineContext);
    }

    @Override // ig.e
    public final e e(CoroutineContext coroutineContext, int i5, gg.a aVar) {
        return new g(i5, aVar, this.f11251d, coroutineContext);
    }

    @Override // ig.e
    public final hg.g f() {
        return this.f11251d;
    }

    @Override // ig.f
    public final Object g(hg.h hVar, Continuation continuation) {
        Object a7 = this.f11251d.a(hVar, continuation);
        return a7 == lf.a.f20034a ? a7 : Unit.f19194a;
    }
}
