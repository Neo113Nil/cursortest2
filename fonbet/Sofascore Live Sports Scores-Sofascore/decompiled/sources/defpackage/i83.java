package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class i83 {
    public final q9k a;
    public final q9k b;
    public final String c = "StatisticsModal";

    public i83(q9k q9kVar, q9k q9kVar2) {
        this.a = q9kVar;
        this.b = q9kVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i83)) {
            return false;
        }
        i83 i83Var = (i83) obj;
        return this.a.equals(i83Var.a) && this.b.equals(i83Var.b) && this.c.equals(i83Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + lnb.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatInfo(title=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", analyticsName=");
        return mz1.o(sb, this.c, ")");
    }
}
