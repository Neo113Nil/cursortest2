package o8;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final p f21120a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21121b;

    public g(p pVar, boolean z5) {
        this.f21120a = pVar;
        this.f21121b = z5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (gVar.f21120a.equals(this.f21120a) && gVar.f21121b == this.f21121b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f21120a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f21121b).hashCode();
    }
}
