package b5;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3022a;

    /* renamed from: b, reason: collision with root package name */
    public final b f3023b;

    public a(Object obj, b bVar) {
        this.f3022a = obj;
        this.f3023b = bVar;
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            b bVar2 = aVar.f3023b;
            if (this.f3022a.equals(aVar.f3022a)) {
                Object obj2 = d.f3026a;
                if (obj2.equals(obj2) && ((bVar = this.f3023b) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((1000003 * 1000003) ^ this.f3022a.hashCode()) * 1000003) ^ d.f3026a.hashCode()) * 1000003;
        b bVar = this.f3023b;
        return (bVar == null ? 0 : bVar.hashCode()) ^ hashCode;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f3022a + ", priority=" + d.f3026a + ", productData=" + this.f3023b + "}";
    }
}
