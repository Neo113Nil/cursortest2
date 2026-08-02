package androidx.recyclerview.widget;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f2316a;

    /* renamed from: b, reason: collision with root package name */
    public int f2317b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2318c;

    /* renamed from: d, reason: collision with root package name */
    public int f2319d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            int i5 = this.f2316a;
            if (i5 != aVar.f2316a) {
                return false;
            }
            if (i5 != 8 || Math.abs(this.f2319d - this.f2317b) != 1 || this.f2319d != aVar.f2317b || this.f2317b != aVar.f2319d) {
                if (this.f2319d != aVar.f2319d || this.f2317b != aVar.f2317b) {
                    return false;
                }
                Object obj2 = this.f2318c;
                if (obj2 != null) {
                    if (!obj2.equals(aVar.f2318c)) {
                        return false;
                    }
                } else if (aVar.f2318c != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f2316a * 31) + this.f2317b) * 31) + this.f2319d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[");
        int i5 = this.f2316a;
        sb2.append(i5 != 1 ? i5 != 2 ? i5 != 4 ? i5 != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb2.append(",s:");
        sb2.append(this.f2317b);
        sb2.append("c:");
        sb2.append(this.f2319d);
        sb2.append(",p:");
        sb2.append(this.f2318c);
        sb2.append("]");
        return sb2.toString();
    }
}
