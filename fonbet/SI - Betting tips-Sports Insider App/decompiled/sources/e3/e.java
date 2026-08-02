package e3;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f8498a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8499b;

    public e(boolean z5, Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f8498a = uri;
        this.f8499b = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(e.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f8498a, eVar.f8498a) && this.f8499b == eVar.f8499b;
    }

    public final int hashCode() {
        return (this.f8498a.hashCode() * 31) + (this.f8499b ? 1231 : 1237);
    }
}
