package y1;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f25550a;

    /* renamed from: b, reason: collision with root package name */
    public i0 f25551b = null;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f25552c = null;

    public h(int i5) {
        this.f25550a = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f25550a != hVar.f25550a || !Intrinsics.areEqual(this.f25551b, hVar.f25551b)) {
            return false;
        }
        Bundle source = this.f25552c;
        Bundle other = hVar.f25552c;
        if (Intrinsics.areEqual(source, other)) {
            return true;
        }
        if (source != null && other != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(other, "other");
            if (f3.x.J(source, other)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.f25550a * 31;
        i0 i0Var = this.f25551b;
        int hashCode = i5 + (i0Var != null ? i0Var.hashCode() : 0);
        Bundle source = this.f25552c;
        if (source == null) {
            return hashCode;
        }
        Intrinsics.checkNotNullParameter(source, "source");
        return f3.x.K(source) + (hashCode * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h.class.getSimpleName());
        sb2.append("(0x");
        sb2.append(Integer.toHexString(this.f25550a));
        sb2.append(")");
        if (this.f25551b != null) {
            sb2.append(" navOptions=");
            sb2.append(this.f25551b);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
