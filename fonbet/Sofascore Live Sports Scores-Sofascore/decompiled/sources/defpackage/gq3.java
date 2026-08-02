package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gq3 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public gq3(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gq3)) {
            return false;
        }
        gq3 gq3Var = (gq3) obj;
        long j = gq3Var.a;
        int i = r13.j;
        return e8k.a(this.a, j) && e8k.a(this.b, gq3Var.b) && e8k.a(this.c, gq3Var.c) && e8k.a(this.d, gq3Var.d) && e8k.a(this.e, gq3Var.e);
    }

    public final int hashCode() {
        int i = r13.j;
        d8k d8kVar = e8k.b;
        return Long.hashCode(this.e) + ljg.c(ljg.c(ljg.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        vxd.q(this.a, ", textColor=", sb);
        vxd.q(this.b, ", iconColor=", sb);
        vxd.q(this.c, ", disabledTextColor=", sb);
        vxd.q(this.d, ", disabledIconColor=", sb);
        sb.append((Object) r13.i(this.e));
        sb.append(')');
        return sb.toString();
    }
}
