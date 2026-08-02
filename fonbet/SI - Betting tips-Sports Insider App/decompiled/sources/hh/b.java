package hh;

import bg.n;
import bg.q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import u6.h;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class b extends rh.g {

    /* renamed from: f, reason: collision with root package name */
    public final ag.c f10815f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f10816g;

    /* renamed from: h, reason: collision with root package name */
    public final rh.g f10817h;

    public b(ag.c key, Object value, rh.g next) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(next, "next");
        this.f10815f = key;
        this.f10816g = value;
        this.f10817h = next;
    }

    @Override // rh.g
    public final rh.g E(ag.c key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        ag.c cVar = this.f10815f;
        boolean areEqual = Intrinsics.areEqual(key, cVar);
        rh.g gVar = this.f10817h;
        if (!areEqual) {
            rh.g E = gVar.E(key, null);
            gVar = E == gVar ? this : new b(cVar, this.f10816g, E);
        }
        return obj != null ? new b(key, obj, gVar) : gVar;
    }

    @Override // rh.g
    public final Object o(ag.c key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return Intrinsics.areEqual(key, this.f10815f) ? h.k(key).cast(this.f10816g) : this.f10817h.o(key);
    }

    public final String toString() {
        return CollectionsKt.J(CollectionsKt.P(q.h(n.b(new f1.a(24), this))), null, "{", "}", new f1.a(25), 25);
    }
}
