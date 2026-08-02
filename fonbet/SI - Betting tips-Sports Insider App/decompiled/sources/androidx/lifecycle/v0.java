package androidx.lifecycle;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v0 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f2239a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f2240b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eg.z f2241c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f2242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eg.l f2243e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ng.c f2244f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mf.i f2245g;

    /* JADX WARN: Multi-variable type inference failed */
    public v0(w wVar, Ref.ObjectRef objectRef, eg.z zVar, w wVar2, eg.l lVar, ng.c cVar, Function2 function2) {
        this.f2239a = wVar;
        this.f2240b = objectRef;
        this.f2241c = zVar;
        this.f2242d = wVar2;
        this.f2243e = lVar;
        this.f2244f = cVar;
        this.f2245g = (mf.i) function2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function2, mf.i] */
    /* JADX WARN: Type inference failed for: r4v10, types: [T, eg.t1] */
    @Override // androidx.lifecycle.c0
    public final void c(e0 e0Var, w event) {
        Intrinsics.checkNotNullParameter(e0Var, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        w wVar = this.f2239a;
        Ref.ObjectRef objectRef = this.f2240b;
        if (event == wVar) {
            objectRef.element = eg.c0.t(this.f2241c, null, null, new u0(this.f2244f, (Function2) this.f2245g, (Continuation) null), 3);
            return;
        }
        if (event == this.f2242d) {
            eg.e1 e1Var = (eg.e1) objectRef.element;
            if (e1Var != null) {
                e1Var.k(null);
            }
            objectRef.element = null;
        }
        if (event == w.ON_DESTROY) {
            gf.o oVar = gf.q.f10031a;
            this.f2243e.resumeWith(Unit.f19194a);
        }
    }
}
