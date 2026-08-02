package d5;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n extends v {

    /* renamed from: a, reason: collision with root package name */
    public final u f8234a;

    /* renamed from: b, reason: collision with root package name */
    public final t f8235b;

    public n(u uVar, t tVar) {
        this.f8234a = uVar;
        this.f8235b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f8234a;
            if (uVar != null ? uVar.equals(((n) vVar).f8234a) : ((n) vVar).f8234a == null) {
                t tVar = this.f8235b;
                if (tVar != null ? tVar.equals(((n) vVar).f8235b) : ((n) vVar).f8235b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        u uVar = this.f8234a;
        int hashCode = ((uVar == null ? 0 : uVar.hashCode()) ^ 1000003) * 1000003;
        t tVar = this.f8235b;
        return (tVar != null ? tVar.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f8234a + ", mobileSubtype=" + this.f8235b + "}";
    }
}
