package e;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final z f8393a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.e0 f8394b;

    public a0(androidx.lifecycle.e0 e0Var, z callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f8393a = callback;
        this.f8394b = e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.areEqual(this.f8393a, a0Var.f8393a) && Intrinsics.areEqual(this.f8394b, a0Var.f8394b);
    }

    public final int hashCode() {
        int hashCode = this.f8393a.hashCode() * 31;
        androidx.lifecycle.e0 e0Var = this.f8394b;
        return hashCode + (e0Var == null ? 0 : e0Var.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.f8393a + ", owner=" + this.f8394b + ')';
    }
}
