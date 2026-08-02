package i3;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final int f10903a;

    public b(int i5) {
        this.f10903a = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f10903a == ((b) obj).f10903a;
    }

    public final int hashCode() {
        return this.f10903a;
    }

    public final String toString() {
        return d9.e.i(new StringBuilder("ConstraintsNotMet(reason="), this.f10903a, ')');
    }
}
