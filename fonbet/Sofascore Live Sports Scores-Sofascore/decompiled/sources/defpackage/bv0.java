package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bv0 {
    public final wy2 a;
    public final HashMap b;

    public bv0(wy2 wy2Var, HashMap hashMap) {
        this.a = wy2Var;
        this.b = hashMap;
    }

    public final long a(i7f i7fVar, long j, int i) {
        long time = j - this.a.getTime();
        cv0 cv0Var = (cv0) this.b.get(i7fVar);
        long j2 = cv0Var.a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * r12))), time), cv0Var.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bv0)) {
            return false;
        }
        bv0 bv0Var = (bv0) obj;
        return this.a.equals(bv0Var.a) && this.b.equals(bv0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
