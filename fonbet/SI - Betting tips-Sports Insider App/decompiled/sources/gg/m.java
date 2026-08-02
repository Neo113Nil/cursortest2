package gg;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class m extends n {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f10093a;

    public m(Throwable th2) {
        this.f10093a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return Intrinsics.areEqual(this.f10093a, ((m) obj).f10093a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f10093a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override // gg.n
    public final String toString() {
        return "Closed(" + this.f10093a + ')';
    }
}
