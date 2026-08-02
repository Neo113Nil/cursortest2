package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class r0e {
    public final m28 a;
    public final m28 b;
    public final u28 c;
    public final u28 d;

    public r0e(m28 m28Var, m28 m28Var2, u28 u28Var, u28 u28Var2) {
        this.a = m28Var;
        this.b = m28Var2;
        this.c = u28Var;
        this.d = u28Var2;
    }

    public static r0e a(r0e r0eVar, m28 m28Var, m28 m28Var2, u28 u28Var, u28 u28Var2, int i) {
        if ((i & 1) != 0) {
            m28Var = r0eVar.a;
        }
        if ((i & 2) != 0) {
            m28Var2 = r0eVar.b;
        }
        if ((i & 4) != 0) {
            u28Var = r0eVar.c;
        }
        if ((i & 8) != 0) {
            u28Var2 = r0eVar.d;
        }
        return new r0e(m28Var, m28Var2, u28Var, u28Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0e)) {
            return false;
        }
        r0e r0eVar = (r0e) obj;
        return this.a.equals(r0eVar.a) && this.b.equals(r0eVar.b) && this.c.equals(r0eVar.c) && this.d.equals(r0eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "POTSHighestRatedPlayerFilterState(nationality=" + this.a + ", team=" + this.b + ", gender=" + this.c + ", position=" + this.d + ")";
    }
}
