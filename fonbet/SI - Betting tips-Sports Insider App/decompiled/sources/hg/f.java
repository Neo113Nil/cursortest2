package hg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final g f10678a;

    public f(g gVar) {
        this.f10678a = gVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, com.android.billingclient.api.a] */
    @Override // hg.g
    public final Object a(h hVar, Continuation continuation) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = ig.c.f11245b;
        Object a7 = this.f10678a.a(new e(this, objectRef, hVar), continuation);
        return a7 == lf.a.f20034a ? a7 : Unit.f19194a;
    }
}
