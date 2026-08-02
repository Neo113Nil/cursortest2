package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class su0 {
    public final long a;
    public final jv0 b;
    public final du0 c;

    public su0(long j, jv0 jv0Var, du0 du0Var) {
        this.a = j;
        this.b = jv0Var;
        this.c = du0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof su0)) {
            return false;
        }
        su0 su0Var = (su0) obj;
        return this.a == su0Var.a && this.b.equals(su0Var.b) && this.c.equals(su0Var.c);
    }

    public final int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
