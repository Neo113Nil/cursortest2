package d2;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends u6.h {

    /* renamed from: c, reason: collision with root package name */
    public final b f8104c;

    public h(b latestEvent) {
        Intrinsics.checkNotNullParameter(latestEvent, "latestEvent");
        this.f8104c = latestEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && h.class == obj.getClass() && Intrinsics.areEqual(this.f8104c, ((h) obj).f8104c);
    }

    public final int hashCode() {
        return this.f8104c.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.f8104c + ", direction=-1)";
    }
}
