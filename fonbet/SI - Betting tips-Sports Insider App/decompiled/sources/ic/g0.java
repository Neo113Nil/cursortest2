package ic;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f11117a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f11118b;

    /* renamed from: c, reason: collision with root package name */
    public f0 f11119c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Intrinsics.areEqual(this.f11117a, g0Var.f11117a) && Intrinsics.areEqual(this.f11118b, g0Var.f11118b) && this.f11119c == g0Var.f11119c;
    }

    public final int hashCode() {
        Integer num = this.f11117a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f11118b;
        return this.f11119c.hashCode() + ((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ProgressSF(id=" + this.f11117a + ", value=" + this.f11118b + ", type=" + this.f11119c + ')';
    }
}
