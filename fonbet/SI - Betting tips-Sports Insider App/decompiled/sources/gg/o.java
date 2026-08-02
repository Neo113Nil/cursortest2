package gg;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final n f10094b = new n();

    /* renamed from: a, reason: collision with root package name */
    public final Object f10095a;

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return Intrinsics.areEqual(this.f10095a, ((o) obj).f10095a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f10095a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f10095a;
        if (obj instanceof m) {
            return ((m) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
