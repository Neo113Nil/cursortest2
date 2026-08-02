package ig;

import eg.c0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class k extends f {

    /* renamed from: e, reason: collision with root package name */
    public final mf.i f11265e;

    /* JADX WARN: Multi-variable type inference failed */
    public k(vf.a aVar, hg.g gVar, CoroutineContext coroutineContext, int i5, gg.a aVar2) {
        super(i5, aVar2, gVar, coroutineContext);
        this.f11265e = (mf.i) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [mf.i, vf.a] */
    @Override // ig.e
    public final e e(CoroutineContext coroutineContext, int i5, gg.a aVar) {
        return new k(this.f11265e, this.f11251d, coroutineContext, i5, aVar);
    }

    @Override // ig.f
    public final Object g(hg.h hVar, Continuation continuation) {
        Object i5 = c0.i(new j(this, hVar, null), continuation);
        return i5 == lf.a.f20034a ? i5 : Unit.f19194a;
    }
}
