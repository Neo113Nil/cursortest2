package k7;

import java.io.Serializable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z extends v implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final v f18942a;

    public z(v vVar) {
        this.f18942a = vVar;
    }

    @Override // k7.v
    public final v a() {
        return this.f18942a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f18942a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z) {
            return this.f18942a.equals(((z) obj).f18942a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f18942a.hashCode();
    }

    public final String toString() {
        return this.f18942a.toString().concat(".reverse()");
    }
}
