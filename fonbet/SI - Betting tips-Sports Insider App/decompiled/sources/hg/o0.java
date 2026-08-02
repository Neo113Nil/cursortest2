package hg;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class o0 implements q0, g, ig.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0 f10736a;

    public o0(m0 m0Var) {
        this.f10736a = m0Var;
    }

    @Override // hg.g
    public final Object a(h hVar, Continuation continuation) {
        return this.f10736a.a(hVar, continuation);
    }

    @Override // ig.r
    public final g c(CoroutineContext coroutineContext, int i5, gg.a aVar) {
        return u0.o(this, coroutineContext, i5, aVar);
    }
}
