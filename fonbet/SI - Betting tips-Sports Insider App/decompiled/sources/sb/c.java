package sb;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f23406a;

    /* renamed from: b, reason: collision with root package name */
    public int f23407b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f23406a == cVar.f23406a && this.f23407b == cVar.f23407b;
    }

    public final int hashCode() {
        return (this.f23406a * 31) + this.f23407b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Bonuses(premiumCount=");
        sb2.append(this.f23406a);
        sb2.append(", expressCount=");
        return d9.e.i(sb2, this.f23407b, ')');
    }
}
