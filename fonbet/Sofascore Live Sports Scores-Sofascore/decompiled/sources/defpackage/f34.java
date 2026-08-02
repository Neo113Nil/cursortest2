package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class f34 implements g34 {
    public final int a;
    public final l64 b;
    public final boolean c;

    public f34(int i, l64 l64Var, boolean z) {
        l64Var.getClass();
        this.a = i;
        this.b = l64Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f34)) {
            return false;
        }
        f34 f34Var = (f34) obj;
        return this.a == f34Var.a && this.b == f34Var.b && this.c == f34Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatusLegendInfo(eventId=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", areContributionsValidated=");
        return wt3.p(sb, this.c, ")");
    }
}
