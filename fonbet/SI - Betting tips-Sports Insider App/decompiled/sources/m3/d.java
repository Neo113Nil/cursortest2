package m3;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f20306a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f20307b;

    public d(String key, Long l6) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f20306a = key;
        this.f20307b = l6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f20306a, dVar.f20306a) && Intrinsics.areEqual(this.f20307b, dVar.f20307b);
    }

    public final int hashCode() {
        int hashCode = this.f20306a.hashCode() * 31;
        Long l6 = this.f20307b;
        return hashCode + (l6 == null ? 0 : l6.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f20306a + ", value=" + this.f20307b + ')';
    }
}
