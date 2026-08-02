package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ft0 extends nx3 {
    public final long a;
    public final String b;
    public final hx3 c;
    public final ix3 d;
    public final jx3 e;
    public final mx3 f;

    public ft0(long j, String str, hx3 hx3Var, ix3 ix3Var, jx3 jx3Var, mx3 mx3Var) {
        this.a = j;
        this.b = str;
        this.c = hx3Var;
        this.d = ix3Var;
        this.e = jx3Var;
        this.f = mx3Var;
    }

    public final et0 a() {
        et0 et0Var = new et0();
        et0Var.a = this.a;
        et0Var.b = this.b;
        et0Var.c = this.c;
        et0Var.d = this.d;
        et0Var.e = this.e;
        et0Var.f = this.f;
        et0Var.g = (byte) 1;
        return et0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nx3) {
            ft0 ft0Var = (ft0) ((nx3) obj);
            if (this.a == ft0Var.a && this.b.equals(ft0Var.b) && this.c.equals(ft0Var.c) && this.d.equals(ft0Var.d)) {
                jx3 jx3Var = ft0Var.e;
                jx3 jx3Var2 = this.e;
                if (jx3Var2 != null ? jx3Var2.equals(jx3Var) : jx3Var == null) {
                    mx3 mx3Var = ft0Var.f;
                    mx3 mx3Var2 = this.f;
                    if (mx3Var2 != null ? mx3Var2.equals(mx3Var) : mx3Var == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int hashCode = (((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        jx3 jx3Var = this.e;
        int hashCode2 = (hashCode ^ (jx3Var == null ? 0 : jx3Var.hashCode())) * 1000003;
        mx3 mx3Var = this.f;
        return hashCode2 ^ (mx3Var != null ? mx3Var.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f + "}";
    }
}
