package k7;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends v implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparator f18861a;

    public g(Comparator comparator) {
        comparator.getClass();
        this.f18861a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f18861a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return this.f18861a.equals(((g) obj).f18861a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18861a.hashCode();
    }

    public final String toString() {
        return this.f18861a.toString();
    }
}
