package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a6d {
    public final b8d a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final Object e;

    public a6d(b8d b8dVar, boolean z, Object obj, boolean z2, boolean z3) {
        if (!b8dVar.a && z) {
            is8.b(b8dVar.b(), " does not allow nullable values");
            throw null;
        }
        if (!z && z2 && obj == null) {
            pvd.A(b8dVar.b(), " has null value but is not nullable.", "Argument with type ");
            throw null;
        }
        this.a = b8dVar;
        this.b = z;
        this.e = obj;
        this.c = z2 || z3;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a6d.class != obj.getClass()) {
            return false;
        }
        a6d a6dVar = (a6d) obj;
        if (this.b != a6dVar.b || this.c != a6dVar.c || !this.a.equals(a6dVar.a)) {
            return false;
        }
        Object obj2 = a6dVar.e;
        Object obj3 = this.e;
        return obj3 != null ? obj3.equals(obj2) : obj2 == null;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31;
        Object obj = this.e;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(duf.a.getOrCreateKotlinClass(a6d.class).getSimpleName());
        sb.append(" Type: " + this.a);
        sb.append(" Nullable: " + this.b);
        if (this.c) {
            sb.append(" DefaultValue: " + this.e);
        }
        return sb.toString();
    }
}
