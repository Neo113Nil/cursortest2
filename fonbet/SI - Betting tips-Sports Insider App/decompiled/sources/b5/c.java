package b5;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f3025a;

    public c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f3025a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f3025a.equals(((c) obj).f3025a);
    }

    public final int hashCode() {
        return this.f3025a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return d9.e.l(new StringBuilder("Encoding{name=\""), this.f3025a, "\"}");
    }
}
