package sg;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class u extends u0 {

    /* renamed from: l, reason: collision with root package name */
    public final qg.j f23698l;

    /* renamed from: m, reason: collision with root package name */
    public final gf.t f23699m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(String name, int i5) {
        super(name, null, i5);
        Intrinsics.checkNotNullParameter(name, "name");
        this.f23698l = qg.j.f22177e;
        this.f23699m = gf.k.b(new nh.j(i5, name, this));
    }

    @Override // sg.u0, qg.g
    public final a.a e() {
        return this.f23698l;
    }

    @Override // sg.u0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof qg.g)) {
            return false;
        }
        qg.g gVar = (qg.g) obj;
        return gVar.e() == qg.j.f22177e && Intrinsics.areEqual(this.f23700a, gVar.a()) && Intrinsics.areEqual(s0.b(this), s0.b(gVar));
    }

    @Override // sg.u0
    public final int hashCode() {
        int hashCode = this.f23700a.hashCode();
        Intrinsics.checkNotNullParameter(this, "<this>");
        gf.x xVar = new gf.x(this);
        int i5 = 1;
        while (xVar.hasNext()) {
            int i10 = i5 * 31;
            String str = (String) xVar.next();
            i5 = i10 + (str != null ? str.hashCode() : 0);
        }
        return (hashCode * 31) + i5;
    }

    @Override // sg.u0, qg.g
    public final qg.g i(int i5) {
        return ((qg.g[]) this.f23699m.getValue())[i5];
    }

    @Override // sg.u0
    public final String toString() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        return CollectionsKt.J(new bg.p(2, this), ", ", d9.e.k(new StringBuilder(), this.f23700a, '('), ")", null, 56);
    }
}
