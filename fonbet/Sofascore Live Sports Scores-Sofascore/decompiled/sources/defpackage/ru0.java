package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ru0 extends x9d {
    public final w9d a;
    public final v9d b;

    public ru0(w9d w9dVar, v9d v9dVar) {
        this.a = w9dVar;
        this.b = v9dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x9d) {
            x9d x9dVar = (x9d) obj;
            w9d w9dVar = this.a;
            if (w9dVar != null ? w9dVar.equals(((ru0) x9dVar).a) : ((ru0) x9dVar).a == null) {
                v9d v9dVar = this.b;
                if (v9dVar != null ? v9dVar.equals(((ru0) x9dVar).b) : ((ru0) x9dVar).b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        w9d w9dVar = this.a;
        int hashCode = ((w9dVar == null ? 0 : w9dVar.hashCode()) ^ 1000003) * 1000003;
        v9d v9dVar = this.b;
        return hashCode ^ (v9dVar != null ? v9dVar.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
