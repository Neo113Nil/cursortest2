package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uij {
    public final long a;
    public final long b;
    public final long c;

    public uij() {
        wd5 wd5Var = xd5.b;
        be5 be5Var = be5.SECONDS;
        long R = wkn.R(45, be5Var);
        long R2 = wkn.R(5, be5Var);
        long R3 = wkn.R(5, be5Var);
        this.a = R;
        this.b = R2;
        this.c = R3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uij)) {
            return false;
        }
        uij uijVar = (uij) obj;
        return xd5.d(this.a, uijVar.a) && xd5.d(this.b, uijVar.b) && xd5.d(this.c, uijVar.c);
    }

    public final int hashCode() {
        wd5 wd5Var = xd5.b;
        return inb.m.hashCode() + ljg.c(ljg.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "TimeoutOptions(initialTimeout=" + ((Object) xd5.l(this.a)) + ", additionalTime=" + ((Object) xd5.l(this.b)) + ", idleTimeout=" + ((Object) xd5.l(this.c)) + ", timeSource=" + inb.m + ')';
    }
}
