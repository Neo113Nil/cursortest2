package hg;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class p0 implements b1, g, ig.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b1 f10742a;

    public p0(n0 n0Var) {
        this.f10742a = n0Var;
    }

    @Override // hg.g
    public final Object a(h hVar, Continuation continuation) {
        return this.f10742a.a(hVar, continuation);
    }

    @Override // ig.r
    public final g c(CoroutineContext coroutineContext, int i5, gg.a aVar) {
        return (((i5 < 0 || i5 >= 2) && i5 != -2) || aVar != gg.a.f10049b) ? u0.o(this, coroutineContext, i5, aVar) : this;
    }

    @Override // hg.b1
    public final Object getValue() {
        return this.f10742a.getValue();
    }
}
