package kh;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final v f19189a;

    /* renamed from: b, reason: collision with root package name */
    public final v f19190b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f19191c;

    public /* synthetic */ u(v vVar, Throwable th2, int i5) {
        this(vVar, (c) null, (i5 & 4) != 0 ? null : th2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.areEqual(this.f19189a, uVar.f19189a) && Intrinsics.areEqual(this.f19190b, uVar.f19190b) && Intrinsics.areEqual(this.f19191c, uVar.f19191c);
    }

    public final int hashCode() {
        int hashCode = this.f19189a.hashCode() * 31;
        v vVar = this.f19190b;
        int hashCode2 = (hashCode + (vVar == null ? 0 : vVar.hashCode())) * 31;
        Throwable th2 = this.f19191c;
        return hashCode2 + (th2 != null ? th2.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.f19189a + ", nextPlan=" + this.f19190b + ", throwable=" + this.f19191c + ')';
    }

    public u(v plan, c cVar, Throwable th2) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        this.f19189a = plan;
        this.f19190b = cVar;
        this.f19191c = th2;
    }
}
