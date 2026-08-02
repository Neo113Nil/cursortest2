package m4;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final r f20367a;

    public a(r rVar) {
        this.f20367a = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f20367a, ((a) obj).f20367a);
        }
        return false;
    }

    public final int hashCode() {
        r rVar = this.f20367a;
        if (rVar != null) {
            return rVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ReadResult(request=null, response=" + this.f20367a + ')';
    }
}
