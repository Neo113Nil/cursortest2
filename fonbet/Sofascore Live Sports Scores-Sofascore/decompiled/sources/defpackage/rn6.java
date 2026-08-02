package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rn6 {
    public final int a;
    public final q9k b;
    public final boolean c;

    public rn6(int i, q9k q9kVar, boolean z) {
        this.a = i;
        this.b = q9kVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn6)) {
            return false;
        }
        rn6 rn6Var = (rn6) obj;
        return this.a == rn6Var.a && this.b.equals(rn6Var.b) && this.c == rn6Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + lnb.e(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FantasyAgeGroupUiModel(id=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", canCreateCompetition=");
        return wt3.p(sb, this.c, ")");
    }
}
