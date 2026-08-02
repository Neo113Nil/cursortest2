package e3;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s extends v {

    /* renamed from: a, reason: collision with root package name */
    public final j f8563a = j.f8531b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        return this.f8563a.equals(((s) obj).f8563a);
    }

    public final int hashCode() {
        return this.f8563a.hashCode() + (s.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f8563a + '}';
    }
}
