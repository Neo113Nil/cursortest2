package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vt0 extends lx3 {
    public final kx3 a;
    public final String b;
    public final String c;
    public final long d;

    public vt0(wt0 wt0Var, String str, String str2, long j) {
        this.a = wt0Var;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lx3) {
            vt0 vt0Var = (vt0) ((lx3) obj);
            if (this.a.equals(vt0Var.a) && this.b.equals(vt0Var.b) && this.c.equals(vt0Var.c) && this.d == vt0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        return ((int) ((j >>> 32) ^ j)) ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.a);
        sb.append(", parameterKey=");
        sb.append(this.b);
        sb.append(", parameterValue=");
        sb.append(this.c);
        sb.append(", templateVersion=");
        return lnb.l(this.d, "}", sb);
    }
}
