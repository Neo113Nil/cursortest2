package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xx4 {
    public static final xx4 c = new xx4(0, 0);
    public final long a;
    public final long b;

    public xx4(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xx4) {
            xx4 xx4Var = (xx4) obj;
            return c7a.a(this.a, xx4Var.a) && this.b == xx4Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
